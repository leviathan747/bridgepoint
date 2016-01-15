import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Main {
    public static void main(String args[]) throws Exception {
        MaslPLexer lex = new MaslPLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        MaslPParser parser = new MaslPParser(tokens);
        CommonTree tree = (CommonTree)parser.target().getTree();
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
    }
}

