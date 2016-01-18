
public class MaslDSLExporter implements Population {

    // populate
    public void populate( String classname, String[] args ) {
        // check args
        if ( classname == null || classname.equals("") || args == null )
            return;

        // print the classname
        System.out.print( classname );

        // print a comma delimiter if there are args
        if ( args.length > 0 ) System.out.print( "," );

        // print all args
        for ( int i = 0; i < args.length; i++ ) {
            // print arg
            System.out.print( args[i] );

            // print comma if not the last arg
            if ( i < (args.length - 1) ) System.out.print( "," );
        }

        // print newline
        System.out.println();
    }

}

