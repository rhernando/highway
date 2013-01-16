package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.XHighwayGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXHighwayParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Highway'", "'{'", "'}'", "'initNodes'", "','", "'initCars'", "'initSegments'", "'initSemaphore'", "'initSignal'", "'Node'", "'hasStarts'", "'('", "')'", "'hasEnds'", "'semaphore'", "'signals'", "'Car'", "'timeIn'", "'timeOut'", "'isInSegment'", "'Segment'", "'numLanes'", "'length'", "'hasCars'", "'Semaphore'", "'belongsTo'", "'canGo'", "'secondsRed'", "'secondsGreen'", "'Signal'", "'Extractor'", "'Injector'", "'carsPerHour'", "'-'", "'Speedlimit'", "'Speed'", "'Stop'", "'Yield'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalXHighwayParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXHighwayParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXHighwayParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g"; }


     
     	private XHighwayGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XHighwayGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleHighway"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:60:1: entryRuleHighway : ruleHighway EOF ;
    public final void entryRuleHighway() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:61:1: ( ruleHighway EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:62:1: ruleHighway EOF
            {
             before(grammarAccess.getHighwayRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHighway_in_entryRuleHighway61);
            ruleHighway();

            state._fsp--;

             after(grammarAccess.getHighwayRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHighway68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHighway"


    // $ANTLR start "ruleHighway"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:69:1: ruleHighway : ( ( rule__Highway__Group__0 ) ) ;
    public final void ruleHighway() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:73:2: ( ( ( rule__Highway__Group__0 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:74:1: ( ( rule__Highway__Group__0 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:74:1: ( ( rule__Highway__Group__0 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:75:1: ( rule__Highway__Group__0 )
            {
             before(grammarAccess.getHighwayAccess().getGroup()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:76:1: ( rule__Highway__Group__0 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:76:2: rule__Highway__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__0_in_ruleHighway94);
            rule__Highway__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHighway"


    // $ANTLR start "entryRuleNode"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:88:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:89:1: ( ruleNode EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:90:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_entryRuleNode121);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNode128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:97:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:101:2: ( ( ( rule__Node__Alternatives ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:102:1: ( ( rule__Node__Alternatives ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:102:1: ( ( rule__Node__Alternatives ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:103:1: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:104:1: ( rule__Node__Alternatives )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:104:2: rule__Node__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Alternatives_in_ruleNode154);
            rule__Node__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleSignal"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:116:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:117:1: ( ruleSignal EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:118:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_entryRuleSignal181);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignal188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:125:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:129:2: ( ( ( rule__Signal__Alternatives ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:130:1: ( ( rule__Signal__Alternatives ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:130:1: ( ( rule__Signal__Alternatives ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:131:1: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:132:1: ( rule__Signal__Alternatives )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:132:2: rule__Signal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal__Alternatives_in_ruleSignal214);
            rule__Signal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleNode_Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:144:1: entryRuleNode_Impl : ruleNode_Impl EOF ;
    public final void entryRuleNode_Impl() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:145:1: ( ruleNode_Impl EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:146:1: ruleNode_Impl EOF
            {
             before(grammarAccess.getNode_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_Impl_in_entryRuleNode_Impl241);
            ruleNode_Impl();

            state._fsp--;

             after(grammarAccess.getNode_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNode_Impl248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode_Impl"


    // $ANTLR start "ruleNode_Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:153:1: ruleNode_Impl : ( ( rule__Node_Impl__Group__0 ) ) ;
    public final void ruleNode_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:157:2: ( ( ( rule__Node_Impl__Group__0 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:158:1: ( ( rule__Node_Impl__Group__0 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:158:1: ( ( rule__Node_Impl__Group__0 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:159:1: ( rule__Node_Impl__Group__0 )
            {
             before(grammarAccess.getNode_ImplAccess().getGroup()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:160:1: ( rule__Node_Impl__Group__0 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:160:2: rule__Node_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__0_in_ruleNode_Impl274);
            rule__Node_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode_Impl"


    // $ANTLR start "entryRuleCar"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:172:1: entryRuleCar : ruleCar EOF ;
    public final void entryRuleCar() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:173:1: ( ruleCar EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:174:1: ruleCar EOF
            {
             before(grammarAccess.getCarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCar_in_entryRuleCar301);
            ruleCar();

            state._fsp--;

             after(grammarAccess.getCarRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCar308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCar"


    // $ANTLR start "ruleCar"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:181:1: ruleCar : ( ( rule__Car__Group__0 ) ) ;
    public final void ruleCar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:185:2: ( ( ( rule__Car__Group__0 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:186:1: ( ( rule__Car__Group__0 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:186:1: ( ( rule__Car__Group__0 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:187:1: ( rule__Car__Group__0 )
            {
             before(grammarAccess.getCarAccess().getGroup()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:188:1: ( rule__Car__Group__0 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:188:2: rule__Car__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__0_in_ruleCar334);
            rule__Car__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCar"


    // $ANTLR start "entryRuleSegment"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:200:1: entryRuleSegment : ruleSegment EOF ;
    public final void entryRuleSegment() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:201:1: ( ruleSegment EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:202:1: ruleSegment EOF
            {
             before(grammarAccess.getSegmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSegment_in_entryRuleSegment361);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getSegmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSegment368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSegment"


    // $ANTLR start "ruleSegment"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:209:1: ruleSegment : ( ( rule__Segment__Group__0 ) ) ;
    public final void ruleSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:213:2: ( ( ( rule__Segment__Group__0 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:214:1: ( ( rule__Segment__Group__0 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:214:1: ( ( rule__Segment__Group__0 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:215:1: ( rule__Segment__Group__0 )
            {
             before(grammarAccess.getSegmentAccess().getGroup()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:216:1: ( rule__Segment__Group__0 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:216:2: rule__Segment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__0_in_ruleSegment394);
            rule__Segment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSegment"


    // $ANTLR start "entryRuleSemaphore"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:228:1: entryRuleSemaphore : ruleSemaphore EOF ;
    public final void entryRuleSemaphore() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:229:1: ( ruleSemaphore EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:230:1: ruleSemaphore EOF
            {
             before(grammarAccess.getSemaphoreRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemaphore_in_entryRuleSemaphore421);
            ruleSemaphore();

            state._fsp--;

             after(grammarAccess.getSemaphoreRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSemaphore428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSemaphore"


    // $ANTLR start "ruleSemaphore"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:237:1: ruleSemaphore : ( ( rule__Semaphore__Group__0 ) ) ;
    public final void ruleSemaphore() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:241:2: ( ( ( rule__Semaphore__Group__0 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:242:1: ( ( rule__Semaphore__Group__0 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:242:1: ( ( rule__Semaphore__Group__0 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:243:1: ( rule__Semaphore__Group__0 )
            {
             before(grammarAccess.getSemaphoreAccess().getGroup()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:244:1: ( rule__Semaphore__Group__0 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:244:2: rule__Semaphore__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__0_in_ruleSemaphore454);
            rule__Semaphore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSemaphoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSemaphore"


    // $ANTLR start "entryRuleSignal_Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:256:1: entryRuleSignal_Impl : ruleSignal_Impl EOF ;
    public final void entryRuleSignal_Impl() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:257:1: ( ruleSignal_Impl EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:258:1: ruleSignal_Impl EOF
            {
             before(grammarAccess.getSignal_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignal_Impl_in_entryRuleSignal_Impl481);
            ruleSignal_Impl();

            state._fsp--;

             after(grammarAccess.getSignal_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignal_Impl488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignal_Impl"


    // $ANTLR start "ruleSignal_Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:265:1: ruleSignal_Impl : ( ( rule__Signal_Impl__Group__0 ) ) ;
    public final void ruleSignal_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:269:2: ( ( ( rule__Signal_Impl__Group__0 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:270:1: ( ( rule__Signal_Impl__Group__0 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:270:1: ( ( rule__Signal_Impl__Group__0 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:271:1: ( rule__Signal_Impl__Group__0 )
            {
             before(grammarAccess.getSignal_ImplAccess().getGroup()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:272:1: ( rule__Signal_Impl__Group__0 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:272:2: rule__Signal_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__0_in_ruleSignal_Impl514);
            rule__Signal_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignal_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignal_Impl"


    // $ANTLR start "entryRuleExtractor"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:284:1: entryRuleExtractor : ruleExtractor EOF ;
    public final void entryRuleExtractor() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:285:1: ( ruleExtractor EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:286:1: ruleExtractor EOF
            {
             before(grammarAccess.getExtractorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtractor_in_entryRuleExtractor541);
            ruleExtractor();

            state._fsp--;

             after(grammarAccess.getExtractorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtractor548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtractor"


    // $ANTLR start "ruleExtractor"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:293:1: ruleExtractor : ( ( rule__Extractor__Group__0 ) ) ;
    public final void ruleExtractor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:297:2: ( ( ( rule__Extractor__Group__0 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:298:1: ( ( rule__Extractor__Group__0 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:298:1: ( ( rule__Extractor__Group__0 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:299:1: ( rule__Extractor__Group__0 )
            {
             before(grammarAccess.getExtractorAccess().getGroup()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:300:1: ( rule__Extractor__Group__0 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:300:2: rule__Extractor__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__0_in_ruleExtractor574);
            rule__Extractor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtractor"


    // $ANTLR start "entryRuleInjector"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:312:1: entryRuleInjector : ruleInjector EOF ;
    public final void entryRuleInjector() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:313:1: ( ruleInjector EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:314:1: ruleInjector EOF
            {
             before(grammarAccess.getInjectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInjector_in_entryRuleInjector601);
            ruleInjector();

            state._fsp--;

             after(grammarAccess.getInjectorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInjector608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInjector"


    // $ANTLR start "ruleInjector"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:321:1: ruleInjector : ( ( rule__Injector__Group__0 ) ) ;
    public final void ruleInjector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:325:2: ( ( ( rule__Injector__Group__0 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:326:1: ( ( rule__Injector__Group__0 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:326:1: ( ( rule__Injector__Group__0 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:327:1: ( rule__Injector__Group__0 )
            {
             before(grammarAccess.getInjectorAccess().getGroup()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:328:1: ( rule__Injector__Group__0 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:328:2: rule__Injector__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__0_in_ruleInjector634);
            rule__Injector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInjector"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:340:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:341:1: ( ruleEInt EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:342:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt661);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:349:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:353:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:354:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:354:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:355:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:356:1: ( rule__EInt__Group__0 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:356:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt694);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDate"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:368:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:369:1: ( ruleEDate EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:370:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDate_in_entryRuleEDate721);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDate728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:377:1: ruleEDate : ( RULE_STRING ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:381:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:382:1: ( RULE_STRING )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:382:1: ( RULE_STRING )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:383:1: RULE_STRING
            {
             before(grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEDate754); 
             after(grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:396:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:397:1: ( ruleEBoolean EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:398:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean780);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:405:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:409:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:410:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:410:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:411:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:412:1: ( rule__EBoolean__Alternatives )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:412:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean813);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleSpeedlimit"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:424:1: entryRuleSpeedlimit : ruleSpeedlimit EOF ;
    public final void entryRuleSpeedlimit() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:425:1: ( ruleSpeedlimit EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:426:1: ruleSpeedlimit EOF
            {
             before(grammarAccess.getSpeedlimitRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpeedlimit_in_entryRuleSpeedlimit840);
            ruleSpeedlimit();

            state._fsp--;

             after(grammarAccess.getSpeedlimitRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpeedlimit847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpeedlimit"


    // $ANTLR start "ruleSpeedlimit"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:433:1: ruleSpeedlimit : ( ( rule__Speedlimit__Group__0 ) ) ;
    public final void ruleSpeedlimit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:437:2: ( ( ( rule__Speedlimit__Group__0 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:438:1: ( ( rule__Speedlimit__Group__0 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:438:1: ( ( rule__Speedlimit__Group__0 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:439:1: ( rule__Speedlimit__Group__0 )
            {
             before(grammarAccess.getSpeedlimitAccess().getGroup()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:440:1: ( rule__Speedlimit__Group__0 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:440:2: rule__Speedlimit__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__0_in_ruleSpeedlimit873);
            rule__Speedlimit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpeedlimitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpeedlimit"


    // $ANTLR start "entryRuleStop"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:452:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:453:1: ( ruleStop EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:454:1: ruleStop EOF
            {
             before(grammarAccess.getStopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStop_in_entryRuleStop900);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getStopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStop907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:461:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:465:2: ( ( ( rule__Stop__Group__0 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:466:1: ( ( rule__Stop__Group__0 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:466:1: ( ( rule__Stop__Group__0 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:467:1: ( rule__Stop__Group__0 )
            {
             before(grammarAccess.getStopAccess().getGroup()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:468:1: ( rule__Stop__Group__0 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:468:2: rule__Stop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0_in_ruleStop933);
            rule__Stop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleYield"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:480:1: entryRuleYield : ruleYield EOF ;
    public final void entryRuleYield() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:481:1: ( ruleYield EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:482:1: ruleYield EOF
            {
             before(grammarAccess.getYieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleYield_in_entryRuleYield960);
            ruleYield();

            state._fsp--;

             after(grammarAccess.getYieldRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleYield967); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYield"


    // $ANTLR start "ruleYield"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:489:1: ruleYield : ( ( rule__Yield__Group__0 ) ) ;
    public final void ruleYield() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:493:2: ( ( ( rule__Yield__Group__0 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:494:1: ( ( rule__Yield__Group__0 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:494:1: ( ( rule__Yield__Group__0 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:495:1: ( rule__Yield__Group__0 )
            {
             before(grammarAccess.getYieldAccess().getGroup()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:496:1: ( rule__Yield__Group__0 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:496:2: rule__Yield__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__0_in_ruleYield993);
            rule__Yield__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getYieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYield"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:508:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:509:1: ( ruleEString EOF )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:510:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1020);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1027); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:517:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:521:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:522:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:522:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:523:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:524:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:524:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString1053);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Node__Alternatives"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:536:1: rule__Node__Alternatives : ( ( ruleNode_Impl ) | ( ruleExtractor ) | ( ruleInjector ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:540:1: ( ( ruleNode_Impl ) | ( ruleExtractor ) | ( ruleInjector ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 43:
                {
                alt1=2;
                }
                break;
            case 44:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:541:1: ( ruleNode_Impl )
                    {
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:541:1: ( ruleNode_Impl )
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:542:1: ruleNode_Impl
                    {
                     before(grammarAccess.getNodeAccess().getNode_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNode_Impl_in_rule__Node__Alternatives1089);
                    ruleNode_Impl();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getNode_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:547:6: ( ruleExtractor )
                    {
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:547:6: ( ruleExtractor )
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:548:1: ruleExtractor
                    {
                     before(grammarAccess.getNodeAccess().getExtractorParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExtractor_in_rule__Node__Alternatives1106);
                    ruleExtractor();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getExtractorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:553:6: ( ruleInjector )
                    {
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:553:6: ( ruleInjector )
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:554:1: ruleInjector
                    {
                     before(grammarAccess.getNodeAccess().getInjectorParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInjector_in_rule__Node__Alternatives1123);
                    ruleInjector();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getInjectorParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__Signal__Alternatives"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:564:1: rule__Signal__Alternatives : ( ( ruleSignal_Impl ) | ( ruleSpeedlimit ) | ( ruleStop ) | ( ruleYield ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:568:1: ( ( ruleSignal_Impl ) | ( ruleSpeedlimit ) | ( ruleStop ) | ( ruleYield ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt2=1;
                }
                break;
            case 47:
                {
                alt2=2;
                }
                break;
            case 49:
                {
                alt2=3;
                }
                break;
            case 50:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:569:1: ( ruleSignal_Impl )
                    {
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:569:1: ( ruleSignal_Impl )
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:570:1: ruleSignal_Impl
                    {
                     before(grammarAccess.getSignalAccess().getSignal_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSignal_Impl_in_rule__Signal__Alternatives1155);
                    ruleSignal_Impl();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getSignal_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:575:6: ( ruleSpeedlimit )
                    {
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:575:6: ( ruleSpeedlimit )
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:576:1: ruleSpeedlimit
                    {
                     before(grammarAccess.getSignalAccess().getSpeedlimitParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSpeedlimit_in_rule__Signal__Alternatives1172);
                    ruleSpeedlimit();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getSpeedlimitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:581:6: ( ruleStop )
                    {
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:581:6: ( ruleStop )
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:582:1: ruleStop
                    {
                     before(grammarAccess.getSignalAccess().getStopParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStop_in_rule__Signal__Alternatives1189);
                    ruleStop();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getStopParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:587:6: ( ruleYield )
                    {
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:587:6: ( ruleYield )
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:588:1: ruleYield
                    {
                     before(grammarAccess.getSignalAccess().getYieldParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleYield_in_rule__Signal__Alternatives1206);
                    ruleYield();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getYieldParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:598:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:602:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:603:1: ( 'true' )
                    {
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:603:1: ( 'true' )
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:604:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EBoolean__Alternatives1239); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:611:6: ( 'false' )
                    {
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:611:6: ( 'false' )
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:612:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives1259); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:624:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:628:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:629:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:629:1: ( RULE_STRING )
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:630:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1293); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:635:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:635:6: ( RULE_ID )
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:636:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1310); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Highway__Group__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:648:1: rule__Highway__Group__0 : rule__Highway__Group__0__Impl rule__Highway__Group__1 ;
    public final void rule__Highway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:652:1: ( rule__Highway__Group__0__Impl rule__Highway__Group__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:653:2: rule__Highway__Group__0__Impl rule__Highway__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__0__Impl_in_rule__Highway__Group__01340);
            rule__Highway__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__1_in_rule__Highway__Group__01343);
            rule__Highway__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__0"


    // $ANTLR start "rule__Highway__Group__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:660:1: rule__Highway__Group__0__Impl : ( () ) ;
    public final void rule__Highway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:664:1: ( ( () ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:665:1: ( () )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:665:1: ( () )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:666:1: ()
            {
             before(grammarAccess.getHighwayAccess().getHighwayAction_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:667:1: ()
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:669:1: 
            {
            }

             after(grammarAccess.getHighwayAccess().getHighwayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__0__Impl"


    // $ANTLR start "rule__Highway__Group__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:679:1: rule__Highway__Group__1 : rule__Highway__Group__1__Impl rule__Highway__Group__2 ;
    public final void rule__Highway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:683:1: ( rule__Highway__Group__1__Impl rule__Highway__Group__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:684:2: rule__Highway__Group__1__Impl rule__Highway__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__1__Impl_in_rule__Highway__Group__11401);
            rule__Highway__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__2_in_rule__Highway__Group__11404);
            rule__Highway__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__1"


    // $ANTLR start "rule__Highway__Group__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:691:1: rule__Highway__Group__1__Impl : ( 'Highway' ) ;
    public final void rule__Highway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:695:1: ( ( 'Highway' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:696:1: ( 'Highway' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:696:1: ( 'Highway' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:697:1: 'Highway'
            {
             before(grammarAccess.getHighwayAccess().getHighwayKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Highway__Group__1__Impl1432); 
             after(grammarAccess.getHighwayAccess().getHighwayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__1__Impl"


    // $ANTLR start "rule__Highway__Group__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:710:1: rule__Highway__Group__2 : rule__Highway__Group__2__Impl rule__Highway__Group__3 ;
    public final void rule__Highway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:714:1: ( rule__Highway__Group__2__Impl rule__Highway__Group__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:715:2: rule__Highway__Group__2__Impl rule__Highway__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__2__Impl_in_rule__Highway__Group__21463);
            rule__Highway__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__3_in_rule__Highway__Group__21466);
            rule__Highway__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__2"


    // $ANTLR start "rule__Highway__Group__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:722:1: rule__Highway__Group__2__Impl : ( '{' ) ;
    public final void rule__Highway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:726:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:727:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:727:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:728:1: '{'
            {
             before(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Highway__Group__2__Impl1494); 
             after(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__2__Impl"


    // $ANTLR start "rule__Highway__Group__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:741:1: rule__Highway__Group__3 : rule__Highway__Group__3__Impl rule__Highway__Group__4 ;
    public final void rule__Highway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:745:1: ( rule__Highway__Group__3__Impl rule__Highway__Group__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:746:2: rule__Highway__Group__3__Impl rule__Highway__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__3__Impl_in_rule__Highway__Group__31525);
            rule__Highway__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__4_in_rule__Highway__Group__31528);
            rule__Highway__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__3"


    // $ANTLR start "rule__Highway__Group__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:753:1: rule__Highway__Group__3__Impl : ( ( rule__Highway__Group_3__0 )? ) ;
    public final void rule__Highway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:757:1: ( ( ( rule__Highway__Group_3__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:758:1: ( ( rule__Highway__Group_3__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:758:1: ( ( rule__Highway__Group_3__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:759:1: ( rule__Highway__Group_3__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:760:1: ( rule__Highway__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:760:2: rule__Highway__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__0_in_rule__Highway__Group__3__Impl1555);
                    rule__Highway__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHighwayAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__3__Impl"


    // $ANTLR start "rule__Highway__Group__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:770:1: rule__Highway__Group__4 : rule__Highway__Group__4__Impl rule__Highway__Group__5 ;
    public final void rule__Highway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:774:1: ( rule__Highway__Group__4__Impl rule__Highway__Group__5 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:775:2: rule__Highway__Group__4__Impl rule__Highway__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__4__Impl_in_rule__Highway__Group__41586);
            rule__Highway__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__5_in_rule__Highway__Group__41589);
            rule__Highway__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__4"


    // $ANTLR start "rule__Highway__Group__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:782:1: rule__Highway__Group__4__Impl : ( ( rule__Highway__Group_4__0 )? ) ;
    public final void rule__Highway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:786:1: ( ( ( rule__Highway__Group_4__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:787:1: ( ( rule__Highway__Group_4__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:787:1: ( ( rule__Highway__Group_4__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:788:1: ( rule__Highway__Group_4__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_4()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:789:1: ( rule__Highway__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:789:2: rule__Highway__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__0_in_rule__Highway__Group__4__Impl1616);
                    rule__Highway__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHighwayAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__4__Impl"


    // $ANTLR start "rule__Highway__Group__5"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:799:1: rule__Highway__Group__5 : rule__Highway__Group__5__Impl rule__Highway__Group__6 ;
    public final void rule__Highway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:803:1: ( rule__Highway__Group__5__Impl rule__Highway__Group__6 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:804:2: rule__Highway__Group__5__Impl rule__Highway__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__5__Impl_in_rule__Highway__Group__51647);
            rule__Highway__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__6_in_rule__Highway__Group__51650);
            rule__Highway__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__5"


    // $ANTLR start "rule__Highway__Group__5__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:811:1: rule__Highway__Group__5__Impl : ( ( rule__Highway__Group_5__0 )? ) ;
    public final void rule__Highway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:815:1: ( ( ( rule__Highway__Group_5__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:816:1: ( ( rule__Highway__Group_5__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:816:1: ( ( rule__Highway__Group_5__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:817:1: ( rule__Highway__Group_5__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_5()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:818:1: ( rule__Highway__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:818:2: rule__Highway__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__0_in_rule__Highway__Group__5__Impl1677);
                    rule__Highway__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHighwayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__5__Impl"


    // $ANTLR start "rule__Highway__Group__6"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:828:1: rule__Highway__Group__6 : rule__Highway__Group__6__Impl rule__Highway__Group__7 ;
    public final void rule__Highway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:832:1: ( rule__Highway__Group__6__Impl rule__Highway__Group__7 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:833:2: rule__Highway__Group__6__Impl rule__Highway__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__6__Impl_in_rule__Highway__Group__61708);
            rule__Highway__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__7_in_rule__Highway__Group__61711);
            rule__Highway__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__6"


    // $ANTLR start "rule__Highway__Group__6__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:840:1: rule__Highway__Group__6__Impl : ( ( rule__Highway__Group_6__0 )? ) ;
    public final void rule__Highway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:844:1: ( ( ( rule__Highway__Group_6__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:845:1: ( ( rule__Highway__Group_6__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:845:1: ( ( rule__Highway__Group_6__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:846:1: ( rule__Highway__Group_6__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_6()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:847:1: ( rule__Highway__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:847:2: rule__Highway__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__0_in_rule__Highway__Group__6__Impl1738);
                    rule__Highway__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHighwayAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__6__Impl"


    // $ANTLR start "rule__Highway__Group__7"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:857:1: rule__Highway__Group__7 : rule__Highway__Group__7__Impl rule__Highway__Group__8 ;
    public final void rule__Highway__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:861:1: ( rule__Highway__Group__7__Impl rule__Highway__Group__8 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:862:2: rule__Highway__Group__7__Impl rule__Highway__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__7__Impl_in_rule__Highway__Group__71769);
            rule__Highway__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__8_in_rule__Highway__Group__71772);
            rule__Highway__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__7"


    // $ANTLR start "rule__Highway__Group__7__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:869:1: rule__Highway__Group__7__Impl : ( ( rule__Highway__Group_7__0 )? ) ;
    public final void rule__Highway__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:873:1: ( ( ( rule__Highway__Group_7__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:874:1: ( ( rule__Highway__Group_7__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:874:1: ( ( rule__Highway__Group_7__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:875:1: ( rule__Highway__Group_7__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_7()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:876:1: ( rule__Highway__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:876:2: rule__Highway__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__0_in_rule__Highway__Group__7__Impl1799);
                    rule__Highway__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHighwayAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__7__Impl"


    // $ANTLR start "rule__Highway__Group__8"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:886:1: rule__Highway__Group__8 : rule__Highway__Group__8__Impl ;
    public final void rule__Highway__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:890:1: ( rule__Highway__Group__8__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:891:2: rule__Highway__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__8__Impl_in_rule__Highway__Group__81830);
            rule__Highway__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__8"


    // $ANTLR start "rule__Highway__Group__8__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:897:1: rule__Highway__Group__8__Impl : ( '}' ) ;
    public final void rule__Highway__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:901:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:902:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:902:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:903:1: '}'
            {
             before(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Highway__Group__8__Impl1858); 
             after(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group__8__Impl"


    // $ANTLR start "rule__Highway__Group_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:934:1: rule__Highway__Group_3__0 : rule__Highway__Group_3__0__Impl rule__Highway__Group_3__1 ;
    public final void rule__Highway__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:938:1: ( rule__Highway__Group_3__0__Impl rule__Highway__Group_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:939:2: rule__Highway__Group_3__0__Impl rule__Highway__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__0__Impl_in_rule__Highway__Group_3__01907);
            rule__Highway__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__1_in_rule__Highway__Group_3__01910);
            rule__Highway__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3__0"


    // $ANTLR start "rule__Highway__Group_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:946:1: rule__Highway__Group_3__0__Impl : ( 'initNodes' ) ;
    public final void rule__Highway__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:950:1: ( ( 'initNodes' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:951:1: ( 'initNodes' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:951:1: ( 'initNodes' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:952:1: 'initNodes'
            {
             before(grammarAccess.getHighwayAccess().getInitNodesKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Highway__Group_3__0__Impl1938); 
             after(grammarAccess.getHighwayAccess().getInitNodesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3__0__Impl"


    // $ANTLR start "rule__Highway__Group_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:965:1: rule__Highway__Group_3__1 : rule__Highway__Group_3__1__Impl rule__Highway__Group_3__2 ;
    public final void rule__Highway__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:969:1: ( rule__Highway__Group_3__1__Impl rule__Highway__Group_3__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:970:2: rule__Highway__Group_3__1__Impl rule__Highway__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__1__Impl_in_rule__Highway__Group_3__11969);
            rule__Highway__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__2_in_rule__Highway__Group_3__11972);
            rule__Highway__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3__1"


    // $ANTLR start "rule__Highway__Group_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:977:1: rule__Highway__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:981:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:982:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:982:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:983:1: '{'
            {
             before(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Highway__Group_3__1__Impl2000); 
             after(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3__1__Impl"


    // $ANTLR start "rule__Highway__Group_3__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:996:1: rule__Highway__Group_3__2 : rule__Highway__Group_3__2__Impl rule__Highway__Group_3__3 ;
    public final void rule__Highway__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1000:1: ( rule__Highway__Group_3__2__Impl rule__Highway__Group_3__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1001:2: rule__Highway__Group_3__2__Impl rule__Highway__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__2__Impl_in_rule__Highway__Group_3__22031);
            rule__Highway__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__3_in_rule__Highway__Group_3__22034);
            rule__Highway__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3__2"


    // $ANTLR start "rule__Highway__Group_3__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1008:1: rule__Highway__Group_3__2__Impl : ( ( rule__Highway__InitNodesAssignment_3_2 ) ) ;
    public final void rule__Highway__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1012:1: ( ( ( rule__Highway__InitNodesAssignment_3_2 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1013:1: ( ( rule__Highway__InitNodesAssignment_3_2 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1013:1: ( ( rule__Highway__InitNodesAssignment_3_2 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1014:1: ( rule__Highway__InitNodesAssignment_3_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitNodesAssignment_3_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1015:1: ( rule__Highway__InitNodesAssignment_3_2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1015:2: rule__Highway__InitNodesAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitNodesAssignment_3_2_in_rule__Highway__Group_3__2__Impl2061);
            rule__Highway__InitNodesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitNodesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3__2__Impl"


    // $ANTLR start "rule__Highway__Group_3__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1025:1: rule__Highway__Group_3__3 : rule__Highway__Group_3__3__Impl rule__Highway__Group_3__4 ;
    public final void rule__Highway__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1029:1: ( rule__Highway__Group_3__3__Impl rule__Highway__Group_3__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1030:2: rule__Highway__Group_3__3__Impl rule__Highway__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__3__Impl_in_rule__Highway__Group_3__32091);
            rule__Highway__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__4_in_rule__Highway__Group_3__32094);
            rule__Highway__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3__3"


    // $ANTLR start "rule__Highway__Group_3__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1037:1: rule__Highway__Group_3__3__Impl : ( ( rule__Highway__Group_3_3__0 )* ) ;
    public final void rule__Highway__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1041:1: ( ( ( rule__Highway__Group_3_3__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1042:1: ( ( rule__Highway__Group_3_3__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1042:1: ( ( rule__Highway__Group_3_3__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1043:1: ( rule__Highway__Group_3_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_3_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1044:1: ( rule__Highway__Group_3_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1044:2: rule__Highway__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3_3__0_in_rule__Highway__Group_3__3__Impl2121);
            	    rule__Highway__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getHighwayAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3__3__Impl"


    // $ANTLR start "rule__Highway__Group_3__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1054:1: rule__Highway__Group_3__4 : rule__Highway__Group_3__4__Impl ;
    public final void rule__Highway__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1058:1: ( rule__Highway__Group_3__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1059:2: rule__Highway__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__4__Impl_in_rule__Highway__Group_3__42152);
            rule__Highway__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3__4"


    // $ANTLR start "rule__Highway__Group_3__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1065:1: rule__Highway__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1069:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1070:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1070:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1071:1: '}'
            {
             before(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Highway__Group_3__4__Impl2180); 
             after(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3__4__Impl"


    // $ANTLR start "rule__Highway__Group_3_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1094:1: rule__Highway__Group_3_3__0 : rule__Highway__Group_3_3__0__Impl rule__Highway__Group_3_3__1 ;
    public final void rule__Highway__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1098:1: ( rule__Highway__Group_3_3__0__Impl rule__Highway__Group_3_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1099:2: rule__Highway__Group_3_3__0__Impl rule__Highway__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3_3__0__Impl_in_rule__Highway__Group_3_3__02221);
            rule__Highway__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3_3__1_in_rule__Highway__Group_3_3__02224);
            rule__Highway__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3_3__0"


    // $ANTLR start "rule__Highway__Group_3_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1106:1: rule__Highway__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1110:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1111:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1111:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1112:1: ','
            {
             before(grammarAccess.getHighwayAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Highway__Group_3_3__0__Impl2252); 
             after(grammarAccess.getHighwayAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3_3__0__Impl"


    // $ANTLR start "rule__Highway__Group_3_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1125:1: rule__Highway__Group_3_3__1 : rule__Highway__Group_3_3__1__Impl ;
    public final void rule__Highway__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1129:1: ( rule__Highway__Group_3_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1130:2: rule__Highway__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3_3__1__Impl_in_rule__Highway__Group_3_3__12283);
            rule__Highway__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3_3__1"


    // $ANTLR start "rule__Highway__Group_3_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1136:1: rule__Highway__Group_3_3__1__Impl : ( ( rule__Highway__InitNodesAssignment_3_3_1 ) ) ;
    public final void rule__Highway__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1140:1: ( ( ( rule__Highway__InitNodesAssignment_3_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1141:1: ( ( rule__Highway__InitNodesAssignment_3_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1141:1: ( ( rule__Highway__InitNodesAssignment_3_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1142:1: ( rule__Highway__InitNodesAssignment_3_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitNodesAssignment_3_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1143:1: ( rule__Highway__InitNodesAssignment_3_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1143:2: rule__Highway__InitNodesAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitNodesAssignment_3_3_1_in_rule__Highway__Group_3_3__1__Impl2310);
            rule__Highway__InitNodesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitNodesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_3_3__1__Impl"


    // $ANTLR start "rule__Highway__Group_4__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1157:1: rule__Highway__Group_4__0 : rule__Highway__Group_4__0__Impl rule__Highway__Group_4__1 ;
    public final void rule__Highway__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1161:1: ( rule__Highway__Group_4__0__Impl rule__Highway__Group_4__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1162:2: rule__Highway__Group_4__0__Impl rule__Highway__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__0__Impl_in_rule__Highway__Group_4__02344);
            rule__Highway__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__1_in_rule__Highway__Group_4__02347);
            rule__Highway__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4__0"


    // $ANTLR start "rule__Highway__Group_4__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1169:1: rule__Highway__Group_4__0__Impl : ( 'initCars' ) ;
    public final void rule__Highway__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1173:1: ( ( 'initCars' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1174:1: ( 'initCars' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1174:1: ( 'initCars' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1175:1: 'initCars'
            {
             before(grammarAccess.getHighwayAccess().getInitCarsKeyword_4_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Highway__Group_4__0__Impl2375); 
             after(grammarAccess.getHighwayAccess().getInitCarsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4__0__Impl"


    // $ANTLR start "rule__Highway__Group_4__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1188:1: rule__Highway__Group_4__1 : rule__Highway__Group_4__1__Impl rule__Highway__Group_4__2 ;
    public final void rule__Highway__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1192:1: ( rule__Highway__Group_4__1__Impl rule__Highway__Group_4__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1193:2: rule__Highway__Group_4__1__Impl rule__Highway__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__1__Impl_in_rule__Highway__Group_4__12406);
            rule__Highway__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__2_in_rule__Highway__Group_4__12409);
            rule__Highway__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4__1"


    // $ANTLR start "rule__Highway__Group_4__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1200:1: rule__Highway__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1204:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1205:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1205:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1206:1: '{'
            {
             before(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Highway__Group_4__1__Impl2437); 
             after(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4__1__Impl"


    // $ANTLR start "rule__Highway__Group_4__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1219:1: rule__Highway__Group_4__2 : rule__Highway__Group_4__2__Impl rule__Highway__Group_4__3 ;
    public final void rule__Highway__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1223:1: ( rule__Highway__Group_4__2__Impl rule__Highway__Group_4__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1224:2: rule__Highway__Group_4__2__Impl rule__Highway__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__2__Impl_in_rule__Highway__Group_4__22468);
            rule__Highway__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__3_in_rule__Highway__Group_4__22471);
            rule__Highway__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4__2"


    // $ANTLR start "rule__Highway__Group_4__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1231:1: rule__Highway__Group_4__2__Impl : ( ( rule__Highway__InitCarsAssignment_4_2 ) ) ;
    public final void rule__Highway__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1235:1: ( ( ( rule__Highway__InitCarsAssignment_4_2 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1236:1: ( ( rule__Highway__InitCarsAssignment_4_2 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1236:1: ( ( rule__Highway__InitCarsAssignment_4_2 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1237:1: ( rule__Highway__InitCarsAssignment_4_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitCarsAssignment_4_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1238:1: ( rule__Highway__InitCarsAssignment_4_2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1238:2: rule__Highway__InitCarsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitCarsAssignment_4_2_in_rule__Highway__Group_4__2__Impl2498);
            rule__Highway__InitCarsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitCarsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4__2__Impl"


    // $ANTLR start "rule__Highway__Group_4__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1248:1: rule__Highway__Group_4__3 : rule__Highway__Group_4__3__Impl rule__Highway__Group_4__4 ;
    public final void rule__Highway__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1252:1: ( rule__Highway__Group_4__3__Impl rule__Highway__Group_4__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1253:2: rule__Highway__Group_4__3__Impl rule__Highway__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__3__Impl_in_rule__Highway__Group_4__32528);
            rule__Highway__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__4_in_rule__Highway__Group_4__32531);
            rule__Highway__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4__3"


    // $ANTLR start "rule__Highway__Group_4__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1260:1: rule__Highway__Group_4__3__Impl : ( ( rule__Highway__Group_4_3__0 )* ) ;
    public final void rule__Highway__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1264:1: ( ( ( rule__Highway__Group_4_3__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1265:1: ( ( rule__Highway__Group_4_3__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1265:1: ( ( rule__Highway__Group_4_3__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1266:1: ( rule__Highway__Group_4_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_4_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1267:1: ( rule__Highway__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1267:2: rule__Highway__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4_3__0_in_rule__Highway__Group_4__3__Impl2558);
            	    rule__Highway__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getHighwayAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4__3__Impl"


    // $ANTLR start "rule__Highway__Group_4__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1277:1: rule__Highway__Group_4__4 : rule__Highway__Group_4__4__Impl ;
    public final void rule__Highway__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1281:1: ( rule__Highway__Group_4__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1282:2: rule__Highway__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__4__Impl_in_rule__Highway__Group_4__42589);
            rule__Highway__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4__4"


    // $ANTLR start "rule__Highway__Group_4__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1288:1: rule__Highway__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1292:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1293:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1293:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1294:1: '}'
            {
             before(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Highway__Group_4__4__Impl2617); 
             after(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4__4__Impl"


    // $ANTLR start "rule__Highway__Group_4_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1317:1: rule__Highway__Group_4_3__0 : rule__Highway__Group_4_3__0__Impl rule__Highway__Group_4_3__1 ;
    public final void rule__Highway__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1321:1: ( rule__Highway__Group_4_3__0__Impl rule__Highway__Group_4_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1322:2: rule__Highway__Group_4_3__0__Impl rule__Highway__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4_3__0__Impl_in_rule__Highway__Group_4_3__02658);
            rule__Highway__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4_3__1_in_rule__Highway__Group_4_3__02661);
            rule__Highway__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4_3__0"


    // $ANTLR start "rule__Highway__Group_4_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1329:1: rule__Highway__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1333:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1334:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1334:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1335:1: ','
            {
             before(grammarAccess.getHighwayAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Highway__Group_4_3__0__Impl2689); 
             after(grammarAccess.getHighwayAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4_3__0__Impl"


    // $ANTLR start "rule__Highway__Group_4_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1348:1: rule__Highway__Group_4_3__1 : rule__Highway__Group_4_3__1__Impl ;
    public final void rule__Highway__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1352:1: ( rule__Highway__Group_4_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1353:2: rule__Highway__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4_3__1__Impl_in_rule__Highway__Group_4_3__12720);
            rule__Highway__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4_3__1"


    // $ANTLR start "rule__Highway__Group_4_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1359:1: rule__Highway__Group_4_3__1__Impl : ( ( rule__Highway__InitCarsAssignment_4_3_1 ) ) ;
    public final void rule__Highway__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1363:1: ( ( ( rule__Highway__InitCarsAssignment_4_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1364:1: ( ( rule__Highway__InitCarsAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1364:1: ( ( rule__Highway__InitCarsAssignment_4_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1365:1: ( rule__Highway__InitCarsAssignment_4_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitCarsAssignment_4_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1366:1: ( rule__Highway__InitCarsAssignment_4_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1366:2: rule__Highway__InitCarsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitCarsAssignment_4_3_1_in_rule__Highway__Group_4_3__1__Impl2747);
            rule__Highway__InitCarsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitCarsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_4_3__1__Impl"


    // $ANTLR start "rule__Highway__Group_5__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1380:1: rule__Highway__Group_5__0 : rule__Highway__Group_5__0__Impl rule__Highway__Group_5__1 ;
    public final void rule__Highway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1384:1: ( rule__Highway__Group_5__0__Impl rule__Highway__Group_5__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1385:2: rule__Highway__Group_5__0__Impl rule__Highway__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__0__Impl_in_rule__Highway__Group_5__02781);
            rule__Highway__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__1_in_rule__Highway__Group_5__02784);
            rule__Highway__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5__0"


    // $ANTLR start "rule__Highway__Group_5__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1392:1: rule__Highway__Group_5__0__Impl : ( 'initSegments' ) ;
    public final void rule__Highway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1396:1: ( ( 'initSegments' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1397:1: ( 'initSegments' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1397:1: ( 'initSegments' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1398:1: 'initSegments'
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsKeyword_5_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Highway__Group_5__0__Impl2812); 
             after(grammarAccess.getHighwayAccess().getInitSegmentsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5__0__Impl"


    // $ANTLR start "rule__Highway__Group_5__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1411:1: rule__Highway__Group_5__1 : rule__Highway__Group_5__1__Impl rule__Highway__Group_5__2 ;
    public final void rule__Highway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1415:1: ( rule__Highway__Group_5__1__Impl rule__Highway__Group_5__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1416:2: rule__Highway__Group_5__1__Impl rule__Highway__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__1__Impl_in_rule__Highway__Group_5__12843);
            rule__Highway__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__2_in_rule__Highway__Group_5__12846);
            rule__Highway__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5__1"


    // $ANTLR start "rule__Highway__Group_5__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1423:1: rule__Highway__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1427:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1428:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1428:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1429:1: '{'
            {
             before(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Highway__Group_5__1__Impl2874); 
             after(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5__1__Impl"


    // $ANTLR start "rule__Highway__Group_5__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1442:1: rule__Highway__Group_5__2 : rule__Highway__Group_5__2__Impl rule__Highway__Group_5__3 ;
    public final void rule__Highway__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1446:1: ( rule__Highway__Group_5__2__Impl rule__Highway__Group_5__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1447:2: rule__Highway__Group_5__2__Impl rule__Highway__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__2__Impl_in_rule__Highway__Group_5__22905);
            rule__Highway__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__3_in_rule__Highway__Group_5__22908);
            rule__Highway__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5__2"


    // $ANTLR start "rule__Highway__Group_5__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1454:1: rule__Highway__Group_5__2__Impl : ( ( rule__Highway__InitSegmentsAssignment_5_2 ) ) ;
    public final void rule__Highway__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1458:1: ( ( ( rule__Highway__InitSegmentsAssignment_5_2 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1459:1: ( ( rule__Highway__InitSegmentsAssignment_5_2 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1459:1: ( ( rule__Highway__InitSegmentsAssignment_5_2 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1460:1: ( rule__Highway__InitSegmentsAssignment_5_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsAssignment_5_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1461:1: ( rule__Highway__InitSegmentsAssignment_5_2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1461:2: rule__Highway__InitSegmentsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSegmentsAssignment_5_2_in_rule__Highway__Group_5__2__Impl2935);
            rule__Highway__InitSegmentsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitSegmentsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5__2__Impl"


    // $ANTLR start "rule__Highway__Group_5__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1471:1: rule__Highway__Group_5__3 : rule__Highway__Group_5__3__Impl rule__Highway__Group_5__4 ;
    public final void rule__Highway__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1475:1: ( rule__Highway__Group_5__3__Impl rule__Highway__Group_5__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1476:2: rule__Highway__Group_5__3__Impl rule__Highway__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__3__Impl_in_rule__Highway__Group_5__32965);
            rule__Highway__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__4_in_rule__Highway__Group_5__32968);
            rule__Highway__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5__3"


    // $ANTLR start "rule__Highway__Group_5__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1483:1: rule__Highway__Group_5__3__Impl : ( ( rule__Highway__Group_5_3__0 )* ) ;
    public final void rule__Highway__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1487:1: ( ( ( rule__Highway__Group_5_3__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1488:1: ( ( rule__Highway__Group_5_3__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1488:1: ( ( rule__Highway__Group_5_3__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1489:1: ( rule__Highway__Group_5_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_5_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1490:1: ( rule__Highway__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1490:2: rule__Highway__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5_3__0_in_rule__Highway__Group_5__3__Impl2995);
            	    rule__Highway__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getHighwayAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5__3__Impl"


    // $ANTLR start "rule__Highway__Group_5__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1500:1: rule__Highway__Group_5__4 : rule__Highway__Group_5__4__Impl ;
    public final void rule__Highway__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1504:1: ( rule__Highway__Group_5__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1505:2: rule__Highway__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__4__Impl_in_rule__Highway__Group_5__43026);
            rule__Highway__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5__4"


    // $ANTLR start "rule__Highway__Group_5__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1511:1: rule__Highway__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1515:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1516:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1516:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1517:1: '}'
            {
             before(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Highway__Group_5__4__Impl3054); 
             after(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5__4__Impl"


    // $ANTLR start "rule__Highway__Group_5_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1540:1: rule__Highway__Group_5_3__0 : rule__Highway__Group_5_3__0__Impl rule__Highway__Group_5_3__1 ;
    public final void rule__Highway__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1544:1: ( rule__Highway__Group_5_3__0__Impl rule__Highway__Group_5_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1545:2: rule__Highway__Group_5_3__0__Impl rule__Highway__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5_3__0__Impl_in_rule__Highway__Group_5_3__03095);
            rule__Highway__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5_3__1_in_rule__Highway__Group_5_3__03098);
            rule__Highway__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5_3__0"


    // $ANTLR start "rule__Highway__Group_5_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1552:1: rule__Highway__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1556:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1557:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1557:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1558:1: ','
            {
             before(grammarAccess.getHighwayAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Highway__Group_5_3__0__Impl3126); 
             after(grammarAccess.getHighwayAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5_3__0__Impl"


    // $ANTLR start "rule__Highway__Group_5_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1571:1: rule__Highway__Group_5_3__1 : rule__Highway__Group_5_3__1__Impl ;
    public final void rule__Highway__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1575:1: ( rule__Highway__Group_5_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1576:2: rule__Highway__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5_3__1__Impl_in_rule__Highway__Group_5_3__13157);
            rule__Highway__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5_3__1"


    // $ANTLR start "rule__Highway__Group_5_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1582:1: rule__Highway__Group_5_3__1__Impl : ( ( rule__Highway__InitSegmentsAssignment_5_3_1 ) ) ;
    public final void rule__Highway__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1586:1: ( ( ( rule__Highway__InitSegmentsAssignment_5_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1587:1: ( ( rule__Highway__InitSegmentsAssignment_5_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1587:1: ( ( rule__Highway__InitSegmentsAssignment_5_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1588:1: ( rule__Highway__InitSegmentsAssignment_5_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsAssignment_5_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1589:1: ( rule__Highway__InitSegmentsAssignment_5_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1589:2: rule__Highway__InitSegmentsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSegmentsAssignment_5_3_1_in_rule__Highway__Group_5_3__1__Impl3184);
            rule__Highway__InitSegmentsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitSegmentsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_5_3__1__Impl"


    // $ANTLR start "rule__Highway__Group_6__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1603:1: rule__Highway__Group_6__0 : rule__Highway__Group_6__0__Impl rule__Highway__Group_6__1 ;
    public final void rule__Highway__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1607:1: ( rule__Highway__Group_6__0__Impl rule__Highway__Group_6__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1608:2: rule__Highway__Group_6__0__Impl rule__Highway__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__0__Impl_in_rule__Highway__Group_6__03218);
            rule__Highway__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__1_in_rule__Highway__Group_6__03221);
            rule__Highway__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6__0"


    // $ANTLR start "rule__Highway__Group_6__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1615:1: rule__Highway__Group_6__0__Impl : ( 'initSemaphore' ) ;
    public final void rule__Highway__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1619:1: ( ( 'initSemaphore' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1620:1: ( 'initSemaphore' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1620:1: ( 'initSemaphore' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1621:1: 'initSemaphore'
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreKeyword_6_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Highway__Group_6__0__Impl3249); 
             after(grammarAccess.getHighwayAccess().getInitSemaphoreKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6__0__Impl"


    // $ANTLR start "rule__Highway__Group_6__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1634:1: rule__Highway__Group_6__1 : rule__Highway__Group_6__1__Impl rule__Highway__Group_6__2 ;
    public final void rule__Highway__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1638:1: ( rule__Highway__Group_6__1__Impl rule__Highway__Group_6__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1639:2: rule__Highway__Group_6__1__Impl rule__Highway__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__1__Impl_in_rule__Highway__Group_6__13280);
            rule__Highway__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__2_in_rule__Highway__Group_6__13283);
            rule__Highway__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6__1"


    // $ANTLR start "rule__Highway__Group_6__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1646:1: rule__Highway__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1650:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1651:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1651:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1652:1: '{'
            {
             before(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Highway__Group_6__1__Impl3311); 
             after(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6__1__Impl"


    // $ANTLR start "rule__Highway__Group_6__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1665:1: rule__Highway__Group_6__2 : rule__Highway__Group_6__2__Impl rule__Highway__Group_6__3 ;
    public final void rule__Highway__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1669:1: ( rule__Highway__Group_6__2__Impl rule__Highway__Group_6__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1670:2: rule__Highway__Group_6__2__Impl rule__Highway__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__2__Impl_in_rule__Highway__Group_6__23342);
            rule__Highway__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__3_in_rule__Highway__Group_6__23345);
            rule__Highway__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6__2"


    // $ANTLR start "rule__Highway__Group_6__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1677:1: rule__Highway__Group_6__2__Impl : ( ( rule__Highway__InitSemaphoreAssignment_6_2 ) ) ;
    public final void rule__Highway__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1681:1: ( ( ( rule__Highway__InitSemaphoreAssignment_6_2 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1682:1: ( ( rule__Highway__InitSemaphoreAssignment_6_2 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1682:1: ( ( rule__Highway__InitSemaphoreAssignment_6_2 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1683:1: ( rule__Highway__InitSemaphoreAssignment_6_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreAssignment_6_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1684:1: ( rule__Highway__InitSemaphoreAssignment_6_2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1684:2: rule__Highway__InitSemaphoreAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSemaphoreAssignment_6_2_in_rule__Highway__Group_6__2__Impl3372);
            rule__Highway__InitSemaphoreAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitSemaphoreAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6__2__Impl"


    // $ANTLR start "rule__Highway__Group_6__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1694:1: rule__Highway__Group_6__3 : rule__Highway__Group_6__3__Impl rule__Highway__Group_6__4 ;
    public final void rule__Highway__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1698:1: ( rule__Highway__Group_6__3__Impl rule__Highway__Group_6__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1699:2: rule__Highway__Group_6__3__Impl rule__Highway__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__3__Impl_in_rule__Highway__Group_6__33402);
            rule__Highway__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__4_in_rule__Highway__Group_6__33405);
            rule__Highway__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6__3"


    // $ANTLR start "rule__Highway__Group_6__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1706:1: rule__Highway__Group_6__3__Impl : ( ( rule__Highway__Group_6_3__0 )* ) ;
    public final void rule__Highway__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1710:1: ( ( ( rule__Highway__Group_6_3__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1711:1: ( ( rule__Highway__Group_6_3__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1711:1: ( ( rule__Highway__Group_6_3__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1712:1: ( rule__Highway__Group_6_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_6_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1713:1: ( rule__Highway__Group_6_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1713:2: rule__Highway__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6_3__0_in_rule__Highway__Group_6__3__Impl3432);
            	    rule__Highway__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getHighwayAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6__3__Impl"


    // $ANTLR start "rule__Highway__Group_6__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1723:1: rule__Highway__Group_6__4 : rule__Highway__Group_6__4__Impl ;
    public final void rule__Highway__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1727:1: ( rule__Highway__Group_6__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1728:2: rule__Highway__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__4__Impl_in_rule__Highway__Group_6__43463);
            rule__Highway__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6__4"


    // $ANTLR start "rule__Highway__Group_6__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1734:1: rule__Highway__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1738:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1739:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1739:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1740:1: '}'
            {
             before(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Highway__Group_6__4__Impl3491); 
             after(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6__4__Impl"


    // $ANTLR start "rule__Highway__Group_6_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1763:1: rule__Highway__Group_6_3__0 : rule__Highway__Group_6_3__0__Impl rule__Highway__Group_6_3__1 ;
    public final void rule__Highway__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1767:1: ( rule__Highway__Group_6_3__0__Impl rule__Highway__Group_6_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1768:2: rule__Highway__Group_6_3__0__Impl rule__Highway__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6_3__0__Impl_in_rule__Highway__Group_6_3__03532);
            rule__Highway__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6_3__1_in_rule__Highway__Group_6_3__03535);
            rule__Highway__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6_3__0"


    // $ANTLR start "rule__Highway__Group_6_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1775:1: rule__Highway__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1779:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1780:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1780:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1781:1: ','
            {
             before(grammarAccess.getHighwayAccess().getCommaKeyword_6_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Highway__Group_6_3__0__Impl3563); 
             after(grammarAccess.getHighwayAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6_3__0__Impl"


    // $ANTLR start "rule__Highway__Group_6_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1794:1: rule__Highway__Group_6_3__1 : rule__Highway__Group_6_3__1__Impl ;
    public final void rule__Highway__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1798:1: ( rule__Highway__Group_6_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1799:2: rule__Highway__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6_3__1__Impl_in_rule__Highway__Group_6_3__13594);
            rule__Highway__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6_3__1"


    // $ANTLR start "rule__Highway__Group_6_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1805:1: rule__Highway__Group_6_3__1__Impl : ( ( rule__Highway__InitSemaphoreAssignment_6_3_1 ) ) ;
    public final void rule__Highway__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1809:1: ( ( ( rule__Highway__InitSemaphoreAssignment_6_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1810:1: ( ( rule__Highway__InitSemaphoreAssignment_6_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1810:1: ( ( rule__Highway__InitSemaphoreAssignment_6_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1811:1: ( rule__Highway__InitSemaphoreAssignment_6_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreAssignment_6_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1812:1: ( rule__Highway__InitSemaphoreAssignment_6_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1812:2: rule__Highway__InitSemaphoreAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSemaphoreAssignment_6_3_1_in_rule__Highway__Group_6_3__1__Impl3621);
            rule__Highway__InitSemaphoreAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitSemaphoreAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_6_3__1__Impl"


    // $ANTLR start "rule__Highway__Group_7__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1826:1: rule__Highway__Group_7__0 : rule__Highway__Group_7__0__Impl rule__Highway__Group_7__1 ;
    public final void rule__Highway__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1830:1: ( rule__Highway__Group_7__0__Impl rule__Highway__Group_7__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1831:2: rule__Highway__Group_7__0__Impl rule__Highway__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__0__Impl_in_rule__Highway__Group_7__03655);
            rule__Highway__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__1_in_rule__Highway__Group_7__03658);
            rule__Highway__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7__0"


    // $ANTLR start "rule__Highway__Group_7__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1838:1: rule__Highway__Group_7__0__Impl : ( 'initSignal' ) ;
    public final void rule__Highway__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1842:1: ( ( 'initSignal' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1843:1: ( 'initSignal' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1843:1: ( 'initSignal' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1844:1: 'initSignal'
            {
             before(grammarAccess.getHighwayAccess().getInitSignalKeyword_7_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Highway__Group_7__0__Impl3686); 
             after(grammarAccess.getHighwayAccess().getInitSignalKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7__0__Impl"


    // $ANTLR start "rule__Highway__Group_7__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1857:1: rule__Highway__Group_7__1 : rule__Highway__Group_7__1__Impl rule__Highway__Group_7__2 ;
    public final void rule__Highway__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1861:1: ( rule__Highway__Group_7__1__Impl rule__Highway__Group_7__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1862:2: rule__Highway__Group_7__1__Impl rule__Highway__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__1__Impl_in_rule__Highway__Group_7__13717);
            rule__Highway__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__2_in_rule__Highway__Group_7__13720);
            rule__Highway__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7__1"


    // $ANTLR start "rule__Highway__Group_7__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1869:1: rule__Highway__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1873:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1874:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1874:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1875:1: '{'
            {
             before(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Highway__Group_7__1__Impl3748); 
             after(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7__1__Impl"


    // $ANTLR start "rule__Highway__Group_7__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1888:1: rule__Highway__Group_7__2 : rule__Highway__Group_7__2__Impl rule__Highway__Group_7__3 ;
    public final void rule__Highway__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1892:1: ( rule__Highway__Group_7__2__Impl rule__Highway__Group_7__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1893:2: rule__Highway__Group_7__2__Impl rule__Highway__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__2__Impl_in_rule__Highway__Group_7__23779);
            rule__Highway__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__3_in_rule__Highway__Group_7__23782);
            rule__Highway__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7__2"


    // $ANTLR start "rule__Highway__Group_7__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1900:1: rule__Highway__Group_7__2__Impl : ( ( rule__Highway__InitSignalAssignment_7_2 ) ) ;
    public final void rule__Highway__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1904:1: ( ( ( rule__Highway__InitSignalAssignment_7_2 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1905:1: ( ( rule__Highway__InitSignalAssignment_7_2 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1905:1: ( ( rule__Highway__InitSignalAssignment_7_2 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1906:1: ( rule__Highway__InitSignalAssignment_7_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitSignalAssignment_7_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1907:1: ( rule__Highway__InitSignalAssignment_7_2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1907:2: rule__Highway__InitSignalAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSignalAssignment_7_2_in_rule__Highway__Group_7__2__Impl3809);
            rule__Highway__InitSignalAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitSignalAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7__2__Impl"


    // $ANTLR start "rule__Highway__Group_7__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1917:1: rule__Highway__Group_7__3 : rule__Highway__Group_7__3__Impl rule__Highway__Group_7__4 ;
    public final void rule__Highway__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1921:1: ( rule__Highway__Group_7__3__Impl rule__Highway__Group_7__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1922:2: rule__Highway__Group_7__3__Impl rule__Highway__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__3__Impl_in_rule__Highway__Group_7__33839);
            rule__Highway__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__4_in_rule__Highway__Group_7__33842);
            rule__Highway__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7__3"


    // $ANTLR start "rule__Highway__Group_7__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1929:1: rule__Highway__Group_7__3__Impl : ( ( rule__Highway__Group_7_3__0 )* ) ;
    public final void rule__Highway__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1933:1: ( ( ( rule__Highway__Group_7_3__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1934:1: ( ( rule__Highway__Group_7_3__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1934:1: ( ( rule__Highway__Group_7_3__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1935:1: ( rule__Highway__Group_7_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_7_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1936:1: ( rule__Highway__Group_7_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1936:2: rule__Highway__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7_3__0_in_rule__Highway__Group_7__3__Impl3869);
            	    rule__Highway__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getHighwayAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7__3__Impl"


    // $ANTLR start "rule__Highway__Group_7__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1946:1: rule__Highway__Group_7__4 : rule__Highway__Group_7__4__Impl ;
    public final void rule__Highway__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1950:1: ( rule__Highway__Group_7__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1951:2: rule__Highway__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__4__Impl_in_rule__Highway__Group_7__43900);
            rule__Highway__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7__4"


    // $ANTLR start "rule__Highway__Group_7__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1957:1: rule__Highway__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1961:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1962:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1962:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1963:1: '}'
            {
             before(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Highway__Group_7__4__Impl3928); 
             after(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7__4__Impl"


    // $ANTLR start "rule__Highway__Group_7_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1986:1: rule__Highway__Group_7_3__0 : rule__Highway__Group_7_3__0__Impl rule__Highway__Group_7_3__1 ;
    public final void rule__Highway__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1990:1: ( rule__Highway__Group_7_3__0__Impl rule__Highway__Group_7_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1991:2: rule__Highway__Group_7_3__0__Impl rule__Highway__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7_3__0__Impl_in_rule__Highway__Group_7_3__03969);
            rule__Highway__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7_3__1_in_rule__Highway__Group_7_3__03972);
            rule__Highway__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7_3__0"


    // $ANTLR start "rule__Highway__Group_7_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:1998:1: rule__Highway__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2002:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2003:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2003:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2004:1: ','
            {
             before(grammarAccess.getHighwayAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Highway__Group_7_3__0__Impl4000); 
             after(grammarAccess.getHighwayAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7_3__0__Impl"


    // $ANTLR start "rule__Highway__Group_7_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2017:1: rule__Highway__Group_7_3__1 : rule__Highway__Group_7_3__1__Impl ;
    public final void rule__Highway__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2021:1: ( rule__Highway__Group_7_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2022:2: rule__Highway__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7_3__1__Impl_in_rule__Highway__Group_7_3__14031);
            rule__Highway__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7_3__1"


    // $ANTLR start "rule__Highway__Group_7_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2028:1: rule__Highway__Group_7_3__1__Impl : ( ( rule__Highway__InitSignalAssignment_7_3_1 ) ) ;
    public final void rule__Highway__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2032:1: ( ( ( rule__Highway__InitSignalAssignment_7_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2033:1: ( ( rule__Highway__InitSignalAssignment_7_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2033:1: ( ( rule__Highway__InitSignalAssignment_7_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2034:1: ( rule__Highway__InitSignalAssignment_7_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitSignalAssignment_7_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2035:1: ( rule__Highway__InitSignalAssignment_7_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2035:2: rule__Highway__InitSignalAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSignalAssignment_7_3_1_in_rule__Highway__Group_7_3__1__Impl4058);
            rule__Highway__InitSignalAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitSignalAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__Group_7_3__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2049:1: rule__Node_Impl__Group__0 : rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1 ;
    public final void rule__Node_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2053:1: ( rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2054:2: rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__0__Impl_in_rule__Node_Impl__Group__04092);
            rule__Node_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__1_in_rule__Node_Impl__Group__04095);
            rule__Node_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__0"


    // $ANTLR start "rule__Node_Impl__Group__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2061:1: rule__Node_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Node_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2065:1: ( ( () ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2066:1: ( () )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2066:1: ( () )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2067:1: ()
            {
             before(grammarAccess.getNode_ImplAccess().getNodeAction_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2068:1: ()
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2070:1: 
            {
            }

             after(grammarAccess.getNode_ImplAccess().getNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2080:1: rule__Node_Impl__Group__1 : rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2 ;
    public final void rule__Node_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2084:1: ( rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2085:2: rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__1__Impl_in_rule__Node_Impl__Group__14153);
            rule__Node_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__2_in_rule__Node_Impl__Group__14156);
            rule__Node_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__1"


    // $ANTLR start "rule__Node_Impl__Group__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2092:1: rule__Node_Impl__Group__1__Impl : ( 'Node' ) ;
    public final void rule__Node_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2096:1: ( ( 'Node' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2097:1: ( 'Node' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2097:1: ( 'Node' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2098:1: 'Node'
            {
             before(grammarAccess.getNode_ImplAccess().getNodeKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Node_Impl__Group__1__Impl4184); 
             after(grammarAccess.getNode_ImplAccess().getNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2111:1: rule__Node_Impl__Group__2 : rule__Node_Impl__Group__2__Impl rule__Node_Impl__Group__3 ;
    public final void rule__Node_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2115:1: ( rule__Node_Impl__Group__2__Impl rule__Node_Impl__Group__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2116:2: rule__Node_Impl__Group__2__Impl rule__Node_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__2__Impl_in_rule__Node_Impl__Group__24215);
            rule__Node_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__3_in_rule__Node_Impl__Group__24218);
            rule__Node_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__2"


    // $ANTLR start "rule__Node_Impl__Group__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2123:1: rule__Node_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Node_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2127:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2128:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2128:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2129:1: '{'
            {
             before(grammarAccess.getNode_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Node_Impl__Group__2__Impl4246); 
             after(grammarAccess.getNode_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__2__Impl"


    // $ANTLR start "rule__Node_Impl__Group__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2142:1: rule__Node_Impl__Group__3 : rule__Node_Impl__Group__3__Impl rule__Node_Impl__Group__4 ;
    public final void rule__Node_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2146:1: ( rule__Node_Impl__Group__3__Impl rule__Node_Impl__Group__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2147:2: rule__Node_Impl__Group__3__Impl rule__Node_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__3__Impl_in_rule__Node_Impl__Group__34277);
            rule__Node_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__4_in_rule__Node_Impl__Group__34280);
            rule__Node_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__3"


    // $ANTLR start "rule__Node_Impl__Group__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2154:1: rule__Node_Impl__Group__3__Impl : ( 'hasStarts' ) ;
    public final void rule__Node_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2158:1: ( ( 'hasStarts' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2159:1: ( 'hasStarts' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2159:1: ( 'hasStarts' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2160:1: 'hasStarts'
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Node_Impl__Group__3__Impl4308); 
             after(grammarAccess.getNode_ImplAccess().getHasStartsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__3__Impl"


    // $ANTLR start "rule__Node_Impl__Group__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2173:1: rule__Node_Impl__Group__4 : rule__Node_Impl__Group__4__Impl rule__Node_Impl__Group__5 ;
    public final void rule__Node_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2177:1: ( rule__Node_Impl__Group__4__Impl rule__Node_Impl__Group__5 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2178:2: rule__Node_Impl__Group__4__Impl rule__Node_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__4__Impl_in_rule__Node_Impl__Group__44339);
            rule__Node_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__5_in_rule__Node_Impl__Group__44342);
            rule__Node_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__4"


    // $ANTLR start "rule__Node_Impl__Group__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2185:1: rule__Node_Impl__Group__4__Impl : ( '(' ) ;
    public final void rule__Node_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2189:1: ( ( '(' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2190:1: ( '(' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2190:1: ( '(' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2191:1: '('
            {
             before(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Node_Impl__Group__4__Impl4370); 
             after(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__4__Impl"


    // $ANTLR start "rule__Node_Impl__Group__5"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2204:1: rule__Node_Impl__Group__5 : rule__Node_Impl__Group__5__Impl rule__Node_Impl__Group__6 ;
    public final void rule__Node_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2208:1: ( rule__Node_Impl__Group__5__Impl rule__Node_Impl__Group__6 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2209:2: rule__Node_Impl__Group__5__Impl rule__Node_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__5__Impl_in_rule__Node_Impl__Group__54401);
            rule__Node_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__6_in_rule__Node_Impl__Group__54404);
            rule__Node_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__5"


    // $ANTLR start "rule__Node_Impl__Group__5__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2216:1: rule__Node_Impl__Group__5__Impl : ( ( rule__Node_Impl__HasStartsAssignment_5 ) ) ;
    public final void rule__Node_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2220:1: ( ( ( rule__Node_Impl__HasStartsAssignment_5 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2221:1: ( ( rule__Node_Impl__HasStartsAssignment_5 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2221:1: ( ( rule__Node_Impl__HasStartsAssignment_5 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2222:1: ( rule__Node_Impl__HasStartsAssignment_5 )
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsAssignment_5()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2223:1: ( rule__Node_Impl__HasStartsAssignment_5 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2223:2: rule__Node_Impl__HasStartsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__HasStartsAssignment_5_in_rule__Node_Impl__Group__5__Impl4431);
            rule__Node_Impl__HasStartsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getHasStartsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__5__Impl"


    // $ANTLR start "rule__Node_Impl__Group__6"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2233:1: rule__Node_Impl__Group__6 : rule__Node_Impl__Group__6__Impl rule__Node_Impl__Group__7 ;
    public final void rule__Node_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2237:1: ( rule__Node_Impl__Group__6__Impl rule__Node_Impl__Group__7 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2238:2: rule__Node_Impl__Group__6__Impl rule__Node_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__6__Impl_in_rule__Node_Impl__Group__64461);
            rule__Node_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__7_in_rule__Node_Impl__Group__64464);
            rule__Node_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__6"


    // $ANTLR start "rule__Node_Impl__Group__6__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2245:1: rule__Node_Impl__Group__6__Impl : ( ( rule__Node_Impl__Group_6__0 )* ) ;
    public final void rule__Node_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2249:1: ( ( ( rule__Node_Impl__Group_6__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2250:1: ( ( rule__Node_Impl__Group_6__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2250:1: ( ( rule__Node_Impl__Group_6__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2251:1: ( rule__Node_Impl__Group_6__0 )*
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_6()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2252:1: ( rule__Node_Impl__Group_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2252:2: rule__Node_Impl__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_6__0_in_rule__Node_Impl__Group__6__Impl4491);
            	    rule__Node_Impl__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getNode_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__6__Impl"


    // $ANTLR start "rule__Node_Impl__Group__7"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2262:1: rule__Node_Impl__Group__7 : rule__Node_Impl__Group__7__Impl rule__Node_Impl__Group__8 ;
    public final void rule__Node_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2266:1: ( rule__Node_Impl__Group__7__Impl rule__Node_Impl__Group__8 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2267:2: rule__Node_Impl__Group__7__Impl rule__Node_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__7__Impl_in_rule__Node_Impl__Group__74522);
            rule__Node_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__8_in_rule__Node_Impl__Group__74525);
            rule__Node_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__7"


    // $ANTLR start "rule__Node_Impl__Group__7__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2274:1: rule__Node_Impl__Group__7__Impl : ( ')' ) ;
    public final void rule__Node_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2278:1: ( ( ')' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2279:1: ( ')' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2279:1: ( ')' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2280:1: ')'
            {
             before(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Node_Impl__Group__7__Impl4553); 
             after(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__7__Impl"


    // $ANTLR start "rule__Node_Impl__Group__8"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2293:1: rule__Node_Impl__Group__8 : rule__Node_Impl__Group__8__Impl rule__Node_Impl__Group__9 ;
    public final void rule__Node_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2297:1: ( rule__Node_Impl__Group__8__Impl rule__Node_Impl__Group__9 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2298:2: rule__Node_Impl__Group__8__Impl rule__Node_Impl__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__8__Impl_in_rule__Node_Impl__Group__84584);
            rule__Node_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__9_in_rule__Node_Impl__Group__84587);
            rule__Node_Impl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__8"


    // $ANTLR start "rule__Node_Impl__Group__8__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2305:1: rule__Node_Impl__Group__8__Impl : ( 'hasEnds' ) ;
    public final void rule__Node_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2309:1: ( ( 'hasEnds' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2310:1: ( 'hasEnds' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2310:1: ( 'hasEnds' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2311:1: 'hasEnds'
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsKeyword_8()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Node_Impl__Group__8__Impl4615); 
             after(grammarAccess.getNode_ImplAccess().getHasEndsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__8__Impl"


    // $ANTLR start "rule__Node_Impl__Group__9"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2324:1: rule__Node_Impl__Group__9 : rule__Node_Impl__Group__9__Impl rule__Node_Impl__Group__10 ;
    public final void rule__Node_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2328:1: ( rule__Node_Impl__Group__9__Impl rule__Node_Impl__Group__10 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2329:2: rule__Node_Impl__Group__9__Impl rule__Node_Impl__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__9__Impl_in_rule__Node_Impl__Group__94646);
            rule__Node_Impl__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__10_in_rule__Node_Impl__Group__94649);
            rule__Node_Impl__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__9"


    // $ANTLR start "rule__Node_Impl__Group__9__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2336:1: rule__Node_Impl__Group__9__Impl : ( '(' ) ;
    public final void rule__Node_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2340:1: ( ( '(' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2341:1: ( '(' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2341:1: ( '(' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2342:1: '('
            {
             before(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_9()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Node_Impl__Group__9__Impl4677); 
             after(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__9__Impl"


    // $ANTLR start "rule__Node_Impl__Group__10"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2355:1: rule__Node_Impl__Group__10 : rule__Node_Impl__Group__10__Impl rule__Node_Impl__Group__11 ;
    public final void rule__Node_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2359:1: ( rule__Node_Impl__Group__10__Impl rule__Node_Impl__Group__11 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2360:2: rule__Node_Impl__Group__10__Impl rule__Node_Impl__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__10__Impl_in_rule__Node_Impl__Group__104708);
            rule__Node_Impl__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__11_in_rule__Node_Impl__Group__104711);
            rule__Node_Impl__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__10"


    // $ANTLR start "rule__Node_Impl__Group__10__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2367:1: rule__Node_Impl__Group__10__Impl : ( ( rule__Node_Impl__HasEndsAssignment_10 ) ) ;
    public final void rule__Node_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2371:1: ( ( ( rule__Node_Impl__HasEndsAssignment_10 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2372:1: ( ( rule__Node_Impl__HasEndsAssignment_10 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2372:1: ( ( rule__Node_Impl__HasEndsAssignment_10 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2373:1: ( rule__Node_Impl__HasEndsAssignment_10 )
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsAssignment_10()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2374:1: ( rule__Node_Impl__HasEndsAssignment_10 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2374:2: rule__Node_Impl__HasEndsAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__HasEndsAssignment_10_in_rule__Node_Impl__Group__10__Impl4738);
            rule__Node_Impl__HasEndsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getHasEndsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__10__Impl"


    // $ANTLR start "rule__Node_Impl__Group__11"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2384:1: rule__Node_Impl__Group__11 : rule__Node_Impl__Group__11__Impl rule__Node_Impl__Group__12 ;
    public final void rule__Node_Impl__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2388:1: ( rule__Node_Impl__Group__11__Impl rule__Node_Impl__Group__12 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2389:2: rule__Node_Impl__Group__11__Impl rule__Node_Impl__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__11__Impl_in_rule__Node_Impl__Group__114768);
            rule__Node_Impl__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__12_in_rule__Node_Impl__Group__114771);
            rule__Node_Impl__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__11"


    // $ANTLR start "rule__Node_Impl__Group__11__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2396:1: rule__Node_Impl__Group__11__Impl : ( ( rule__Node_Impl__Group_11__0 )* ) ;
    public final void rule__Node_Impl__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2400:1: ( ( ( rule__Node_Impl__Group_11__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2401:1: ( ( rule__Node_Impl__Group_11__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2401:1: ( ( rule__Node_Impl__Group_11__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2402:1: ( rule__Node_Impl__Group_11__0 )*
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_11()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2403:1: ( rule__Node_Impl__Group_11__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2403:2: rule__Node_Impl__Group_11__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_11__0_in_rule__Node_Impl__Group__11__Impl4798);
            	    rule__Node_Impl__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getNode_ImplAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__11__Impl"


    // $ANTLR start "rule__Node_Impl__Group__12"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2413:1: rule__Node_Impl__Group__12 : rule__Node_Impl__Group__12__Impl rule__Node_Impl__Group__13 ;
    public final void rule__Node_Impl__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2417:1: ( rule__Node_Impl__Group__12__Impl rule__Node_Impl__Group__13 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2418:2: rule__Node_Impl__Group__12__Impl rule__Node_Impl__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__12__Impl_in_rule__Node_Impl__Group__124829);
            rule__Node_Impl__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__13_in_rule__Node_Impl__Group__124832);
            rule__Node_Impl__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__12"


    // $ANTLR start "rule__Node_Impl__Group__12__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2425:1: rule__Node_Impl__Group__12__Impl : ( ')' ) ;
    public final void rule__Node_Impl__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2429:1: ( ( ')' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2430:1: ( ')' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2430:1: ( ')' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2431:1: ')'
            {
             before(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_12()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Node_Impl__Group__12__Impl4860); 
             after(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__12__Impl"


    // $ANTLR start "rule__Node_Impl__Group__13"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2444:1: rule__Node_Impl__Group__13 : rule__Node_Impl__Group__13__Impl rule__Node_Impl__Group__14 ;
    public final void rule__Node_Impl__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2448:1: ( rule__Node_Impl__Group__13__Impl rule__Node_Impl__Group__14 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2449:2: rule__Node_Impl__Group__13__Impl rule__Node_Impl__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__13__Impl_in_rule__Node_Impl__Group__134891);
            rule__Node_Impl__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__14_in_rule__Node_Impl__Group__134894);
            rule__Node_Impl__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__13"


    // $ANTLR start "rule__Node_Impl__Group__13__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2456:1: rule__Node_Impl__Group__13__Impl : ( ( rule__Node_Impl__Group_13__0 )? ) ;
    public final void rule__Node_Impl__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2460:1: ( ( ( rule__Node_Impl__Group_13__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2461:1: ( ( rule__Node_Impl__Group_13__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2461:1: ( ( rule__Node_Impl__Group_13__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2462:1: ( rule__Node_Impl__Group_13__0 )?
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_13()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2463:1: ( rule__Node_Impl__Group_13__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2463:2: rule__Node_Impl__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_13__0_in_rule__Node_Impl__Group__13__Impl4921);
                    rule__Node_Impl__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNode_ImplAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__13__Impl"


    // $ANTLR start "rule__Node_Impl__Group__14"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2473:1: rule__Node_Impl__Group__14 : rule__Node_Impl__Group__14__Impl rule__Node_Impl__Group__15 ;
    public final void rule__Node_Impl__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2477:1: ( rule__Node_Impl__Group__14__Impl rule__Node_Impl__Group__15 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2478:2: rule__Node_Impl__Group__14__Impl rule__Node_Impl__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__14__Impl_in_rule__Node_Impl__Group__144952);
            rule__Node_Impl__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__15_in_rule__Node_Impl__Group__144955);
            rule__Node_Impl__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__14"


    // $ANTLR start "rule__Node_Impl__Group__14__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2485:1: rule__Node_Impl__Group__14__Impl : ( ( rule__Node_Impl__Group_14__0 )? ) ;
    public final void rule__Node_Impl__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2489:1: ( ( ( rule__Node_Impl__Group_14__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2490:1: ( ( rule__Node_Impl__Group_14__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2490:1: ( ( rule__Node_Impl__Group_14__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2491:1: ( rule__Node_Impl__Group_14__0 )?
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_14()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2492:1: ( rule__Node_Impl__Group_14__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2492:2: rule__Node_Impl__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__0_in_rule__Node_Impl__Group__14__Impl4982);
                    rule__Node_Impl__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNode_ImplAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__14__Impl"


    // $ANTLR start "rule__Node_Impl__Group__15"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2502:1: rule__Node_Impl__Group__15 : rule__Node_Impl__Group__15__Impl ;
    public final void rule__Node_Impl__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2506:1: ( rule__Node_Impl__Group__15__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2507:2: rule__Node_Impl__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__15__Impl_in_rule__Node_Impl__Group__155013);
            rule__Node_Impl__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__15"


    // $ANTLR start "rule__Node_Impl__Group__15__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2513:1: rule__Node_Impl__Group__15__Impl : ( '}' ) ;
    public final void rule__Node_Impl__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2517:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2518:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2518:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2519:1: '}'
            {
             before(grammarAccess.getNode_ImplAccess().getRightCurlyBracketKeyword_15()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Node_Impl__Group__15__Impl5041); 
             after(grammarAccess.getNode_ImplAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__15__Impl"


    // $ANTLR start "rule__Node_Impl__Group_6__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2564:1: rule__Node_Impl__Group_6__0 : rule__Node_Impl__Group_6__0__Impl rule__Node_Impl__Group_6__1 ;
    public final void rule__Node_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2568:1: ( rule__Node_Impl__Group_6__0__Impl rule__Node_Impl__Group_6__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2569:2: rule__Node_Impl__Group_6__0__Impl rule__Node_Impl__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_6__0__Impl_in_rule__Node_Impl__Group_6__05104);
            rule__Node_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_6__1_in_rule__Node_Impl__Group_6__05107);
            rule__Node_Impl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_6__0"


    // $ANTLR start "rule__Node_Impl__Group_6__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2576:1: rule__Node_Impl__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Node_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2580:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2581:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2581:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2582:1: ','
            {
             before(grammarAccess.getNode_ImplAccess().getCommaKeyword_6_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Node_Impl__Group_6__0__Impl5135); 
             after(grammarAccess.getNode_ImplAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_6__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2595:1: rule__Node_Impl__Group_6__1 : rule__Node_Impl__Group_6__1__Impl ;
    public final void rule__Node_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2599:1: ( rule__Node_Impl__Group_6__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2600:2: rule__Node_Impl__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_6__1__Impl_in_rule__Node_Impl__Group_6__15166);
            rule__Node_Impl__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_6__1"


    // $ANTLR start "rule__Node_Impl__Group_6__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2606:1: rule__Node_Impl__Group_6__1__Impl : ( ( rule__Node_Impl__HasStartsAssignment_6_1 ) ) ;
    public final void rule__Node_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2610:1: ( ( ( rule__Node_Impl__HasStartsAssignment_6_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2611:1: ( ( rule__Node_Impl__HasStartsAssignment_6_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2611:1: ( ( rule__Node_Impl__HasStartsAssignment_6_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2612:1: ( rule__Node_Impl__HasStartsAssignment_6_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsAssignment_6_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2613:1: ( rule__Node_Impl__HasStartsAssignment_6_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2613:2: rule__Node_Impl__HasStartsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__HasStartsAssignment_6_1_in_rule__Node_Impl__Group_6__1__Impl5193);
            rule__Node_Impl__HasStartsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getHasStartsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group_11__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2627:1: rule__Node_Impl__Group_11__0 : rule__Node_Impl__Group_11__0__Impl rule__Node_Impl__Group_11__1 ;
    public final void rule__Node_Impl__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2631:1: ( rule__Node_Impl__Group_11__0__Impl rule__Node_Impl__Group_11__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2632:2: rule__Node_Impl__Group_11__0__Impl rule__Node_Impl__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_11__0__Impl_in_rule__Node_Impl__Group_11__05227);
            rule__Node_Impl__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_11__1_in_rule__Node_Impl__Group_11__05230);
            rule__Node_Impl__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_11__0"


    // $ANTLR start "rule__Node_Impl__Group_11__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2639:1: rule__Node_Impl__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Node_Impl__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2643:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2644:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2644:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2645:1: ','
            {
             before(grammarAccess.getNode_ImplAccess().getCommaKeyword_11_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Node_Impl__Group_11__0__Impl5258); 
             after(grammarAccess.getNode_ImplAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_11__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_11__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2658:1: rule__Node_Impl__Group_11__1 : rule__Node_Impl__Group_11__1__Impl ;
    public final void rule__Node_Impl__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2662:1: ( rule__Node_Impl__Group_11__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2663:2: rule__Node_Impl__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_11__1__Impl_in_rule__Node_Impl__Group_11__15289);
            rule__Node_Impl__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_11__1"


    // $ANTLR start "rule__Node_Impl__Group_11__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2669:1: rule__Node_Impl__Group_11__1__Impl : ( ( rule__Node_Impl__HasEndsAssignment_11_1 ) ) ;
    public final void rule__Node_Impl__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2673:1: ( ( ( rule__Node_Impl__HasEndsAssignment_11_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2674:1: ( ( rule__Node_Impl__HasEndsAssignment_11_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2674:1: ( ( rule__Node_Impl__HasEndsAssignment_11_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2675:1: ( rule__Node_Impl__HasEndsAssignment_11_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsAssignment_11_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2676:1: ( rule__Node_Impl__HasEndsAssignment_11_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2676:2: rule__Node_Impl__HasEndsAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__HasEndsAssignment_11_1_in_rule__Node_Impl__Group_11__1__Impl5316);
            rule__Node_Impl__HasEndsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getHasEndsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_11__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group_13__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2690:1: rule__Node_Impl__Group_13__0 : rule__Node_Impl__Group_13__0__Impl rule__Node_Impl__Group_13__1 ;
    public final void rule__Node_Impl__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2694:1: ( rule__Node_Impl__Group_13__0__Impl rule__Node_Impl__Group_13__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2695:2: rule__Node_Impl__Group_13__0__Impl rule__Node_Impl__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_13__0__Impl_in_rule__Node_Impl__Group_13__05350);
            rule__Node_Impl__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_13__1_in_rule__Node_Impl__Group_13__05353);
            rule__Node_Impl__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_13__0"


    // $ANTLR start "rule__Node_Impl__Group_13__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2702:1: rule__Node_Impl__Group_13__0__Impl : ( 'semaphore' ) ;
    public final void rule__Node_Impl__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2706:1: ( ( 'semaphore' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2707:1: ( 'semaphore' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2707:1: ( 'semaphore' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2708:1: 'semaphore'
            {
             before(grammarAccess.getNode_ImplAccess().getSemaphoreKeyword_13_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Node_Impl__Group_13__0__Impl5381); 
             after(grammarAccess.getNode_ImplAccess().getSemaphoreKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_13__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_13__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2721:1: rule__Node_Impl__Group_13__1 : rule__Node_Impl__Group_13__1__Impl ;
    public final void rule__Node_Impl__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2725:1: ( rule__Node_Impl__Group_13__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2726:2: rule__Node_Impl__Group_13__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_13__1__Impl_in_rule__Node_Impl__Group_13__15412);
            rule__Node_Impl__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_13__1"


    // $ANTLR start "rule__Node_Impl__Group_13__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2732:1: rule__Node_Impl__Group_13__1__Impl : ( ( rule__Node_Impl__SemaphoreAssignment_13_1 ) ) ;
    public final void rule__Node_Impl__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2736:1: ( ( ( rule__Node_Impl__SemaphoreAssignment_13_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2737:1: ( ( rule__Node_Impl__SemaphoreAssignment_13_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2737:1: ( ( rule__Node_Impl__SemaphoreAssignment_13_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2738:1: ( rule__Node_Impl__SemaphoreAssignment_13_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getSemaphoreAssignment_13_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2739:1: ( rule__Node_Impl__SemaphoreAssignment_13_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2739:2: rule__Node_Impl__SemaphoreAssignment_13_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__SemaphoreAssignment_13_1_in_rule__Node_Impl__Group_13__1__Impl5439);
            rule__Node_Impl__SemaphoreAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getSemaphoreAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_13__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group_14__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2753:1: rule__Node_Impl__Group_14__0 : rule__Node_Impl__Group_14__0__Impl rule__Node_Impl__Group_14__1 ;
    public final void rule__Node_Impl__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2757:1: ( rule__Node_Impl__Group_14__0__Impl rule__Node_Impl__Group_14__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2758:2: rule__Node_Impl__Group_14__0__Impl rule__Node_Impl__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__0__Impl_in_rule__Node_Impl__Group_14__05473);
            rule__Node_Impl__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__1_in_rule__Node_Impl__Group_14__05476);
            rule__Node_Impl__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14__0"


    // $ANTLR start "rule__Node_Impl__Group_14__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2765:1: rule__Node_Impl__Group_14__0__Impl : ( 'signals' ) ;
    public final void rule__Node_Impl__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2769:1: ( ( 'signals' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2770:1: ( 'signals' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2770:1: ( 'signals' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2771:1: 'signals'
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsKeyword_14_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Node_Impl__Group_14__0__Impl5504); 
             after(grammarAccess.getNode_ImplAccess().getSignalsKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_14__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2784:1: rule__Node_Impl__Group_14__1 : rule__Node_Impl__Group_14__1__Impl rule__Node_Impl__Group_14__2 ;
    public final void rule__Node_Impl__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2788:1: ( rule__Node_Impl__Group_14__1__Impl rule__Node_Impl__Group_14__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2789:2: rule__Node_Impl__Group_14__1__Impl rule__Node_Impl__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__1__Impl_in_rule__Node_Impl__Group_14__15535);
            rule__Node_Impl__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__2_in_rule__Node_Impl__Group_14__15538);
            rule__Node_Impl__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14__1"


    // $ANTLR start "rule__Node_Impl__Group_14__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2796:1: rule__Node_Impl__Group_14__1__Impl : ( '(' ) ;
    public final void rule__Node_Impl__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2800:1: ( ( '(' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2801:1: ( '(' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2801:1: ( '(' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2802:1: '('
            {
             before(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_14_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Node_Impl__Group_14__1__Impl5566); 
             after(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group_14__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2815:1: rule__Node_Impl__Group_14__2 : rule__Node_Impl__Group_14__2__Impl rule__Node_Impl__Group_14__3 ;
    public final void rule__Node_Impl__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2819:1: ( rule__Node_Impl__Group_14__2__Impl rule__Node_Impl__Group_14__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2820:2: rule__Node_Impl__Group_14__2__Impl rule__Node_Impl__Group_14__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__2__Impl_in_rule__Node_Impl__Group_14__25597);
            rule__Node_Impl__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__3_in_rule__Node_Impl__Group_14__25600);
            rule__Node_Impl__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14__2"


    // $ANTLR start "rule__Node_Impl__Group_14__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2827:1: rule__Node_Impl__Group_14__2__Impl : ( ( rule__Node_Impl__SignalsAssignment_14_2 ) ) ;
    public final void rule__Node_Impl__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2831:1: ( ( ( rule__Node_Impl__SignalsAssignment_14_2 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2832:1: ( ( rule__Node_Impl__SignalsAssignment_14_2 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2832:1: ( ( rule__Node_Impl__SignalsAssignment_14_2 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2833:1: ( rule__Node_Impl__SignalsAssignment_14_2 )
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsAssignment_14_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2834:1: ( rule__Node_Impl__SignalsAssignment_14_2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2834:2: rule__Node_Impl__SignalsAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__SignalsAssignment_14_2_in_rule__Node_Impl__Group_14__2__Impl5627);
            rule__Node_Impl__SignalsAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getSignalsAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14__2__Impl"


    // $ANTLR start "rule__Node_Impl__Group_14__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2844:1: rule__Node_Impl__Group_14__3 : rule__Node_Impl__Group_14__3__Impl rule__Node_Impl__Group_14__4 ;
    public final void rule__Node_Impl__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2848:1: ( rule__Node_Impl__Group_14__3__Impl rule__Node_Impl__Group_14__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2849:2: rule__Node_Impl__Group_14__3__Impl rule__Node_Impl__Group_14__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__3__Impl_in_rule__Node_Impl__Group_14__35657);
            rule__Node_Impl__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__4_in_rule__Node_Impl__Group_14__35660);
            rule__Node_Impl__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14__3"


    // $ANTLR start "rule__Node_Impl__Group_14__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2856:1: rule__Node_Impl__Group_14__3__Impl : ( ( rule__Node_Impl__Group_14_3__0 )* ) ;
    public final void rule__Node_Impl__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2860:1: ( ( ( rule__Node_Impl__Group_14_3__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2861:1: ( ( rule__Node_Impl__Group_14_3__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2861:1: ( ( rule__Node_Impl__Group_14_3__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2862:1: ( rule__Node_Impl__Group_14_3__0 )*
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_14_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2863:1: ( rule__Node_Impl__Group_14_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2863:2: rule__Node_Impl__Group_14_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14_3__0_in_rule__Node_Impl__Group_14__3__Impl5687);
            	    rule__Node_Impl__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getNode_ImplAccess().getGroup_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14__3__Impl"


    // $ANTLR start "rule__Node_Impl__Group_14__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2873:1: rule__Node_Impl__Group_14__4 : rule__Node_Impl__Group_14__4__Impl ;
    public final void rule__Node_Impl__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2877:1: ( rule__Node_Impl__Group_14__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2878:2: rule__Node_Impl__Group_14__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__4__Impl_in_rule__Node_Impl__Group_14__45718);
            rule__Node_Impl__Group_14__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14__4"


    // $ANTLR start "rule__Node_Impl__Group_14__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2884:1: rule__Node_Impl__Group_14__4__Impl : ( ')' ) ;
    public final void rule__Node_Impl__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2888:1: ( ( ')' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2889:1: ( ')' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2889:1: ( ')' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2890:1: ')'
            {
             before(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_14_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Node_Impl__Group_14__4__Impl5746); 
             after(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14__4__Impl"


    // $ANTLR start "rule__Node_Impl__Group_14_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2913:1: rule__Node_Impl__Group_14_3__0 : rule__Node_Impl__Group_14_3__0__Impl rule__Node_Impl__Group_14_3__1 ;
    public final void rule__Node_Impl__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2917:1: ( rule__Node_Impl__Group_14_3__0__Impl rule__Node_Impl__Group_14_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2918:2: rule__Node_Impl__Group_14_3__0__Impl rule__Node_Impl__Group_14_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14_3__0__Impl_in_rule__Node_Impl__Group_14_3__05787);
            rule__Node_Impl__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14_3__1_in_rule__Node_Impl__Group_14_3__05790);
            rule__Node_Impl__Group_14_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14_3__0"


    // $ANTLR start "rule__Node_Impl__Group_14_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2925:1: rule__Node_Impl__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__Node_Impl__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2929:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2930:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2930:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2931:1: ','
            {
             before(grammarAccess.getNode_ImplAccess().getCommaKeyword_14_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Node_Impl__Group_14_3__0__Impl5818); 
             after(grammarAccess.getNode_ImplAccess().getCommaKeyword_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14_3__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_14_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2944:1: rule__Node_Impl__Group_14_3__1 : rule__Node_Impl__Group_14_3__1__Impl ;
    public final void rule__Node_Impl__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2948:1: ( rule__Node_Impl__Group_14_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2949:2: rule__Node_Impl__Group_14_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14_3__1__Impl_in_rule__Node_Impl__Group_14_3__15849);
            rule__Node_Impl__Group_14_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14_3__1"


    // $ANTLR start "rule__Node_Impl__Group_14_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2955:1: rule__Node_Impl__Group_14_3__1__Impl : ( ( rule__Node_Impl__SignalsAssignment_14_3_1 ) ) ;
    public final void rule__Node_Impl__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2959:1: ( ( ( rule__Node_Impl__SignalsAssignment_14_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2960:1: ( ( rule__Node_Impl__SignalsAssignment_14_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2960:1: ( ( rule__Node_Impl__SignalsAssignment_14_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2961:1: ( rule__Node_Impl__SignalsAssignment_14_3_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsAssignment_14_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2962:1: ( rule__Node_Impl__SignalsAssignment_14_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2962:2: rule__Node_Impl__SignalsAssignment_14_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__SignalsAssignment_14_3_1_in_rule__Node_Impl__Group_14_3__1__Impl5876);
            rule__Node_Impl__SignalsAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getSignalsAssignment_14_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_14_3__1__Impl"


    // $ANTLR start "rule__Car__Group__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2976:1: rule__Car__Group__0 : rule__Car__Group__0__Impl rule__Car__Group__1 ;
    public final void rule__Car__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2980:1: ( rule__Car__Group__0__Impl rule__Car__Group__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2981:2: rule__Car__Group__0__Impl rule__Car__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__0__Impl_in_rule__Car__Group__05910);
            rule__Car__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__1_in_rule__Car__Group__05913);
            rule__Car__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__0"


    // $ANTLR start "rule__Car__Group__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2988:1: rule__Car__Group__0__Impl : ( () ) ;
    public final void rule__Car__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2992:1: ( ( () ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2993:1: ( () )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2993:1: ( () )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2994:1: ()
            {
             before(grammarAccess.getCarAccess().getCarAction_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2995:1: ()
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:2997:1: 
            {
            }

             after(grammarAccess.getCarAccess().getCarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__0__Impl"


    // $ANTLR start "rule__Car__Group__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3007:1: rule__Car__Group__1 : rule__Car__Group__1__Impl rule__Car__Group__2 ;
    public final void rule__Car__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3011:1: ( rule__Car__Group__1__Impl rule__Car__Group__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3012:2: rule__Car__Group__1__Impl rule__Car__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__1__Impl_in_rule__Car__Group__15971);
            rule__Car__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__2_in_rule__Car__Group__15974);
            rule__Car__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__1"


    // $ANTLR start "rule__Car__Group__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3019:1: rule__Car__Group__1__Impl : ( 'Car' ) ;
    public final void rule__Car__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3023:1: ( ( 'Car' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3024:1: ( 'Car' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3024:1: ( 'Car' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3025:1: 'Car'
            {
             before(grammarAccess.getCarAccess().getCarKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Car__Group__1__Impl6002); 
             after(grammarAccess.getCarAccess().getCarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__1__Impl"


    // $ANTLR start "rule__Car__Group__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3038:1: rule__Car__Group__2 : rule__Car__Group__2__Impl rule__Car__Group__3 ;
    public final void rule__Car__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3042:1: ( rule__Car__Group__2__Impl rule__Car__Group__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3043:2: rule__Car__Group__2__Impl rule__Car__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__2__Impl_in_rule__Car__Group__26033);
            rule__Car__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__3_in_rule__Car__Group__26036);
            rule__Car__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__2"


    // $ANTLR start "rule__Car__Group__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3050:1: rule__Car__Group__2__Impl : ( '{' ) ;
    public final void rule__Car__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3054:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3055:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3055:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3056:1: '{'
            {
             before(grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Car__Group__2__Impl6064); 
             after(grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__2__Impl"


    // $ANTLR start "rule__Car__Group__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3069:1: rule__Car__Group__3 : rule__Car__Group__3__Impl rule__Car__Group__4 ;
    public final void rule__Car__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3073:1: ( rule__Car__Group__3__Impl rule__Car__Group__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3074:2: rule__Car__Group__3__Impl rule__Car__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__3__Impl_in_rule__Car__Group__36095);
            rule__Car__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__4_in_rule__Car__Group__36098);
            rule__Car__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__3"


    // $ANTLR start "rule__Car__Group__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3081:1: rule__Car__Group__3__Impl : ( ( rule__Car__Group_3__0 )? ) ;
    public final void rule__Car__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3085:1: ( ( ( rule__Car__Group_3__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3086:1: ( ( rule__Car__Group_3__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3086:1: ( ( rule__Car__Group_3__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3087:1: ( rule__Car__Group_3__0 )?
            {
             before(grammarAccess.getCarAccess().getGroup_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3088:1: ( rule__Car__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3088:2: rule__Car__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Car__Group_3__0_in_rule__Car__Group__3__Impl6125);
                    rule__Car__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCarAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__3__Impl"


    // $ANTLR start "rule__Car__Group__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3098:1: rule__Car__Group__4 : rule__Car__Group__4__Impl rule__Car__Group__5 ;
    public final void rule__Car__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3102:1: ( rule__Car__Group__4__Impl rule__Car__Group__5 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3103:2: rule__Car__Group__4__Impl rule__Car__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__4__Impl_in_rule__Car__Group__46156);
            rule__Car__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__5_in_rule__Car__Group__46159);
            rule__Car__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__4"


    // $ANTLR start "rule__Car__Group__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3110:1: rule__Car__Group__4__Impl : ( ( rule__Car__Group_4__0 )? ) ;
    public final void rule__Car__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3114:1: ( ( ( rule__Car__Group_4__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3115:1: ( ( rule__Car__Group_4__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3115:1: ( ( rule__Car__Group_4__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3116:1: ( rule__Car__Group_4__0 )?
            {
             before(grammarAccess.getCarAccess().getGroup_4()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3117:1: ( rule__Car__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3117:2: rule__Car__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Car__Group_4__0_in_rule__Car__Group__4__Impl6186);
                    rule__Car__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCarAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__4__Impl"


    // $ANTLR start "rule__Car__Group__5"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3127:1: rule__Car__Group__5 : rule__Car__Group__5__Impl rule__Car__Group__6 ;
    public final void rule__Car__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3131:1: ( rule__Car__Group__5__Impl rule__Car__Group__6 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3132:2: rule__Car__Group__5__Impl rule__Car__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__5__Impl_in_rule__Car__Group__56217);
            rule__Car__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__6_in_rule__Car__Group__56220);
            rule__Car__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__5"


    // $ANTLR start "rule__Car__Group__5__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3139:1: rule__Car__Group__5__Impl : ( ( rule__Car__Group_5__0 )? ) ;
    public final void rule__Car__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3143:1: ( ( ( rule__Car__Group_5__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3144:1: ( ( rule__Car__Group_5__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3144:1: ( ( rule__Car__Group_5__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3145:1: ( rule__Car__Group_5__0 )?
            {
             before(grammarAccess.getCarAccess().getGroup_5()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3146:1: ( rule__Car__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3146:2: rule__Car__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Car__Group_5__0_in_rule__Car__Group__5__Impl6247);
                    rule__Car__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCarAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__5__Impl"


    // $ANTLR start "rule__Car__Group__6"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3156:1: rule__Car__Group__6 : rule__Car__Group__6__Impl ;
    public final void rule__Car__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3160:1: ( rule__Car__Group__6__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3161:2: rule__Car__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__6__Impl_in_rule__Car__Group__66278);
            rule__Car__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__6"


    // $ANTLR start "rule__Car__Group__6__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3167:1: rule__Car__Group__6__Impl : ( '}' ) ;
    public final void rule__Car__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3171:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3172:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3172:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3173:1: '}'
            {
             before(grammarAccess.getCarAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Car__Group__6__Impl6306); 
             after(grammarAccess.getCarAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__6__Impl"


    // $ANTLR start "rule__Car__Group_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3200:1: rule__Car__Group_3__0 : rule__Car__Group_3__0__Impl rule__Car__Group_3__1 ;
    public final void rule__Car__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3204:1: ( rule__Car__Group_3__0__Impl rule__Car__Group_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3205:2: rule__Car__Group_3__0__Impl rule__Car__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_3__0__Impl_in_rule__Car__Group_3__06351);
            rule__Car__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_3__1_in_rule__Car__Group_3__06354);
            rule__Car__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_3__0"


    // $ANTLR start "rule__Car__Group_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3212:1: rule__Car__Group_3__0__Impl : ( 'timeIn' ) ;
    public final void rule__Car__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3216:1: ( ( 'timeIn' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3217:1: ( 'timeIn' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3217:1: ( 'timeIn' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3218:1: 'timeIn'
            {
             before(grammarAccess.getCarAccess().getTimeInKeyword_3_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Car__Group_3__0__Impl6382); 
             after(grammarAccess.getCarAccess().getTimeInKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_3__0__Impl"


    // $ANTLR start "rule__Car__Group_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3231:1: rule__Car__Group_3__1 : rule__Car__Group_3__1__Impl ;
    public final void rule__Car__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3235:1: ( rule__Car__Group_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3236:2: rule__Car__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_3__1__Impl_in_rule__Car__Group_3__16413);
            rule__Car__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_3__1"


    // $ANTLR start "rule__Car__Group_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3242:1: rule__Car__Group_3__1__Impl : ( ( rule__Car__TimeInAssignment_3_1 ) ) ;
    public final void rule__Car__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3246:1: ( ( ( rule__Car__TimeInAssignment_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3247:1: ( ( rule__Car__TimeInAssignment_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3247:1: ( ( rule__Car__TimeInAssignment_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3248:1: ( rule__Car__TimeInAssignment_3_1 )
            {
             before(grammarAccess.getCarAccess().getTimeInAssignment_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3249:1: ( rule__Car__TimeInAssignment_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3249:2: rule__Car__TimeInAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__TimeInAssignment_3_1_in_rule__Car__Group_3__1__Impl6440);
            rule__Car__TimeInAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getTimeInAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_3__1__Impl"


    // $ANTLR start "rule__Car__Group_4__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3263:1: rule__Car__Group_4__0 : rule__Car__Group_4__0__Impl rule__Car__Group_4__1 ;
    public final void rule__Car__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3267:1: ( rule__Car__Group_4__0__Impl rule__Car__Group_4__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3268:2: rule__Car__Group_4__0__Impl rule__Car__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_4__0__Impl_in_rule__Car__Group_4__06474);
            rule__Car__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_4__1_in_rule__Car__Group_4__06477);
            rule__Car__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_4__0"


    // $ANTLR start "rule__Car__Group_4__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3275:1: rule__Car__Group_4__0__Impl : ( 'timeOut' ) ;
    public final void rule__Car__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3279:1: ( ( 'timeOut' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3280:1: ( 'timeOut' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3280:1: ( 'timeOut' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3281:1: 'timeOut'
            {
             before(grammarAccess.getCarAccess().getTimeOutKeyword_4_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Car__Group_4__0__Impl6505); 
             after(grammarAccess.getCarAccess().getTimeOutKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_4__0__Impl"


    // $ANTLR start "rule__Car__Group_4__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3294:1: rule__Car__Group_4__1 : rule__Car__Group_4__1__Impl ;
    public final void rule__Car__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3298:1: ( rule__Car__Group_4__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3299:2: rule__Car__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_4__1__Impl_in_rule__Car__Group_4__16536);
            rule__Car__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_4__1"


    // $ANTLR start "rule__Car__Group_4__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3305:1: rule__Car__Group_4__1__Impl : ( ( rule__Car__TimeOutAssignment_4_1 ) ) ;
    public final void rule__Car__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3309:1: ( ( ( rule__Car__TimeOutAssignment_4_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3310:1: ( ( rule__Car__TimeOutAssignment_4_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3310:1: ( ( rule__Car__TimeOutAssignment_4_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3311:1: ( rule__Car__TimeOutAssignment_4_1 )
            {
             before(grammarAccess.getCarAccess().getTimeOutAssignment_4_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3312:1: ( rule__Car__TimeOutAssignment_4_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3312:2: rule__Car__TimeOutAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__TimeOutAssignment_4_1_in_rule__Car__Group_4__1__Impl6563);
            rule__Car__TimeOutAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getTimeOutAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_4__1__Impl"


    // $ANTLR start "rule__Car__Group_5__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3326:1: rule__Car__Group_5__0 : rule__Car__Group_5__0__Impl rule__Car__Group_5__1 ;
    public final void rule__Car__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3330:1: ( rule__Car__Group_5__0__Impl rule__Car__Group_5__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3331:2: rule__Car__Group_5__0__Impl rule__Car__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_5__0__Impl_in_rule__Car__Group_5__06597);
            rule__Car__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_5__1_in_rule__Car__Group_5__06600);
            rule__Car__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_5__0"


    // $ANTLR start "rule__Car__Group_5__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3338:1: rule__Car__Group_5__0__Impl : ( 'isInSegment' ) ;
    public final void rule__Car__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3342:1: ( ( 'isInSegment' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3343:1: ( 'isInSegment' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3343:1: ( 'isInSegment' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3344:1: 'isInSegment'
            {
             before(grammarAccess.getCarAccess().getIsInSegmentKeyword_5_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Car__Group_5__0__Impl6628); 
             after(grammarAccess.getCarAccess().getIsInSegmentKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_5__0__Impl"


    // $ANTLR start "rule__Car__Group_5__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3357:1: rule__Car__Group_5__1 : rule__Car__Group_5__1__Impl ;
    public final void rule__Car__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3361:1: ( rule__Car__Group_5__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3362:2: rule__Car__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_5__1__Impl_in_rule__Car__Group_5__16659);
            rule__Car__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_5__1"


    // $ANTLR start "rule__Car__Group_5__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3368:1: rule__Car__Group_5__1__Impl : ( ( rule__Car__IsInSegmentAssignment_5_1 ) ) ;
    public final void rule__Car__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3372:1: ( ( ( rule__Car__IsInSegmentAssignment_5_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3373:1: ( ( rule__Car__IsInSegmentAssignment_5_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3373:1: ( ( rule__Car__IsInSegmentAssignment_5_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3374:1: ( rule__Car__IsInSegmentAssignment_5_1 )
            {
             before(grammarAccess.getCarAccess().getIsInSegmentAssignment_5_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3375:1: ( rule__Car__IsInSegmentAssignment_5_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3375:2: rule__Car__IsInSegmentAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__IsInSegmentAssignment_5_1_in_rule__Car__Group_5__1__Impl6686);
            rule__Car__IsInSegmentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getIsInSegmentAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_5__1__Impl"


    // $ANTLR start "rule__Segment__Group__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3389:1: rule__Segment__Group__0 : rule__Segment__Group__0__Impl rule__Segment__Group__1 ;
    public final void rule__Segment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3393:1: ( rule__Segment__Group__0__Impl rule__Segment__Group__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3394:2: rule__Segment__Group__0__Impl rule__Segment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__0__Impl_in_rule__Segment__Group__06720);
            rule__Segment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__1_in_rule__Segment__Group__06723);
            rule__Segment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__0"


    // $ANTLR start "rule__Segment__Group__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3401:1: rule__Segment__Group__0__Impl : ( () ) ;
    public final void rule__Segment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3405:1: ( ( () ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3406:1: ( () )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3406:1: ( () )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3407:1: ()
            {
             before(grammarAccess.getSegmentAccess().getSegmentAction_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3408:1: ()
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3410:1: 
            {
            }

             after(grammarAccess.getSegmentAccess().getSegmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__0__Impl"


    // $ANTLR start "rule__Segment__Group__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3420:1: rule__Segment__Group__1 : rule__Segment__Group__1__Impl rule__Segment__Group__2 ;
    public final void rule__Segment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3424:1: ( rule__Segment__Group__1__Impl rule__Segment__Group__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3425:2: rule__Segment__Group__1__Impl rule__Segment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__1__Impl_in_rule__Segment__Group__16781);
            rule__Segment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__2_in_rule__Segment__Group__16784);
            rule__Segment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__1"


    // $ANTLR start "rule__Segment__Group__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3432:1: rule__Segment__Group__1__Impl : ( 'Segment' ) ;
    public final void rule__Segment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3436:1: ( ( 'Segment' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3437:1: ( 'Segment' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3437:1: ( 'Segment' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3438:1: 'Segment'
            {
             before(grammarAccess.getSegmentAccess().getSegmentKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Segment__Group__1__Impl6812); 
             after(grammarAccess.getSegmentAccess().getSegmentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__1__Impl"


    // $ANTLR start "rule__Segment__Group__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3451:1: rule__Segment__Group__2 : rule__Segment__Group__2__Impl rule__Segment__Group__3 ;
    public final void rule__Segment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3455:1: ( rule__Segment__Group__2__Impl rule__Segment__Group__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3456:2: rule__Segment__Group__2__Impl rule__Segment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__2__Impl_in_rule__Segment__Group__26843);
            rule__Segment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__3_in_rule__Segment__Group__26846);
            rule__Segment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__2"


    // $ANTLR start "rule__Segment__Group__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3463:1: rule__Segment__Group__2__Impl : ( '{' ) ;
    public final void rule__Segment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3467:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3468:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3468:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3469:1: '{'
            {
             before(grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Segment__Group__2__Impl6874); 
             after(grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__2__Impl"


    // $ANTLR start "rule__Segment__Group__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3482:1: rule__Segment__Group__3 : rule__Segment__Group__3__Impl rule__Segment__Group__4 ;
    public final void rule__Segment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3486:1: ( rule__Segment__Group__3__Impl rule__Segment__Group__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3487:2: rule__Segment__Group__3__Impl rule__Segment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__3__Impl_in_rule__Segment__Group__36905);
            rule__Segment__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__4_in_rule__Segment__Group__36908);
            rule__Segment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__3"


    // $ANTLR start "rule__Segment__Group__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3494:1: rule__Segment__Group__3__Impl : ( ( rule__Segment__Group_3__0 )? ) ;
    public final void rule__Segment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3498:1: ( ( ( rule__Segment__Group_3__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3499:1: ( ( rule__Segment__Group_3__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3499:1: ( ( rule__Segment__Group_3__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3500:1: ( rule__Segment__Group_3__0 )?
            {
             before(grammarAccess.getSegmentAccess().getGroup_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3501:1: ( rule__Segment__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3501:2: rule__Segment__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_3__0_in_rule__Segment__Group__3__Impl6935);
                    rule__Segment__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSegmentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__3__Impl"


    // $ANTLR start "rule__Segment__Group__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3511:1: rule__Segment__Group__4 : rule__Segment__Group__4__Impl rule__Segment__Group__5 ;
    public final void rule__Segment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3515:1: ( rule__Segment__Group__4__Impl rule__Segment__Group__5 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3516:2: rule__Segment__Group__4__Impl rule__Segment__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__4__Impl_in_rule__Segment__Group__46966);
            rule__Segment__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__5_in_rule__Segment__Group__46969);
            rule__Segment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__4"


    // $ANTLR start "rule__Segment__Group__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3523:1: rule__Segment__Group__4__Impl : ( ( rule__Segment__Group_4__0 )? ) ;
    public final void rule__Segment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3527:1: ( ( ( rule__Segment__Group_4__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3528:1: ( ( rule__Segment__Group_4__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3528:1: ( ( rule__Segment__Group_4__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3529:1: ( rule__Segment__Group_4__0 )?
            {
             before(grammarAccess.getSegmentAccess().getGroup_4()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3530:1: ( rule__Segment__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3530:2: rule__Segment__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_4__0_in_rule__Segment__Group__4__Impl6996);
                    rule__Segment__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSegmentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__4__Impl"


    // $ANTLR start "rule__Segment__Group__5"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3540:1: rule__Segment__Group__5 : rule__Segment__Group__5__Impl rule__Segment__Group__6 ;
    public final void rule__Segment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3544:1: ( rule__Segment__Group__5__Impl rule__Segment__Group__6 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3545:2: rule__Segment__Group__5__Impl rule__Segment__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__5__Impl_in_rule__Segment__Group__57027);
            rule__Segment__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__6_in_rule__Segment__Group__57030);
            rule__Segment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__5"


    // $ANTLR start "rule__Segment__Group__5__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3552:1: rule__Segment__Group__5__Impl : ( ( rule__Segment__Group_5__0 )? ) ;
    public final void rule__Segment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3556:1: ( ( ( rule__Segment__Group_5__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3557:1: ( ( rule__Segment__Group_5__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3557:1: ( ( rule__Segment__Group_5__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3558:1: ( rule__Segment__Group_5__0 )?
            {
             before(grammarAccess.getSegmentAccess().getGroup_5()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3559:1: ( rule__Segment__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3559:2: rule__Segment__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__0_in_rule__Segment__Group__5__Impl7057);
                    rule__Segment__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSegmentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__5__Impl"


    // $ANTLR start "rule__Segment__Group__6"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3569:1: rule__Segment__Group__6 : rule__Segment__Group__6__Impl ;
    public final void rule__Segment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3573:1: ( rule__Segment__Group__6__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3574:2: rule__Segment__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__6__Impl_in_rule__Segment__Group__67088);
            rule__Segment__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__6"


    // $ANTLR start "rule__Segment__Group__6__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3580:1: rule__Segment__Group__6__Impl : ( '}' ) ;
    public final void rule__Segment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3584:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3585:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3585:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3586:1: '}'
            {
             before(grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Segment__Group__6__Impl7116); 
             after(grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__6__Impl"


    // $ANTLR start "rule__Segment__Group_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3613:1: rule__Segment__Group_3__0 : rule__Segment__Group_3__0__Impl rule__Segment__Group_3__1 ;
    public final void rule__Segment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3617:1: ( rule__Segment__Group_3__0__Impl rule__Segment__Group_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3618:2: rule__Segment__Group_3__0__Impl rule__Segment__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_3__0__Impl_in_rule__Segment__Group_3__07161);
            rule__Segment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_3__1_in_rule__Segment__Group_3__07164);
            rule__Segment__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_3__0"


    // $ANTLR start "rule__Segment__Group_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3625:1: rule__Segment__Group_3__0__Impl : ( 'numLanes' ) ;
    public final void rule__Segment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3629:1: ( ( 'numLanes' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3630:1: ( 'numLanes' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3630:1: ( 'numLanes' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3631:1: 'numLanes'
            {
             before(grammarAccess.getSegmentAccess().getNumLanesKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Segment__Group_3__0__Impl7192); 
             after(grammarAccess.getSegmentAccess().getNumLanesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_3__0__Impl"


    // $ANTLR start "rule__Segment__Group_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3644:1: rule__Segment__Group_3__1 : rule__Segment__Group_3__1__Impl ;
    public final void rule__Segment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3648:1: ( rule__Segment__Group_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3649:2: rule__Segment__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_3__1__Impl_in_rule__Segment__Group_3__17223);
            rule__Segment__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_3__1"


    // $ANTLR start "rule__Segment__Group_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3655:1: rule__Segment__Group_3__1__Impl : ( ( rule__Segment__NumLanesAssignment_3_1 ) ) ;
    public final void rule__Segment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3659:1: ( ( ( rule__Segment__NumLanesAssignment_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3660:1: ( ( rule__Segment__NumLanesAssignment_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3660:1: ( ( rule__Segment__NumLanesAssignment_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3661:1: ( rule__Segment__NumLanesAssignment_3_1 )
            {
             before(grammarAccess.getSegmentAccess().getNumLanesAssignment_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3662:1: ( rule__Segment__NumLanesAssignment_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3662:2: rule__Segment__NumLanesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__NumLanesAssignment_3_1_in_rule__Segment__Group_3__1__Impl7250);
            rule__Segment__NumLanesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getNumLanesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_3__1__Impl"


    // $ANTLR start "rule__Segment__Group_4__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3676:1: rule__Segment__Group_4__0 : rule__Segment__Group_4__0__Impl rule__Segment__Group_4__1 ;
    public final void rule__Segment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3680:1: ( rule__Segment__Group_4__0__Impl rule__Segment__Group_4__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3681:2: rule__Segment__Group_4__0__Impl rule__Segment__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_4__0__Impl_in_rule__Segment__Group_4__07284);
            rule__Segment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_4__1_in_rule__Segment__Group_4__07287);
            rule__Segment__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_4__0"


    // $ANTLR start "rule__Segment__Group_4__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3688:1: rule__Segment__Group_4__0__Impl : ( 'length' ) ;
    public final void rule__Segment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3692:1: ( ( 'length' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3693:1: ( 'length' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3693:1: ( 'length' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3694:1: 'length'
            {
             before(grammarAccess.getSegmentAccess().getLengthKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Segment__Group_4__0__Impl7315); 
             after(grammarAccess.getSegmentAccess().getLengthKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_4__0__Impl"


    // $ANTLR start "rule__Segment__Group_4__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3707:1: rule__Segment__Group_4__1 : rule__Segment__Group_4__1__Impl ;
    public final void rule__Segment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3711:1: ( rule__Segment__Group_4__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3712:2: rule__Segment__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_4__1__Impl_in_rule__Segment__Group_4__17346);
            rule__Segment__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_4__1"


    // $ANTLR start "rule__Segment__Group_4__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3718:1: rule__Segment__Group_4__1__Impl : ( ( rule__Segment__LengthAssignment_4_1 ) ) ;
    public final void rule__Segment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3722:1: ( ( ( rule__Segment__LengthAssignment_4_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3723:1: ( ( rule__Segment__LengthAssignment_4_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3723:1: ( ( rule__Segment__LengthAssignment_4_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3724:1: ( rule__Segment__LengthAssignment_4_1 )
            {
             before(grammarAccess.getSegmentAccess().getLengthAssignment_4_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3725:1: ( rule__Segment__LengthAssignment_4_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3725:2: rule__Segment__LengthAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__LengthAssignment_4_1_in_rule__Segment__Group_4__1__Impl7373);
            rule__Segment__LengthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getLengthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_4__1__Impl"


    // $ANTLR start "rule__Segment__Group_5__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3739:1: rule__Segment__Group_5__0 : rule__Segment__Group_5__0__Impl rule__Segment__Group_5__1 ;
    public final void rule__Segment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3743:1: ( rule__Segment__Group_5__0__Impl rule__Segment__Group_5__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3744:2: rule__Segment__Group_5__0__Impl rule__Segment__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__0__Impl_in_rule__Segment__Group_5__07407);
            rule__Segment__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__1_in_rule__Segment__Group_5__07410);
            rule__Segment__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5__0"


    // $ANTLR start "rule__Segment__Group_5__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3751:1: rule__Segment__Group_5__0__Impl : ( 'hasCars' ) ;
    public final void rule__Segment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3755:1: ( ( 'hasCars' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3756:1: ( 'hasCars' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3756:1: ( 'hasCars' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3757:1: 'hasCars'
            {
             before(grammarAccess.getSegmentAccess().getHasCarsKeyword_5_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Segment__Group_5__0__Impl7438); 
             after(grammarAccess.getSegmentAccess().getHasCarsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5__0__Impl"


    // $ANTLR start "rule__Segment__Group_5__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3770:1: rule__Segment__Group_5__1 : rule__Segment__Group_5__1__Impl rule__Segment__Group_5__2 ;
    public final void rule__Segment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3774:1: ( rule__Segment__Group_5__1__Impl rule__Segment__Group_5__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3775:2: rule__Segment__Group_5__1__Impl rule__Segment__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__1__Impl_in_rule__Segment__Group_5__17469);
            rule__Segment__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__2_in_rule__Segment__Group_5__17472);
            rule__Segment__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5__1"


    // $ANTLR start "rule__Segment__Group_5__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3782:1: rule__Segment__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Segment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3786:1: ( ( '(' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3787:1: ( '(' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3787:1: ( '(' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3788:1: '('
            {
             before(grammarAccess.getSegmentAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Segment__Group_5__1__Impl7500); 
             after(grammarAccess.getSegmentAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5__1__Impl"


    // $ANTLR start "rule__Segment__Group_5__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3801:1: rule__Segment__Group_5__2 : rule__Segment__Group_5__2__Impl rule__Segment__Group_5__3 ;
    public final void rule__Segment__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3805:1: ( rule__Segment__Group_5__2__Impl rule__Segment__Group_5__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3806:2: rule__Segment__Group_5__2__Impl rule__Segment__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__2__Impl_in_rule__Segment__Group_5__27531);
            rule__Segment__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__3_in_rule__Segment__Group_5__27534);
            rule__Segment__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5__2"


    // $ANTLR start "rule__Segment__Group_5__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3813:1: rule__Segment__Group_5__2__Impl : ( ( rule__Segment__HasCarsAssignment_5_2 ) ) ;
    public final void rule__Segment__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3817:1: ( ( ( rule__Segment__HasCarsAssignment_5_2 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3818:1: ( ( rule__Segment__HasCarsAssignment_5_2 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3818:1: ( ( rule__Segment__HasCarsAssignment_5_2 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3819:1: ( rule__Segment__HasCarsAssignment_5_2 )
            {
             before(grammarAccess.getSegmentAccess().getHasCarsAssignment_5_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3820:1: ( rule__Segment__HasCarsAssignment_5_2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3820:2: rule__Segment__HasCarsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__HasCarsAssignment_5_2_in_rule__Segment__Group_5__2__Impl7561);
            rule__Segment__HasCarsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getHasCarsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5__2__Impl"


    // $ANTLR start "rule__Segment__Group_5__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3830:1: rule__Segment__Group_5__3 : rule__Segment__Group_5__3__Impl rule__Segment__Group_5__4 ;
    public final void rule__Segment__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3834:1: ( rule__Segment__Group_5__3__Impl rule__Segment__Group_5__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3835:2: rule__Segment__Group_5__3__Impl rule__Segment__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__3__Impl_in_rule__Segment__Group_5__37591);
            rule__Segment__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__4_in_rule__Segment__Group_5__37594);
            rule__Segment__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5__3"


    // $ANTLR start "rule__Segment__Group_5__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3842:1: rule__Segment__Group_5__3__Impl : ( ( rule__Segment__Group_5_3__0 )* ) ;
    public final void rule__Segment__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3846:1: ( ( ( rule__Segment__Group_5_3__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3847:1: ( ( rule__Segment__Group_5_3__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3847:1: ( ( rule__Segment__Group_5_3__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3848:1: ( rule__Segment__Group_5_3__0 )*
            {
             before(grammarAccess.getSegmentAccess().getGroup_5_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3849:1: ( rule__Segment__Group_5_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3849:2: rule__Segment__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5_3__0_in_rule__Segment__Group_5__3__Impl7621);
            	    rule__Segment__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSegmentAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5__3__Impl"


    // $ANTLR start "rule__Segment__Group_5__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3859:1: rule__Segment__Group_5__4 : rule__Segment__Group_5__4__Impl ;
    public final void rule__Segment__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3863:1: ( rule__Segment__Group_5__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3864:2: rule__Segment__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__4__Impl_in_rule__Segment__Group_5__47652);
            rule__Segment__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5__4"


    // $ANTLR start "rule__Segment__Group_5__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3870:1: rule__Segment__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Segment__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3874:1: ( ( ')' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3875:1: ( ')' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3875:1: ( ')' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3876:1: ')'
            {
             before(grammarAccess.getSegmentAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Segment__Group_5__4__Impl7680); 
             after(grammarAccess.getSegmentAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5__4__Impl"


    // $ANTLR start "rule__Segment__Group_5_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3899:1: rule__Segment__Group_5_3__0 : rule__Segment__Group_5_3__0__Impl rule__Segment__Group_5_3__1 ;
    public final void rule__Segment__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3903:1: ( rule__Segment__Group_5_3__0__Impl rule__Segment__Group_5_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3904:2: rule__Segment__Group_5_3__0__Impl rule__Segment__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5_3__0__Impl_in_rule__Segment__Group_5_3__07721);
            rule__Segment__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5_3__1_in_rule__Segment__Group_5_3__07724);
            rule__Segment__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5_3__0"


    // $ANTLR start "rule__Segment__Group_5_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3911:1: rule__Segment__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Segment__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3915:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3916:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3916:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3917:1: ','
            {
             before(grammarAccess.getSegmentAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Segment__Group_5_3__0__Impl7752); 
             after(grammarAccess.getSegmentAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5_3__0__Impl"


    // $ANTLR start "rule__Segment__Group_5_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3930:1: rule__Segment__Group_5_3__1 : rule__Segment__Group_5_3__1__Impl ;
    public final void rule__Segment__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3934:1: ( rule__Segment__Group_5_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3935:2: rule__Segment__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5_3__1__Impl_in_rule__Segment__Group_5_3__17783);
            rule__Segment__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5_3__1"


    // $ANTLR start "rule__Segment__Group_5_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3941:1: rule__Segment__Group_5_3__1__Impl : ( ( rule__Segment__HasCarsAssignment_5_3_1 ) ) ;
    public final void rule__Segment__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3945:1: ( ( ( rule__Segment__HasCarsAssignment_5_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3946:1: ( ( rule__Segment__HasCarsAssignment_5_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3946:1: ( ( rule__Segment__HasCarsAssignment_5_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3947:1: ( rule__Segment__HasCarsAssignment_5_3_1 )
            {
             before(grammarAccess.getSegmentAccess().getHasCarsAssignment_5_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3948:1: ( rule__Segment__HasCarsAssignment_5_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3948:2: rule__Segment__HasCarsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__HasCarsAssignment_5_3_1_in_rule__Segment__Group_5_3__1__Impl7810);
            rule__Segment__HasCarsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getHasCarsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_5_3__1__Impl"


    // $ANTLR start "rule__Semaphore__Group__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3962:1: rule__Semaphore__Group__0 : rule__Semaphore__Group__0__Impl rule__Semaphore__Group__1 ;
    public final void rule__Semaphore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3966:1: ( rule__Semaphore__Group__0__Impl rule__Semaphore__Group__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3967:2: rule__Semaphore__Group__0__Impl rule__Semaphore__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__0__Impl_in_rule__Semaphore__Group__07844);
            rule__Semaphore__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__1_in_rule__Semaphore__Group__07847);
            rule__Semaphore__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__0"


    // $ANTLR start "rule__Semaphore__Group__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3974:1: rule__Semaphore__Group__0__Impl : ( 'Semaphore' ) ;
    public final void rule__Semaphore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3978:1: ( ( 'Semaphore' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3979:1: ( 'Semaphore' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3979:1: ( 'Semaphore' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3980:1: 'Semaphore'
            {
             before(grammarAccess.getSemaphoreAccess().getSemaphoreKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Semaphore__Group__0__Impl7875); 
             after(grammarAccess.getSemaphoreAccess().getSemaphoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__0__Impl"


    // $ANTLR start "rule__Semaphore__Group__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3993:1: rule__Semaphore__Group__1 : rule__Semaphore__Group__1__Impl rule__Semaphore__Group__2 ;
    public final void rule__Semaphore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3997:1: ( rule__Semaphore__Group__1__Impl rule__Semaphore__Group__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:3998:2: rule__Semaphore__Group__1__Impl rule__Semaphore__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__1__Impl_in_rule__Semaphore__Group__17906);
            rule__Semaphore__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__2_in_rule__Semaphore__Group__17909);
            rule__Semaphore__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__1"


    // $ANTLR start "rule__Semaphore__Group__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4005:1: rule__Semaphore__Group__1__Impl : ( '{' ) ;
    public final void rule__Semaphore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4009:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4010:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4010:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4011:1: '{'
            {
             before(grammarAccess.getSemaphoreAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Semaphore__Group__1__Impl7937); 
             after(grammarAccess.getSemaphoreAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__1__Impl"


    // $ANTLR start "rule__Semaphore__Group__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4024:1: rule__Semaphore__Group__2 : rule__Semaphore__Group__2__Impl rule__Semaphore__Group__3 ;
    public final void rule__Semaphore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4028:1: ( rule__Semaphore__Group__2__Impl rule__Semaphore__Group__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4029:2: rule__Semaphore__Group__2__Impl rule__Semaphore__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__2__Impl_in_rule__Semaphore__Group__27968);
            rule__Semaphore__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__3_in_rule__Semaphore__Group__27971);
            rule__Semaphore__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__2"


    // $ANTLR start "rule__Semaphore__Group__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4036:1: rule__Semaphore__Group__2__Impl : ( ( rule__Semaphore__Group_2__0 )? ) ;
    public final void rule__Semaphore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4040:1: ( ( ( rule__Semaphore__Group_2__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4041:1: ( ( rule__Semaphore__Group_2__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4041:1: ( ( rule__Semaphore__Group_2__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4042:1: ( rule__Semaphore__Group_2__0 )?
            {
             before(grammarAccess.getSemaphoreAccess().getGroup_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4043:1: ( rule__Semaphore__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4043:2: rule__Semaphore__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_2__0_in_rule__Semaphore__Group__2__Impl7998);
                    rule__Semaphore__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSemaphoreAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__2__Impl"


    // $ANTLR start "rule__Semaphore__Group__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4053:1: rule__Semaphore__Group__3 : rule__Semaphore__Group__3__Impl rule__Semaphore__Group__4 ;
    public final void rule__Semaphore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4057:1: ( rule__Semaphore__Group__3__Impl rule__Semaphore__Group__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4058:2: rule__Semaphore__Group__3__Impl rule__Semaphore__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__3__Impl_in_rule__Semaphore__Group__38029);
            rule__Semaphore__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__4_in_rule__Semaphore__Group__38032);
            rule__Semaphore__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__3"


    // $ANTLR start "rule__Semaphore__Group__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4065:1: rule__Semaphore__Group__3__Impl : ( ( rule__Semaphore__Group_3__0 )? ) ;
    public final void rule__Semaphore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4069:1: ( ( ( rule__Semaphore__Group_3__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4070:1: ( ( rule__Semaphore__Group_3__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4070:1: ( ( rule__Semaphore__Group_3__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4071:1: ( rule__Semaphore__Group_3__0 )?
            {
             before(grammarAccess.getSemaphoreAccess().getGroup_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4072:1: ( rule__Semaphore__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4072:2: rule__Semaphore__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_3__0_in_rule__Semaphore__Group__3__Impl8059);
                    rule__Semaphore__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSemaphoreAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__3__Impl"


    // $ANTLR start "rule__Semaphore__Group__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4082:1: rule__Semaphore__Group__4 : rule__Semaphore__Group__4__Impl rule__Semaphore__Group__5 ;
    public final void rule__Semaphore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4086:1: ( rule__Semaphore__Group__4__Impl rule__Semaphore__Group__5 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4087:2: rule__Semaphore__Group__4__Impl rule__Semaphore__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__4__Impl_in_rule__Semaphore__Group__48090);
            rule__Semaphore__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__5_in_rule__Semaphore__Group__48093);
            rule__Semaphore__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__4"


    // $ANTLR start "rule__Semaphore__Group__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4094:1: rule__Semaphore__Group__4__Impl : ( ( rule__Semaphore__Group_4__0 )? ) ;
    public final void rule__Semaphore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4098:1: ( ( ( rule__Semaphore__Group_4__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4099:1: ( ( rule__Semaphore__Group_4__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4099:1: ( ( rule__Semaphore__Group_4__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4100:1: ( rule__Semaphore__Group_4__0 )?
            {
             before(grammarAccess.getSemaphoreAccess().getGroup_4()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4101:1: ( rule__Semaphore__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4101:2: rule__Semaphore__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_4__0_in_rule__Semaphore__Group__4__Impl8120);
                    rule__Semaphore__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSemaphoreAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__4__Impl"


    // $ANTLR start "rule__Semaphore__Group__5"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4111:1: rule__Semaphore__Group__5 : rule__Semaphore__Group__5__Impl rule__Semaphore__Group__6 ;
    public final void rule__Semaphore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4115:1: ( rule__Semaphore__Group__5__Impl rule__Semaphore__Group__6 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4116:2: rule__Semaphore__Group__5__Impl rule__Semaphore__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__5__Impl_in_rule__Semaphore__Group__58151);
            rule__Semaphore__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__6_in_rule__Semaphore__Group__58154);
            rule__Semaphore__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__5"


    // $ANTLR start "rule__Semaphore__Group__5__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4123:1: rule__Semaphore__Group__5__Impl : ( 'belongsTo' ) ;
    public final void rule__Semaphore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4127:1: ( ( 'belongsTo' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4128:1: ( 'belongsTo' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4128:1: ( 'belongsTo' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4129:1: 'belongsTo'
            {
             before(grammarAccess.getSemaphoreAccess().getBelongsToKeyword_5()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Semaphore__Group__5__Impl8182); 
             after(grammarAccess.getSemaphoreAccess().getBelongsToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__5__Impl"


    // $ANTLR start "rule__Semaphore__Group__6"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4142:1: rule__Semaphore__Group__6 : rule__Semaphore__Group__6__Impl rule__Semaphore__Group__7 ;
    public final void rule__Semaphore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4146:1: ( rule__Semaphore__Group__6__Impl rule__Semaphore__Group__7 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4147:2: rule__Semaphore__Group__6__Impl rule__Semaphore__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__6__Impl_in_rule__Semaphore__Group__68213);
            rule__Semaphore__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__7_in_rule__Semaphore__Group__68216);
            rule__Semaphore__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__6"


    // $ANTLR start "rule__Semaphore__Group__6__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4154:1: rule__Semaphore__Group__6__Impl : ( ( rule__Semaphore__BelongsToAssignment_6 ) ) ;
    public final void rule__Semaphore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4158:1: ( ( ( rule__Semaphore__BelongsToAssignment_6 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4159:1: ( ( rule__Semaphore__BelongsToAssignment_6 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4159:1: ( ( rule__Semaphore__BelongsToAssignment_6 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4160:1: ( rule__Semaphore__BelongsToAssignment_6 )
            {
             before(grammarAccess.getSemaphoreAccess().getBelongsToAssignment_6()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4161:1: ( rule__Semaphore__BelongsToAssignment_6 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4161:2: rule__Semaphore__BelongsToAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__BelongsToAssignment_6_in_rule__Semaphore__Group__6__Impl8243);
            rule__Semaphore__BelongsToAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSemaphoreAccess().getBelongsToAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__6__Impl"


    // $ANTLR start "rule__Semaphore__Group__7"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4171:1: rule__Semaphore__Group__7 : rule__Semaphore__Group__7__Impl ;
    public final void rule__Semaphore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4175:1: ( rule__Semaphore__Group__7__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4176:2: rule__Semaphore__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__7__Impl_in_rule__Semaphore__Group__78273);
            rule__Semaphore__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__7"


    // $ANTLR start "rule__Semaphore__Group__7__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4182:1: rule__Semaphore__Group__7__Impl : ( '}' ) ;
    public final void rule__Semaphore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4186:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4187:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4187:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4188:1: '}'
            {
             before(grammarAccess.getSemaphoreAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Semaphore__Group__7__Impl8301); 
             after(grammarAccess.getSemaphoreAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__7__Impl"


    // $ANTLR start "rule__Semaphore__Group_2__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4217:1: rule__Semaphore__Group_2__0 : rule__Semaphore__Group_2__0__Impl rule__Semaphore__Group_2__1 ;
    public final void rule__Semaphore__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4221:1: ( rule__Semaphore__Group_2__0__Impl rule__Semaphore__Group_2__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4222:2: rule__Semaphore__Group_2__0__Impl rule__Semaphore__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_2__0__Impl_in_rule__Semaphore__Group_2__08348);
            rule__Semaphore__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_2__1_in_rule__Semaphore__Group_2__08351);
            rule__Semaphore__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_2__0"


    // $ANTLR start "rule__Semaphore__Group_2__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4229:1: rule__Semaphore__Group_2__0__Impl : ( 'canGo' ) ;
    public final void rule__Semaphore__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4233:1: ( ( 'canGo' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4234:1: ( 'canGo' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4234:1: ( 'canGo' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4235:1: 'canGo'
            {
             before(grammarAccess.getSemaphoreAccess().getCanGoKeyword_2_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Semaphore__Group_2__0__Impl8379); 
             after(grammarAccess.getSemaphoreAccess().getCanGoKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_2__0__Impl"


    // $ANTLR start "rule__Semaphore__Group_2__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4248:1: rule__Semaphore__Group_2__1 : rule__Semaphore__Group_2__1__Impl ;
    public final void rule__Semaphore__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4252:1: ( rule__Semaphore__Group_2__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4253:2: rule__Semaphore__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_2__1__Impl_in_rule__Semaphore__Group_2__18410);
            rule__Semaphore__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_2__1"


    // $ANTLR start "rule__Semaphore__Group_2__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4259:1: rule__Semaphore__Group_2__1__Impl : ( ( rule__Semaphore__CanGoAssignment_2_1 ) ) ;
    public final void rule__Semaphore__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4263:1: ( ( ( rule__Semaphore__CanGoAssignment_2_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4264:1: ( ( rule__Semaphore__CanGoAssignment_2_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4264:1: ( ( rule__Semaphore__CanGoAssignment_2_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4265:1: ( rule__Semaphore__CanGoAssignment_2_1 )
            {
             before(grammarAccess.getSemaphoreAccess().getCanGoAssignment_2_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4266:1: ( rule__Semaphore__CanGoAssignment_2_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4266:2: rule__Semaphore__CanGoAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__CanGoAssignment_2_1_in_rule__Semaphore__Group_2__1__Impl8437);
            rule__Semaphore__CanGoAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSemaphoreAccess().getCanGoAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_2__1__Impl"


    // $ANTLR start "rule__Semaphore__Group_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4280:1: rule__Semaphore__Group_3__0 : rule__Semaphore__Group_3__0__Impl rule__Semaphore__Group_3__1 ;
    public final void rule__Semaphore__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4284:1: ( rule__Semaphore__Group_3__0__Impl rule__Semaphore__Group_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4285:2: rule__Semaphore__Group_3__0__Impl rule__Semaphore__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_3__0__Impl_in_rule__Semaphore__Group_3__08471);
            rule__Semaphore__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_3__1_in_rule__Semaphore__Group_3__08474);
            rule__Semaphore__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_3__0"


    // $ANTLR start "rule__Semaphore__Group_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4292:1: rule__Semaphore__Group_3__0__Impl : ( 'secondsRed' ) ;
    public final void rule__Semaphore__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4296:1: ( ( 'secondsRed' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4297:1: ( 'secondsRed' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4297:1: ( 'secondsRed' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4298:1: 'secondsRed'
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsRedKeyword_3_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Semaphore__Group_3__0__Impl8502); 
             after(grammarAccess.getSemaphoreAccess().getSecondsRedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_3__0__Impl"


    // $ANTLR start "rule__Semaphore__Group_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4311:1: rule__Semaphore__Group_3__1 : rule__Semaphore__Group_3__1__Impl ;
    public final void rule__Semaphore__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4315:1: ( rule__Semaphore__Group_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4316:2: rule__Semaphore__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_3__1__Impl_in_rule__Semaphore__Group_3__18533);
            rule__Semaphore__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_3__1"


    // $ANTLR start "rule__Semaphore__Group_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4322:1: rule__Semaphore__Group_3__1__Impl : ( ( rule__Semaphore__SecondsRedAssignment_3_1 ) ) ;
    public final void rule__Semaphore__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4326:1: ( ( ( rule__Semaphore__SecondsRedAssignment_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4327:1: ( ( rule__Semaphore__SecondsRedAssignment_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4327:1: ( ( rule__Semaphore__SecondsRedAssignment_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4328:1: ( rule__Semaphore__SecondsRedAssignment_3_1 )
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsRedAssignment_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4329:1: ( rule__Semaphore__SecondsRedAssignment_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4329:2: rule__Semaphore__SecondsRedAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__SecondsRedAssignment_3_1_in_rule__Semaphore__Group_3__1__Impl8560);
            rule__Semaphore__SecondsRedAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSemaphoreAccess().getSecondsRedAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_3__1__Impl"


    // $ANTLR start "rule__Semaphore__Group_4__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4343:1: rule__Semaphore__Group_4__0 : rule__Semaphore__Group_4__0__Impl rule__Semaphore__Group_4__1 ;
    public final void rule__Semaphore__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4347:1: ( rule__Semaphore__Group_4__0__Impl rule__Semaphore__Group_4__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4348:2: rule__Semaphore__Group_4__0__Impl rule__Semaphore__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_4__0__Impl_in_rule__Semaphore__Group_4__08594);
            rule__Semaphore__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_4__1_in_rule__Semaphore__Group_4__08597);
            rule__Semaphore__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_4__0"


    // $ANTLR start "rule__Semaphore__Group_4__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4355:1: rule__Semaphore__Group_4__0__Impl : ( 'secondsGreen' ) ;
    public final void rule__Semaphore__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4359:1: ( ( 'secondsGreen' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4360:1: ( 'secondsGreen' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4360:1: ( 'secondsGreen' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4361:1: 'secondsGreen'
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsGreenKeyword_4_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Semaphore__Group_4__0__Impl8625); 
             after(grammarAccess.getSemaphoreAccess().getSecondsGreenKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_4__0__Impl"


    // $ANTLR start "rule__Semaphore__Group_4__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4374:1: rule__Semaphore__Group_4__1 : rule__Semaphore__Group_4__1__Impl ;
    public final void rule__Semaphore__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4378:1: ( rule__Semaphore__Group_4__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4379:2: rule__Semaphore__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_4__1__Impl_in_rule__Semaphore__Group_4__18656);
            rule__Semaphore__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_4__1"


    // $ANTLR start "rule__Semaphore__Group_4__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4385:1: rule__Semaphore__Group_4__1__Impl : ( ( rule__Semaphore__SecondsGreenAssignment_4_1 ) ) ;
    public final void rule__Semaphore__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4389:1: ( ( ( rule__Semaphore__SecondsGreenAssignment_4_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4390:1: ( ( rule__Semaphore__SecondsGreenAssignment_4_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4390:1: ( ( rule__Semaphore__SecondsGreenAssignment_4_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4391:1: ( rule__Semaphore__SecondsGreenAssignment_4_1 )
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsGreenAssignment_4_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4392:1: ( rule__Semaphore__SecondsGreenAssignment_4_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4392:2: rule__Semaphore__SecondsGreenAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__SecondsGreenAssignment_4_1_in_rule__Semaphore__Group_4__1__Impl8683);
            rule__Semaphore__SecondsGreenAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSemaphoreAccess().getSecondsGreenAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_4__1__Impl"


    // $ANTLR start "rule__Signal_Impl__Group__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4406:1: rule__Signal_Impl__Group__0 : rule__Signal_Impl__Group__0__Impl rule__Signal_Impl__Group__1 ;
    public final void rule__Signal_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4410:1: ( rule__Signal_Impl__Group__0__Impl rule__Signal_Impl__Group__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4411:2: rule__Signal_Impl__Group__0__Impl rule__Signal_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__0__Impl_in_rule__Signal_Impl__Group__08717);
            rule__Signal_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__1_in_rule__Signal_Impl__Group__08720);
            rule__Signal_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__0"


    // $ANTLR start "rule__Signal_Impl__Group__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4418:1: rule__Signal_Impl__Group__0__Impl : ( 'Signal' ) ;
    public final void rule__Signal_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4422:1: ( ( 'Signal' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4423:1: ( 'Signal' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4423:1: ( 'Signal' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4424:1: 'Signal'
            {
             before(grammarAccess.getSignal_ImplAccess().getSignalKeyword_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Signal_Impl__Group__0__Impl8748); 
             after(grammarAccess.getSignal_ImplAccess().getSignalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__0__Impl"


    // $ANTLR start "rule__Signal_Impl__Group__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4437:1: rule__Signal_Impl__Group__1 : rule__Signal_Impl__Group__1__Impl rule__Signal_Impl__Group__2 ;
    public final void rule__Signal_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4441:1: ( rule__Signal_Impl__Group__1__Impl rule__Signal_Impl__Group__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4442:2: rule__Signal_Impl__Group__1__Impl rule__Signal_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__1__Impl_in_rule__Signal_Impl__Group__18779);
            rule__Signal_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__2_in_rule__Signal_Impl__Group__18782);
            rule__Signal_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__1"


    // $ANTLR start "rule__Signal_Impl__Group__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4449:1: rule__Signal_Impl__Group__1__Impl : ( '{' ) ;
    public final void rule__Signal_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4453:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4454:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4454:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4455:1: '{'
            {
             before(grammarAccess.getSignal_ImplAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Signal_Impl__Group__1__Impl8810); 
             after(grammarAccess.getSignal_ImplAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__1__Impl"


    // $ANTLR start "rule__Signal_Impl__Group__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4468:1: rule__Signal_Impl__Group__2 : rule__Signal_Impl__Group__2__Impl rule__Signal_Impl__Group__3 ;
    public final void rule__Signal_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4472:1: ( rule__Signal_Impl__Group__2__Impl rule__Signal_Impl__Group__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4473:2: rule__Signal_Impl__Group__2__Impl rule__Signal_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__2__Impl_in_rule__Signal_Impl__Group__28841);
            rule__Signal_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__3_in_rule__Signal_Impl__Group__28844);
            rule__Signal_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__2"


    // $ANTLR start "rule__Signal_Impl__Group__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4480:1: rule__Signal_Impl__Group__2__Impl : ( 'belongsTo' ) ;
    public final void rule__Signal_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4484:1: ( ( 'belongsTo' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4485:1: ( 'belongsTo' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4485:1: ( 'belongsTo' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4486:1: 'belongsTo'
            {
             before(grammarAccess.getSignal_ImplAccess().getBelongsToKeyword_2()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Signal_Impl__Group__2__Impl8872); 
             after(grammarAccess.getSignal_ImplAccess().getBelongsToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__2__Impl"


    // $ANTLR start "rule__Signal_Impl__Group__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4499:1: rule__Signal_Impl__Group__3 : rule__Signal_Impl__Group__3__Impl rule__Signal_Impl__Group__4 ;
    public final void rule__Signal_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4503:1: ( rule__Signal_Impl__Group__3__Impl rule__Signal_Impl__Group__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4504:2: rule__Signal_Impl__Group__3__Impl rule__Signal_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__3__Impl_in_rule__Signal_Impl__Group__38903);
            rule__Signal_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__4_in_rule__Signal_Impl__Group__38906);
            rule__Signal_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__3"


    // $ANTLR start "rule__Signal_Impl__Group__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4511:1: rule__Signal_Impl__Group__3__Impl : ( ( rule__Signal_Impl__BelongsToAssignment_3 ) ) ;
    public final void rule__Signal_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4515:1: ( ( ( rule__Signal_Impl__BelongsToAssignment_3 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4516:1: ( ( rule__Signal_Impl__BelongsToAssignment_3 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4516:1: ( ( rule__Signal_Impl__BelongsToAssignment_3 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4517:1: ( rule__Signal_Impl__BelongsToAssignment_3 )
            {
             before(grammarAccess.getSignal_ImplAccess().getBelongsToAssignment_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4518:1: ( rule__Signal_Impl__BelongsToAssignment_3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4518:2: rule__Signal_Impl__BelongsToAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__BelongsToAssignment_3_in_rule__Signal_Impl__Group__3__Impl8933);
            rule__Signal_Impl__BelongsToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSignal_ImplAccess().getBelongsToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__3__Impl"


    // $ANTLR start "rule__Signal_Impl__Group__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4528:1: rule__Signal_Impl__Group__4 : rule__Signal_Impl__Group__4__Impl ;
    public final void rule__Signal_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4532:1: ( rule__Signal_Impl__Group__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4533:2: rule__Signal_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__4__Impl_in_rule__Signal_Impl__Group__48963);
            rule__Signal_Impl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__4"


    // $ANTLR start "rule__Signal_Impl__Group__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4539:1: rule__Signal_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__Signal_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4543:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4544:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4544:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4545:1: '}'
            {
             before(grammarAccess.getSignal_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Signal_Impl__Group__4__Impl8991); 
             after(grammarAccess.getSignal_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__4__Impl"


    // $ANTLR start "rule__Extractor__Group__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4568:1: rule__Extractor__Group__0 : rule__Extractor__Group__0__Impl rule__Extractor__Group__1 ;
    public final void rule__Extractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4572:1: ( rule__Extractor__Group__0__Impl rule__Extractor__Group__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4573:2: rule__Extractor__Group__0__Impl rule__Extractor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__0__Impl_in_rule__Extractor__Group__09032);
            rule__Extractor__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__1_in_rule__Extractor__Group__09035);
            rule__Extractor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__0"


    // $ANTLR start "rule__Extractor__Group__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4580:1: rule__Extractor__Group__0__Impl : ( () ) ;
    public final void rule__Extractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4584:1: ( ( () ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4585:1: ( () )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4585:1: ( () )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4586:1: ()
            {
             before(grammarAccess.getExtractorAccess().getExtractorAction_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4587:1: ()
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4589:1: 
            {
            }

             after(grammarAccess.getExtractorAccess().getExtractorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__0__Impl"


    // $ANTLR start "rule__Extractor__Group__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4599:1: rule__Extractor__Group__1 : rule__Extractor__Group__1__Impl rule__Extractor__Group__2 ;
    public final void rule__Extractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4603:1: ( rule__Extractor__Group__1__Impl rule__Extractor__Group__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4604:2: rule__Extractor__Group__1__Impl rule__Extractor__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__1__Impl_in_rule__Extractor__Group__19093);
            rule__Extractor__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__2_in_rule__Extractor__Group__19096);
            rule__Extractor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__1"


    // $ANTLR start "rule__Extractor__Group__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4611:1: rule__Extractor__Group__1__Impl : ( 'Extractor' ) ;
    public final void rule__Extractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4615:1: ( ( 'Extractor' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4616:1: ( 'Extractor' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4616:1: ( 'Extractor' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4617:1: 'Extractor'
            {
             before(grammarAccess.getExtractorAccess().getExtractorKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Extractor__Group__1__Impl9124); 
             after(grammarAccess.getExtractorAccess().getExtractorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__1__Impl"


    // $ANTLR start "rule__Extractor__Group__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4630:1: rule__Extractor__Group__2 : rule__Extractor__Group__2__Impl rule__Extractor__Group__3 ;
    public final void rule__Extractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4634:1: ( rule__Extractor__Group__2__Impl rule__Extractor__Group__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4635:2: rule__Extractor__Group__2__Impl rule__Extractor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__2__Impl_in_rule__Extractor__Group__29155);
            rule__Extractor__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__3_in_rule__Extractor__Group__29158);
            rule__Extractor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__2"


    // $ANTLR start "rule__Extractor__Group__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4642:1: rule__Extractor__Group__2__Impl : ( '{' ) ;
    public final void rule__Extractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4646:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4647:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4647:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4648:1: '{'
            {
             before(grammarAccess.getExtractorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Extractor__Group__2__Impl9186); 
             after(grammarAccess.getExtractorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__2__Impl"


    // $ANTLR start "rule__Extractor__Group__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4661:1: rule__Extractor__Group__3 : rule__Extractor__Group__3__Impl rule__Extractor__Group__4 ;
    public final void rule__Extractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4665:1: ( rule__Extractor__Group__3__Impl rule__Extractor__Group__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4666:2: rule__Extractor__Group__3__Impl rule__Extractor__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__3__Impl_in_rule__Extractor__Group__39217);
            rule__Extractor__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__4_in_rule__Extractor__Group__39220);
            rule__Extractor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__3"


    // $ANTLR start "rule__Extractor__Group__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4673:1: rule__Extractor__Group__3__Impl : ( ( rule__Extractor__Group_3__0 )? ) ;
    public final void rule__Extractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4677:1: ( ( ( rule__Extractor__Group_3__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4678:1: ( ( rule__Extractor__Group_3__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4678:1: ( ( rule__Extractor__Group_3__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4679:1: ( rule__Extractor__Group_3__0 )?
            {
             before(grammarAccess.getExtractorAccess().getGroup_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4680:1: ( rule__Extractor__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4680:2: rule__Extractor__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3__0_in_rule__Extractor__Group__3__Impl9247);
                    rule__Extractor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtractorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__3__Impl"


    // $ANTLR start "rule__Extractor__Group__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4690:1: rule__Extractor__Group__4 : rule__Extractor__Group__4__Impl rule__Extractor__Group__5 ;
    public final void rule__Extractor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4694:1: ( rule__Extractor__Group__4__Impl rule__Extractor__Group__5 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4695:2: rule__Extractor__Group__4__Impl rule__Extractor__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__4__Impl_in_rule__Extractor__Group__49278);
            rule__Extractor__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__5_in_rule__Extractor__Group__49281);
            rule__Extractor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__4"


    // $ANTLR start "rule__Extractor__Group__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4702:1: rule__Extractor__Group__4__Impl : ( 'hasEnds' ) ;
    public final void rule__Extractor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4706:1: ( ( 'hasEnds' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4707:1: ( 'hasEnds' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4707:1: ( 'hasEnds' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4708:1: 'hasEnds'
            {
             before(grammarAccess.getExtractorAccess().getHasEndsKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Extractor__Group__4__Impl9309); 
             after(grammarAccess.getExtractorAccess().getHasEndsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__4__Impl"


    // $ANTLR start "rule__Extractor__Group__5"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4721:1: rule__Extractor__Group__5 : rule__Extractor__Group__5__Impl rule__Extractor__Group__6 ;
    public final void rule__Extractor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4725:1: ( rule__Extractor__Group__5__Impl rule__Extractor__Group__6 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4726:2: rule__Extractor__Group__5__Impl rule__Extractor__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__5__Impl_in_rule__Extractor__Group__59340);
            rule__Extractor__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__6_in_rule__Extractor__Group__59343);
            rule__Extractor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__5"


    // $ANTLR start "rule__Extractor__Group__5__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4733:1: rule__Extractor__Group__5__Impl : ( '(' ) ;
    public final void rule__Extractor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4737:1: ( ( '(' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4738:1: ( '(' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4738:1: ( '(' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4739:1: '('
            {
             before(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Extractor__Group__5__Impl9371); 
             after(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__5__Impl"


    // $ANTLR start "rule__Extractor__Group__6"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4752:1: rule__Extractor__Group__6 : rule__Extractor__Group__6__Impl rule__Extractor__Group__7 ;
    public final void rule__Extractor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4756:1: ( rule__Extractor__Group__6__Impl rule__Extractor__Group__7 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4757:2: rule__Extractor__Group__6__Impl rule__Extractor__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__6__Impl_in_rule__Extractor__Group__69402);
            rule__Extractor__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__7_in_rule__Extractor__Group__69405);
            rule__Extractor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__6"


    // $ANTLR start "rule__Extractor__Group__6__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4764:1: rule__Extractor__Group__6__Impl : ( ( rule__Extractor__HasEndsAssignment_6 ) ) ;
    public final void rule__Extractor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4768:1: ( ( ( rule__Extractor__HasEndsAssignment_6 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4769:1: ( ( rule__Extractor__HasEndsAssignment_6 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4769:1: ( ( rule__Extractor__HasEndsAssignment_6 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4770:1: ( rule__Extractor__HasEndsAssignment_6 )
            {
             before(grammarAccess.getExtractorAccess().getHasEndsAssignment_6()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4771:1: ( rule__Extractor__HasEndsAssignment_6 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4771:2: rule__Extractor__HasEndsAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__HasEndsAssignment_6_in_rule__Extractor__Group__6__Impl9432);
            rule__Extractor__HasEndsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getHasEndsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__6__Impl"


    // $ANTLR start "rule__Extractor__Group__7"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4781:1: rule__Extractor__Group__7 : rule__Extractor__Group__7__Impl rule__Extractor__Group__8 ;
    public final void rule__Extractor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4785:1: ( rule__Extractor__Group__7__Impl rule__Extractor__Group__8 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4786:2: rule__Extractor__Group__7__Impl rule__Extractor__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__7__Impl_in_rule__Extractor__Group__79462);
            rule__Extractor__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__8_in_rule__Extractor__Group__79465);
            rule__Extractor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__7"


    // $ANTLR start "rule__Extractor__Group__7__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4793:1: rule__Extractor__Group__7__Impl : ( ( rule__Extractor__Group_7__0 )* ) ;
    public final void rule__Extractor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4797:1: ( ( ( rule__Extractor__Group_7__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4798:1: ( ( rule__Extractor__Group_7__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4798:1: ( ( rule__Extractor__Group_7__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4799:1: ( rule__Extractor__Group_7__0 )*
            {
             before(grammarAccess.getExtractorAccess().getGroup_7()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4800:1: ( rule__Extractor__Group_7__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==17) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4800:2: rule__Extractor__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_7__0_in_rule__Extractor__Group__7__Impl9492);
            	    rule__Extractor__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getExtractorAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__7__Impl"


    // $ANTLR start "rule__Extractor__Group__8"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4810:1: rule__Extractor__Group__8 : rule__Extractor__Group__8__Impl rule__Extractor__Group__9 ;
    public final void rule__Extractor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4814:1: ( rule__Extractor__Group__8__Impl rule__Extractor__Group__9 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4815:2: rule__Extractor__Group__8__Impl rule__Extractor__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__8__Impl_in_rule__Extractor__Group__89523);
            rule__Extractor__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__9_in_rule__Extractor__Group__89526);
            rule__Extractor__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__8"


    // $ANTLR start "rule__Extractor__Group__8__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4822:1: rule__Extractor__Group__8__Impl : ( ')' ) ;
    public final void rule__Extractor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4826:1: ( ( ')' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4827:1: ( ')' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4827:1: ( ')' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4828:1: ')'
            {
             before(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_8()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Extractor__Group__8__Impl9554); 
             after(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__8__Impl"


    // $ANTLR start "rule__Extractor__Group__9"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4841:1: rule__Extractor__Group__9 : rule__Extractor__Group__9__Impl rule__Extractor__Group__10 ;
    public final void rule__Extractor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4845:1: ( rule__Extractor__Group__9__Impl rule__Extractor__Group__10 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4846:2: rule__Extractor__Group__9__Impl rule__Extractor__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__9__Impl_in_rule__Extractor__Group__99585);
            rule__Extractor__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__10_in_rule__Extractor__Group__99588);
            rule__Extractor__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__9"


    // $ANTLR start "rule__Extractor__Group__9__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4853:1: rule__Extractor__Group__9__Impl : ( ( rule__Extractor__Group_9__0 )? ) ;
    public final void rule__Extractor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4857:1: ( ( ( rule__Extractor__Group_9__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4858:1: ( ( rule__Extractor__Group_9__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4858:1: ( ( rule__Extractor__Group_9__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4859:1: ( rule__Extractor__Group_9__0 )?
            {
             before(grammarAccess.getExtractorAccess().getGroup_9()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4860:1: ( rule__Extractor__Group_9__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4860:2: rule__Extractor__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_9__0_in_rule__Extractor__Group__9__Impl9615);
                    rule__Extractor__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtractorAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__9__Impl"


    // $ANTLR start "rule__Extractor__Group__10"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4870:1: rule__Extractor__Group__10 : rule__Extractor__Group__10__Impl rule__Extractor__Group__11 ;
    public final void rule__Extractor__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4874:1: ( rule__Extractor__Group__10__Impl rule__Extractor__Group__11 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4875:2: rule__Extractor__Group__10__Impl rule__Extractor__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__10__Impl_in_rule__Extractor__Group__109646);
            rule__Extractor__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__11_in_rule__Extractor__Group__109649);
            rule__Extractor__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__10"


    // $ANTLR start "rule__Extractor__Group__10__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4882:1: rule__Extractor__Group__10__Impl : ( ( rule__Extractor__Group_10__0 )? ) ;
    public final void rule__Extractor__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4886:1: ( ( ( rule__Extractor__Group_10__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4887:1: ( ( rule__Extractor__Group_10__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4887:1: ( ( rule__Extractor__Group_10__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4888:1: ( rule__Extractor__Group_10__0 )?
            {
             before(grammarAccess.getExtractorAccess().getGroup_10()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4889:1: ( rule__Extractor__Group_10__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4889:2: rule__Extractor__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__0_in_rule__Extractor__Group__10__Impl9676);
                    rule__Extractor__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtractorAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__10__Impl"


    // $ANTLR start "rule__Extractor__Group__11"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4899:1: rule__Extractor__Group__11 : rule__Extractor__Group__11__Impl ;
    public final void rule__Extractor__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4903:1: ( rule__Extractor__Group__11__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4904:2: rule__Extractor__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__11__Impl_in_rule__Extractor__Group__119707);
            rule__Extractor__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__11"


    // $ANTLR start "rule__Extractor__Group__11__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4910:1: rule__Extractor__Group__11__Impl : ( '}' ) ;
    public final void rule__Extractor__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4914:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4915:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4915:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4916:1: '}'
            {
             before(grammarAccess.getExtractorAccess().getRightCurlyBracketKeyword_11()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Extractor__Group__11__Impl9735); 
             after(grammarAccess.getExtractorAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__11__Impl"


    // $ANTLR start "rule__Extractor__Group_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4953:1: rule__Extractor__Group_3__0 : rule__Extractor__Group_3__0__Impl rule__Extractor__Group_3__1 ;
    public final void rule__Extractor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4957:1: ( rule__Extractor__Group_3__0__Impl rule__Extractor__Group_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4958:2: rule__Extractor__Group_3__0__Impl rule__Extractor__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3__0__Impl_in_rule__Extractor__Group_3__09790);
            rule__Extractor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3__1_in_rule__Extractor__Group_3__09793);
            rule__Extractor__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3__0"


    // $ANTLR start "rule__Extractor__Group_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4965:1: rule__Extractor__Group_3__0__Impl : ( 'hasStarts' ) ;
    public final void rule__Extractor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4969:1: ( ( 'hasStarts' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4970:1: ( 'hasStarts' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4970:1: ( 'hasStarts' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4971:1: 'hasStarts'
            {
             before(grammarAccess.getExtractorAccess().getHasStartsKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Extractor__Group_3__0__Impl9821); 
             after(grammarAccess.getExtractorAccess().getHasStartsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3__0__Impl"


    // $ANTLR start "rule__Extractor__Group_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4984:1: rule__Extractor__Group_3__1 : rule__Extractor__Group_3__1__Impl rule__Extractor__Group_3__2 ;
    public final void rule__Extractor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4988:1: ( rule__Extractor__Group_3__1__Impl rule__Extractor__Group_3__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4989:2: rule__Extractor__Group_3__1__Impl rule__Extractor__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3__1__Impl_in_rule__Extractor__Group_3__19852);
            rule__Extractor__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3__2_in_rule__Extractor__Group_3__19855);
            rule__Extractor__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3__1"


    // $ANTLR start "rule__Extractor__Group_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:4996:1: rule__Extractor__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Extractor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5000:1: ( ( '(' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5001:1: ( '(' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5001:1: ( '(' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5002:1: '('
            {
             before(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Extractor__Group_3__1__Impl9883); 
             after(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3__1__Impl"


    // $ANTLR start "rule__Extractor__Group_3__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5015:1: rule__Extractor__Group_3__2 : rule__Extractor__Group_3__2__Impl rule__Extractor__Group_3__3 ;
    public final void rule__Extractor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5019:1: ( rule__Extractor__Group_3__2__Impl rule__Extractor__Group_3__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5020:2: rule__Extractor__Group_3__2__Impl rule__Extractor__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3__2__Impl_in_rule__Extractor__Group_3__29914);
            rule__Extractor__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3__3_in_rule__Extractor__Group_3__29917);
            rule__Extractor__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3__2"


    // $ANTLR start "rule__Extractor__Group_3__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5027:1: rule__Extractor__Group_3__2__Impl : ( ( rule__Extractor__HasStartsAssignment_3_2 ) ) ;
    public final void rule__Extractor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5031:1: ( ( ( rule__Extractor__HasStartsAssignment_3_2 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5032:1: ( ( rule__Extractor__HasStartsAssignment_3_2 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5032:1: ( ( rule__Extractor__HasStartsAssignment_3_2 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5033:1: ( rule__Extractor__HasStartsAssignment_3_2 )
            {
             before(grammarAccess.getExtractorAccess().getHasStartsAssignment_3_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5034:1: ( rule__Extractor__HasStartsAssignment_3_2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5034:2: rule__Extractor__HasStartsAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__HasStartsAssignment_3_2_in_rule__Extractor__Group_3__2__Impl9944);
            rule__Extractor__HasStartsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getHasStartsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3__2__Impl"


    // $ANTLR start "rule__Extractor__Group_3__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5044:1: rule__Extractor__Group_3__3 : rule__Extractor__Group_3__3__Impl rule__Extractor__Group_3__4 ;
    public final void rule__Extractor__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5048:1: ( rule__Extractor__Group_3__3__Impl rule__Extractor__Group_3__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5049:2: rule__Extractor__Group_3__3__Impl rule__Extractor__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3__3__Impl_in_rule__Extractor__Group_3__39974);
            rule__Extractor__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3__4_in_rule__Extractor__Group_3__39977);
            rule__Extractor__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3__3"


    // $ANTLR start "rule__Extractor__Group_3__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5056:1: rule__Extractor__Group_3__3__Impl : ( ( rule__Extractor__Group_3_3__0 )* ) ;
    public final void rule__Extractor__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5060:1: ( ( ( rule__Extractor__Group_3_3__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5061:1: ( ( rule__Extractor__Group_3_3__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5061:1: ( ( rule__Extractor__Group_3_3__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5062:1: ( rule__Extractor__Group_3_3__0 )*
            {
             before(grammarAccess.getExtractorAccess().getGroup_3_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5063:1: ( rule__Extractor__Group_3_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==17) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5063:2: rule__Extractor__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3_3__0_in_rule__Extractor__Group_3__3__Impl10004);
            	    rule__Extractor__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getExtractorAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3__3__Impl"


    // $ANTLR start "rule__Extractor__Group_3__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5073:1: rule__Extractor__Group_3__4 : rule__Extractor__Group_3__4__Impl ;
    public final void rule__Extractor__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5077:1: ( rule__Extractor__Group_3__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5078:2: rule__Extractor__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3__4__Impl_in_rule__Extractor__Group_3__410035);
            rule__Extractor__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3__4"


    // $ANTLR start "rule__Extractor__Group_3__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5084:1: rule__Extractor__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Extractor__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5088:1: ( ( ')' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5089:1: ( ')' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5089:1: ( ')' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5090:1: ')'
            {
             before(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_3_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Extractor__Group_3__4__Impl10063); 
             after(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3__4__Impl"


    // $ANTLR start "rule__Extractor__Group_3_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5113:1: rule__Extractor__Group_3_3__0 : rule__Extractor__Group_3_3__0__Impl rule__Extractor__Group_3_3__1 ;
    public final void rule__Extractor__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5117:1: ( rule__Extractor__Group_3_3__0__Impl rule__Extractor__Group_3_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5118:2: rule__Extractor__Group_3_3__0__Impl rule__Extractor__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3_3__0__Impl_in_rule__Extractor__Group_3_3__010104);
            rule__Extractor__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3_3__1_in_rule__Extractor__Group_3_3__010107);
            rule__Extractor__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3_3__0"


    // $ANTLR start "rule__Extractor__Group_3_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5125:1: rule__Extractor__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Extractor__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5129:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5130:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5130:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5131:1: ','
            {
             before(grammarAccess.getExtractorAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Extractor__Group_3_3__0__Impl10135); 
             after(grammarAccess.getExtractorAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3_3__0__Impl"


    // $ANTLR start "rule__Extractor__Group_3_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5144:1: rule__Extractor__Group_3_3__1 : rule__Extractor__Group_3_3__1__Impl ;
    public final void rule__Extractor__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5148:1: ( rule__Extractor__Group_3_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5149:2: rule__Extractor__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_3_3__1__Impl_in_rule__Extractor__Group_3_3__110166);
            rule__Extractor__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3_3__1"


    // $ANTLR start "rule__Extractor__Group_3_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5155:1: rule__Extractor__Group_3_3__1__Impl : ( ( rule__Extractor__HasStartsAssignment_3_3_1 ) ) ;
    public final void rule__Extractor__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5159:1: ( ( ( rule__Extractor__HasStartsAssignment_3_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5160:1: ( ( rule__Extractor__HasStartsAssignment_3_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5160:1: ( ( rule__Extractor__HasStartsAssignment_3_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5161:1: ( rule__Extractor__HasStartsAssignment_3_3_1 )
            {
             before(grammarAccess.getExtractorAccess().getHasStartsAssignment_3_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5162:1: ( rule__Extractor__HasStartsAssignment_3_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5162:2: rule__Extractor__HasStartsAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__HasStartsAssignment_3_3_1_in_rule__Extractor__Group_3_3__1__Impl10193);
            rule__Extractor__HasStartsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getHasStartsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_3_3__1__Impl"


    // $ANTLR start "rule__Extractor__Group_7__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5176:1: rule__Extractor__Group_7__0 : rule__Extractor__Group_7__0__Impl rule__Extractor__Group_7__1 ;
    public final void rule__Extractor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5180:1: ( rule__Extractor__Group_7__0__Impl rule__Extractor__Group_7__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5181:2: rule__Extractor__Group_7__0__Impl rule__Extractor__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_7__0__Impl_in_rule__Extractor__Group_7__010227);
            rule__Extractor__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_7__1_in_rule__Extractor__Group_7__010230);
            rule__Extractor__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_7__0"


    // $ANTLR start "rule__Extractor__Group_7__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5188:1: rule__Extractor__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Extractor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5192:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5193:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5193:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5194:1: ','
            {
             before(grammarAccess.getExtractorAccess().getCommaKeyword_7_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Extractor__Group_7__0__Impl10258); 
             after(grammarAccess.getExtractorAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_7__0__Impl"


    // $ANTLR start "rule__Extractor__Group_7__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5207:1: rule__Extractor__Group_7__1 : rule__Extractor__Group_7__1__Impl ;
    public final void rule__Extractor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5211:1: ( rule__Extractor__Group_7__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5212:2: rule__Extractor__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_7__1__Impl_in_rule__Extractor__Group_7__110289);
            rule__Extractor__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_7__1"


    // $ANTLR start "rule__Extractor__Group_7__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5218:1: rule__Extractor__Group_7__1__Impl : ( ( rule__Extractor__HasEndsAssignment_7_1 ) ) ;
    public final void rule__Extractor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5222:1: ( ( ( rule__Extractor__HasEndsAssignment_7_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5223:1: ( ( rule__Extractor__HasEndsAssignment_7_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5223:1: ( ( rule__Extractor__HasEndsAssignment_7_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5224:1: ( rule__Extractor__HasEndsAssignment_7_1 )
            {
             before(grammarAccess.getExtractorAccess().getHasEndsAssignment_7_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5225:1: ( rule__Extractor__HasEndsAssignment_7_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5225:2: rule__Extractor__HasEndsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__HasEndsAssignment_7_1_in_rule__Extractor__Group_7__1__Impl10316);
            rule__Extractor__HasEndsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getHasEndsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_7__1__Impl"


    // $ANTLR start "rule__Extractor__Group_9__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5239:1: rule__Extractor__Group_9__0 : rule__Extractor__Group_9__0__Impl rule__Extractor__Group_9__1 ;
    public final void rule__Extractor__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5243:1: ( rule__Extractor__Group_9__0__Impl rule__Extractor__Group_9__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5244:2: rule__Extractor__Group_9__0__Impl rule__Extractor__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_9__0__Impl_in_rule__Extractor__Group_9__010350);
            rule__Extractor__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_9__1_in_rule__Extractor__Group_9__010353);
            rule__Extractor__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_9__0"


    // $ANTLR start "rule__Extractor__Group_9__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5251:1: rule__Extractor__Group_9__0__Impl : ( 'semaphore' ) ;
    public final void rule__Extractor__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5255:1: ( ( 'semaphore' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5256:1: ( 'semaphore' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5256:1: ( 'semaphore' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5257:1: 'semaphore'
            {
             before(grammarAccess.getExtractorAccess().getSemaphoreKeyword_9_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Extractor__Group_9__0__Impl10381); 
             after(grammarAccess.getExtractorAccess().getSemaphoreKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_9__0__Impl"


    // $ANTLR start "rule__Extractor__Group_9__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5270:1: rule__Extractor__Group_9__1 : rule__Extractor__Group_9__1__Impl ;
    public final void rule__Extractor__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5274:1: ( rule__Extractor__Group_9__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5275:2: rule__Extractor__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_9__1__Impl_in_rule__Extractor__Group_9__110412);
            rule__Extractor__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_9__1"


    // $ANTLR start "rule__Extractor__Group_9__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5281:1: rule__Extractor__Group_9__1__Impl : ( ( rule__Extractor__SemaphoreAssignment_9_1 ) ) ;
    public final void rule__Extractor__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5285:1: ( ( ( rule__Extractor__SemaphoreAssignment_9_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5286:1: ( ( rule__Extractor__SemaphoreAssignment_9_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5286:1: ( ( rule__Extractor__SemaphoreAssignment_9_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5287:1: ( rule__Extractor__SemaphoreAssignment_9_1 )
            {
             before(grammarAccess.getExtractorAccess().getSemaphoreAssignment_9_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5288:1: ( rule__Extractor__SemaphoreAssignment_9_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5288:2: rule__Extractor__SemaphoreAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__SemaphoreAssignment_9_1_in_rule__Extractor__Group_9__1__Impl10439);
            rule__Extractor__SemaphoreAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getSemaphoreAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_9__1__Impl"


    // $ANTLR start "rule__Extractor__Group_10__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5302:1: rule__Extractor__Group_10__0 : rule__Extractor__Group_10__0__Impl rule__Extractor__Group_10__1 ;
    public final void rule__Extractor__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5306:1: ( rule__Extractor__Group_10__0__Impl rule__Extractor__Group_10__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5307:2: rule__Extractor__Group_10__0__Impl rule__Extractor__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__0__Impl_in_rule__Extractor__Group_10__010473);
            rule__Extractor__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__1_in_rule__Extractor__Group_10__010476);
            rule__Extractor__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10__0"


    // $ANTLR start "rule__Extractor__Group_10__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5314:1: rule__Extractor__Group_10__0__Impl : ( 'signals' ) ;
    public final void rule__Extractor__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5318:1: ( ( 'signals' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5319:1: ( 'signals' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5319:1: ( 'signals' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5320:1: 'signals'
            {
             before(grammarAccess.getExtractorAccess().getSignalsKeyword_10_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Extractor__Group_10__0__Impl10504); 
             after(grammarAccess.getExtractorAccess().getSignalsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10__0__Impl"


    // $ANTLR start "rule__Extractor__Group_10__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5333:1: rule__Extractor__Group_10__1 : rule__Extractor__Group_10__1__Impl rule__Extractor__Group_10__2 ;
    public final void rule__Extractor__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5337:1: ( rule__Extractor__Group_10__1__Impl rule__Extractor__Group_10__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5338:2: rule__Extractor__Group_10__1__Impl rule__Extractor__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__1__Impl_in_rule__Extractor__Group_10__110535);
            rule__Extractor__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__2_in_rule__Extractor__Group_10__110538);
            rule__Extractor__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10__1"


    // $ANTLR start "rule__Extractor__Group_10__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5345:1: rule__Extractor__Group_10__1__Impl : ( '(' ) ;
    public final void rule__Extractor__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5349:1: ( ( '(' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5350:1: ( '(' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5350:1: ( '(' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5351:1: '('
            {
             before(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Extractor__Group_10__1__Impl10566); 
             after(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10__1__Impl"


    // $ANTLR start "rule__Extractor__Group_10__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5364:1: rule__Extractor__Group_10__2 : rule__Extractor__Group_10__2__Impl rule__Extractor__Group_10__3 ;
    public final void rule__Extractor__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5368:1: ( rule__Extractor__Group_10__2__Impl rule__Extractor__Group_10__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5369:2: rule__Extractor__Group_10__2__Impl rule__Extractor__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__2__Impl_in_rule__Extractor__Group_10__210597);
            rule__Extractor__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__3_in_rule__Extractor__Group_10__210600);
            rule__Extractor__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10__2"


    // $ANTLR start "rule__Extractor__Group_10__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5376:1: rule__Extractor__Group_10__2__Impl : ( ( rule__Extractor__SignalsAssignment_10_2 ) ) ;
    public final void rule__Extractor__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5380:1: ( ( ( rule__Extractor__SignalsAssignment_10_2 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5381:1: ( ( rule__Extractor__SignalsAssignment_10_2 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5381:1: ( ( rule__Extractor__SignalsAssignment_10_2 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5382:1: ( rule__Extractor__SignalsAssignment_10_2 )
            {
             before(grammarAccess.getExtractorAccess().getSignalsAssignment_10_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5383:1: ( rule__Extractor__SignalsAssignment_10_2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5383:2: rule__Extractor__SignalsAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__SignalsAssignment_10_2_in_rule__Extractor__Group_10__2__Impl10627);
            rule__Extractor__SignalsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getSignalsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10__2__Impl"


    // $ANTLR start "rule__Extractor__Group_10__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5393:1: rule__Extractor__Group_10__3 : rule__Extractor__Group_10__3__Impl rule__Extractor__Group_10__4 ;
    public final void rule__Extractor__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5397:1: ( rule__Extractor__Group_10__3__Impl rule__Extractor__Group_10__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5398:2: rule__Extractor__Group_10__3__Impl rule__Extractor__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__3__Impl_in_rule__Extractor__Group_10__310657);
            rule__Extractor__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__4_in_rule__Extractor__Group_10__310660);
            rule__Extractor__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10__3"


    // $ANTLR start "rule__Extractor__Group_10__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5405:1: rule__Extractor__Group_10__3__Impl : ( ( rule__Extractor__Group_10_3__0 )* ) ;
    public final void rule__Extractor__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5409:1: ( ( ( rule__Extractor__Group_10_3__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5410:1: ( ( rule__Extractor__Group_10_3__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5410:1: ( ( rule__Extractor__Group_10_3__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5411:1: ( rule__Extractor__Group_10_3__0 )*
            {
             before(grammarAccess.getExtractorAccess().getGroup_10_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5412:1: ( rule__Extractor__Group_10_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==17) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5412:2: rule__Extractor__Group_10_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10_3__0_in_rule__Extractor__Group_10__3__Impl10687);
            	    rule__Extractor__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getExtractorAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10__3__Impl"


    // $ANTLR start "rule__Extractor__Group_10__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5422:1: rule__Extractor__Group_10__4 : rule__Extractor__Group_10__4__Impl ;
    public final void rule__Extractor__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5426:1: ( rule__Extractor__Group_10__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5427:2: rule__Extractor__Group_10__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__4__Impl_in_rule__Extractor__Group_10__410718);
            rule__Extractor__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10__4"


    // $ANTLR start "rule__Extractor__Group_10__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5433:1: rule__Extractor__Group_10__4__Impl : ( ')' ) ;
    public final void rule__Extractor__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5437:1: ( ( ')' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5438:1: ( ')' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5438:1: ( ')' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5439:1: ')'
            {
             before(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_10_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Extractor__Group_10__4__Impl10746); 
             after(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10__4__Impl"


    // $ANTLR start "rule__Extractor__Group_10_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5462:1: rule__Extractor__Group_10_3__0 : rule__Extractor__Group_10_3__0__Impl rule__Extractor__Group_10_3__1 ;
    public final void rule__Extractor__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5466:1: ( rule__Extractor__Group_10_3__0__Impl rule__Extractor__Group_10_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5467:2: rule__Extractor__Group_10_3__0__Impl rule__Extractor__Group_10_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10_3__0__Impl_in_rule__Extractor__Group_10_3__010787);
            rule__Extractor__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10_3__1_in_rule__Extractor__Group_10_3__010790);
            rule__Extractor__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10_3__0"


    // $ANTLR start "rule__Extractor__Group_10_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5474:1: rule__Extractor__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Extractor__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5478:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5479:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5479:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5480:1: ','
            {
             before(grammarAccess.getExtractorAccess().getCommaKeyword_10_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Extractor__Group_10_3__0__Impl10818); 
             after(grammarAccess.getExtractorAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10_3__0__Impl"


    // $ANTLR start "rule__Extractor__Group_10_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5493:1: rule__Extractor__Group_10_3__1 : rule__Extractor__Group_10_3__1__Impl ;
    public final void rule__Extractor__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5497:1: ( rule__Extractor__Group_10_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5498:2: rule__Extractor__Group_10_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10_3__1__Impl_in_rule__Extractor__Group_10_3__110849);
            rule__Extractor__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10_3__1"


    // $ANTLR start "rule__Extractor__Group_10_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5504:1: rule__Extractor__Group_10_3__1__Impl : ( ( rule__Extractor__SignalsAssignment_10_3_1 ) ) ;
    public final void rule__Extractor__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5508:1: ( ( ( rule__Extractor__SignalsAssignment_10_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5509:1: ( ( rule__Extractor__SignalsAssignment_10_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5509:1: ( ( rule__Extractor__SignalsAssignment_10_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5510:1: ( rule__Extractor__SignalsAssignment_10_3_1 )
            {
             before(grammarAccess.getExtractorAccess().getSignalsAssignment_10_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5511:1: ( rule__Extractor__SignalsAssignment_10_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5511:2: rule__Extractor__SignalsAssignment_10_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__SignalsAssignment_10_3_1_in_rule__Extractor__Group_10_3__1__Impl10876);
            rule__Extractor__SignalsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getSignalsAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_10_3__1__Impl"


    // $ANTLR start "rule__Injector__Group__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5525:1: rule__Injector__Group__0 : rule__Injector__Group__0__Impl rule__Injector__Group__1 ;
    public final void rule__Injector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5529:1: ( rule__Injector__Group__0__Impl rule__Injector__Group__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5530:2: rule__Injector__Group__0__Impl rule__Injector__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__0__Impl_in_rule__Injector__Group__010910);
            rule__Injector__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__1_in_rule__Injector__Group__010913);
            rule__Injector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__0"


    // $ANTLR start "rule__Injector__Group__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5537:1: rule__Injector__Group__0__Impl : ( () ) ;
    public final void rule__Injector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5541:1: ( ( () ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5542:1: ( () )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5542:1: ( () )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5543:1: ()
            {
             before(grammarAccess.getInjectorAccess().getInjectorAction_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5544:1: ()
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5546:1: 
            {
            }

             after(grammarAccess.getInjectorAccess().getInjectorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__0__Impl"


    // $ANTLR start "rule__Injector__Group__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5556:1: rule__Injector__Group__1 : rule__Injector__Group__1__Impl rule__Injector__Group__2 ;
    public final void rule__Injector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5560:1: ( rule__Injector__Group__1__Impl rule__Injector__Group__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5561:2: rule__Injector__Group__1__Impl rule__Injector__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__1__Impl_in_rule__Injector__Group__110971);
            rule__Injector__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__2_in_rule__Injector__Group__110974);
            rule__Injector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__1"


    // $ANTLR start "rule__Injector__Group__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5568:1: rule__Injector__Group__1__Impl : ( 'Injector' ) ;
    public final void rule__Injector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5572:1: ( ( 'Injector' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5573:1: ( 'Injector' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5573:1: ( 'Injector' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5574:1: 'Injector'
            {
             before(grammarAccess.getInjectorAccess().getInjectorKeyword_1()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Injector__Group__1__Impl11002); 
             after(grammarAccess.getInjectorAccess().getInjectorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__1__Impl"


    // $ANTLR start "rule__Injector__Group__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5587:1: rule__Injector__Group__2 : rule__Injector__Group__2__Impl rule__Injector__Group__3 ;
    public final void rule__Injector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5591:1: ( rule__Injector__Group__2__Impl rule__Injector__Group__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5592:2: rule__Injector__Group__2__Impl rule__Injector__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__2__Impl_in_rule__Injector__Group__211033);
            rule__Injector__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__3_in_rule__Injector__Group__211036);
            rule__Injector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__2"


    // $ANTLR start "rule__Injector__Group__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5599:1: rule__Injector__Group__2__Impl : ( '{' ) ;
    public final void rule__Injector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5603:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5604:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5604:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5605:1: '{'
            {
             before(grammarAccess.getInjectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Injector__Group__2__Impl11064); 
             after(grammarAccess.getInjectorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__2__Impl"


    // $ANTLR start "rule__Injector__Group__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5618:1: rule__Injector__Group__3 : rule__Injector__Group__3__Impl rule__Injector__Group__4 ;
    public final void rule__Injector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5622:1: ( rule__Injector__Group__3__Impl rule__Injector__Group__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5623:2: rule__Injector__Group__3__Impl rule__Injector__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__3__Impl_in_rule__Injector__Group__311095);
            rule__Injector__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__4_in_rule__Injector__Group__311098);
            rule__Injector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__3"


    // $ANTLR start "rule__Injector__Group__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5630:1: rule__Injector__Group__3__Impl : ( ( rule__Injector__Group_3__0 )? ) ;
    public final void rule__Injector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5634:1: ( ( ( rule__Injector__Group_3__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5635:1: ( ( rule__Injector__Group_3__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5635:1: ( ( rule__Injector__Group_3__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5636:1: ( rule__Injector__Group_3__0 )?
            {
             before(grammarAccess.getInjectorAccess().getGroup_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5637:1: ( rule__Injector__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5637:2: rule__Injector__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_3__0_in_rule__Injector__Group__3__Impl11125);
                    rule__Injector__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInjectorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__3__Impl"


    // $ANTLR start "rule__Injector__Group__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5647:1: rule__Injector__Group__4 : rule__Injector__Group__4__Impl rule__Injector__Group__5 ;
    public final void rule__Injector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5651:1: ( rule__Injector__Group__4__Impl rule__Injector__Group__5 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5652:2: rule__Injector__Group__4__Impl rule__Injector__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__4__Impl_in_rule__Injector__Group__411156);
            rule__Injector__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__5_in_rule__Injector__Group__411159);
            rule__Injector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__4"


    // $ANTLR start "rule__Injector__Group__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5659:1: rule__Injector__Group__4__Impl : ( 'hasStarts' ) ;
    public final void rule__Injector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5663:1: ( ( 'hasStarts' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5664:1: ( 'hasStarts' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5664:1: ( 'hasStarts' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5665:1: 'hasStarts'
            {
             before(grammarAccess.getInjectorAccess().getHasStartsKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Injector__Group__4__Impl11187); 
             after(grammarAccess.getInjectorAccess().getHasStartsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__4__Impl"


    // $ANTLR start "rule__Injector__Group__5"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5678:1: rule__Injector__Group__5 : rule__Injector__Group__5__Impl rule__Injector__Group__6 ;
    public final void rule__Injector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5682:1: ( rule__Injector__Group__5__Impl rule__Injector__Group__6 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5683:2: rule__Injector__Group__5__Impl rule__Injector__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__5__Impl_in_rule__Injector__Group__511218);
            rule__Injector__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__6_in_rule__Injector__Group__511221);
            rule__Injector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__5"


    // $ANTLR start "rule__Injector__Group__5__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5690:1: rule__Injector__Group__5__Impl : ( '(' ) ;
    public final void rule__Injector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5694:1: ( ( '(' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5695:1: ( '(' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5695:1: ( '(' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5696:1: '('
            {
             before(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Injector__Group__5__Impl11249); 
             after(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__5__Impl"


    // $ANTLR start "rule__Injector__Group__6"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5709:1: rule__Injector__Group__6 : rule__Injector__Group__6__Impl rule__Injector__Group__7 ;
    public final void rule__Injector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5713:1: ( rule__Injector__Group__6__Impl rule__Injector__Group__7 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5714:2: rule__Injector__Group__6__Impl rule__Injector__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__6__Impl_in_rule__Injector__Group__611280);
            rule__Injector__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__7_in_rule__Injector__Group__611283);
            rule__Injector__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__6"


    // $ANTLR start "rule__Injector__Group__6__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5721:1: rule__Injector__Group__6__Impl : ( ( rule__Injector__HasStartsAssignment_6 ) ) ;
    public final void rule__Injector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5725:1: ( ( ( rule__Injector__HasStartsAssignment_6 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5726:1: ( ( rule__Injector__HasStartsAssignment_6 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5726:1: ( ( rule__Injector__HasStartsAssignment_6 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5727:1: ( rule__Injector__HasStartsAssignment_6 )
            {
             before(grammarAccess.getInjectorAccess().getHasStartsAssignment_6()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5728:1: ( rule__Injector__HasStartsAssignment_6 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5728:2: rule__Injector__HasStartsAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__HasStartsAssignment_6_in_rule__Injector__Group__6__Impl11310);
            rule__Injector__HasStartsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getHasStartsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__6__Impl"


    // $ANTLR start "rule__Injector__Group__7"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5738:1: rule__Injector__Group__7 : rule__Injector__Group__7__Impl rule__Injector__Group__8 ;
    public final void rule__Injector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5742:1: ( rule__Injector__Group__7__Impl rule__Injector__Group__8 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5743:2: rule__Injector__Group__7__Impl rule__Injector__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__7__Impl_in_rule__Injector__Group__711340);
            rule__Injector__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__8_in_rule__Injector__Group__711343);
            rule__Injector__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__7"


    // $ANTLR start "rule__Injector__Group__7__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5750:1: rule__Injector__Group__7__Impl : ( ( rule__Injector__Group_7__0 )* ) ;
    public final void rule__Injector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5754:1: ( ( ( rule__Injector__Group_7__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5755:1: ( ( rule__Injector__Group_7__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5755:1: ( ( rule__Injector__Group_7__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5756:1: ( rule__Injector__Group_7__0 )*
            {
             before(grammarAccess.getInjectorAccess().getGroup_7()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5757:1: ( rule__Injector__Group_7__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==17) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5757:2: rule__Injector__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_7__0_in_rule__Injector__Group__7__Impl11370);
            	    rule__Injector__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getInjectorAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__7__Impl"


    // $ANTLR start "rule__Injector__Group__8"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5767:1: rule__Injector__Group__8 : rule__Injector__Group__8__Impl rule__Injector__Group__9 ;
    public final void rule__Injector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5771:1: ( rule__Injector__Group__8__Impl rule__Injector__Group__9 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5772:2: rule__Injector__Group__8__Impl rule__Injector__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__8__Impl_in_rule__Injector__Group__811401);
            rule__Injector__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__9_in_rule__Injector__Group__811404);
            rule__Injector__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__8"


    // $ANTLR start "rule__Injector__Group__8__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5779:1: rule__Injector__Group__8__Impl : ( ')' ) ;
    public final void rule__Injector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5783:1: ( ( ')' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5784:1: ( ')' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5784:1: ( ')' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5785:1: ')'
            {
             before(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_8()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Injector__Group__8__Impl11432); 
             after(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__8__Impl"


    // $ANTLR start "rule__Injector__Group__9"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5798:1: rule__Injector__Group__9 : rule__Injector__Group__9__Impl rule__Injector__Group__10 ;
    public final void rule__Injector__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5802:1: ( rule__Injector__Group__9__Impl rule__Injector__Group__10 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5803:2: rule__Injector__Group__9__Impl rule__Injector__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__9__Impl_in_rule__Injector__Group__911463);
            rule__Injector__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__10_in_rule__Injector__Group__911466);
            rule__Injector__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__9"


    // $ANTLR start "rule__Injector__Group__9__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5810:1: rule__Injector__Group__9__Impl : ( ( rule__Injector__Group_9__0 )? ) ;
    public final void rule__Injector__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5814:1: ( ( ( rule__Injector__Group_9__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5815:1: ( ( rule__Injector__Group_9__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5815:1: ( ( rule__Injector__Group_9__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5816:1: ( rule__Injector__Group_9__0 )?
            {
             before(grammarAccess.getInjectorAccess().getGroup_9()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5817:1: ( rule__Injector__Group_9__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5817:2: rule__Injector__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9__0_in_rule__Injector__Group__9__Impl11493);
                    rule__Injector__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInjectorAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__9__Impl"


    // $ANTLR start "rule__Injector__Group__10"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5827:1: rule__Injector__Group__10 : rule__Injector__Group__10__Impl rule__Injector__Group__11 ;
    public final void rule__Injector__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5831:1: ( rule__Injector__Group__10__Impl rule__Injector__Group__11 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5832:2: rule__Injector__Group__10__Impl rule__Injector__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__10__Impl_in_rule__Injector__Group__1011524);
            rule__Injector__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__11_in_rule__Injector__Group__1011527);
            rule__Injector__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__10"


    // $ANTLR start "rule__Injector__Group__10__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5839:1: rule__Injector__Group__10__Impl : ( ( rule__Injector__Group_10__0 )? ) ;
    public final void rule__Injector__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5843:1: ( ( ( rule__Injector__Group_10__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5844:1: ( ( rule__Injector__Group_10__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5844:1: ( ( rule__Injector__Group_10__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5845:1: ( rule__Injector__Group_10__0 )?
            {
             before(grammarAccess.getInjectorAccess().getGroup_10()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5846:1: ( rule__Injector__Group_10__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==27) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5846:2: rule__Injector__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__0_in_rule__Injector__Group__10__Impl11554);
                    rule__Injector__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInjectorAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__10__Impl"


    // $ANTLR start "rule__Injector__Group__11"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5856:1: rule__Injector__Group__11 : rule__Injector__Group__11__Impl rule__Injector__Group__12 ;
    public final void rule__Injector__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5860:1: ( rule__Injector__Group__11__Impl rule__Injector__Group__12 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5861:2: rule__Injector__Group__11__Impl rule__Injector__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__11__Impl_in_rule__Injector__Group__1111585);
            rule__Injector__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__12_in_rule__Injector__Group__1111588);
            rule__Injector__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__11"


    // $ANTLR start "rule__Injector__Group__11__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5868:1: rule__Injector__Group__11__Impl : ( ( rule__Injector__Group_11__0 )? ) ;
    public final void rule__Injector__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5872:1: ( ( ( rule__Injector__Group_11__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5873:1: ( ( rule__Injector__Group_11__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5873:1: ( ( rule__Injector__Group_11__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5874:1: ( rule__Injector__Group_11__0 )?
            {
             before(grammarAccess.getInjectorAccess().getGroup_11()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5875:1: ( rule__Injector__Group_11__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5875:2: rule__Injector__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__0_in_rule__Injector__Group__11__Impl11615);
                    rule__Injector__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInjectorAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__11__Impl"


    // $ANTLR start "rule__Injector__Group__12"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5885:1: rule__Injector__Group__12 : rule__Injector__Group__12__Impl ;
    public final void rule__Injector__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5889:1: ( rule__Injector__Group__12__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5890:2: rule__Injector__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__12__Impl_in_rule__Injector__Group__1211646);
            rule__Injector__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__12"


    // $ANTLR start "rule__Injector__Group__12__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5896:1: rule__Injector__Group__12__Impl : ( '}' ) ;
    public final void rule__Injector__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5900:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5901:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5901:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5902:1: '}'
            {
             before(grammarAccess.getInjectorAccess().getRightCurlyBracketKeyword_12()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Injector__Group__12__Impl11674); 
             after(grammarAccess.getInjectorAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__12__Impl"


    // $ANTLR start "rule__Injector__Group_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5941:1: rule__Injector__Group_3__0 : rule__Injector__Group_3__0__Impl rule__Injector__Group_3__1 ;
    public final void rule__Injector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5945:1: ( rule__Injector__Group_3__0__Impl rule__Injector__Group_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5946:2: rule__Injector__Group_3__0__Impl rule__Injector__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_3__0__Impl_in_rule__Injector__Group_3__011731);
            rule__Injector__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_3__1_in_rule__Injector__Group_3__011734);
            rule__Injector__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_3__0"


    // $ANTLR start "rule__Injector__Group_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5953:1: rule__Injector__Group_3__0__Impl : ( 'carsPerHour' ) ;
    public final void rule__Injector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5957:1: ( ( 'carsPerHour' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5958:1: ( 'carsPerHour' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5958:1: ( 'carsPerHour' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5959:1: 'carsPerHour'
            {
             before(grammarAccess.getInjectorAccess().getCarsPerHourKeyword_3_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Injector__Group_3__0__Impl11762); 
             after(grammarAccess.getInjectorAccess().getCarsPerHourKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_3__0__Impl"


    // $ANTLR start "rule__Injector__Group_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5972:1: rule__Injector__Group_3__1 : rule__Injector__Group_3__1__Impl ;
    public final void rule__Injector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5976:1: ( rule__Injector__Group_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5977:2: rule__Injector__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_3__1__Impl_in_rule__Injector__Group_3__111793);
            rule__Injector__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_3__1"


    // $ANTLR start "rule__Injector__Group_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5983:1: rule__Injector__Group_3__1__Impl : ( ( rule__Injector__CarsPerHourAssignment_3_1 ) ) ;
    public final void rule__Injector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5987:1: ( ( ( rule__Injector__CarsPerHourAssignment_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5988:1: ( ( rule__Injector__CarsPerHourAssignment_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5988:1: ( ( rule__Injector__CarsPerHourAssignment_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5989:1: ( rule__Injector__CarsPerHourAssignment_3_1 )
            {
             before(grammarAccess.getInjectorAccess().getCarsPerHourAssignment_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5990:1: ( rule__Injector__CarsPerHourAssignment_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:5990:2: rule__Injector__CarsPerHourAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__CarsPerHourAssignment_3_1_in_rule__Injector__Group_3__1__Impl11820);
            rule__Injector__CarsPerHourAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getCarsPerHourAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_3__1__Impl"


    // $ANTLR start "rule__Injector__Group_7__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6004:1: rule__Injector__Group_7__0 : rule__Injector__Group_7__0__Impl rule__Injector__Group_7__1 ;
    public final void rule__Injector__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6008:1: ( rule__Injector__Group_7__0__Impl rule__Injector__Group_7__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6009:2: rule__Injector__Group_7__0__Impl rule__Injector__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_7__0__Impl_in_rule__Injector__Group_7__011854);
            rule__Injector__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_7__1_in_rule__Injector__Group_7__011857);
            rule__Injector__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_7__0"


    // $ANTLR start "rule__Injector__Group_7__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6016:1: rule__Injector__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Injector__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6020:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6021:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6021:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6022:1: ','
            {
             before(grammarAccess.getInjectorAccess().getCommaKeyword_7_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Injector__Group_7__0__Impl11885); 
             after(grammarAccess.getInjectorAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_7__0__Impl"


    // $ANTLR start "rule__Injector__Group_7__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6035:1: rule__Injector__Group_7__1 : rule__Injector__Group_7__1__Impl ;
    public final void rule__Injector__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6039:1: ( rule__Injector__Group_7__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6040:2: rule__Injector__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_7__1__Impl_in_rule__Injector__Group_7__111916);
            rule__Injector__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_7__1"


    // $ANTLR start "rule__Injector__Group_7__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6046:1: rule__Injector__Group_7__1__Impl : ( ( rule__Injector__HasStartsAssignment_7_1 ) ) ;
    public final void rule__Injector__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6050:1: ( ( ( rule__Injector__HasStartsAssignment_7_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6051:1: ( ( rule__Injector__HasStartsAssignment_7_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6051:1: ( ( rule__Injector__HasStartsAssignment_7_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6052:1: ( rule__Injector__HasStartsAssignment_7_1 )
            {
             before(grammarAccess.getInjectorAccess().getHasStartsAssignment_7_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6053:1: ( rule__Injector__HasStartsAssignment_7_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6053:2: rule__Injector__HasStartsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__HasStartsAssignment_7_1_in_rule__Injector__Group_7__1__Impl11943);
            rule__Injector__HasStartsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getHasStartsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_7__1__Impl"


    // $ANTLR start "rule__Injector__Group_9__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6067:1: rule__Injector__Group_9__0 : rule__Injector__Group_9__0__Impl rule__Injector__Group_9__1 ;
    public final void rule__Injector__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6071:1: ( rule__Injector__Group_9__0__Impl rule__Injector__Group_9__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6072:2: rule__Injector__Group_9__0__Impl rule__Injector__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9__0__Impl_in_rule__Injector__Group_9__011977);
            rule__Injector__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9__1_in_rule__Injector__Group_9__011980);
            rule__Injector__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9__0"


    // $ANTLR start "rule__Injector__Group_9__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6079:1: rule__Injector__Group_9__0__Impl : ( 'hasEnds' ) ;
    public final void rule__Injector__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6083:1: ( ( 'hasEnds' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6084:1: ( 'hasEnds' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6084:1: ( 'hasEnds' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6085:1: 'hasEnds'
            {
             before(grammarAccess.getInjectorAccess().getHasEndsKeyword_9_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Injector__Group_9__0__Impl12008); 
             after(grammarAccess.getInjectorAccess().getHasEndsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9__0__Impl"


    // $ANTLR start "rule__Injector__Group_9__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6098:1: rule__Injector__Group_9__1 : rule__Injector__Group_9__1__Impl rule__Injector__Group_9__2 ;
    public final void rule__Injector__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6102:1: ( rule__Injector__Group_9__1__Impl rule__Injector__Group_9__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6103:2: rule__Injector__Group_9__1__Impl rule__Injector__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9__1__Impl_in_rule__Injector__Group_9__112039);
            rule__Injector__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9__2_in_rule__Injector__Group_9__112042);
            rule__Injector__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9__1"


    // $ANTLR start "rule__Injector__Group_9__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6110:1: rule__Injector__Group_9__1__Impl : ( '(' ) ;
    public final void rule__Injector__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6114:1: ( ( '(' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6115:1: ( '(' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6115:1: ( '(' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6116:1: '('
            {
             before(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Injector__Group_9__1__Impl12070); 
             after(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9__1__Impl"


    // $ANTLR start "rule__Injector__Group_9__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6129:1: rule__Injector__Group_9__2 : rule__Injector__Group_9__2__Impl rule__Injector__Group_9__3 ;
    public final void rule__Injector__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6133:1: ( rule__Injector__Group_9__2__Impl rule__Injector__Group_9__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6134:2: rule__Injector__Group_9__2__Impl rule__Injector__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9__2__Impl_in_rule__Injector__Group_9__212101);
            rule__Injector__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9__3_in_rule__Injector__Group_9__212104);
            rule__Injector__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9__2"


    // $ANTLR start "rule__Injector__Group_9__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6141:1: rule__Injector__Group_9__2__Impl : ( ( rule__Injector__HasEndsAssignment_9_2 ) ) ;
    public final void rule__Injector__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6145:1: ( ( ( rule__Injector__HasEndsAssignment_9_2 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6146:1: ( ( rule__Injector__HasEndsAssignment_9_2 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6146:1: ( ( rule__Injector__HasEndsAssignment_9_2 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6147:1: ( rule__Injector__HasEndsAssignment_9_2 )
            {
             before(grammarAccess.getInjectorAccess().getHasEndsAssignment_9_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6148:1: ( rule__Injector__HasEndsAssignment_9_2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6148:2: rule__Injector__HasEndsAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__HasEndsAssignment_9_2_in_rule__Injector__Group_9__2__Impl12131);
            rule__Injector__HasEndsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getHasEndsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9__2__Impl"


    // $ANTLR start "rule__Injector__Group_9__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6158:1: rule__Injector__Group_9__3 : rule__Injector__Group_9__3__Impl rule__Injector__Group_9__4 ;
    public final void rule__Injector__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6162:1: ( rule__Injector__Group_9__3__Impl rule__Injector__Group_9__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6163:2: rule__Injector__Group_9__3__Impl rule__Injector__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9__3__Impl_in_rule__Injector__Group_9__312161);
            rule__Injector__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9__4_in_rule__Injector__Group_9__312164);
            rule__Injector__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9__3"


    // $ANTLR start "rule__Injector__Group_9__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6170:1: rule__Injector__Group_9__3__Impl : ( ( rule__Injector__Group_9_3__0 )* ) ;
    public final void rule__Injector__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6174:1: ( ( ( rule__Injector__Group_9_3__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6175:1: ( ( rule__Injector__Group_9_3__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6175:1: ( ( rule__Injector__Group_9_3__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6176:1: ( rule__Injector__Group_9_3__0 )*
            {
             before(grammarAccess.getInjectorAccess().getGroup_9_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6177:1: ( rule__Injector__Group_9_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==17) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6177:2: rule__Injector__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9_3__0_in_rule__Injector__Group_9__3__Impl12191);
            	    rule__Injector__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getInjectorAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9__3__Impl"


    // $ANTLR start "rule__Injector__Group_9__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6187:1: rule__Injector__Group_9__4 : rule__Injector__Group_9__4__Impl ;
    public final void rule__Injector__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6191:1: ( rule__Injector__Group_9__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6192:2: rule__Injector__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9__4__Impl_in_rule__Injector__Group_9__412222);
            rule__Injector__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9__4"


    // $ANTLR start "rule__Injector__Group_9__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6198:1: rule__Injector__Group_9__4__Impl : ( ')' ) ;
    public final void rule__Injector__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6202:1: ( ( ')' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6203:1: ( ')' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6203:1: ( ')' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6204:1: ')'
            {
             before(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_9_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Injector__Group_9__4__Impl12250); 
             after(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9__4__Impl"


    // $ANTLR start "rule__Injector__Group_9_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6227:1: rule__Injector__Group_9_3__0 : rule__Injector__Group_9_3__0__Impl rule__Injector__Group_9_3__1 ;
    public final void rule__Injector__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6231:1: ( rule__Injector__Group_9_3__0__Impl rule__Injector__Group_9_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6232:2: rule__Injector__Group_9_3__0__Impl rule__Injector__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9_3__0__Impl_in_rule__Injector__Group_9_3__012291);
            rule__Injector__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9_3__1_in_rule__Injector__Group_9_3__012294);
            rule__Injector__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9_3__0"


    // $ANTLR start "rule__Injector__Group_9_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6239:1: rule__Injector__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Injector__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6243:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6244:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6244:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6245:1: ','
            {
             before(grammarAccess.getInjectorAccess().getCommaKeyword_9_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Injector__Group_9_3__0__Impl12322); 
             after(grammarAccess.getInjectorAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9_3__0__Impl"


    // $ANTLR start "rule__Injector__Group_9_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6258:1: rule__Injector__Group_9_3__1 : rule__Injector__Group_9_3__1__Impl ;
    public final void rule__Injector__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6262:1: ( rule__Injector__Group_9_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6263:2: rule__Injector__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_9_3__1__Impl_in_rule__Injector__Group_9_3__112353);
            rule__Injector__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9_3__1"


    // $ANTLR start "rule__Injector__Group_9_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6269:1: rule__Injector__Group_9_3__1__Impl : ( ( rule__Injector__HasEndsAssignment_9_3_1 ) ) ;
    public final void rule__Injector__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6273:1: ( ( ( rule__Injector__HasEndsAssignment_9_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6274:1: ( ( rule__Injector__HasEndsAssignment_9_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6274:1: ( ( rule__Injector__HasEndsAssignment_9_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6275:1: ( rule__Injector__HasEndsAssignment_9_3_1 )
            {
             before(grammarAccess.getInjectorAccess().getHasEndsAssignment_9_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6276:1: ( rule__Injector__HasEndsAssignment_9_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6276:2: rule__Injector__HasEndsAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__HasEndsAssignment_9_3_1_in_rule__Injector__Group_9_3__1__Impl12380);
            rule__Injector__HasEndsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getHasEndsAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_9_3__1__Impl"


    // $ANTLR start "rule__Injector__Group_10__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6290:1: rule__Injector__Group_10__0 : rule__Injector__Group_10__0__Impl rule__Injector__Group_10__1 ;
    public final void rule__Injector__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6294:1: ( rule__Injector__Group_10__0__Impl rule__Injector__Group_10__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6295:2: rule__Injector__Group_10__0__Impl rule__Injector__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__0__Impl_in_rule__Injector__Group_10__012414);
            rule__Injector__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__1_in_rule__Injector__Group_10__012417);
            rule__Injector__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_10__0"


    // $ANTLR start "rule__Injector__Group_10__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6302:1: rule__Injector__Group_10__0__Impl : ( 'semaphore' ) ;
    public final void rule__Injector__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6306:1: ( ( 'semaphore' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6307:1: ( 'semaphore' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6307:1: ( 'semaphore' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6308:1: 'semaphore'
            {
             before(grammarAccess.getInjectorAccess().getSemaphoreKeyword_10_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Injector__Group_10__0__Impl12445); 
             after(grammarAccess.getInjectorAccess().getSemaphoreKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_10__0__Impl"


    // $ANTLR start "rule__Injector__Group_10__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6321:1: rule__Injector__Group_10__1 : rule__Injector__Group_10__1__Impl ;
    public final void rule__Injector__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6325:1: ( rule__Injector__Group_10__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6326:2: rule__Injector__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__1__Impl_in_rule__Injector__Group_10__112476);
            rule__Injector__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_10__1"


    // $ANTLR start "rule__Injector__Group_10__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6332:1: rule__Injector__Group_10__1__Impl : ( ( rule__Injector__SemaphoreAssignment_10_1 ) ) ;
    public final void rule__Injector__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6336:1: ( ( ( rule__Injector__SemaphoreAssignment_10_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6337:1: ( ( rule__Injector__SemaphoreAssignment_10_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6337:1: ( ( rule__Injector__SemaphoreAssignment_10_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6338:1: ( rule__Injector__SemaphoreAssignment_10_1 )
            {
             before(grammarAccess.getInjectorAccess().getSemaphoreAssignment_10_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6339:1: ( rule__Injector__SemaphoreAssignment_10_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6339:2: rule__Injector__SemaphoreAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__SemaphoreAssignment_10_1_in_rule__Injector__Group_10__1__Impl12503);
            rule__Injector__SemaphoreAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getSemaphoreAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_10__1__Impl"


    // $ANTLR start "rule__Injector__Group_11__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6353:1: rule__Injector__Group_11__0 : rule__Injector__Group_11__0__Impl rule__Injector__Group_11__1 ;
    public final void rule__Injector__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6357:1: ( rule__Injector__Group_11__0__Impl rule__Injector__Group_11__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6358:2: rule__Injector__Group_11__0__Impl rule__Injector__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__0__Impl_in_rule__Injector__Group_11__012537);
            rule__Injector__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__1_in_rule__Injector__Group_11__012540);
            rule__Injector__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11__0"


    // $ANTLR start "rule__Injector__Group_11__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6365:1: rule__Injector__Group_11__0__Impl : ( 'signals' ) ;
    public final void rule__Injector__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6369:1: ( ( 'signals' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6370:1: ( 'signals' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6370:1: ( 'signals' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6371:1: 'signals'
            {
             before(grammarAccess.getInjectorAccess().getSignalsKeyword_11_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Injector__Group_11__0__Impl12568); 
             after(grammarAccess.getInjectorAccess().getSignalsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11__0__Impl"


    // $ANTLR start "rule__Injector__Group_11__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6384:1: rule__Injector__Group_11__1 : rule__Injector__Group_11__1__Impl rule__Injector__Group_11__2 ;
    public final void rule__Injector__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6388:1: ( rule__Injector__Group_11__1__Impl rule__Injector__Group_11__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6389:2: rule__Injector__Group_11__1__Impl rule__Injector__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__1__Impl_in_rule__Injector__Group_11__112599);
            rule__Injector__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__2_in_rule__Injector__Group_11__112602);
            rule__Injector__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11__1"


    // $ANTLR start "rule__Injector__Group_11__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6396:1: rule__Injector__Group_11__1__Impl : ( '(' ) ;
    public final void rule__Injector__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6400:1: ( ( '(' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6401:1: ( '(' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6401:1: ( '(' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6402:1: '('
            {
             before(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_11_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Injector__Group_11__1__Impl12630); 
             after(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11__1__Impl"


    // $ANTLR start "rule__Injector__Group_11__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6415:1: rule__Injector__Group_11__2 : rule__Injector__Group_11__2__Impl rule__Injector__Group_11__3 ;
    public final void rule__Injector__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6419:1: ( rule__Injector__Group_11__2__Impl rule__Injector__Group_11__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6420:2: rule__Injector__Group_11__2__Impl rule__Injector__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__2__Impl_in_rule__Injector__Group_11__212661);
            rule__Injector__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__3_in_rule__Injector__Group_11__212664);
            rule__Injector__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11__2"


    // $ANTLR start "rule__Injector__Group_11__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6427:1: rule__Injector__Group_11__2__Impl : ( ( rule__Injector__SignalsAssignment_11_2 ) ) ;
    public final void rule__Injector__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6431:1: ( ( ( rule__Injector__SignalsAssignment_11_2 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6432:1: ( ( rule__Injector__SignalsAssignment_11_2 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6432:1: ( ( rule__Injector__SignalsAssignment_11_2 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6433:1: ( rule__Injector__SignalsAssignment_11_2 )
            {
             before(grammarAccess.getInjectorAccess().getSignalsAssignment_11_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6434:1: ( rule__Injector__SignalsAssignment_11_2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6434:2: rule__Injector__SignalsAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__SignalsAssignment_11_2_in_rule__Injector__Group_11__2__Impl12691);
            rule__Injector__SignalsAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getSignalsAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11__2__Impl"


    // $ANTLR start "rule__Injector__Group_11__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6444:1: rule__Injector__Group_11__3 : rule__Injector__Group_11__3__Impl rule__Injector__Group_11__4 ;
    public final void rule__Injector__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6448:1: ( rule__Injector__Group_11__3__Impl rule__Injector__Group_11__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6449:2: rule__Injector__Group_11__3__Impl rule__Injector__Group_11__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__3__Impl_in_rule__Injector__Group_11__312721);
            rule__Injector__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__4_in_rule__Injector__Group_11__312724);
            rule__Injector__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11__3"


    // $ANTLR start "rule__Injector__Group_11__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6456:1: rule__Injector__Group_11__3__Impl : ( ( rule__Injector__Group_11_3__0 )* ) ;
    public final void rule__Injector__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6460:1: ( ( ( rule__Injector__Group_11_3__0 )* ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6461:1: ( ( rule__Injector__Group_11_3__0 )* )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6461:1: ( ( rule__Injector__Group_11_3__0 )* )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6462:1: ( rule__Injector__Group_11_3__0 )*
            {
             before(grammarAccess.getInjectorAccess().getGroup_11_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6463:1: ( rule__Injector__Group_11_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==17) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6463:2: rule__Injector__Group_11_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11_3__0_in_rule__Injector__Group_11__3__Impl12751);
            	    rule__Injector__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getInjectorAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11__3__Impl"


    // $ANTLR start "rule__Injector__Group_11__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6473:1: rule__Injector__Group_11__4 : rule__Injector__Group_11__4__Impl ;
    public final void rule__Injector__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6477:1: ( rule__Injector__Group_11__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6478:2: rule__Injector__Group_11__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__4__Impl_in_rule__Injector__Group_11__412782);
            rule__Injector__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11__4"


    // $ANTLR start "rule__Injector__Group_11__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6484:1: rule__Injector__Group_11__4__Impl : ( ')' ) ;
    public final void rule__Injector__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6488:1: ( ( ')' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6489:1: ( ')' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6489:1: ( ')' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6490:1: ')'
            {
             before(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_11_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Injector__Group_11__4__Impl12810); 
             after(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11__4__Impl"


    // $ANTLR start "rule__Injector__Group_11_3__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6513:1: rule__Injector__Group_11_3__0 : rule__Injector__Group_11_3__0__Impl rule__Injector__Group_11_3__1 ;
    public final void rule__Injector__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6517:1: ( rule__Injector__Group_11_3__0__Impl rule__Injector__Group_11_3__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6518:2: rule__Injector__Group_11_3__0__Impl rule__Injector__Group_11_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11_3__0__Impl_in_rule__Injector__Group_11_3__012851);
            rule__Injector__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11_3__1_in_rule__Injector__Group_11_3__012854);
            rule__Injector__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11_3__0"


    // $ANTLR start "rule__Injector__Group_11_3__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6525:1: rule__Injector__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Injector__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6529:1: ( ( ',' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6530:1: ( ',' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6530:1: ( ',' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6531:1: ','
            {
             before(grammarAccess.getInjectorAccess().getCommaKeyword_11_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Injector__Group_11_3__0__Impl12882); 
             after(grammarAccess.getInjectorAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11_3__0__Impl"


    // $ANTLR start "rule__Injector__Group_11_3__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6544:1: rule__Injector__Group_11_3__1 : rule__Injector__Group_11_3__1__Impl ;
    public final void rule__Injector__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6548:1: ( rule__Injector__Group_11_3__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6549:2: rule__Injector__Group_11_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11_3__1__Impl_in_rule__Injector__Group_11_3__112913);
            rule__Injector__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11_3__1"


    // $ANTLR start "rule__Injector__Group_11_3__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6555:1: rule__Injector__Group_11_3__1__Impl : ( ( rule__Injector__SignalsAssignment_11_3_1 ) ) ;
    public final void rule__Injector__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6559:1: ( ( ( rule__Injector__SignalsAssignment_11_3_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6560:1: ( ( rule__Injector__SignalsAssignment_11_3_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6560:1: ( ( rule__Injector__SignalsAssignment_11_3_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6561:1: ( rule__Injector__SignalsAssignment_11_3_1 )
            {
             before(grammarAccess.getInjectorAccess().getSignalsAssignment_11_3_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6562:1: ( rule__Injector__SignalsAssignment_11_3_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6562:2: rule__Injector__SignalsAssignment_11_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__SignalsAssignment_11_3_1_in_rule__Injector__Group_11_3__1__Impl12940);
            rule__Injector__SignalsAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getSignalsAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_11_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6576:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6580:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6581:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__012974);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__012977);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6588:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6592:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6593:1: ( ( '-' )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6593:1: ( ( '-' )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6594:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6595:1: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6596:2: '-'
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_rule__EInt__Group__0__Impl13006); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6607:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6611:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6612:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__113039);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6618:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6622:1: ( ( RULE_INT ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6623:1: ( RULE_INT )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6623:1: ( RULE_INT )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6624:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl13066); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Speedlimit__Group__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6639:1: rule__Speedlimit__Group__0 : rule__Speedlimit__Group__0__Impl rule__Speedlimit__Group__1 ;
    public final void rule__Speedlimit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6643:1: ( rule__Speedlimit__Group__0__Impl rule__Speedlimit__Group__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6644:2: rule__Speedlimit__Group__0__Impl rule__Speedlimit__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__0__Impl_in_rule__Speedlimit__Group__013099);
            rule__Speedlimit__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__1_in_rule__Speedlimit__Group__013102);
            rule__Speedlimit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__0"


    // $ANTLR start "rule__Speedlimit__Group__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6651:1: rule__Speedlimit__Group__0__Impl : ( 'Speedlimit' ) ;
    public final void rule__Speedlimit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6655:1: ( ( 'Speedlimit' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6656:1: ( 'Speedlimit' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6656:1: ( 'Speedlimit' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6657:1: 'Speedlimit'
            {
             before(grammarAccess.getSpeedlimitAccess().getSpeedlimitKeyword_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Speedlimit__Group__0__Impl13130); 
             after(grammarAccess.getSpeedlimitAccess().getSpeedlimitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__0__Impl"


    // $ANTLR start "rule__Speedlimit__Group__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6670:1: rule__Speedlimit__Group__1 : rule__Speedlimit__Group__1__Impl rule__Speedlimit__Group__2 ;
    public final void rule__Speedlimit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6674:1: ( rule__Speedlimit__Group__1__Impl rule__Speedlimit__Group__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6675:2: rule__Speedlimit__Group__1__Impl rule__Speedlimit__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__1__Impl_in_rule__Speedlimit__Group__113161);
            rule__Speedlimit__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__2_in_rule__Speedlimit__Group__113164);
            rule__Speedlimit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__1"


    // $ANTLR start "rule__Speedlimit__Group__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6682:1: rule__Speedlimit__Group__1__Impl : ( '{' ) ;
    public final void rule__Speedlimit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6686:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6687:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6687:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6688:1: '{'
            {
             before(grammarAccess.getSpeedlimitAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Speedlimit__Group__1__Impl13192); 
             after(grammarAccess.getSpeedlimitAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__1__Impl"


    // $ANTLR start "rule__Speedlimit__Group__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6701:1: rule__Speedlimit__Group__2 : rule__Speedlimit__Group__2__Impl rule__Speedlimit__Group__3 ;
    public final void rule__Speedlimit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6705:1: ( rule__Speedlimit__Group__2__Impl rule__Speedlimit__Group__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6706:2: rule__Speedlimit__Group__2__Impl rule__Speedlimit__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__2__Impl_in_rule__Speedlimit__Group__213223);
            rule__Speedlimit__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__3_in_rule__Speedlimit__Group__213226);
            rule__Speedlimit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__2"


    // $ANTLR start "rule__Speedlimit__Group__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6713:1: rule__Speedlimit__Group__2__Impl : ( ( rule__Speedlimit__Group_2__0 )? ) ;
    public final void rule__Speedlimit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6717:1: ( ( ( rule__Speedlimit__Group_2__0 )? ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6718:1: ( ( rule__Speedlimit__Group_2__0 )? )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6718:1: ( ( rule__Speedlimit__Group_2__0 )? )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6719:1: ( rule__Speedlimit__Group_2__0 )?
            {
             before(grammarAccess.getSpeedlimitAccess().getGroup_2()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6720:1: ( rule__Speedlimit__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6720:2: rule__Speedlimit__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group_2__0_in_rule__Speedlimit__Group__2__Impl13253);
                    rule__Speedlimit__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpeedlimitAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__2__Impl"


    // $ANTLR start "rule__Speedlimit__Group__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6730:1: rule__Speedlimit__Group__3 : rule__Speedlimit__Group__3__Impl rule__Speedlimit__Group__4 ;
    public final void rule__Speedlimit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6734:1: ( rule__Speedlimit__Group__3__Impl rule__Speedlimit__Group__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6735:2: rule__Speedlimit__Group__3__Impl rule__Speedlimit__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__3__Impl_in_rule__Speedlimit__Group__313284);
            rule__Speedlimit__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__4_in_rule__Speedlimit__Group__313287);
            rule__Speedlimit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__3"


    // $ANTLR start "rule__Speedlimit__Group__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6742:1: rule__Speedlimit__Group__3__Impl : ( 'belongsTo' ) ;
    public final void rule__Speedlimit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6746:1: ( ( 'belongsTo' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6747:1: ( 'belongsTo' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6747:1: ( 'belongsTo' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6748:1: 'belongsTo'
            {
             before(grammarAccess.getSpeedlimitAccess().getBelongsToKeyword_3()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Speedlimit__Group__3__Impl13315); 
             after(grammarAccess.getSpeedlimitAccess().getBelongsToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__3__Impl"


    // $ANTLR start "rule__Speedlimit__Group__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6761:1: rule__Speedlimit__Group__4 : rule__Speedlimit__Group__4__Impl rule__Speedlimit__Group__5 ;
    public final void rule__Speedlimit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6765:1: ( rule__Speedlimit__Group__4__Impl rule__Speedlimit__Group__5 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6766:2: rule__Speedlimit__Group__4__Impl rule__Speedlimit__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__4__Impl_in_rule__Speedlimit__Group__413346);
            rule__Speedlimit__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__5_in_rule__Speedlimit__Group__413349);
            rule__Speedlimit__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__4"


    // $ANTLR start "rule__Speedlimit__Group__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6773:1: rule__Speedlimit__Group__4__Impl : ( ( rule__Speedlimit__BelongsToAssignment_4 ) ) ;
    public final void rule__Speedlimit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6777:1: ( ( ( rule__Speedlimit__BelongsToAssignment_4 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6778:1: ( ( rule__Speedlimit__BelongsToAssignment_4 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6778:1: ( ( rule__Speedlimit__BelongsToAssignment_4 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6779:1: ( rule__Speedlimit__BelongsToAssignment_4 )
            {
             before(grammarAccess.getSpeedlimitAccess().getBelongsToAssignment_4()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6780:1: ( rule__Speedlimit__BelongsToAssignment_4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6780:2: rule__Speedlimit__BelongsToAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__BelongsToAssignment_4_in_rule__Speedlimit__Group__4__Impl13376);
            rule__Speedlimit__BelongsToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpeedlimitAccess().getBelongsToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__4__Impl"


    // $ANTLR start "rule__Speedlimit__Group__5"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6790:1: rule__Speedlimit__Group__5 : rule__Speedlimit__Group__5__Impl ;
    public final void rule__Speedlimit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6794:1: ( rule__Speedlimit__Group__5__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6795:2: rule__Speedlimit__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__5__Impl_in_rule__Speedlimit__Group__513406);
            rule__Speedlimit__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__5"


    // $ANTLR start "rule__Speedlimit__Group__5__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6801:1: rule__Speedlimit__Group__5__Impl : ( '}' ) ;
    public final void rule__Speedlimit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6805:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6806:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6806:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6807:1: '}'
            {
             before(grammarAccess.getSpeedlimitAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Speedlimit__Group__5__Impl13434); 
             after(grammarAccess.getSpeedlimitAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__5__Impl"


    // $ANTLR start "rule__Speedlimit__Group_2__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6832:1: rule__Speedlimit__Group_2__0 : rule__Speedlimit__Group_2__0__Impl rule__Speedlimit__Group_2__1 ;
    public final void rule__Speedlimit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6836:1: ( rule__Speedlimit__Group_2__0__Impl rule__Speedlimit__Group_2__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6837:2: rule__Speedlimit__Group_2__0__Impl rule__Speedlimit__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group_2__0__Impl_in_rule__Speedlimit__Group_2__013477);
            rule__Speedlimit__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group_2__1_in_rule__Speedlimit__Group_2__013480);
            rule__Speedlimit__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group_2__0"


    // $ANTLR start "rule__Speedlimit__Group_2__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6844:1: rule__Speedlimit__Group_2__0__Impl : ( 'Speed' ) ;
    public final void rule__Speedlimit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6848:1: ( ( 'Speed' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6849:1: ( 'Speed' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6849:1: ( 'Speed' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6850:1: 'Speed'
            {
             before(grammarAccess.getSpeedlimitAccess().getSpeedKeyword_2_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Speedlimit__Group_2__0__Impl13508); 
             after(grammarAccess.getSpeedlimitAccess().getSpeedKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group_2__0__Impl"


    // $ANTLR start "rule__Speedlimit__Group_2__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6863:1: rule__Speedlimit__Group_2__1 : rule__Speedlimit__Group_2__1__Impl ;
    public final void rule__Speedlimit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6867:1: ( rule__Speedlimit__Group_2__1__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6868:2: rule__Speedlimit__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group_2__1__Impl_in_rule__Speedlimit__Group_2__113539);
            rule__Speedlimit__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group_2__1"


    // $ANTLR start "rule__Speedlimit__Group_2__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6874:1: rule__Speedlimit__Group_2__1__Impl : ( ( rule__Speedlimit__SpeedAssignment_2_1 ) ) ;
    public final void rule__Speedlimit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6878:1: ( ( ( rule__Speedlimit__SpeedAssignment_2_1 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6879:1: ( ( rule__Speedlimit__SpeedAssignment_2_1 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6879:1: ( ( rule__Speedlimit__SpeedAssignment_2_1 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6880:1: ( rule__Speedlimit__SpeedAssignment_2_1 )
            {
             before(grammarAccess.getSpeedlimitAccess().getSpeedAssignment_2_1()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6881:1: ( rule__Speedlimit__SpeedAssignment_2_1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6881:2: rule__Speedlimit__SpeedAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__SpeedAssignment_2_1_in_rule__Speedlimit__Group_2__1__Impl13566);
            rule__Speedlimit__SpeedAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSpeedlimitAccess().getSpeedAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group_2__1__Impl"


    // $ANTLR start "rule__Stop__Group__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6895:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6899:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6900:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__013600);
            rule__Stop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__013603);
            rule__Stop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__0"


    // $ANTLR start "rule__Stop__Group__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6907:1: rule__Stop__Group__0__Impl : ( 'Stop' ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6911:1: ( ( 'Stop' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6912:1: ( 'Stop' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6912:1: ( 'Stop' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6913:1: 'Stop'
            {
             before(grammarAccess.getStopAccess().getStopKeyword_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Stop__Group__0__Impl13631); 
             after(grammarAccess.getStopAccess().getStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__0__Impl"


    // $ANTLR start "rule__Stop__Group__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6926:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl rule__Stop__Group__2 ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6930:1: ( rule__Stop__Group__1__Impl rule__Stop__Group__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6931:2: rule__Stop__Group__1__Impl rule__Stop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__113662);
            rule__Stop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__113665);
            rule__Stop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__1"


    // $ANTLR start "rule__Stop__Group__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6938:1: rule__Stop__Group__1__Impl : ( '{' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6942:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6943:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6943:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6944:1: '{'
            {
             before(grammarAccess.getStopAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Stop__Group__1__Impl13693); 
             after(grammarAccess.getStopAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__1__Impl"


    // $ANTLR start "rule__Stop__Group__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6957:1: rule__Stop__Group__2 : rule__Stop__Group__2__Impl rule__Stop__Group__3 ;
    public final void rule__Stop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6961:1: ( rule__Stop__Group__2__Impl rule__Stop__Group__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6962:2: rule__Stop__Group__2__Impl rule__Stop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__213724);
            rule__Stop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__213727);
            rule__Stop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__2"


    // $ANTLR start "rule__Stop__Group__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6969:1: rule__Stop__Group__2__Impl : ( 'belongsTo' ) ;
    public final void rule__Stop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6973:1: ( ( 'belongsTo' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6974:1: ( 'belongsTo' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6974:1: ( 'belongsTo' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6975:1: 'belongsTo'
            {
             before(grammarAccess.getStopAccess().getBelongsToKeyword_2()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Stop__Group__2__Impl13755); 
             after(grammarAccess.getStopAccess().getBelongsToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__2__Impl"


    // $ANTLR start "rule__Stop__Group__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6988:1: rule__Stop__Group__3 : rule__Stop__Group__3__Impl rule__Stop__Group__4 ;
    public final void rule__Stop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6992:1: ( rule__Stop__Group__3__Impl rule__Stop__Group__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:6993:2: rule__Stop__Group__3__Impl rule__Stop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__313786);
            rule__Stop__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__4_in_rule__Stop__Group__313789);
            rule__Stop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__3"


    // $ANTLR start "rule__Stop__Group__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7000:1: rule__Stop__Group__3__Impl : ( ( rule__Stop__BelongsToAssignment_3 ) ) ;
    public final void rule__Stop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7004:1: ( ( ( rule__Stop__BelongsToAssignment_3 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7005:1: ( ( rule__Stop__BelongsToAssignment_3 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7005:1: ( ( rule__Stop__BelongsToAssignment_3 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7006:1: ( rule__Stop__BelongsToAssignment_3 )
            {
             before(grammarAccess.getStopAccess().getBelongsToAssignment_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7007:1: ( rule__Stop__BelongsToAssignment_3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7007:2: rule__Stop__BelongsToAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__BelongsToAssignment_3_in_rule__Stop__Group__3__Impl13816);
            rule__Stop__BelongsToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getBelongsToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__3__Impl"


    // $ANTLR start "rule__Stop__Group__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7017:1: rule__Stop__Group__4 : rule__Stop__Group__4__Impl ;
    public final void rule__Stop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7021:1: ( rule__Stop__Group__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7022:2: rule__Stop__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__4__Impl_in_rule__Stop__Group__413846);
            rule__Stop__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__4"


    // $ANTLR start "rule__Stop__Group__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7028:1: rule__Stop__Group__4__Impl : ( '}' ) ;
    public final void rule__Stop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7032:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7033:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7033:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7034:1: '}'
            {
             before(grammarAccess.getStopAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Stop__Group__4__Impl13874); 
             after(grammarAccess.getStopAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__4__Impl"


    // $ANTLR start "rule__Yield__Group__0"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7057:1: rule__Yield__Group__0 : rule__Yield__Group__0__Impl rule__Yield__Group__1 ;
    public final void rule__Yield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7061:1: ( rule__Yield__Group__0__Impl rule__Yield__Group__1 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7062:2: rule__Yield__Group__0__Impl rule__Yield__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__0__Impl_in_rule__Yield__Group__013915);
            rule__Yield__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__1_in_rule__Yield__Group__013918);
            rule__Yield__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__0"


    // $ANTLR start "rule__Yield__Group__0__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7069:1: rule__Yield__Group__0__Impl : ( 'Yield' ) ;
    public final void rule__Yield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7073:1: ( ( 'Yield' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7074:1: ( 'Yield' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7074:1: ( 'Yield' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7075:1: 'Yield'
            {
             before(grammarAccess.getYieldAccess().getYieldKeyword_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Yield__Group__0__Impl13946); 
             after(grammarAccess.getYieldAccess().getYieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__0__Impl"


    // $ANTLR start "rule__Yield__Group__1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7088:1: rule__Yield__Group__1 : rule__Yield__Group__1__Impl rule__Yield__Group__2 ;
    public final void rule__Yield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7092:1: ( rule__Yield__Group__1__Impl rule__Yield__Group__2 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7093:2: rule__Yield__Group__1__Impl rule__Yield__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__1__Impl_in_rule__Yield__Group__113977);
            rule__Yield__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__2_in_rule__Yield__Group__113980);
            rule__Yield__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__1"


    // $ANTLR start "rule__Yield__Group__1__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7100:1: rule__Yield__Group__1__Impl : ( '{' ) ;
    public final void rule__Yield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7104:1: ( ( '{' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7105:1: ( '{' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7105:1: ( '{' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7106:1: '{'
            {
             before(grammarAccess.getYieldAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Yield__Group__1__Impl14008); 
             after(grammarAccess.getYieldAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__1__Impl"


    // $ANTLR start "rule__Yield__Group__2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7119:1: rule__Yield__Group__2 : rule__Yield__Group__2__Impl rule__Yield__Group__3 ;
    public final void rule__Yield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7123:1: ( rule__Yield__Group__2__Impl rule__Yield__Group__3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7124:2: rule__Yield__Group__2__Impl rule__Yield__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__2__Impl_in_rule__Yield__Group__214039);
            rule__Yield__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__3_in_rule__Yield__Group__214042);
            rule__Yield__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__2"


    // $ANTLR start "rule__Yield__Group__2__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7131:1: rule__Yield__Group__2__Impl : ( 'belongsTo' ) ;
    public final void rule__Yield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7135:1: ( ( 'belongsTo' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7136:1: ( 'belongsTo' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7136:1: ( 'belongsTo' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7137:1: 'belongsTo'
            {
             before(grammarAccess.getYieldAccess().getBelongsToKeyword_2()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Yield__Group__2__Impl14070); 
             after(grammarAccess.getYieldAccess().getBelongsToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__2__Impl"


    // $ANTLR start "rule__Yield__Group__3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7150:1: rule__Yield__Group__3 : rule__Yield__Group__3__Impl rule__Yield__Group__4 ;
    public final void rule__Yield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7154:1: ( rule__Yield__Group__3__Impl rule__Yield__Group__4 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7155:2: rule__Yield__Group__3__Impl rule__Yield__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__3__Impl_in_rule__Yield__Group__314101);
            rule__Yield__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__4_in_rule__Yield__Group__314104);
            rule__Yield__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__3"


    // $ANTLR start "rule__Yield__Group__3__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7162:1: rule__Yield__Group__3__Impl : ( ( rule__Yield__BelongsToAssignment_3 ) ) ;
    public final void rule__Yield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7166:1: ( ( ( rule__Yield__BelongsToAssignment_3 ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7167:1: ( ( rule__Yield__BelongsToAssignment_3 ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7167:1: ( ( rule__Yield__BelongsToAssignment_3 ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7168:1: ( rule__Yield__BelongsToAssignment_3 )
            {
             before(grammarAccess.getYieldAccess().getBelongsToAssignment_3()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7169:1: ( rule__Yield__BelongsToAssignment_3 )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7169:2: rule__Yield__BelongsToAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__BelongsToAssignment_3_in_rule__Yield__Group__3__Impl14131);
            rule__Yield__BelongsToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getYieldAccess().getBelongsToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__3__Impl"


    // $ANTLR start "rule__Yield__Group__4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7179:1: rule__Yield__Group__4 : rule__Yield__Group__4__Impl ;
    public final void rule__Yield__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7183:1: ( rule__Yield__Group__4__Impl )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7184:2: rule__Yield__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__4__Impl_in_rule__Yield__Group__414161);
            rule__Yield__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__4"


    // $ANTLR start "rule__Yield__Group__4__Impl"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7190:1: rule__Yield__Group__4__Impl : ( '}' ) ;
    public final void rule__Yield__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7194:1: ( ( '}' ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7195:1: ( '}' )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7195:1: ( '}' )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7196:1: '}'
            {
             before(grammarAccess.getYieldAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Yield__Group__4__Impl14189); 
             after(grammarAccess.getYieldAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__4__Impl"


    // $ANTLR start "rule__Highway__InitNodesAssignment_3_2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7220:1: rule__Highway__InitNodesAssignment_3_2 : ( ruleNode ) ;
    public final void rule__Highway__InitNodesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7224:1: ( ( ruleNode ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7225:1: ( ruleNode )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7225:1: ( ruleNode )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7226:1: ruleNode
            {
             before(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_rule__Highway__InitNodesAssignment_3_214235);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitNodesAssignment_3_2"


    // $ANTLR start "rule__Highway__InitNodesAssignment_3_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7235:1: rule__Highway__InitNodesAssignment_3_3_1 : ( ruleNode ) ;
    public final void rule__Highway__InitNodesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7239:1: ( ( ruleNode ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7240:1: ( ruleNode )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7240:1: ( ruleNode )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7241:1: ruleNode
            {
             before(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_rule__Highway__InitNodesAssignment_3_3_114266);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitNodesAssignment_3_3_1"


    // $ANTLR start "rule__Highway__InitCarsAssignment_4_2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7250:1: rule__Highway__InitCarsAssignment_4_2 : ( ruleCar ) ;
    public final void rule__Highway__InitCarsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7254:1: ( ( ruleCar ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7255:1: ( ruleCar )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7255:1: ( ruleCar )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7256:1: ruleCar
            {
             before(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCar_in_rule__Highway__InitCarsAssignment_4_214297);
            ruleCar();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitCarsAssignment_4_2"


    // $ANTLR start "rule__Highway__InitCarsAssignment_4_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7265:1: rule__Highway__InitCarsAssignment_4_3_1 : ( ruleCar ) ;
    public final void rule__Highway__InitCarsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7269:1: ( ( ruleCar ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7270:1: ( ruleCar )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7270:1: ( ruleCar )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7271:1: ruleCar
            {
             before(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCar_in_rule__Highway__InitCarsAssignment_4_3_114328);
            ruleCar();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitCarsAssignment_4_3_1"


    // $ANTLR start "rule__Highway__InitSegmentsAssignment_5_2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7280:1: rule__Highway__InitSegmentsAssignment_5_2 : ( ruleSegment ) ;
    public final void rule__Highway__InitSegmentsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7284:1: ( ( ruleSegment ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7285:1: ( ruleSegment )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7285:1: ( ruleSegment )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7286:1: ruleSegment
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSegment_in_rule__Highway__InitSegmentsAssignment_5_214359);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitSegmentsAssignment_5_2"


    // $ANTLR start "rule__Highway__InitSegmentsAssignment_5_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7295:1: rule__Highway__InitSegmentsAssignment_5_3_1 : ( ruleSegment ) ;
    public final void rule__Highway__InitSegmentsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7299:1: ( ( ruleSegment ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7300:1: ( ruleSegment )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7300:1: ( ruleSegment )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7301:1: ruleSegment
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSegment_in_rule__Highway__InitSegmentsAssignment_5_3_114390);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitSegmentsAssignment_5_3_1"


    // $ANTLR start "rule__Highway__InitSemaphoreAssignment_6_2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7310:1: rule__Highway__InitSemaphoreAssignment_6_2 : ( ruleSemaphore ) ;
    public final void rule__Highway__InitSemaphoreAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7314:1: ( ( ruleSemaphore ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7315:1: ( ruleSemaphore )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7315:1: ( ruleSemaphore )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7316:1: ruleSemaphore
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreSemaphoreParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemaphore_in_rule__Highway__InitSemaphoreAssignment_6_214421);
            ruleSemaphore();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitSemaphoreSemaphoreParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitSemaphoreAssignment_6_2"


    // $ANTLR start "rule__Highway__InitSemaphoreAssignment_6_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7325:1: rule__Highway__InitSemaphoreAssignment_6_3_1 : ( ruleSemaphore ) ;
    public final void rule__Highway__InitSemaphoreAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7329:1: ( ( ruleSemaphore ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7330:1: ( ruleSemaphore )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7330:1: ( ruleSemaphore )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7331:1: ruleSemaphore
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreSemaphoreParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemaphore_in_rule__Highway__InitSemaphoreAssignment_6_3_114452);
            ruleSemaphore();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitSemaphoreSemaphoreParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitSemaphoreAssignment_6_3_1"


    // $ANTLR start "rule__Highway__InitSignalAssignment_7_2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7340:1: rule__Highway__InitSignalAssignment_7_2 : ( ruleSignal ) ;
    public final void rule__Highway__InitSignalAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7344:1: ( ( ruleSignal ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7345:1: ( ruleSignal )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7345:1: ( ruleSignal )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7346:1: ruleSignal
            {
             before(grammarAccess.getHighwayAccess().getInitSignalSignalParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_rule__Highway__InitSignalAssignment_7_214483);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitSignalSignalParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitSignalAssignment_7_2"


    // $ANTLR start "rule__Highway__InitSignalAssignment_7_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7355:1: rule__Highway__InitSignalAssignment_7_3_1 : ( ruleSignal ) ;
    public final void rule__Highway__InitSignalAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7359:1: ( ( ruleSignal ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7360:1: ( ruleSignal )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7360:1: ( ruleSignal )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7361:1: ruleSignal
            {
             before(grammarAccess.getHighwayAccess().getInitSignalSignalParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_rule__Highway__InitSignalAssignment_7_3_114514);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitSignalSignalParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitSignalAssignment_7_3_1"


    // $ANTLR start "rule__Node_Impl__HasStartsAssignment_5"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7370:1: rule__Node_Impl__HasStartsAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__HasStartsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7374:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7375:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7375:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7376:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_5_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7377:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7378:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsSegmentEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__HasStartsAssignment_514549);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getHasStartsSegmentEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__HasStartsAssignment_5"


    // $ANTLR start "rule__Node_Impl__HasStartsAssignment_6_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7389:1: rule__Node_Impl__HasStartsAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__HasStartsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7393:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7394:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7394:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7395:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_6_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7396:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7397:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsSegmentEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__HasStartsAssignment_6_114588);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getHasStartsSegmentEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__HasStartsAssignment_6_1"


    // $ANTLR start "rule__Node_Impl__HasEndsAssignment_10"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7408:1: rule__Node_Impl__HasEndsAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__HasEndsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7412:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7413:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7413:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7414:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_10_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7415:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7416:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsSegmentEStringParserRuleCall_10_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__HasEndsAssignment_1014627);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getHasEndsSegmentEStringParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__HasEndsAssignment_10"


    // $ANTLR start "rule__Node_Impl__HasEndsAssignment_11_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7427:1: rule__Node_Impl__HasEndsAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__HasEndsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7431:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7432:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7432:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7433:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_11_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7434:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7435:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsSegmentEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__HasEndsAssignment_11_114666);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getHasEndsSegmentEStringParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__HasEndsAssignment_11_1"


    // $ANTLR start "rule__Node_Impl__SemaphoreAssignment_13_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7446:1: rule__Node_Impl__SemaphoreAssignment_13_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__SemaphoreAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7450:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7451:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7451:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7452:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getSemaphoreSemaphoreCrossReference_13_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7453:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7454:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getSemaphoreSemaphoreEStringParserRuleCall_13_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__SemaphoreAssignment_13_114705);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getSemaphoreSemaphoreEStringParserRuleCall_13_1_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getSemaphoreSemaphoreCrossReference_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__SemaphoreAssignment_13_1"


    // $ANTLR start "rule__Node_Impl__SignalsAssignment_14_2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7465:1: rule__Node_Impl__SignalsAssignment_14_2 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__SignalsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7469:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7470:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7470:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7471:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_14_2_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7472:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7473:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsSignalEStringParserRuleCall_14_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__SignalsAssignment_14_214744);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getSignalsSignalEStringParserRuleCall_14_2_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__SignalsAssignment_14_2"


    // $ANTLR start "rule__Node_Impl__SignalsAssignment_14_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7484:1: rule__Node_Impl__SignalsAssignment_14_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__SignalsAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7488:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7489:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7489:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7490:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_14_3_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7491:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7492:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsSignalEStringParserRuleCall_14_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__SignalsAssignment_14_3_114783);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getSignalsSignalEStringParserRuleCall_14_3_1_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_14_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__SignalsAssignment_14_3_1"


    // $ANTLR start "rule__Car__TimeInAssignment_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7503:1: rule__Car__TimeInAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__Car__TimeInAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7507:1: ( ( ruleEDate ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7508:1: ( ruleEDate )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7508:1: ( ruleEDate )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7509:1: ruleEDate
            {
             before(grammarAccess.getCarAccess().getTimeInEDateParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDate_in_rule__Car__TimeInAssignment_3_114818);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getCarAccess().getTimeInEDateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__TimeInAssignment_3_1"


    // $ANTLR start "rule__Car__TimeOutAssignment_4_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7518:1: rule__Car__TimeOutAssignment_4_1 : ( ruleEDate ) ;
    public final void rule__Car__TimeOutAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7522:1: ( ( ruleEDate ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7523:1: ( ruleEDate )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7523:1: ( ruleEDate )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7524:1: ruleEDate
            {
             before(grammarAccess.getCarAccess().getTimeOutEDateParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDate_in_rule__Car__TimeOutAssignment_4_114849);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getCarAccess().getTimeOutEDateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__TimeOutAssignment_4_1"


    // $ANTLR start "rule__Car__IsInSegmentAssignment_5_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7533:1: rule__Car__IsInSegmentAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Car__IsInSegmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7537:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7538:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7538:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7539:1: ( ruleEString )
            {
             before(grammarAccess.getCarAccess().getIsInSegmentSegmentCrossReference_5_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7540:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7541:1: ruleEString
            {
             before(grammarAccess.getCarAccess().getIsInSegmentSegmentEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Car__IsInSegmentAssignment_5_114884);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCarAccess().getIsInSegmentSegmentEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getCarAccess().getIsInSegmentSegmentCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__IsInSegmentAssignment_5_1"


    // $ANTLR start "rule__Segment__NumLanesAssignment_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7552:1: rule__Segment__NumLanesAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Segment__NumLanesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7556:1: ( ( ruleEInt ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7557:1: ( ruleEInt )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7557:1: ( ruleEInt )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7558:1: ruleEInt
            {
             before(grammarAccess.getSegmentAccess().getNumLanesEIntParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Segment__NumLanesAssignment_3_114919);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getNumLanesEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__NumLanesAssignment_3_1"


    // $ANTLR start "rule__Segment__LengthAssignment_4_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7567:1: rule__Segment__LengthAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Segment__LengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7571:1: ( ( ruleEInt ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7572:1: ( ruleEInt )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7572:1: ( ruleEInt )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7573:1: ruleEInt
            {
             before(grammarAccess.getSegmentAccess().getLengthEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Segment__LengthAssignment_4_114950);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getLengthEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__LengthAssignment_4_1"


    // $ANTLR start "rule__Segment__HasCarsAssignment_5_2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7582:1: rule__Segment__HasCarsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Segment__HasCarsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7586:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7587:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7587:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7588:1: ( ruleEString )
            {
             before(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_5_2_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7589:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7590:1: ruleEString
            {
             before(grammarAccess.getSegmentAccess().getHasCarsCarEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Segment__HasCarsAssignment_5_214985);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getHasCarsCarEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__HasCarsAssignment_5_2"


    // $ANTLR start "rule__Segment__HasCarsAssignment_5_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7601:1: rule__Segment__HasCarsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Segment__HasCarsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7605:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7606:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7606:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7607:1: ( ruleEString )
            {
             before(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_5_3_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7608:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7609:1: ruleEString
            {
             before(grammarAccess.getSegmentAccess().getHasCarsCarEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Segment__HasCarsAssignment_5_3_115024);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getHasCarsCarEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__HasCarsAssignment_5_3_1"


    // $ANTLR start "rule__Semaphore__CanGoAssignment_2_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7620:1: rule__Semaphore__CanGoAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__Semaphore__CanGoAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7624:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7625:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7625:1: ( ruleEBoolean )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7626:1: ruleEBoolean
            {
             before(grammarAccess.getSemaphoreAccess().getCanGoEBooleanParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__Semaphore__CanGoAssignment_2_115059);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getSemaphoreAccess().getCanGoEBooleanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__CanGoAssignment_2_1"


    // $ANTLR start "rule__Semaphore__SecondsRedAssignment_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7635:1: rule__Semaphore__SecondsRedAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Semaphore__SecondsRedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7639:1: ( ( ruleEInt ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7640:1: ( ruleEInt )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7640:1: ( ruleEInt )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7641:1: ruleEInt
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsRedEIntParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Semaphore__SecondsRedAssignment_3_115090);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSemaphoreAccess().getSecondsRedEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__SecondsRedAssignment_3_1"


    // $ANTLR start "rule__Semaphore__SecondsGreenAssignment_4_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7650:1: rule__Semaphore__SecondsGreenAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Semaphore__SecondsGreenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7654:1: ( ( ruleEInt ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7655:1: ( ruleEInt )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7655:1: ( ruleEInt )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7656:1: ruleEInt
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsGreenEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Semaphore__SecondsGreenAssignment_4_115121);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSemaphoreAccess().getSecondsGreenEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__SecondsGreenAssignment_4_1"


    // $ANTLR start "rule__Semaphore__BelongsToAssignment_6"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7665:1: rule__Semaphore__BelongsToAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Semaphore__BelongsToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7669:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7670:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7670:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7671:1: ( ruleEString )
            {
             before(grammarAccess.getSemaphoreAccess().getBelongsToNodeCrossReference_6_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7672:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7673:1: ruleEString
            {
             before(grammarAccess.getSemaphoreAccess().getBelongsToNodeEStringParserRuleCall_6_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Semaphore__BelongsToAssignment_615156);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSemaphoreAccess().getBelongsToNodeEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getSemaphoreAccess().getBelongsToNodeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__BelongsToAssignment_6"


    // $ANTLR start "rule__Signal_Impl__BelongsToAssignment_3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7684:1: rule__Signal_Impl__BelongsToAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Signal_Impl__BelongsToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7688:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7689:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7689:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7690:1: ( ruleEString )
            {
             before(grammarAccess.getSignal_ImplAccess().getBelongsToNodeCrossReference_3_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7691:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7692:1: ruleEString
            {
             before(grammarAccess.getSignal_ImplAccess().getBelongsToNodeEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Signal_Impl__BelongsToAssignment_315195);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignal_ImplAccess().getBelongsToNodeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSignal_ImplAccess().getBelongsToNodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__BelongsToAssignment_3"


    // $ANTLR start "rule__Extractor__HasStartsAssignment_3_2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7703:1: rule__Extractor__HasStartsAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__HasStartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7707:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7708:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7708:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7709:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_3_2_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7710:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7711:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getHasStartsSegmentEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__HasStartsAssignment_3_215234);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getHasStartsSegmentEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__HasStartsAssignment_3_2"


    // $ANTLR start "rule__Extractor__HasStartsAssignment_3_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7722:1: rule__Extractor__HasStartsAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__HasStartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7726:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7727:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7727:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7728:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_3_3_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7729:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7730:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getHasStartsSegmentEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__HasStartsAssignment_3_3_115273);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getHasStartsSegmentEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__HasStartsAssignment_3_3_1"


    // $ANTLR start "rule__Extractor__HasEndsAssignment_6"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7741:1: rule__Extractor__HasEndsAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__HasEndsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7745:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7746:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7746:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7747:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_6_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7748:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7749:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getHasEndsSegmentEStringParserRuleCall_6_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__HasEndsAssignment_615312);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getHasEndsSegmentEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__HasEndsAssignment_6"


    // $ANTLR start "rule__Extractor__HasEndsAssignment_7_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7760:1: rule__Extractor__HasEndsAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__HasEndsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7764:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7765:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7765:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7766:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_7_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7767:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7768:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getHasEndsSegmentEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__HasEndsAssignment_7_115351);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getHasEndsSegmentEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__HasEndsAssignment_7_1"


    // $ANTLR start "rule__Extractor__SemaphoreAssignment_9_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7779:1: rule__Extractor__SemaphoreAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__SemaphoreAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7783:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7784:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7784:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7785:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getSemaphoreSemaphoreCrossReference_9_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7786:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7787:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getSemaphoreSemaphoreEStringParserRuleCall_9_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__SemaphoreAssignment_9_115390);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getSemaphoreSemaphoreEStringParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getSemaphoreSemaphoreCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__SemaphoreAssignment_9_1"


    // $ANTLR start "rule__Extractor__SignalsAssignment_10_2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7798:1: rule__Extractor__SignalsAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__SignalsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7802:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7803:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7803:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7804:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_10_2_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7805:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7806:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getSignalsSignalEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__SignalsAssignment_10_215429);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getSignalsSignalEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__SignalsAssignment_10_2"


    // $ANTLR start "rule__Extractor__SignalsAssignment_10_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7817:1: rule__Extractor__SignalsAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__SignalsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7821:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7822:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7822:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7823:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_10_3_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7824:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7825:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getSignalsSignalEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__SignalsAssignment_10_3_115468);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getSignalsSignalEStringParserRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__SignalsAssignment_10_3_1"


    // $ANTLR start "rule__Injector__CarsPerHourAssignment_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7836:1: rule__Injector__CarsPerHourAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Injector__CarsPerHourAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7840:1: ( ( ruleEInt ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7841:1: ( ruleEInt )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7841:1: ( ruleEInt )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7842:1: ruleEInt
            {
             before(grammarAccess.getInjectorAccess().getCarsPerHourEIntParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Injector__CarsPerHourAssignment_3_115503);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getCarsPerHourEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__CarsPerHourAssignment_3_1"


    // $ANTLR start "rule__Injector__HasStartsAssignment_6"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7851:1: rule__Injector__HasStartsAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Injector__HasStartsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7855:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7856:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7856:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7857:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_6_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7858:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7859:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getHasStartsSegmentEStringParserRuleCall_6_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__HasStartsAssignment_615538);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getHasStartsSegmentEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__HasStartsAssignment_6"


    // $ANTLR start "rule__Injector__HasStartsAssignment_7_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7870:1: rule__Injector__HasStartsAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Injector__HasStartsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7874:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7875:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7875:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7876:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_7_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7877:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7878:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getHasStartsSegmentEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__HasStartsAssignment_7_115577);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getHasStartsSegmentEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__HasStartsAssignment_7_1"


    // $ANTLR start "rule__Injector__HasEndsAssignment_9_2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7889:1: rule__Injector__HasEndsAssignment_9_2 : ( ( ruleEString ) ) ;
    public final void rule__Injector__HasEndsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7893:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7894:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7894:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7895:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_9_2_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7896:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7897:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getHasEndsSegmentEStringParserRuleCall_9_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__HasEndsAssignment_9_215616);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getHasEndsSegmentEStringParserRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__HasEndsAssignment_9_2"


    // $ANTLR start "rule__Injector__HasEndsAssignment_9_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7908:1: rule__Injector__HasEndsAssignment_9_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Injector__HasEndsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7912:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7913:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7913:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7914:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_9_3_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7915:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7916:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getHasEndsSegmentEStringParserRuleCall_9_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__HasEndsAssignment_9_3_115655);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getHasEndsSegmentEStringParserRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__HasEndsAssignment_9_3_1"


    // $ANTLR start "rule__Injector__SemaphoreAssignment_10_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7927:1: rule__Injector__SemaphoreAssignment_10_1 : ( ( ruleEString ) ) ;
    public final void rule__Injector__SemaphoreAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7931:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7932:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7932:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7933:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getSemaphoreSemaphoreCrossReference_10_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7934:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7935:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getSemaphoreSemaphoreEStringParserRuleCall_10_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__SemaphoreAssignment_10_115694);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getSemaphoreSemaphoreEStringParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getSemaphoreSemaphoreCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__SemaphoreAssignment_10_1"


    // $ANTLR start "rule__Injector__SignalsAssignment_11_2"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7946:1: rule__Injector__SignalsAssignment_11_2 : ( ( ruleEString ) ) ;
    public final void rule__Injector__SignalsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7950:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7951:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7951:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7952:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_11_2_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7953:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7954:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getSignalsSignalEStringParserRuleCall_11_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__SignalsAssignment_11_215733);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getSignalsSignalEStringParserRuleCall_11_2_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__SignalsAssignment_11_2"


    // $ANTLR start "rule__Injector__SignalsAssignment_11_3_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7965:1: rule__Injector__SignalsAssignment_11_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Injector__SignalsAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7969:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7970:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7970:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7971:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_11_3_1_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7972:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7973:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getSignalsSignalEStringParserRuleCall_11_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__SignalsAssignment_11_3_115772);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getSignalsSignalEStringParserRuleCall_11_3_1_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__SignalsAssignment_11_3_1"


    // $ANTLR start "rule__Speedlimit__SpeedAssignment_2_1"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7984:1: rule__Speedlimit__SpeedAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__Speedlimit__SpeedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7988:1: ( ( ruleEInt ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7989:1: ( ruleEInt )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7989:1: ( ruleEInt )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7990:1: ruleEInt
            {
             before(grammarAccess.getSpeedlimitAccess().getSpeedEIntParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Speedlimit__SpeedAssignment_2_115807);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSpeedlimitAccess().getSpeedEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__SpeedAssignment_2_1"


    // $ANTLR start "rule__Speedlimit__BelongsToAssignment_4"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:7999:1: rule__Speedlimit__BelongsToAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Speedlimit__BelongsToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8003:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8004:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8004:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8005:1: ( ruleEString )
            {
             before(grammarAccess.getSpeedlimitAccess().getBelongsToNodeCrossReference_4_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8006:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8007:1: ruleEString
            {
             before(grammarAccess.getSpeedlimitAccess().getBelongsToNodeEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Speedlimit__BelongsToAssignment_415842);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpeedlimitAccess().getBelongsToNodeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSpeedlimitAccess().getBelongsToNodeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__BelongsToAssignment_4"


    // $ANTLR start "rule__Stop__BelongsToAssignment_3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8018:1: rule__Stop__BelongsToAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Stop__BelongsToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8022:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8023:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8023:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8024:1: ( ruleEString )
            {
             before(grammarAccess.getStopAccess().getBelongsToNodeCrossReference_3_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8025:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8026:1: ruleEString
            {
             before(grammarAccess.getStopAccess().getBelongsToNodeEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Stop__BelongsToAssignment_315881);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStopAccess().getBelongsToNodeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getStopAccess().getBelongsToNodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__BelongsToAssignment_3"


    // $ANTLR start "rule__Yield__BelongsToAssignment_3"
    // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8037:1: rule__Yield__BelongsToAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Yield__BelongsToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8041:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8042:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8042:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8043:1: ( ruleEString )
            {
             before(grammarAccess.getYieldAccess().getBelongsToNodeCrossReference_3_0()); 
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8044:1: ( ruleEString )
            // ../org.xtext.example.xHighway.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalXHighway.g:8045:1: ruleEString
            {
             before(grammarAccess.getYieldAccess().getBelongsToNodeEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Yield__BelongsToAssignment_315920);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getYieldAccess().getBelongsToNodeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getYieldAccess().getBelongsToNodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__BelongsToAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleHighway_in_entryRuleHighway61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHighway68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__0_in_ruleHighway94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_entryRuleNode121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNode128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Alternatives_in_ruleNode154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignal188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal__Alternatives_in_ruleSignal214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_Impl_in_entryRuleNode_Impl241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNode_Impl248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__0_in_ruleNode_Impl274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCar_in_entryRuleCar301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCar308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__0_in_ruleCar334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSegment_in_entryRuleSegment361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSegment368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__0_in_ruleSegment394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemaphore_in_entryRuleSemaphore421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSemaphore428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__0_in_ruleSemaphore454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_Impl_in_entryRuleSignal_Impl481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignal_Impl488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__0_in_ruleSignal_Impl514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractor_in_entryRuleExtractor541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtractor548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__0_in_ruleExtractor574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInjector_in_entryRuleInjector601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInjector608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__0_in_ruleInjector634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDate_in_entryRuleEDate721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDate728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEDate754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpeedlimit_in_entryRuleSpeedlimit840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpeedlimit847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__0_in_ruleSpeedlimit873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_entryRuleStop900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStop907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0_in_ruleStop933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYield_in_entryRuleYield960 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleYield967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__0_in_ruleYield993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1020 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_Impl_in_rule__Node__Alternatives1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractor_in_rule__Node__Alternatives1106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInjector_in_rule__Node__Alternatives1123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_Impl_in_rule__Signal__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpeedlimit_in_rule__Signal__Alternatives1172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_rule__Signal__Alternatives1189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYield_in_rule__Signal__Alternatives1206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives1239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives1259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__0__Impl_in_rule__Highway__Group__01340 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Highway__Group__1_in_rule__Highway__Group__01343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__1__Impl_in_rule__Highway__Group__11401 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Highway__Group__2_in_rule__Highway__Group__11404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Highway__Group__1__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__2__Impl_in_rule__Highway__Group__21463 = new BitSet(new long[]{0x00000000003D8000L});
        public static final BitSet FOLLOW_rule__Highway__Group__3_in_rule__Highway__Group__21466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Highway__Group__2__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__3__Impl_in_rule__Highway__Group__31525 = new BitSet(new long[]{0x00000000003D8000L});
        public static final BitSet FOLLOW_rule__Highway__Group__4_in_rule__Highway__Group__31528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__0_in_rule__Highway__Group__3__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__4__Impl_in_rule__Highway__Group__41586 = new BitSet(new long[]{0x00000000003D8000L});
        public static final BitSet FOLLOW_rule__Highway__Group__5_in_rule__Highway__Group__41589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__0_in_rule__Highway__Group__4__Impl1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__5__Impl_in_rule__Highway__Group__51647 = new BitSet(new long[]{0x00000000003D8000L});
        public static final BitSet FOLLOW_rule__Highway__Group__6_in_rule__Highway__Group__51650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__0_in_rule__Highway__Group__5__Impl1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__6__Impl_in_rule__Highway__Group__61708 = new BitSet(new long[]{0x00000000003D8000L});
        public static final BitSet FOLLOW_rule__Highway__Group__7_in_rule__Highway__Group__61711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__0_in_rule__Highway__Group__6__Impl1738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__7__Impl_in_rule__Highway__Group__71769 = new BitSet(new long[]{0x00000000003D8000L});
        public static final BitSet FOLLOW_rule__Highway__Group__8_in_rule__Highway__Group__71772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__0_in_rule__Highway__Group__7__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__8__Impl_in_rule__Highway__Group__81830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group__8__Impl1858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__0__Impl_in_rule__Highway__Group_3__01907 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__1_in_rule__Highway__Group_3__01910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Highway__Group_3__0__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__1__Impl_in_rule__Highway__Group_3__11969 = new BitSet(new long[]{0x0000180000400000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__2_in_rule__Highway__Group_3__11972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Highway__Group_3__1__Impl2000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__2__Impl_in_rule__Highway__Group_3__22031 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__3_in_rule__Highway__Group_3__22034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitNodesAssignment_3_2_in_rule__Highway__Group_3__2__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__3__Impl_in_rule__Highway__Group_3__32091 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__4_in_rule__Highway__Group_3__32094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3_3__0_in_rule__Highway__Group_3__3__Impl2121 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__4__Impl_in_rule__Highway__Group_3__42152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_3__4__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3_3__0__Impl_in_rule__Highway__Group_3_3__02221 = new BitSet(new long[]{0x0000180000400000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3_3__1_in_rule__Highway__Group_3_3__02224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Highway__Group_3_3__0__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3_3__1__Impl_in_rule__Highway__Group_3_3__12283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitNodesAssignment_3_3_1_in_rule__Highway__Group_3_3__1__Impl2310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__0__Impl_in_rule__Highway__Group_4__02344 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__1_in_rule__Highway__Group_4__02347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Highway__Group_4__0__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__1__Impl_in_rule__Highway__Group_4__12406 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__2_in_rule__Highway__Group_4__12409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Highway__Group_4__1__Impl2437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__2__Impl_in_rule__Highway__Group_4__22468 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__3_in_rule__Highway__Group_4__22471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitCarsAssignment_4_2_in_rule__Highway__Group_4__2__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__3__Impl_in_rule__Highway__Group_4__32528 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__4_in_rule__Highway__Group_4__32531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4_3__0_in_rule__Highway__Group_4__3__Impl2558 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__4__Impl_in_rule__Highway__Group_4__42589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_4__4__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4_3__0__Impl_in_rule__Highway__Group_4_3__02658 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4_3__1_in_rule__Highway__Group_4_3__02661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Highway__Group_4_3__0__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4_3__1__Impl_in_rule__Highway__Group_4_3__12720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitCarsAssignment_4_3_1_in_rule__Highway__Group_4_3__1__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__0__Impl_in_rule__Highway__Group_5__02781 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__1_in_rule__Highway__Group_5__02784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Highway__Group_5__0__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__1__Impl_in_rule__Highway__Group_5__12843 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__2_in_rule__Highway__Group_5__12846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Highway__Group_5__1__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__2__Impl_in_rule__Highway__Group_5__22905 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__3_in_rule__Highway__Group_5__22908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSegmentsAssignment_5_2_in_rule__Highway__Group_5__2__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__3__Impl_in_rule__Highway__Group_5__32965 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__4_in_rule__Highway__Group_5__32968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5_3__0_in_rule__Highway__Group_5__3__Impl2995 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__4__Impl_in_rule__Highway__Group_5__43026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_5__4__Impl3054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5_3__0__Impl_in_rule__Highway__Group_5_3__03095 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5_3__1_in_rule__Highway__Group_5_3__03098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Highway__Group_5_3__0__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5_3__1__Impl_in_rule__Highway__Group_5_3__13157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSegmentsAssignment_5_3_1_in_rule__Highway__Group_5_3__1__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__0__Impl_in_rule__Highway__Group_6__03218 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__1_in_rule__Highway__Group_6__03221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Highway__Group_6__0__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__1__Impl_in_rule__Highway__Group_6__13280 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__2_in_rule__Highway__Group_6__13283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Highway__Group_6__1__Impl3311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__2__Impl_in_rule__Highway__Group_6__23342 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__3_in_rule__Highway__Group_6__23345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSemaphoreAssignment_6_2_in_rule__Highway__Group_6__2__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__3__Impl_in_rule__Highway__Group_6__33402 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__4_in_rule__Highway__Group_6__33405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6_3__0_in_rule__Highway__Group_6__3__Impl3432 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__4__Impl_in_rule__Highway__Group_6__43463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_6__4__Impl3491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6_3__0__Impl_in_rule__Highway__Group_6_3__03532 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_6_3__1_in_rule__Highway__Group_6_3__03535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Highway__Group_6_3__0__Impl3563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6_3__1__Impl_in_rule__Highway__Group_6_3__13594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSemaphoreAssignment_6_3_1_in_rule__Highway__Group_6_3__1__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__0__Impl_in_rule__Highway__Group_7__03655 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__1_in_rule__Highway__Group_7__03658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Highway__Group_7__0__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__1__Impl_in_rule__Highway__Group_7__13717 = new BitSet(new long[]{0x0006840000000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__2_in_rule__Highway__Group_7__13720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Highway__Group_7__1__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__2__Impl_in_rule__Highway__Group_7__23779 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__3_in_rule__Highway__Group_7__23782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSignalAssignment_7_2_in_rule__Highway__Group_7__2__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__3__Impl_in_rule__Highway__Group_7__33839 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__4_in_rule__Highway__Group_7__33842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7_3__0_in_rule__Highway__Group_7__3__Impl3869 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__4__Impl_in_rule__Highway__Group_7__43900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_7__4__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7_3__0__Impl_in_rule__Highway__Group_7_3__03969 = new BitSet(new long[]{0x0006840000000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_7_3__1_in_rule__Highway__Group_7_3__03972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Highway__Group_7_3__0__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7_3__1__Impl_in_rule__Highway__Group_7_3__14031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSignalAssignment_7_3_1_in_rule__Highway__Group_7_3__1__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__0__Impl_in_rule__Node_Impl__Group__04092 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__1_in_rule__Node_Impl__Group__04095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__1__Impl_in_rule__Node_Impl__Group__14153 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__2_in_rule__Node_Impl__Group__14156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Node_Impl__Group__1__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__2__Impl_in_rule__Node_Impl__Group__24215 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__3_in_rule__Node_Impl__Group__24218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Node_Impl__Group__2__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__3__Impl_in_rule__Node_Impl__Group__34277 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__4_in_rule__Node_Impl__Group__34280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Node_Impl__Group__3__Impl4308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__4__Impl_in_rule__Node_Impl__Group__44339 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__5_in_rule__Node_Impl__Group__44342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Node_Impl__Group__4__Impl4370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__5__Impl_in_rule__Node_Impl__Group__54401 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__6_in_rule__Node_Impl__Group__54404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__HasStartsAssignment_5_in_rule__Node_Impl__Group__5__Impl4431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__6__Impl_in_rule__Node_Impl__Group__64461 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__7_in_rule__Node_Impl__Group__64464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_6__0_in_rule__Node_Impl__Group__6__Impl4491 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__7__Impl_in_rule__Node_Impl__Group__74522 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__8_in_rule__Node_Impl__Group__74525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Node_Impl__Group__7__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__8__Impl_in_rule__Node_Impl__Group__84584 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__9_in_rule__Node_Impl__Group__84587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Node_Impl__Group__8__Impl4615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__9__Impl_in_rule__Node_Impl__Group__94646 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__10_in_rule__Node_Impl__Group__94649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Node_Impl__Group__9__Impl4677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__10__Impl_in_rule__Node_Impl__Group__104708 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__11_in_rule__Node_Impl__Group__104711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__HasEndsAssignment_10_in_rule__Node_Impl__Group__10__Impl4738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__11__Impl_in_rule__Node_Impl__Group__114768 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__12_in_rule__Node_Impl__Group__114771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_11__0_in_rule__Node_Impl__Group__11__Impl4798 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__12__Impl_in_rule__Node_Impl__Group__124829 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__13_in_rule__Node_Impl__Group__124832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Node_Impl__Group__12__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__13__Impl_in_rule__Node_Impl__Group__134891 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__14_in_rule__Node_Impl__Group__134894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_13__0_in_rule__Node_Impl__Group__13__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__14__Impl_in_rule__Node_Impl__Group__144952 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__15_in_rule__Node_Impl__Group__144955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__0_in_rule__Node_Impl__Group__14__Impl4982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__15__Impl_in_rule__Node_Impl__Group__155013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Node_Impl__Group__15__Impl5041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_6__0__Impl_in_rule__Node_Impl__Group_6__05104 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_6__1_in_rule__Node_Impl__Group_6__05107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Node_Impl__Group_6__0__Impl5135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_6__1__Impl_in_rule__Node_Impl__Group_6__15166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__HasStartsAssignment_6_1_in_rule__Node_Impl__Group_6__1__Impl5193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_11__0__Impl_in_rule__Node_Impl__Group_11__05227 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_11__1_in_rule__Node_Impl__Group_11__05230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Node_Impl__Group_11__0__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_11__1__Impl_in_rule__Node_Impl__Group_11__15289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__HasEndsAssignment_11_1_in_rule__Node_Impl__Group_11__1__Impl5316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_13__0__Impl_in_rule__Node_Impl__Group_13__05350 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_13__1_in_rule__Node_Impl__Group_13__05353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Node_Impl__Group_13__0__Impl5381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_13__1__Impl_in_rule__Node_Impl__Group_13__15412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__SemaphoreAssignment_13_1_in_rule__Node_Impl__Group_13__1__Impl5439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__0__Impl_in_rule__Node_Impl__Group_14__05473 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__1_in_rule__Node_Impl__Group_14__05476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Node_Impl__Group_14__0__Impl5504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__1__Impl_in_rule__Node_Impl__Group_14__15535 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__2_in_rule__Node_Impl__Group_14__15538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Node_Impl__Group_14__1__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__2__Impl_in_rule__Node_Impl__Group_14__25597 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__3_in_rule__Node_Impl__Group_14__25600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__SignalsAssignment_14_2_in_rule__Node_Impl__Group_14__2__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__3__Impl_in_rule__Node_Impl__Group_14__35657 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__4_in_rule__Node_Impl__Group_14__35660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14_3__0_in_rule__Node_Impl__Group_14__3__Impl5687 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__4__Impl_in_rule__Node_Impl__Group_14__45718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Node_Impl__Group_14__4__Impl5746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14_3__0__Impl_in_rule__Node_Impl__Group_14_3__05787 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14_3__1_in_rule__Node_Impl__Group_14_3__05790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Node_Impl__Group_14_3__0__Impl5818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14_3__1__Impl_in_rule__Node_Impl__Group_14_3__15849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__SignalsAssignment_14_3_1_in_rule__Node_Impl__Group_14_3__1__Impl5876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__0__Impl_in_rule__Car__Group__05910 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Car__Group__1_in_rule__Car__Group__05913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__1__Impl_in_rule__Car__Group__15971 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Car__Group__2_in_rule__Car__Group__15974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Car__Group__1__Impl6002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__2__Impl_in_rule__Car__Group__26033 = new BitSet(new long[]{0x00000001C0008000L});
        public static final BitSet FOLLOW_rule__Car__Group__3_in_rule__Car__Group__26036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Car__Group__2__Impl6064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__3__Impl_in_rule__Car__Group__36095 = new BitSet(new long[]{0x00000001C0008000L});
        public static final BitSet FOLLOW_rule__Car__Group__4_in_rule__Car__Group__36098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_3__0_in_rule__Car__Group__3__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__4__Impl_in_rule__Car__Group__46156 = new BitSet(new long[]{0x00000001C0008000L});
        public static final BitSet FOLLOW_rule__Car__Group__5_in_rule__Car__Group__46159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_4__0_in_rule__Car__Group__4__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__5__Impl_in_rule__Car__Group__56217 = new BitSet(new long[]{0x00000001C0008000L});
        public static final BitSet FOLLOW_rule__Car__Group__6_in_rule__Car__Group__56220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_5__0_in_rule__Car__Group__5__Impl6247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__6__Impl_in_rule__Car__Group__66278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Car__Group__6__Impl6306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_3__0__Impl_in_rule__Car__Group_3__06351 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Car__Group_3__1_in_rule__Car__Group_3__06354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Car__Group_3__0__Impl6382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_3__1__Impl_in_rule__Car__Group_3__16413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__TimeInAssignment_3_1_in_rule__Car__Group_3__1__Impl6440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_4__0__Impl_in_rule__Car__Group_4__06474 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Car__Group_4__1_in_rule__Car__Group_4__06477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Car__Group_4__0__Impl6505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_4__1__Impl_in_rule__Car__Group_4__16536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__TimeOutAssignment_4_1_in_rule__Car__Group_4__1__Impl6563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_5__0__Impl_in_rule__Car__Group_5__06597 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Car__Group_5__1_in_rule__Car__Group_5__06600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Car__Group_5__0__Impl6628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_5__1__Impl_in_rule__Car__Group_5__16659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__IsInSegmentAssignment_5_1_in_rule__Car__Group_5__1__Impl6686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__0__Impl_in_rule__Segment__Group__06720 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Segment__Group__1_in_rule__Segment__Group__06723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__1__Impl_in_rule__Segment__Group__16781 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Segment__Group__2_in_rule__Segment__Group__16784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Segment__Group__1__Impl6812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__2__Impl_in_rule__Segment__Group__26843 = new BitSet(new long[]{0x0000001C00008000L});
        public static final BitSet FOLLOW_rule__Segment__Group__3_in_rule__Segment__Group__26846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Segment__Group__2__Impl6874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__3__Impl_in_rule__Segment__Group__36905 = new BitSet(new long[]{0x0000001C00008000L});
        public static final BitSet FOLLOW_rule__Segment__Group__4_in_rule__Segment__Group__36908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_3__0_in_rule__Segment__Group__3__Impl6935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__4__Impl_in_rule__Segment__Group__46966 = new BitSet(new long[]{0x0000001C00008000L});
        public static final BitSet FOLLOW_rule__Segment__Group__5_in_rule__Segment__Group__46969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_4__0_in_rule__Segment__Group__4__Impl6996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__5__Impl_in_rule__Segment__Group__57027 = new BitSet(new long[]{0x0000001C00008000L});
        public static final BitSet FOLLOW_rule__Segment__Group__6_in_rule__Segment__Group__57030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__0_in_rule__Segment__Group__5__Impl7057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__6__Impl_in_rule__Segment__Group__67088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Segment__Group__6__Impl7116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_3__0__Impl_in_rule__Segment__Group_3__07161 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Segment__Group_3__1_in_rule__Segment__Group_3__07164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Segment__Group_3__0__Impl7192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_3__1__Impl_in_rule__Segment__Group_3__17223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__NumLanesAssignment_3_1_in_rule__Segment__Group_3__1__Impl7250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_4__0__Impl_in_rule__Segment__Group_4__07284 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Segment__Group_4__1_in_rule__Segment__Group_4__07287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Segment__Group_4__0__Impl7315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_4__1__Impl_in_rule__Segment__Group_4__17346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__LengthAssignment_4_1_in_rule__Segment__Group_4__1__Impl7373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__0__Impl_in_rule__Segment__Group_5__07407 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__1_in_rule__Segment__Group_5__07410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Segment__Group_5__0__Impl7438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__1__Impl_in_rule__Segment__Group_5__17469 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__2_in_rule__Segment__Group_5__17472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Segment__Group_5__1__Impl7500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__2__Impl_in_rule__Segment__Group_5__27531 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__3_in_rule__Segment__Group_5__27534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__HasCarsAssignment_5_2_in_rule__Segment__Group_5__2__Impl7561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__3__Impl_in_rule__Segment__Group_5__37591 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__4_in_rule__Segment__Group_5__37594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5_3__0_in_rule__Segment__Group_5__3__Impl7621 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__4__Impl_in_rule__Segment__Group_5__47652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Segment__Group_5__4__Impl7680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5_3__0__Impl_in_rule__Segment__Group_5_3__07721 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Segment__Group_5_3__1_in_rule__Segment__Group_5_3__07724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Segment__Group_5_3__0__Impl7752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5_3__1__Impl_in_rule__Segment__Group_5_3__17783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__HasCarsAssignment_5_3_1_in_rule__Segment__Group_5_3__1__Impl7810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__0__Impl_in_rule__Semaphore__Group__07844 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__1_in_rule__Semaphore__Group__07847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Semaphore__Group__0__Impl7875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__1__Impl_in_rule__Semaphore__Group__17906 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__2_in_rule__Semaphore__Group__17909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Semaphore__Group__1__Impl7937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__2__Impl_in_rule__Semaphore__Group__27968 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__3_in_rule__Semaphore__Group__27971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_2__0_in_rule__Semaphore__Group__2__Impl7998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__3__Impl_in_rule__Semaphore__Group__38029 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__4_in_rule__Semaphore__Group__38032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_3__0_in_rule__Semaphore__Group__3__Impl8059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__4__Impl_in_rule__Semaphore__Group__48090 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__5_in_rule__Semaphore__Group__48093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_4__0_in_rule__Semaphore__Group__4__Impl8120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__5__Impl_in_rule__Semaphore__Group__58151 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__6_in_rule__Semaphore__Group__58154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Semaphore__Group__5__Impl8182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__6__Impl_in_rule__Semaphore__Group__68213 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__7_in_rule__Semaphore__Group__68216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__BelongsToAssignment_6_in_rule__Semaphore__Group__6__Impl8243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__7__Impl_in_rule__Semaphore__Group__78273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Semaphore__Group__7__Impl8301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_2__0__Impl_in_rule__Semaphore__Group_2__08348 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_2__1_in_rule__Semaphore__Group_2__08351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Semaphore__Group_2__0__Impl8379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_2__1__Impl_in_rule__Semaphore__Group_2__18410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__CanGoAssignment_2_1_in_rule__Semaphore__Group_2__1__Impl8437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_3__0__Impl_in_rule__Semaphore__Group_3__08471 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_3__1_in_rule__Semaphore__Group_3__08474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Semaphore__Group_3__0__Impl8502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_3__1__Impl_in_rule__Semaphore__Group_3__18533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__SecondsRedAssignment_3_1_in_rule__Semaphore__Group_3__1__Impl8560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_4__0__Impl_in_rule__Semaphore__Group_4__08594 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_4__1_in_rule__Semaphore__Group_4__08597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Semaphore__Group_4__0__Impl8625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_4__1__Impl_in_rule__Semaphore__Group_4__18656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__SecondsGreenAssignment_4_1_in_rule__Semaphore__Group_4__1__Impl8683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__0__Impl_in_rule__Signal_Impl__Group__08717 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__1_in_rule__Signal_Impl__Group__08720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Signal_Impl__Group__0__Impl8748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__1__Impl_in_rule__Signal_Impl__Group__18779 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__2_in_rule__Signal_Impl__Group__18782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Signal_Impl__Group__1__Impl8810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__2__Impl_in_rule__Signal_Impl__Group__28841 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__3_in_rule__Signal_Impl__Group__28844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Signal_Impl__Group__2__Impl8872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__3__Impl_in_rule__Signal_Impl__Group__38903 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__4_in_rule__Signal_Impl__Group__38906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__BelongsToAssignment_3_in_rule__Signal_Impl__Group__3__Impl8933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__4__Impl_in_rule__Signal_Impl__Group__48963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Signal_Impl__Group__4__Impl8991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__0__Impl_in_rule__Extractor__Group__09032 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__1_in_rule__Extractor__Group__09035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__1__Impl_in_rule__Extractor__Group__19093 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__2_in_rule__Extractor__Group__19096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Extractor__Group__1__Impl9124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__2__Impl_in_rule__Extractor__Group__29155 = new BitSet(new long[]{0x0000000004800000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__3_in_rule__Extractor__Group__29158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Extractor__Group__2__Impl9186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__3__Impl_in_rule__Extractor__Group__39217 = new BitSet(new long[]{0x0000000004800000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__4_in_rule__Extractor__Group__39220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3__0_in_rule__Extractor__Group__3__Impl9247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__4__Impl_in_rule__Extractor__Group__49278 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__5_in_rule__Extractor__Group__49281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Extractor__Group__4__Impl9309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__5__Impl_in_rule__Extractor__Group__59340 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group__6_in_rule__Extractor__Group__59343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Extractor__Group__5__Impl9371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__6__Impl_in_rule__Extractor__Group__69402 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__7_in_rule__Extractor__Group__69405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__HasEndsAssignment_6_in_rule__Extractor__Group__6__Impl9432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__7__Impl_in_rule__Extractor__Group__79462 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__8_in_rule__Extractor__Group__79465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_7__0_in_rule__Extractor__Group__7__Impl9492 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__8__Impl_in_rule__Extractor__Group__89523 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__9_in_rule__Extractor__Group__89526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Extractor__Group__8__Impl9554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__9__Impl_in_rule__Extractor__Group__99585 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__10_in_rule__Extractor__Group__99588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_9__0_in_rule__Extractor__Group__9__Impl9615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__10__Impl_in_rule__Extractor__Group__109646 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__11_in_rule__Extractor__Group__109649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__0_in_rule__Extractor__Group__10__Impl9676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__11__Impl_in_rule__Extractor__Group__119707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Extractor__Group__11__Impl9735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3__0__Impl_in_rule__Extractor__Group_3__09790 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3__1_in_rule__Extractor__Group_3__09793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Extractor__Group_3__0__Impl9821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3__1__Impl_in_rule__Extractor__Group_3__19852 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3__2_in_rule__Extractor__Group_3__19855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Extractor__Group_3__1__Impl9883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3__2__Impl_in_rule__Extractor__Group_3__29914 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3__3_in_rule__Extractor__Group_3__29917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__HasStartsAssignment_3_2_in_rule__Extractor__Group_3__2__Impl9944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3__3__Impl_in_rule__Extractor__Group_3__39974 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3__4_in_rule__Extractor__Group_3__39977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3_3__0_in_rule__Extractor__Group_3__3__Impl10004 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3__4__Impl_in_rule__Extractor__Group_3__410035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Extractor__Group_3__4__Impl10063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3_3__0__Impl_in_rule__Extractor__Group_3_3__010104 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3_3__1_in_rule__Extractor__Group_3_3__010107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Extractor__Group_3_3__0__Impl10135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_3_3__1__Impl_in_rule__Extractor__Group_3_3__110166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__HasStartsAssignment_3_3_1_in_rule__Extractor__Group_3_3__1__Impl10193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_7__0__Impl_in_rule__Extractor__Group_7__010227 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_7__1_in_rule__Extractor__Group_7__010230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Extractor__Group_7__0__Impl10258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_7__1__Impl_in_rule__Extractor__Group_7__110289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__HasEndsAssignment_7_1_in_rule__Extractor__Group_7__1__Impl10316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_9__0__Impl_in_rule__Extractor__Group_9__010350 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_9__1_in_rule__Extractor__Group_9__010353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Extractor__Group_9__0__Impl10381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_9__1__Impl_in_rule__Extractor__Group_9__110412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__SemaphoreAssignment_9_1_in_rule__Extractor__Group_9__1__Impl10439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__0__Impl_in_rule__Extractor__Group_10__010473 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__1_in_rule__Extractor__Group_10__010476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Extractor__Group_10__0__Impl10504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__1__Impl_in_rule__Extractor__Group_10__110535 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__2_in_rule__Extractor__Group_10__110538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Extractor__Group_10__1__Impl10566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__2__Impl_in_rule__Extractor__Group_10__210597 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__3_in_rule__Extractor__Group_10__210600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__SignalsAssignment_10_2_in_rule__Extractor__Group_10__2__Impl10627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__3__Impl_in_rule__Extractor__Group_10__310657 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__4_in_rule__Extractor__Group_10__310660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10_3__0_in_rule__Extractor__Group_10__3__Impl10687 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__4__Impl_in_rule__Extractor__Group_10__410718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Extractor__Group_10__4__Impl10746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10_3__0__Impl_in_rule__Extractor__Group_10_3__010787 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10_3__1_in_rule__Extractor__Group_10_3__010790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Extractor__Group_10_3__0__Impl10818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10_3__1__Impl_in_rule__Extractor__Group_10_3__110849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__SignalsAssignment_10_3_1_in_rule__Extractor__Group_10_3__1__Impl10876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__0__Impl_in_rule__Injector__Group__010910 = new BitSet(new long[]{0x0000180000400000L});
        public static final BitSet FOLLOW_rule__Injector__Group__1_in_rule__Injector__Group__010913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__1__Impl_in_rule__Injector__Group__110971 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Injector__Group__2_in_rule__Injector__Group__110974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Injector__Group__1__Impl11002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__2__Impl_in_rule__Injector__Group__211033 = new BitSet(new long[]{0x0000200000800000L});
        public static final BitSet FOLLOW_rule__Injector__Group__3_in_rule__Injector__Group__211036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Injector__Group__2__Impl11064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__3__Impl_in_rule__Injector__Group__311095 = new BitSet(new long[]{0x0000200000800000L});
        public static final BitSet FOLLOW_rule__Injector__Group__4_in_rule__Injector__Group__311098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_3__0_in_rule__Injector__Group__3__Impl11125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__4__Impl_in_rule__Injector__Group__411156 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Injector__Group__5_in_rule__Injector__Group__411159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Injector__Group__4__Impl11187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__5__Impl_in_rule__Injector__Group__511218 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group__6_in_rule__Injector__Group__511221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Injector__Group__5__Impl11249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__6__Impl_in_rule__Injector__Group__611280 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Injector__Group__7_in_rule__Injector__Group__611283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__HasStartsAssignment_6_in_rule__Injector__Group__6__Impl11310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__7__Impl_in_rule__Injector__Group__711340 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Injector__Group__8_in_rule__Injector__Group__711343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_7__0_in_rule__Injector__Group__7__Impl11370 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Injector__Group__8__Impl_in_rule__Injector__Group__811401 = new BitSet(new long[]{0x000000001C008000L});
        public static final BitSet FOLLOW_rule__Injector__Group__9_in_rule__Injector__Group__811404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Injector__Group__8__Impl11432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__9__Impl_in_rule__Injector__Group__911463 = new BitSet(new long[]{0x000000001C008000L});
        public static final BitSet FOLLOW_rule__Injector__Group__10_in_rule__Injector__Group__911466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_9__0_in_rule__Injector__Group__9__Impl11493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__10__Impl_in_rule__Injector__Group__1011524 = new BitSet(new long[]{0x000000001C008000L});
        public static final BitSet FOLLOW_rule__Injector__Group__11_in_rule__Injector__Group__1011527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__0_in_rule__Injector__Group__10__Impl11554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__11__Impl_in_rule__Injector__Group__1111585 = new BitSet(new long[]{0x000000001C008000L});
        public static final BitSet FOLLOW_rule__Injector__Group__12_in_rule__Injector__Group__1111588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__0_in_rule__Injector__Group__11__Impl11615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__12__Impl_in_rule__Injector__Group__1211646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Injector__Group__12__Impl11674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_3__0__Impl_in_rule__Injector__Group_3__011731 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Injector__Group_3__1_in_rule__Injector__Group_3__011734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Injector__Group_3__0__Impl11762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_3__1__Impl_in_rule__Injector__Group_3__111793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__CarsPerHourAssignment_3_1_in_rule__Injector__Group_3__1__Impl11820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_7__0__Impl_in_rule__Injector__Group_7__011854 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_7__1_in_rule__Injector__Group_7__011857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Injector__Group_7__0__Impl11885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_7__1__Impl_in_rule__Injector__Group_7__111916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__HasStartsAssignment_7_1_in_rule__Injector__Group_7__1__Impl11943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_9__0__Impl_in_rule__Injector__Group_9__011977 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Injector__Group_9__1_in_rule__Injector__Group_9__011980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Injector__Group_9__0__Impl12008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_9__1__Impl_in_rule__Injector__Group_9__112039 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_9__2_in_rule__Injector__Group_9__112042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Injector__Group_9__1__Impl12070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_9__2__Impl_in_rule__Injector__Group_9__212101 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Injector__Group_9__3_in_rule__Injector__Group_9__212104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__HasEndsAssignment_9_2_in_rule__Injector__Group_9__2__Impl12131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_9__3__Impl_in_rule__Injector__Group_9__312161 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Injector__Group_9__4_in_rule__Injector__Group_9__312164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_9_3__0_in_rule__Injector__Group_9__3__Impl12191 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Injector__Group_9__4__Impl_in_rule__Injector__Group_9__412222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Injector__Group_9__4__Impl12250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_9_3__0__Impl_in_rule__Injector__Group_9_3__012291 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_9_3__1_in_rule__Injector__Group_9_3__012294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Injector__Group_9_3__0__Impl12322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_9_3__1__Impl_in_rule__Injector__Group_9_3__112353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__HasEndsAssignment_9_3_1_in_rule__Injector__Group_9_3__1__Impl12380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__0__Impl_in_rule__Injector__Group_10__012414 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__1_in_rule__Injector__Group_10__012417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Injector__Group_10__0__Impl12445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__1__Impl_in_rule__Injector__Group_10__112476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__SemaphoreAssignment_10_1_in_rule__Injector__Group_10__1__Impl12503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__0__Impl_in_rule__Injector__Group_11__012537 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__1_in_rule__Injector__Group_11__012540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Injector__Group_11__0__Impl12568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__1__Impl_in_rule__Injector__Group_11__112599 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__2_in_rule__Injector__Group_11__112602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Injector__Group_11__1__Impl12630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__2__Impl_in_rule__Injector__Group_11__212661 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__3_in_rule__Injector__Group_11__212664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__SignalsAssignment_11_2_in_rule__Injector__Group_11__2__Impl12691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__3__Impl_in_rule__Injector__Group_11__312721 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__4_in_rule__Injector__Group_11__312724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11_3__0_in_rule__Injector__Group_11__3__Impl12751 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__4__Impl_in_rule__Injector__Group_11__412782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Injector__Group_11__4__Impl12810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11_3__0__Impl_in_rule__Injector__Group_11_3__012851 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_11_3__1_in_rule__Injector__Group_11_3__012854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Injector__Group_11_3__0__Impl12882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11_3__1__Impl_in_rule__Injector__Group_11_3__112913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__SignalsAssignment_11_3_1_in_rule__Injector__Group_11_3__1__Impl12940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__012974 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__012977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__EInt__Group__0__Impl13006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__113039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl13066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__0__Impl_in_rule__Speedlimit__Group__013099 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__1_in_rule__Speedlimit__Group__013102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Speedlimit__Group__0__Impl13130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__1__Impl_in_rule__Speedlimit__Group__113161 = new BitSet(new long[]{0x0001004000000000L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__2_in_rule__Speedlimit__Group__113164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Speedlimit__Group__1__Impl13192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__2__Impl_in_rule__Speedlimit__Group__213223 = new BitSet(new long[]{0x0001004000000000L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__3_in_rule__Speedlimit__Group__213226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group_2__0_in_rule__Speedlimit__Group__2__Impl13253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__3__Impl_in_rule__Speedlimit__Group__313284 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__4_in_rule__Speedlimit__Group__313287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Speedlimit__Group__3__Impl13315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__4__Impl_in_rule__Speedlimit__Group__413346 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__5_in_rule__Speedlimit__Group__413349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__BelongsToAssignment_4_in_rule__Speedlimit__Group__4__Impl13376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__5__Impl_in_rule__Speedlimit__Group__513406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Speedlimit__Group__5__Impl13434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group_2__0__Impl_in_rule__Speedlimit__Group_2__013477 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group_2__1_in_rule__Speedlimit__Group_2__013480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Speedlimit__Group_2__0__Impl13508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group_2__1__Impl_in_rule__Speedlimit__Group_2__113539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__SpeedAssignment_2_1_in_rule__Speedlimit__Group_2__1__Impl13566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__013600 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__013603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Stop__Group__0__Impl13631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__113662 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__113665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Stop__Group__1__Impl13693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__213724 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__213727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Stop__Group__2__Impl13755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__313786 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Stop__Group__4_in_rule__Stop__Group__313789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__BelongsToAssignment_3_in_rule__Stop__Group__3__Impl13816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__4__Impl_in_rule__Stop__Group__413846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Stop__Group__4__Impl13874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__0__Impl_in_rule__Yield__Group__013915 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Yield__Group__1_in_rule__Yield__Group__013918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Yield__Group__0__Impl13946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__1__Impl_in_rule__Yield__Group__113977 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Yield__Group__2_in_rule__Yield__Group__113980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Yield__Group__1__Impl14008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__2__Impl_in_rule__Yield__Group__214039 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Yield__Group__3_in_rule__Yield__Group__214042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Yield__Group__2__Impl14070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__3__Impl_in_rule__Yield__Group__314101 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Yield__Group__4_in_rule__Yield__Group__314104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__BelongsToAssignment_3_in_rule__Yield__Group__3__Impl14131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__4__Impl_in_rule__Yield__Group__414161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Yield__Group__4__Impl14189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_rule__Highway__InitNodesAssignment_3_214235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_rule__Highway__InitNodesAssignment_3_3_114266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCar_in_rule__Highway__InitCarsAssignment_4_214297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCar_in_rule__Highway__InitCarsAssignment_4_3_114328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSegment_in_rule__Highway__InitSegmentsAssignment_5_214359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSegment_in_rule__Highway__InitSegmentsAssignment_5_3_114390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemaphore_in_rule__Highway__InitSemaphoreAssignment_6_214421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemaphore_in_rule__Highway__InitSemaphoreAssignment_6_3_114452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_in_rule__Highway__InitSignalAssignment_7_214483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_in_rule__Highway__InitSignalAssignment_7_3_114514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__HasStartsAssignment_514549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__HasStartsAssignment_6_114588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__HasEndsAssignment_1014627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__HasEndsAssignment_11_114666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__SemaphoreAssignment_13_114705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__SignalsAssignment_14_214744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__SignalsAssignment_14_3_114783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDate_in_rule__Car__TimeInAssignment_3_114818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDate_in_rule__Car__TimeOutAssignment_4_114849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Car__IsInSegmentAssignment_5_114884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Segment__NumLanesAssignment_3_114919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Segment__LengthAssignment_4_114950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Segment__HasCarsAssignment_5_214985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Segment__HasCarsAssignment_5_3_115024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__Semaphore__CanGoAssignment_2_115059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Semaphore__SecondsRedAssignment_3_115090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Semaphore__SecondsGreenAssignment_4_115121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Semaphore__BelongsToAssignment_615156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Signal_Impl__BelongsToAssignment_315195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__HasStartsAssignment_3_215234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__HasStartsAssignment_3_3_115273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__HasEndsAssignment_615312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__HasEndsAssignment_7_115351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__SemaphoreAssignment_9_115390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__SignalsAssignment_10_215429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__SignalsAssignment_10_3_115468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Injector__CarsPerHourAssignment_3_115503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__HasStartsAssignment_615538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__HasStartsAssignment_7_115577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__HasEndsAssignment_9_215616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__HasEndsAssignment_9_3_115655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__SemaphoreAssignment_10_115694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__SignalsAssignment_11_215733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__SignalsAssignment_11_3_115772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Speedlimit__SpeedAssignment_2_115807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Speedlimit__BelongsToAssignment_415842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Stop__BelongsToAssignment_315881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Yield__BelongsToAssignment_315920 = new BitSet(new long[]{0x0000000000000002L});
    }


}