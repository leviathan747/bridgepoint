package org.xtuml.bp.ui.text.activity;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.xtuml.bp.core.Block_c;
import org.xtuml.bp.core.Body_c;
import org.xtuml.bp.core.CorePlugin;
import org.xtuml.bp.core.Statement_c;
import org.xtuml.bp.core.Value_c;
import org.xtuml.bp.core.common.NonRootModelElement;
import org.xtuml.bp.core.util.BodyUtil;
import org.xtuml.bp.ui.text.TextPlugin;

public class ParseUtil {
    
    public static final String PRE_PARSE_EXPORT_TYPE = "pre";
    public static final String POST_PARSE_EXPORT_TYPE = "post";

    public static void exportElement( NonRootModelElement element, String type ) {
        if ( null == element || null == type || type.isEmpty() ) return;
        try {
            
            // must initialize the body if it exists otherwise the parsed data will not
            // be emitted by the exporter
            Body_c body = BodyUtil.getBody( element );
            if ( null != body ) bodyInitialize( body );
            
            // normalize the order of the elements so that they are easer to diff
            normalizeOrder( body );

            // get the file to write
            String fileName = element.getPersistableComponent().getFile().getLocation().removeLastSegments( 1 ) + "/" +
                              element.getName() + ".oal." + type;
            File outFile = new File( fileName );
            FileOutputStream out = new FileOutputStream( outFile );
            
            // create the exporter
            IRunnableWithProgress exporter = CorePlugin.getStreamExportFactory().create( out, new NonRootModelElement[] { element }, false, false );
            
            // reflection is used here so this plugin does not have to add a dependency on io.core for just this one utility
            Method setExportOalMethod = exporter.getClass().getMethod( "setExportOAL", String.class );
            setExportOalMethod.invoke( exporter, "yes" );

            // run the exporter
            exporter.run(new NullProgressMonitor());
            
            // clean up
            out.close();

        } catch ( Exception e ) {
            TextPlugin.logError( "Exception during export of parsed body.", e );
        }
    }
    
    // TODO this is adapted for partial parsing from body.initialize. It should be removed
    // once that operation is fixed
    private static void bodyInitialize( Body_c body ) {
        if ( null == body ) return;
        Block_c block = Block_c.getOneACT_BLKOnR650( body );
        if ( null != block ) {
            body.unrelateAcrossR650From( block );
            body.relateAcrossR666To( block );
        }
        Block_c[] blocks = Block_c.getManyACT_BLKsOnR612( body );
        for ( Block_c b : blocks ) {
            body.unrelateAcrossR612From( b );
            body.relateAcrossR601To( b );
            b.Initialize();
        }
    }
    
    // Persistence is done in arbitrary order (which ends up being the order in which
    // elements were related to the body). To assure that the diff of exports is readable,
    // this routine will explicitly sort statements, values, and blocks and re-relate them in
    // that order.
    private static void normalizeOrder( Body_c body ) {
        if ( null == body ) return;
        
        Map<Block_c, int[]> blockPositions = new HashMap<>();
        
        Block_c[] blocks = Block_c.getManyACT_BLKsOnR601( body );
        for ( Block_c block : blocks ) {
            // block line number and start position are based on the first statement in the block
            int blockLineNumber = -1;
            int blockStartPosition = -1;
            
            // sort statements within blocks
            Statement_c[] statements = Statement_c.getManyACT_SMTsOnR602( block );
            Arrays.sort( statements, ( s1,  s2 ) -> {
                if ( s1.getLinenumber() == s2.getLinenumber() && s1.getStartposition() == s2.getStartposition() )
                    return 0;
                else if ( s1.getLinenumber() < s2.getLinenumber() || s1.getLinenumber() == s2.getLinenumber() && s1.getStartposition() < s2.getStartposition() )
                    return -1;
                else
                    return 1;
            });
            for ( Statement_c statement : statements ) {
                statement.unrelateAcrossR602From( block );
                statement.relateAcrossR602To( block );
                if ( ( -1 == blockLineNumber && -1 == blockStartPosition) ||
                     ( statement.getLinenumber() < blockLineNumber ) ||
                     ( statement.getLinenumber() == blockLineNumber && statement.getStartposition() < blockStartPosition ) ) {
                    blockLineNumber = statement.getLinenumber();
                    blockStartPosition = statement.getStartposition();
                }
            }

            // sort values within blocks
            Value_c[] values = Value_c.getManyV_VALsOnR826( block );
            Arrays.sort( values, ( v1, v2 ) -> {
                if ( v1.getLinenumber() == v2.getLinenumber() && v1.getStartposition() == v2.getStartposition() )
                    return 0;
                else if ( v1.getLinenumber() < v2.getLinenumber() || v1.getLinenumber() == v2.getLinenumber() && v1.getStartposition() < v2.getStartposition() )
                    return -1;
                else
                    return 1;
            });
            for ( Value_c value : values ) {
                value.unrelateAcrossR826From( block );
                value.relateAcrossR826To( block );
            }
            
            // add the positions to the map
            blockPositions.put( block, new int[]{ blockLineNumber, blockStartPosition } );
        }
        
        // sort blocks
        Arrays.sort( blocks, ( b1, b2 ) -> {
            if ( blockPositions.get( b1 )[0] == blockPositions.get( b2 )[0] && blockPositions.get( b1 )[1] == blockPositions.get( b2 )[1] )
                return 0;
            else if ( blockPositions.get( b1 )[0] < blockPositions.get( b2 )[0] || blockPositions.get( b1 )[0] == blockPositions.get( b2 )[0] && blockPositions.get( b1 )[1] < blockPositions.get( b2 )[1] )
                return -1;
            else
                return 1;
         });
         for ( Block_c block : blocks ) {
            block.unrelateAcrossR601From( body );
            block.relateAcrossR601To( body );
         }
  

    }

}
