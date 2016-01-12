package org.xtuml.bp.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtuml.bp.xtext.services.MaslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMaslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_RELATIONSHIP_NAME", "RULE_WS", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'anonymous'", "'begin'", "':'", "','", "'deferred'", "'domain'", "'.'", "'end'", "'event'", "'function'", "'in'", "'instance'", "'is'", "'('", "'out'", "'pragma'", "'private'", "'project'", "'public'", "'readonly'", "'return'", "')'", "'::'", "';'", "'service'", "'terminator'", "'~>'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_RELATIONSHIP_NAME=7;

    // delegates
    // delegators


        public InternalMaslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMaslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMaslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMasl.g"; }



     	private MaslGrammarAccess grammarAccess;

        public InternalMaslParser(TokenStream input, MaslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "target";
       	}

       	@Override
       	protected MaslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuletarget"
    // InternalMasl.g:64:1: entryRuletarget returns [EObject current=null] : iv_ruletarget= ruletarget EOF ;
    public final EObject entryRuletarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletarget = null;


        try {
            // InternalMasl.g:64:47: (iv_ruletarget= ruletarget EOF )
            // InternalMasl.g:65:2: iv_ruletarget= ruletarget EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletarget=ruletarget();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletarget; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletarget"


    // $ANTLR start "ruletarget"
    // InternalMasl.g:71:1: ruletarget returns [EObject current=null] : ( (lv_definition_0_0= ruledefinition ) )+ ;
    public final EObject ruletarget() throws RecognitionException {
        EObject current = null;

        EObject lv_definition_0_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:77:2: ( ( (lv_definition_0_0= ruledefinition ) )+ )
            // InternalMasl.g:78:2: ( (lv_definition_0_0= ruledefinition ) )+
            {
            // InternalMasl.g:78:2: ( (lv_definition_0_0= ruledefinition ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=28 && LA1_0<=30)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMasl.g:79:3: (lv_definition_0_0= ruledefinition )
            	    {
            	    // InternalMasl.g:79:3: (lv_definition_0_0= ruledefinition )
            	    // InternalMasl.g:80:4: lv_definition_0_0= ruledefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTargetAccess().getDefinitionDefinitionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_definition_0_0=ruledefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getTargetRule());
            	      				}
            	      				add(
            	      					current,
            	      					"definition",
            	      					lv_definition_0_0,
            	      					"org.xtuml.bp.xtext.Masl.definition");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletarget"


    // $ANTLR start "entryRuledefinition"
    // InternalMasl.g:100:1: entryRuledefinition returns [EObject current=null] : iv_ruledefinition= ruledefinition EOF ;
    public final EObject entryRuledefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledefinition = null;


        try {
            // InternalMasl.g:100:51: (iv_ruledefinition= ruledefinition EOF )
            // InternalMasl.g:101:2: iv_ruledefinition= ruledefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledefinition=ruledefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledefinition"


    // $ANTLR start "ruledefinition"
    // InternalMasl.g:107:1: ruledefinition returns [EObject current=null] : (this_projectDefinition_0= ruleprojectDefinition | this_objectServiceDefinition_1= ruleobjectServiceDefinition | this_objectFunctionDefinition_2= ruleobjectFunctionDefinition | this_domainServiceDefinition_3= ruledomainServiceDefinition | this_domainFunctionDefinition_4= ruledomainFunctionDefinition | this_terminatorServiceDefinition_5= ruleterminatorServiceDefinition | this_terminatorFunctionDefinition_6= ruleterminatorFunctionDefinition ) ;
    public final EObject ruledefinition() throws RecognitionException {
        EObject current = null;

        EObject this_projectDefinition_0 = null;

        EObject this_objectServiceDefinition_1 = null;

        EObject this_objectFunctionDefinition_2 = null;

        EObject this_domainServiceDefinition_3 = null;

        EObject this_domainFunctionDefinition_4 = null;

        EObject this_terminatorServiceDefinition_5 = null;

        EObject this_terminatorFunctionDefinition_6 = null;



        	enterRule();

        try {
            // InternalMasl.g:113:2: ( (this_projectDefinition_0= ruleprojectDefinition | this_objectServiceDefinition_1= ruleobjectServiceDefinition | this_objectFunctionDefinition_2= ruleobjectFunctionDefinition | this_domainServiceDefinition_3= ruledomainServiceDefinition | this_domainFunctionDefinition_4= ruledomainFunctionDefinition | this_terminatorServiceDefinition_5= ruleterminatorServiceDefinition | this_terminatorFunctionDefinition_6= ruleterminatorFunctionDefinition ) )
            // InternalMasl.g:114:2: (this_projectDefinition_0= ruleprojectDefinition | this_objectServiceDefinition_1= ruleobjectServiceDefinition | this_objectFunctionDefinition_2= ruleobjectFunctionDefinition | this_domainServiceDefinition_3= ruledomainServiceDefinition | this_domainFunctionDefinition_4= ruledomainFunctionDefinition | this_terminatorServiceDefinition_5= ruleterminatorServiceDefinition | this_terminatorFunctionDefinition_6= ruleterminatorFunctionDefinition )
            {
            // InternalMasl.g:114:2: (this_projectDefinition_0= ruleprojectDefinition | this_objectServiceDefinition_1= ruleobjectServiceDefinition | this_objectFunctionDefinition_2= ruleobjectFunctionDefinition | this_domainServiceDefinition_3= ruledomainServiceDefinition | this_domainFunctionDefinition_4= ruledomainFunctionDefinition | this_terminatorServiceDefinition_5= ruleterminatorServiceDefinition | this_terminatorFunctionDefinition_6= ruleterminatorFunctionDefinition )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMasl.g:115:3: this_projectDefinition_0= ruleprojectDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getProjectDefinitionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_projectDefinition_0=ruleprojectDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_projectDefinition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMasl.g:124:3: this_objectServiceDefinition_1= ruleobjectServiceDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getObjectServiceDefinitionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_objectServiceDefinition_1=ruleobjectServiceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_objectServiceDefinition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMasl.g:133:3: this_objectFunctionDefinition_2= ruleobjectFunctionDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getObjectFunctionDefinitionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_objectFunctionDefinition_2=ruleobjectFunctionDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_objectFunctionDefinition_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMasl.g:142:3: this_domainServiceDefinition_3= ruledomainServiceDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getDomainServiceDefinitionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_domainServiceDefinition_3=ruledomainServiceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_domainServiceDefinition_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMasl.g:151:3: this_domainFunctionDefinition_4= ruledomainFunctionDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getDomainFunctionDefinitionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_domainFunctionDefinition_4=ruledomainFunctionDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_domainFunctionDefinition_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMasl.g:160:3: this_terminatorServiceDefinition_5= ruleterminatorServiceDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getTerminatorServiceDefinitionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_terminatorServiceDefinition_5=ruleterminatorServiceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_terminatorServiceDefinition_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMasl.g:169:3: this_terminatorFunctionDefinition_6= ruleterminatorFunctionDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getTerminatorFunctionDefinitionParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_terminatorFunctionDefinition_6=ruleterminatorFunctionDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_terminatorFunctionDefinition_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledefinition"


    // $ANTLR start "entryRuleprojectDefinition"
    // InternalMasl.g:181:1: entryRuleprojectDefinition returns [EObject current=null] : iv_ruleprojectDefinition= ruleprojectDefinition EOF ;
    public final EObject entryRuleprojectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprojectDefinition = null;


        try {
            // InternalMasl.g:181:58: (iv_ruleprojectDefinition= ruleprojectDefinition EOF )
            // InternalMasl.g:182:2: iv_ruleprojectDefinition= ruleprojectDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprojectDefinition=ruleprojectDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprojectDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprojectDefinition"


    // $ANTLR start "ruleprojectDefinition"
    // InternalMasl.g:188:1: ruleprojectDefinition returns [EObject current=null] : ( rulePROJECT ( (lv_projectName_1_0= ruleprojectName ) ) ruleIS ( (lv_projectItem_3_0= ruleprojectItem ) )* ruleEND ( rulePROJECT )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) ) ;
    public final EObject ruleprojectDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_projectName_1_0 = null;

        EObject lv_projectItem_3_0 = null;

        EObject lv_pragmaList_7_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:194:2: ( ( rulePROJECT ( (lv_projectName_1_0= ruleprojectName ) ) ruleIS ( (lv_projectItem_3_0= ruleprojectItem ) )* ruleEND ( rulePROJECT )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) ) )
            // InternalMasl.g:195:2: ( rulePROJECT ( (lv_projectName_1_0= ruleprojectName ) ) ruleIS ( (lv_projectItem_3_0= ruleprojectItem ) )* ruleEND ( rulePROJECT )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) )
            {
            // InternalMasl.g:195:2: ( rulePROJECT ( (lv_projectName_1_0= ruleprojectName ) ) ruleIS ( (lv_projectItem_3_0= ruleprojectItem ) )* ruleEND ( rulePROJECT )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) )
            // InternalMasl.g:196:3: rulePROJECT ( (lv_projectName_1_0= ruleprojectName ) ) ruleIS ( (lv_projectItem_3_0= ruleprojectItem ) )* ruleEND ( rulePROJECT )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getProjectDefinitionAccess().getPROJECTParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_4);
            rulePROJECT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:203:3: ( (lv_projectName_1_0= ruleprojectName ) )
            // InternalMasl.g:204:4: (lv_projectName_1_0= ruleprojectName )
            {
            // InternalMasl.g:204:4: (lv_projectName_1_0= ruleprojectName )
            // InternalMasl.g:205:5: lv_projectName_1_0= ruleprojectName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProjectDefinitionAccess().getProjectNameProjectNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_projectName_1_0=ruleprojectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProjectDefinitionRule());
              					}
              					set(
              						current,
              						"projectName",
              						lv_projectName_1_0,
              						"org.xtuml.bp.xtext.Masl.projectName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getProjectDefinitionAccess().getISParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_6);
            ruleIS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:229:3: ( (lv_projectItem_3_0= ruleprojectItem ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMasl.g:230:4: (lv_projectItem_3_0= ruleprojectItem )
            	    {
            	    // InternalMasl.g:230:4: (lv_projectItem_3_0= ruleprojectItem )
            	    // InternalMasl.g:231:5: lv_projectItem_3_0= ruleprojectItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProjectDefinitionAccess().getProjectItemProjectItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_projectItem_3_0=ruleprojectItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProjectDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"projectItem",
            	      						lv_projectItem_3_0,
            	      						"org.xtuml.bp.xtext.Masl.projectItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getProjectDefinitionAccess().getENDParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_7);
            ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:255:3: ( rulePROJECT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMasl.g:256:4: rulePROJECT
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getProjectDefinitionAccess().getPROJECTParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    rulePROJECT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getProjectDefinitionAccess().getSEMIParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_8);
            ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:271:3: ( (lv_pragmaList_7_0= rulepragmaList ) )
            // InternalMasl.g:272:4: (lv_pragmaList_7_0= rulepragmaList )
            {
            // InternalMasl.g:272:4: (lv_pragmaList_7_0= rulepragmaList )
            // InternalMasl.g:273:5: lv_pragmaList_7_0= rulepragmaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProjectDefinitionAccess().getPragmaListPragmaListParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pragmaList_7_0=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProjectDefinitionRule());
              					}
              					set(
              						current,
              						"pragmaList",
              						lv_pragmaList_7_0,
              						"org.xtuml.bp.xtext.Masl.pragmaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprojectDefinition"


    // $ANTLR start "entryRuleprojectItem"
    // InternalMasl.g:294:1: entryRuleprojectItem returns [EObject current=null] : iv_ruleprojectItem= ruleprojectItem EOF ;
    public final EObject entryRuleprojectItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprojectItem = null;


        try {
            // InternalMasl.g:294:52: (iv_ruleprojectItem= ruleprojectItem EOF )
            // InternalMasl.g:295:2: iv_ruleprojectItem= ruleprojectItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectItemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprojectItem=ruleprojectItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprojectItem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprojectItem"


    // $ANTLR start "ruleprojectItem"
    // InternalMasl.g:301:1: ruleprojectItem returns [EObject current=null] : this_domainPrjDefinition_0= ruledomainPrjDefinition ;
    public final EObject ruleprojectItem() throws RecognitionException {
        EObject current = null;

        EObject this_domainPrjDefinition_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:307:2: (this_domainPrjDefinition_0= ruledomainPrjDefinition )
            // InternalMasl.g:308:2: this_domainPrjDefinition_0= ruledomainPrjDefinition
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getProjectItemAccess().getDomainPrjDefinitionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_domainPrjDefinition_0=ruledomainPrjDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_domainPrjDefinition_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprojectItem"


    // $ANTLR start "entryRuledomainPrjDefinition"
    // InternalMasl.g:319:1: entryRuledomainPrjDefinition returns [EObject current=null] : iv_ruledomainPrjDefinition= ruledomainPrjDefinition EOF ;
    public final EObject entryRuledomainPrjDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledomainPrjDefinition = null;


        try {
            // InternalMasl.g:319:60: (iv_ruledomainPrjDefinition= ruledomainPrjDefinition EOF )
            // InternalMasl.g:320:2: iv_ruledomainPrjDefinition= ruledomainPrjDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainPrjDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledomainPrjDefinition=ruledomainPrjDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledomainPrjDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledomainPrjDefinition"


    // $ANTLR start "ruledomainPrjDefinition"
    // InternalMasl.g:326:1: ruledomainPrjDefinition returns [EObject current=null] : ( ruleDOMAIN ( (lv_domainName_1_0= ruledomainName ) ) ruleIS ( (lv_domainPrjItem_3_0= ruledomainPrjItem ) )* ruleEND ( ruleDOMAIN )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) ) ;
    public final EObject ruledomainPrjDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_domainName_1_0 = null;

        EObject lv_domainPrjItem_3_0 = null;

        EObject lv_pragmaList_7_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:332:2: ( ( ruleDOMAIN ( (lv_domainName_1_0= ruledomainName ) ) ruleIS ( (lv_domainPrjItem_3_0= ruledomainPrjItem ) )* ruleEND ( ruleDOMAIN )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) ) )
            // InternalMasl.g:333:2: ( ruleDOMAIN ( (lv_domainName_1_0= ruledomainName ) ) ruleIS ( (lv_domainPrjItem_3_0= ruledomainPrjItem ) )* ruleEND ( ruleDOMAIN )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) )
            {
            // InternalMasl.g:333:2: ( ruleDOMAIN ( (lv_domainName_1_0= ruledomainName ) ) ruleIS ( (lv_domainPrjItem_3_0= ruledomainPrjItem ) )* ruleEND ( ruleDOMAIN )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) )
            // InternalMasl.g:334:3: ruleDOMAIN ( (lv_domainName_1_0= ruledomainName ) ) ruleIS ( (lv_domainPrjItem_3_0= ruledomainPrjItem ) )* ruleEND ( ruleDOMAIN )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainPrjDefinitionAccess().getDOMAINParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_4);
            ruleDOMAIN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:341:3: ( (lv_domainName_1_0= ruledomainName ) )
            // InternalMasl.g:342:4: (lv_domainName_1_0= ruledomainName )
            {
            // InternalMasl.g:342:4: (lv_domainName_1_0= ruledomainName )
            // InternalMasl.g:343:5: lv_domainName_1_0= ruledomainName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainPrjDefinitionAccess().getDomainNameDomainNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_domainName_1_0=ruledomainName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainPrjDefinitionRule());
              					}
              					set(
              						current,
              						"domainName",
              						lv_domainName_1_0,
              						"org.xtuml.bp.xtext.Masl.domainName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainPrjDefinitionAccess().getISParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_9);
            ruleIS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:367:3: ( (lv_domainPrjItem_3_0= ruledomainPrjItem ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==37) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMasl.g:368:4: (lv_domainPrjItem_3_0= ruledomainPrjItem )
            	    {
            	    // InternalMasl.g:368:4: (lv_domainPrjItem_3_0= ruledomainPrjItem )
            	    // InternalMasl.g:369:5: lv_domainPrjItem_3_0= ruledomainPrjItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDomainPrjDefinitionAccess().getDomainPrjItemDomainPrjItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_domainPrjItem_3_0=ruledomainPrjItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDomainPrjDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"domainPrjItem",
            	      						lv_domainPrjItem_3_0,
            	      						"org.xtuml.bp.xtext.Masl.domainPrjItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainPrjDefinitionAccess().getENDParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_10);
            ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:393:3: ( ruleDOMAIN )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMasl.g:394:4: ruleDOMAIN
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDomainPrjDefinitionAccess().getDOMAINParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    ruleDOMAIN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainPrjDefinitionAccess().getSEMIParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_8);
            ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:409:3: ( (lv_pragmaList_7_0= rulepragmaList ) )
            // InternalMasl.g:410:4: (lv_pragmaList_7_0= rulepragmaList )
            {
            // InternalMasl.g:410:4: (lv_pragmaList_7_0= rulepragmaList )
            // InternalMasl.g:411:5: lv_pragmaList_7_0= rulepragmaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainPrjDefinitionAccess().getPragmaListPragmaListParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pragmaList_7_0=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainPrjDefinitionRule());
              					}
              					set(
              						current,
              						"pragmaList",
              						lv_pragmaList_7_0,
              						"org.xtuml.bp.xtext.Masl.pragmaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledomainPrjDefinition"


    // $ANTLR start "entryRuledomainPrjItem"
    // InternalMasl.g:432:1: entryRuledomainPrjItem returns [EObject current=null] : iv_ruledomainPrjItem= ruledomainPrjItem EOF ;
    public final EObject entryRuledomainPrjItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledomainPrjItem = null;


        try {
            // InternalMasl.g:432:54: (iv_ruledomainPrjItem= ruledomainPrjItem EOF )
            // InternalMasl.g:433:2: iv_ruledomainPrjItem= ruledomainPrjItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainPrjItemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledomainPrjItem=ruledomainPrjItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledomainPrjItem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledomainPrjItem"


    // $ANTLR start "ruledomainPrjItem"
    // InternalMasl.g:439:1: ruledomainPrjItem returns [EObject current=null] : this_terminatorDefinition_0= ruleterminatorDefinition ;
    public final EObject ruledomainPrjItem() throws RecognitionException {
        EObject current = null;

        EObject this_terminatorDefinition_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:445:2: (this_terminatorDefinition_0= ruleterminatorDefinition )
            // InternalMasl.g:446:2: this_terminatorDefinition_0= ruleterminatorDefinition
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getDomainPrjItemAccess().getTerminatorDefinitionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_terminatorDefinition_0=ruleterminatorDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_terminatorDefinition_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledomainPrjItem"


    // $ANTLR start "entryRuleprojectName"
    // InternalMasl.g:457:1: entryRuleprojectName returns [EObject current=null] : iv_ruleprojectName= ruleprojectName EOF ;
    public final EObject entryRuleprojectName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprojectName = null;


        try {
            // InternalMasl.g:457:52: (iv_ruleprojectName= ruleprojectName EOF )
            // InternalMasl.g:458:2: iv_ruleprojectName= ruleprojectName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprojectName=ruleprojectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprojectName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprojectName"


    // $ANTLR start "ruleprojectName"
    // InternalMasl.g:464:1: ruleprojectName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleprojectName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMasl.g:470:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalMasl.g:471:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalMasl.g:471:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMasl.g:472:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMasl.g:472:3: (lv_identifier_0_0= RULE_ID )
            // InternalMasl.g:473:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_identifier_0_0, grammarAccess.getProjectNameAccess().getIdentifierIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getProjectNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprojectName"


    // $ANTLR start "entryRuledomainName"
    // InternalMasl.g:492:1: entryRuledomainName returns [EObject current=null] : iv_ruledomainName= ruledomainName EOF ;
    public final EObject entryRuledomainName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledomainName = null;


        try {
            // InternalMasl.g:492:51: (iv_ruledomainName= ruledomainName EOF )
            // InternalMasl.g:493:2: iv_ruledomainName= ruledomainName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledomainName=ruledomainName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledomainName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledomainName"


    // $ANTLR start "ruledomainName"
    // InternalMasl.g:499:1: ruledomainName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruledomainName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMasl.g:505:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalMasl.g:506:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalMasl.g:506:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMasl.g:507:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMasl.g:507:3: (lv_identifier_0_0= RULE_ID )
            // InternalMasl.g:508:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_identifier_0_0, grammarAccess.getDomainNameAccess().getIdentifierIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDomainNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledomainName"


    // $ANTLR start "entryRuleterminatorName"
    // InternalMasl.g:527:1: entryRuleterminatorName returns [EObject current=null] : iv_ruleterminatorName= ruleterminatorName EOF ;
    public final EObject entryRuleterminatorName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterminatorName = null;


        try {
            // InternalMasl.g:527:55: (iv_ruleterminatorName= ruleterminatorName EOF )
            // InternalMasl.g:528:2: iv_ruleterminatorName= ruleterminatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleterminatorName=ruleterminatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleterminatorName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterminatorName"


    // $ANTLR start "ruleterminatorName"
    // InternalMasl.g:534:1: ruleterminatorName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleterminatorName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMasl.g:540:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalMasl.g:541:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalMasl.g:541:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMasl.g:542:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMasl.g:542:3: (lv_identifier_0_0= RULE_ID )
            // InternalMasl.g:543:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_identifier_0_0, grammarAccess.getTerminatorNameAccess().getIdentifierIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTerminatorNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterminatorName"


    // $ANTLR start "entryRuleterminatorDefinition"
    // InternalMasl.g:562:1: entryRuleterminatorDefinition returns [EObject current=null] : iv_ruleterminatorDefinition= ruleterminatorDefinition EOF ;
    public final EObject entryRuleterminatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterminatorDefinition = null;


        try {
            // InternalMasl.g:562:61: (iv_ruleterminatorDefinition= ruleterminatorDefinition EOF )
            // InternalMasl.g:563:2: iv_ruleterminatorDefinition= ruleterminatorDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminatorDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleterminatorDefinition=ruleterminatorDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleterminatorDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterminatorDefinition"


    // $ANTLR start "ruleterminatorDefinition"
    // InternalMasl.g:569:1: ruleterminatorDefinition returns [EObject current=null] : ( ruleTERMINATOR ( (lv_terminatorName_1_0= ruleterminatorName ) ) ruleIS ( (lv_terminatorItem_3_0= ruleterminatorItem ) )* ruleEND ( ruleTERMINATOR )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) ) ;
    public final EObject ruleterminatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_terminatorName_1_0 = null;

        EObject lv_terminatorItem_3_0 = null;

        EObject lv_pragmaList_7_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:575:2: ( ( ruleTERMINATOR ( (lv_terminatorName_1_0= ruleterminatorName ) ) ruleIS ( (lv_terminatorItem_3_0= ruleterminatorItem ) )* ruleEND ( ruleTERMINATOR )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) ) )
            // InternalMasl.g:576:2: ( ruleTERMINATOR ( (lv_terminatorName_1_0= ruleterminatorName ) ) ruleIS ( (lv_terminatorItem_3_0= ruleterminatorItem ) )* ruleEND ( ruleTERMINATOR )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) )
            {
            // InternalMasl.g:576:2: ( ruleTERMINATOR ( (lv_terminatorName_1_0= ruleterminatorName ) ) ruleIS ( (lv_terminatorItem_3_0= ruleterminatorItem ) )* ruleEND ( ruleTERMINATOR )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) )
            // InternalMasl.g:577:3: ruleTERMINATOR ( (lv_terminatorName_1_0= ruleterminatorName ) ) ruleIS ( (lv_terminatorItem_3_0= ruleterminatorItem ) )* ruleEND ( ruleTERMINATOR )? ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorDefinitionAccess().getTERMINATORParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_4);
            ruleTERMINATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:584:3: ( (lv_terminatorName_1_0= ruleterminatorName ) )
            // InternalMasl.g:585:4: (lv_terminatorName_1_0= ruleterminatorName )
            {
            // InternalMasl.g:585:4: (lv_terminatorName_1_0= ruleterminatorName )
            // InternalMasl.g:586:5: lv_terminatorName_1_0= ruleterminatorName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorDefinitionAccess().getTerminatorNameTerminatorNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_terminatorName_1_0=ruleterminatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorDefinitionRule());
              					}
              					set(
              						current,
              						"terminatorName",
              						lv_terminatorName_1_0,
              						"org.xtuml.bp.xtext.Masl.terminatorName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorDefinitionAccess().getISParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_11);
            ruleIS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:610:3: ( (lv_terminatorItem_3_0= ruleterminatorItem ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28||LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMasl.g:611:4: (lv_terminatorItem_3_0= ruleterminatorItem )
            	    {
            	    // InternalMasl.g:611:4: (lv_terminatorItem_3_0= ruleterminatorItem )
            	    // InternalMasl.g:612:5: lv_terminatorItem_3_0= ruleterminatorItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTerminatorDefinitionAccess().getTerminatorItemTerminatorItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_terminatorItem_3_0=ruleterminatorItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTerminatorDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"terminatorItem",
            	      						lv_terminatorItem_3_0,
            	      						"org.xtuml.bp.xtext.Masl.terminatorItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorDefinitionAccess().getENDParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_12);
            ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:636:3: ( ruleTERMINATOR )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==37) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMasl.g:637:4: ruleTERMINATOR
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTerminatorDefinitionAccess().getTERMINATORParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    ruleTERMINATOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorDefinitionAccess().getSEMIParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_8);
            ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:652:3: ( (lv_pragmaList_7_0= rulepragmaList ) )
            // InternalMasl.g:653:4: (lv_pragmaList_7_0= rulepragmaList )
            {
            // InternalMasl.g:653:4: (lv_pragmaList_7_0= rulepragmaList )
            // InternalMasl.g:654:5: lv_pragmaList_7_0= rulepragmaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorDefinitionAccess().getPragmaListPragmaListParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pragmaList_7_0=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorDefinitionRule());
              					}
              					set(
              						current,
              						"pragmaList",
              						lv_pragmaList_7_0,
              						"org.xtuml.bp.xtext.Masl.pragmaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterminatorDefinition"


    // $ANTLR start "entryRuleterminatorItem"
    // InternalMasl.g:675:1: entryRuleterminatorItem returns [EObject current=null] : iv_ruleterminatorItem= ruleterminatorItem EOF ;
    public final EObject entryRuleterminatorItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterminatorItem = null;


        try {
            // InternalMasl.g:675:55: (iv_ruleterminatorItem= ruleterminatorItem EOF )
            // InternalMasl.g:676:2: iv_ruleterminatorItem= ruleterminatorItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminatorItemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleterminatorItem=ruleterminatorItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleterminatorItem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterminatorItem"


    // $ANTLR start "ruleterminatorItem"
    // InternalMasl.g:682:1: ruleterminatorItem returns [EObject current=null] : (this_terminatorServiceDeclaration_0= ruleterminatorServiceDeclaration | this_terminatorFunctionDeclaration_1= ruleterminatorFunctionDeclaration ) ;
    public final EObject ruleterminatorItem() throws RecognitionException {
        EObject current = null;

        EObject this_terminatorServiceDeclaration_0 = null;

        EObject this_terminatorFunctionDeclaration_1 = null;



        	enterRule();

        try {
            // InternalMasl.g:688:2: ( (this_terminatorServiceDeclaration_0= ruleterminatorServiceDeclaration | this_terminatorFunctionDeclaration_1= ruleterminatorFunctionDeclaration ) )
            // InternalMasl.g:689:2: (this_terminatorServiceDeclaration_0= ruleterminatorServiceDeclaration | this_terminatorFunctionDeclaration_1= ruleterminatorFunctionDeclaration )
            {
            // InternalMasl.g:689:2: (this_terminatorServiceDeclaration_0= ruleterminatorServiceDeclaration | this_terminatorFunctionDeclaration_1= ruleterminatorFunctionDeclaration )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==36) ) {
                    alt9=1;
                }
                else if ( (LA9_1==21) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==30) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==36) ) {
                    alt9=1;
                }
                else if ( (LA9_2==21) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMasl.g:690:3: this_terminatorServiceDeclaration_0= ruleterminatorServiceDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminatorItemAccess().getTerminatorServiceDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_terminatorServiceDeclaration_0=ruleterminatorServiceDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_terminatorServiceDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMasl.g:699:3: this_terminatorFunctionDeclaration_1= ruleterminatorFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminatorItemAccess().getTerminatorFunctionDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_terminatorFunctionDeclaration_1=ruleterminatorFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_terminatorFunctionDeclaration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterminatorItem"


    // $ANTLR start "entryRuleterminatorServiceDeclaration"
    // InternalMasl.g:711:1: entryRuleterminatorServiceDeclaration returns [EObject current=null] : iv_ruleterminatorServiceDeclaration= ruleterminatorServiceDeclaration EOF ;
    public final EObject entryRuleterminatorServiceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterminatorServiceDeclaration = null;


        try {
            // InternalMasl.g:711:69: (iv_ruleterminatorServiceDeclaration= ruleterminatorServiceDeclaration EOF )
            // InternalMasl.g:712:2: iv_ruleterminatorServiceDeclaration= ruleterminatorServiceDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminatorServiceDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleterminatorServiceDeclaration=ruleterminatorServiceDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleterminatorServiceDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterminatorServiceDeclaration"


    // $ANTLR start "ruleterminatorServiceDeclaration"
    // InternalMasl.g:718:1: ruleterminatorServiceDeclaration returns [EObject current=null] : ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_serviceName_2_0= ruleserviceName ) ) ( (lv_parameterList_3_0= ruleparameterList ) ) ruleSEMI ( (lv_pragmaList_5_0= rulepragmaList ) ) ) ;
    public final EObject ruleterminatorServiceDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_serviceVisibility_0_0 = null;

        EObject lv_serviceName_2_0 = null;

        EObject lv_parameterList_3_0 = null;

        EObject lv_pragmaList_5_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:724:2: ( ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_serviceName_2_0= ruleserviceName ) ) ( (lv_parameterList_3_0= ruleparameterList ) ) ruleSEMI ( (lv_pragmaList_5_0= rulepragmaList ) ) ) )
            // InternalMasl.g:725:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_serviceName_2_0= ruleserviceName ) ) ( (lv_parameterList_3_0= ruleparameterList ) ) ruleSEMI ( (lv_pragmaList_5_0= rulepragmaList ) ) )
            {
            // InternalMasl.g:725:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_serviceName_2_0= ruleserviceName ) ) ( (lv_parameterList_3_0= ruleparameterList ) ) ruleSEMI ( (lv_pragmaList_5_0= rulepragmaList ) ) )
            // InternalMasl.g:726:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_serviceName_2_0= ruleserviceName ) ) ( (lv_parameterList_3_0= ruleparameterList ) ) ruleSEMI ( (lv_pragmaList_5_0= rulepragmaList ) )
            {
            // InternalMasl.g:726:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) )
            // InternalMasl.g:727:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            {
            // InternalMasl.g:727:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            // InternalMasl.g:728:5: lv_serviceVisibility_0_0= ruleserviceVisibility
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorServiceDeclarationAccess().getServiceVisibilityServiceVisibilityParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_serviceVisibility_0_0=ruleserviceVisibility();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorServiceDeclarationRule());
              					}
              					set(
              						current,
              						"serviceVisibility",
              						lv_serviceVisibility_0_0,
              						"org.xtuml.bp.xtext.Masl.serviceVisibility");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorServiceDeclarationAccess().getSERVICEParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            ruleSERVICE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:752:3: ( (lv_serviceName_2_0= ruleserviceName ) )
            // InternalMasl.g:753:4: (lv_serviceName_2_0= ruleserviceName )
            {
            // InternalMasl.g:753:4: (lv_serviceName_2_0= ruleserviceName )
            // InternalMasl.g:754:5: lv_serviceName_2_0= ruleserviceName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorServiceDeclarationAccess().getServiceNameServiceNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_serviceName_2_0=ruleserviceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorServiceDeclarationRule());
              					}
              					set(
              						current,
              						"serviceName",
              						lv_serviceName_2_0,
              						"org.xtuml.bp.xtext.Masl.serviceName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:771:3: ( (lv_parameterList_3_0= ruleparameterList ) )
            // InternalMasl.g:772:4: (lv_parameterList_3_0= ruleparameterList )
            {
            // InternalMasl.g:772:4: (lv_parameterList_3_0= ruleparameterList )
            // InternalMasl.g:773:5: lv_parameterList_3_0= ruleparameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorServiceDeclarationAccess().getParameterListParameterListParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_parameterList_3_0=ruleparameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorServiceDeclarationRule());
              					}
              					set(
              						current,
              						"parameterList",
              						lv_parameterList_3_0,
              						"org.xtuml.bp.xtext.Masl.parameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorServiceDeclarationAccess().getSEMIParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_8);
            ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:797:3: ( (lv_pragmaList_5_0= rulepragmaList ) )
            // InternalMasl.g:798:4: (lv_pragmaList_5_0= rulepragmaList )
            {
            // InternalMasl.g:798:4: (lv_pragmaList_5_0= rulepragmaList )
            // InternalMasl.g:799:5: lv_pragmaList_5_0= rulepragmaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorServiceDeclarationAccess().getPragmaListPragmaListParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pragmaList_5_0=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorServiceDeclarationRule());
              					}
              					set(
              						current,
              						"pragmaList",
              						lv_pragmaList_5_0,
              						"org.xtuml.bp.xtext.Masl.pragmaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterminatorServiceDeclaration"


    // $ANTLR start "entryRuleterminatorFunctionDeclaration"
    // InternalMasl.g:820:1: entryRuleterminatorFunctionDeclaration returns [EObject current=null] : iv_ruleterminatorFunctionDeclaration= ruleterminatorFunctionDeclaration EOF ;
    public final EObject entryRuleterminatorFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterminatorFunctionDeclaration = null;


        try {
            // InternalMasl.g:820:70: (iv_ruleterminatorFunctionDeclaration= ruleterminatorFunctionDeclaration EOF )
            // InternalMasl.g:821:2: iv_ruleterminatorFunctionDeclaration= ruleterminatorFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminatorFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleterminatorFunctionDeclaration=ruleterminatorFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleterminatorFunctionDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterminatorFunctionDeclaration"


    // $ANTLR start "ruleterminatorFunctionDeclaration"
    // InternalMasl.g:827:1: ruleterminatorFunctionDeclaration returns [EObject current=null] : ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_serviceName_2_0= ruleserviceName ) ) ( (lv_parameterList_3_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_5_0= rulereturnType ) ) ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) ) ;
    public final EObject ruleterminatorFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_serviceVisibility_0_0 = null;

        EObject lv_serviceName_2_0 = null;

        EObject lv_parameterList_3_0 = null;

        EObject lv_returnType_5_0 = null;

        EObject lv_pragmaList_7_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:833:2: ( ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_serviceName_2_0= ruleserviceName ) ) ( (lv_parameterList_3_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_5_0= rulereturnType ) ) ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) ) )
            // InternalMasl.g:834:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_serviceName_2_0= ruleserviceName ) ) ( (lv_parameterList_3_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_5_0= rulereturnType ) ) ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) )
            {
            // InternalMasl.g:834:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_serviceName_2_0= ruleserviceName ) ) ( (lv_parameterList_3_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_5_0= rulereturnType ) ) ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) ) )
            // InternalMasl.g:835:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_serviceName_2_0= ruleserviceName ) ) ( (lv_parameterList_3_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_5_0= rulereturnType ) ) ruleSEMI ( (lv_pragmaList_7_0= rulepragmaList ) )
            {
            // InternalMasl.g:835:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) )
            // InternalMasl.g:836:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            {
            // InternalMasl.g:836:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            // InternalMasl.g:837:5: lv_serviceVisibility_0_0= ruleserviceVisibility
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDeclarationAccess().getServiceVisibilityServiceVisibilityParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_serviceVisibility_0_0=ruleserviceVisibility();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDeclarationRule());
              					}
              					set(
              						current,
              						"serviceVisibility",
              						lv_serviceVisibility_0_0,
              						"org.xtuml.bp.xtext.Masl.serviceVisibility");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorFunctionDeclarationAccess().getFUNCTIONParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            ruleFUNCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:861:3: ( (lv_serviceName_2_0= ruleserviceName ) )
            // InternalMasl.g:862:4: (lv_serviceName_2_0= ruleserviceName )
            {
            // InternalMasl.g:862:4: (lv_serviceName_2_0= ruleserviceName )
            // InternalMasl.g:863:5: lv_serviceName_2_0= ruleserviceName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDeclarationAccess().getServiceNameServiceNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_serviceName_2_0=ruleserviceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDeclarationRule());
              					}
              					set(
              						current,
              						"serviceName",
              						lv_serviceName_2_0,
              						"org.xtuml.bp.xtext.Masl.serviceName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:880:3: ( (lv_parameterList_3_0= ruleparameterList ) )
            // InternalMasl.g:881:4: (lv_parameterList_3_0= ruleparameterList )
            {
            // InternalMasl.g:881:4: (lv_parameterList_3_0= ruleparameterList )
            // InternalMasl.g:882:5: lv_parameterList_3_0= ruleparameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDeclarationAccess().getParameterListParameterListParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_parameterList_3_0=ruleparameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDeclarationRule());
              					}
              					set(
              						current,
              						"parameterList",
              						lv_parameterList_3_0,
              						"org.xtuml.bp.xtext.Masl.parameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorFunctionDeclarationAccess().getRETURNParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_17);
            ruleRETURN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:906:3: ( (lv_returnType_5_0= rulereturnType ) )
            // InternalMasl.g:907:4: (lv_returnType_5_0= rulereturnType )
            {
            // InternalMasl.g:907:4: (lv_returnType_5_0= rulereturnType )
            // InternalMasl.g:908:5: lv_returnType_5_0= rulereturnType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDeclarationAccess().getReturnTypeReturnTypeParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_returnType_5_0=rulereturnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDeclarationRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_5_0,
              						"org.xtuml.bp.xtext.Masl.returnType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorFunctionDeclarationAccess().getSEMIParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_8);
            ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:932:3: ( (lv_pragmaList_7_0= rulepragmaList ) )
            // InternalMasl.g:933:4: (lv_pragmaList_7_0= rulepragmaList )
            {
            // InternalMasl.g:933:4: (lv_pragmaList_7_0= rulepragmaList )
            // InternalMasl.g:934:5: lv_pragmaList_7_0= rulepragmaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDeclarationAccess().getPragmaListPragmaListParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pragmaList_7_0=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDeclarationRule());
              					}
              					set(
              						current,
              						"pragmaList",
              						lv_pragmaList_7_0,
              						"org.xtuml.bp.xtext.Masl.pragmaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterminatorFunctionDeclaration"


    // $ANTLR start "entryRuleparameterList"
    // InternalMasl.g:955:1: entryRuleparameterList returns [EObject current=null] : iv_ruleparameterList= ruleparameterList EOF ;
    public final EObject entryRuleparameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterList = null;


        try {
            // InternalMasl.g:955:54: (iv_ruleparameterList= ruleparameterList EOF )
            // InternalMasl.g:956:2: iv_ruleparameterList= ruleparameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameterList=ruleparameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameterList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameterList"


    // $ANTLR start "ruleparameterList"
    // InternalMasl.g:962:1: ruleparameterList returns [EObject current=null] : ( ruleLPAREN () ( (lv_parameterDefinition_2_0= ruleparameterDefinition ) )? ( ruleCOMMA ( (lv_parameterDefinition_4_0= ruleparameterDefinition ) ) )* ruleRPAREN ) ;
    public final EObject ruleparameterList() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterDefinition_2_0 = null;

        EObject lv_parameterDefinition_4_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:968:2: ( ( ruleLPAREN () ( (lv_parameterDefinition_2_0= ruleparameterDefinition ) )? ( ruleCOMMA ( (lv_parameterDefinition_4_0= ruleparameterDefinition ) ) )* ruleRPAREN ) )
            // InternalMasl.g:969:2: ( ruleLPAREN () ( (lv_parameterDefinition_2_0= ruleparameterDefinition ) )? ( ruleCOMMA ( (lv_parameterDefinition_4_0= ruleparameterDefinition ) ) )* ruleRPAREN )
            {
            // InternalMasl.g:969:2: ( ruleLPAREN () ( (lv_parameterDefinition_2_0= ruleparameterDefinition ) )? ( ruleCOMMA ( (lv_parameterDefinition_4_0= ruleparameterDefinition ) ) )* ruleRPAREN )
            // InternalMasl.g:970:3: ruleLPAREN () ( (lv_parameterDefinition_2_0= ruleparameterDefinition ) )? ( ruleCOMMA ( (lv_parameterDefinition_4_0= ruleparameterDefinition ) ) )* ruleRPAREN
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterListAccess().getLPARENParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:977:3: ()
            // InternalMasl.g:978:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListAccess().getParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalMasl.g:984:3: ( (lv_parameterDefinition_2_0= ruleparameterDefinition ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMasl.g:985:4: (lv_parameterDefinition_2_0= ruleparameterDefinition )
                    {
                    // InternalMasl.g:985:4: (lv_parameterDefinition_2_0= ruleparameterDefinition )
                    // InternalMasl.g:986:5: lv_parameterDefinition_2_0= ruleparameterDefinition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getParameterListAccess().getParameterDefinitionParameterDefinitionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_18);
                    lv_parameterDefinition_2_0=ruleparameterDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getParameterListRule());
                      					}
                      					add(
                      						current,
                      						"parameterDefinition",
                      						lv_parameterDefinition_2_0,
                      						"org.xtuml.bp.xtext.Masl.parameterDefinition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMasl.g:1003:3: ( ruleCOMMA ( (lv_parameterDefinition_4_0= ruleparameterDefinition ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMasl.g:1004:4: ruleCOMMA ( (lv_parameterDefinition_4_0= ruleparameterDefinition ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getParameterListAccess().getCOMMAParserRuleCall_3_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_4);
            	    ruleCOMMA();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalMasl.g:1011:4: ( (lv_parameterDefinition_4_0= ruleparameterDefinition ) )
            	    // InternalMasl.g:1012:5: (lv_parameterDefinition_4_0= ruleparameterDefinition )
            	    {
            	    // InternalMasl.g:1012:5: (lv_parameterDefinition_4_0= ruleparameterDefinition )
            	    // InternalMasl.g:1013:6: lv_parameterDefinition_4_0= ruleparameterDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParameterListAccess().getParameterDefinitionParameterDefinitionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_parameterDefinition_4_0=ruleparameterDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getParameterListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameterDefinition",
            	      							lv_parameterDefinition_4_0,
            	      							"org.xtuml.bp.xtext.Masl.parameterDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterListAccess().getRPARENParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameterList"


    // $ANTLR start "entryRuleparameterDefinition"
    // InternalMasl.g:1042:1: entryRuleparameterDefinition returns [EObject current=null] : iv_ruleparameterDefinition= ruleparameterDefinition EOF ;
    public final EObject entryRuleparameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterDefinition = null;


        try {
            // InternalMasl.g:1042:60: (iv_ruleparameterDefinition= ruleparameterDefinition EOF )
            // InternalMasl.g:1043:2: iv_ruleparameterDefinition= ruleparameterDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameterDefinition=ruleparameterDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameterDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameterDefinition"


    // $ANTLR start "ruleparameterDefinition"
    // InternalMasl.g:1049:1: ruleparameterDefinition returns [EObject current=null] : ( ( (lv_parameterName_0_0= ruleparameterName ) ) ruleCOLON ( (lv_parameterMode_2_0= ruleparameterMode ) ) ( (lv_parameterType_3_0= ruleparameterType ) ) ) ;
    public final EObject ruleparameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterName_0_0 = null;

        AntlrDatatypeRuleToken lv_parameterMode_2_0 = null;

        EObject lv_parameterType_3_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:1055:2: ( ( ( (lv_parameterName_0_0= ruleparameterName ) ) ruleCOLON ( (lv_parameterMode_2_0= ruleparameterMode ) ) ( (lv_parameterType_3_0= ruleparameterType ) ) ) )
            // InternalMasl.g:1056:2: ( ( (lv_parameterName_0_0= ruleparameterName ) ) ruleCOLON ( (lv_parameterMode_2_0= ruleparameterMode ) ) ( (lv_parameterType_3_0= ruleparameterType ) ) )
            {
            // InternalMasl.g:1056:2: ( ( (lv_parameterName_0_0= ruleparameterName ) ) ruleCOLON ( (lv_parameterMode_2_0= ruleparameterMode ) ) ( (lv_parameterType_3_0= ruleparameterType ) ) )
            // InternalMasl.g:1057:3: ( (lv_parameterName_0_0= ruleparameterName ) ) ruleCOLON ( (lv_parameterMode_2_0= ruleparameterMode ) ) ( (lv_parameterType_3_0= ruleparameterType ) )
            {
            // InternalMasl.g:1057:3: ( (lv_parameterName_0_0= ruleparameterName ) )
            // InternalMasl.g:1058:4: (lv_parameterName_0_0= ruleparameterName )
            {
            // InternalMasl.g:1058:4: (lv_parameterName_0_0= ruleparameterName )
            // InternalMasl.g:1059:5: lv_parameterName_0_0= ruleparameterName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterDefinitionAccess().getParameterNameParameterNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_parameterName_0_0=ruleparameterName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
              					}
              					set(
              						current,
              						"parameterName",
              						lv_parameterName_0_0,
              						"org.xtuml.bp.xtext.Masl.parameterName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterDefinitionAccess().getCOLONParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_20);
            ruleCOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:1083:3: ( (lv_parameterMode_2_0= ruleparameterMode ) )
            // InternalMasl.g:1084:4: (lv_parameterMode_2_0= ruleparameterMode )
            {
            // InternalMasl.g:1084:4: (lv_parameterMode_2_0= ruleparameterMode )
            // InternalMasl.g:1085:5: lv_parameterMode_2_0= ruleparameterMode
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterDefinitionAccess().getParameterModeParameterModeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_parameterMode_2_0=ruleparameterMode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
              					}
              					set(
              						current,
              						"parameterMode",
              						lv_parameterMode_2_0,
              						"org.xtuml.bp.xtext.Masl.parameterMode");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:1102:3: ( (lv_parameterType_3_0= ruleparameterType ) )
            // InternalMasl.g:1103:4: (lv_parameterType_3_0= ruleparameterType )
            {
            // InternalMasl.g:1103:4: (lv_parameterType_3_0= ruleparameterType )
            // InternalMasl.g:1104:5: lv_parameterType_3_0= ruleparameterType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterDefinitionAccess().getParameterTypeParameterTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_parameterType_3_0=ruleparameterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
              					}
              					set(
              						current,
              						"parameterType",
              						lv_parameterType_3_0,
              						"org.xtuml.bp.xtext.Masl.parameterType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameterDefinition"


    // $ANTLR start "entryRuleserviceVisibility"
    // InternalMasl.g:1125:1: entryRuleserviceVisibility returns [String current=null] : iv_ruleserviceVisibility= ruleserviceVisibility EOF ;
    public final String entryRuleserviceVisibility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleserviceVisibility = null;


        try {
            // InternalMasl.g:1125:57: (iv_ruleserviceVisibility= ruleserviceVisibility EOF )
            // InternalMasl.g:1126:2: iv_ruleserviceVisibility= ruleserviceVisibility EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceVisibilityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleserviceVisibility=ruleserviceVisibility();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleserviceVisibility.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleserviceVisibility"


    // $ANTLR start "ruleserviceVisibility"
    // InternalMasl.g:1132:1: ruleserviceVisibility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PRIVATE_0= rulePRIVATE | this_PUBLIC_1= rulePUBLIC ) ;
    public final AntlrDatatypeRuleToken ruleserviceVisibility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PRIVATE_0 = null;

        AntlrDatatypeRuleToken this_PUBLIC_1 = null;



        	enterRule();

        try {
            // InternalMasl.g:1138:2: ( (this_PRIVATE_0= rulePRIVATE | this_PUBLIC_1= rulePUBLIC ) )
            // InternalMasl.g:1139:2: (this_PRIVATE_0= rulePRIVATE | this_PUBLIC_1= rulePUBLIC )
            {
            // InternalMasl.g:1139:2: (this_PRIVATE_0= rulePRIVATE | this_PUBLIC_1= rulePUBLIC )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMasl.g:1140:3: this_PRIVATE_0= rulePRIVATE
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getServiceVisibilityAccess().getPRIVATEParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PRIVATE_0=rulePRIVATE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PRIVATE_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMasl.g:1151:3: this_PUBLIC_1= rulePUBLIC
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getServiceVisibilityAccess().getPUBLICParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PUBLIC_1=rulePUBLIC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PUBLIC_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleserviceVisibility"


    // $ANTLR start "entryRuleparameterMode"
    // InternalMasl.g:1165:1: entryRuleparameterMode returns [String current=null] : iv_ruleparameterMode= ruleparameterMode EOF ;
    public final String entryRuleparameterMode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameterMode = null;


        try {
            // InternalMasl.g:1165:53: (iv_ruleparameterMode= ruleparameterMode EOF )
            // InternalMasl.g:1166:2: iv_ruleparameterMode= ruleparameterMode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterModeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameterMode=ruleparameterMode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameterMode.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameterMode"


    // $ANTLR start "ruleparameterMode"
    // InternalMasl.g:1172:1: ruleparameterMode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IN_0= ruleIN | this_OUT_1= ruleOUT ) ;
    public final AntlrDatatypeRuleToken ruleparameterMode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IN_0 = null;

        AntlrDatatypeRuleToken this_OUT_1 = null;



        	enterRule();

        try {
            // InternalMasl.g:1178:2: ( (this_IN_0= ruleIN | this_OUT_1= ruleOUT ) )
            // InternalMasl.g:1179:2: (this_IN_0= ruleIN | this_OUT_1= ruleOUT )
            {
            // InternalMasl.g:1179:2: (this_IN_0= ruleIN | this_OUT_1= ruleOUT )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMasl.g:1180:3: this_IN_0= ruleIN
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterModeAccess().getINParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IN_0=ruleIN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IN_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMasl.g:1191:3: this_OUT_1= ruleOUT
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterModeAccess().getOUTParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OUT_1=ruleOUT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OUT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameterMode"


    // $ANTLR start "entryRuleserviceName"
    // InternalMasl.g:1205:1: entryRuleserviceName returns [EObject current=null] : iv_ruleserviceName= ruleserviceName EOF ;
    public final EObject entryRuleserviceName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleserviceName = null;


        try {
            // InternalMasl.g:1205:52: (iv_ruleserviceName= ruleserviceName EOF )
            // InternalMasl.g:1206:2: iv_ruleserviceName= ruleserviceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleserviceName=ruleserviceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleserviceName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleserviceName"


    // $ANTLR start "ruleserviceName"
    // InternalMasl.g:1212:1: ruleserviceName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleserviceName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMasl.g:1218:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalMasl.g:1219:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalMasl.g:1219:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMasl.g:1220:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMasl.g:1220:3: (lv_identifier_0_0= RULE_ID )
            // InternalMasl.g:1221:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_identifier_0_0, grammarAccess.getServiceNameAccess().getIdentifierIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getServiceNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleserviceName"


    // $ANTLR start "entryRuleparameterName"
    // InternalMasl.g:1240:1: entryRuleparameterName returns [EObject current=null] : iv_ruleparameterName= ruleparameterName EOF ;
    public final EObject entryRuleparameterName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterName = null;


        try {
            // InternalMasl.g:1240:54: (iv_ruleparameterName= ruleparameterName EOF )
            // InternalMasl.g:1241:2: iv_ruleparameterName= ruleparameterName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameterName=ruleparameterName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameterName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameterName"


    // $ANTLR start "ruleparameterName"
    // InternalMasl.g:1247:1: ruleparameterName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleparameterName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMasl.g:1253:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalMasl.g:1254:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalMasl.g:1254:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMasl.g:1255:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMasl.g:1255:3: (lv_identifier_0_0= RULE_ID )
            // InternalMasl.g:1256:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_identifier_0_0, grammarAccess.getParameterNameAccess().getIdentifierIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getParameterNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameterName"


    // $ANTLR start "entryRuleparameterType"
    // InternalMasl.g:1275:1: entryRuleparameterType returns [EObject current=null] : iv_ruleparameterType= ruleparameterType EOF ;
    public final EObject entryRuleparameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterType = null;


        try {
            // InternalMasl.g:1275:54: (iv_ruleparameterType= ruleparameterType EOF )
            // InternalMasl.g:1276:2: iv_ruleparameterType= ruleparameterType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameterType=ruleparameterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameterType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameterType"


    // $ANTLR start "ruleparameterType"
    // InternalMasl.g:1282:1: ruleparameterType returns [EObject current=null] : ( (lv_typeReference_0_0= ruletypeReference ) ) ;
    public final EObject ruleparameterType() throws RecognitionException {
        EObject current = null;

        EObject lv_typeReference_0_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:1288:2: ( ( (lv_typeReference_0_0= ruletypeReference ) ) )
            // InternalMasl.g:1289:2: ( (lv_typeReference_0_0= ruletypeReference ) )
            {
            // InternalMasl.g:1289:2: ( (lv_typeReference_0_0= ruletypeReference ) )
            // InternalMasl.g:1290:3: (lv_typeReference_0_0= ruletypeReference )
            {
            // InternalMasl.g:1290:3: (lv_typeReference_0_0= ruletypeReference )
            // InternalMasl.g:1291:4: lv_typeReference_0_0= ruletypeReference
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterTypeAccess().getTypeReferenceTypeReferenceParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_0_0=ruletypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterTypeRule());
              				}
              				set(
              					current,
              					"typeReference",
              					lv_typeReference_0_0,
              					"org.xtuml.bp.xtext.Masl.typeReference");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameterType"


    // $ANTLR start "entryRulereturnType"
    // InternalMasl.g:1311:1: entryRulereturnType returns [EObject current=null] : iv_rulereturnType= rulereturnType EOF ;
    public final EObject entryRulereturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereturnType = null;


        try {
            // InternalMasl.g:1311:51: (iv_rulereturnType= rulereturnType EOF )
            // InternalMasl.g:1312:2: iv_rulereturnType= rulereturnType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulereturnType=rulereturnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulereturnType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulereturnType"


    // $ANTLR start "rulereturnType"
    // InternalMasl.g:1318:1: rulereturnType returns [EObject current=null] : ( (lv_typeReference_0_0= ruletypeReference ) ) ;
    public final EObject rulereturnType() throws RecognitionException {
        EObject current = null;

        EObject lv_typeReference_0_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:1324:2: ( ( (lv_typeReference_0_0= ruletypeReference ) ) )
            // InternalMasl.g:1325:2: ( (lv_typeReference_0_0= ruletypeReference ) )
            {
            // InternalMasl.g:1325:2: ( (lv_typeReference_0_0= ruletypeReference ) )
            // InternalMasl.g:1326:3: (lv_typeReference_0_0= ruletypeReference )
            {
            // InternalMasl.g:1326:3: (lv_typeReference_0_0= ruletypeReference )
            // InternalMasl.g:1327:4: lv_typeReference_0_0= ruletypeReference
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReturnTypeAccess().getTypeReferenceTypeReferenceParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_0_0=ruletypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReturnTypeRule());
              				}
              				set(
              					current,
              					"typeReference",
              					lv_typeReference_0_0,
              					"org.xtuml.bp.xtext.Masl.typeReference");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulereturnType"


    // $ANTLR start "entryRuletypeReference"
    // InternalMasl.g:1347:1: entryRuletypeReference returns [EObject current=null] : iv_ruletypeReference= ruletypeReference EOF ;
    public final EObject entryRuletypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeReference = null;


        try {
            // InternalMasl.g:1347:54: (iv_ruletypeReference= ruletypeReference EOF )
            // InternalMasl.g:1348:2: iv_ruletypeReference= ruletypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeReference=ruletypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletypeReference"


    // $ANTLR start "ruletypeReference"
    // InternalMasl.g:1354:1: ruletypeReference returns [EObject current=null] : (this_namedTypeRef_0= rulenamedTypeRef | this_deprecatedType_1= ruledeprecatedType ) ;
    public final EObject ruletypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_namedTypeRef_0 = null;

        EObject this_deprecatedType_1 = null;



        	enterRule();

        try {
            // InternalMasl.g:1360:2: ( (this_namedTypeRef_0= rulenamedTypeRef | this_deprecatedType_1= ruledeprecatedType ) )
            // InternalMasl.g:1361:2: (this_namedTypeRef_0= rulenamedTypeRef | this_deprecatedType_1= ruledeprecatedType )
            {
            // InternalMasl.g:1361:2: (this_namedTypeRef_0= rulenamedTypeRef | this_deprecatedType_1= ruledeprecatedType )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==12) ) {
                alt14=1;
            }
            else if ( (LA14_0==20||LA14_0==23||LA14_0==36) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMasl.g:1362:3: this_namedTypeRef_0= rulenamedTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeReferenceAccess().getNamedTypeRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_namedTypeRef_0=rulenamedTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_namedTypeRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMasl.g:1371:3: this_deprecatedType_1= ruledeprecatedType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeReferenceAccess().getDeprecatedTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_deprecatedType_1=ruledeprecatedType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_deprecatedType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletypeReference"


    // $ANTLR start "entryRuledeprecatedType"
    // InternalMasl.g:1383:1: entryRuledeprecatedType returns [EObject current=null] : iv_ruledeprecatedType= ruledeprecatedType EOF ;
    public final EObject entryRuledeprecatedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeprecatedType = null;


        try {
            // InternalMasl.g:1383:55: (iv_ruledeprecatedType= ruledeprecatedType EOF )
            // InternalMasl.g:1384:2: iv_ruledeprecatedType= ruledeprecatedType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeprecatedTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledeprecatedType=ruledeprecatedType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeprecatedType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledeprecatedType"


    // $ANTLR start "ruledeprecatedType"
    // InternalMasl.g:1390:1: ruledeprecatedType returns [EObject current=null] : ( ( (lv_INSTANCE_0_0= ruleINSTANCE ) ) | ( (lv_EVENT_1_0= ruleEVENT ) ) | ( (lv_SERVICE_2_0= ruleSERVICE ) ) ) ;
    public final EObject ruledeprecatedType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_INSTANCE_0_0 = null;

        AntlrDatatypeRuleToken lv_EVENT_1_0 = null;

        AntlrDatatypeRuleToken lv_SERVICE_2_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:1396:2: ( ( ( (lv_INSTANCE_0_0= ruleINSTANCE ) ) | ( (lv_EVENT_1_0= ruleEVENT ) ) | ( (lv_SERVICE_2_0= ruleSERVICE ) ) ) )
            // InternalMasl.g:1397:2: ( ( (lv_INSTANCE_0_0= ruleINSTANCE ) ) | ( (lv_EVENT_1_0= ruleEVENT ) ) | ( (lv_SERVICE_2_0= ruleSERVICE ) ) )
            {
            // InternalMasl.g:1397:2: ( ( (lv_INSTANCE_0_0= ruleINSTANCE ) ) | ( (lv_EVENT_1_0= ruleEVENT ) ) | ( (lv_SERVICE_2_0= ruleSERVICE ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt15=1;
                }
                break;
            case 20:
                {
                alt15=2;
                }
                break;
            case 36:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMasl.g:1398:3: ( (lv_INSTANCE_0_0= ruleINSTANCE ) )
                    {
                    // InternalMasl.g:1398:3: ( (lv_INSTANCE_0_0= ruleINSTANCE ) )
                    // InternalMasl.g:1399:4: (lv_INSTANCE_0_0= ruleINSTANCE )
                    {
                    // InternalMasl.g:1399:4: (lv_INSTANCE_0_0= ruleINSTANCE )
                    // InternalMasl.g:1400:5: lv_INSTANCE_0_0= ruleINSTANCE
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeprecatedTypeAccess().getINSTANCEINSTANCEParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_INSTANCE_0_0=ruleINSTANCE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeprecatedTypeRule());
                      					}
                      					set(
                      						current,
                      						"INSTANCE",
                      						lv_INSTANCE_0_0,
                      						"org.xtuml.bp.xtext.Masl.INSTANCE");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMasl.g:1418:3: ( (lv_EVENT_1_0= ruleEVENT ) )
                    {
                    // InternalMasl.g:1418:3: ( (lv_EVENT_1_0= ruleEVENT ) )
                    // InternalMasl.g:1419:4: (lv_EVENT_1_0= ruleEVENT )
                    {
                    // InternalMasl.g:1419:4: (lv_EVENT_1_0= ruleEVENT )
                    // InternalMasl.g:1420:5: lv_EVENT_1_0= ruleEVENT
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeprecatedTypeAccess().getEVENTEVENTParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_EVENT_1_0=ruleEVENT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeprecatedTypeRule());
                      					}
                      					set(
                      						current,
                      						"EVENT",
                      						lv_EVENT_1_0,
                      						"org.xtuml.bp.xtext.Masl.EVENT");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMasl.g:1438:3: ( (lv_SERVICE_2_0= ruleSERVICE ) )
                    {
                    // InternalMasl.g:1438:3: ( (lv_SERVICE_2_0= ruleSERVICE ) )
                    // InternalMasl.g:1439:4: (lv_SERVICE_2_0= ruleSERVICE )
                    {
                    // InternalMasl.g:1439:4: (lv_SERVICE_2_0= ruleSERVICE )
                    // InternalMasl.g:1440:5: lv_SERVICE_2_0= ruleSERVICE
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeprecatedTypeAccess().getSERVICESERVICEParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_SERVICE_2_0=ruleSERVICE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeprecatedTypeRule());
                      					}
                      					set(
                      						current,
                      						"SERVICE",
                      						lv_SERVICE_2_0,
                      						"org.xtuml.bp.xtext.Masl.SERVICE");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledeprecatedType"


    // $ANTLR start "entryRulenamedTypeRef"
    // InternalMasl.g:1461:1: entryRulenamedTypeRef returns [EObject current=null] : iv_rulenamedTypeRef= rulenamedTypeRef EOF ;
    public final EObject entryRulenamedTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenamedTypeRef = null;


        try {
            // InternalMasl.g:1461:53: (iv_rulenamedTypeRef= rulenamedTypeRef EOF )
            // InternalMasl.g:1462:2: iv_rulenamedTypeRef= rulenamedTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulenamedTypeRef=rulenamedTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenamedTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenamedTypeRef"


    // $ANTLR start "rulenamedTypeRef"
    // InternalMasl.g:1468:1: rulenamedTypeRef returns [EObject current=null] : ( ( (lv_anonymous_0_0= ruleANONYMOUS ) )? ( ( (lv_domainName_1_0= ruledomainName ) ) ruleSCOPE )? ( (lv_typeName_3_0= ruletypeName ) ) ) ;
    public final EObject rulenamedTypeRef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_anonymous_0_0 = null;

        EObject lv_domainName_1_0 = null;

        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:1474:2: ( ( ( (lv_anonymous_0_0= ruleANONYMOUS ) )? ( ( (lv_domainName_1_0= ruledomainName ) ) ruleSCOPE )? ( (lv_typeName_3_0= ruletypeName ) ) ) )
            // InternalMasl.g:1475:2: ( ( (lv_anonymous_0_0= ruleANONYMOUS ) )? ( ( (lv_domainName_1_0= ruledomainName ) ) ruleSCOPE )? ( (lv_typeName_3_0= ruletypeName ) ) )
            {
            // InternalMasl.g:1475:2: ( ( (lv_anonymous_0_0= ruleANONYMOUS ) )? ( ( (lv_domainName_1_0= ruledomainName ) ) ruleSCOPE )? ( (lv_typeName_3_0= ruletypeName ) ) )
            // InternalMasl.g:1476:3: ( (lv_anonymous_0_0= ruleANONYMOUS ) )? ( ( (lv_domainName_1_0= ruledomainName ) ) ruleSCOPE )? ( (lv_typeName_3_0= ruletypeName ) )
            {
            // InternalMasl.g:1476:3: ( (lv_anonymous_0_0= ruleANONYMOUS ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMasl.g:1477:4: (lv_anonymous_0_0= ruleANONYMOUS )
                    {
                    // InternalMasl.g:1477:4: (lv_anonymous_0_0= ruleANONYMOUS )
                    // InternalMasl.g:1478:5: lv_anonymous_0_0= ruleANONYMOUS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNamedTypeRefAccess().getAnonymousANONYMOUSParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
                    lv_anonymous_0_0=ruleANONYMOUS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNamedTypeRefRule());
                      					}
                      					set(
                      						current,
                      						"anonymous",
                      						lv_anonymous_0_0,
                      						"org.xtuml.bp.xtext.Masl.ANONYMOUS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMasl.g:1495:3: ( ( (lv_domainName_1_0= ruledomainName ) ) ruleSCOPE )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==34) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalMasl.g:1496:4: ( (lv_domainName_1_0= ruledomainName ) ) ruleSCOPE
                    {
                    // InternalMasl.g:1496:4: ( (lv_domainName_1_0= ruledomainName ) )
                    // InternalMasl.g:1497:5: (lv_domainName_1_0= ruledomainName )
                    {
                    // InternalMasl.g:1497:5: (lv_domainName_1_0= ruledomainName )
                    // InternalMasl.g:1498:6: lv_domainName_1_0= ruledomainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNamedTypeRefAccess().getDomainNameDomainNameParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_domainName_1_0=ruledomainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNamedTypeRefRule());
                      						}
                      						set(
                      							current,
                      							"domainName",
                      							lv_domainName_1_0,
                      							"org.xtuml.bp.xtext.Masl.domainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNamedTypeRefAccess().getSCOPEParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_21);
                    ruleSCOPE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalMasl.g:1523:3: ( (lv_typeName_3_0= ruletypeName ) )
            // InternalMasl.g:1524:4: (lv_typeName_3_0= ruletypeName )
            {
            // InternalMasl.g:1524:4: (lv_typeName_3_0= ruletypeName )
            // InternalMasl.g:1525:5: lv_typeName_3_0= ruletypeName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNamedTypeRefAccess().getTypeNameTypeNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeName_3_0=ruletypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNamedTypeRefRule());
              					}
              					set(
              						current,
              						"typeName",
              						lv_typeName_3_0,
              						"org.xtuml.bp.xtext.Masl.typeName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenamedTypeRef"


    // $ANTLR start "entryRuletypeName"
    // InternalMasl.g:1546:1: entryRuletypeName returns [EObject current=null] : iv_ruletypeName= ruletypeName EOF ;
    public final EObject entryRuletypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeName = null;


        try {
            // InternalMasl.g:1546:49: (iv_ruletypeName= ruletypeName EOF )
            // InternalMasl.g:1547:2: iv_ruletypeName= ruletypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeName=ruletypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletypeName"


    // $ANTLR start "ruletypeName"
    // InternalMasl.g:1553:1: ruletypeName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruletypeName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMasl.g:1559:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalMasl.g:1560:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalMasl.g:1560:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMasl.g:1561:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMasl.g:1561:3: (lv_identifier_0_0= RULE_ID )
            // InternalMasl.g:1562:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_identifier_0_0, grammarAccess.getTypeNameAccess().getIdentifierIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTypeNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletypeName"


    // $ANTLR start "entryRulepragmaList"
    // InternalMasl.g:1581:1: entryRulepragmaList returns [EObject current=null] : iv_rulepragmaList= rulepragmaList EOF ;
    public final EObject entryRulepragmaList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepragmaList = null;


        try {
            // InternalMasl.g:1581:51: (iv_rulepragmaList= rulepragmaList EOF )
            // InternalMasl.g:1582:2: iv_rulepragmaList= rulepragmaList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPragmaListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepragmaList=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepragmaList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepragmaList"


    // $ANTLR start "rulepragmaList"
    // InternalMasl.g:1588:1: rulepragmaList returns [EObject current=null] : ( () ( ( (lv_pragma_1_0= rulepragma ) ) ruleSEMI )* ) ;
    public final EObject rulepragmaList() throws RecognitionException {
        EObject current = null;

        EObject lv_pragma_1_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:1594:2: ( ( () ( ( (lv_pragma_1_0= rulepragma ) ) ruleSEMI )* ) )
            // InternalMasl.g:1595:2: ( () ( ( (lv_pragma_1_0= rulepragma ) ) ruleSEMI )* )
            {
            // InternalMasl.g:1595:2: ( () ( ( (lv_pragma_1_0= rulepragma ) ) ruleSEMI )* )
            // InternalMasl.g:1596:3: () ( ( (lv_pragma_1_0= rulepragma ) ) ruleSEMI )*
            {
            // InternalMasl.g:1596:3: ()
            // InternalMasl.g:1597:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPragmaListAccess().getPragmaListAction_0(),
              					current);
              			
            }

            }

            // InternalMasl.g:1603:3: ( ( (lv_pragma_1_0= rulepragma ) ) ruleSEMI )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMasl.g:1604:4: ( (lv_pragma_1_0= rulepragma ) ) ruleSEMI
            	    {
            	    // InternalMasl.g:1604:4: ( (lv_pragma_1_0= rulepragma ) )
            	    // InternalMasl.g:1605:5: (lv_pragma_1_0= rulepragma )
            	    {
            	    // InternalMasl.g:1605:5: (lv_pragma_1_0= rulepragma )
            	    // InternalMasl.g:1606:6: lv_pragma_1_0= rulepragma
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPragmaListAccess().getPragmaPragmaParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_pragma_1_0=rulepragma();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPragmaListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"pragma",
            	      							lv_pragma_1_0,
            	      							"org.xtuml.bp.xtext.Masl.pragma");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getPragmaListAccess().getSEMIParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_23);
            	    ruleSEMI();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepragmaList"


    // $ANTLR start "entryRulepragma"
    // InternalMasl.g:1635:1: entryRulepragma returns [EObject current=null] : iv_rulepragma= rulepragma EOF ;
    public final EObject entryRulepragma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepragma = null;


        try {
            // InternalMasl.g:1635:47: (iv_rulepragma= rulepragma EOF )
            // InternalMasl.g:1636:2: iv_rulepragma= rulepragma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPragmaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepragma=rulepragma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepragma; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepragma"


    // $ANTLR start "rulepragma"
    // InternalMasl.g:1642:1: rulepragma returns [EObject current=null] : ( rulePRAGMATOK ( (lv_pragmaName_1_0= rulepragmaName ) ) ruleLPAREN ( ( (lv_pragmaValue_3_0= rulepragmaValue ) ) ( ruleCOMMA ( (lv_pragmaValue_5_0= rulepragmaValue ) ) )* )? ruleRPAREN ) ;
    public final EObject rulepragma() throws RecognitionException {
        EObject current = null;

        EObject lv_pragmaName_1_0 = null;

        AntlrDatatypeRuleToken lv_pragmaValue_3_0 = null;

        AntlrDatatypeRuleToken lv_pragmaValue_5_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:1648:2: ( ( rulePRAGMATOK ( (lv_pragmaName_1_0= rulepragmaName ) ) ruleLPAREN ( ( (lv_pragmaValue_3_0= rulepragmaValue ) ) ( ruleCOMMA ( (lv_pragmaValue_5_0= rulepragmaValue ) ) )* )? ruleRPAREN ) )
            // InternalMasl.g:1649:2: ( rulePRAGMATOK ( (lv_pragmaName_1_0= rulepragmaName ) ) ruleLPAREN ( ( (lv_pragmaValue_3_0= rulepragmaValue ) ) ( ruleCOMMA ( (lv_pragmaValue_5_0= rulepragmaValue ) ) )* )? ruleRPAREN )
            {
            // InternalMasl.g:1649:2: ( rulePRAGMATOK ( (lv_pragmaName_1_0= rulepragmaName ) ) ruleLPAREN ( ( (lv_pragmaValue_3_0= rulepragmaValue ) ) ( ruleCOMMA ( (lv_pragmaValue_5_0= rulepragmaValue ) ) )* )? ruleRPAREN )
            // InternalMasl.g:1650:3: rulePRAGMATOK ( (lv_pragmaName_1_0= rulepragmaName ) ) ruleLPAREN ( ( (lv_pragmaValue_3_0= rulepragmaValue ) ) ( ruleCOMMA ( (lv_pragmaValue_5_0= rulepragmaValue ) ) )* )? ruleRPAREN
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPragmaAccess().getPRAGMATOKParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_4);
            rulePRAGMATOK();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:1657:3: ( (lv_pragmaName_1_0= rulepragmaName ) )
            // InternalMasl.g:1658:4: (lv_pragmaName_1_0= rulepragmaName )
            {
            // InternalMasl.g:1658:4: (lv_pragmaName_1_0= rulepragmaName )
            // InternalMasl.g:1659:5: lv_pragmaName_1_0= rulepragmaName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPragmaAccess().getPragmaNamePragmaNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_pragmaName_1_0=rulepragmaName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPragmaRule());
              					}
              					set(
              						current,
              						"pragmaName",
              						lv_pragmaName_1_0,
              						"org.xtuml.bp.xtext.Masl.pragmaName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPragmaAccess().getLPARENParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_24);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:1683:3: ( ( (lv_pragmaValue_3_0= rulepragmaValue ) ) ( ruleCOMMA ( (lv_pragmaValue_5_0= rulepragmaValue ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMasl.g:1684:4: ( (lv_pragmaValue_3_0= rulepragmaValue ) ) ( ruleCOMMA ( (lv_pragmaValue_5_0= rulepragmaValue ) ) )*
                    {
                    // InternalMasl.g:1684:4: ( (lv_pragmaValue_3_0= rulepragmaValue ) )
                    // InternalMasl.g:1685:5: (lv_pragmaValue_3_0= rulepragmaValue )
                    {
                    // InternalMasl.g:1685:5: (lv_pragmaValue_3_0= rulepragmaValue )
                    // InternalMasl.g:1686:6: lv_pragmaValue_3_0= rulepragmaValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPragmaAccess().getPragmaValuePragmaValueParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_pragmaValue_3_0=rulepragmaValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPragmaRule());
                      						}
                      						add(
                      							current,
                      							"pragmaValue",
                      							lv_pragmaValue_3_0,
                      							"org.xtuml.bp.xtext.Masl.pragmaValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMasl.g:1703:4: ( ruleCOMMA ( (lv_pragmaValue_5_0= rulepragmaValue ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMasl.g:1704:5: ruleCOMMA ( (lv_pragmaValue_5_0= rulepragmaValue ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getPragmaAccess().getCOMMAParserRuleCall_3_1_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    ruleCOMMA();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }
                    	    // InternalMasl.g:1711:5: ( (lv_pragmaValue_5_0= rulepragmaValue ) )
                    	    // InternalMasl.g:1712:6: (lv_pragmaValue_5_0= rulepragmaValue )
                    	    {
                    	    // InternalMasl.g:1712:6: (lv_pragmaValue_5_0= rulepragmaValue )
                    	    // InternalMasl.g:1713:7: lv_pragmaValue_5_0= rulepragmaValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPragmaAccess().getPragmaValuePragmaValueParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_pragmaValue_5_0=rulepragmaValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPragmaRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"pragmaValue",
                    	      								lv_pragmaValue_5_0,
                    	      								"org.xtuml.bp.xtext.Masl.pragmaValue");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPragmaAccess().getRPARENParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepragma"


    // $ANTLR start "entryRulepragmaValue"
    // InternalMasl.g:1743:1: entryRulepragmaValue returns [String current=null] : iv_rulepragmaValue= rulepragmaValue EOF ;
    public final String entryRulepragmaValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepragmaValue = null;


        try {
            // InternalMasl.g:1743:51: (iv_rulepragmaValue= rulepragmaValue EOF )
            // InternalMasl.g:1744:2: iv_rulepragmaValue= rulepragmaValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPragmaValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepragmaValue=rulepragmaValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepragmaValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepragmaValue"


    // $ANTLR start "rulepragmaValue"
    // InternalMasl.g:1750:1: rulepragmaValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_literal_0= ruleliteral | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulepragmaValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_literal_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:1756:2: ( (this_literal_0= ruleliteral | this_ID_1= RULE_ID ) )
            // InternalMasl.g:1757:2: (this_literal_0= ruleliteral | this_ID_1= RULE_ID )
            {
            // InternalMasl.g:1757:2: (this_literal_0= ruleliteral | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_INT && LA21_0<=RULE_STRING)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMasl.g:1758:3: this_literal_0= ruleliteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPragmaValueAccess().getLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_literal_0=ruleliteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_literal_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMasl.g:1769:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getPragmaValueAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepragmaValue"


    // $ANTLR start "entryRulepragmaName"
    // InternalMasl.g:1780:1: entryRulepragmaName returns [EObject current=null] : iv_rulepragmaName= rulepragmaName EOF ;
    public final EObject entryRulepragmaName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepragmaName = null;


        try {
            // InternalMasl.g:1780:51: (iv_rulepragmaName= rulepragmaName EOF )
            // InternalMasl.g:1781:2: iv_rulepragmaName= rulepragmaName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPragmaNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepragmaName=rulepragmaName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepragmaName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepragmaName"


    // $ANTLR start "rulepragmaName"
    // InternalMasl.g:1787:1: rulepragmaName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject rulepragmaName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMasl.g:1793:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalMasl.g:1794:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalMasl.g:1794:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMasl.g:1795:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMasl.g:1795:3: (lv_identifier_0_0= RULE_ID )
            // InternalMasl.g:1796:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_identifier_0_0, grammarAccess.getPragmaNameAccess().getIdentifierIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPragmaNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepragmaName"


    // $ANTLR start "entryRuleliteral"
    // InternalMasl.g:1815:1: entryRuleliteral returns [String current=null] : iv_ruleliteral= ruleliteral EOF ;
    public final String entryRuleliteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleliteral = null;


        try {
            // InternalMasl.g:1815:47: (iv_ruleliteral= ruleliteral EOF )
            // InternalMasl.g:1816:2: iv_ruleliteral= ruleliteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleliteral=ruleliteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleliteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleliteral"


    // $ANTLR start "ruleliteral"
    // InternalMasl.g:1822:1: ruleliteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleliteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalMasl.g:1828:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalMasl.g:1829:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalMasl.g:1829:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_STRING) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMasl.g:1830:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMasl.g:1838:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_1, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleliteral"


    // $ANTLR start "entryRuleobjectName"
    // InternalMasl.g:1849:1: entryRuleobjectName returns [EObject current=null] : iv_ruleobjectName= ruleobjectName EOF ;
    public final EObject entryRuleobjectName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectName = null;


        try {
            // InternalMasl.g:1849:51: (iv_ruleobjectName= ruleobjectName EOF )
            // InternalMasl.g:1850:2: iv_ruleobjectName= ruleobjectName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleobjectName=ruleobjectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleobjectName"


    // $ANTLR start "ruleobjectName"
    // InternalMasl.g:1856:1: ruleobjectName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleobjectName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMasl.g:1862:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalMasl.g:1863:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalMasl.g:1863:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMasl.g:1864:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMasl.g:1864:3: (lv_identifier_0_0= RULE_ID )
            // InternalMasl.g:1865:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_identifier_0_0, grammarAccess.getObjectNameAccess().getIdentifierIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getObjectNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleobjectName"


    // $ANTLR start "entryRuleserviceType"
    // InternalMasl.g:1884:1: entryRuleserviceType returns [EObject current=null] : iv_ruleserviceType= ruleserviceType EOF ;
    public final EObject entryRuleserviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleserviceType = null;


        try {
            // InternalMasl.g:1884:52: (iv_ruleserviceType= ruleserviceType EOF )
            // InternalMasl.g:1885:2: iv_ruleserviceType= ruleserviceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleserviceType=ruleserviceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleserviceType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleserviceType"


    // $ANTLR start "ruleserviceType"
    // InternalMasl.g:1891:1: ruleserviceType returns [EObject current=null] : ( ( (lv_INSTANCE_0_0= ruleINSTANCE ) ) ( ruleDEFERRED ruleLPAREN ( (lv_relationshipName_3_0= rulerelationshipName ) ) ruleRPAREN )? )? ;
    public final EObject ruleserviceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_INSTANCE_0_0 = null;

        EObject lv_relationshipName_3_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:1897:2: ( ( ( (lv_INSTANCE_0_0= ruleINSTANCE ) ) ( ruleDEFERRED ruleLPAREN ( (lv_relationshipName_3_0= rulerelationshipName ) ) ruleRPAREN )? )? )
            // InternalMasl.g:1898:2: ( ( (lv_INSTANCE_0_0= ruleINSTANCE ) ) ( ruleDEFERRED ruleLPAREN ( (lv_relationshipName_3_0= rulerelationshipName ) ) ruleRPAREN )? )?
            {
            // InternalMasl.g:1898:2: ( ( (lv_INSTANCE_0_0= ruleINSTANCE ) ) ( ruleDEFERRED ruleLPAREN ( (lv_relationshipName_3_0= rulerelationshipName ) ) ruleRPAREN )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMasl.g:1899:3: ( (lv_INSTANCE_0_0= ruleINSTANCE ) ) ( ruleDEFERRED ruleLPAREN ( (lv_relationshipName_3_0= rulerelationshipName ) ) ruleRPAREN )?
                    {
                    // InternalMasl.g:1899:3: ( (lv_INSTANCE_0_0= ruleINSTANCE ) )
                    // InternalMasl.g:1900:4: (lv_INSTANCE_0_0= ruleINSTANCE )
                    {
                    // InternalMasl.g:1900:4: (lv_INSTANCE_0_0= ruleINSTANCE )
                    // InternalMasl.g:1901:5: lv_INSTANCE_0_0= ruleINSTANCE
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getServiceTypeAccess().getINSTANCEINSTANCEParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_26);
                    lv_INSTANCE_0_0=ruleINSTANCE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getServiceTypeRule());
                      					}
                      					set(
                      						current,
                      						"INSTANCE",
                      						lv_INSTANCE_0_0,
                      						"org.xtuml.bp.xtext.Masl.INSTANCE");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }

                    // InternalMasl.g:1918:3: ( ruleDEFERRED ruleLPAREN ( (lv_relationshipName_3_0= rulerelationshipName ) ) ruleRPAREN )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==16) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalMasl.g:1919:4: ruleDEFERRED ruleLPAREN ( (lv_relationshipName_3_0= rulerelationshipName ) ) ruleRPAREN
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getServiceTypeAccess().getDEFERREDParserRuleCall_1_0());
                              			
                            }
                            pushFollow(FOLLOW_14);
                            ruleDEFERRED();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getServiceTypeAccess().getLPARENParserRuleCall_1_1());
                              			
                            }
                            pushFollow(FOLLOW_27);
                            ruleLPAREN();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }
                            // InternalMasl.g:1933:4: ( (lv_relationshipName_3_0= rulerelationshipName ) )
                            // InternalMasl.g:1934:5: (lv_relationshipName_3_0= rulerelationshipName )
                            {
                            // InternalMasl.g:1934:5: (lv_relationshipName_3_0= rulerelationshipName )
                            // InternalMasl.g:1935:6: lv_relationshipName_3_0= rulerelationshipName
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getServiceTypeAccess().getRelationshipNameRelationshipNameParserRuleCall_1_2_0());
                              					
                            }
                            pushFollow(FOLLOW_18);
                            lv_relationshipName_3_0=rulerelationshipName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getServiceTypeRule());
                              						}
                              						set(
                              							current,
                              							"relationshipName",
                              							lv_relationshipName_3_0,
                              							"org.xtuml.bp.xtext.Masl.relationshipName");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }

                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getServiceTypeAccess().getRPARENParserRuleCall_1_3());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            ruleRPAREN();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleserviceType"


    // $ANTLR start "entryRulerelationshipName"
    // InternalMasl.g:1964:1: entryRulerelationshipName returns [EObject current=null] : iv_rulerelationshipName= rulerelationshipName EOF ;
    public final EObject entryRulerelationshipName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerelationshipName = null;


        try {
            // InternalMasl.g:1964:57: (iv_rulerelationshipName= rulerelationshipName EOF )
            // InternalMasl.g:1965:2: iv_rulerelationshipName= rulerelationshipName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerelationshipName=rulerelationshipName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerelationshipName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerelationshipName"


    // $ANTLR start "rulerelationshipName"
    // InternalMasl.g:1971:1: rulerelationshipName returns [EObject current=null] : ( (lv_relationshipName_0_0= RULE_RELATIONSHIP_NAME ) ) ;
    public final EObject rulerelationshipName() throws RecognitionException {
        EObject current = null;

        Token lv_relationshipName_0_0=null;


        	enterRule();

        try {
            // InternalMasl.g:1977:2: ( ( (lv_relationshipName_0_0= RULE_RELATIONSHIP_NAME ) ) )
            // InternalMasl.g:1978:2: ( (lv_relationshipName_0_0= RULE_RELATIONSHIP_NAME ) )
            {
            // InternalMasl.g:1978:2: ( (lv_relationshipName_0_0= RULE_RELATIONSHIP_NAME ) )
            // InternalMasl.g:1979:3: (lv_relationshipName_0_0= RULE_RELATIONSHIP_NAME )
            {
            // InternalMasl.g:1979:3: (lv_relationshipName_0_0= RULE_RELATIONSHIP_NAME )
            // InternalMasl.g:1980:4: lv_relationshipName_0_0= RULE_RELATIONSHIP_NAME
            {
            lv_relationshipName_0_0=(Token)match(input,RULE_RELATIONSHIP_NAME,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_relationshipName_0_0, grammarAccess.getRelationshipNameAccess().getRelationshipNameRELATIONSHIP_NAMETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getRelationshipNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"relationshipName",
              					lv_relationshipName_0_0,
              					"org.xtuml.bp.xtext.Masl.RELATIONSHIP_NAME");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerelationshipName"


    // $ANTLR start "entryRuledomainServiceDefinition"
    // InternalMasl.g:1999:1: entryRuledomainServiceDefinition returns [EObject current=null] : iv_ruledomainServiceDefinition= ruledomainServiceDefinition EOF ;
    public final EObject entryRuledomainServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledomainServiceDefinition = null;


        try {
            // InternalMasl.g:1999:64: (iv_ruledomainServiceDefinition= ruledomainServiceDefinition EOF )
            // InternalMasl.g:2000:2: iv_ruledomainServiceDefinition= ruledomainServiceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainServiceDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledomainServiceDefinition=ruledomainServiceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledomainServiceDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledomainServiceDefinition"


    // $ANTLR start "ruledomainServiceDefinition"
    // InternalMasl.g:2006:1: ruledomainServiceDefinition returns [EObject current=null] : ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_serviceName_4_0= ruleserviceName ) ) ( (lv_parameterList_5_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_7_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pargmaList_10_0= rulepragmaList ) ) ) ;
    public final EObject ruledomainServiceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_serviceVisibility_0_0 = null;

        EObject lv_domainName_2_0 = null;

        EObject lv_serviceName_4_0 = null;

        EObject lv_parameterList_5_0 = null;

        EObject lv_codeBlock_7_0 = null;

        EObject lv_pargmaList_10_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:2012:2: ( ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_serviceName_4_0= ruleserviceName ) ) ( (lv_parameterList_5_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_7_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pargmaList_10_0= rulepragmaList ) ) ) )
            // InternalMasl.g:2013:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_serviceName_4_0= ruleserviceName ) ) ( (lv_parameterList_5_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_7_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pargmaList_10_0= rulepragmaList ) ) )
            {
            // InternalMasl.g:2013:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_serviceName_4_0= ruleserviceName ) ) ( (lv_parameterList_5_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_7_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pargmaList_10_0= rulepragmaList ) ) )
            // InternalMasl.g:2014:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_serviceName_4_0= ruleserviceName ) ) ( (lv_parameterList_5_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_7_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pargmaList_10_0= rulepragmaList ) )
            {
            // InternalMasl.g:2014:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) )
            // InternalMasl.g:2015:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            {
            // InternalMasl.g:2015:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            // InternalMasl.g:2016:5: lv_serviceVisibility_0_0= ruleserviceVisibility
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainServiceDefinitionAccess().getServiceVisibilityServiceVisibilityParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_serviceVisibility_0_0=ruleserviceVisibility();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainServiceDefinitionRule());
              					}
              					set(
              						current,
              						"serviceVisibility",
              						lv_serviceVisibility_0_0,
              						"org.xtuml.bp.xtext.Masl.serviceVisibility");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainServiceDefinitionAccess().getSERVICEParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            ruleSERVICE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2040:3: ( (lv_domainName_2_0= ruledomainName ) )
            // InternalMasl.g:2041:4: (lv_domainName_2_0= ruledomainName )
            {
            // InternalMasl.g:2041:4: (lv_domainName_2_0= ruledomainName )
            // InternalMasl.g:2042:5: lv_domainName_2_0= ruledomainName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainServiceDefinitionAccess().getDomainNameDomainNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_domainName_2_0=ruledomainName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainServiceDefinitionRule());
              					}
              					set(
              						current,
              						"domainName",
              						lv_domainName_2_0,
              						"org.xtuml.bp.xtext.Masl.domainName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainServiceDefinitionAccess().getSCOPEParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            ruleSCOPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2066:3: ( (lv_serviceName_4_0= ruleserviceName ) )
            // InternalMasl.g:2067:4: (lv_serviceName_4_0= ruleserviceName )
            {
            // InternalMasl.g:2067:4: (lv_serviceName_4_0= ruleserviceName )
            // InternalMasl.g:2068:5: lv_serviceName_4_0= ruleserviceName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainServiceDefinitionAccess().getServiceNameServiceNameParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_serviceName_4_0=ruleserviceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainServiceDefinitionRule());
              					}
              					set(
              						current,
              						"serviceName",
              						lv_serviceName_4_0,
              						"org.xtuml.bp.xtext.Masl.serviceName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:2085:3: ( (lv_parameterList_5_0= ruleparameterList ) )
            // InternalMasl.g:2086:4: (lv_parameterList_5_0= ruleparameterList )
            {
            // InternalMasl.g:2086:4: (lv_parameterList_5_0= ruleparameterList )
            // InternalMasl.g:2087:5: lv_parameterList_5_0= ruleparameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainServiceDefinitionAccess().getParameterListParameterListParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_parameterList_5_0=ruleparameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainServiceDefinitionRule());
              					}
              					set(
              						current,
              						"parameterList",
              						lv_parameterList_5_0,
              						"org.xtuml.bp.xtext.Masl.parameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainServiceDefinitionAccess().getISParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_28);
            ruleIS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2111:3: ( (lv_codeBlock_7_0= rulecodeBlock ) )
            // InternalMasl.g:2112:4: (lv_codeBlock_7_0= rulecodeBlock )
            {
            // InternalMasl.g:2112:4: (lv_codeBlock_7_0= rulecodeBlock )
            // InternalMasl.g:2113:5: lv_codeBlock_7_0= rulecodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainServiceDefinitionAccess().getCodeBlockCodeBlockParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_codeBlock_7_0=rulecodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainServiceDefinitionRule());
              					}
              					set(
              						current,
              						"codeBlock",
              						lv_codeBlock_7_0,
              						"org.xtuml.bp.xtext.Masl.codeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:2130:3: ( ruleSERVICE )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMasl.g:2131:4: ruleSERVICE
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDomainServiceDefinitionAccess().getSERVICEParserRuleCall_8());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    ruleSERVICE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainServiceDefinitionAccess().getSEMIParserRuleCall_9());
              		
            }
            pushFollow(FOLLOW_8);
            ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2146:3: ( (lv_pargmaList_10_0= rulepragmaList ) )
            // InternalMasl.g:2147:4: (lv_pargmaList_10_0= rulepragmaList )
            {
            // InternalMasl.g:2147:4: (lv_pargmaList_10_0= rulepragmaList )
            // InternalMasl.g:2148:5: lv_pargmaList_10_0= rulepragmaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainServiceDefinitionAccess().getPargmaListPragmaListParserRuleCall_10_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pargmaList_10_0=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainServiceDefinitionRule());
              					}
              					set(
              						current,
              						"pargmaList",
              						lv_pargmaList_10_0,
              						"org.xtuml.bp.xtext.Masl.pragmaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledomainServiceDefinition"


    // $ANTLR start "entryRuledomainFunctionDefinition"
    // InternalMasl.g:2169:1: entryRuledomainFunctionDefinition returns [EObject current=null] : iv_ruledomainFunctionDefinition= ruledomainFunctionDefinition EOF ;
    public final EObject entryRuledomainFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledomainFunctionDefinition = null;


        try {
            // InternalMasl.g:2169:65: (iv_ruledomainFunctionDefinition= ruledomainFunctionDefinition EOF )
            // InternalMasl.g:2170:2: iv_ruledomainFunctionDefinition= ruledomainFunctionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainFunctionDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledomainFunctionDefinition=ruledomainFunctionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledomainFunctionDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledomainFunctionDefinition"


    // $ANTLR start "ruledomainFunctionDefinition"
    // InternalMasl.g:2176:1: ruledomainFunctionDefinition returns [EObject current=null] : ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_serviceName_4_0= ruleserviceName ) ) ( (lv_parameterList_5_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_7_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_9_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pargmaList_12_0= rulepragmaList ) ) ) ;
    public final EObject ruledomainFunctionDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_serviceVisibility_0_0 = null;

        EObject lv_domainName_2_0 = null;

        EObject lv_serviceName_4_0 = null;

        EObject lv_parameterList_5_0 = null;

        EObject lv_returnType_7_0 = null;

        EObject lv_codeBlock_9_0 = null;

        EObject lv_pargmaList_12_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:2182:2: ( ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_serviceName_4_0= ruleserviceName ) ) ( (lv_parameterList_5_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_7_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_9_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pargmaList_12_0= rulepragmaList ) ) ) )
            // InternalMasl.g:2183:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_serviceName_4_0= ruleserviceName ) ) ( (lv_parameterList_5_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_7_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_9_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pargmaList_12_0= rulepragmaList ) ) )
            {
            // InternalMasl.g:2183:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_serviceName_4_0= ruleserviceName ) ) ( (lv_parameterList_5_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_7_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_9_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pargmaList_12_0= rulepragmaList ) ) )
            // InternalMasl.g:2184:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_serviceName_4_0= ruleserviceName ) ) ( (lv_parameterList_5_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_7_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_9_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pargmaList_12_0= rulepragmaList ) )
            {
            // InternalMasl.g:2184:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) )
            // InternalMasl.g:2185:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            {
            // InternalMasl.g:2185:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            // InternalMasl.g:2186:5: lv_serviceVisibility_0_0= ruleserviceVisibility
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getServiceVisibilityServiceVisibilityParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_serviceVisibility_0_0=ruleserviceVisibility();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"serviceVisibility",
              						lv_serviceVisibility_0_0,
              						"org.xtuml.bp.xtext.Masl.serviceVisibility");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getFUNCTIONParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            ruleFUNCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2210:3: ( (lv_domainName_2_0= ruledomainName ) )
            // InternalMasl.g:2211:4: (lv_domainName_2_0= ruledomainName )
            {
            // InternalMasl.g:2211:4: (lv_domainName_2_0= ruledomainName )
            // InternalMasl.g:2212:5: lv_domainName_2_0= ruledomainName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getDomainNameDomainNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_domainName_2_0=ruledomainName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"domainName",
              						lv_domainName_2_0,
              						"org.xtuml.bp.xtext.Masl.domainName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getSCOPEParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            ruleSCOPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2236:3: ( (lv_serviceName_4_0= ruleserviceName ) )
            // InternalMasl.g:2237:4: (lv_serviceName_4_0= ruleserviceName )
            {
            // InternalMasl.g:2237:4: (lv_serviceName_4_0= ruleserviceName )
            // InternalMasl.g:2238:5: lv_serviceName_4_0= ruleserviceName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getServiceNameServiceNameParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_serviceName_4_0=ruleserviceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"serviceName",
              						lv_serviceName_4_0,
              						"org.xtuml.bp.xtext.Masl.serviceName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:2255:3: ( (lv_parameterList_5_0= ruleparameterList ) )
            // InternalMasl.g:2256:4: (lv_parameterList_5_0= ruleparameterList )
            {
            // InternalMasl.g:2256:4: (lv_parameterList_5_0= ruleparameterList )
            // InternalMasl.g:2257:5: lv_parameterList_5_0= ruleparameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getParameterListParameterListParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_parameterList_5_0=ruleparameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"parameterList",
              						lv_parameterList_5_0,
              						"org.xtuml.bp.xtext.Masl.parameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getRETURNParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_17);
            ruleRETURN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2281:3: ( (lv_returnType_7_0= rulereturnType ) )
            // InternalMasl.g:2282:4: (lv_returnType_7_0= rulereturnType )
            {
            // InternalMasl.g:2282:4: (lv_returnType_7_0= rulereturnType )
            // InternalMasl.g:2283:5: lv_returnType_7_0= rulereturnType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getReturnTypeReturnTypeParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_returnType_7_0=rulereturnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_7_0,
              						"org.xtuml.bp.xtext.Masl.returnType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getISParserRuleCall_8());
              		
            }
            pushFollow(FOLLOW_28);
            ruleIS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2307:3: ( (lv_codeBlock_9_0= rulecodeBlock ) )
            // InternalMasl.g:2308:4: (lv_codeBlock_9_0= rulecodeBlock )
            {
            // InternalMasl.g:2308:4: (lv_codeBlock_9_0= rulecodeBlock )
            // InternalMasl.g:2309:5: lv_codeBlock_9_0= rulecodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getCodeBlockCodeBlockParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_codeBlock_9_0=rulecodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"codeBlock",
              						lv_codeBlock_9_0,
              						"org.xtuml.bp.xtext.Masl.codeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:2326:3: ( ruleFUNCTION )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMasl.g:2327:4: ruleFUNCTION
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getFUNCTIONParserRuleCall_10());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    ruleFUNCTION();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getSEMIParserRuleCall_11());
              		
            }
            pushFollow(FOLLOW_8);
            ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2342:3: ( (lv_pargmaList_12_0= rulepragmaList ) )
            // InternalMasl.g:2343:4: (lv_pargmaList_12_0= rulepragmaList )
            {
            // InternalMasl.g:2343:4: (lv_pargmaList_12_0= rulepragmaList )
            // InternalMasl.g:2344:5: lv_pargmaList_12_0= rulepragmaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainFunctionDefinitionAccess().getPargmaListPragmaListParserRuleCall_12_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pargmaList_12_0=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"pargmaList",
              						lv_pargmaList_12_0,
              						"org.xtuml.bp.xtext.Masl.pragmaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledomainFunctionDefinition"


    // $ANTLR start "entryRuleobjectServiceDefinition"
    // InternalMasl.g:2365:1: entryRuleobjectServiceDefinition returns [EObject current=null] : iv_ruleobjectServiceDefinition= ruleobjectServiceDefinition EOF ;
    public final EObject entryRuleobjectServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectServiceDefinition = null;


        try {
            // InternalMasl.g:2365:64: (iv_ruleobjectServiceDefinition= ruleobjectServiceDefinition EOF )
            // InternalMasl.g:2366:2: iv_ruleobjectServiceDefinition= ruleobjectServiceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectServiceDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleobjectServiceDefinition=ruleobjectServiceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectServiceDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleobjectServiceDefinition"


    // $ANTLR start "ruleobjectServiceDefinition"
    // InternalMasl.g:2372:1: ruleobjectServiceDefinition returns [EObject current=null] : ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ( (lv_INSTANCE_1_0= ruleINSTANCE ) )? ruleSERVICE ( (lv_domainName_3_0= ruledomainName ) ) ruleSCOPE ( (lv_objectName_5_0= ruleobjectName ) ) ruleDOT ( (lv_serviceName_7_0= ruleserviceName ) ) ( (lv_parameterList_8_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_10_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pragmaList_13_0= rulepragmaList ) ) ) ;
    public final EObject ruleobjectServiceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_serviceVisibility_0_0 = null;

        AntlrDatatypeRuleToken lv_INSTANCE_1_0 = null;

        EObject lv_domainName_3_0 = null;

        EObject lv_objectName_5_0 = null;

        EObject lv_serviceName_7_0 = null;

        EObject lv_parameterList_8_0 = null;

        EObject lv_codeBlock_10_0 = null;

        EObject lv_pragmaList_13_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:2378:2: ( ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ( (lv_INSTANCE_1_0= ruleINSTANCE ) )? ruleSERVICE ( (lv_domainName_3_0= ruledomainName ) ) ruleSCOPE ( (lv_objectName_5_0= ruleobjectName ) ) ruleDOT ( (lv_serviceName_7_0= ruleserviceName ) ) ( (lv_parameterList_8_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_10_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pragmaList_13_0= rulepragmaList ) ) ) )
            // InternalMasl.g:2379:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ( (lv_INSTANCE_1_0= ruleINSTANCE ) )? ruleSERVICE ( (lv_domainName_3_0= ruledomainName ) ) ruleSCOPE ( (lv_objectName_5_0= ruleobjectName ) ) ruleDOT ( (lv_serviceName_7_0= ruleserviceName ) ) ( (lv_parameterList_8_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_10_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pragmaList_13_0= rulepragmaList ) ) )
            {
            // InternalMasl.g:2379:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ( (lv_INSTANCE_1_0= ruleINSTANCE ) )? ruleSERVICE ( (lv_domainName_3_0= ruledomainName ) ) ruleSCOPE ( (lv_objectName_5_0= ruleobjectName ) ) ruleDOT ( (lv_serviceName_7_0= ruleserviceName ) ) ( (lv_parameterList_8_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_10_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pragmaList_13_0= rulepragmaList ) ) )
            // InternalMasl.g:2380:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ( (lv_INSTANCE_1_0= ruleINSTANCE ) )? ruleSERVICE ( (lv_domainName_3_0= ruledomainName ) ) ruleSCOPE ( (lv_objectName_5_0= ruleobjectName ) ) ruleDOT ( (lv_serviceName_7_0= ruleserviceName ) ) ( (lv_parameterList_8_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_10_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pragmaList_13_0= rulepragmaList ) )
            {
            // InternalMasl.g:2380:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) )
            // InternalMasl.g:2381:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            {
            // InternalMasl.g:2381:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            // InternalMasl.g:2382:5: lv_serviceVisibility_0_0= ruleserviceVisibility
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getServiceVisibilityServiceVisibilityParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_serviceVisibility_0_0=ruleserviceVisibility();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectServiceDefinitionRule());
              					}
              					set(
              						current,
              						"serviceVisibility",
              						lv_serviceVisibility_0_0,
              						"org.xtuml.bp.xtext.Masl.serviceVisibility");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:2399:3: ( (lv_INSTANCE_1_0= ruleINSTANCE ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMasl.g:2400:4: (lv_INSTANCE_1_0= ruleINSTANCE )
                    {
                    // InternalMasl.g:2400:4: (lv_INSTANCE_1_0= ruleINSTANCE )
                    // InternalMasl.g:2401:5: lv_INSTANCE_1_0= ruleINSTANCE
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getINSTANCEINSTANCEParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    lv_INSTANCE_1_0=ruleINSTANCE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getObjectServiceDefinitionRule());
                      					}
                      					set(
                      						current,
                      						"INSTANCE",
                      						lv_INSTANCE_1_0,
                      						"org.xtuml.bp.xtext.Masl.INSTANCE");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getSERVICEParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_4);
            ruleSERVICE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2425:3: ( (lv_domainName_3_0= ruledomainName ) )
            // InternalMasl.g:2426:4: (lv_domainName_3_0= ruledomainName )
            {
            // InternalMasl.g:2426:4: (lv_domainName_3_0= ruledomainName )
            // InternalMasl.g:2427:5: lv_domainName_3_0= ruledomainName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getDomainNameDomainNameParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_domainName_3_0=ruledomainName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectServiceDefinitionRule());
              					}
              					set(
              						current,
              						"domainName",
              						lv_domainName_3_0,
              						"org.xtuml.bp.xtext.Masl.domainName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getSCOPEParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_4);
            ruleSCOPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2451:3: ( (lv_objectName_5_0= ruleobjectName ) )
            // InternalMasl.g:2452:4: (lv_objectName_5_0= ruleobjectName )
            {
            // InternalMasl.g:2452:4: (lv_objectName_5_0= ruleobjectName )
            // InternalMasl.g:2453:5: lv_objectName_5_0= ruleobjectName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getObjectNameObjectNameParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_objectName_5_0=ruleobjectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectServiceDefinitionRule());
              					}
              					set(
              						current,
              						"objectName",
              						lv_objectName_5_0,
              						"org.xtuml.bp.xtext.Masl.objectName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getDOTParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_4);
            ruleDOT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2477:3: ( (lv_serviceName_7_0= ruleserviceName ) )
            // InternalMasl.g:2478:4: (lv_serviceName_7_0= ruleserviceName )
            {
            // InternalMasl.g:2478:4: (lv_serviceName_7_0= ruleserviceName )
            // InternalMasl.g:2479:5: lv_serviceName_7_0= ruleserviceName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getServiceNameServiceNameParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_serviceName_7_0=ruleserviceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectServiceDefinitionRule());
              					}
              					set(
              						current,
              						"serviceName",
              						lv_serviceName_7_0,
              						"org.xtuml.bp.xtext.Masl.serviceName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:2496:3: ( (lv_parameterList_8_0= ruleparameterList ) )
            // InternalMasl.g:2497:4: (lv_parameterList_8_0= ruleparameterList )
            {
            // InternalMasl.g:2497:4: (lv_parameterList_8_0= ruleparameterList )
            // InternalMasl.g:2498:5: lv_parameterList_8_0= ruleparameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getParameterListParameterListParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_parameterList_8_0=ruleparameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectServiceDefinitionRule());
              					}
              					set(
              						current,
              						"parameterList",
              						lv_parameterList_8_0,
              						"org.xtuml.bp.xtext.Masl.parameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getISParserRuleCall_9());
              		
            }
            pushFollow(FOLLOW_28);
            ruleIS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2522:3: ( (lv_codeBlock_10_0= rulecodeBlock ) )
            // InternalMasl.g:2523:4: (lv_codeBlock_10_0= rulecodeBlock )
            {
            // InternalMasl.g:2523:4: (lv_codeBlock_10_0= rulecodeBlock )
            // InternalMasl.g:2524:5: lv_codeBlock_10_0= rulecodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getCodeBlockCodeBlockParserRuleCall_10_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_codeBlock_10_0=rulecodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectServiceDefinitionRule());
              					}
              					set(
              						current,
              						"codeBlock",
              						lv_codeBlock_10_0,
              						"org.xtuml.bp.xtext.Masl.codeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:2541:3: ( ruleSERVICE )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMasl.g:2542:4: ruleSERVICE
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getSERVICEParserRuleCall_11());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    ruleSERVICE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getSEMIParserRuleCall_12());
              		
            }
            pushFollow(FOLLOW_8);
            ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2557:3: ( (lv_pragmaList_13_0= rulepragmaList ) )
            // InternalMasl.g:2558:4: (lv_pragmaList_13_0= rulepragmaList )
            {
            // InternalMasl.g:2558:4: (lv_pragmaList_13_0= rulepragmaList )
            // InternalMasl.g:2559:5: lv_pragmaList_13_0= rulepragmaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectServiceDefinitionAccess().getPragmaListPragmaListParserRuleCall_13_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pragmaList_13_0=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectServiceDefinitionRule());
              					}
              					set(
              						current,
              						"pragmaList",
              						lv_pragmaList_13_0,
              						"org.xtuml.bp.xtext.Masl.pragmaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleobjectServiceDefinition"


    // $ANTLR start "entryRuleobjectFunctionDefinition"
    // InternalMasl.g:2580:1: entryRuleobjectFunctionDefinition returns [EObject current=null] : iv_ruleobjectFunctionDefinition= ruleobjectFunctionDefinition EOF ;
    public final EObject entryRuleobjectFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleobjectFunctionDefinition = null;


        try {
            // InternalMasl.g:2580:65: (iv_ruleobjectFunctionDefinition= ruleobjectFunctionDefinition EOF )
            // InternalMasl.g:2581:2: iv_ruleobjectFunctionDefinition= ruleobjectFunctionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectFunctionDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleobjectFunctionDefinition=ruleobjectFunctionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleobjectFunctionDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleobjectFunctionDefinition"


    // $ANTLR start "ruleobjectFunctionDefinition"
    // InternalMasl.g:2587:1: ruleobjectFunctionDefinition returns [EObject current=null] : ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ( (lv_serviceType_1_0= ruleserviceType ) ) ruleFUNCTION ( (lv_domainName_3_0= ruledomainName ) ) ruleSCOPE ( (lv_objectName_5_0= ruleobjectName ) ) ruleDOT ( (lv_serviceName_7_0= ruleserviceName ) ) ( (lv_parameterList_8_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_10_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_12_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pragmaList_15_0= rulepragmaList ) ) ) ;
    public final EObject ruleobjectFunctionDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_serviceVisibility_0_0 = null;

        EObject lv_serviceType_1_0 = null;

        EObject lv_domainName_3_0 = null;

        EObject lv_objectName_5_0 = null;

        EObject lv_serviceName_7_0 = null;

        EObject lv_parameterList_8_0 = null;

        EObject lv_returnType_10_0 = null;

        EObject lv_codeBlock_12_0 = null;

        EObject lv_pragmaList_15_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:2593:2: ( ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ( (lv_serviceType_1_0= ruleserviceType ) ) ruleFUNCTION ( (lv_domainName_3_0= ruledomainName ) ) ruleSCOPE ( (lv_objectName_5_0= ruleobjectName ) ) ruleDOT ( (lv_serviceName_7_0= ruleserviceName ) ) ( (lv_parameterList_8_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_10_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_12_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pragmaList_15_0= rulepragmaList ) ) ) )
            // InternalMasl.g:2594:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ( (lv_serviceType_1_0= ruleserviceType ) ) ruleFUNCTION ( (lv_domainName_3_0= ruledomainName ) ) ruleSCOPE ( (lv_objectName_5_0= ruleobjectName ) ) ruleDOT ( (lv_serviceName_7_0= ruleserviceName ) ) ( (lv_parameterList_8_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_10_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_12_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pragmaList_15_0= rulepragmaList ) ) )
            {
            // InternalMasl.g:2594:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ( (lv_serviceType_1_0= ruleserviceType ) ) ruleFUNCTION ( (lv_domainName_3_0= ruledomainName ) ) ruleSCOPE ( (lv_objectName_5_0= ruleobjectName ) ) ruleDOT ( (lv_serviceName_7_0= ruleserviceName ) ) ( (lv_parameterList_8_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_10_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_12_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pragmaList_15_0= rulepragmaList ) ) )
            // InternalMasl.g:2595:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ( (lv_serviceType_1_0= ruleserviceType ) ) ruleFUNCTION ( (lv_domainName_3_0= ruledomainName ) ) ruleSCOPE ( (lv_objectName_5_0= ruleobjectName ) ) ruleDOT ( (lv_serviceName_7_0= ruleserviceName ) ) ( (lv_parameterList_8_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_10_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_12_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pragmaList_15_0= rulepragmaList ) )
            {
            // InternalMasl.g:2595:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) )
            // InternalMasl.g:2596:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            {
            // InternalMasl.g:2596:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            // InternalMasl.g:2597:5: lv_serviceVisibility_0_0= ruleserviceVisibility
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getServiceVisibilityServiceVisibilityParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_serviceVisibility_0_0=ruleserviceVisibility();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"serviceVisibility",
              						lv_serviceVisibility_0_0,
              						"org.xtuml.bp.xtext.Masl.serviceVisibility");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:2614:3: ( (lv_serviceType_1_0= ruleserviceType ) )
            // InternalMasl.g:2615:4: (lv_serviceType_1_0= ruleserviceType )
            {
            // InternalMasl.g:2615:4: (lv_serviceType_1_0= ruleserviceType )
            // InternalMasl.g:2616:5: lv_serviceType_1_0= ruleserviceType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getServiceTypeServiceTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_serviceType_1_0=ruleserviceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"serviceType",
              						lv_serviceType_1_0,
              						"org.xtuml.bp.xtext.Masl.serviceType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getFUNCTIONParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_4);
            ruleFUNCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2640:3: ( (lv_domainName_3_0= ruledomainName ) )
            // InternalMasl.g:2641:4: (lv_domainName_3_0= ruledomainName )
            {
            // InternalMasl.g:2641:4: (lv_domainName_3_0= ruledomainName )
            // InternalMasl.g:2642:5: lv_domainName_3_0= ruledomainName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getDomainNameDomainNameParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_domainName_3_0=ruledomainName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"domainName",
              						lv_domainName_3_0,
              						"org.xtuml.bp.xtext.Masl.domainName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getSCOPEParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_4);
            ruleSCOPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2666:3: ( (lv_objectName_5_0= ruleobjectName ) )
            // InternalMasl.g:2667:4: (lv_objectName_5_0= ruleobjectName )
            {
            // InternalMasl.g:2667:4: (lv_objectName_5_0= ruleobjectName )
            // InternalMasl.g:2668:5: lv_objectName_5_0= ruleobjectName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getObjectNameObjectNameParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_objectName_5_0=ruleobjectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"objectName",
              						lv_objectName_5_0,
              						"org.xtuml.bp.xtext.Masl.objectName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getDOTParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_4);
            ruleDOT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2692:3: ( (lv_serviceName_7_0= ruleserviceName ) )
            // InternalMasl.g:2693:4: (lv_serviceName_7_0= ruleserviceName )
            {
            // InternalMasl.g:2693:4: (lv_serviceName_7_0= ruleserviceName )
            // InternalMasl.g:2694:5: lv_serviceName_7_0= ruleserviceName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getServiceNameServiceNameParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_serviceName_7_0=ruleserviceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"serviceName",
              						lv_serviceName_7_0,
              						"org.xtuml.bp.xtext.Masl.serviceName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:2711:3: ( (lv_parameterList_8_0= ruleparameterList ) )
            // InternalMasl.g:2712:4: (lv_parameterList_8_0= ruleparameterList )
            {
            // InternalMasl.g:2712:4: (lv_parameterList_8_0= ruleparameterList )
            // InternalMasl.g:2713:5: lv_parameterList_8_0= ruleparameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getParameterListParameterListParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_parameterList_8_0=ruleparameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"parameterList",
              						lv_parameterList_8_0,
              						"org.xtuml.bp.xtext.Masl.parameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getRETURNParserRuleCall_9());
              		
            }
            pushFollow(FOLLOW_17);
            ruleRETURN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2737:3: ( (lv_returnType_10_0= rulereturnType ) )
            // InternalMasl.g:2738:4: (lv_returnType_10_0= rulereturnType )
            {
            // InternalMasl.g:2738:4: (lv_returnType_10_0= rulereturnType )
            // InternalMasl.g:2739:5: lv_returnType_10_0= rulereturnType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getReturnTypeReturnTypeParserRuleCall_10_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_returnType_10_0=rulereturnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_10_0,
              						"org.xtuml.bp.xtext.Masl.returnType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getISParserRuleCall_11());
              		
            }
            pushFollow(FOLLOW_28);
            ruleIS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2763:3: ( (lv_codeBlock_12_0= rulecodeBlock ) )
            // InternalMasl.g:2764:4: (lv_codeBlock_12_0= rulecodeBlock )
            {
            // InternalMasl.g:2764:4: (lv_codeBlock_12_0= rulecodeBlock )
            // InternalMasl.g:2765:5: lv_codeBlock_12_0= rulecodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getCodeBlockCodeBlockParserRuleCall_12_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_codeBlock_12_0=rulecodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"codeBlock",
              						lv_codeBlock_12_0,
              						"org.xtuml.bp.xtext.Masl.codeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:2782:3: ( ruleFUNCTION )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMasl.g:2783:4: ruleFUNCTION
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getFUNCTIONParserRuleCall_13());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    ruleFUNCTION();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getSEMIParserRuleCall_14());
              		
            }
            pushFollow(FOLLOW_8);
            ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2798:3: ( (lv_pragmaList_15_0= rulepragmaList ) )
            // InternalMasl.g:2799:4: (lv_pragmaList_15_0= rulepragmaList )
            {
            // InternalMasl.g:2799:4: (lv_pragmaList_15_0= rulepragmaList )
            // InternalMasl.g:2800:5: lv_pragmaList_15_0= rulepragmaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectFunctionDefinitionAccess().getPragmaListPragmaListParserRuleCall_15_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pragmaList_15_0=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"pragmaList",
              						lv_pragmaList_15_0,
              						"org.xtuml.bp.xtext.Masl.pragmaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleobjectFunctionDefinition"


    // $ANTLR start "entryRuleterminatorServiceDefinition"
    // InternalMasl.g:2821:1: entryRuleterminatorServiceDefinition returns [EObject current=null] : iv_ruleterminatorServiceDefinition= ruleterminatorServiceDefinition EOF ;
    public final EObject entryRuleterminatorServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterminatorServiceDefinition = null;


        try {
            // InternalMasl.g:2821:68: (iv_ruleterminatorServiceDefinition= ruleterminatorServiceDefinition EOF )
            // InternalMasl.g:2822:2: iv_ruleterminatorServiceDefinition= ruleterminatorServiceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminatorServiceDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleterminatorServiceDefinition=ruleterminatorServiceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleterminatorServiceDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterminatorServiceDefinition"


    // $ANTLR start "ruleterminatorServiceDefinition"
    // InternalMasl.g:2828:1: ruleterminatorServiceDefinition returns [EObject current=null] : ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_terminatorName_4_0= ruleterminatorName ) ) ruleTERMINATOR_SCOPE ( (lv_serviceName_6_0= ruleserviceName ) ) ( (lv_parameterList_7_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_9_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pragmaList_12_0= rulepragmaList ) ) ) ;
    public final EObject ruleterminatorServiceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_serviceVisibility_0_0 = null;

        EObject lv_domainName_2_0 = null;

        EObject lv_terminatorName_4_0 = null;

        EObject lv_serviceName_6_0 = null;

        EObject lv_parameterList_7_0 = null;

        EObject lv_codeBlock_9_0 = null;

        EObject lv_pragmaList_12_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:2834:2: ( ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_terminatorName_4_0= ruleterminatorName ) ) ruleTERMINATOR_SCOPE ( (lv_serviceName_6_0= ruleserviceName ) ) ( (lv_parameterList_7_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_9_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pragmaList_12_0= rulepragmaList ) ) ) )
            // InternalMasl.g:2835:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_terminatorName_4_0= ruleterminatorName ) ) ruleTERMINATOR_SCOPE ( (lv_serviceName_6_0= ruleserviceName ) ) ( (lv_parameterList_7_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_9_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pragmaList_12_0= rulepragmaList ) ) )
            {
            // InternalMasl.g:2835:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_terminatorName_4_0= ruleterminatorName ) ) ruleTERMINATOR_SCOPE ( (lv_serviceName_6_0= ruleserviceName ) ) ( (lv_parameterList_7_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_9_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pragmaList_12_0= rulepragmaList ) ) )
            // InternalMasl.g:2836:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleSERVICE ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_terminatorName_4_0= ruleterminatorName ) ) ruleTERMINATOR_SCOPE ( (lv_serviceName_6_0= ruleserviceName ) ) ( (lv_parameterList_7_0= ruleparameterList ) ) ruleIS ( (lv_codeBlock_9_0= rulecodeBlock ) ) ( ruleSERVICE )? ruleSEMI ( (lv_pragmaList_12_0= rulepragmaList ) )
            {
            // InternalMasl.g:2836:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) )
            // InternalMasl.g:2837:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            {
            // InternalMasl.g:2837:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            // InternalMasl.g:2838:5: lv_serviceVisibility_0_0= ruleserviceVisibility
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getServiceVisibilityServiceVisibilityParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_serviceVisibility_0_0=ruleserviceVisibility();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorServiceDefinitionRule());
              					}
              					set(
              						current,
              						"serviceVisibility",
              						lv_serviceVisibility_0_0,
              						"org.xtuml.bp.xtext.Masl.serviceVisibility");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getSERVICEParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            ruleSERVICE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2862:3: ( (lv_domainName_2_0= ruledomainName ) )
            // InternalMasl.g:2863:4: (lv_domainName_2_0= ruledomainName )
            {
            // InternalMasl.g:2863:4: (lv_domainName_2_0= ruledomainName )
            // InternalMasl.g:2864:5: lv_domainName_2_0= ruledomainName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getDomainNameDomainNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_domainName_2_0=ruledomainName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorServiceDefinitionRule());
              					}
              					set(
              						current,
              						"domainName",
              						lv_domainName_2_0,
              						"org.xtuml.bp.xtext.Masl.domainName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getSCOPEParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            ruleSCOPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2888:3: ( (lv_terminatorName_4_0= ruleterminatorName ) )
            // InternalMasl.g:2889:4: (lv_terminatorName_4_0= ruleterminatorName )
            {
            // InternalMasl.g:2889:4: (lv_terminatorName_4_0= ruleterminatorName )
            // InternalMasl.g:2890:5: lv_terminatorName_4_0= ruleterminatorName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getTerminatorNameTerminatorNameParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_34);
            lv_terminatorName_4_0=ruleterminatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorServiceDefinitionRule());
              					}
              					set(
              						current,
              						"terminatorName",
              						lv_terminatorName_4_0,
              						"org.xtuml.bp.xtext.Masl.terminatorName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getTERMINATOR_SCOPEParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_4);
            ruleTERMINATOR_SCOPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2914:3: ( (lv_serviceName_6_0= ruleserviceName ) )
            // InternalMasl.g:2915:4: (lv_serviceName_6_0= ruleserviceName )
            {
            // InternalMasl.g:2915:4: (lv_serviceName_6_0= ruleserviceName )
            // InternalMasl.g:2916:5: lv_serviceName_6_0= ruleserviceName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getServiceNameServiceNameParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_serviceName_6_0=ruleserviceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorServiceDefinitionRule());
              					}
              					set(
              						current,
              						"serviceName",
              						lv_serviceName_6_0,
              						"org.xtuml.bp.xtext.Masl.serviceName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:2933:3: ( (lv_parameterList_7_0= ruleparameterList ) )
            // InternalMasl.g:2934:4: (lv_parameterList_7_0= ruleparameterList )
            {
            // InternalMasl.g:2934:4: (lv_parameterList_7_0= ruleparameterList )
            // InternalMasl.g:2935:5: lv_parameterList_7_0= ruleparameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getParameterListParameterListParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_parameterList_7_0=ruleparameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorServiceDefinitionRule());
              					}
              					set(
              						current,
              						"parameterList",
              						lv_parameterList_7_0,
              						"org.xtuml.bp.xtext.Masl.parameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getISParserRuleCall_8());
              		
            }
            pushFollow(FOLLOW_28);
            ruleIS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2959:3: ( (lv_codeBlock_9_0= rulecodeBlock ) )
            // InternalMasl.g:2960:4: (lv_codeBlock_9_0= rulecodeBlock )
            {
            // InternalMasl.g:2960:4: (lv_codeBlock_9_0= rulecodeBlock )
            // InternalMasl.g:2961:5: lv_codeBlock_9_0= rulecodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getCodeBlockCodeBlockParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_codeBlock_9_0=rulecodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorServiceDefinitionRule());
              					}
              					set(
              						current,
              						"codeBlock",
              						lv_codeBlock_9_0,
              						"org.xtuml.bp.xtext.Masl.codeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:2978:3: ( ruleSERVICE )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMasl.g:2979:4: ruleSERVICE
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getSERVICEParserRuleCall_10());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    ruleSERVICE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getSEMIParserRuleCall_11());
              		
            }
            pushFollow(FOLLOW_8);
            ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:2994:3: ( (lv_pragmaList_12_0= rulepragmaList ) )
            // InternalMasl.g:2995:4: (lv_pragmaList_12_0= rulepragmaList )
            {
            // InternalMasl.g:2995:4: (lv_pragmaList_12_0= rulepragmaList )
            // InternalMasl.g:2996:5: lv_pragmaList_12_0= rulepragmaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorServiceDefinitionAccess().getPragmaListPragmaListParserRuleCall_12_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pragmaList_12_0=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorServiceDefinitionRule());
              					}
              					set(
              						current,
              						"pragmaList",
              						lv_pragmaList_12_0,
              						"org.xtuml.bp.xtext.Masl.pragmaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterminatorServiceDefinition"


    // $ANTLR start "entryRuleterminatorFunctionDefinition"
    // InternalMasl.g:3017:1: entryRuleterminatorFunctionDefinition returns [EObject current=null] : iv_ruleterminatorFunctionDefinition= ruleterminatorFunctionDefinition EOF ;
    public final EObject entryRuleterminatorFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterminatorFunctionDefinition = null;


        try {
            // InternalMasl.g:3017:69: (iv_ruleterminatorFunctionDefinition= ruleterminatorFunctionDefinition EOF )
            // InternalMasl.g:3018:2: iv_ruleterminatorFunctionDefinition= ruleterminatorFunctionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleterminatorFunctionDefinition=ruleterminatorFunctionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleterminatorFunctionDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterminatorFunctionDefinition"


    // $ANTLR start "ruleterminatorFunctionDefinition"
    // InternalMasl.g:3024:1: ruleterminatorFunctionDefinition returns [EObject current=null] : ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_terminatorName_4_0= ruleterminatorName ) ) ruleTERMINATOR_SCOPE ( (lv_serviceName_6_0= ruleserviceName ) ) ( (lv_parameterList_7_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_9_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_11_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pragmaList_14_0= rulepragmaList ) ) ) ;
    public final EObject ruleterminatorFunctionDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_serviceVisibility_0_0 = null;

        EObject lv_domainName_2_0 = null;

        EObject lv_terminatorName_4_0 = null;

        EObject lv_serviceName_6_0 = null;

        EObject lv_parameterList_7_0 = null;

        EObject lv_returnType_9_0 = null;

        EObject lv_codeBlock_11_0 = null;

        EObject lv_pragmaList_14_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:3030:2: ( ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_terminatorName_4_0= ruleterminatorName ) ) ruleTERMINATOR_SCOPE ( (lv_serviceName_6_0= ruleserviceName ) ) ( (lv_parameterList_7_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_9_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_11_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pragmaList_14_0= rulepragmaList ) ) ) )
            // InternalMasl.g:3031:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_terminatorName_4_0= ruleterminatorName ) ) ruleTERMINATOR_SCOPE ( (lv_serviceName_6_0= ruleserviceName ) ) ( (lv_parameterList_7_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_9_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_11_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pragmaList_14_0= rulepragmaList ) ) )
            {
            // InternalMasl.g:3031:2: ( ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_terminatorName_4_0= ruleterminatorName ) ) ruleTERMINATOR_SCOPE ( (lv_serviceName_6_0= ruleserviceName ) ) ( (lv_parameterList_7_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_9_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_11_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pragmaList_14_0= rulepragmaList ) ) )
            // InternalMasl.g:3032:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) ) ruleFUNCTION ( (lv_domainName_2_0= ruledomainName ) ) ruleSCOPE ( (lv_terminatorName_4_0= ruleterminatorName ) ) ruleTERMINATOR_SCOPE ( (lv_serviceName_6_0= ruleserviceName ) ) ( (lv_parameterList_7_0= ruleparameterList ) ) ruleRETURN ( (lv_returnType_9_0= rulereturnType ) ) ruleIS ( (lv_codeBlock_11_0= rulecodeBlock ) ) ( ruleFUNCTION )? ruleSEMI ( (lv_pragmaList_14_0= rulepragmaList ) )
            {
            // InternalMasl.g:3032:3: ( (lv_serviceVisibility_0_0= ruleserviceVisibility ) )
            // InternalMasl.g:3033:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            {
            // InternalMasl.g:3033:4: (lv_serviceVisibility_0_0= ruleserviceVisibility )
            // InternalMasl.g:3034:5: lv_serviceVisibility_0_0= ruleserviceVisibility
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getServiceVisibilityServiceVisibilityParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_serviceVisibility_0_0=ruleserviceVisibility();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"serviceVisibility",
              						lv_serviceVisibility_0_0,
              						"org.xtuml.bp.xtext.Masl.serviceVisibility");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getFUNCTIONParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            ruleFUNCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:3058:3: ( (lv_domainName_2_0= ruledomainName ) )
            // InternalMasl.g:3059:4: (lv_domainName_2_0= ruledomainName )
            {
            // InternalMasl.g:3059:4: (lv_domainName_2_0= ruledomainName )
            // InternalMasl.g:3060:5: lv_domainName_2_0= ruledomainName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getDomainNameDomainNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_domainName_2_0=ruledomainName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"domainName",
              						lv_domainName_2_0,
              						"org.xtuml.bp.xtext.Masl.domainName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getSCOPEParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            ruleSCOPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:3084:3: ( (lv_terminatorName_4_0= ruleterminatorName ) )
            // InternalMasl.g:3085:4: (lv_terminatorName_4_0= ruleterminatorName )
            {
            // InternalMasl.g:3085:4: (lv_terminatorName_4_0= ruleterminatorName )
            // InternalMasl.g:3086:5: lv_terminatorName_4_0= ruleterminatorName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getTerminatorNameTerminatorNameParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_34);
            lv_terminatorName_4_0=ruleterminatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"terminatorName",
              						lv_terminatorName_4_0,
              						"org.xtuml.bp.xtext.Masl.terminatorName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getTERMINATOR_SCOPEParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_4);
            ruleTERMINATOR_SCOPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:3110:3: ( (lv_serviceName_6_0= ruleserviceName ) )
            // InternalMasl.g:3111:4: (lv_serviceName_6_0= ruleserviceName )
            {
            // InternalMasl.g:3111:4: (lv_serviceName_6_0= ruleserviceName )
            // InternalMasl.g:3112:5: lv_serviceName_6_0= ruleserviceName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getServiceNameServiceNameParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_serviceName_6_0=ruleserviceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"serviceName",
              						lv_serviceName_6_0,
              						"org.xtuml.bp.xtext.Masl.serviceName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:3129:3: ( (lv_parameterList_7_0= ruleparameterList ) )
            // InternalMasl.g:3130:4: (lv_parameterList_7_0= ruleparameterList )
            {
            // InternalMasl.g:3130:4: (lv_parameterList_7_0= ruleparameterList )
            // InternalMasl.g:3131:5: lv_parameterList_7_0= ruleparameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getParameterListParameterListParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_parameterList_7_0=ruleparameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"parameterList",
              						lv_parameterList_7_0,
              						"org.xtuml.bp.xtext.Masl.parameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getRETURNParserRuleCall_8());
              		
            }
            pushFollow(FOLLOW_17);
            ruleRETURN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:3155:3: ( (lv_returnType_9_0= rulereturnType ) )
            // InternalMasl.g:3156:4: (lv_returnType_9_0= rulereturnType )
            {
            // InternalMasl.g:3156:4: (lv_returnType_9_0= rulereturnType )
            // InternalMasl.g:3157:5: lv_returnType_9_0= rulereturnType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getReturnTypeReturnTypeParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_returnType_9_0=rulereturnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_9_0,
              						"org.xtuml.bp.xtext.Masl.returnType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getISParserRuleCall_10());
              		
            }
            pushFollow(FOLLOW_28);
            ruleIS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:3181:3: ( (lv_codeBlock_11_0= rulecodeBlock ) )
            // InternalMasl.g:3182:4: (lv_codeBlock_11_0= rulecodeBlock )
            {
            // InternalMasl.g:3182:4: (lv_codeBlock_11_0= rulecodeBlock )
            // InternalMasl.g:3183:5: lv_codeBlock_11_0= rulecodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getCodeBlockCodeBlockParserRuleCall_11_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_codeBlock_11_0=rulecodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"codeBlock",
              						lv_codeBlock_11_0,
              						"org.xtuml.bp.xtext.Masl.codeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMasl.g:3200:3: ( ruleFUNCTION )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMasl.g:3201:4: ruleFUNCTION
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getFUNCTIONParserRuleCall_12());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    ruleFUNCTION();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getSEMIParserRuleCall_13());
              		
            }
            pushFollow(FOLLOW_8);
            ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:3216:3: ( (lv_pragmaList_14_0= rulepragmaList ) )
            // InternalMasl.g:3217:4: (lv_pragmaList_14_0= rulepragmaList )
            {
            // InternalMasl.g:3217:4: (lv_pragmaList_14_0= rulepragmaList )
            // InternalMasl.g:3218:5: lv_pragmaList_14_0= rulepragmaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTerminatorFunctionDefinitionAccess().getPragmaListPragmaListParserRuleCall_14_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pragmaList_14_0=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTerminatorFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"pragmaList",
              						lv_pragmaList_14_0,
              						"org.xtuml.bp.xtext.Masl.pragmaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterminatorFunctionDefinition"


    // $ANTLR start "entryRulecodeBlock"
    // InternalMasl.g:3239:1: entryRulecodeBlock returns [EObject current=null] : iv_rulecodeBlock= rulecodeBlock EOF ;
    public final EObject entryRulecodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecodeBlock = null;


        try {
            // InternalMasl.g:3239:50: (iv_rulecodeBlock= rulecodeBlock EOF )
            // InternalMasl.g:3240:2: iv_rulecodeBlock= rulecodeBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecodeBlock=rulecodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecodeBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecodeBlock"


    // $ANTLR start "rulecodeBlock"
    // InternalMasl.g:3246:1: rulecodeBlock returns [EObject current=null] : ( ( (lv_variableDeclaration_0_0= rulevariableDeclaration ) )* ruleBEGIN rulestatementList ruleEND ) ;
    public final EObject rulecodeBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_variableDeclaration_0_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:3252:2: ( ( ( (lv_variableDeclaration_0_0= rulevariableDeclaration ) )* ruleBEGIN rulestatementList ruleEND ) )
            // InternalMasl.g:3253:2: ( ( (lv_variableDeclaration_0_0= rulevariableDeclaration ) )* ruleBEGIN rulestatementList ruleEND )
            {
            // InternalMasl.g:3253:2: ( ( (lv_variableDeclaration_0_0= rulevariableDeclaration ) )* ruleBEGIN rulestatementList ruleEND )
            // InternalMasl.g:3254:3: ( (lv_variableDeclaration_0_0= rulevariableDeclaration ) )* ruleBEGIN rulestatementList ruleEND
            {
            // InternalMasl.g:3254:3: ( (lv_variableDeclaration_0_0= rulevariableDeclaration ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMasl.g:3255:4: (lv_variableDeclaration_0_0= rulevariableDeclaration )
            	    {
            	    // InternalMasl.g:3255:4: (lv_variableDeclaration_0_0= rulevariableDeclaration )
            	    // InternalMasl.g:3256:5: lv_variableDeclaration_0_0= rulevariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCodeBlockAccess().getVariableDeclarationVariableDeclarationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_variableDeclaration_0_0=rulevariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCodeBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"variableDeclaration",
            	      						lv_variableDeclaration_0_0,
            	      						"org.xtuml.bp.xtext.Masl.variableDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCodeBlockAccess().getBEGINParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_35);
            ruleBEGIN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCodeBlockAccess().getStatementListParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_6);
            rulestatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCodeBlockAccess().getENDParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecodeBlock"


    // $ANTLR start "entryRulevariableDeclaration"
    // InternalMasl.g:3298:1: entryRulevariableDeclaration returns [EObject current=null] : iv_rulevariableDeclaration= rulevariableDeclaration EOF ;
    public final EObject entryRulevariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariableDeclaration = null;


        try {
            // InternalMasl.g:3298:60: (iv_rulevariableDeclaration= rulevariableDeclaration EOF )
            // InternalMasl.g:3299:2: iv_rulevariableDeclaration= rulevariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariableDeclaration=rulevariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariableDeclaration"


    // $ANTLR start "rulevariableDeclaration"
    // InternalMasl.g:3305:1: rulevariableDeclaration returns [EObject current=null] : ( ( (lv_variableName_0_0= rulevariableName ) ) ruleCOLON ( (lv_READONLY_2_0= ruleREADONLY ) )? ( (lv_typeReferenceWithCA_3_0= ruletypeReference ) ) ruleSEMI ( (lv_pragmaList_5_0= rulepragmaList ) ) ) ;
    public final EObject rulevariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_variableName_0_0 = null;

        AntlrDatatypeRuleToken lv_READONLY_2_0 = null;

        EObject lv_typeReferenceWithCA_3_0 = null;

        EObject lv_pragmaList_5_0 = null;



        	enterRule();

        try {
            // InternalMasl.g:3311:2: ( ( ( (lv_variableName_0_0= rulevariableName ) ) ruleCOLON ( (lv_READONLY_2_0= ruleREADONLY ) )? ( (lv_typeReferenceWithCA_3_0= ruletypeReference ) ) ruleSEMI ( (lv_pragmaList_5_0= rulepragmaList ) ) ) )
            // InternalMasl.g:3312:2: ( ( (lv_variableName_0_0= rulevariableName ) ) ruleCOLON ( (lv_READONLY_2_0= ruleREADONLY ) )? ( (lv_typeReferenceWithCA_3_0= ruletypeReference ) ) ruleSEMI ( (lv_pragmaList_5_0= rulepragmaList ) ) )
            {
            // InternalMasl.g:3312:2: ( ( (lv_variableName_0_0= rulevariableName ) ) ruleCOLON ( (lv_READONLY_2_0= ruleREADONLY ) )? ( (lv_typeReferenceWithCA_3_0= ruletypeReference ) ) ruleSEMI ( (lv_pragmaList_5_0= rulepragmaList ) ) )
            // InternalMasl.g:3313:3: ( (lv_variableName_0_0= rulevariableName ) ) ruleCOLON ( (lv_READONLY_2_0= ruleREADONLY ) )? ( (lv_typeReferenceWithCA_3_0= ruletypeReference ) ) ruleSEMI ( (lv_pragmaList_5_0= rulepragmaList ) )
            {
            // InternalMasl.g:3313:3: ( (lv_variableName_0_0= rulevariableName ) )
            // InternalMasl.g:3314:4: (lv_variableName_0_0= rulevariableName )
            {
            // InternalMasl.g:3314:4: (lv_variableName_0_0= rulevariableName )
            // InternalMasl.g:3315:5: lv_variableName_0_0= rulevariableName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableNameVariableNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_variableName_0_0=rulevariableName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              					}
              					set(
              						current,
              						"variableName",
              						lv_variableName_0_0,
              						"org.xtuml.bp.xtext.Masl.variableName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVariableDeclarationAccess().getCOLONParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_36);
            ruleCOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:3339:3: ( (lv_READONLY_2_0= ruleREADONLY ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMasl.g:3340:4: (lv_READONLY_2_0= ruleREADONLY )
                    {
                    // InternalMasl.g:3340:4: (lv_READONLY_2_0= ruleREADONLY )
                    // InternalMasl.g:3341:5: lv_READONLY_2_0= ruleREADONLY
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getREADONLYREADONLYParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_READONLY_2_0=ruleREADONLY();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      					}
                      					set(
                      						current,
                      						"READONLY",
                      						lv_READONLY_2_0,
                      						"org.xtuml.bp.xtext.Masl.READONLY");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMasl.g:3358:3: ( (lv_typeReferenceWithCA_3_0= ruletypeReference ) )
            // InternalMasl.g:3359:4: (lv_typeReferenceWithCA_3_0= ruletypeReference )
            {
            // InternalMasl.g:3359:4: (lv_typeReferenceWithCA_3_0= ruletypeReference )
            // InternalMasl.g:3360:5: lv_typeReferenceWithCA_3_0= ruletypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeReferenceWithCATypeReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_typeReferenceWithCA_3_0=ruletypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              					}
              					set(
              						current,
              						"typeReferenceWithCA",
              						lv_typeReferenceWithCA_3_0,
              						"org.xtuml.bp.xtext.Masl.typeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVariableDeclarationAccess().getSEMIParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_8);
            ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMasl.g:3384:3: ( (lv_pragmaList_5_0= rulepragmaList ) )
            // InternalMasl.g:3385:4: (lv_pragmaList_5_0= rulepragmaList )
            {
            // InternalMasl.g:3385:4: (lv_pragmaList_5_0= rulepragmaList )
            // InternalMasl.g:3386:5: lv_pragmaList_5_0= rulepragmaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getPragmaListPragmaListParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pragmaList_5_0=rulepragmaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              					}
              					set(
              						current,
              						"pragmaList",
              						lv_pragmaList_5_0,
              						"org.xtuml.bp.xtext.Masl.pragmaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariableDeclaration"


    // $ANTLR start "entryRulevariableName"
    // InternalMasl.g:3407:1: entryRulevariableName returns [EObject current=null] : iv_rulevariableName= rulevariableName EOF ;
    public final EObject entryRulevariableName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariableName = null;


        try {
            // InternalMasl.g:3407:53: (iv_rulevariableName= rulevariableName EOF )
            // InternalMasl.g:3408:2: iv_rulevariableName= rulevariableName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariableName=rulevariableName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariableName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariableName"


    // $ANTLR start "rulevariableName"
    // InternalMasl.g:3414:1: rulevariableName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject rulevariableName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMasl.g:3420:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalMasl.g:3421:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalMasl.g:3421:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMasl.g:3422:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMasl.g:3422:3: (lv_identifier_0_0= RULE_ID )
            // InternalMasl.g:3423:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_identifier_0_0, grammarAccess.getVariableNameAccess().getIdentifierIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVariableNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariableName"


    // $ANTLR start "entryRulestatementList"
    // InternalMasl.g:3442:1: entryRulestatementList returns [String current=null] : iv_rulestatementList= rulestatementList EOF ;
    public final String entryRulestatementList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatementList = null;


        try {
            // InternalMasl.g:3442:53: (iv_rulestatementList= rulestatementList EOF )
            // InternalMasl.g:3443:2: iv_rulestatementList= rulestatementList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatementList=rulestatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatementList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatementList"


    // $ANTLR start "rulestatementList"
    // InternalMasl.g:3449:1: rulestatementList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER ) )=> (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | this_ANY_OTHER_4= RULE_ANY_OTHER ) )* ;
    public final AntlrDatatypeRuleToken rulestatementList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token this_ANY_OTHER_4=null;


        	enterRule();

        try {
            // InternalMasl.g:3455:2: ( ( ( ( RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER ) )=> (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | this_ANY_OTHER_4= RULE_ANY_OTHER ) )* )
            // InternalMasl.g:3456:2: ( ( ( RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER ) )=> (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | this_ANY_OTHER_4= RULE_ANY_OTHER ) )*
            {
            // InternalMasl.g:3456:2: ( ( ( RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER ) )=> (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | this_ANY_OTHER_4= RULE_ANY_OTHER ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) && (synpred1_InternalMasl())) {
                    alt35=1;
                }
                else if ( (LA35_0==RULE_INT) && (synpred1_InternalMasl())) {
                    alt35=1;
                }
                else if ( (LA35_0==RULE_STRING) && (synpred1_InternalMasl())) {
                    alt35=1;
                }
                else if ( (LA35_0==RULE_WS) && (synpred1_InternalMasl())) {
                    alt35=1;
                }
                else if ( (LA35_0==RULE_ANY_OTHER) && (synpred1_InternalMasl())) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMasl.g:3457:3: ( ( RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER ) )=> (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | this_ANY_OTHER_4= RULE_ANY_OTHER )
            	    {
            	    // InternalMasl.g:3469:3: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | this_ANY_OTHER_4= RULE_ANY_OTHER )
            	    int alt34=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case RULE_INT:
            	        {
            	        alt34=2;
            	        }
            	        break;
            	    case RULE_STRING:
            	        {
            	        alt34=3;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt34=4;
            	        }
            	        break;
            	    case RULE_ANY_OTHER:
            	        {
            	        alt34=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt34) {
            	        case 1 :
            	            // InternalMasl.g:3470:4: this_ID_0= RULE_ID
            	            {
            	            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				current.merge(this_ID_0);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(this_ID_0, grammarAccess.getStatementListAccess().getIDTerminalRuleCall_0_0());
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMasl.g:3478:4: this_INT_1= RULE_INT
            	            {
            	            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_37); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				current.merge(this_INT_1);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(this_INT_1, grammarAccess.getStatementListAccess().getINTTerminalRuleCall_0_1());
            	              			
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMasl.g:3486:4: this_STRING_2= RULE_STRING
            	            {
            	            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_37); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				current.merge(this_STRING_2);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(this_STRING_2, grammarAccess.getStatementListAccess().getSTRINGTerminalRuleCall_0_2());
            	              			
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalMasl.g:3494:4: this_WS_3= RULE_WS
            	            {
            	            this_WS_3=(Token)match(input,RULE_WS,FOLLOW_37); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				current.merge(this_WS_3);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(this_WS_3, grammarAccess.getStatementListAccess().getWSTerminalRuleCall_0_3());
            	              			
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalMasl.g:3502:4: this_ANY_OTHER_4= RULE_ANY_OTHER
            	            {
            	            this_ANY_OTHER_4=(Token)match(input,RULE_ANY_OTHER,FOLLOW_37); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				current.merge(this_ANY_OTHER_4);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(this_ANY_OTHER_4, grammarAccess.getStatementListAccess().getANY_OTHERTerminalRuleCall_0_4());
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatementList"


    // $ANTLR start "entryRuleANONYMOUS"
    // InternalMasl.g:3514:1: entryRuleANONYMOUS returns [String current=null] : iv_ruleANONYMOUS= ruleANONYMOUS EOF ;
    public final String entryRuleANONYMOUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANONYMOUS = null;


        try {
            // InternalMasl.g:3514:49: (iv_ruleANONYMOUS= ruleANONYMOUS EOF )
            // InternalMasl.g:3515:2: iv_ruleANONYMOUS= ruleANONYMOUS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getANONYMOUSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleANONYMOUS=ruleANONYMOUS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleANONYMOUS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleANONYMOUS"


    // $ANTLR start "ruleANONYMOUS"
    // InternalMasl.g:3521:1: ruleANONYMOUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'anonymous' ;
    public final AntlrDatatypeRuleToken ruleANONYMOUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3527:2: (kw= 'anonymous' )
            // InternalMasl.g:3528:2: kw= 'anonymous'
            {
            kw=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getANONYMOUSAccess().getAnonymousKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleANONYMOUS"


    // $ANTLR start "entryRuleBEGIN"
    // InternalMasl.g:3536:1: entryRuleBEGIN returns [String current=null] : iv_ruleBEGIN= ruleBEGIN EOF ;
    public final String entryRuleBEGIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBEGIN = null;


        try {
            // InternalMasl.g:3536:45: (iv_ruleBEGIN= ruleBEGIN EOF )
            // InternalMasl.g:3537:2: iv_ruleBEGIN= ruleBEGIN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBEGINRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBEGIN=ruleBEGIN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBEGIN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBEGIN"


    // $ANTLR start "ruleBEGIN"
    // InternalMasl.g:3543:1: ruleBEGIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'begin' ;
    public final AntlrDatatypeRuleToken ruleBEGIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3549:2: (kw= 'begin' )
            // InternalMasl.g:3550:2: kw= 'begin'
            {
            kw=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getBEGINAccess().getBeginKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBEGIN"


    // $ANTLR start "entryRuleCOLON"
    // InternalMasl.g:3558:1: entryRuleCOLON returns [String current=null] : iv_ruleCOLON= ruleCOLON EOF ;
    public final String entryRuleCOLON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOLON = null;


        try {
            // InternalMasl.g:3558:45: (iv_ruleCOLON= ruleCOLON EOF )
            // InternalMasl.g:3559:2: iv_ruleCOLON= ruleCOLON EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCOLONRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCOLON=ruleCOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCOLON.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOLON"


    // $ANTLR start "ruleCOLON"
    // InternalMasl.g:3565:1: ruleCOLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':' ;
    public final AntlrDatatypeRuleToken ruleCOLON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3571:2: (kw= ':' )
            // InternalMasl.g:3572:2: kw= ':'
            {
            kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCOLONAccess().getColonKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOLON"


    // $ANTLR start "entryRuleCOMMA"
    // InternalMasl.g:3580:1: entryRuleCOMMA returns [String current=null] : iv_ruleCOMMA= ruleCOMMA EOF ;
    public final String entryRuleCOMMA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMMA = null;


        try {
            // InternalMasl.g:3580:45: (iv_ruleCOMMA= ruleCOMMA EOF )
            // InternalMasl.g:3581:2: iv_ruleCOMMA= ruleCOMMA EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCOMMARule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCOMMA=ruleCOMMA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCOMMA.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOMMA"


    // $ANTLR start "ruleCOMMA"
    // InternalMasl.g:3587:1: ruleCOMMA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken ruleCOMMA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3593:2: (kw= ',' )
            // InternalMasl.g:3594:2: kw= ','
            {
            kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCOMMAAccess().getCommaKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOMMA"


    // $ANTLR start "entryRuleDEFERRED"
    // InternalMasl.g:3602:1: entryRuleDEFERRED returns [String current=null] : iv_ruleDEFERRED= ruleDEFERRED EOF ;
    public final String entryRuleDEFERRED() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDEFERRED = null;


        try {
            // InternalMasl.g:3602:48: (iv_ruleDEFERRED= ruleDEFERRED EOF )
            // InternalMasl.g:3603:2: iv_ruleDEFERRED= ruleDEFERRED EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDEFERREDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDEFERRED=ruleDEFERRED();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDEFERRED.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDEFERRED"


    // $ANTLR start "ruleDEFERRED"
    // InternalMasl.g:3609:1: ruleDEFERRED returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'deferred' ;
    public final AntlrDatatypeRuleToken ruleDEFERRED() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3615:2: (kw= 'deferred' )
            // InternalMasl.g:3616:2: kw= 'deferred'
            {
            kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDEFERREDAccess().getDeferredKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDEFERRED"


    // $ANTLR start "entryRuleDOMAIN"
    // InternalMasl.g:3624:1: entryRuleDOMAIN returns [String current=null] : iv_ruleDOMAIN= ruleDOMAIN EOF ;
    public final String entryRuleDOMAIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMAIN = null;


        try {
            // InternalMasl.g:3624:46: (iv_ruleDOMAIN= ruleDOMAIN EOF )
            // InternalMasl.g:3625:2: iv_ruleDOMAIN= ruleDOMAIN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDOMAINRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDOMAIN=ruleDOMAIN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDOMAIN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOMAIN"


    // $ANTLR start "ruleDOMAIN"
    // InternalMasl.g:3631:1: ruleDOMAIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'domain' ;
    public final AntlrDatatypeRuleToken ruleDOMAIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3637:2: (kw= 'domain' )
            // InternalMasl.g:3638:2: kw= 'domain'
            {
            kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDOMAINAccess().getDomainKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOMAIN"


    // $ANTLR start "entryRuleDOT"
    // InternalMasl.g:3646:1: entryRuleDOT returns [String current=null] : iv_ruleDOT= ruleDOT EOF ;
    public final String entryRuleDOT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOT = null;


        try {
            // InternalMasl.g:3646:43: (iv_ruleDOT= ruleDOT EOF )
            // InternalMasl.g:3647:2: iv_ruleDOT= ruleDOT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDOTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDOT=ruleDOT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDOT.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOT"


    // $ANTLR start "ruleDOT"
    // InternalMasl.g:3653:1: ruleDOT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.' ;
    public final AntlrDatatypeRuleToken ruleDOT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3659:2: (kw= '.' )
            // InternalMasl.g:3660:2: kw= '.'
            {
            kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDOTAccess().getFullStopKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOT"


    // $ANTLR start "entryRuleEND"
    // InternalMasl.g:3668:1: entryRuleEND returns [String current=null] : iv_ruleEND= ruleEND EOF ;
    public final String entryRuleEND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEND = null;


        try {
            // InternalMasl.g:3668:43: (iv_ruleEND= ruleEND EOF )
            // InternalMasl.g:3669:2: iv_ruleEND= ruleEND EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEND=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEND.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEND"


    // $ANTLR start "ruleEND"
    // InternalMasl.g:3675:1: ruleEND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'end' ;
    public final AntlrDatatypeRuleToken ruleEND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3681:2: (kw= 'end' )
            // InternalMasl.g:3682:2: kw= 'end'
            {
            kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getENDAccess().getEndKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEND"


    // $ANTLR start "entryRuleEVENT"
    // InternalMasl.g:3690:1: entryRuleEVENT returns [String current=null] : iv_ruleEVENT= ruleEVENT EOF ;
    public final String entryRuleEVENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENT = null;


        try {
            // InternalMasl.g:3690:45: (iv_ruleEVENT= ruleEVENT EOF )
            // InternalMasl.g:3691:2: iv_ruleEVENT= ruleEVENT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEVENTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEVENT=ruleEVENT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEVENT.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEVENT"


    // $ANTLR start "ruleEVENT"
    // InternalMasl.g:3697:1: ruleEVENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'event' ;
    public final AntlrDatatypeRuleToken ruleEVENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3703:2: (kw= 'event' )
            // InternalMasl.g:3704:2: kw= 'event'
            {
            kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getEVENTAccess().getEventKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEVENT"


    // $ANTLR start "entryRuleFUNCTION"
    // InternalMasl.g:3712:1: entryRuleFUNCTION returns [String current=null] : iv_ruleFUNCTION= ruleFUNCTION EOF ;
    public final String entryRuleFUNCTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNCTION = null;


        try {
            // InternalMasl.g:3712:48: (iv_ruleFUNCTION= ruleFUNCTION EOF )
            // InternalMasl.g:3713:2: iv_ruleFUNCTION= ruleFUNCTION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFUNCTIONRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFUNCTION=ruleFUNCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFUNCTION.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFUNCTION"


    // $ANTLR start "ruleFUNCTION"
    // InternalMasl.g:3719:1: ruleFUNCTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'function' ;
    public final AntlrDatatypeRuleToken ruleFUNCTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3725:2: (kw= 'function' )
            // InternalMasl.g:3726:2: kw= 'function'
            {
            kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getFUNCTIONAccess().getFunctionKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFUNCTION"


    // $ANTLR start "entryRuleIN"
    // InternalMasl.g:3734:1: entryRuleIN returns [String current=null] : iv_ruleIN= ruleIN EOF ;
    public final String entryRuleIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIN = null;


        try {
            // InternalMasl.g:3734:42: (iv_ruleIN= ruleIN EOF )
            // InternalMasl.g:3735:2: iv_ruleIN= ruleIN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIN=ruleIN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIN"


    // $ANTLR start "ruleIN"
    // InternalMasl.g:3741:1: ruleIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'in' ;
    public final AntlrDatatypeRuleToken ruleIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3747:2: (kw= 'in' )
            // InternalMasl.g:3748:2: kw= 'in'
            {
            kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getINAccess().getInKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIN"


    // $ANTLR start "entryRuleINSTANCE"
    // InternalMasl.g:3756:1: entryRuleINSTANCE returns [String current=null] : iv_ruleINSTANCE= ruleINSTANCE EOF ;
    public final String entryRuleINSTANCE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINSTANCE = null;


        try {
            // InternalMasl.g:3756:48: (iv_ruleINSTANCE= ruleINSTANCE EOF )
            // InternalMasl.g:3757:2: iv_ruleINSTANCE= ruleINSTANCE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINSTANCERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleINSTANCE=ruleINSTANCE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINSTANCE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINSTANCE"


    // $ANTLR start "ruleINSTANCE"
    // InternalMasl.g:3763:1: ruleINSTANCE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'instance' ;
    public final AntlrDatatypeRuleToken ruleINSTANCE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3769:2: (kw= 'instance' )
            // InternalMasl.g:3770:2: kw= 'instance'
            {
            kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getINSTANCEAccess().getInstanceKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINSTANCE"


    // $ANTLR start "entryRuleIS"
    // InternalMasl.g:3778:1: entryRuleIS returns [String current=null] : iv_ruleIS= ruleIS EOF ;
    public final String entryRuleIS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIS = null;


        try {
            // InternalMasl.g:3778:42: (iv_ruleIS= ruleIS EOF )
            // InternalMasl.g:3779:2: iv_ruleIS= ruleIS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getISRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIS=ruleIS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIS"


    // $ANTLR start "ruleIS"
    // InternalMasl.g:3785:1: ruleIS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'is' ;
    public final AntlrDatatypeRuleToken ruleIS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3791:2: (kw= 'is' )
            // InternalMasl.g:3792:2: kw= 'is'
            {
            kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getISAccess().getIsKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIS"


    // $ANTLR start "entryRuleLPAREN"
    // InternalMasl.g:3800:1: entryRuleLPAREN returns [String current=null] : iv_ruleLPAREN= ruleLPAREN EOF ;
    public final String entryRuleLPAREN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLPAREN = null;


        try {
            // InternalMasl.g:3800:46: (iv_ruleLPAREN= ruleLPAREN EOF )
            // InternalMasl.g:3801:2: iv_ruleLPAREN= ruleLPAREN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLPARENRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLPAREN=ruleLPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLPAREN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLPAREN"


    // $ANTLR start "ruleLPAREN"
    // InternalMasl.g:3807:1: ruleLPAREN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLPAREN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3813:2: (kw= '(' )
            // InternalMasl.g:3814:2: kw= '('
            {
            kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getLPARENAccess().getLeftParenthesisKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLPAREN"


    // $ANTLR start "entryRuleOUT"
    // InternalMasl.g:3822:1: entryRuleOUT returns [String current=null] : iv_ruleOUT= ruleOUT EOF ;
    public final String entryRuleOUT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOUT = null;


        try {
            // InternalMasl.g:3822:43: (iv_ruleOUT= ruleOUT EOF )
            // InternalMasl.g:3823:2: iv_ruleOUT= ruleOUT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOUTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOUT=ruleOUT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOUT.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOUT"


    // $ANTLR start "ruleOUT"
    // InternalMasl.g:3829:1: ruleOUT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'out' ;
    public final AntlrDatatypeRuleToken ruleOUT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3835:2: (kw= 'out' )
            // InternalMasl.g:3836:2: kw= 'out'
            {
            kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getOUTAccess().getOutKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOUT"


    // $ANTLR start "entryRulePRAGMATOK"
    // InternalMasl.g:3844:1: entryRulePRAGMATOK returns [String current=null] : iv_rulePRAGMATOK= rulePRAGMATOK EOF ;
    public final String entryRulePRAGMATOK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePRAGMATOK = null;


        try {
            // InternalMasl.g:3844:49: (iv_rulePRAGMATOK= rulePRAGMATOK EOF )
            // InternalMasl.g:3845:2: iv_rulePRAGMATOK= rulePRAGMATOK EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPRAGMATOKRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePRAGMATOK=rulePRAGMATOK();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePRAGMATOK.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePRAGMATOK"


    // $ANTLR start "rulePRAGMATOK"
    // InternalMasl.g:3851:1: rulePRAGMATOK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'pragma' ;
    public final AntlrDatatypeRuleToken rulePRAGMATOK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3857:2: (kw= 'pragma' )
            // InternalMasl.g:3858:2: kw= 'pragma'
            {
            kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPRAGMATOKAccess().getPragmaKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRAGMATOK"


    // $ANTLR start "entryRulePRIVATE"
    // InternalMasl.g:3866:1: entryRulePRIVATE returns [String current=null] : iv_rulePRIVATE= rulePRIVATE EOF ;
    public final String entryRulePRIVATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePRIVATE = null;


        try {
            // InternalMasl.g:3866:47: (iv_rulePRIVATE= rulePRIVATE EOF )
            // InternalMasl.g:3867:2: iv_rulePRIVATE= rulePRIVATE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPRIVATERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePRIVATE=rulePRIVATE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePRIVATE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePRIVATE"


    // $ANTLR start "rulePRIVATE"
    // InternalMasl.g:3873:1: rulePRIVATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'private' ;
    public final AntlrDatatypeRuleToken rulePRIVATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3879:2: (kw= 'private' )
            // InternalMasl.g:3880:2: kw= 'private'
            {
            kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPRIVATEAccess().getPrivateKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRIVATE"


    // $ANTLR start "entryRulePROJECT"
    // InternalMasl.g:3888:1: entryRulePROJECT returns [String current=null] : iv_rulePROJECT= rulePROJECT EOF ;
    public final String entryRulePROJECT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePROJECT = null;


        try {
            // InternalMasl.g:3888:47: (iv_rulePROJECT= rulePROJECT EOF )
            // InternalMasl.g:3889:2: iv_rulePROJECT= rulePROJECT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPROJECTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePROJECT=rulePROJECT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePROJECT.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePROJECT"


    // $ANTLR start "rulePROJECT"
    // InternalMasl.g:3895:1: rulePROJECT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'project' ;
    public final AntlrDatatypeRuleToken rulePROJECT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3901:2: (kw= 'project' )
            // InternalMasl.g:3902:2: kw= 'project'
            {
            kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPROJECTAccess().getProjectKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePROJECT"


    // $ANTLR start "entryRulePUBLIC"
    // InternalMasl.g:3910:1: entryRulePUBLIC returns [String current=null] : iv_rulePUBLIC= rulePUBLIC EOF ;
    public final String entryRulePUBLIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePUBLIC = null;


        try {
            // InternalMasl.g:3910:46: (iv_rulePUBLIC= rulePUBLIC EOF )
            // InternalMasl.g:3911:2: iv_rulePUBLIC= rulePUBLIC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPUBLICRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePUBLIC=rulePUBLIC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePUBLIC.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePUBLIC"


    // $ANTLR start "rulePUBLIC"
    // InternalMasl.g:3917:1: rulePUBLIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'public' ;
    public final AntlrDatatypeRuleToken rulePUBLIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3923:2: (kw= 'public' )
            // InternalMasl.g:3924:2: kw= 'public'
            {
            kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPUBLICAccess().getPublicKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePUBLIC"


    // $ANTLR start "entryRuleREADONLY"
    // InternalMasl.g:3932:1: entryRuleREADONLY returns [String current=null] : iv_ruleREADONLY= ruleREADONLY EOF ;
    public final String entryRuleREADONLY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREADONLY = null;


        try {
            // InternalMasl.g:3932:48: (iv_ruleREADONLY= ruleREADONLY EOF )
            // InternalMasl.g:3933:2: iv_ruleREADONLY= ruleREADONLY EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREADONLYRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleREADONLY=ruleREADONLY();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREADONLY.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREADONLY"


    // $ANTLR start "ruleREADONLY"
    // InternalMasl.g:3939:1: ruleREADONLY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'readonly' ;
    public final AntlrDatatypeRuleToken ruleREADONLY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3945:2: (kw= 'readonly' )
            // InternalMasl.g:3946:2: kw= 'readonly'
            {
            kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getREADONLYAccess().getReadonlyKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREADONLY"


    // $ANTLR start "entryRuleRETURN"
    // InternalMasl.g:3954:1: entryRuleRETURN returns [String current=null] : iv_ruleRETURN= ruleRETURN EOF ;
    public final String entryRuleRETURN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN = null;


        try {
            // InternalMasl.g:3954:46: (iv_ruleRETURN= ruleRETURN EOF )
            // InternalMasl.g:3955:2: iv_ruleRETURN= ruleRETURN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRETURNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRETURN=ruleRETURN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRETURN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRETURN"


    // $ANTLR start "ruleRETURN"
    // InternalMasl.g:3961:1: ruleRETURN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'return' ;
    public final AntlrDatatypeRuleToken ruleRETURN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3967:2: (kw= 'return' )
            // InternalMasl.g:3968:2: kw= 'return'
            {
            kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getRETURNAccess().getReturnKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRETURN"


    // $ANTLR start "entryRuleRPAREN"
    // InternalMasl.g:3976:1: entryRuleRPAREN returns [String current=null] : iv_ruleRPAREN= ruleRPAREN EOF ;
    public final String entryRuleRPAREN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRPAREN = null;


        try {
            // InternalMasl.g:3976:46: (iv_ruleRPAREN= ruleRPAREN EOF )
            // InternalMasl.g:3977:2: iv_ruleRPAREN= ruleRPAREN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRPARENRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRPAREN=ruleRPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRPAREN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRPAREN"


    // $ANTLR start "ruleRPAREN"
    // InternalMasl.g:3983:1: ruleRPAREN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRPAREN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:3989:2: (kw= ')' )
            // InternalMasl.g:3990:2: kw= ')'
            {
            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getRPARENAccess().getRightParenthesisKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRPAREN"


    // $ANTLR start "entryRuleSCOPE"
    // InternalMasl.g:3998:1: entryRuleSCOPE returns [String current=null] : iv_ruleSCOPE= ruleSCOPE EOF ;
    public final String entryRuleSCOPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSCOPE = null;


        try {
            // InternalMasl.g:3998:45: (iv_ruleSCOPE= ruleSCOPE EOF )
            // InternalMasl.g:3999:2: iv_ruleSCOPE= ruleSCOPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCOPERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSCOPE=ruleSCOPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCOPE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSCOPE"


    // $ANTLR start "ruleSCOPE"
    // InternalMasl.g:4005:1: ruleSCOPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '::' ;
    public final AntlrDatatypeRuleToken ruleSCOPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:4011:2: (kw= '::' )
            // InternalMasl.g:4012:2: kw= '::'
            {
            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getSCOPEAccess().getColonColonKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSCOPE"


    // $ANTLR start "entryRuleSEMI"
    // InternalMasl.g:4020:1: entryRuleSEMI returns [String current=null] : iv_ruleSEMI= ruleSEMI EOF ;
    public final String entryRuleSEMI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEMI = null;


        try {
            // InternalMasl.g:4020:44: (iv_ruleSEMI= ruleSEMI EOF )
            // InternalMasl.g:4021:2: iv_ruleSEMI= ruleSEMI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSEMIRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSEMI=ruleSEMI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSEMI.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSEMI"


    // $ANTLR start "ruleSEMI"
    // InternalMasl.g:4027:1: ruleSEMI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleSEMI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:4033:2: (kw= ';' )
            // InternalMasl.g:4034:2: kw= ';'
            {
            kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getSEMIAccess().getSemicolonKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSEMI"


    // $ANTLR start "entryRuleSERVICE"
    // InternalMasl.g:4042:1: entryRuleSERVICE returns [String current=null] : iv_ruleSERVICE= ruleSERVICE EOF ;
    public final String entryRuleSERVICE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSERVICE = null;


        try {
            // InternalMasl.g:4042:47: (iv_ruleSERVICE= ruleSERVICE EOF )
            // InternalMasl.g:4043:2: iv_ruleSERVICE= ruleSERVICE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSERVICERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSERVICE=ruleSERVICE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSERVICE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSERVICE"


    // $ANTLR start "ruleSERVICE"
    // InternalMasl.g:4049:1: ruleSERVICE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'service' ;
    public final AntlrDatatypeRuleToken ruleSERVICE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:4055:2: (kw= 'service' )
            // InternalMasl.g:4056:2: kw= 'service'
            {
            kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getSERVICEAccess().getServiceKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSERVICE"


    // $ANTLR start "entryRuleTERMINATOR"
    // InternalMasl.g:4064:1: entryRuleTERMINATOR returns [String current=null] : iv_ruleTERMINATOR= ruleTERMINATOR EOF ;
    public final String entryRuleTERMINATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTERMINATOR = null;


        try {
            // InternalMasl.g:4064:50: (iv_ruleTERMINATOR= ruleTERMINATOR EOF )
            // InternalMasl.g:4065:2: iv_ruleTERMINATOR= ruleTERMINATOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTERMINATORRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTERMINATOR=ruleTERMINATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTERMINATOR.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTERMINATOR"


    // $ANTLR start "ruleTERMINATOR"
    // InternalMasl.g:4071:1: ruleTERMINATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'terminator' ;
    public final AntlrDatatypeRuleToken ruleTERMINATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:4077:2: (kw= 'terminator' )
            // InternalMasl.g:4078:2: kw= 'terminator'
            {
            kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTERMINATORAccess().getTerminatorKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTERMINATOR"


    // $ANTLR start "entryRuleTERMINATOR_SCOPE"
    // InternalMasl.g:4086:1: entryRuleTERMINATOR_SCOPE returns [String current=null] : iv_ruleTERMINATOR_SCOPE= ruleTERMINATOR_SCOPE EOF ;
    public final String entryRuleTERMINATOR_SCOPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTERMINATOR_SCOPE = null;


        try {
            // InternalMasl.g:4086:56: (iv_ruleTERMINATOR_SCOPE= ruleTERMINATOR_SCOPE EOF )
            // InternalMasl.g:4087:2: iv_ruleTERMINATOR_SCOPE= ruleTERMINATOR_SCOPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTERMINATOR_SCOPERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTERMINATOR_SCOPE=ruleTERMINATOR_SCOPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTERMINATOR_SCOPE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTERMINATOR_SCOPE"


    // $ANTLR start "ruleTERMINATOR_SCOPE"
    // InternalMasl.g:4093:1: ruleTERMINATOR_SCOPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '~>' ;
    public final AntlrDatatypeRuleToken ruleTERMINATOR_SCOPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMasl.g:4099:2: (kw= '~>' )
            // InternalMasl.g:4100:2: kw= '~>'
            {
            kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTERMINATOR_SCOPEAccess().getTildeGreaterThanSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTERMINATOR_SCOPE"

    // $ANTLR start synpred1_InternalMasl
    public final void synpred1_InternalMasl_fragment() throws RecognitionException {   
        // InternalMasl.g:3457:3: ( ( RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER ) )
        // InternalMasl.g:3457:4: ( RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        {
        if ( (input.LA(1)>=RULE_ID && input.LA(1)<=RULE_STRING)||(input.LA(1)>=RULE_WS && input.LA(1)<=RULE_ANY_OTHER) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_InternalMasl

    // Delegated rules

    public final boolean synpred1_InternalMasl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMasl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\34\1\uffff\2\25\2\4\1\20\2\42\2\uffff\2\4\2\22\4\uffff";
    static final String dfa_3s = "\1\36\1\uffff\2\44\2\4\1\44\2\42\2\uffff\2\4\2\46\4\uffff";
    static final String dfa_4s = "\1\uffff\1\1\7\uffff\1\3\1\2\4\uffff\1\5\1\7\1\6\1\4";
    static final String dfa_5s = "\23\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\1\1\3",
            "",
            "\1\4\1\uffff\1\6\14\uffff\1\5",
            "\1\4\1\uffff\1\6\14\uffff\1\5",
            "\1\7",
            "\1\10",
            "\1\11\4\uffff\1\11\16\uffff\1\12",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\11\6\uffff\1\17\14\uffff\1\20",
            "\1\12\6\uffff\1\22\14\uffff\1\21",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "114:2: (this_projectDefinition_0= ruleprojectDefinition | this_objectServiceDefinition_1= ruleobjectServiceDefinition | this_objectFunctionDefinition_2= ruleobjectFunctionDefinition | this_domainServiceDefinition_3= ruledomainServiceDefinition | this_domainFunctionDefinition_4= ruledomainFunctionDefinition | this_terminatorServiceDefinition_5= ruleterminatorServiceDefinition | this_terminatorFunctionDefinition_6= ruleterminatorFunctionDefinition )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000020000A0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000820020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000500A0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002820000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000901010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200008010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200008070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001820000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000820200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000000A0370L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001080901010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000372L});

}