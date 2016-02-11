
public class Main {
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

