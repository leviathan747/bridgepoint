package org.xtuml.bp.core.util;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

public class DocumentUtil {

    public static int lineAndColumnToPosition( int line, int column, IDocument document ) {
        int position = 0;
        for ( int i = 0; i < line-1; i++ ) {
            try {
                position += document.getLineLength( i );
            } catch (BadLocationException e) {
                e.printStackTrace();
                break;
            }
        }
        position += column - 1;
        return position;
    }

    public static int positionToLine( int position, IDocument document ) {
        for ( int i = 0, count = 0; i < document.getNumberOfLines(); i++ ) {
            try {
                count += document.getLineLength(i);
                if ( count >= position ) {
                	if ( count == position ) return i + 2;
                	else return i + 1;
                }
            } catch (BadLocationException e) {
                e.printStackTrace();
                break;
            }
        }
        return 0;
    }
    
    public static int positionToCol( int position, IDocument document ) {
        for ( int i = 0, count = 0; i < document.getNumberOfLines(); i++ ) {
            try {
                if ( position - count <= document.getLineLength(i) ) {
                	if ( position - count == document.getLineLength(i) ) return 1;
                	else return position - count + 1;
                }
                count += document.getLineLength(i);
            } catch (BadLocationException e) {
                e.printStackTrace();
                break;
            }
        }
        return 0;
    }

}
