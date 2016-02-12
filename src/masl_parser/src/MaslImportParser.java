import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class MaslImportParser {

    // private fields
    private Serial          serial;             // external interface
    private String          current_file;       // current file parsing

    // public constructor
    public MaslImportParser( Serial serial ) {
        if ( serial != null )
            this.serial = serial;
        else
            this.serial = null;

        current_file = null;
    }

    // set output stream
    public void setOutput( PrintStream out ) {
        if ( null != out && null != serial ) {
            serial.setOutput( out );
        }
    }

    // public getter for current_file
    public String getFile() {
        return current_file;
    }

    public void parseAll( String[] files ) {
        // parse all MASL files
        for ( String file : files ) {
            parse( "target", file );
        }
    }

    // parse a MASL file
    public void parse( String rule, String fn ) {
        // check args and set current file
        if ( fn == null || rule == null )
            return;

        current_file = fn;

        MaslLexer              lex;
        CommonTokenStream       tokens;
        MaslParser             parser;
        CommonTree              tree;
        CommonTreeNodeStream    nodes;
        MaslWalker                  walker;

        try {
            lex = new MaslLexer( new ANTLRFileStream( fn ) );
        } catch ( IOException e ) {
            System.err.println( e );
            return;
        }

        tokens = new CommonTokenStream( lex );
        parser = new MaslParser( tokens );

        try {
            tree = ( CommonTree )parser.target().getTree();
        } catch ( RecognitionException e ) {
            System.err.println( e );
            return;
        }

        nodes = new CommonTreeNodeStream(tree);
        walker = new MaslWalker( nodes );
        walker.setInterface( serial );
        walker.setMaslParser( this );

        // Walk the chosen rule
        switch ( rule ) {
            case "target":
                try {
                    walker.target();
                } catch ( RecognitionException e ) {
                    System.err.println( e );
                    return;
                }
                break;
            case "activityDefinition":
                try {
                    walker.activityDefinition();
                } catch ( RecognitionException e ) {
                    System.err.println( e );
                    return;
                }
                break;
            case "objectServiceDefinition":
                try {
                    walker.objectServiceDefinition();
                } catch ( RecognitionException e ) {
                    System.err.println( e );
                    return;
                }
                break;
            case "stateDefinition":
                try {
                    walker.stateDefinition();
                } catch ( RecognitionException e ) {
                    System.err.println( e );
                    return;
                }
                break;
            case "domainServiceDefinition":
                try {
                    walker.domainServiceDefinition();
                } catch ( RecognitionException e ) {
                    System.err.println( e );
                    return;
                }
                break;
            case "terminatorServiceDefinition":
                try {
                    walker.terminatorServiceDefinition();
                } catch ( RecognitionException e ) {
                    System.err.println( e );
                    return;
                }
                break;
            case "projectTerminatorServiceDefinition":
                try {
                    walker.projectTerminatorServiceDefinition();
                } catch ( RecognitionException e ) {
                    System.err.println( e );
                    return;
                }
                break;
            default:
                System.err.println( "-parse: ERROR unrecognized rule." );
                break;
        }

        current_file = null;

    }

    // main method
    public static void main(String args[]) throws Exception {

        Serial              serial = new MaslDSLExporter();             // create new serial interface
        MaslImportParser    parser = new MaslImportParser( serial );    // create new parser

        // check input args
        if ( args.length < 1 ) {
            System.out.println( "No MASL file provided." );
        }

        // parse all MASL files
        //parser.parseAll( args );

        if ( args.length < 2 )
            parser.parse( "target", args[0] );
        else
            parser.parse( args[0], args[1] );
    }
}

