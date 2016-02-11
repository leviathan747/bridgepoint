import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class MaslImportParser {

    // private fields
    private Serial  serial;         // external interface
    private String      current_file;       // current file parsing

    // public constructor
    public MaslImportParser( Serial serial ) {
        if ( serial != null )
            this.serial = serial;
        else
            this.serial = null;

        current_file = null;
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
                System.err.println( "Unrecognized rule." );
                break;
        }

        current_file = null;

    }
}

