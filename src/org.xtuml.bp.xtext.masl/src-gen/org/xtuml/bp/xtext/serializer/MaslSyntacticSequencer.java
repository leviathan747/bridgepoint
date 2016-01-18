/*
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtuml.bp.xtext.services.MaslGrammarAccess;

@SuppressWarnings("all")
public class MaslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MaslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_domainFunctionDefinition_FUNCTIONParserRuleCall_10_q;
	protected AbstractElementAlias match_domainPrjDefinition_DOMAINParserRuleCall_5_q;
	protected AbstractElementAlias match_domainServiceDefinition_SERVICEParserRuleCall_8_q;
	protected AbstractElementAlias match_objectFunctionDefinition_FUNCTIONParserRuleCall_13_q;
	protected AbstractElementAlias match_objectServiceDefinition_SERVICEParserRuleCall_11_q;
	protected AbstractElementAlias match_projectDefinition_PROJECTParserRuleCall_5_q;
	protected AbstractElementAlias match_terminatorDefinition_TERMINATORParserRuleCall_5_q;
	protected AbstractElementAlias match_terminatorFunctionDefinition_FUNCTIONParserRuleCall_12_q;
	protected AbstractElementAlias match_terminatorServiceDefinition_SERVICEParserRuleCall_10_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MaslGrammarAccess) access;
		match_domainFunctionDefinition_FUNCTIONParserRuleCall_10_q = new TokenAlias(false, true, grammarAccess.getDomainFunctionDefinitionAccess().getFUNCTIONParserRuleCall_10());
		match_domainPrjDefinition_DOMAINParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getDomainPrjDefinitionAccess().getDOMAINParserRuleCall_5());
		match_domainServiceDefinition_SERVICEParserRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getDomainServiceDefinitionAccess().getSERVICEParserRuleCall_8());
		match_objectFunctionDefinition_FUNCTIONParserRuleCall_13_q = new TokenAlias(false, true, grammarAccess.getObjectFunctionDefinitionAccess().getFUNCTIONParserRuleCall_13());
		match_objectServiceDefinition_SERVICEParserRuleCall_11_q = new TokenAlias(false, true, grammarAccess.getObjectServiceDefinitionAccess().getSERVICEParserRuleCall_11());
		match_projectDefinition_PROJECTParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getProjectDefinitionAccess().getPROJECTParserRuleCall_5());
		match_terminatorDefinition_TERMINATORParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getTerminatorDefinitionAccess().getTERMINATORParserRuleCall_5());
		match_terminatorFunctionDefinition_FUNCTIONParserRuleCall_12_q = new TokenAlias(false, true, grammarAccess.getTerminatorFunctionDefinitionAccess().getFUNCTIONParserRuleCall_12());
		match_terminatorServiceDefinition_SERVICEParserRuleCall_10_q = new TokenAlias(false, true, grammarAccess.getTerminatorServiceDefinitionAccess().getSERVICEParserRuleCall_10());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDEFERREDRule())
			return getDEFERREDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOMAINRule())
			return getDOMAINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOTRule())
			return getDOTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getFUNCTIONRule())
			return getFUNCTIONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getISRule())
			return getISToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLPARENRule())
			return getLPARENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPRAGMATOKRule())
			return getPRAGMATOKToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPROJECTRule())
			return getPROJECTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRETURNRule())
			return getRETURNToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRPARENRule())
			return getRPARENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSCOPERule())
			return getSCOPEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSEMIRule())
			return getSEMIToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSERVICERule())
			return getSERVICEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTERMINATORRule())
			return getTERMINATORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTERMINATOR_SCOPERule())
			return getTERMINATOR_SCOPEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getStatementListRule())
			return getstatementListToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * BEGIN                         : 'begin';
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "begin";
	}
	
	/**
	 * COLON                         : ':';
	 */
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * COMMA                         : ',';
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * DEFERRED                      : 'deferred';
	 */
	protected String getDEFERREDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "deferred";
	}
	
	/**
	 * DOMAIN                        : 'domain';
	 */
	protected String getDOMAINToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "domain";
	}
	
	/**
	 * DOT                           : '.';
	 */
	protected String getDOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * END                           : 'end';
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "end";
	}
	
	/**
	 * FUNCTION                      : 'function';
	 */
	protected String getFUNCTIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "function";
	}
	
	/**
	 * IS                            : 'is';
	 */
	protected String getISToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "is";
	}
	
	/**
	 * LPAREN                        : '(';
	 */
	protected String getLPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * PRAGMATOK                     : 'pragma';
	 */
	protected String getPRAGMATOKToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "pragma";
	}
	
	/**
	 * PROJECT                       : 'project';
	 */
	protected String getPROJECTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "project";
	}
	
	/**
	 * RETURN                        : 'return';
	 */
	protected String getRETURNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "return";
	}
	
	/**
	 * RPAREN                        : ')';
	 */
	protected String getRPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * SCOPE                         : '::';
	 */
	protected String getSCOPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "::";
	}
	
	/**
	 * SEMI                          : ';';
	 */
	protected String getSEMIToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * SERVICE                       : 'service';
	 */
	protected String getSERVICEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "service";
	}
	
	/**
	 * TERMINATOR                    : 'terminator';
	 */
	protected String getTERMINATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "terminator";
	}
	
	/**
	 * TERMINATOR_SCOPE              : '~>';
	 */
	protected String getTERMINATOR_SCOPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "~>";
	}
	
	/**
	 * statementList                                                                   : => (ID|INT|STRING|WS|ANY_OTHER)*;
	 */
	protected String getstatementListToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_domainFunctionDefinition_FUNCTIONParserRuleCall_10_q.equals(syntax))
				emit_domainFunctionDefinition_FUNCTIONParserRuleCall_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_domainPrjDefinition_DOMAINParserRuleCall_5_q.equals(syntax))
				emit_domainPrjDefinition_DOMAINParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_domainServiceDefinition_SERVICEParserRuleCall_8_q.equals(syntax))
				emit_domainServiceDefinition_SERVICEParserRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_objectFunctionDefinition_FUNCTIONParserRuleCall_13_q.equals(syntax))
				emit_objectFunctionDefinition_FUNCTIONParserRuleCall_13_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_objectServiceDefinition_SERVICEParserRuleCall_11_q.equals(syntax))
				emit_objectServiceDefinition_SERVICEParserRuleCall_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_projectDefinition_PROJECTParserRuleCall_5_q.equals(syntax))
				emit_projectDefinition_PROJECTParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_terminatorDefinition_TERMINATORParserRuleCall_5_q.equals(syntax))
				emit_terminatorDefinition_TERMINATORParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_terminatorFunctionDefinition_FUNCTIONParserRuleCall_12_q.equals(syntax))
				emit_terminatorFunctionDefinition_FUNCTIONParserRuleCall_12_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_terminatorServiceDefinition_SERVICEParserRuleCall_10_q.equals(syntax))
				emit_terminatorServiceDefinition_SERVICEParserRuleCall_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     FUNCTION?
	 *
	 * This ambiguous syntax occurs at:
	 *     codeBlock=codeBlock (ambiguity) SEMI pargmaList=pragmaList
	 */
	protected void emit_domainFunctionDefinition_FUNCTIONParserRuleCall_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DOMAIN?
	 *
	 * This ambiguous syntax occurs at:
	 *     domainName=domainName IS END (ambiguity) SEMI pragmaList=pragmaList
	 *     domainPrjItem+=domainPrjItem END (ambiguity) SEMI pragmaList=pragmaList
	 */
	protected void emit_domainPrjDefinition_DOMAINParserRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SERVICE?
	 *
	 * This ambiguous syntax occurs at:
	 *     codeBlock=codeBlock (ambiguity) SEMI pargmaList=pragmaList
	 */
	protected void emit_domainServiceDefinition_SERVICEParserRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     FUNCTION?
	 *
	 * This ambiguous syntax occurs at:
	 *     codeBlock=codeBlock (ambiguity) SEMI pragmaList=pragmaList
	 */
	protected void emit_objectFunctionDefinition_FUNCTIONParserRuleCall_13_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SERVICE?
	 *
	 * This ambiguous syntax occurs at:
	 *     codeBlock=codeBlock (ambiguity) SEMI pragmaList=pragmaList
	 */
	protected void emit_objectServiceDefinition_SERVICEParserRuleCall_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     PROJECT?
	 *
	 * This ambiguous syntax occurs at:
	 *     projectItem+=projectItem END (ambiguity) SEMI pragmaList=pragmaList
	 *     projectName=projectName IS END (ambiguity) SEMI pragmaList=pragmaList
	 */
	protected void emit_projectDefinition_PROJECTParserRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     TERMINATOR?
	 *
	 * This ambiguous syntax occurs at:
	 *     terminatorItem+=terminatorItem END (ambiguity) SEMI pragmaList=pragmaList
	 *     terminatorName=terminatorName IS END (ambiguity) SEMI pragmaList=pragmaList
	 */
	protected void emit_terminatorDefinition_TERMINATORParserRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     FUNCTION?
	 *
	 * This ambiguous syntax occurs at:
	 *     codeBlock=codeBlock (ambiguity) SEMI pragmaList=pragmaList
	 */
	protected void emit_terminatorFunctionDefinition_FUNCTIONParserRuleCall_12_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SERVICE?
	 *
	 * This ambiguous syntax occurs at:
	 *     codeBlock=codeBlock (ambiguity) SEMI pragmaList=pragmaList
	 */
	protected void emit_terminatorServiceDefinition_SERVICEParserRuleCall_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}