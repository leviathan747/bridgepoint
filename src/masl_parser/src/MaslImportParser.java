import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class MaslImportParser {

    // private fields
    private Population population;          // external interface

    // public constructor
    public MaslImportParser( Population population ) {
        if ( population != null )
            this.population = population;
        else
            this.population = null;
    }

    public void parseAll( String[] files ) {
        // parse all MASL files
        for ( String file : files ) {
            parse( file );
        }
    }

    // parse a MASL file
    public void parse( String fn ) {

        MaslLexer              lex;
        CommonTokenStream       tokens;
        MaslParser             parser;
        CommonTree              tree;
        CommonTreeNodeStream    nodes;
        MaslWalker                  walker;

        try {
            lex = new MaslLexer( new ANTLRFileStream( fn ) );
        } catch ( IOException e ) {
            System.out.println( e );
            return;
        }

        tokens = new CommonTokenStream( lex );
        parser = new MaslParser( tokens );

        try {
            tree = ( CommonTree )parser.target().getTree();
        } catch ( RecognitionException e ) {
            System.out.println( e );
            return;
        }

        nodes = new CommonTreeNodeStream(tree);
        walker = new MaslWalker( nodes );
        walker.setPopulation( population );

        try {
            walker.target();
        } catch ( RecognitionException e ) {
            System.out.println( e );
            return;
        }

    }
}

