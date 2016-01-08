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
	protected AbstractElementAlias match_domainPrjDefinition_DOMAINParserRuleCall_5_q;
	protected AbstractElementAlias match_projectDefinition_PROJECTParserRuleCall_5_q;
	protected AbstractElementAlias match_terminatorDefinition_TERMINATORParserRuleCall_5_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MaslGrammarAccess) access;
		match_domainPrjDefinition_DOMAINParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getDomainPrjDefinitionAccess().getDOMAINParserRuleCall_5());
		match_projectDefinition_PROJECTParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getProjectDefinitionAccess().getPROJECTParserRuleCall_5());
		match_terminatorDefinition_TERMINATORParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getTerminatorDefinitionAccess().getTERMINATORParserRuleCall_5());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOMAINRule())
			return getDOMAINToken(semanticObject, ruleCall, node);
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
		else if (ruleCall.getRule() == grammarAccess.getDeprecatedTypeRule())
			return getdeprecatedTypeToken(semanticObject, ruleCall, node);
		return "";
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
	 * DOMAIN                        : 'domain';
	 */
	protected String getDOMAINToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "domain";
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
	 * deprecatedType                				: INSTANCE
	 *                               				| EVENT
	 *                               				| SERVICE
	 *                               				;
	 */
	protected String getdeprecatedTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "instance";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_domainPrjDefinition_DOMAINParserRuleCall_5_q.equals(syntax))
				emit_domainPrjDefinition_DOMAINParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_projectDefinition_PROJECTParserRuleCall_5_q.equals(syntax))
				emit_projectDefinition_PROJECTParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_terminatorDefinition_TERMINATORParserRuleCall_5_q.equals(syntax))
				emit_terminatorDefinition_TERMINATORParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
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
	
}
