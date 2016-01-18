
public class Main {
    public static void main(String args[]) throws Exception {

        Population          population = new MaslDSLExporter();             // create new population interface
        MaslImportParser    parser = new MaslImportParser( population );    // create new parser

        // check input args
        if ( args.length < 1 ) {
            System.out.println( "No MASL file provided." );
        }

        // parse all MASL files
        parser.parseAll( args );
    }
}

