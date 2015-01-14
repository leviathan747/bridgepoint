/*
* generated by Xtext
*/
package org.xtuml.bp.xtext.oal.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtuml.bp.xtext.oal.services.XoalGrammarAccess;

public class XoalParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private XoalGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtuml.bp.xtext.oal.parser.antlr.internal.InternalXoalParser createParser(XtextTokenStream stream) {
		return new org.xtuml.bp.xtext.oal.parser.antlr.internal.InternalXoalParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Code";
	}
	
	public XoalGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XoalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
