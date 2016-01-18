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
        /*

        MaslPLexer lex = new MaslPLexer( new ANTLRFileStream( fn ) );
        CommonTokenStream tokens = new CommonTokenStream( lex );

        MaslPParser parser = new MaslPParser( tokens );
        CommonTree tree = ( CommonTree )parser.target().getTree();

        //System.out.println(tree.toStringTree());
        String s_tree = tree.toStringTree();
        int depth = 0;
        for (int i = 0; i < s_tree.length(); i++){
            char c = s_tree.charAt(i);        
            switch ( c ) {
                case '(':
                    System.out.print("\n");
                    for (int j = 0; j < depth; j++) System.out.print("  ");
                    System.out.print("(");
                    depth++;
                    break;
                case ')':
                    depth--;
                    //System.out.print("\n");
                    //for (int j = 0; j < depth; j++) System.out.print("  ");
                    System.out.print(")");
                    break;
                default:
                    System.out.print(c);
                    break;
            }
        }
        System.out.println();
        */
    }
}

