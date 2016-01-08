package org.xtuml.bp.xtext.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

public class Translator {
	
	public static void translate(EObject o, int num_spaces) {
		// print name of the object
		System.out.print("|-");
		for (int i = 0; i < num_spaces; i++) System.out.print("--");
		System.out.println( o.eClass().getName().toString() );	
		
		// print the attributes of the object
		EList<EAttribute> attributes = o.eClass().getEAttributes();
		for ( EAttribute attribute : attributes ) {
			for (int i = 0; i < num_spaces+1; i++) System.out.print("  ");
			System.out.print("* ");
			System.out.println(attribute.getName() + "='" + o.eGet(attribute) + "'");
		}
		
		// recursively traverse the tree in a depth first manner
		EList<EObject> children = o.eContents();
		for ( EObject child : children ) {
			translate(child, num_spaces+1);
		}
	}

}