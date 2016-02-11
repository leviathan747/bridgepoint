public class MaslDSLExporter implements Serial {

    // populate
    public void populate( String classname, String[] value ) {
        // check args
        if ( classname == null || classname.equals("") || value == null )
            return;

        // print the classname
        System.out.print( classname );

        // if there are args
        if ( value.length > 0 && value[0] != null ) {

            // print all args
            for ( String arg : value ) {
                System.out.print( "," );

                // print arg
                System.out.print( arg );
            }
        }

        // print newline
        System.out.println();
    }

    // render
    public void render( String element, String name ) {}

    // tostring
    public void tostring( String element, String name ) {}

    // validate
    public void validate( String element ) {}

}
