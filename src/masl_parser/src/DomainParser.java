import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.regex.Pattern;

public class DomainParser {

    // private fields
    private MaslImportParser    parser;

    // public constructor
    public DomainParser( Serial serial ) {
        if ( serial != null )
            parser = new MaslImportParser( serial );    // create new parser
        else
            parser = null;
    }

    // parse domain
    public void parse( String directory ) {
        File            dir;
        File[]          domainFiles;
        
        PrintStream     output = null;

        String          domainName;

        // check parser
        if ( null == parser ) {
            System.err.println( "-parse: ERROR null parser" );
            return;
        }

        // check args
        if ( null == directory ) {
            System.err.println( "-parse: ERROR null directory" );
            return;
        }

        // read the directory
        dir = new File( directory );
        domainFiles = dir.listFiles();
        if ( null == directory ) {
            System.err.println( "-listFiles: ERROR" );
            return;
        }

        // parse the domain file
        for ( File f : domainFiles ) {
            if ( Pattern.matches( ".*\\.mod", f.getName() ) ) {

                // set the domain name
                domainName = f.getName().substring( 0, f.getName().length() - 4 );
                try {
                    output = new PrintStream( domainName + ".masldsl" );
                } catch ( FileNotFoundException e ) {
                    System.err.println( "-parse: ERROR " + e );
                }
                parser.setOutput( output );

                // parse the file
                parser.parse( "target", f.getPath() );
                break;
            }
        }

        // parse all activities ( according the defined file extension convention )
        for ( File f : domainFiles ) {
            if ( Pattern.matches( ".*\\.svc", f.getName() ) ||
                 Pattern.matches( ".*\\.fn", f.getName() ) ||
                 Pattern.matches( ".*\\.ext", f.getName() ) ||
                 Pattern.matches( ".*\\.scn", f.getName() ) ||
                 Pattern.matches( ".*\\.al", f.getName() ) ||
                 Pattern.matches( ".*\\.tr", f.getName() ) ) {
                     
                // parse the file
                parser.parse( "activityDefinition", f.getPath() );
            }
        }

        // done
    }

    // main method
    public static void main( String[] args ) {

        // check command line arguments
        if ( args.length != 1 || args[0] == null ) {
            System.err.println( "-main: ERROR invalid commandline arguments" );
            return;
        }

        // create instance of parser
        Serial          serial = new MaslDSLExporter();
        DomainParser    parser = new DomainParser( serial );

        // parse domain
        parser.parse( args[0] );

    }
}

