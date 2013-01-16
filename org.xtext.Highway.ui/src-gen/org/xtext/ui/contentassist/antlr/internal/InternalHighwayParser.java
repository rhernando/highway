package org.xtext.ui.contentassist.antlr.internal; 

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
import org.xtext.services.HighwayGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHighwayParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Highway'", "'{'", "'}'", "'Segments'", "','", "'Nodes'", "'Cars'", "'Semaphores'", "'Signals'", "'Node'", "'hasStarts'", "'('", "')'", "'hasEnds'", "'semaphore'", "'signals'", "'Car'", "'timeIn'", "'timeOut'", "'isInSegment'", "'Segment'", "'numLanes'", "'length'", "'hasCars'", "'Semaphore'", "'belongsTo'", "'canGo'", "'secondsRed'", "'secondsGreen'", "'Signal'", "'Extractor'", "'Injector'", "'carsPerHour'", "'-'", "'Speedlimit'", "'Speed'", "'Stop'", "'Yield'"
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


        public InternalHighwayParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHighwayParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHighwayParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g"; }


     
     	private HighwayGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(HighwayGrammarAccess grammarAccess) {
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:60:1: entryRuleHighway : ruleHighway EOF ;
    public final void entryRuleHighway() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:61:1: ( ruleHighway EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:62:1: ruleHighway EOF
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:69:1: ruleHighway : ( ( rule__Highway__Group__0 ) ) ;
    public final void ruleHighway() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:73:2: ( ( ( rule__Highway__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:74:1: ( ( rule__Highway__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:74:1: ( ( rule__Highway__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:75:1: ( rule__Highway__Group__0 )
            {
             before(grammarAccess.getHighwayAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:76:1: ( rule__Highway__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:76:2: rule__Highway__Group__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:88:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:89:1: ( ruleNode EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:90:1: ruleNode EOF
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:97:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:101:2: ( ( ( rule__Node__Alternatives ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:102:1: ( ( rule__Node__Alternatives ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:102:1: ( ( rule__Node__Alternatives ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:103:1: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:104:1: ( rule__Node__Alternatives )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:104:2: rule__Node__Alternatives
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:116:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:117:1: ( ruleSignal EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:118:1: ruleSignal EOF
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:125:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:129:2: ( ( ( rule__Signal__Alternatives ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:130:1: ( ( rule__Signal__Alternatives ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:130:1: ( ( rule__Signal__Alternatives ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:131:1: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:132:1: ( rule__Signal__Alternatives )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:132:2: rule__Signal__Alternatives
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:144:1: entryRuleNode_Impl : ruleNode_Impl EOF ;
    public final void entryRuleNode_Impl() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:145:1: ( ruleNode_Impl EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:146:1: ruleNode_Impl EOF
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:153:1: ruleNode_Impl : ( ( rule__Node_Impl__Group__0 ) ) ;
    public final void ruleNode_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:157:2: ( ( ( rule__Node_Impl__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:158:1: ( ( rule__Node_Impl__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:158:1: ( ( rule__Node_Impl__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:159:1: ( rule__Node_Impl__Group__0 )
            {
             before(grammarAccess.getNode_ImplAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:160:1: ( rule__Node_Impl__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:160:2: rule__Node_Impl__Group__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:172:1: entryRuleCar : ruleCar EOF ;
    public final void entryRuleCar() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:173:1: ( ruleCar EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:174:1: ruleCar EOF
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:181:1: ruleCar : ( ( rule__Car__Group__0 ) ) ;
    public final void ruleCar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:185:2: ( ( ( rule__Car__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:186:1: ( ( rule__Car__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:186:1: ( ( rule__Car__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:187:1: ( rule__Car__Group__0 )
            {
             before(grammarAccess.getCarAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:188:1: ( rule__Car__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:188:2: rule__Car__Group__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:200:1: entryRuleSegment : ruleSegment EOF ;
    public final void entryRuleSegment() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:201:1: ( ruleSegment EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:202:1: ruleSegment EOF
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:209:1: ruleSegment : ( ( rule__Segment__Group__0 ) ) ;
    public final void ruleSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:213:2: ( ( ( rule__Segment__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:214:1: ( ( rule__Segment__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:214:1: ( ( rule__Segment__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:215:1: ( rule__Segment__Group__0 )
            {
             before(grammarAccess.getSegmentAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:216:1: ( rule__Segment__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:216:2: rule__Segment__Group__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:228:1: entryRuleSemaphore : ruleSemaphore EOF ;
    public final void entryRuleSemaphore() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:229:1: ( ruleSemaphore EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:230:1: ruleSemaphore EOF
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:237:1: ruleSemaphore : ( ( rule__Semaphore__Group__0 ) ) ;
    public final void ruleSemaphore() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:241:2: ( ( ( rule__Semaphore__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:242:1: ( ( rule__Semaphore__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:242:1: ( ( rule__Semaphore__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:243:1: ( rule__Semaphore__Group__0 )
            {
             before(grammarAccess.getSemaphoreAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:244:1: ( rule__Semaphore__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:244:2: rule__Semaphore__Group__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:256:1: entryRuleSignal_Impl : ruleSignal_Impl EOF ;
    public final void entryRuleSignal_Impl() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:257:1: ( ruleSignal_Impl EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:258:1: ruleSignal_Impl EOF
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:265:1: ruleSignal_Impl : ( ( rule__Signal_Impl__Group__0 ) ) ;
    public final void ruleSignal_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:269:2: ( ( ( rule__Signal_Impl__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:270:1: ( ( rule__Signal_Impl__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:270:1: ( ( rule__Signal_Impl__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:271:1: ( rule__Signal_Impl__Group__0 )
            {
             before(grammarAccess.getSignal_ImplAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:272:1: ( rule__Signal_Impl__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:272:2: rule__Signal_Impl__Group__0
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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:284:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:285:1: ( ruleEString EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:286:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString541);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString548); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:293:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:297:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:298:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:298:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:299:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:300:1: ( rule__EString__Alternatives )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:300:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString574);
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


    // $ANTLR start "entryRuleExtractor"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:312:1: entryRuleExtractor : ruleExtractor EOF ;
    public final void entryRuleExtractor() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:313:1: ( ruleExtractor EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:314:1: ruleExtractor EOF
            {
             before(grammarAccess.getExtractorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtractor_in_entryRuleExtractor601);
            ruleExtractor();

            state._fsp--;

             after(grammarAccess.getExtractorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtractor608); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:321:1: ruleExtractor : ( ( rule__Extractor__Group__0 ) ) ;
    public final void ruleExtractor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:325:2: ( ( ( rule__Extractor__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:326:1: ( ( rule__Extractor__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:326:1: ( ( rule__Extractor__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:327:1: ( rule__Extractor__Group__0 )
            {
             before(grammarAccess.getExtractorAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:328:1: ( rule__Extractor__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:328:2: rule__Extractor__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__0_in_ruleExtractor634);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:340:1: entryRuleInjector : ruleInjector EOF ;
    public final void entryRuleInjector() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:341:1: ( ruleInjector EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:342:1: ruleInjector EOF
            {
             before(grammarAccess.getInjectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInjector_in_entryRuleInjector661);
            ruleInjector();

            state._fsp--;

             after(grammarAccess.getInjectorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInjector668); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:349:1: ruleInjector : ( ( rule__Injector__Group__0 ) ) ;
    public final void ruleInjector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:353:2: ( ( ( rule__Injector__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:354:1: ( ( rule__Injector__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:354:1: ( ( rule__Injector__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:355:1: ( rule__Injector__Group__0 )
            {
             before(grammarAccess.getInjectorAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:356:1: ( rule__Injector__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:356:2: rule__Injector__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__0_in_ruleInjector694);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:368:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:369:1: ( ruleEInt EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:370:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt721);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt728); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:377:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:381:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:382:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:382:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:383:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:384:1: ( rule__EInt__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:384:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt754);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:396:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:397:1: ( ruleEDate EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:398:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDate_in_entryRuleEDate781);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDate788); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:405:1: ruleEDate : ( RULE_STRING ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:409:2: ( ( RULE_STRING ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:410:1: ( RULE_STRING )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:410:1: ( RULE_STRING )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:411:1: RULE_STRING
            {
             before(grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEDate814); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:424:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:425:1: ( ruleEBoolean EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:426:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean840);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean847); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:433:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:437:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:438:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:438:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:439:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:440:1: ( rule__EBoolean__Alternatives )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:440:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean873);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:452:1: entryRuleSpeedlimit : ruleSpeedlimit EOF ;
    public final void entryRuleSpeedlimit() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:453:1: ( ruleSpeedlimit EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:454:1: ruleSpeedlimit EOF
            {
             before(grammarAccess.getSpeedlimitRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpeedlimit_in_entryRuleSpeedlimit900);
            ruleSpeedlimit();

            state._fsp--;

             after(grammarAccess.getSpeedlimitRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpeedlimit907); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:461:1: ruleSpeedlimit : ( ( rule__Speedlimit__Group__0 ) ) ;
    public final void ruleSpeedlimit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:465:2: ( ( ( rule__Speedlimit__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:466:1: ( ( rule__Speedlimit__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:466:1: ( ( rule__Speedlimit__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:467:1: ( rule__Speedlimit__Group__0 )
            {
             before(grammarAccess.getSpeedlimitAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:468:1: ( rule__Speedlimit__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:468:2: rule__Speedlimit__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__0_in_ruleSpeedlimit933);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:480:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:481:1: ( ruleStop EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:482:1: ruleStop EOF
            {
             before(grammarAccess.getStopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStop_in_entryRuleStop960);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getStopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStop967); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:489:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:493:2: ( ( ( rule__Stop__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:494:1: ( ( rule__Stop__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:494:1: ( ( rule__Stop__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:495:1: ( rule__Stop__Group__0 )
            {
             before(grammarAccess.getStopAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:496:1: ( rule__Stop__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:496:2: rule__Stop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0_in_ruleStop993);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:508:1: entryRuleYield : ruleYield EOF ;
    public final void entryRuleYield() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:509:1: ( ruleYield EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:510:1: ruleYield EOF
            {
             before(grammarAccess.getYieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleYield_in_entryRuleYield1020);
            ruleYield();

            state._fsp--;

             after(grammarAccess.getYieldRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleYield1027); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:517:1: ruleYield : ( ( rule__Yield__Group__0 ) ) ;
    public final void ruleYield() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:521:2: ( ( ( rule__Yield__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:522:1: ( ( rule__Yield__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:522:1: ( ( rule__Yield__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:523:1: ( rule__Yield__Group__0 )
            {
             before(grammarAccess.getYieldAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:524:1: ( rule__Yield__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:524:2: rule__Yield__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__0_in_ruleYield1053);
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


    // $ANTLR start "rule__Node__Alternatives"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:536:1: rule__Node__Alternatives : ( ( ruleNode_Impl ) | ( ruleExtractor ) | ( ruleInjector ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:540:1: ( ( ruleNode_Impl ) | ( ruleExtractor ) | ( ruleInjector ) )
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
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:541:1: ( ruleNode_Impl )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:541:1: ( ruleNode_Impl )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:542:1: ruleNode_Impl
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
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:547:6: ( ruleExtractor )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:547:6: ( ruleExtractor )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:548:1: ruleExtractor
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
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:553:6: ( ruleInjector )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:553:6: ( ruleInjector )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:554:1: ruleInjector
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:564:1: rule__Signal__Alternatives : ( ( ruleSignal_Impl ) | ( ruleSpeedlimit ) | ( ruleStop ) | ( ruleYield ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:568:1: ( ( ruleSignal_Impl ) | ( ruleSpeedlimit ) | ( ruleStop ) | ( ruleYield ) )
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
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:569:1: ( ruleSignal_Impl )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:569:1: ( ruleSignal_Impl )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:570:1: ruleSignal_Impl
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
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:575:6: ( ruleSpeedlimit )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:575:6: ( ruleSpeedlimit )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:576:1: ruleSpeedlimit
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
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:581:6: ( ruleStop )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:581:6: ( ruleStop )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:582:1: ruleStop
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
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:587:6: ( ruleYield )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:587:6: ( ruleYield )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:588:1: ruleYield
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


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:598:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:602:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:603:1: ( RULE_STRING )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:603:1: ( RULE_STRING )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:604:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1238); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:609:6: ( RULE_ID )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:609:6: ( RULE_ID )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:610:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1255); 
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


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:620:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:624:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:625:1: ( 'true' )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:625:1: ( 'true' )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:626:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EBoolean__Alternatives1288); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:633:6: ( 'false' )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:633:6: ( 'false' )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:634:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives1308); 
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


    // $ANTLR start "rule__Highway__Group__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:648:1: rule__Highway__Group__0 : rule__Highway__Group__0__Impl rule__Highway__Group__1 ;
    public final void rule__Highway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:652:1: ( rule__Highway__Group__0__Impl rule__Highway__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:653:2: rule__Highway__Group__0__Impl rule__Highway__Group__1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:660:1: rule__Highway__Group__0__Impl : ( () ) ;
    public final void rule__Highway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:664:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:665:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:665:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:666:1: ()
            {
             before(grammarAccess.getHighwayAccess().getHighwayAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:667:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:669:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:679:1: rule__Highway__Group__1 : rule__Highway__Group__1__Impl rule__Highway__Group__2 ;
    public final void rule__Highway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:683:1: ( rule__Highway__Group__1__Impl rule__Highway__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:684:2: rule__Highway__Group__1__Impl rule__Highway__Group__2
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:691:1: rule__Highway__Group__1__Impl : ( 'Highway' ) ;
    public final void rule__Highway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:695:1: ( ( 'Highway' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:696:1: ( 'Highway' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:696:1: ( 'Highway' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:697:1: 'Highway'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:710:1: rule__Highway__Group__2 : rule__Highway__Group__2__Impl rule__Highway__Group__3 ;
    public final void rule__Highway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:714:1: ( rule__Highway__Group__2__Impl rule__Highway__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:715:2: rule__Highway__Group__2__Impl rule__Highway__Group__3
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:722:1: rule__Highway__Group__2__Impl : ( '{' ) ;
    public final void rule__Highway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:726:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:727:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:727:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:728:1: '{'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:741:1: rule__Highway__Group__3 : rule__Highway__Group__3__Impl rule__Highway__Group__4 ;
    public final void rule__Highway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:745:1: ( rule__Highway__Group__3__Impl rule__Highway__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:746:2: rule__Highway__Group__3__Impl rule__Highway__Group__4
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:753:1: rule__Highway__Group__3__Impl : ( ( rule__Highway__Group_3__0 )? ) ;
    public final void rule__Highway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:757:1: ( ( ( rule__Highway__Group_3__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:758:1: ( ( rule__Highway__Group_3__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:758:1: ( ( rule__Highway__Group_3__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:759:1: ( rule__Highway__Group_3__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:760:1: ( rule__Highway__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:760:2: rule__Highway__Group_3__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:770:1: rule__Highway__Group__4 : rule__Highway__Group__4__Impl rule__Highway__Group__5 ;
    public final void rule__Highway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:774:1: ( rule__Highway__Group__4__Impl rule__Highway__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:775:2: rule__Highway__Group__4__Impl rule__Highway__Group__5
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:782:1: rule__Highway__Group__4__Impl : ( ( rule__Highway__Group_4__0 )? ) ;
    public final void rule__Highway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:786:1: ( ( ( rule__Highway__Group_4__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:787:1: ( ( rule__Highway__Group_4__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:787:1: ( ( rule__Highway__Group_4__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:788:1: ( rule__Highway__Group_4__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:789:1: ( rule__Highway__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:789:2: rule__Highway__Group_4__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:799:1: rule__Highway__Group__5 : rule__Highway__Group__5__Impl rule__Highway__Group__6 ;
    public final void rule__Highway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:803:1: ( rule__Highway__Group__5__Impl rule__Highway__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:804:2: rule__Highway__Group__5__Impl rule__Highway__Group__6
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:811:1: rule__Highway__Group__5__Impl : ( ( rule__Highway__Group_5__0 )? ) ;
    public final void rule__Highway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:815:1: ( ( ( rule__Highway__Group_5__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:816:1: ( ( rule__Highway__Group_5__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:816:1: ( ( rule__Highway__Group_5__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:817:1: ( rule__Highway__Group_5__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_5()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:818:1: ( rule__Highway__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:818:2: rule__Highway__Group_5__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:828:1: rule__Highway__Group__6 : rule__Highway__Group__6__Impl rule__Highway__Group__7 ;
    public final void rule__Highway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:832:1: ( rule__Highway__Group__6__Impl rule__Highway__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:833:2: rule__Highway__Group__6__Impl rule__Highway__Group__7
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:840:1: rule__Highway__Group__6__Impl : ( ( rule__Highway__Group_6__0 )? ) ;
    public final void rule__Highway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:844:1: ( ( ( rule__Highway__Group_6__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:845:1: ( ( rule__Highway__Group_6__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:845:1: ( ( rule__Highway__Group_6__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:846:1: ( rule__Highway__Group_6__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_6()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:847:1: ( rule__Highway__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:847:2: rule__Highway__Group_6__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:857:1: rule__Highway__Group__7 : rule__Highway__Group__7__Impl rule__Highway__Group__8 ;
    public final void rule__Highway__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:861:1: ( rule__Highway__Group__7__Impl rule__Highway__Group__8 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:862:2: rule__Highway__Group__7__Impl rule__Highway__Group__8
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:869:1: rule__Highway__Group__7__Impl : ( ( rule__Highway__Group_7__0 )? ) ;
    public final void rule__Highway__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:873:1: ( ( ( rule__Highway__Group_7__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:874:1: ( ( rule__Highway__Group_7__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:874:1: ( ( rule__Highway__Group_7__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:875:1: ( rule__Highway__Group_7__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_7()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:876:1: ( rule__Highway__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:876:2: rule__Highway__Group_7__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:886:1: rule__Highway__Group__8 : rule__Highway__Group__8__Impl ;
    public final void rule__Highway__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:890:1: ( rule__Highway__Group__8__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:891:2: rule__Highway__Group__8__Impl
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:897:1: rule__Highway__Group__8__Impl : ( '}' ) ;
    public final void rule__Highway__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:901:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:902:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:902:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:903:1: '}'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:934:1: rule__Highway__Group_3__0 : rule__Highway__Group_3__0__Impl rule__Highway__Group_3__1 ;
    public final void rule__Highway__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:938:1: ( rule__Highway__Group_3__0__Impl rule__Highway__Group_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:939:2: rule__Highway__Group_3__0__Impl rule__Highway__Group_3__1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:946:1: rule__Highway__Group_3__0__Impl : ( 'Segments' ) ;
    public final void rule__Highway__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:950:1: ( ( 'Segments' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:951:1: ( 'Segments' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:951:1: ( 'Segments' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:952:1: 'Segments'
            {
             before(grammarAccess.getHighwayAccess().getSegmentsKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Highway__Group_3__0__Impl1938); 
             after(grammarAccess.getHighwayAccess().getSegmentsKeyword_3_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:965:1: rule__Highway__Group_3__1 : rule__Highway__Group_3__1__Impl rule__Highway__Group_3__2 ;
    public final void rule__Highway__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:969:1: ( rule__Highway__Group_3__1__Impl rule__Highway__Group_3__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:970:2: rule__Highway__Group_3__1__Impl rule__Highway__Group_3__2
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:977:1: rule__Highway__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:981:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:982:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:982:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:983:1: '{'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:996:1: rule__Highway__Group_3__2 : rule__Highway__Group_3__2__Impl rule__Highway__Group_3__3 ;
    public final void rule__Highway__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1000:1: ( rule__Highway__Group_3__2__Impl rule__Highway__Group_3__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1001:2: rule__Highway__Group_3__2__Impl rule__Highway__Group_3__3
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1008:1: rule__Highway__Group_3__2__Impl : ( ( rule__Highway__InitSegmentsAssignment_3_2 ) ) ;
    public final void rule__Highway__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1012:1: ( ( ( rule__Highway__InitSegmentsAssignment_3_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1013:1: ( ( rule__Highway__InitSegmentsAssignment_3_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1013:1: ( ( rule__Highway__InitSegmentsAssignment_3_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1014:1: ( rule__Highway__InitSegmentsAssignment_3_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsAssignment_3_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1015:1: ( rule__Highway__InitSegmentsAssignment_3_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1015:2: rule__Highway__InitSegmentsAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSegmentsAssignment_3_2_in_rule__Highway__Group_3__2__Impl2061);
            rule__Highway__InitSegmentsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitSegmentsAssignment_3_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1025:1: rule__Highway__Group_3__3 : rule__Highway__Group_3__3__Impl rule__Highway__Group_3__4 ;
    public final void rule__Highway__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1029:1: ( rule__Highway__Group_3__3__Impl rule__Highway__Group_3__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1030:2: rule__Highway__Group_3__3__Impl rule__Highway__Group_3__4
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1037:1: rule__Highway__Group_3__3__Impl : ( ( rule__Highway__Group_3_3__0 )* ) ;
    public final void rule__Highway__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1041:1: ( ( ( rule__Highway__Group_3_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1042:1: ( ( rule__Highway__Group_3_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1042:1: ( ( rule__Highway__Group_3_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1043:1: ( rule__Highway__Group_3_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_3_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1044:1: ( rule__Highway__Group_3_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1044:2: rule__Highway__Group_3_3__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1054:1: rule__Highway__Group_3__4 : rule__Highway__Group_3__4__Impl ;
    public final void rule__Highway__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1058:1: ( rule__Highway__Group_3__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1059:2: rule__Highway__Group_3__4__Impl
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1065:1: rule__Highway__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1069:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1070:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1070:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1071:1: '}'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1094:1: rule__Highway__Group_3_3__0 : rule__Highway__Group_3_3__0__Impl rule__Highway__Group_3_3__1 ;
    public final void rule__Highway__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1098:1: ( rule__Highway__Group_3_3__0__Impl rule__Highway__Group_3_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1099:2: rule__Highway__Group_3_3__0__Impl rule__Highway__Group_3_3__1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1106:1: rule__Highway__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1110:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1111:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1111:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1112:1: ','
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1125:1: rule__Highway__Group_3_3__1 : rule__Highway__Group_3_3__1__Impl ;
    public final void rule__Highway__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1129:1: ( rule__Highway__Group_3_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1130:2: rule__Highway__Group_3_3__1__Impl
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1136:1: rule__Highway__Group_3_3__1__Impl : ( ( rule__Highway__InitSegmentsAssignment_3_3_1 ) ) ;
    public final void rule__Highway__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1140:1: ( ( ( rule__Highway__InitSegmentsAssignment_3_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1141:1: ( ( rule__Highway__InitSegmentsAssignment_3_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1141:1: ( ( rule__Highway__InitSegmentsAssignment_3_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1142:1: ( rule__Highway__InitSegmentsAssignment_3_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsAssignment_3_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1143:1: ( rule__Highway__InitSegmentsAssignment_3_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1143:2: rule__Highway__InitSegmentsAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSegmentsAssignment_3_3_1_in_rule__Highway__Group_3_3__1__Impl2310);
            rule__Highway__InitSegmentsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitSegmentsAssignment_3_3_1()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1157:1: rule__Highway__Group_4__0 : rule__Highway__Group_4__0__Impl rule__Highway__Group_4__1 ;
    public final void rule__Highway__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1161:1: ( rule__Highway__Group_4__0__Impl rule__Highway__Group_4__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1162:2: rule__Highway__Group_4__0__Impl rule__Highway__Group_4__1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1169:1: rule__Highway__Group_4__0__Impl : ( 'Nodes' ) ;
    public final void rule__Highway__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1173:1: ( ( 'Nodes' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1174:1: ( 'Nodes' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1174:1: ( 'Nodes' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1175:1: 'Nodes'
            {
             before(grammarAccess.getHighwayAccess().getNodesKeyword_4_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Highway__Group_4__0__Impl2375); 
             after(grammarAccess.getHighwayAccess().getNodesKeyword_4_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1188:1: rule__Highway__Group_4__1 : rule__Highway__Group_4__1__Impl rule__Highway__Group_4__2 ;
    public final void rule__Highway__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1192:1: ( rule__Highway__Group_4__1__Impl rule__Highway__Group_4__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1193:2: rule__Highway__Group_4__1__Impl rule__Highway__Group_4__2
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1200:1: rule__Highway__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1204:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1205:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1205:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1206:1: '{'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1219:1: rule__Highway__Group_4__2 : rule__Highway__Group_4__2__Impl rule__Highway__Group_4__3 ;
    public final void rule__Highway__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1223:1: ( rule__Highway__Group_4__2__Impl rule__Highway__Group_4__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1224:2: rule__Highway__Group_4__2__Impl rule__Highway__Group_4__3
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1231:1: rule__Highway__Group_4__2__Impl : ( ( rule__Highway__InitNodesAssignment_4_2 ) ) ;
    public final void rule__Highway__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1235:1: ( ( ( rule__Highway__InitNodesAssignment_4_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1236:1: ( ( rule__Highway__InitNodesAssignment_4_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1236:1: ( ( rule__Highway__InitNodesAssignment_4_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1237:1: ( rule__Highway__InitNodesAssignment_4_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitNodesAssignment_4_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1238:1: ( rule__Highway__InitNodesAssignment_4_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1238:2: rule__Highway__InitNodesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitNodesAssignment_4_2_in_rule__Highway__Group_4__2__Impl2498);
            rule__Highway__InitNodesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitNodesAssignment_4_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1248:1: rule__Highway__Group_4__3 : rule__Highway__Group_4__3__Impl rule__Highway__Group_4__4 ;
    public final void rule__Highway__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1252:1: ( rule__Highway__Group_4__3__Impl rule__Highway__Group_4__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1253:2: rule__Highway__Group_4__3__Impl rule__Highway__Group_4__4
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1260:1: rule__Highway__Group_4__3__Impl : ( ( rule__Highway__Group_4_3__0 )* ) ;
    public final void rule__Highway__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1264:1: ( ( ( rule__Highway__Group_4_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1265:1: ( ( rule__Highway__Group_4_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1265:1: ( ( rule__Highway__Group_4_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1266:1: ( rule__Highway__Group_4_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_4_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1267:1: ( rule__Highway__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1267:2: rule__Highway__Group_4_3__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1277:1: rule__Highway__Group_4__4 : rule__Highway__Group_4__4__Impl ;
    public final void rule__Highway__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1281:1: ( rule__Highway__Group_4__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1282:2: rule__Highway__Group_4__4__Impl
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1288:1: rule__Highway__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1292:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1293:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1293:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1294:1: '}'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1317:1: rule__Highway__Group_4_3__0 : rule__Highway__Group_4_3__0__Impl rule__Highway__Group_4_3__1 ;
    public final void rule__Highway__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1321:1: ( rule__Highway__Group_4_3__0__Impl rule__Highway__Group_4_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1322:2: rule__Highway__Group_4_3__0__Impl rule__Highway__Group_4_3__1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1329:1: rule__Highway__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1333:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1334:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1334:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1335:1: ','
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1348:1: rule__Highway__Group_4_3__1 : rule__Highway__Group_4_3__1__Impl ;
    public final void rule__Highway__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1352:1: ( rule__Highway__Group_4_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1353:2: rule__Highway__Group_4_3__1__Impl
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1359:1: rule__Highway__Group_4_3__1__Impl : ( ( rule__Highway__InitNodesAssignment_4_3_1 ) ) ;
    public final void rule__Highway__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1363:1: ( ( ( rule__Highway__InitNodesAssignment_4_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1364:1: ( ( rule__Highway__InitNodesAssignment_4_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1364:1: ( ( rule__Highway__InitNodesAssignment_4_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1365:1: ( rule__Highway__InitNodesAssignment_4_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitNodesAssignment_4_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1366:1: ( rule__Highway__InitNodesAssignment_4_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1366:2: rule__Highway__InitNodesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitNodesAssignment_4_3_1_in_rule__Highway__Group_4_3__1__Impl2747);
            rule__Highway__InitNodesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitNodesAssignment_4_3_1()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1380:1: rule__Highway__Group_5__0 : rule__Highway__Group_5__0__Impl rule__Highway__Group_5__1 ;
    public final void rule__Highway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1384:1: ( rule__Highway__Group_5__0__Impl rule__Highway__Group_5__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1385:2: rule__Highway__Group_5__0__Impl rule__Highway__Group_5__1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1392:1: rule__Highway__Group_5__0__Impl : ( 'Cars' ) ;
    public final void rule__Highway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1396:1: ( ( 'Cars' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1397:1: ( 'Cars' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1397:1: ( 'Cars' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1398:1: 'Cars'
            {
             before(grammarAccess.getHighwayAccess().getCarsKeyword_5_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Highway__Group_5__0__Impl2812); 
             after(grammarAccess.getHighwayAccess().getCarsKeyword_5_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1411:1: rule__Highway__Group_5__1 : rule__Highway__Group_5__1__Impl rule__Highway__Group_5__2 ;
    public final void rule__Highway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1415:1: ( rule__Highway__Group_5__1__Impl rule__Highway__Group_5__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1416:2: rule__Highway__Group_5__1__Impl rule__Highway__Group_5__2
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1423:1: rule__Highway__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1427:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1428:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1428:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1429:1: '{'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1442:1: rule__Highway__Group_5__2 : rule__Highway__Group_5__2__Impl rule__Highway__Group_5__3 ;
    public final void rule__Highway__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1446:1: ( rule__Highway__Group_5__2__Impl rule__Highway__Group_5__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1447:2: rule__Highway__Group_5__2__Impl rule__Highway__Group_5__3
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1454:1: rule__Highway__Group_5__2__Impl : ( ( rule__Highway__InitCarsAssignment_5_2 ) ) ;
    public final void rule__Highway__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1458:1: ( ( ( rule__Highway__InitCarsAssignment_5_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1459:1: ( ( rule__Highway__InitCarsAssignment_5_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1459:1: ( ( rule__Highway__InitCarsAssignment_5_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1460:1: ( rule__Highway__InitCarsAssignment_5_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitCarsAssignment_5_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1461:1: ( rule__Highway__InitCarsAssignment_5_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1461:2: rule__Highway__InitCarsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitCarsAssignment_5_2_in_rule__Highway__Group_5__2__Impl2935);
            rule__Highway__InitCarsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitCarsAssignment_5_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1471:1: rule__Highway__Group_5__3 : rule__Highway__Group_5__3__Impl rule__Highway__Group_5__4 ;
    public final void rule__Highway__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1475:1: ( rule__Highway__Group_5__3__Impl rule__Highway__Group_5__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1476:2: rule__Highway__Group_5__3__Impl rule__Highway__Group_5__4
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1483:1: rule__Highway__Group_5__3__Impl : ( ( rule__Highway__Group_5_3__0 )* ) ;
    public final void rule__Highway__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1487:1: ( ( ( rule__Highway__Group_5_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1488:1: ( ( rule__Highway__Group_5_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1488:1: ( ( rule__Highway__Group_5_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1489:1: ( rule__Highway__Group_5_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_5_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1490:1: ( rule__Highway__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1490:2: rule__Highway__Group_5_3__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1500:1: rule__Highway__Group_5__4 : rule__Highway__Group_5__4__Impl ;
    public final void rule__Highway__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1504:1: ( rule__Highway__Group_5__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1505:2: rule__Highway__Group_5__4__Impl
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1511:1: rule__Highway__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1515:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1516:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1516:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1517:1: '}'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1540:1: rule__Highway__Group_5_3__0 : rule__Highway__Group_5_3__0__Impl rule__Highway__Group_5_3__1 ;
    public final void rule__Highway__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1544:1: ( rule__Highway__Group_5_3__0__Impl rule__Highway__Group_5_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1545:2: rule__Highway__Group_5_3__0__Impl rule__Highway__Group_5_3__1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1552:1: rule__Highway__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1556:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1557:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1557:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1558:1: ','
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1571:1: rule__Highway__Group_5_3__1 : rule__Highway__Group_5_3__1__Impl ;
    public final void rule__Highway__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1575:1: ( rule__Highway__Group_5_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1576:2: rule__Highway__Group_5_3__1__Impl
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1582:1: rule__Highway__Group_5_3__1__Impl : ( ( rule__Highway__InitCarsAssignment_5_3_1 ) ) ;
    public final void rule__Highway__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1586:1: ( ( ( rule__Highway__InitCarsAssignment_5_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1587:1: ( ( rule__Highway__InitCarsAssignment_5_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1587:1: ( ( rule__Highway__InitCarsAssignment_5_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1588:1: ( rule__Highway__InitCarsAssignment_5_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitCarsAssignment_5_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1589:1: ( rule__Highway__InitCarsAssignment_5_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1589:2: rule__Highway__InitCarsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitCarsAssignment_5_3_1_in_rule__Highway__Group_5_3__1__Impl3184);
            rule__Highway__InitCarsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHighwayAccess().getInitCarsAssignment_5_3_1()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1603:1: rule__Highway__Group_6__0 : rule__Highway__Group_6__0__Impl rule__Highway__Group_6__1 ;
    public final void rule__Highway__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1607:1: ( rule__Highway__Group_6__0__Impl rule__Highway__Group_6__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1608:2: rule__Highway__Group_6__0__Impl rule__Highway__Group_6__1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1615:1: rule__Highway__Group_6__0__Impl : ( 'Semaphores' ) ;
    public final void rule__Highway__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1619:1: ( ( 'Semaphores' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1620:1: ( 'Semaphores' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1620:1: ( 'Semaphores' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1621:1: 'Semaphores'
            {
             before(grammarAccess.getHighwayAccess().getSemaphoresKeyword_6_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Highway__Group_6__0__Impl3249); 
             after(grammarAccess.getHighwayAccess().getSemaphoresKeyword_6_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1634:1: rule__Highway__Group_6__1 : rule__Highway__Group_6__1__Impl rule__Highway__Group_6__2 ;
    public final void rule__Highway__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1638:1: ( rule__Highway__Group_6__1__Impl rule__Highway__Group_6__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1639:2: rule__Highway__Group_6__1__Impl rule__Highway__Group_6__2
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1646:1: rule__Highway__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1650:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1651:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1651:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1652:1: '{'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1665:1: rule__Highway__Group_6__2 : rule__Highway__Group_6__2__Impl rule__Highway__Group_6__3 ;
    public final void rule__Highway__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1669:1: ( rule__Highway__Group_6__2__Impl rule__Highway__Group_6__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1670:2: rule__Highway__Group_6__2__Impl rule__Highway__Group_6__3
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1677:1: rule__Highway__Group_6__2__Impl : ( ( rule__Highway__InitSemaphoreAssignment_6_2 ) ) ;
    public final void rule__Highway__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1681:1: ( ( ( rule__Highway__InitSemaphoreAssignment_6_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1682:1: ( ( rule__Highway__InitSemaphoreAssignment_6_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1682:1: ( ( rule__Highway__InitSemaphoreAssignment_6_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1683:1: ( rule__Highway__InitSemaphoreAssignment_6_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreAssignment_6_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1684:1: ( rule__Highway__InitSemaphoreAssignment_6_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1684:2: rule__Highway__InitSemaphoreAssignment_6_2
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1694:1: rule__Highway__Group_6__3 : rule__Highway__Group_6__3__Impl rule__Highway__Group_6__4 ;
    public final void rule__Highway__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1698:1: ( rule__Highway__Group_6__3__Impl rule__Highway__Group_6__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1699:2: rule__Highway__Group_6__3__Impl rule__Highway__Group_6__4
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1706:1: rule__Highway__Group_6__3__Impl : ( ( rule__Highway__Group_6_3__0 )* ) ;
    public final void rule__Highway__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1710:1: ( ( ( rule__Highway__Group_6_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1711:1: ( ( rule__Highway__Group_6_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1711:1: ( ( rule__Highway__Group_6_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1712:1: ( rule__Highway__Group_6_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_6_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1713:1: ( rule__Highway__Group_6_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1713:2: rule__Highway__Group_6_3__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1723:1: rule__Highway__Group_6__4 : rule__Highway__Group_6__4__Impl ;
    public final void rule__Highway__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1727:1: ( rule__Highway__Group_6__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1728:2: rule__Highway__Group_6__4__Impl
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1734:1: rule__Highway__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1738:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1739:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1739:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1740:1: '}'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1763:1: rule__Highway__Group_6_3__0 : rule__Highway__Group_6_3__0__Impl rule__Highway__Group_6_3__1 ;
    public final void rule__Highway__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1767:1: ( rule__Highway__Group_6_3__0__Impl rule__Highway__Group_6_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1768:2: rule__Highway__Group_6_3__0__Impl rule__Highway__Group_6_3__1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1775:1: rule__Highway__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1779:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1780:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1780:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1781:1: ','
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1794:1: rule__Highway__Group_6_3__1 : rule__Highway__Group_6_3__1__Impl ;
    public final void rule__Highway__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1798:1: ( rule__Highway__Group_6_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1799:2: rule__Highway__Group_6_3__1__Impl
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1805:1: rule__Highway__Group_6_3__1__Impl : ( ( rule__Highway__InitSemaphoreAssignment_6_3_1 ) ) ;
    public final void rule__Highway__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1809:1: ( ( ( rule__Highway__InitSemaphoreAssignment_6_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1810:1: ( ( rule__Highway__InitSemaphoreAssignment_6_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1810:1: ( ( rule__Highway__InitSemaphoreAssignment_6_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1811:1: ( rule__Highway__InitSemaphoreAssignment_6_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreAssignment_6_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1812:1: ( rule__Highway__InitSemaphoreAssignment_6_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1812:2: rule__Highway__InitSemaphoreAssignment_6_3_1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1826:1: rule__Highway__Group_7__0 : rule__Highway__Group_7__0__Impl rule__Highway__Group_7__1 ;
    public final void rule__Highway__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1830:1: ( rule__Highway__Group_7__0__Impl rule__Highway__Group_7__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1831:2: rule__Highway__Group_7__0__Impl rule__Highway__Group_7__1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1838:1: rule__Highway__Group_7__0__Impl : ( 'Signals' ) ;
    public final void rule__Highway__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1842:1: ( ( 'Signals' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1843:1: ( 'Signals' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1843:1: ( 'Signals' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1844:1: 'Signals'
            {
             before(grammarAccess.getHighwayAccess().getSignalsKeyword_7_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Highway__Group_7__0__Impl3686); 
             after(grammarAccess.getHighwayAccess().getSignalsKeyword_7_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1857:1: rule__Highway__Group_7__1 : rule__Highway__Group_7__1__Impl rule__Highway__Group_7__2 ;
    public final void rule__Highway__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1861:1: ( rule__Highway__Group_7__1__Impl rule__Highway__Group_7__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1862:2: rule__Highway__Group_7__1__Impl rule__Highway__Group_7__2
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1869:1: rule__Highway__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1873:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1874:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1874:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1875:1: '{'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1888:1: rule__Highway__Group_7__2 : rule__Highway__Group_7__2__Impl rule__Highway__Group_7__3 ;
    public final void rule__Highway__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1892:1: ( rule__Highway__Group_7__2__Impl rule__Highway__Group_7__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1893:2: rule__Highway__Group_7__2__Impl rule__Highway__Group_7__3
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1900:1: rule__Highway__Group_7__2__Impl : ( ( rule__Highway__InitSignalAssignment_7_2 ) ) ;
    public final void rule__Highway__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1904:1: ( ( ( rule__Highway__InitSignalAssignment_7_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1905:1: ( ( rule__Highway__InitSignalAssignment_7_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1905:1: ( ( rule__Highway__InitSignalAssignment_7_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1906:1: ( rule__Highway__InitSignalAssignment_7_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitSignalAssignment_7_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1907:1: ( rule__Highway__InitSignalAssignment_7_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1907:2: rule__Highway__InitSignalAssignment_7_2
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1917:1: rule__Highway__Group_7__3 : rule__Highway__Group_7__3__Impl rule__Highway__Group_7__4 ;
    public final void rule__Highway__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1921:1: ( rule__Highway__Group_7__3__Impl rule__Highway__Group_7__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1922:2: rule__Highway__Group_7__3__Impl rule__Highway__Group_7__4
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1929:1: rule__Highway__Group_7__3__Impl : ( ( rule__Highway__Group_7_3__0 )* ) ;
    public final void rule__Highway__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1933:1: ( ( ( rule__Highway__Group_7_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1934:1: ( ( rule__Highway__Group_7_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1934:1: ( ( rule__Highway__Group_7_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1935:1: ( rule__Highway__Group_7_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_7_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1936:1: ( rule__Highway__Group_7_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1936:2: rule__Highway__Group_7_3__0
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1946:1: rule__Highway__Group_7__4 : rule__Highway__Group_7__4__Impl ;
    public final void rule__Highway__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1950:1: ( rule__Highway__Group_7__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1951:2: rule__Highway__Group_7__4__Impl
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1957:1: rule__Highway__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1961:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1962:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1962:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1963:1: '}'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1986:1: rule__Highway__Group_7_3__0 : rule__Highway__Group_7_3__0__Impl rule__Highway__Group_7_3__1 ;
    public final void rule__Highway__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1990:1: ( rule__Highway__Group_7_3__0__Impl rule__Highway__Group_7_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1991:2: rule__Highway__Group_7_3__0__Impl rule__Highway__Group_7_3__1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1998:1: rule__Highway__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2002:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2003:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2003:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2004:1: ','
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2017:1: rule__Highway__Group_7_3__1 : rule__Highway__Group_7_3__1__Impl ;
    public final void rule__Highway__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2021:1: ( rule__Highway__Group_7_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2022:2: rule__Highway__Group_7_3__1__Impl
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2028:1: rule__Highway__Group_7_3__1__Impl : ( ( rule__Highway__InitSignalAssignment_7_3_1 ) ) ;
    public final void rule__Highway__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2032:1: ( ( ( rule__Highway__InitSignalAssignment_7_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2033:1: ( ( rule__Highway__InitSignalAssignment_7_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2033:1: ( ( rule__Highway__InitSignalAssignment_7_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2034:1: ( rule__Highway__InitSignalAssignment_7_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitSignalAssignment_7_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2035:1: ( rule__Highway__InitSignalAssignment_7_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2035:2: rule__Highway__InitSignalAssignment_7_3_1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2049:1: rule__Node_Impl__Group__0 : rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1 ;
    public final void rule__Node_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2053:1: ( rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2054:2: rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2061:1: rule__Node_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Node_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2065:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2066:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2066:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2067:1: ()
            {
             before(grammarAccess.getNode_ImplAccess().getNodeAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2068:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2070:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2080:1: rule__Node_Impl__Group__1 : rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2 ;
    public final void rule__Node_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2084:1: ( rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2085:2: rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2092:1: rule__Node_Impl__Group__1__Impl : ( 'Node' ) ;
    public final void rule__Node_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2096:1: ( ( 'Node' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2097:1: ( 'Node' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2097:1: ( 'Node' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2098:1: 'Node'
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2111:1: rule__Node_Impl__Group__2 : rule__Node_Impl__Group__2__Impl rule__Node_Impl__Group__3 ;
    public final void rule__Node_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2115:1: ( rule__Node_Impl__Group__2__Impl rule__Node_Impl__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2116:2: rule__Node_Impl__Group__2__Impl rule__Node_Impl__Group__3
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2123:1: rule__Node_Impl__Group__2__Impl : ( ( rule__Node_Impl__NameAssignment_2 ) ) ;
    public final void rule__Node_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2127:1: ( ( ( rule__Node_Impl__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2128:1: ( ( rule__Node_Impl__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2128:1: ( ( rule__Node_Impl__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2129:1: ( rule__Node_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getNode_ImplAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2130:1: ( rule__Node_Impl__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2130:2: rule__Node_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__NameAssignment_2_in_rule__Node_Impl__Group__2__Impl4245);
            rule__Node_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2140:1: rule__Node_Impl__Group__3 : rule__Node_Impl__Group__3__Impl rule__Node_Impl__Group__4 ;
    public final void rule__Node_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2144:1: ( rule__Node_Impl__Group__3__Impl rule__Node_Impl__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2145:2: rule__Node_Impl__Group__3__Impl rule__Node_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__3__Impl_in_rule__Node_Impl__Group__34275);
            rule__Node_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__4_in_rule__Node_Impl__Group__34278);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2152:1: rule__Node_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Node_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2156:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2157:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2157:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2158:1: '{'
            {
             before(grammarAccess.getNode_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Node_Impl__Group__3__Impl4306); 
             after(grammarAccess.getNode_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2171:1: rule__Node_Impl__Group__4 : rule__Node_Impl__Group__4__Impl rule__Node_Impl__Group__5 ;
    public final void rule__Node_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2175:1: ( rule__Node_Impl__Group__4__Impl rule__Node_Impl__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2176:2: rule__Node_Impl__Group__4__Impl rule__Node_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__4__Impl_in_rule__Node_Impl__Group__44337);
            rule__Node_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__5_in_rule__Node_Impl__Group__44340);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2183:1: rule__Node_Impl__Group__4__Impl : ( 'hasStarts' ) ;
    public final void rule__Node_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2187:1: ( ( 'hasStarts' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2188:1: ( 'hasStarts' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2188:1: ( 'hasStarts' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2189:1: 'hasStarts'
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Node_Impl__Group__4__Impl4368); 
             after(grammarAccess.getNode_ImplAccess().getHasStartsKeyword_4()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2202:1: rule__Node_Impl__Group__5 : rule__Node_Impl__Group__5__Impl rule__Node_Impl__Group__6 ;
    public final void rule__Node_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2206:1: ( rule__Node_Impl__Group__5__Impl rule__Node_Impl__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2207:2: rule__Node_Impl__Group__5__Impl rule__Node_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__5__Impl_in_rule__Node_Impl__Group__54399);
            rule__Node_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__6_in_rule__Node_Impl__Group__54402);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2214:1: rule__Node_Impl__Group__5__Impl : ( '(' ) ;
    public final void rule__Node_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2218:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2219:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2219:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2220:1: '('
            {
             before(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Node_Impl__Group__5__Impl4430); 
             after(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2233:1: rule__Node_Impl__Group__6 : rule__Node_Impl__Group__6__Impl rule__Node_Impl__Group__7 ;
    public final void rule__Node_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2237:1: ( rule__Node_Impl__Group__6__Impl rule__Node_Impl__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2238:2: rule__Node_Impl__Group__6__Impl rule__Node_Impl__Group__7
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2245:1: rule__Node_Impl__Group__6__Impl : ( ( rule__Node_Impl__HasStartsAssignment_6 ) ) ;
    public final void rule__Node_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2249:1: ( ( ( rule__Node_Impl__HasStartsAssignment_6 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2250:1: ( ( rule__Node_Impl__HasStartsAssignment_6 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2250:1: ( ( rule__Node_Impl__HasStartsAssignment_6 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2251:1: ( rule__Node_Impl__HasStartsAssignment_6 )
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsAssignment_6()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2252:1: ( rule__Node_Impl__HasStartsAssignment_6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2252:2: rule__Node_Impl__HasStartsAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__HasStartsAssignment_6_in_rule__Node_Impl__Group__6__Impl4491);
            rule__Node_Impl__HasStartsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getHasStartsAssignment_6()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2262:1: rule__Node_Impl__Group__7 : rule__Node_Impl__Group__7__Impl rule__Node_Impl__Group__8 ;
    public final void rule__Node_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2266:1: ( rule__Node_Impl__Group__7__Impl rule__Node_Impl__Group__8 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2267:2: rule__Node_Impl__Group__7__Impl rule__Node_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__7__Impl_in_rule__Node_Impl__Group__74521);
            rule__Node_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__8_in_rule__Node_Impl__Group__74524);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2274:1: rule__Node_Impl__Group__7__Impl : ( ( rule__Node_Impl__Group_7__0 )* ) ;
    public final void rule__Node_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2278:1: ( ( ( rule__Node_Impl__Group_7__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2279:1: ( ( rule__Node_Impl__Group_7__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2279:1: ( ( rule__Node_Impl__Group_7__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2280:1: ( rule__Node_Impl__Group_7__0 )*
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_7()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2281:1: ( rule__Node_Impl__Group_7__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2281:2: rule__Node_Impl__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_7__0_in_rule__Node_Impl__Group__7__Impl4551);
            	    rule__Node_Impl__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getNode_ImplAccess().getGroup_7()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2291:1: rule__Node_Impl__Group__8 : rule__Node_Impl__Group__8__Impl rule__Node_Impl__Group__9 ;
    public final void rule__Node_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2295:1: ( rule__Node_Impl__Group__8__Impl rule__Node_Impl__Group__9 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2296:2: rule__Node_Impl__Group__8__Impl rule__Node_Impl__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__8__Impl_in_rule__Node_Impl__Group__84582);
            rule__Node_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__9_in_rule__Node_Impl__Group__84585);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2303:1: rule__Node_Impl__Group__8__Impl : ( ')' ) ;
    public final void rule__Node_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2307:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2308:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2308:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2309:1: ')'
            {
             before(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_8()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Node_Impl__Group__8__Impl4613); 
             after(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2322:1: rule__Node_Impl__Group__9 : rule__Node_Impl__Group__9__Impl rule__Node_Impl__Group__10 ;
    public final void rule__Node_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2326:1: ( rule__Node_Impl__Group__9__Impl rule__Node_Impl__Group__10 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2327:2: rule__Node_Impl__Group__9__Impl rule__Node_Impl__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__9__Impl_in_rule__Node_Impl__Group__94644);
            rule__Node_Impl__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__10_in_rule__Node_Impl__Group__94647);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2334:1: rule__Node_Impl__Group__9__Impl : ( 'hasEnds' ) ;
    public final void rule__Node_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2338:1: ( ( 'hasEnds' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2339:1: ( 'hasEnds' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2339:1: ( 'hasEnds' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2340:1: 'hasEnds'
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsKeyword_9()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Node_Impl__Group__9__Impl4675); 
             after(grammarAccess.getNode_ImplAccess().getHasEndsKeyword_9()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2353:1: rule__Node_Impl__Group__10 : rule__Node_Impl__Group__10__Impl rule__Node_Impl__Group__11 ;
    public final void rule__Node_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2357:1: ( rule__Node_Impl__Group__10__Impl rule__Node_Impl__Group__11 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2358:2: rule__Node_Impl__Group__10__Impl rule__Node_Impl__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__10__Impl_in_rule__Node_Impl__Group__104706);
            rule__Node_Impl__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__11_in_rule__Node_Impl__Group__104709);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2365:1: rule__Node_Impl__Group__10__Impl : ( '(' ) ;
    public final void rule__Node_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2369:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2370:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2370:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2371:1: '('
            {
             before(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_10()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Node_Impl__Group__10__Impl4737); 
             after(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_10()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2384:1: rule__Node_Impl__Group__11 : rule__Node_Impl__Group__11__Impl rule__Node_Impl__Group__12 ;
    public final void rule__Node_Impl__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2388:1: ( rule__Node_Impl__Group__11__Impl rule__Node_Impl__Group__12 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2389:2: rule__Node_Impl__Group__11__Impl rule__Node_Impl__Group__12
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2396:1: rule__Node_Impl__Group__11__Impl : ( ( rule__Node_Impl__HasEndsAssignment_11 ) ) ;
    public final void rule__Node_Impl__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2400:1: ( ( ( rule__Node_Impl__HasEndsAssignment_11 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2401:1: ( ( rule__Node_Impl__HasEndsAssignment_11 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2401:1: ( ( rule__Node_Impl__HasEndsAssignment_11 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2402:1: ( rule__Node_Impl__HasEndsAssignment_11 )
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsAssignment_11()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2403:1: ( rule__Node_Impl__HasEndsAssignment_11 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2403:2: rule__Node_Impl__HasEndsAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__HasEndsAssignment_11_in_rule__Node_Impl__Group__11__Impl4798);
            rule__Node_Impl__HasEndsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getHasEndsAssignment_11()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2413:1: rule__Node_Impl__Group__12 : rule__Node_Impl__Group__12__Impl rule__Node_Impl__Group__13 ;
    public final void rule__Node_Impl__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2417:1: ( rule__Node_Impl__Group__12__Impl rule__Node_Impl__Group__13 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2418:2: rule__Node_Impl__Group__12__Impl rule__Node_Impl__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__12__Impl_in_rule__Node_Impl__Group__124828);
            rule__Node_Impl__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__13_in_rule__Node_Impl__Group__124831);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2425:1: rule__Node_Impl__Group__12__Impl : ( ( rule__Node_Impl__Group_12__0 )* ) ;
    public final void rule__Node_Impl__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2429:1: ( ( ( rule__Node_Impl__Group_12__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2430:1: ( ( rule__Node_Impl__Group_12__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2430:1: ( ( rule__Node_Impl__Group_12__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2431:1: ( rule__Node_Impl__Group_12__0 )*
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_12()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2432:1: ( rule__Node_Impl__Group_12__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2432:2: rule__Node_Impl__Group_12__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_12__0_in_rule__Node_Impl__Group__12__Impl4858);
            	    rule__Node_Impl__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getNode_ImplAccess().getGroup_12()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2442:1: rule__Node_Impl__Group__13 : rule__Node_Impl__Group__13__Impl rule__Node_Impl__Group__14 ;
    public final void rule__Node_Impl__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2446:1: ( rule__Node_Impl__Group__13__Impl rule__Node_Impl__Group__14 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2447:2: rule__Node_Impl__Group__13__Impl rule__Node_Impl__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__13__Impl_in_rule__Node_Impl__Group__134889);
            rule__Node_Impl__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__14_in_rule__Node_Impl__Group__134892);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2454:1: rule__Node_Impl__Group__13__Impl : ( ')' ) ;
    public final void rule__Node_Impl__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2458:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2459:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2459:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2460:1: ')'
            {
             before(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_13()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Node_Impl__Group__13__Impl4920); 
             after(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_13()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2473:1: rule__Node_Impl__Group__14 : rule__Node_Impl__Group__14__Impl rule__Node_Impl__Group__15 ;
    public final void rule__Node_Impl__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2477:1: ( rule__Node_Impl__Group__14__Impl rule__Node_Impl__Group__15 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2478:2: rule__Node_Impl__Group__14__Impl rule__Node_Impl__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__14__Impl_in_rule__Node_Impl__Group__144951);
            rule__Node_Impl__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__15_in_rule__Node_Impl__Group__144954);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2485:1: rule__Node_Impl__Group__14__Impl : ( ( rule__Node_Impl__Group_14__0 )? ) ;
    public final void rule__Node_Impl__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2489:1: ( ( ( rule__Node_Impl__Group_14__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2490:1: ( ( rule__Node_Impl__Group_14__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2490:1: ( ( rule__Node_Impl__Group_14__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2491:1: ( rule__Node_Impl__Group_14__0 )?
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_14()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2492:1: ( rule__Node_Impl__Group_14__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2492:2: rule__Node_Impl__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__0_in_rule__Node_Impl__Group__14__Impl4981);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2502:1: rule__Node_Impl__Group__15 : rule__Node_Impl__Group__15__Impl rule__Node_Impl__Group__16 ;
    public final void rule__Node_Impl__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2506:1: ( rule__Node_Impl__Group__15__Impl rule__Node_Impl__Group__16 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2507:2: rule__Node_Impl__Group__15__Impl rule__Node_Impl__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__15__Impl_in_rule__Node_Impl__Group__155012);
            rule__Node_Impl__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__16_in_rule__Node_Impl__Group__155015);
            rule__Node_Impl__Group__16();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2514:1: rule__Node_Impl__Group__15__Impl : ( ( rule__Node_Impl__Group_15__0 )? ) ;
    public final void rule__Node_Impl__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2518:1: ( ( ( rule__Node_Impl__Group_15__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2519:1: ( ( rule__Node_Impl__Group_15__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2519:1: ( ( rule__Node_Impl__Group_15__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2520:1: ( rule__Node_Impl__Group_15__0 )?
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_15()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2521:1: ( rule__Node_Impl__Group_15__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2521:2: rule__Node_Impl__Group_15__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__0_in_rule__Node_Impl__Group__15__Impl5042);
                    rule__Node_Impl__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNode_ImplAccess().getGroup_15()); 

            }


            }

        }
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


    // $ANTLR start "rule__Node_Impl__Group__16"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2531:1: rule__Node_Impl__Group__16 : rule__Node_Impl__Group__16__Impl ;
    public final void rule__Node_Impl__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2535:1: ( rule__Node_Impl__Group__16__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2536:2: rule__Node_Impl__Group__16__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__16__Impl_in_rule__Node_Impl__Group__165073);
            rule__Node_Impl__Group__16__Impl();

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
    // $ANTLR end "rule__Node_Impl__Group__16"


    // $ANTLR start "rule__Node_Impl__Group__16__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2542:1: rule__Node_Impl__Group__16__Impl : ( '}' ) ;
    public final void rule__Node_Impl__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2546:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2547:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2547:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2548:1: '}'
            {
             before(grammarAccess.getNode_ImplAccess().getRightCurlyBracketKeyword_16()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Node_Impl__Group__16__Impl5101); 
             after(grammarAccess.getNode_ImplAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__16__Impl"


    // $ANTLR start "rule__Node_Impl__Group_7__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2595:1: rule__Node_Impl__Group_7__0 : rule__Node_Impl__Group_7__0__Impl rule__Node_Impl__Group_7__1 ;
    public final void rule__Node_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2599:1: ( rule__Node_Impl__Group_7__0__Impl rule__Node_Impl__Group_7__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2600:2: rule__Node_Impl__Group_7__0__Impl rule__Node_Impl__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_7__0__Impl_in_rule__Node_Impl__Group_7__05166);
            rule__Node_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_7__1_in_rule__Node_Impl__Group_7__05169);
            rule__Node_Impl__Group_7__1();

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
    // $ANTLR end "rule__Node_Impl__Group_7__0"


    // $ANTLR start "rule__Node_Impl__Group_7__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2607:1: rule__Node_Impl__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Node_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2611:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2612:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2612:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2613:1: ','
            {
             before(grammarAccess.getNode_ImplAccess().getCommaKeyword_7_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Node_Impl__Group_7__0__Impl5197); 
             after(grammarAccess.getNode_ImplAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_7__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2626:1: rule__Node_Impl__Group_7__1 : rule__Node_Impl__Group_7__1__Impl ;
    public final void rule__Node_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2630:1: ( rule__Node_Impl__Group_7__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2631:2: rule__Node_Impl__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_7__1__Impl_in_rule__Node_Impl__Group_7__15228);
            rule__Node_Impl__Group_7__1__Impl();

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
    // $ANTLR end "rule__Node_Impl__Group_7__1"


    // $ANTLR start "rule__Node_Impl__Group_7__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2637:1: rule__Node_Impl__Group_7__1__Impl : ( ( rule__Node_Impl__HasStartsAssignment_7_1 ) ) ;
    public final void rule__Node_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2641:1: ( ( ( rule__Node_Impl__HasStartsAssignment_7_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2642:1: ( ( rule__Node_Impl__HasStartsAssignment_7_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2642:1: ( ( rule__Node_Impl__HasStartsAssignment_7_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2643:1: ( rule__Node_Impl__HasStartsAssignment_7_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsAssignment_7_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2644:1: ( rule__Node_Impl__HasStartsAssignment_7_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2644:2: rule__Node_Impl__HasStartsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__HasStartsAssignment_7_1_in_rule__Node_Impl__Group_7__1__Impl5255);
            rule__Node_Impl__HasStartsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getHasStartsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group_12__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2658:1: rule__Node_Impl__Group_12__0 : rule__Node_Impl__Group_12__0__Impl rule__Node_Impl__Group_12__1 ;
    public final void rule__Node_Impl__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2662:1: ( rule__Node_Impl__Group_12__0__Impl rule__Node_Impl__Group_12__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2663:2: rule__Node_Impl__Group_12__0__Impl rule__Node_Impl__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_12__0__Impl_in_rule__Node_Impl__Group_12__05289);
            rule__Node_Impl__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_12__1_in_rule__Node_Impl__Group_12__05292);
            rule__Node_Impl__Group_12__1();

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
    // $ANTLR end "rule__Node_Impl__Group_12__0"


    // $ANTLR start "rule__Node_Impl__Group_12__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2670:1: rule__Node_Impl__Group_12__0__Impl : ( ',' ) ;
    public final void rule__Node_Impl__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2674:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2675:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2675:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2676:1: ','
            {
             before(grammarAccess.getNode_ImplAccess().getCommaKeyword_12_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Node_Impl__Group_12__0__Impl5320); 
             after(grammarAccess.getNode_ImplAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_12__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_12__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2689:1: rule__Node_Impl__Group_12__1 : rule__Node_Impl__Group_12__1__Impl ;
    public final void rule__Node_Impl__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2693:1: ( rule__Node_Impl__Group_12__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2694:2: rule__Node_Impl__Group_12__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_12__1__Impl_in_rule__Node_Impl__Group_12__15351);
            rule__Node_Impl__Group_12__1__Impl();

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
    // $ANTLR end "rule__Node_Impl__Group_12__1"


    // $ANTLR start "rule__Node_Impl__Group_12__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2700:1: rule__Node_Impl__Group_12__1__Impl : ( ( rule__Node_Impl__HasEndsAssignment_12_1 ) ) ;
    public final void rule__Node_Impl__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2704:1: ( ( ( rule__Node_Impl__HasEndsAssignment_12_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2705:1: ( ( rule__Node_Impl__HasEndsAssignment_12_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2705:1: ( ( rule__Node_Impl__HasEndsAssignment_12_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2706:1: ( rule__Node_Impl__HasEndsAssignment_12_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsAssignment_12_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2707:1: ( rule__Node_Impl__HasEndsAssignment_12_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2707:2: rule__Node_Impl__HasEndsAssignment_12_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__HasEndsAssignment_12_1_in_rule__Node_Impl__Group_12__1__Impl5378);
            rule__Node_Impl__HasEndsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getHasEndsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_12__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group_14__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2721:1: rule__Node_Impl__Group_14__0 : rule__Node_Impl__Group_14__0__Impl rule__Node_Impl__Group_14__1 ;
    public final void rule__Node_Impl__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2725:1: ( rule__Node_Impl__Group_14__0__Impl rule__Node_Impl__Group_14__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2726:2: rule__Node_Impl__Group_14__0__Impl rule__Node_Impl__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__0__Impl_in_rule__Node_Impl__Group_14__05412);
            rule__Node_Impl__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__1_in_rule__Node_Impl__Group_14__05415);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2733:1: rule__Node_Impl__Group_14__0__Impl : ( 'semaphore' ) ;
    public final void rule__Node_Impl__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2737:1: ( ( 'semaphore' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2738:1: ( 'semaphore' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2738:1: ( 'semaphore' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2739:1: 'semaphore'
            {
             before(grammarAccess.getNode_ImplAccess().getSemaphoreKeyword_14_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Node_Impl__Group_14__0__Impl5443); 
             after(grammarAccess.getNode_ImplAccess().getSemaphoreKeyword_14_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2752:1: rule__Node_Impl__Group_14__1 : rule__Node_Impl__Group_14__1__Impl ;
    public final void rule__Node_Impl__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2756:1: ( rule__Node_Impl__Group_14__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2757:2: rule__Node_Impl__Group_14__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__1__Impl_in_rule__Node_Impl__Group_14__15474);
            rule__Node_Impl__Group_14__1__Impl();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2763:1: rule__Node_Impl__Group_14__1__Impl : ( ( rule__Node_Impl__SemaphoreAssignment_14_1 ) ) ;
    public final void rule__Node_Impl__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2767:1: ( ( ( rule__Node_Impl__SemaphoreAssignment_14_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2768:1: ( ( rule__Node_Impl__SemaphoreAssignment_14_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2768:1: ( ( rule__Node_Impl__SemaphoreAssignment_14_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2769:1: ( rule__Node_Impl__SemaphoreAssignment_14_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getSemaphoreAssignment_14_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2770:1: ( rule__Node_Impl__SemaphoreAssignment_14_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2770:2: rule__Node_Impl__SemaphoreAssignment_14_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__SemaphoreAssignment_14_1_in_rule__Node_Impl__Group_14__1__Impl5501);
            rule__Node_Impl__SemaphoreAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getSemaphoreAssignment_14_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Node_Impl__Group_15__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2784:1: rule__Node_Impl__Group_15__0 : rule__Node_Impl__Group_15__0__Impl rule__Node_Impl__Group_15__1 ;
    public final void rule__Node_Impl__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2788:1: ( rule__Node_Impl__Group_15__0__Impl rule__Node_Impl__Group_15__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2789:2: rule__Node_Impl__Group_15__0__Impl rule__Node_Impl__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__0__Impl_in_rule__Node_Impl__Group_15__05535);
            rule__Node_Impl__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__1_in_rule__Node_Impl__Group_15__05538);
            rule__Node_Impl__Group_15__1();

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
    // $ANTLR end "rule__Node_Impl__Group_15__0"


    // $ANTLR start "rule__Node_Impl__Group_15__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2796:1: rule__Node_Impl__Group_15__0__Impl : ( 'signals' ) ;
    public final void rule__Node_Impl__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2800:1: ( ( 'signals' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2801:1: ( 'signals' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2801:1: ( 'signals' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2802:1: 'signals'
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsKeyword_15_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Node_Impl__Group_15__0__Impl5566); 
             after(grammarAccess.getNode_ImplAccess().getSignalsKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_15__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_15__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2815:1: rule__Node_Impl__Group_15__1 : rule__Node_Impl__Group_15__1__Impl rule__Node_Impl__Group_15__2 ;
    public final void rule__Node_Impl__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2819:1: ( rule__Node_Impl__Group_15__1__Impl rule__Node_Impl__Group_15__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2820:2: rule__Node_Impl__Group_15__1__Impl rule__Node_Impl__Group_15__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__1__Impl_in_rule__Node_Impl__Group_15__15597);
            rule__Node_Impl__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__2_in_rule__Node_Impl__Group_15__15600);
            rule__Node_Impl__Group_15__2();

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
    // $ANTLR end "rule__Node_Impl__Group_15__1"


    // $ANTLR start "rule__Node_Impl__Group_15__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2827:1: rule__Node_Impl__Group_15__1__Impl : ( '(' ) ;
    public final void rule__Node_Impl__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2831:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2832:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2832:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2833:1: '('
            {
             before(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_15_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Node_Impl__Group_15__1__Impl5628); 
             after(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_15__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group_15__2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2846:1: rule__Node_Impl__Group_15__2 : rule__Node_Impl__Group_15__2__Impl rule__Node_Impl__Group_15__3 ;
    public final void rule__Node_Impl__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2850:1: ( rule__Node_Impl__Group_15__2__Impl rule__Node_Impl__Group_15__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2851:2: rule__Node_Impl__Group_15__2__Impl rule__Node_Impl__Group_15__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__2__Impl_in_rule__Node_Impl__Group_15__25659);
            rule__Node_Impl__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__3_in_rule__Node_Impl__Group_15__25662);
            rule__Node_Impl__Group_15__3();

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
    // $ANTLR end "rule__Node_Impl__Group_15__2"


    // $ANTLR start "rule__Node_Impl__Group_15__2__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2858:1: rule__Node_Impl__Group_15__2__Impl : ( ( rule__Node_Impl__SignalsAssignment_15_2 ) ) ;
    public final void rule__Node_Impl__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2862:1: ( ( ( rule__Node_Impl__SignalsAssignment_15_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2863:1: ( ( rule__Node_Impl__SignalsAssignment_15_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2863:1: ( ( rule__Node_Impl__SignalsAssignment_15_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2864:1: ( rule__Node_Impl__SignalsAssignment_15_2 )
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsAssignment_15_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2865:1: ( rule__Node_Impl__SignalsAssignment_15_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2865:2: rule__Node_Impl__SignalsAssignment_15_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__SignalsAssignment_15_2_in_rule__Node_Impl__Group_15__2__Impl5689);
            rule__Node_Impl__SignalsAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getSignalsAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_15__2__Impl"


    // $ANTLR start "rule__Node_Impl__Group_15__3"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2875:1: rule__Node_Impl__Group_15__3 : rule__Node_Impl__Group_15__3__Impl rule__Node_Impl__Group_15__4 ;
    public final void rule__Node_Impl__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2879:1: ( rule__Node_Impl__Group_15__3__Impl rule__Node_Impl__Group_15__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2880:2: rule__Node_Impl__Group_15__3__Impl rule__Node_Impl__Group_15__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__3__Impl_in_rule__Node_Impl__Group_15__35719);
            rule__Node_Impl__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__4_in_rule__Node_Impl__Group_15__35722);
            rule__Node_Impl__Group_15__4();

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
    // $ANTLR end "rule__Node_Impl__Group_15__3"


    // $ANTLR start "rule__Node_Impl__Group_15__3__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2887:1: rule__Node_Impl__Group_15__3__Impl : ( ( rule__Node_Impl__Group_15_3__0 )* ) ;
    public final void rule__Node_Impl__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2891:1: ( ( ( rule__Node_Impl__Group_15_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2892:1: ( ( rule__Node_Impl__Group_15_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2892:1: ( ( rule__Node_Impl__Group_15_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2893:1: ( rule__Node_Impl__Group_15_3__0 )*
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_15_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2894:1: ( rule__Node_Impl__Group_15_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2894:2: rule__Node_Impl__Group_15_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15_3__0_in_rule__Node_Impl__Group_15__3__Impl5749);
            	    rule__Node_Impl__Group_15_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getNode_ImplAccess().getGroup_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_15__3__Impl"


    // $ANTLR start "rule__Node_Impl__Group_15__4"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2904:1: rule__Node_Impl__Group_15__4 : rule__Node_Impl__Group_15__4__Impl ;
    public final void rule__Node_Impl__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2908:1: ( rule__Node_Impl__Group_15__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2909:2: rule__Node_Impl__Group_15__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__4__Impl_in_rule__Node_Impl__Group_15__45780);
            rule__Node_Impl__Group_15__4__Impl();

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
    // $ANTLR end "rule__Node_Impl__Group_15__4"


    // $ANTLR start "rule__Node_Impl__Group_15__4__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2915:1: rule__Node_Impl__Group_15__4__Impl : ( ')' ) ;
    public final void rule__Node_Impl__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2919:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2920:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2920:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2921:1: ')'
            {
             before(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_15_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Node_Impl__Group_15__4__Impl5808); 
             after(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_15__4__Impl"


    // $ANTLR start "rule__Node_Impl__Group_15_3__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2944:1: rule__Node_Impl__Group_15_3__0 : rule__Node_Impl__Group_15_3__0__Impl rule__Node_Impl__Group_15_3__1 ;
    public final void rule__Node_Impl__Group_15_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2948:1: ( rule__Node_Impl__Group_15_3__0__Impl rule__Node_Impl__Group_15_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2949:2: rule__Node_Impl__Group_15_3__0__Impl rule__Node_Impl__Group_15_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15_3__0__Impl_in_rule__Node_Impl__Group_15_3__05849);
            rule__Node_Impl__Group_15_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15_3__1_in_rule__Node_Impl__Group_15_3__05852);
            rule__Node_Impl__Group_15_3__1();

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
    // $ANTLR end "rule__Node_Impl__Group_15_3__0"


    // $ANTLR start "rule__Node_Impl__Group_15_3__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2956:1: rule__Node_Impl__Group_15_3__0__Impl : ( ',' ) ;
    public final void rule__Node_Impl__Group_15_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2960:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2961:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2961:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2962:1: ','
            {
             before(grammarAccess.getNode_ImplAccess().getCommaKeyword_15_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Node_Impl__Group_15_3__0__Impl5880); 
             after(grammarAccess.getNode_ImplAccess().getCommaKeyword_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_15_3__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_15_3__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2975:1: rule__Node_Impl__Group_15_3__1 : rule__Node_Impl__Group_15_3__1__Impl ;
    public final void rule__Node_Impl__Group_15_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2979:1: ( rule__Node_Impl__Group_15_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2980:2: rule__Node_Impl__Group_15_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15_3__1__Impl_in_rule__Node_Impl__Group_15_3__15911);
            rule__Node_Impl__Group_15_3__1__Impl();

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
    // $ANTLR end "rule__Node_Impl__Group_15_3__1"


    // $ANTLR start "rule__Node_Impl__Group_15_3__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2986:1: rule__Node_Impl__Group_15_3__1__Impl : ( ( rule__Node_Impl__SignalsAssignment_15_3_1 ) ) ;
    public final void rule__Node_Impl__Group_15_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2990:1: ( ( ( rule__Node_Impl__SignalsAssignment_15_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2991:1: ( ( rule__Node_Impl__SignalsAssignment_15_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2991:1: ( ( rule__Node_Impl__SignalsAssignment_15_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2992:1: ( rule__Node_Impl__SignalsAssignment_15_3_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsAssignment_15_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2993:1: ( rule__Node_Impl__SignalsAssignment_15_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2993:2: rule__Node_Impl__SignalsAssignment_15_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__SignalsAssignment_15_3_1_in_rule__Node_Impl__Group_15_3__1__Impl5938);
            rule__Node_Impl__SignalsAssignment_15_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getSignalsAssignment_15_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_15_3__1__Impl"


    // $ANTLR start "rule__Car__Group__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3007:1: rule__Car__Group__0 : rule__Car__Group__0__Impl rule__Car__Group__1 ;
    public final void rule__Car__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3011:1: ( rule__Car__Group__0__Impl rule__Car__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3012:2: rule__Car__Group__0__Impl rule__Car__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__0__Impl_in_rule__Car__Group__05972);
            rule__Car__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__1_in_rule__Car__Group__05975);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3019:1: rule__Car__Group__0__Impl : ( () ) ;
    public final void rule__Car__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3023:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3024:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3024:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3025:1: ()
            {
             before(grammarAccess.getCarAccess().getCarAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3026:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3028:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3038:1: rule__Car__Group__1 : rule__Car__Group__1__Impl rule__Car__Group__2 ;
    public final void rule__Car__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3042:1: ( rule__Car__Group__1__Impl rule__Car__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3043:2: rule__Car__Group__1__Impl rule__Car__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__1__Impl_in_rule__Car__Group__16033);
            rule__Car__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__2_in_rule__Car__Group__16036);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3050:1: rule__Car__Group__1__Impl : ( 'Car' ) ;
    public final void rule__Car__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3054:1: ( ( 'Car' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3055:1: ( 'Car' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3055:1: ( 'Car' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3056:1: 'Car'
            {
             before(grammarAccess.getCarAccess().getCarKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Car__Group__1__Impl6064); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3069:1: rule__Car__Group__2 : rule__Car__Group__2__Impl rule__Car__Group__3 ;
    public final void rule__Car__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3073:1: ( rule__Car__Group__2__Impl rule__Car__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3074:2: rule__Car__Group__2__Impl rule__Car__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__2__Impl_in_rule__Car__Group__26095);
            rule__Car__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__3_in_rule__Car__Group__26098);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3081:1: rule__Car__Group__2__Impl : ( ( rule__Car__NameAssignment_2 ) ) ;
    public final void rule__Car__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3085:1: ( ( ( rule__Car__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3086:1: ( ( rule__Car__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3086:1: ( ( rule__Car__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3087:1: ( rule__Car__NameAssignment_2 )
            {
             before(grammarAccess.getCarAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3088:1: ( rule__Car__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3088:2: rule__Car__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__NameAssignment_2_in_rule__Car__Group__2__Impl6125);
            rule__Car__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3098:1: rule__Car__Group__3 : rule__Car__Group__3__Impl rule__Car__Group__4 ;
    public final void rule__Car__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3102:1: ( rule__Car__Group__3__Impl rule__Car__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3103:2: rule__Car__Group__3__Impl rule__Car__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__3__Impl_in_rule__Car__Group__36155);
            rule__Car__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__4_in_rule__Car__Group__36158);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3110:1: rule__Car__Group__3__Impl : ( '{' ) ;
    public final void rule__Car__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3114:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3115:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3115:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3116:1: '{'
            {
             before(grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Car__Group__3__Impl6186); 
             after(grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3129:1: rule__Car__Group__4 : rule__Car__Group__4__Impl rule__Car__Group__5 ;
    public final void rule__Car__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3133:1: ( rule__Car__Group__4__Impl rule__Car__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3134:2: rule__Car__Group__4__Impl rule__Car__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__4__Impl_in_rule__Car__Group__46217);
            rule__Car__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__5_in_rule__Car__Group__46220);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3141:1: rule__Car__Group__4__Impl : ( ( rule__Car__Group_4__0 )? ) ;
    public final void rule__Car__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3145:1: ( ( ( rule__Car__Group_4__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3146:1: ( ( rule__Car__Group_4__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3146:1: ( ( rule__Car__Group_4__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3147:1: ( rule__Car__Group_4__0 )?
            {
             before(grammarAccess.getCarAccess().getGroup_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3148:1: ( rule__Car__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3148:2: rule__Car__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Car__Group_4__0_in_rule__Car__Group__4__Impl6247);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3158:1: rule__Car__Group__5 : rule__Car__Group__5__Impl rule__Car__Group__6 ;
    public final void rule__Car__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3162:1: ( rule__Car__Group__5__Impl rule__Car__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3163:2: rule__Car__Group__5__Impl rule__Car__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__5__Impl_in_rule__Car__Group__56278);
            rule__Car__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__6_in_rule__Car__Group__56281);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3170:1: rule__Car__Group__5__Impl : ( ( rule__Car__Group_5__0 )? ) ;
    public final void rule__Car__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3174:1: ( ( ( rule__Car__Group_5__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3175:1: ( ( rule__Car__Group_5__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3175:1: ( ( rule__Car__Group_5__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3176:1: ( rule__Car__Group_5__0 )?
            {
             before(grammarAccess.getCarAccess().getGroup_5()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3177:1: ( rule__Car__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3177:2: rule__Car__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Car__Group_5__0_in_rule__Car__Group__5__Impl6308);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3187:1: rule__Car__Group__6 : rule__Car__Group__6__Impl rule__Car__Group__7 ;
    public final void rule__Car__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3191:1: ( rule__Car__Group__6__Impl rule__Car__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3192:2: rule__Car__Group__6__Impl rule__Car__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__6__Impl_in_rule__Car__Group__66339);
            rule__Car__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__7_in_rule__Car__Group__66342);
            rule__Car__Group__7();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3199:1: rule__Car__Group__6__Impl : ( ( rule__Car__Group_6__0 )? ) ;
    public final void rule__Car__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3203:1: ( ( ( rule__Car__Group_6__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3204:1: ( ( rule__Car__Group_6__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3204:1: ( ( rule__Car__Group_6__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3205:1: ( rule__Car__Group_6__0 )?
            {
             before(grammarAccess.getCarAccess().getGroup_6()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3206:1: ( rule__Car__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3206:2: rule__Car__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Car__Group_6__0_in_rule__Car__Group__6__Impl6369);
                    rule__Car__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCarAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Car__Group__7"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3216:1: rule__Car__Group__7 : rule__Car__Group__7__Impl ;
    public final void rule__Car__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3220:1: ( rule__Car__Group__7__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3221:2: rule__Car__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__7__Impl_in_rule__Car__Group__76400);
            rule__Car__Group__7__Impl();

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
    // $ANTLR end "rule__Car__Group__7"


    // $ANTLR start "rule__Car__Group__7__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3227:1: rule__Car__Group__7__Impl : ( '}' ) ;
    public final void rule__Car__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3231:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3232:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3232:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3233:1: '}'
            {
             before(grammarAccess.getCarAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Car__Group__7__Impl6428); 
             after(grammarAccess.getCarAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__7__Impl"


    // $ANTLR start "rule__Car__Group_4__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3262:1: rule__Car__Group_4__0 : rule__Car__Group_4__0__Impl rule__Car__Group_4__1 ;
    public final void rule__Car__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3266:1: ( rule__Car__Group_4__0__Impl rule__Car__Group_4__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3267:2: rule__Car__Group_4__0__Impl rule__Car__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_4__0__Impl_in_rule__Car__Group_4__06475);
            rule__Car__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_4__1_in_rule__Car__Group_4__06478);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3274:1: rule__Car__Group_4__0__Impl : ( 'timeIn' ) ;
    public final void rule__Car__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3278:1: ( ( 'timeIn' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3279:1: ( 'timeIn' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3279:1: ( 'timeIn' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3280:1: 'timeIn'
            {
             before(grammarAccess.getCarAccess().getTimeInKeyword_4_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Car__Group_4__0__Impl6506); 
             after(grammarAccess.getCarAccess().getTimeInKeyword_4_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3293:1: rule__Car__Group_4__1 : rule__Car__Group_4__1__Impl ;
    public final void rule__Car__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3297:1: ( rule__Car__Group_4__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3298:2: rule__Car__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_4__1__Impl_in_rule__Car__Group_4__16537);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3304:1: rule__Car__Group_4__1__Impl : ( ( rule__Car__TimeInAssignment_4_1 ) ) ;
    public final void rule__Car__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3308:1: ( ( ( rule__Car__TimeInAssignment_4_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3309:1: ( ( rule__Car__TimeInAssignment_4_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3309:1: ( ( rule__Car__TimeInAssignment_4_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3310:1: ( rule__Car__TimeInAssignment_4_1 )
            {
             before(grammarAccess.getCarAccess().getTimeInAssignment_4_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3311:1: ( rule__Car__TimeInAssignment_4_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3311:2: rule__Car__TimeInAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__TimeInAssignment_4_1_in_rule__Car__Group_4__1__Impl6564);
            rule__Car__TimeInAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getTimeInAssignment_4_1()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3325:1: rule__Car__Group_5__0 : rule__Car__Group_5__0__Impl rule__Car__Group_5__1 ;
    public final void rule__Car__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3329:1: ( rule__Car__Group_5__0__Impl rule__Car__Group_5__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3330:2: rule__Car__Group_5__0__Impl rule__Car__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_5__0__Impl_in_rule__Car__Group_5__06598);
            rule__Car__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_5__1_in_rule__Car__Group_5__06601);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3337:1: rule__Car__Group_5__0__Impl : ( 'timeOut' ) ;
    public final void rule__Car__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3341:1: ( ( 'timeOut' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3342:1: ( 'timeOut' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3342:1: ( 'timeOut' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3343:1: 'timeOut'
            {
             before(grammarAccess.getCarAccess().getTimeOutKeyword_5_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Car__Group_5__0__Impl6629); 
             after(grammarAccess.getCarAccess().getTimeOutKeyword_5_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3356:1: rule__Car__Group_5__1 : rule__Car__Group_5__1__Impl ;
    public final void rule__Car__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3360:1: ( rule__Car__Group_5__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3361:2: rule__Car__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_5__1__Impl_in_rule__Car__Group_5__16660);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3367:1: rule__Car__Group_5__1__Impl : ( ( rule__Car__TimeOutAssignment_5_1 ) ) ;
    public final void rule__Car__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3371:1: ( ( ( rule__Car__TimeOutAssignment_5_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3372:1: ( ( rule__Car__TimeOutAssignment_5_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3372:1: ( ( rule__Car__TimeOutAssignment_5_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3373:1: ( rule__Car__TimeOutAssignment_5_1 )
            {
             before(grammarAccess.getCarAccess().getTimeOutAssignment_5_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3374:1: ( rule__Car__TimeOutAssignment_5_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3374:2: rule__Car__TimeOutAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__TimeOutAssignment_5_1_in_rule__Car__Group_5__1__Impl6687);
            rule__Car__TimeOutAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getTimeOutAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Car__Group_6__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3388:1: rule__Car__Group_6__0 : rule__Car__Group_6__0__Impl rule__Car__Group_6__1 ;
    public final void rule__Car__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3392:1: ( rule__Car__Group_6__0__Impl rule__Car__Group_6__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3393:2: rule__Car__Group_6__0__Impl rule__Car__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_6__0__Impl_in_rule__Car__Group_6__06721);
            rule__Car__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_6__1_in_rule__Car__Group_6__06724);
            rule__Car__Group_6__1();

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
    // $ANTLR end "rule__Car__Group_6__0"


    // $ANTLR start "rule__Car__Group_6__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3400:1: rule__Car__Group_6__0__Impl : ( 'isInSegment' ) ;
    public final void rule__Car__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3404:1: ( ( 'isInSegment' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3405:1: ( 'isInSegment' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3405:1: ( 'isInSegment' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3406:1: 'isInSegment'
            {
             before(grammarAccess.getCarAccess().getIsInSegmentKeyword_6_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Car__Group_6__0__Impl6752); 
             after(grammarAccess.getCarAccess().getIsInSegmentKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_6__0__Impl"


    // $ANTLR start "rule__Car__Group_6__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3419:1: rule__Car__Group_6__1 : rule__Car__Group_6__1__Impl ;
    public final void rule__Car__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3423:1: ( rule__Car__Group_6__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3424:2: rule__Car__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_6__1__Impl_in_rule__Car__Group_6__16783);
            rule__Car__Group_6__1__Impl();

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
    // $ANTLR end "rule__Car__Group_6__1"


    // $ANTLR start "rule__Car__Group_6__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3430:1: rule__Car__Group_6__1__Impl : ( ( rule__Car__IsInSegmentAssignment_6_1 ) ) ;
    public final void rule__Car__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3434:1: ( ( ( rule__Car__IsInSegmentAssignment_6_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3435:1: ( ( rule__Car__IsInSegmentAssignment_6_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3435:1: ( ( rule__Car__IsInSegmentAssignment_6_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3436:1: ( rule__Car__IsInSegmentAssignment_6_1 )
            {
             before(grammarAccess.getCarAccess().getIsInSegmentAssignment_6_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3437:1: ( rule__Car__IsInSegmentAssignment_6_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3437:2: rule__Car__IsInSegmentAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__IsInSegmentAssignment_6_1_in_rule__Car__Group_6__1__Impl6810);
            rule__Car__IsInSegmentAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getIsInSegmentAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group_6__1__Impl"


    // $ANTLR start "rule__Segment__Group__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3451:1: rule__Segment__Group__0 : rule__Segment__Group__0__Impl rule__Segment__Group__1 ;
    public final void rule__Segment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3455:1: ( rule__Segment__Group__0__Impl rule__Segment__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3456:2: rule__Segment__Group__0__Impl rule__Segment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__0__Impl_in_rule__Segment__Group__06844);
            rule__Segment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__1_in_rule__Segment__Group__06847);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3463:1: rule__Segment__Group__0__Impl : ( () ) ;
    public final void rule__Segment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3467:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3468:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3468:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3469:1: ()
            {
             before(grammarAccess.getSegmentAccess().getSegmentAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3470:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3472:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3482:1: rule__Segment__Group__1 : rule__Segment__Group__1__Impl rule__Segment__Group__2 ;
    public final void rule__Segment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3486:1: ( rule__Segment__Group__1__Impl rule__Segment__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3487:2: rule__Segment__Group__1__Impl rule__Segment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__1__Impl_in_rule__Segment__Group__16905);
            rule__Segment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__2_in_rule__Segment__Group__16908);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3494:1: rule__Segment__Group__1__Impl : ( 'Segment' ) ;
    public final void rule__Segment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3498:1: ( ( 'Segment' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3499:1: ( 'Segment' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3499:1: ( 'Segment' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3500:1: 'Segment'
            {
             before(grammarAccess.getSegmentAccess().getSegmentKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Segment__Group__1__Impl6936); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3513:1: rule__Segment__Group__2 : rule__Segment__Group__2__Impl rule__Segment__Group__3 ;
    public final void rule__Segment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3517:1: ( rule__Segment__Group__2__Impl rule__Segment__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3518:2: rule__Segment__Group__2__Impl rule__Segment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__2__Impl_in_rule__Segment__Group__26967);
            rule__Segment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__3_in_rule__Segment__Group__26970);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3525:1: rule__Segment__Group__2__Impl : ( ( rule__Segment__NameAssignment_2 ) ) ;
    public final void rule__Segment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3529:1: ( ( ( rule__Segment__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3530:1: ( ( rule__Segment__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3530:1: ( ( rule__Segment__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3531:1: ( rule__Segment__NameAssignment_2 )
            {
             before(grammarAccess.getSegmentAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3532:1: ( rule__Segment__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3532:2: rule__Segment__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__NameAssignment_2_in_rule__Segment__Group__2__Impl6997);
            rule__Segment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3542:1: rule__Segment__Group__3 : rule__Segment__Group__3__Impl rule__Segment__Group__4 ;
    public final void rule__Segment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3546:1: ( rule__Segment__Group__3__Impl rule__Segment__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3547:2: rule__Segment__Group__3__Impl rule__Segment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__3__Impl_in_rule__Segment__Group__37027);
            rule__Segment__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__4_in_rule__Segment__Group__37030);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3554:1: rule__Segment__Group__3__Impl : ( '{' ) ;
    public final void rule__Segment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3558:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3559:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3559:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3560:1: '{'
            {
             before(grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Segment__Group__3__Impl7058); 
             after(grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3573:1: rule__Segment__Group__4 : rule__Segment__Group__4__Impl rule__Segment__Group__5 ;
    public final void rule__Segment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3577:1: ( rule__Segment__Group__4__Impl rule__Segment__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3578:2: rule__Segment__Group__4__Impl rule__Segment__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__4__Impl_in_rule__Segment__Group__47089);
            rule__Segment__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__5_in_rule__Segment__Group__47092);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3585:1: rule__Segment__Group__4__Impl : ( ( rule__Segment__Group_4__0 )? ) ;
    public final void rule__Segment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3589:1: ( ( ( rule__Segment__Group_4__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3590:1: ( ( rule__Segment__Group_4__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3590:1: ( ( rule__Segment__Group_4__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3591:1: ( rule__Segment__Group_4__0 )?
            {
             before(grammarAccess.getSegmentAccess().getGroup_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3592:1: ( rule__Segment__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3592:2: rule__Segment__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_4__0_in_rule__Segment__Group__4__Impl7119);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3602:1: rule__Segment__Group__5 : rule__Segment__Group__5__Impl rule__Segment__Group__6 ;
    public final void rule__Segment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3606:1: ( rule__Segment__Group__5__Impl rule__Segment__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3607:2: rule__Segment__Group__5__Impl rule__Segment__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__5__Impl_in_rule__Segment__Group__57150);
            rule__Segment__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__6_in_rule__Segment__Group__57153);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3614:1: rule__Segment__Group__5__Impl : ( ( rule__Segment__Group_5__0 )? ) ;
    public final void rule__Segment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3618:1: ( ( ( rule__Segment__Group_5__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3619:1: ( ( rule__Segment__Group_5__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3619:1: ( ( rule__Segment__Group_5__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3620:1: ( rule__Segment__Group_5__0 )?
            {
             before(grammarAccess.getSegmentAccess().getGroup_5()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3621:1: ( rule__Segment__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3621:2: rule__Segment__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__0_in_rule__Segment__Group__5__Impl7180);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3631:1: rule__Segment__Group__6 : rule__Segment__Group__6__Impl rule__Segment__Group__7 ;
    public final void rule__Segment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3635:1: ( rule__Segment__Group__6__Impl rule__Segment__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3636:2: rule__Segment__Group__6__Impl rule__Segment__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__6__Impl_in_rule__Segment__Group__67211);
            rule__Segment__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__7_in_rule__Segment__Group__67214);
            rule__Segment__Group__7();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3643:1: rule__Segment__Group__6__Impl : ( ( rule__Segment__Group_6__0 )? ) ;
    public final void rule__Segment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3647:1: ( ( ( rule__Segment__Group_6__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3648:1: ( ( rule__Segment__Group_6__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3648:1: ( ( rule__Segment__Group_6__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3649:1: ( rule__Segment__Group_6__0 )?
            {
             before(grammarAccess.getSegmentAccess().getGroup_6()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3650:1: ( rule__Segment__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3650:2: rule__Segment__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__0_in_rule__Segment__Group__6__Impl7241);
                    rule__Segment__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSegmentAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Segment__Group__7"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3660:1: rule__Segment__Group__7 : rule__Segment__Group__7__Impl ;
    public final void rule__Segment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3664:1: ( rule__Segment__Group__7__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3665:2: rule__Segment__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__7__Impl_in_rule__Segment__Group__77272);
            rule__Segment__Group__7__Impl();

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
    // $ANTLR end "rule__Segment__Group__7"


    // $ANTLR start "rule__Segment__Group__7__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3671:1: rule__Segment__Group__7__Impl : ( '}' ) ;
    public final void rule__Segment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3675:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3676:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3676:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3677:1: '}'
            {
             before(grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Segment__Group__7__Impl7300); 
             after(grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__7__Impl"


    // $ANTLR start "rule__Segment__Group_4__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3706:1: rule__Segment__Group_4__0 : rule__Segment__Group_4__0__Impl rule__Segment__Group_4__1 ;
    public final void rule__Segment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3710:1: ( rule__Segment__Group_4__0__Impl rule__Segment__Group_4__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3711:2: rule__Segment__Group_4__0__Impl rule__Segment__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_4__0__Impl_in_rule__Segment__Group_4__07347);
            rule__Segment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_4__1_in_rule__Segment__Group_4__07350);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3718:1: rule__Segment__Group_4__0__Impl : ( 'numLanes' ) ;
    public final void rule__Segment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3722:1: ( ( 'numLanes' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3723:1: ( 'numLanes' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3723:1: ( 'numLanes' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3724:1: 'numLanes'
            {
             before(grammarAccess.getSegmentAccess().getNumLanesKeyword_4_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Segment__Group_4__0__Impl7378); 
             after(grammarAccess.getSegmentAccess().getNumLanesKeyword_4_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3737:1: rule__Segment__Group_4__1 : rule__Segment__Group_4__1__Impl ;
    public final void rule__Segment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3741:1: ( rule__Segment__Group_4__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3742:2: rule__Segment__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_4__1__Impl_in_rule__Segment__Group_4__17409);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3748:1: rule__Segment__Group_4__1__Impl : ( ( rule__Segment__NumLanesAssignment_4_1 ) ) ;
    public final void rule__Segment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3752:1: ( ( ( rule__Segment__NumLanesAssignment_4_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3753:1: ( ( rule__Segment__NumLanesAssignment_4_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3753:1: ( ( rule__Segment__NumLanesAssignment_4_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3754:1: ( rule__Segment__NumLanesAssignment_4_1 )
            {
             before(grammarAccess.getSegmentAccess().getNumLanesAssignment_4_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3755:1: ( rule__Segment__NumLanesAssignment_4_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3755:2: rule__Segment__NumLanesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__NumLanesAssignment_4_1_in_rule__Segment__Group_4__1__Impl7436);
            rule__Segment__NumLanesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getNumLanesAssignment_4_1()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3769:1: rule__Segment__Group_5__0 : rule__Segment__Group_5__0__Impl rule__Segment__Group_5__1 ;
    public final void rule__Segment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3773:1: ( rule__Segment__Group_5__0__Impl rule__Segment__Group_5__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3774:2: rule__Segment__Group_5__0__Impl rule__Segment__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__0__Impl_in_rule__Segment__Group_5__07470);
            rule__Segment__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__1_in_rule__Segment__Group_5__07473);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3781:1: rule__Segment__Group_5__0__Impl : ( 'length' ) ;
    public final void rule__Segment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3785:1: ( ( 'length' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3786:1: ( 'length' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3786:1: ( 'length' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3787:1: 'length'
            {
             before(grammarAccess.getSegmentAccess().getLengthKeyword_5_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Segment__Group_5__0__Impl7501); 
             after(grammarAccess.getSegmentAccess().getLengthKeyword_5_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3800:1: rule__Segment__Group_5__1 : rule__Segment__Group_5__1__Impl ;
    public final void rule__Segment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3804:1: ( rule__Segment__Group_5__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3805:2: rule__Segment__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__1__Impl_in_rule__Segment__Group_5__17532);
            rule__Segment__Group_5__1__Impl();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3811:1: rule__Segment__Group_5__1__Impl : ( ( rule__Segment__LengthAssignment_5_1 ) ) ;
    public final void rule__Segment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3815:1: ( ( ( rule__Segment__LengthAssignment_5_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3816:1: ( ( rule__Segment__LengthAssignment_5_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3816:1: ( ( rule__Segment__LengthAssignment_5_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3817:1: ( rule__Segment__LengthAssignment_5_1 )
            {
             before(grammarAccess.getSegmentAccess().getLengthAssignment_5_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3818:1: ( rule__Segment__LengthAssignment_5_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3818:2: rule__Segment__LengthAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__LengthAssignment_5_1_in_rule__Segment__Group_5__1__Impl7559);
            rule__Segment__LengthAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getLengthAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Segment__Group_6__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3832:1: rule__Segment__Group_6__0 : rule__Segment__Group_6__0__Impl rule__Segment__Group_6__1 ;
    public final void rule__Segment__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3836:1: ( rule__Segment__Group_6__0__Impl rule__Segment__Group_6__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3837:2: rule__Segment__Group_6__0__Impl rule__Segment__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__0__Impl_in_rule__Segment__Group_6__07593);
            rule__Segment__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__1_in_rule__Segment__Group_6__07596);
            rule__Segment__Group_6__1();

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
    // $ANTLR end "rule__Segment__Group_6__0"


    // $ANTLR start "rule__Segment__Group_6__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3844:1: rule__Segment__Group_6__0__Impl : ( 'hasCars' ) ;
    public final void rule__Segment__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3848:1: ( ( 'hasCars' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3849:1: ( 'hasCars' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3849:1: ( 'hasCars' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3850:1: 'hasCars'
            {
             before(grammarAccess.getSegmentAccess().getHasCarsKeyword_6_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Segment__Group_6__0__Impl7624); 
             after(grammarAccess.getSegmentAccess().getHasCarsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_6__0__Impl"


    // $ANTLR start "rule__Segment__Group_6__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3863:1: rule__Segment__Group_6__1 : rule__Segment__Group_6__1__Impl rule__Segment__Group_6__2 ;
    public final void rule__Segment__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3867:1: ( rule__Segment__Group_6__1__Impl rule__Segment__Group_6__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3868:2: rule__Segment__Group_6__1__Impl rule__Segment__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__1__Impl_in_rule__Segment__Group_6__17655);
            rule__Segment__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__2_in_rule__Segment__Group_6__17658);
            rule__Segment__Group_6__2();

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
    // $ANTLR end "rule__Segment__Group_6__1"


    // $ANTLR start "rule__Segment__Group_6__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3875:1: rule__Segment__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Segment__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3879:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3880:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3880:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3881:1: '('
            {
             before(grammarAccess.getSegmentAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Segment__Group_6__1__Impl7686); 
             after(grammarAccess.getSegmentAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_6__1__Impl"


    // $ANTLR start "rule__Segment__Group_6__2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3894:1: rule__Segment__Group_6__2 : rule__Segment__Group_6__2__Impl rule__Segment__Group_6__3 ;
    public final void rule__Segment__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3898:1: ( rule__Segment__Group_6__2__Impl rule__Segment__Group_6__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3899:2: rule__Segment__Group_6__2__Impl rule__Segment__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__2__Impl_in_rule__Segment__Group_6__27717);
            rule__Segment__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__3_in_rule__Segment__Group_6__27720);
            rule__Segment__Group_6__3();

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
    // $ANTLR end "rule__Segment__Group_6__2"


    // $ANTLR start "rule__Segment__Group_6__2__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3906:1: rule__Segment__Group_6__2__Impl : ( ( rule__Segment__HasCarsAssignment_6_2 ) ) ;
    public final void rule__Segment__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3910:1: ( ( ( rule__Segment__HasCarsAssignment_6_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3911:1: ( ( rule__Segment__HasCarsAssignment_6_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3911:1: ( ( rule__Segment__HasCarsAssignment_6_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3912:1: ( rule__Segment__HasCarsAssignment_6_2 )
            {
             before(grammarAccess.getSegmentAccess().getHasCarsAssignment_6_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3913:1: ( rule__Segment__HasCarsAssignment_6_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3913:2: rule__Segment__HasCarsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__HasCarsAssignment_6_2_in_rule__Segment__Group_6__2__Impl7747);
            rule__Segment__HasCarsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getHasCarsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_6__2__Impl"


    // $ANTLR start "rule__Segment__Group_6__3"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3923:1: rule__Segment__Group_6__3 : rule__Segment__Group_6__3__Impl rule__Segment__Group_6__4 ;
    public final void rule__Segment__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3927:1: ( rule__Segment__Group_6__3__Impl rule__Segment__Group_6__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3928:2: rule__Segment__Group_6__3__Impl rule__Segment__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__3__Impl_in_rule__Segment__Group_6__37777);
            rule__Segment__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__4_in_rule__Segment__Group_6__37780);
            rule__Segment__Group_6__4();

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
    // $ANTLR end "rule__Segment__Group_6__3"


    // $ANTLR start "rule__Segment__Group_6__3__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3935:1: rule__Segment__Group_6__3__Impl : ( ( rule__Segment__Group_6_3__0 )* ) ;
    public final void rule__Segment__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3939:1: ( ( ( rule__Segment__Group_6_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3940:1: ( ( rule__Segment__Group_6_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3940:1: ( ( rule__Segment__Group_6_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3941:1: ( rule__Segment__Group_6_3__0 )*
            {
             before(grammarAccess.getSegmentAccess().getGroup_6_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3942:1: ( rule__Segment__Group_6_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3942:2: rule__Segment__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6_3__0_in_rule__Segment__Group_6__3__Impl7807);
            	    rule__Segment__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSegmentAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_6__3__Impl"


    // $ANTLR start "rule__Segment__Group_6__4"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3952:1: rule__Segment__Group_6__4 : rule__Segment__Group_6__4__Impl ;
    public final void rule__Segment__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3956:1: ( rule__Segment__Group_6__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3957:2: rule__Segment__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__4__Impl_in_rule__Segment__Group_6__47838);
            rule__Segment__Group_6__4__Impl();

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
    // $ANTLR end "rule__Segment__Group_6__4"


    // $ANTLR start "rule__Segment__Group_6__4__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3963:1: rule__Segment__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Segment__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3967:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3968:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3968:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3969:1: ')'
            {
             before(grammarAccess.getSegmentAccess().getRightParenthesisKeyword_6_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Segment__Group_6__4__Impl7866); 
             after(grammarAccess.getSegmentAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_6__4__Impl"


    // $ANTLR start "rule__Segment__Group_6_3__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3992:1: rule__Segment__Group_6_3__0 : rule__Segment__Group_6_3__0__Impl rule__Segment__Group_6_3__1 ;
    public final void rule__Segment__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3996:1: ( rule__Segment__Group_6_3__0__Impl rule__Segment__Group_6_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3997:2: rule__Segment__Group_6_3__0__Impl rule__Segment__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6_3__0__Impl_in_rule__Segment__Group_6_3__07907);
            rule__Segment__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6_3__1_in_rule__Segment__Group_6_3__07910);
            rule__Segment__Group_6_3__1();

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
    // $ANTLR end "rule__Segment__Group_6_3__0"


    // $ANTLR start "rule__Segment__Group_6_3__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4004:1: rule__Segment__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Segment__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4008:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4009:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4009:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4010:1: ','
            {
             before(grammarAccess.getSegmentAccess().getCommaKeyword_6_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Segment__Group_6_3__0__Impl7938); 
             after(grammarAccess.getSegmentAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_6_3__0__Impl"


    // $ANTLR start "rule__Segment__Group_6_3__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4023:1: rule__Segment__Group_6_3__1 : rule__Segment__Group_6_3__1__Impl ;
    public final void rule__Segment__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4027:1: ( rule__Segment__Group_6_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4028:2: rule__Segment__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6_3__1__Impl_in_rule__Segment__Group_6_3__17969);
            rule__Segment__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Segment__Group_6_3__1"


    // $ANTLR start "rule__Segment__Group_6_3__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4034:1: rule__Segment__Group_6_3__1__Impl : ( ( rule__Segment__HasCarsAssignment_6_3_1 ) ) ;
    public final void rule__Segment__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4038:1: ( ( ( rule__Segment__HasCarsAssignment_6_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4039:1: ( ( rule__Segment__HasCarsAssignment_6_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4039:1: ( ( rule__Segment__HasCarsAssignment_6_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4040:1: ( rule__Segment__HasCarsAssignment_6_3_1 )
            {
             before(grammarAccess.getSegmentAccess().getHasCarsAssignment_6_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4041:1: ( rule__Segment__HasCarsAssignment_6_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4041:2: rule__Segment__HasCarsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__HasCarsAssignment_6_3_1_in_rule__Segment__Group_6_3__1__Impl7996);
            rule__Segment__HasCarsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getHasCarsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_6_3__1__Impl"


    // $ANTLR start "rule__Semaphore__Group__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4055:1: rule__Semaphore__Group__0 : rule__Semaphore__Group__0__Impl rule__Semaphore__Group__1 ;
    public final void rule__Semaphore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4059:1: ( rule__Semaphore__Group__0__Impl rule__Semaphore__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4060:2: rule__Semaphore__Group__0__Impl rule__Semaphore__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__0__Impl_in_rule__Semaphore__Group__08030);
            rule__Semaphore__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__1_in_rule__Semaphore__Group__08033);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4067:1: rule__Semaphore__Group__0__Impl : ( () ) ;
    public final void rule__Semaphore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4071:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4072:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4072:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4073:1: ()
            {
             before(grammarAccess.getSemaphoreAccess().getSemaphoreAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4074:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4076:1: 
            {
            }

             after(grammarAccess.getSemaphoreAccess().getSemaphoreAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__0__Impl"


    // $ANTLR start "rule__Semaphore__Group__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4086:1: rule__Semaphore__Group__1 : rule__Semaphore__Group__1__Impl rule__Semaphore__Group__2 ;
    public final void rule__Semaphore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4090:1: ( rule__Semaphore__Group__1__Impl rule__Semaphore__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4091:2: rule__Semaphore__Group__1__Impl rule__Semaphore__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__1__Impl_in_rule__Semaphore__Group__18091);
            rule__Semaphore__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__2_in_rule__Semaphore__Group__18094);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4098:1: rule__Semaphore__Group__1__Impl : ( 'Semaphore' ) ;
    public final void rule__Semaphore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4102:1: ( ( 'Semaphore' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4103:1: ( 'Semaphore' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4103:1: ( 'Semaphore' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4104:1: 'Semaphore'
            {
             before(grammarAccess.getSemaphoreAccess().getSemaphoreKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Semaphore__Group__1__Impl8122); 
             after(grammarAccess.getSemaphoreAccess().getSemaphoreKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4117:1: rule__Semaphore__Group__2 : rule__Semaphore__Group__2__Impl rule__Semaphore__Group__3 ;
    public final void rule__Semaphore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4121:1: ( rule__Semaphore__Group__2__Impl rule__Semaphore__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4122:2: rule__Semaphore__Group__2__Impl rule__Semaphore__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__2__Impl_in_rule__Semaphore__Group__28153);
            rule__Semaphore__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__3_in_rule__Semaphore__Group__28156);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4129:1: rule__Semaphore__Group__2__Impl : ( ( rule__Semaphore__NameAssignment_2 ) ) ;
    public final void rule__Semaphore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4133:1: ( ( ( rule__Semaphore__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4134:1: ( ( rule__Semaphore__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4134:1: ( ( rule__Semaphore__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4135:1: ( rule__Semaphore__NameAssignment_2 )
            {
             before(grammarAccess.getSemaphoreAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4136:1: ( rule__Semaphore__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4136:2: rule__Semaphore__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__NameAssignment_2_in_rule__Semaphore__Group__2__Impl8183);
            rule__Semaphore__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSemaphoreAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4146:1: rule__Semaphore__Group__3 : rule__Semaphore__Group__3__Impl rule__Semaphore__Group__4 ;
    public final void rule__Semaphore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4150:1: ( rule__Semaphore__Group__3__Impl rule__Semaphore__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4151:2: rule__Semaphore__Group__3__Impl rule__Semaphore__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__3__Impl_in_rule__Semaphore__Group__38213);
            rule__Semaphore__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__4_in_rule__Semaphore__Group__38216);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4158:1: rule__Semaphore__Group__3__Impl : ( '{' ) ;
    public final void rule__Semaphore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4162:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4163:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4163:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4164:1: '{'
            {
             before(grammarAccess.getSemaphoreAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Semaphore__Group__3__Impl8244); 
             after(grammarAccess.getSemaphoreAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4177:1: rule__Semaphore__Group__4 : rule__Semaphore__Group__4__Impl rule__Semaphore__Group__5 ;
    public final void rule__Semaphore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4181:1: ( rule__Semaphore__Group__4__Impl rule__Semaphore__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4182:2: rule__Semaphore__Group__4__Impl rule__Semaphore__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__4__Impl_in_rule__Semaphore__Group__48275);
            rule__Semaphore__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__5_in_rule__Semaphore__Group__48278);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4189:1: rule__Semaphore__Group__4__Impl : ( ( rule__Semaphore__Group_4__0 )? ) ;
    public final void rule__Semaphore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4193:1: ( ( ( rule__Semaphore__Group_4__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4194:1: ( ( rule__Semaphore__Group_4__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4194:1: ( ( rule__Semaphore__Group_4__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4195:1: ( rule__Semaphore__Group_4__0 )?
            {
             before(grammarAccess.getSemaphoreAccess().getGroup_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4196:1: ( rule__Semaphore__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4196:2: rule__Semaphore__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_4__0_in_rule__Semaphore__Group__4__Impl8305);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4206:1: rule__Semaphore__Group__5 : rule__Semaphore__Group__5__Impl rule__Semaphore__Group__6 ;
    public final void rule__Semaphore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4210:1: ( rule__Semaphore__Group__5__Impl rule__Semaphore__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4211:2: rule__Semaphore__Group__5__Impl rule__Semaphore__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__5__Impl_in_rule__Semaphore__Group__58336);
            rule__Semaphore__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__6_in_rule__Semaphore__Group__58339);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4218:1: rule__Semaphore__Group__5__Impl : ( ( rule__Semaphore__Group_5__0 )? ) ;
    public final void rule__Semaphore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4222:1: ( ( ( rule__Semaphore__Group_5__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4223:1: ( ( rule__Semaphore__Group_5__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4223:1: ( ( rule__Semaphore__Group_5__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4224:1: ( rule__Semaphore__Group_5__0 )?
            {
             before(grammarAccess.getSemaphoreAccess().getGroup_5()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4225:1: ( rule__Semaphore__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4225:2: rule__Semaphore__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_5__0_in_rule__Semaphore__Group__5__Impl8366);
                    rule__Semaphore__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSemaphoreAccess().getGroup_5()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4235:1: rule__Semaphore__Group__6 : rule__Semaphore__Group__6__Impl rule__Semaphore__Group__7 ;
    public final void rule__Semaphore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4239:1: ( rule__Semaphore__Group__6__Impl rule__Semaphore__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4240:2: rule__Semaphore__Group__6__Impl rule__Semaphore__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__6__Impl_in_rule__Semaphore__Group__68397);
            rule__Semaphore__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__7_in_rule__Semaphore__Group__68400);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4247:1: rule__Semaphore__Group__6__Impl : ( ( rule__Semaphore__Group_6__0 )? ) ;
    public final void rule__Semaphore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4251:1: ( ( ( rule__Semaphore__Group_6__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4252:1: ( ( rule__Semaphore__Group_6__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4252:1: ( ( rule__Semaphore__Group_6__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4253:1: ( rule__Semaphore__Group_6__0 )?
            {
             before(grammarAccess.getSemaphoreAccess().getGroup_6()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4254:1: ( rule__Semaphore__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4254:2: rule__Semaphore__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_6__0_in_rule__Semaphore__Group__6__Impl8427);
                    rule__Semaphore__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSemaphoreAccess().getGroup_6()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4264:1: rule__Semaphore__Group__7 : rule__Semaphore__Group__7__Impl rule__Semaphore__Group__8 ;
    public final void rule__Semaphore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4268:1: ( rule__Semaphore__Group__7__Impl rule__Semaphore__Group__8 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4269:2: rule__Semaphore__Group__7__Impl rule__Semaphore__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__7__Impl_in_rule__Semaphore__Group__78458);
            rule__Semaphore__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__8_in_rule__Semaphore__Group__78461);
            rule__Semaphore__Group__8();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4276:1: rule__Semaphore__Group__7__Impl : ( 'belongsTo' ) ;
    public final void rule__Semaphore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4280:1: ( ( 'belongsTo' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4281:1: ( 'belongsTo' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4281:1: ( 'belongsTo' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4282:1: 'belongsTo'
            {
             before(grammarAccess.getSemaphoreAccess().getBelongsToKeyword_7()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Semaphore__Group__7__Impl8489); 
             after(grammarAccess.getSemaphoreAccess().getBelongsToKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Semaphore__Group__8"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4295:1: rule__Semaphore__Group__8 : rule__Semaphore__Group__8__Impl rule__Semaphore__Group__9 ;
    public final void rule__Semaphore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4299:1: ( rule__Semaphore__Group__8__Impl rule__Semaphore__Group__9 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4300:2: rule__Semaphore__Group__8__Impl rule__Semaphore__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__8__Impl_in_rule__Semaphore__Group__88520);
            rule__Semaphore__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__9_in_rule__Semaphore__Group__88523);
            rule__Semaphore__Group__9();

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
    // $ANTLR end "rule__Semaphore__Group__8"


    // $ANTLR start "rule__Semaphore__Group__8__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4307:1: rule__Semaphore__Group__8__Impl : ( ( rule__Semaphore__BelongsToAssignment_8 ) ) ;
    public final void rule__Semaphore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4311:1: ( ( ( rule__Semaphore__BelongsToAssignment_8 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4312:1: ( ( rule__Semaphore__BelongsToAssignment_8 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4312:1: ( ( rule__Semaphore__BelongsToAssignment_8 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4313:1: ( rule__Semaphore__BelongsToAssignment_8 )
            {
             before(grammarAccess.getSemaphoreAccess().getBelongsToAssignment_8()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4314:1: ( rule__Semaphore__BelongsToAssignment_8 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4314:2: rule__Semaphore__BelongsToAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__BelongsToAssignment_8_in_rule__Semaphore__Group__8__Impl8550);
            rule__Semaphore__BelongsToAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSemaphoreAccess().getBelongsToAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__8__Impl"


    // $ANTLR start "rule__Semaphore__Group__9"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4324:1: rule__Semaphore__Group__9 : rule__Semaphore__Group__9__Impl ;
    public final void rule__Semaphore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4328:1: ( rule__Semaphore__Group__9__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4329:2: rule__Semaphore__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__9__Impl_in_rule__Semaphore__Group__98580);
            rule__Semaphore__Group__9__Impl();

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
    // $ANTLR end "rule__Semaphore__Group__9"


    // $ANTLR start "rule__Semaphore__Group__9__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4335:1: rule__Semaphore__Group__9__Impl : ( '}' ) ;
    public final void rule__Semaphore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4339:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4340:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4340:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4341:1: '}'
            {
             before(grammarAccess.getSemaphoreAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Semaphore__Group__9__Impl8608); 
             after(grammarAccess.getSemaphoreAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group__9__Impl"


    // $ANTLR start "rule__Semaphore__Group_4__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4374:1: rule__Semaphore__Group_4__0 : rule__Semaphore__Group_4__0__Impl rule__Semaphore__Group_4__1 ;
    public final void rule__Semaphore__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4378:1: ( rule__Semaphore__Group_4__0__Impl rule__Semaphore__Group_4__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4379:2: rule__Semaphore__Group_4__0__Impl rule__Semaphore__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_4__0__Impl_in_rule__Semaphore__Group_4__08659);
            rule__Semaphore__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_4__1_in_rule__Semaphore__Group_4__08662);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4386:1: rule__Semaphore__Group_4__0__Impl : ( 'canGo' ) ;
    public final void rule__Semaphore__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4390:1: ( ( 'canGo' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4391:1: ( 'canGo' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4391:1: ( 'canGo' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4392:1: 'canGo'
            {
             before(grammarAccess.getSemaphoreAccess().getCanGoKeyword_4_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Semaphore__Group_4__0__Impl8690); 
             after(grammarAccess.getSemaphoreAccess().getCanGoKeyword_4_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4405:1: rule__Semaphore__Group_4__1 : rule__Semaphore__Group_4__1__Impl ;
    public final void rule__Semaphore__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4409:1: ( rule__Semaphore__Group_4__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4410:2: rule__Semaphore__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_4__1__Impl_in_rule__Semaphore__Group_4__18721);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4416:1: rule__Semaphore__Group_4__1__Impl : ( ( rule__Semaphore__CanGoAssignment_4_1 ) ) ;
    public final void rule__Semaphore__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4420:1: ( ( ( rule__Semaphore__CanGoAssignment_4_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4421:1: ( ( rule__Semaphore__CanGoAssignment_4_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4421:1: ( ( rule__Semaphore__CanGoAssignment_4_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4422:1: ( rule__Semaphore__CanGoAssignment_4_1 )
            {
             before(grammarAccess.getSemaphoreAccess().getCanGoAssignment_4_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4423:1: ( rule__Semaphore__CanGoAssignment_4_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4423:2: rule__Semaphore__CanGoAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__CanGoAssignment_4_1_in_rule__Semaphore__Group_4__1__Impl8748);
            rule__Semaphore__CanGoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSemaphoreAccess().getCanGoAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Semaphore__Group_5__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4437:1: rule__Semaphore__Group_5__0 : rule__Semaphore__Group_5__0__Impl rule__Semaphore__Group_5__1 ;
    public final void rule__Semaphore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4441:1: ( rule__Semaphore__Group_5__0__Impl rule__Semaphore__Group_5__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4442:2: rule__Semaphore__Group_5__0__Impl rule__Semaphore__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_5__0__Impl_in_rule__Semaphore__Group_5__08782);
            rule__Semaphore__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_5__1_in_rule__Semaphore__Group_5__08785);
            rule__Semaphore__Group_5__1();

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
    // $ANTLR end "rule__Semaphore__Group_5__0"


    // $ANTLR start "rule__Semaphore__Group_5__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4449:1: rule__Semaphore__Group_5__0__Impl : ( 'secondsRed' ) ;
    public final void rule__Semaphore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4453:1: ( ( 'secondsRed' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4454:1: ( 'secondsRed' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4454:1: ( 'secondsRed' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4455:1: 'secondsRed'
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsRedKeyword_5_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Semaphore__Group_5__0__Impl8813); 
             after(grammarAccess.getSemaphoreAccess().getSecondsRedKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_5__0__Impl"


    // $ANTLR start "rule__Semaphore__Group_5__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4468:1: rule__Semaphore__Group_5__1 : rule__Semaphore__Group_5__1__Impl ;
    public final void rule__Semaphore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4472:1: ( rule__Semaphore__Group_5__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4473:2: rule__Semaphore__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_5__1__Impl_in_rule__Semaphore__Group_5__18844);
            rule__Semaphore__Group_5__1__Impl();

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
    // $ANTLR end "rule__Semaphore__Group_5__1"


    // $ANTLR start "rule__Semaphore__Group_5__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4479:1: rule__Semaphore__Group_5__1__Impl : ( ( rule__Semaphore__SecondsRedAssignment_5_1 ) ) ;
    public final void rule__Semaphore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4483:1: ( ( ( rule__Semaphore__SecondsRedAssignment_5_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4484:1: ( ( rule__Semaphore__SecondsRedAssignment_5_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4484:1: ( ( rule__Semaphore__SecondsRedAssignment_5_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4485:1: ( rule__Semaphore__SecondsRedAssignment_5_1 )
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsRedAssignment_5_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4486:1: ( rule__Semaphore__SecondsRedAssignment_5_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4486:2: rule__Semaphore__SecondsRedAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__SecondsRedAssignment_5_1_in_rule__Semaphore__Group_5__1__Impl8871);
            rule__Semaphore__SecondsRedAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSemaphoreAccess().getSecondsRedAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_5__1__Impl"


    // $ANTLR start "rule__Semaphore__Group_6__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4500:1: rule__Semaphore__Group_6__0 : rule__Semaphore__Group_6__0__Impl rule__Semaphore__Group_6__1 ;
    public final void rule__Semaphore__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4504:1: ( rule__Semaphore__Group_6__0__Impl rule__Semaphore__Group_6__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4505:2: rule__Semaphore__Group_6__0__Impl rule__Semaphore__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_6__0__Impl_in_rule__Semaphore__Group_6__08905);
            rule__Semaphore__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_6__1_in_rule__Semaphore__Group_6__08908);
            rule__Semaphore__Group_6__1();

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
    // $ANTLR end "rule__Semaphore__Group_6__0"


    // $ANTLR start "rule__Semaphore__Group_6__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4512:1: rule__Semaphore__Group_6__0__Impl : ( 'secondsGreen' ) ;
    public final void rule__Semaphore__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4516:1: ( ( 'secondsGreen' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4517:1: ( 'secondsGreen' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4517:1: ( 'secondsGreen' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4518:1: 'secondsGreen'
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsGreenKeyword_6_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Semaphore__Group_6__0__Impl8936); 
             after(grammarAccess.getSemaphoreAccess().getSecondsGreenKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_6__0__Impl"


    // $ANTLR start "rule__Semaphore__Group_6__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4531:1: rule__Semaphore__Group_6__1 : rule__Semaphore__Group_6__1__Impl ;
    public final void rule__Semaphore__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4535:1: ( rule__Semaphore__Group_6__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4536:2: rule__Semaphore__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_6__1__Impl_in_rule__Semaphore__Group_6__18967);
            rule__Semaphore__Group_6__1__Impl();

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
    // $ANTLR end "rule__Semaphore__Group_6__1"


    // $ANTLR start "rule__Semaphore__Group_6__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4542:1: rule__Semaphore__Group_6__1__Impl : ( ( rule__Semaphore__SecondsGreenAssignment_6_1 ) ) ;
    public final void rule__Semaphore__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4546:1: ( ( ( rule__Semaphore__SecondsGreenAssignment_6_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4547:1: ( ( rule__Semaphore__SecondsGreenAssignment_6_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4547:1: ( ( rule__Semaphore__SecondsGreenAssignment_6_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4548:1: ( rule__Semaphore__SecondsGreenAssignment_6_1 )
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsGreenAssignment_6_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4549:1: ( rule__Semaphore__SecondsGreenAssignment_6_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4549:2: rule__Semaphore__SecondsGreenAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__SecondsGreenAssignment_6_1_in_rule__Semaphore__Group_6__1__Impl8994);
            rule__Semaphore__SecondsGreenAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSemaphoreAccess().getSecondsGreenAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__Group_6__1__Impl"


    // $ANTLR start "rule__Signal_Impl__Group__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4563:1: rule__Signal_Impl__Group__0 : rule__Signal_Impl__Group__0__Impl rule__Signal_Impl__Group__1 ;
    public final void rule__Signal_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4567:1: ( rule__Signal_Impl__Group__0__Impl rule__Signal_Impl__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4568:2: rule__Signal_Impl__Group__0__Impl rule__Signal_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__0__Impl_in_rule__Signal_Impl__Group__09028);
            rule__Signal_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__1_in_rule__Signal_Impl__Group__09031);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4575:1: rule__Signal_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Signal_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4579:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4580:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4580:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4581:1: ()
            {
             before(grammarAccess.getSignal_ImplAccess().getSignalAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4582:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4584:1: 
            {
            }

             after(grammarAccess.getSignal_ImplAccess().getSignalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__0__Impl"


    // $ANTLR start "rule__Signal_Impl__Group__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4594:1: rule__Signal_Impl__Group__1 : rule__Signal_Impl__Group__1__Impl rule__Signal_Impl__Group__2 ;
    public final void rule__Signal_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4598:1: ( rule__Signal_Impl__Group__1__Impl rule__Signal_Impl__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4599:2: rule__Signal_Impl__Group__1__Impl rule__Signal_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__1__Impl_in_rule__Signal_Impl__Group__19089);
            rule__Signal_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__2_in_rule__Signal_Impl__Group__19092);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4606:1: rule__Signal_Impl__Group__1__Impl : ( 'Signal' ) ;
    public final void rule__Signal_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4610:1: ( ( 'Signal' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4611:1: ( 'Signal' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4611:1: ( 'Signal' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4612:1: 'Signal'
            {
             before(grammarAccess.getSignal_ImplAccess().getSignalKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Signal_Impl__Group__1__Impl9120); 
             after(grammarAccess.getSignal_ImplAccess().getSignalKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4625:1: rule__Signal_Impl__Group__2 : rule__Signal_Impl__Group__2__Impl rule__Signal_Impl__Group__3 ;
    public final void rule__Signal_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4629:1: ( rule__Signal_Impl__Group__2__Impl rule__Signal_Impl__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4630:2: rule__Signal_Impl__Group__2__Impl rule__Signal_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__2__Impl_in_rule__Signal_Impl__Group__29151);
            rule__Signal_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__3_in_rule__Signal_Impl__Group__29154);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4637:1: rule__Signal_Impl__Group__2__Impl : ( ( rule__Signal_Impl__NameAssignment_2 ) ) ;
    public final void rule__Signal_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4641:1: ( ( ( rule__Signal_Impl__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4642:1: ( ( rule__Signal_Impl__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4642:1: ( ( rule__Signal_Impl__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4643:1: ( rule__Signal_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getSignal_ImplAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4644:1: ( rule__Signal_Impl__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4644:2: rule__Signal_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__NameAssignment_2_in_rule__Signal_Impl__Group__2__Impl9181);
            rule__Signal_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSignal_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4654:1: rule__Signal_Impl__Group__3 : rule__Signal_Impl__Group__3__Impl rule__Signal_Impl__Group__4 ;
    public final void rule__Signal_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4658:1: ( rule__Signal_Impl__Group__3__Impl rule__Signal_Impl__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4659:2: rule__Signal_Impl__Group__3__Impl rule__Signal_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__3__Impl_in_rule__Signal_Impl__Group__39211);
            rule__Signal_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__4_in_rule__Signal_Impl__Group__39214);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4666:1: rule__Signal_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Signal_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4670:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4671:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4671:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4672:1: '{'
            {
             before(grammarAccess.getSignal_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Signal_Impl__Group__3__Impl9242); 
             after(grammarAccess.getSignal_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4685:1: rule__Signal_Impl__Group__4 : rule__Signal_Impl__Group__4__Impl rule__Signal_Impl__Group__5 ;
    public final void rule__Signal_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4689:1: ( rule__Signal_Impl__Group__4__Impl rule__Signal_Impl__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4690:2: rule__Signal_Impl__Group__4__Impl rule__Signal_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__4__Impl_in_rule__Signal_Impl__Group__49273);
            rule__Signal_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__5_in_rule__Signal_Impl__Group__49276);
            rule__Signal_Impl__Group__5();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4697:1: rule__Signal_Impl__Group__4__Impl : ( 'belongsTo' ) ;
    public final void rule__Signal_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4701:1: ( ( 'belongsTo' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4702:1: ( 'belongsTo' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4702:1: ( 'belongsTo' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4703:1: 'belongsTo'
            {
             before(grammarAccess.getSignal_ImplAccess().getBelongsToKeyword_4()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Signal_Impl__Group__4__Impl9304); 
             after(grammarAccess.getSignal_ImplAccess().getBelongsToKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Signal_Impl__Group__5"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4716:1: rule__Signal_Impl__Group__5 : rule__Signal_Impl__Group__5__Impl rule__Signal_Impl__Group__6 ;
    public final void rule__Signal_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4720:1: ( rule__Signal_Impl__Group__5__Impl rule__Signal_Impl__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4721:2: rule__Signal_Impl__Group__5__Impl rule__Signal_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__5__Impl_in_rule__Signal_Impl__Group__59335);
            rule__Signal_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__6_in_rule__Signal_Impl__Group__59338);
            rule__Signal_Impl__Group__6();

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
    // $ANTLR end "rule__Signal_Impl__Group__5"


    // $ANTLR start "rule__Signal_Impl__Group__5__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4728:1: rule__Signal_Impl__Group__5__Impl : ( ( rule__Signal_Impl__BelongsToAssignment_5 ) ) ;
    public final void rule__Signal_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4732:1: ( ( ( rule__Signal_Impl__BelongsToAssignment_5 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4733:1: ( ( rule__Signal_Impl__BelongsToAssignment_5 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4733:1: ( ( rule__Signal_Impl__BelongsToAssignment_5 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4734:1: ( rule__Signal_Impl__BelongsToAssignment_5 )
            {
             before(grammarAccess.getSignal_ImplAccess().getBelongsToAssignment_5()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4735:1: ( rule__Signal_Impl__BelongsToAssignment_5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4735:2: rule__Signal_Impl__BelongsToAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__BelongsToAssignment_5_in_rule__Signal_Impl__Group__5__Impl9365);
            rule__Signal_Impl__BelongsToAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSignal_ImplAccess().getBelongsToAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__5__Impl"


    // $ANTLR start "rule__Signal_Impl__Group__6"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4745:1: rule__Signal_Impl__Group__6 : rule__Signal_Impl__Group__6__Impl ;
    public final void rule__Signal_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4749:1: ( rule__Signal_Impl__Group__6__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4750:2: rule__Signal_Impl__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__6__Impl_in_rule__Signal_Impl__Group__69395);
            rule__Signal_Impl__Group__6__Impl();

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
    // $ANTLR end "rule__Signal_Impl__Group__6"


    // $ANTLR start "rule__Signal_Impl__Group__6__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4756:1: rule__Signal_Impl__Group__6__Impl : ( '}' ) ;
    public final void rule__Signal_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4760:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4761:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4761:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4762:1: '}'
            {
             before(grammarAccess.getSignal_ImplAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Signal_Impl__Group__6__Impl9423); 
             after(grammarAccess.getSignal_ImplAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__Group__6__Impl"


    // $ANTLR start "rule__Extractor__Group__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4789:1: rule__Extractor__Group__0 : rule__Extractor__Group__0__Impl rule__Extractor__Group__1 ;
    public final void rule__Extractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4793:1: ( rule__Extractor__Group__0__Impl rule__Extractor__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4794:2: rule__Extractor__Group__0__Impl rule__Extractor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__0__Impl_in_rule__Extractor__Group__09468);
            rule__Extractor__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__1_in_rule__Extractor__Group__09471);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4801:1: rule__Extractor__Group__0__Impl : ( () ) ;
    public final void rule__Extractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4805:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4806:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4806:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4807:1: ()
            {
             before(grammarAccess.getExtractorAccess().getExtractorAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4808:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4810:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4820:1: rule__Extractor__Group__1 : rule__Extractor__Group__1__Impl rule__Extractor__Group__2 ;
    public final void rule__Extractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4824:1: ( rule__Extractor__Group__1__Impl rule__Extractor__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4825:2: rule__Extractor__Group__1__Impl rule__Extractor__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__1__Impl_in_rule__Extractor__Group__19529);
            rule__Extractor__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__2_in_rule__Extractor__Group__19532);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4832:1: rule__Extractor__Group__1__Impl : ( 'Extractor' ) ;
    public final void rule__Extractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4836:1: ( ( 'Extractor' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4837:1: ( 'Extractor' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4837:1: ( 'Extractor' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4838:1: 'Extractor'
            {
             before(grammarAccess.getExtractorAccess().getExtractorKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Extractor__Group__1__Impl9560); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4851:1: rule__Extractor__Group__2 : rule__Extractor__Group__2__Impl rule__Extractor__Group__3 ;
    public final void rule__Extractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4855:1: ( rule__Extractor__Group__2__Impl rule__Extractor__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4856:2: rule__Extractor__Group__2__Impl rule__Extractor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__2__Impl_in_rule__Extractor__Group__29591);
            rule__Extractor__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__3_in_rule__Extractor__Group__29594);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4863:1: rule__Extractor__Group__2__Impl : ( ( rule__Extractor__NameAssignment_2 ) ) ;
    public final void rule__Extractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4867:1: ( ( ( rule__Extractor__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4868:1: ( ( rule__Extractor__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4868:1: ( ( rule__Extractor__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4869:1: ( rule__Extractor__NameAssignment_2 )
            {
             before(grammarAccess.getExtractorAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4870:1: ( rule__Extractor__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4870:2: rule__Extractor__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__NameAssignment_2_in_rule__Extractor__Group__2__Impl9621);
            rule__Extractor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4880:1: rule__Extractor__Group__3 : rule__Extractor__Group__3__Impl rule__Extractor__Group__4 ;
    public final void rule__Extractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4884:1: ( rule__Extractor__Group__3__Impl rule__Extractor__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4885:2: rule__Extractor__Group__3__Impl rule__Extractor__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__3__Impl_in_rule__Extractor__Group__39651);
            rule__Extractor__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__4_in_rule__Extractor__Group__39654);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4892:1: rule__Extractor__Group__3__Impl : ( '{' ) ;
    public final void rule__Extractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4896:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4897:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4897:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4898:1: '{'
            {
             before(grammarAccess.getExtractorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Extractor__Group__3__Impl9682); 
             after(grammarAccess.getExtractorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4911:1: rule__Extractor__Group__4 : rule__Extractor__Group__4__Impl rule__Extractor__Group__5 ;
    public final void rule__Extractor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4915:1: ( rule__Extractor__Group__4__Impl rule__Extractor__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4916:2: rule__Extractor__Group__4__Impl rule__Extractor__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__4__Impl_in_rule__Extractor__Group__49713);
            rule__Extractor__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__5_in_rule__Extractor__Group__49716);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4923:1: rule__Extractor__Group__4__Impl : ( ( rule__Extractor__Group_4__0 )? ) ;
    public final void rule__Extractor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4927:1: ( ( ( rule__Extractor__Group_4__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4928:1: ( ( rule__Extractor__Group_4__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4928:1: ( ( rule__Extractor__Group_4__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4929:1: ( rule__Extractor__Group_4__0 )?
            {
             before(grammarAccess.getExtractorAccess().getGroup_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4930:1: ( rule__Extractor__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4930:2: rule__Extractor__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__0_in_rule__Extractor__Group__4__Impl9743);
                    rule__Extractor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtractorAccess().getGroup_4()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4940:1: rule__Extractor__Group__5 : rule__Extractor__Group__5__Impl rule__Extractor__Group__6 ;
    public final void rule__Extractor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4944:1: ( rule__Extractor__Group__5__Impl rule__Extractor__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4945:2: rule__Extractor__Group__5__Impl rule__Extractor__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__5__Impl_in_rule__Extractor__Group__59774);
            rule__Extractor__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__6_in_rule__Extractor__Group__59777);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4952:1: rule__Extractor__Group__5__Impl : ( 'hasEnds' ) ;
    public final void rule__Extractor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4956:1: ( ( 'hasEnds' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4957:1: ( 'hasEnds' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4957:1: ( 'hasEnds' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4958:1: 'hasEnds'
            {
             before(grammarAccess.getExtractorAccess().getHasEndsKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Extractor__Group__5__Impl9805); 
             after(grammarAccess.getExtractorAccess().getHasEndsKeyword_5()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4971:1: rule__Extractor__Group__6 : rule__Extractor__Group__6__Impl rule__Extractor__Group__7 ;
    public final void rule__Extractor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4975:1: ( rule__Extractor__Group__6__Impl rule__Extractor__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4976:2: rule__Extractor__Group__6__Impl rule__Extractor__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__6__Impl_in_rule__Extractor__Group__69836);
            rule__Extractor__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__7_in_rule__Extractor__Group__69839);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4983:1: rule__Extractor__Group__6__Impl : ( '(' ) ;
    public final void rule__Extractor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4987:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4988:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4988:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4989:1: '('
            {
             before(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_6()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Extractor__Group__6__Impl9867); 
             after(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5002:1: rule__Extractor__Group__7 : rule__Extractor__Group__7__Impl rule__Extractor__Group__8 ;
    public final void rule__Extractor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5006:1: ( rule__Extractor__Group__7__Impl rule__Extractor__Group__8 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5007:2: rule__Extractor__Group__7__Impl rule__Extractor__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__7__Impl_in_rule__Extractor__Group__79898);
            rule__Extractor__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__8_in_rule__Extractor__Group__79901);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5014:1: rule__Extractor__Group__7__Impl : ( ( rule__Extractor__HasEndsAssignment_7 ) ) ;
    public final void rule__Extractor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5018:1: ( ( ( rule__Extractor__HasEndsAssignment_7 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5019:1: ( ( rule__Extractor__HasEndsAssignment_7 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5019:1: ( ( rule__Extractor__HasEndsAssignment_7 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5020:1: ( rule__Extractor__HasEndsAssignment_7 )
            {
             before(grammarAccess.getExtractorAccess().getHasEndsAssignment_7()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5021:1: ( rule__Extractor__HasEndsAssignment_7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5021:2: rule__Extractor__HasEndsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__HasEndsAssignment_7_in_rule__Extractor__Group__7__Impl9928);
            rule__Extractor__HasEndsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getHasEndsAssignment_7()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5031:1: rule__Extractor__Group__8 : rule__Extractor__Group__8__Impl rule__Extractor__Group__9 ;
    public final void rule__Extractor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5035:1: ( rule__Extractor__Group__8__Impl rule__Extractor__Group__9 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5036:2: rule__Extractor__Group__8__Impl rule__Extractor__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__8__Impl_in_rule__Extractor__Group__89958);
            rule__Extractor__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__9_in_rule__Extractor__Group__89961);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5043:1: rule__Extractor__Group__8__Impl : ( ( rule__Extractor__Group_8__0 )* ) ;
    public final void rule__Extractor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5047:1: ( ( ( rule__Extractor__Group_8__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5048:1: ( ( rule__Extractor__Group_8__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5048:1: ( ( rule__Extractor__Group_8__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5049:1: ( rule__Extractor__Group_8__0 )*
            {
             before(grammarAccess.getExtractorAccess().getGroup_8()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5050:1: ( rule__Extractor__Group_8__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==17) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5050:2: rule__Extractor__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_8__0_in_rule__Extractor__Group__8__Impl9988);
            	    rule__Extractor__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getExtractorAccess().getGroup_8()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5060:1: rule__Extractor__Group__9 : rule__Extractor__Group__9__Impl rule__Extractor__Group__10 ;
    public final void rule__Extractor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5064:1: ( rule__Extractor__Group__9__Impl rule__Extractor__Group__10 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5065:2: rule__Extractor__Group__9__Impl rule__Extractor__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__9__Impl_in_rule__Extractor__Group__910019);
            rule__Extractor__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__10_in_rule__Extractor__Group__910022);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5072:1: rule__Extractor__Group__9__Impl : ( ')' ) ;
    public final void rule__Extractor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5076:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5077:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5077:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5078:1: ')'
            {
             before(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_9()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Extractor__Group__9__Impl10050); 
             after(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5091:1: rule__Extractor__Group__10 : rule__Extractor__Group__10__Impl rule__Extractor__Group__11 ;
    public final void rule__Extractor__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5095:1: ( rule__Extractor__Group__10__Impl rule__Extractor__Group__11 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5096:2: rule__Extractor__Group__10__Impl rule__Extractor__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__10__Impl_in_rule__Extractor__Group__1010081);
            rule__Extractor__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__11_in_rule__Extractor__Group__1010084);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5103:1: rule__Extractor__Group__10__Impl : ( ( rule__Extractor__Group_10__0 )? ) ;
    public final void rule__Extractor__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5107:1: ( ( ( rule__Extractor__Group_10__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5108:1: ( ( rule__Extractor__Group_10__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5108:1: ( ( rule__Extractor__Group_10__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5109:1: ( rule__Extractor__Group_10__0 )?
            {
             before(grammarAccess.getExtractorAccess().getGroup_10()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5110:1: ( rule__Extractor__Group_10__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5110:2: rule__Extractor__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__0_in_rule__Extractor__Group__10__Impl10111);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5120:1: rule__Extractor__Group__11 : rule__Extractor__Group__11__Impl rule__Extractor__Group__12 ;
    public final void rule__Extractor__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5124:1: ( rule__Extractor__Group__11__Impl rule__Extractor__Group__12 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5125:2: rule__Extractor__Group__11__Impl rule__Extractor__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__11__Impl_in_rule__Extractor__Group__1110142);
            rule__Extractor__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__12_in_rule__Extractor__Group__1110145);
            rule__Extractor__Group__12();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5132:1: rule__Extractor__Group__11__Impl : ( ( rule__Extractor__Group_11__0 )? ) ;
    public final void rule__Extractor__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5136:1: ( ( ( rule__Extractor__Group_11__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5137:1: ( ( rule__Extractor__Group_11__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5137:1: ( ( rule__Extractor__Group_11__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5138:1: ( rule__Extractor__Group_11__0 )?
            {
             before(grammarAccess.getExtractorAccess().getGroup_11()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5139:1: ( rule__Extractor__Group_11__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5139:2: rule__Extractor__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__0_in_rule__Extractor__Group__11__Impl10172);
                    rule__Extractor__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtractorAccess().getGroup_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Extractor__Group__12"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5149:1: rule__Extractor__Group__12 : rule__Extractor__Group__12__Impl ;
    public final void rule__Extractor__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5153:1: ( rule__Extractor__Group__12__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5154:2: rule__Extractor__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__12__Impl_in_rule__Extractor__Group__1210203);
            rule__Extractor__Group__12__Impl();

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
    // $ANTLR end "rule__Extractor__Group__12"


    // $ANTLR start "rule__Extractor__Group__12__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5160:1: rule__Extractor__Group__12__Impl : ( '}' ) ;
    public final void rule__Extractor__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5164:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5165:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5165:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5166:1: '}'
            {
             before(grammarAccess.getExtractorAccess().getRightCurlyBracketKeyword_12()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Extractor__Group__12__Impl10231); 
             after(grammarAccess.getExtractorAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group__12__Impl"


    // $ANTLR start "rule__Extractor__Group_4__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5205:1: rule__Extractor__Group_4__0 : rule__Extractor__Group_4__0__Impl rule__Extractor__Group_4__1 ;
    public final void rule__Extractor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5209:1: ( rule__Extractor__Group_4__0__Impl rule__Extractor__Group_4__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5210:2: rule__Extractor__Group_4__0__Impl rule__Extractor__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__0__Impl_in_rule__Extractor__Group_4__010288);
            rule__Extractor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__1_in_rule__Extractor__Group_4__010291);
            rule__Extractor__Group_4__1();

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
    // $ANTLR end "rule__Extractor__Group_4__0"


    // $ANTLR start "rule__Extractor__Group_4__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5217:1: rule__Extractor__Group_4__0__Impl : ( 'hasStarts' ) ;
    public final void rule__Extractor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5221:1: ( ( 'hasStarts' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5222:1: ( 'hasStarts' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5222:1: ( 'hasStarts' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5223:1: 'hasStarts'
            {
             before(grammarAccess.getExtractorAccess().getHasStartsKeyword_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Extractor__Group_4__0__Impl10319); 
             after(grammarAccess.getExtractorAccess().getHasStartsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_4__0__Impl"


    // $ANTLR start "rule__Extractor__Group_4__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5236:1: rule__Extractor__Group_4__1 : rule__Extractor__Group_4__1__Impl rule__Extractor__Group_4__2 ;
    public final void rule__Extractor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5240:1: ( rule__Extractor__Group_4__1__Impl rule__Extractor__Group_4__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5241:2: rule__Extractor__Group_4__1__Impl rule__Extractor__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__1__Impl_in_rule__Extractor__Group_4__110350);
            rule__Extractor__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__2_in_rule__Extractor__Group_4__110353);
            rule__Extractor__Group_4__2();

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
    // $ANTLR end "rule__Extractor__Group_4__1"


    // $ANTLR start "rule__Extractor__Group_4__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5248:1: rule__Extractor__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Extractor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5252:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5253:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5253:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5254:1: '('
            {
             before(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Extractor__Group_4__1__Impl10381); 
             after(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_4__1__Impl"


    // $ANTLR start "rule__Extractor__Group_4__2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5267:1: rule__Extractor__Group_4__2 : rule__Extractor__Group_4__2__Impl rule__Extractor__Group_4__3 ;
    public final void rule__Extractor__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5271:1: ( rule__Extractor__Group_4__2__Impl rule__Extractor__Group_4__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5272:2: rule__Extractor__Group_4__2__Impl rule__Extractor__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__2__Impl_in_rule__Extractor__Group_4__210412);
            rule__Extractor__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__3_in_rule__Extractor__Group_4__210415);
            rule__Extractor__Group_4__3();

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
    // $ANTLR end "rule__Extractor__Group_4__2"


    // $ANTLR start "rule__Extractor__Group_4__2__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5279:1: rule__Extractor__Group_4__2__Impl : ( ( rule__Extractor__HasStartsAssignment_4_2 ) ) ;
    public final void rule__Extractor__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5283:1: ( ( ( rule__Extractor__HasStartsAssignment_4_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5284:1: ( ( rule__Extractor__HasStartsAssignment_4_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5284:1: ( ( rule__Extractor__HasStartsAssignment_4_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5285:1: ( rule__Extractor__HasStartsAssignment_4_2 )
            {
             before(grammarAccess.getExtractorAccess().getHasStartsAssignment_4_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5286:1: ( rule__Extractor__HasStartsAssignment_4_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5286:2: rule__Extractor__HasStartsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__HasStartsAssignment_4_2_in_rule__Extractor__Group_4__2__Impl10442);
            rule__Extractor__HasStartsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getHasStartsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_4__2__Impl"


    // $ANTLR start "rule__Extractor__Group_4__3"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5296:1: rule__Extractor__Group_4__3 : rule__Extractor__Group_4__3__Impl rule__Extractor__Group_4__4 ;
    public final void rule__Extractor__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5300:1: ( rule__Extractor__Group_4__3__Impl rule__Extractor__Group_4__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5301:2: rule__Extractor__Group_4__3__Impl rule__Extractor__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__3__Impl_in_rule__Extractor__Group_4__310472);
            rule__Extractor__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__4_in_rule__Extractor__Group_4__310475);
            rule__Extractor__Group_4__4();

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
    // $ANTLR end "rule__Extractor__Group_4__3"


    // $ANTLR start "rule__Extractor__Group_4__3__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5308:1: rule__Extractor__Group_4__3__Impl : ( ( rule__Extractor__Group_4_3__0 )* ) ;
    public final void rule__Extractor__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5312:1: ( ( ( rule__Extractor__Group_4_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5313:1: ( ( rule__Extractor__Group_4_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5313:1: ( ( rule__Extractor__Group_4_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5314:1: ( rule__Extractor__Group_4_3__0 )*
            {
             before(grammarAccess.getExtractorAccess().getGroup_4_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5315:1: ( rule__Extractor__Group_4_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==17) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5315:2: rule__Extractor__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4_3__0_in_rule__Extractor__Group_4__3__Impl10502);
            	    rule__Extractor__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getExtractorAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_4__3__Impl"


    // $ANTLR start "rule__Extractor__Group_4__4"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5325:1: rule__Extractor__Group_4__4 : rule__Extractor__Group_4__4__Impl ;
    public final void rule__Extractor__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5329:1: ( rule__Extractor__Group_4__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5330:2: rule__Extractor__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__4__Impl_in_rule__Extractor__Group_4__410533);
            rule__Extractor__Group_4__4__Impl();

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
    // $ANTLR end "rule__Extractor__Group_4__4"


    // $ANTLR start "rule__Extractor__Group_4__4__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5336:1: rule__Extractor__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Extractor__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5340:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5341:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5341:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5342:1: ')'
            {
             before(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Extractor__Group_4__4__Impl10561); 
             after(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_4__4__Impl"


    // $ANTLR start "rule__Extractor__Group_4_3__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5365:1: rule__Extractor__Group_4_3__0 : rule__Extractor__Group_4_3__0__Impl rule__Extractor__Group_4_3__1 ;
    public final void rule__Extractor__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5369:1: ( rule__Extractor__Group_4_3__0__Impl rule__Extractor__Group_4_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5370:2: rule__Extractor__Group_4_3__0__Impl rule__Extractor__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4_3__0__Impl_in_rule__Extractor__Group_4_3__010602);
            rule__Extractor__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4_3__1_in_rule__Extractor__Group_4_3__010605);
            rule__Extractor__Group_4_3__1();

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
    // $ANTLR end "rule__Extractor__Group_4_3__0"


    // $ANTLR start "rule__Extractor__Group_4_3__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5377:1: rule__Extractor__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Extractor__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5381:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5382:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5382:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5383:1: ','
            {
             before(grammarAccess.getExtractorAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Extractor__Group_4_3__0__Impl10633); 
             after(grammarAccess.getExtractorAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_4_3__0__Impl"


    // $ANTLR start "rule__Extractor__Group_4_3__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5396:1: rule__Extractor__Group_4_3__1 : rule__Extractor__Group_4_3__1__Impl ;
    public final void rule__Extractor__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5400:1: ( rule__Extractor__Group_4_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5401:2: rule__Extractor__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4_3__1__Impl_in_rule__Extractor__Group_4_3__110664);
            rule__Extractor__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Extractor__Group_4_3__1"


    // $ANTLR start "rule__Extractor__Group_4_3__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5407:1: rule__Extractor__Group_4_3__1__Impl : ( ( rule__Extractor__HasStartsAssignment_4_3_1 ) ) ;
    public final void rule__Extractor__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5411:1: ( ( ( rule__Extractor__HasStartsAssignment_4_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5412:1: ( ( rule__Extractor__HasStartsAssignment_4_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5412:1: ( ( rule__Extractor__HasStartsAssignment_4_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5413:1: ( rule__Extractor__HasStartsAssignment_4_3_1 )
            {
             before(grammarAccess.getExtractorAccess().getHasStartsAssignment_4_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5414:1: ( rule__Extractor__HasStartsAssignment_4_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5414:2: rule__Extractor__HasStartsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__HasStartsAssignment_4_3_1_in_rule__Extractor__Group_4_3__1__Impl10691);
            rule__Extractor__HasStartsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getHasStartsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_4_3__1__Impl"


    // $ANTLR start "rule__Extractor__Group_8__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5428:1: rule__Extractor__Group_8__0 : rule__Extractor__Group_8__0__Impl rule__Extractor__Group_8__1 ;
    public final void rule__Extractor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5432:1: ( rule__Extractor__Group_8__0__Impl rule__Extractor__Group_8__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5433:2: rule__Extractor__Group_8__0__Impl rule__Extractor__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_8__0__Impl_in_rule__Extractor__Group_8__010725);
            rule__Extractor__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_8__1_in_rule__Extractor__Group_8__010728);
            rule__Extractor__Group_8__1();

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
    // $ANTLR end "rule__Extractor__Group_8__0"


    // $ANTLR start "rule__Extractor__Group_8__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5440:1: rule__Extractor__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Extractor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5444:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5445:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5445:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5446:1: ','
            {
             before(grammarAccess.getExtractorAccess().getCommaKeyword_8_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Extractor__Group_8__0__Impl10756); 
             after(grammarAccess.getExtractorAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_8__0__Impl"


    // $ANTLR start "rule__Extractor__Group_8__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5459:1: rule__Extractor__Group_8__1 : rule__Extractor__Group_8__1__Impl ;
    public final void rule__Extractor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5463:1: ( rule__Extractor__Group_8__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5464:2: rule__Extractor__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_8__1__Impl_in_rule__Extractor__Group_8__110787);
            rule__Extractor__Group_8__1__Impl();

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
    // $ANTLR end "rule__Extractor__Group_8__1"


    // $ANTLR start "rule__Extractor__Group_8__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5470:1: rule__Extractor__Group_8__1__Impl : ( ( rule__Extractor__HasEndsAssignment_8_1 ) ) ;
    public final void rule__Extractor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5474:1: ( ( ( rule__Extractor__HasEndsAssignment_8_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5475:1: ( ( rule__Extractor__HasEndsAssignment_8_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5475:1: ( ( rule__Extractor__HasEndsAssignment_8_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5476:1: ( rule__Extractor__HasEndsAssignment_8_1 )
            {
             before(grammarAccess.getExtractorAccess().getHasEndsAssignment_8_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5477:1: ( rule__Extractor__HasEndsAssignment_8_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5477:2: rule__Extractor__HasEndsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__HasEndsAssignment_8_1_in_rule__Extractor__Group_8__1__Impl10814);
            rule__Extractor__HasEndsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getHasEndsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_8__1__Impl"


    // $ANTLR start "rule__Extractor__Group_10__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5491:1: rule__Extractor__Group_10__0 : rule__Extractor__Group_10__0__Impl rule__Extractor__Group_10__1 ;
    public final void rule__Extractor__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5495:1: ( rule__Extractor__Group_10__0__Impl rule__Extractor__Group_10__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5496:2: rule__Extractor__Group_10__0__Impl rule__Extractor__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__0__Impl_in_rule__Extractor__Group_10__010848);
            rule__Extractor__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__1_in_rule__Extractor__Group_10__010851);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5503:1: rule__Extractor__Group_10__0__Impl : ( 'semaphore' ) ;
    public final void rule__Extractor__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5507:1: ( ( 'semaphore' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5508:1: ( 'semaphore' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5508:1: ( 'semaphore' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5509:1: 'semaphore'
            {
             before(grammarAccess.getExtractorAccess().getSemaphoreKeyword_10_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Extractor__Group_10__0__Impl10879); 
             after(grammarAccess.getExtractorAccess().getSemaphoreKeyword_10_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5522:1: rule__Extractor__Group_10__1 : rule__Extractor__Group_10__1__Impl ;
    public final void rule__Extractor__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5526:1: ( rule__Extractor__Group_10__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5527:2: rule__Extractor__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__1__Impl_in_rule__Extractor__Group_10__110910);
            rule__Extractor__Group_10__1__Impl();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5533:1: rule__Extractor__Group_10__1__Impl : ( ( rule__Extractor__SemaphoreAssignment_10_1 ) ) ;
    public final void rule__Extractor__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5537:1: ( ( ( rule__Extractor__SemaphoreAssignment_10_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5538:1: ( ( rule__Extractor__SemaphoreAssignment_10_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5538:1: ( ( rule__Extractor__SemaphoreAssignment_10_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5539:1: ( rule__Extractor__SemaphoreAssignment_10_1 )
            {
             before(grammarAccess.getExtractorAccess().getSemaphoreAssignment_10_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5540:1: ( rule__Extractor__SemaphoreAssignment_10_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5540:2: rule__Extractor__SemaphoreAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__SemaphoreAssignment_10_1_in_rule__Extractor__Group_10__1__Impl10937);
            rule__Extractor__SemaphoreAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getSemaphoreAssignment_10_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Extractor__Group_11__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5554:1: rule__Extractor__Group_11__0 : rule__Extractor__Group_11__0__Impl rule__Extractor__Group_11__1 ;
    public final void rule__Extractor__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5558:1: ( rule__Extractor__Group_11__0__Impl rule__Extractor__Group_11__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5559:2: rule__Extractor__Group_11__0__Impl rule__Extractor__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__0__Impl_in_rule__Extractor__Group_11__010971);
            rule__Extractor__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__1_in_rule__Extractor__Group_11__010974);
            rule__Extractor__Group_11__1();

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
    // $ANTLR end "rule__Extractor__Group_11__0"


    // $ANTLR start "rule__Extractor__Group_11__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5566:1: rule__Extractor__Group_11__0__Impl : ( 'signals' ) ;
    public final void rule__Extractor__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5570:1: ( ( 'signals' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5571:1: ( 'signals' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5571:1: ( 'signals' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5572:1: 'signals'
            {
             before(grammarAccess.getExtractorAccess().getSignalsKeyword_11_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Extractor__Group_11__0__Impl11002); 
             after(grammarAccess.getExtractorAccess().getSignalsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_11__0__Impl"


    // $ANTLR start "rule__Extractor__Group_11__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5585:1: rule__Extractor__Group_11__1 : rule__Extractor__Group_11__1__Impl rule__Extractor__Group_11__2 ;
    public final void rule__Extractor__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5589:1: ( rule__Extractor__Group_11__1__Impl rule__Extractor__Group_11__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5590:2: rule__Extractor__Group_11__1__Impl rule__Extractor__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__1__Impl_in_rule__Extractor__Group_11__111033);
            rule__Extractor__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__2_in_rule__Extractor__Group_11__111036);
            rule__Extractor__Group_11__2();

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
    // $ANTLR end "rule__Extractor__Group_11__1"


    // $ANTLR start "rule__Extractor__Group_11__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5597:1: rule__Extractor__Group_11__1__Impl : ( '(' ) ;
    public final void rule__Extractor__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5601:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5602:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5602:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5603:1: '('
            {
             before(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_11_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Extractor__Group_11__1__Impl11064); 
             after(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_11__1__Impl"


    // $ANTLR start "rule__Extractor__Group_11__2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5616:1: rule__Extractor__Group_11__2 : rule__Extractor__Group_11__2__Impl rule__Extractor__Group_11__3 ;
    public final void rule__Extractor__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5620:1: ( rule__Extractor__Group_11__2__Impl rule__Extractor__Group_11__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5621:2: rule__Extractor__Group_11__2__Impl rule__Extractor__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__2__Impl_in_rule__Extractor__Group_11__211095);
            rule__Extractor__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__3_in_rule__Extractor__Group_11__211098);
            rule__Extractor__Group_11__3();

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
    // $ANTLR end "rule__Extractor__Group_11__2"


    // $ANTLR start "rule__Extractor__Group_11__2__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5628:1: rule__Extractor__Group_11__2__Impl : ( ( rule__Extractor__SignalsAssignment_11_2 ) ) ;
    public final void rule__Extractor__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5632:1: ( ( ( rule__Extractor__SignalsAssignment_11_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5633:1: ( ( rule__Extractor__SignalsAssignment_11_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5633:1: ( ( rule__Extractor__SignalsAssignment_11_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5634:1: ( rule__Extractor__SignalsAssignment_11_2 )
            {
             before(grammarAccess.getExtractorAccess().getSignalsAssignment_11_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5635:1: ( rule__Extractor__SignalsAssignment_11_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5635:2: rule__Extractor__SignalsAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__SignalsAssignment_11_2_in_rule__Extractor__Group_11__2__Impl11125);
            rule__Extractor__SignalsAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getSignalsAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_11__2__Impl"


    // $ANTLR start "rule__Extractor__Group_11__3"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5645:1: rule__Extractor__Group_11__3 : rule__Extractor__Group_11__3__Impl rule__Extractor__Group_11__4 ;
    public final void rule__Extractor__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5649:1: ( rule__Extractor__Group_11__3__Impl rule__Extractor__Group_11__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5650:2: rule__Extractor__Group_11__3__Impl rule__Extractor__Group_11__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__3__Impl_in_rule__Extractor__Group_11__311155);
            rule__Extractor__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__4_in_rule__Extractor__Group_11__311158);
            rule__Extractor__Group_11__4();

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
    // $ANTLR end "rule__Extractor__Group_11__3"


    // $ANTLR start "rule__Extractor__Group_11__3__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5657:1: rule__Extractor__Group_11__3__Impl : ( ( rule__Extractor__Group_11_3__0 )* ) ;
    public final void rule__Extractor__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5661:1: ( ( ( rule__Extractor__Group_11_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5662:1: ( ( rule__Extractor__Group_11_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5662:1: ( ( rule__Extractor__Group_11_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5663:1: ( rule__Extractor__Group_11_3__0 )*
            {
             before(grammarAccess.getExtractorAccess().getGroup_11_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5664:1: ( rule__Extractor__Group_11_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==17) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5664:2: rule__Extractor__Group_11_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11_3__0_in_rule__Extractor__Group_11__3__Impl11185);
            	    rule__Extractor__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getExtractorAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_11__3__Impl"


    // $ANTLR start "rule__Extractor__Group_11__4"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5674:1: rule__Extractor__Group_11__4 : rule__Extractor__Group_11__4__Impl ;
    public final void rule__Extractor__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5678:1: ( rule__Extractor__Group_11__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5679:2: rule__Extractor__Group_11__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__4__Impl_in_rule__Extractor__Group_11__411216);
            rule__Extractor__Group_11__4__Impl();

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
    // $ANTLR end "rule__Extractor__Group_11__4"


    // $ANTLR start "rule__Extractor__Group_11__4__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5685:1: rule__Extractor__Group_11__4__Impl : ( ')' ) ;
    public final void rule__Extractor__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5689:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5690:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5690:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5691:1: ')'
            {
             before(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_11_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Extractor__Group_11__4__Impl11244); 
             after(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_11__4__Impl"


    // $ANTLR start "rule__Extractor__Group_11_3__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5714:1: rule__Extractor__Group_11_3__0 : rule__Extractor__Group_11_3__0__Impl rule__Extractor__Group_11_3__1 ;
    public final void rule__Extractor__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5718:1: ( rule__Extractor__Group_11_3__0__Impl rule__Extractor__Group_11_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5719:2: rule__Extractor__Group_11_3__0__Impl rule__Extractor__Group_11_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11_3__0__Impl_in_rule__Extractor__Group_11_3__011285);
            rule__Extractor__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11_3__1_in_rule__Extractor__Group_11_3__011288);
            rule__Extractor__Group_11_3__1();

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
    // $ANTLR end "rule__Extractor__Group_11_3__0"


    // $ANTLR start "rule__Extractor__Group_11_3__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5726:1: rule__Extractor__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Extractor__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5730:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5731:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5731:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5732:1: ','
            {
             before(grammarAccess.getExtractorAccess().getCommaKeyword_11_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Extractor__Group_11_3__0__Impl11316); 
             after(grammarAccess.getExtractorAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_11_3__0__Impl"


    // $ANTLR start "rule__Extractor__Group_11_3__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5745:1: rule__Extractor__Group_11_3__1 : rule__Extractor__Group_11_3__1__Impl ;
    public final void rule__Extractor__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5749:1: ( rule__Extractor__Group_11_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5750:2: rule__Extractor__Group_11_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11_3__1__Impl_in_rule__Extractor__Group_11_3__111347);
            rule__Extractor__Group_11_3__1__Impl();

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
    // $ANTLR end "rule__Extractor__Group_11_3__1"


    // $ANTLR start "rule__Extractor__Group_11_3__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5756:1: rule__Extractor__Group_11_3__1__Impl : ( ( rule__Extractor__SignalsAssignment_11_3_1 ) ) ;
    public final void rule__Extractor__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5760:1: ( ( ( rule__Extractor__SignalsAssignment_11_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5761:1: ( ( rule__Extractor__SignalsAssignment_11_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5761:1: ( ( rule__Extractor__SignalsAssignment_11_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5762:1: ( rule__Extractor__SignalsAssignment_11_3_1 )
            {
             before(grammarAccess.getExtractorAccess().getSignalsAssignment_11_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5763:1: ( rule__Extractor__SignalsAssignment_11_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5763:2: rule__Extractor__SignalsAssignment_11_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__SignalsAssignment_11_3_1_in_rule__Extractor__Group_11_3__1__Impl11374);
            rule__Extractor__SignalsAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractorAccess().getSignalsAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__Group_11_3__1__Impl"


    // $ANTLR start "rule__Injector__Group__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5777:1: rule__Injector__Group__0 : rule__Injector__Group__0__Impl rule__Injector__Group__1 ;
    public final void rule__Injector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5781:1: ( rule__Injector__Group__0__Impl rule__Injector__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5782:2: rule__Injector__Group__0__Impl rule__Injector__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__0__Impl_in_rule__Injector__Group__011408);
            rule__Injector__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__1_in_rule__Injector__Group__011411);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5789:1: rule__Injector__Group__0__Impl : ( () ) ;
    public final void rule__Injector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5793:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5794:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5794:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5795:1: ()
            {
             before(grammarAccess.getInjectorAccess().getInjectorAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5796:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5798:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5808:1: rule__Injector__Group__1 : rule__Injector__Group__1__Impl rule__Injector__Group__2 ;
    public final void rule__Injector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5812:1: ( rule__Injector__Group__1__Impl rule__Injector__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5813:2: rule__Injector__Group__1__Impl rule__Injector__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__1__Impl_in_rule__Injector__Group__111469);
            rule__Injector__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__2_in_rule__Injector__Group__111472);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5820:1: rule__Injector__Group__1__Impl : ( 'Injector' ) ;
    public final void rule__Injector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5824:1: ( ( 'Injector' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5825:1: ( 'Injector' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5825:1: ( 'Injector' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5826:1: 'Injector'
            {
             before(grammarAccess.getInjectorAccess().getInjectorKeyword_1()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Injector__Group__1__Impl11500); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5839:1: rule__Injector__Group__2 : rule__Injector__Group__2__Impl rule__Injector__Group__3 ;
    public final void rule__Injector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5843:1: ( rule__Injector__Group__2__Impl rule__Injector__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5844:2: rule__Injector__Group__2__Impl rule__Injector__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__2__Impl_in_rule__Injector__Group__211531);
            rule__Injector__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__3_in_rule__Injector__Group__211534);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5851:1: rule__Injector__Group__2__Impl : ( ( rule__Injector__NameAssignment_2 ) ) ;
    public final void rule__Injector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5855:1: ( ( ( rule__Injector__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5856:1: ( ( rule__Injector__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5856:1: ( ( rule__Injector__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5857:1: ( rule__Injector__NameAssignment_2 )
            {
             before(grammarAccess.getInjectorAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5858:1: ( rule__Injector__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5858:2: rule__Injector__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__NameAssignment_2_in_rule__Injector__Group__2__Impl11561);
            rule__Injector__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5868:1: rule__Injector__Group__3 : rule__Injector__Group__3__Impl rule__Injector__Group__4 ;
    public final void rule__Injector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5872:1: ( rule__Injector__Group__3__Impl rule__Injector__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5873:2: rule__Injector__Group__3__Impl rule__Injector__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__3__Impl_in_rule__Injector__Group__311591);
            rule__Injector__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__4_in_rule__Injector__Group__311594);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5880:1: rule__Injector__Group__3__Impl : ( '{' ) ;
    public final void rule__Injector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5884:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5885:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5885:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5886:1: '{'
            {
             before(grammarAccess.getInjectorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Injector__Group__3__Impl11622); 
             after(grammarAccess.getInjectorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5899:1: rule__Injector__Group__4 : rule__Injector__Group__4__Impl rule__Injector__Group__5 ;
    public final void rule__Injector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5903:1: ( rule__Injector__Group__4__Impl rule__Injector__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5904:2: rule__Injector__Group__4__Impl rule__Injector__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__4__Impl_in_rule__Injector__Group__411653);
            rule__Injector__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__5_in_rule__Injector__Group__411656);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5911:1: rule__Injector__Group__4__Impl : ( ( rule__Injector__Group_4__0 )? ) ;
    public final void rule__Injector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5915:1: ( ( ( rule__Injector__Group_4__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5916:1: ( ( rule__Injector__Group_4__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5916:1: ( ( rule__Injector__Group_4__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5917:1: ( rule__Injector__Group_4__0 )?
            {
             before(grammarAccess.getInjectorAccess().getGroup_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5918:1: ( rule__Injector__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5918:2: rule__Injector__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_4__0_in_rule__Injector__Group__4__Impl11683);
                    rule__Injector__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInjectorAccess().getGroup_4()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5928:1: rule__Injector__Group__5 : rule__Injector__Group__5__Impl rule__Injector__Group__6 ;
    public final void rule__Injector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5932:1: ( rule__Injector__Group__5__Impl rule__Injector__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5933:2: rule__Injector__Group__5__Impl rule__Injector__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__5__Impl_in_rule__Injector__Group__511714);
            rule__Injector__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__6_in_rule__Injector__Group__511717);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5940:1: rule__Injector__Group__5__Impl : ( 'hasStarts' ) ;
    public final void rule__Injector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5944:1: ( ( 'hasStarts' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5945:1: ( 'hasStarts' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5945:1: ( 'hasStarts' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5946:1: 'hasStarts'
            {
             before(grammarAccess.getInjectorAccess().getHasStartsKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Injector__Group__5__Impl11745); 
             after(grammarAccess.getInjectorAccess().getHasStartsKeyword_5()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5959:1: rule__Injector__Group__6 : rule__Injector__Group__6__Impl rule__Injector__Group__7 ;
    public final void rule__Injector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5963:1: ( rule__Injector__Group__6__Impl rule__Injector__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5964:2: rule__Injector__Group__6__Impl rule__Injector__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__6__Impl_in_rule__Injector__Group__611776);
            rule__Injector__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__7_in_rule__Injector__Group__611779);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5971:1: rule__Injector__Group__6__Impl : ( '(' ) ;
    public final void rule__Injector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5975:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5976:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5976:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5977:1: '('
            {
             before(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_6()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Injector__Group__6__Impl11807); 
             after(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5990:1: rule__Injector__Group__7 : rule__Injector__Group__7__Impl rule__Injector__Group__8 ;
    public final void rule__Injector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5994:1: ( rule__Injector__Group__7__Impl rule__Injector__Group__8 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5995:2: rule__Injector__Group__7__Impl rule__Injector__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__7__Impl_in_rule__Injector__Group__711838);
            rule__Injector__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__8_in_rule__Injector__Group__711841);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6002:1: rule__Injector__Group__7__Impl : ( ( rule__Injector__HasStartsAssignment_7 ) ) ;
    public final void rule__Injector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6006:1: ( ( ( rule__Injector__HasStartsAssignment_7 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6007:1: ( ( rule__Injector__HasStartsAssignment_7 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6007:1: ( ( rule__Injector__HasStartsAssignment_7 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6008:1: ( rule__Injector__HasStartsAssignment_7 )
            {
             before(grammarAccess.getInjectorAccess().getHasStartsAssignment_7()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6009:1: ( rule__Injector__HasStartsAssignment_7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6009:2: rule__Injector__HasStartsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__HasStartsAssignment_7_in_rule__Injector__Group__7__Impl11868);
            rule__Injector__HasStartsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getHasStartsAssignment_7()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6019:1: rule__Injector__Group__8 : rule__Injector__Group__8__Impl rule__Injector__Group__9 ;
    public final void rule__Injector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6023:1: ( rule__Injector__Group__8__Impl rule__Injector__Group__9 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6024:2: rule__Injector__Group__8__Impl rule__Injector__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__8__Impl_in_rule__Injector__Group__811898);
            rule__Injector__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__9_in_rule__Injector__Group__811901);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6031:1: rule__Injector__Group__8__Impl : ( ( rule__Injector__Group_8__0 )* ) ;
    public final void rule__Injector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6035:1: ( ( ( rule__Injector__Group_8__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6036:1: ( ( rule__Injector__Group_8__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6036:1: ( ( rule__Injector__Group_8__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6037:1: ( rule__Injector__Group_8__0 )*
            {
             before(grammarAccess.getInjectorAccess().getGroup_8()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6038:1: ( rule__Injector__Group_8__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==17) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6038:2: rule__Injector__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_8__0_in_rule__Injector__Group__8__Impl11928);
            	    rule__Injector__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getInjectorAccess().getGroup_8()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6048:1: rule__Injector__Group__9 : rule__Injector__Group__9__Impl rule__Injector__Group__10 ;
    public final void rule__Injector__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6052:1: ( rule__Injector__Group__9__Impl rule__Injector__Group__10 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6053:2: rule__Injector__Group__9__Impl rule__Injector__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__9__Impl_in_rule__Injector__Group__911959);
            rule__Injector__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__10_in_rule__Injector__Group__911962);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6060:1: rule__Injector__Group__9__Impl : ( ')' ) ;
    public final void rule__Injector__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6064:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6065:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6065:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6066:1: ')'
            {
             before(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_9()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Injector__Group__9__Impl11990); 
             after(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6079:1: rule__Injector__Group__10 : rule__Injector__Group__10__Impl rule__Injector__Group__11 ;
    public final void rule__Injector__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6083:1: ( rule__Injector__Group__10__Impl rule__Injector__Group__11 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6084:2: rule__Injector__Group__10__Impl rule__Injector__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__10__Impl_in_rule__Injector__Group__1012021);
            rule__Injector__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__11_in_rule__Injector__Group__1012024);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6091:1: rule__Injector__Group__10__Impl : ( ( rule__Injector__Group_10__0 )? ) ;
    public final void rule__Injector__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6095:1: ( ( ( rule__Injector__Group_10__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6096:1: ( ( rule__Injector__Group_10__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6096:1: ( ( rule__Injector__Group_10__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6097:1: ( rule__Injector__Group_10__0 )?
            {
             before(grammarAccess.getInjectorAccess().getGroup_10()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6098:1: ( rule__Injector__Group_10__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6098:2: rule__Injector__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__0_in_rule__Injector__Group__10__Impl12051);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6108:1: rule__Injector__Group__11 : rule__Injector__Group__11__Impl rule__Injector__Group__12 ;
    public final void rule__Injector__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6112:1: ( rule__Injector__Group__11__Impl rule__Injector__Group__12 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6113:2: rule__Injector__Group__11__Impl rule__Injector__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__11__Impl_in_rule__Injector__Group__1112082);
            rule__Injector__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__12_in_rule__Injector__Group__1112085);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6120:1: rule__Injector__Group__11__Impl : ( ( rule__Injector__Group_11__0 )? ) ;
    public final void rule__Injector__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6124:1: ( ( ( rule__Injector__Group_11__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6125:1: ( ( rule__Injector__Group_11__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6125:1: ( ( rule__Injector__Group_11__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6126:1: ( rule__Injector__Group_11__0 )?
            {
             before(grammarAccess.getInjectorAccess().getGroup_11()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6127:1: ( rule__Injector__Group_11__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==27) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6127:2: rule__Injector__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__0_in_rule__Injector__Group__11__Impl12112);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6137:1: rule__Injector__Group__12 : rule__Injector__Group__12__Impl rule__Injector__Group__13 ;
    public final void rule__Injector__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6141:1: ( rule__Injector__Group__12__Impl rule__Injector__Group__13 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6142:2: rule__Injector__Group__12__Impl rule__Injector__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__12__Impl_in_rule__Injector__Group__1212143);
            rule__Injector__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__13_in_rule__Injector__Group__1212146);
            rule__Injector__Group__13();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6149:1: rule__Injector__Group__12__Impl : ( ( rule__Injector__Group_12__0 )? ) ;
    public final void rule__Injector__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6153:1: ( ( ( rule__Injector__Group_12__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6154:1: ( ( rule__Injector__Group_12__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6154:1: ( ( rule__Injector__Group_12__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6155:1: ( rule__Injector__Group_12__0 )?
            {
             before(grammarAccess.getInjectorAccess().getGroup_12()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6156:1: ( rule__Injector__Group_12__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6156:2: rule__Injector__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__0_in_rule__Injector__Group__12__Impl12173);
                    rule__Injector__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInjectorAccess().getGroup_12()); 

            }


            }

        }
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


    // $ANTLR start "rule__Injector__Group__13"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6166:1: rule__Injector__Group__13 : rule__Injector__Group__13__Impl ;
    public final void rule__Injector__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6170:1: ( rule__Injector__Group__13__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6171:2: rule__Injector__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__13__Impl_in_rule__Injector__Group__1312204);
            rule__Injector__Group__13__Impl();

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
    // $ANTLR end "rule__Injector__Group__13"


    // $ANTLR start "rule__Injector__Group__13__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6177:1: rule__Injector__Group__13__Impl : ( '}' ) ;
    public final void rule__Injector__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6181:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6182:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6182:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6183:1: '}'
            {
             before(grammarAccess.getInjectorAccess().getRightCurlyBracketKeyword_13()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Injector__Group__13__Impl12232); 
             after(grammarAccess.getInjectorAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group__13__Impl"


    // $ANTLR start "rule__Injector__Group_4__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6224:1: rule__Injector__Group_4__0 : rule__Injector__Group_4__0__Impl rule__Injector__Group_4__1 ;
    public final void rule__Injector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6228:1: ( rule__Injector__Group_4__0__Impl rule__Injector__Group_4__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6229:2: rule__Injector__Group_4__0__Impl rule__Injector__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_4__0__Impl_in_rule__Injector__Group_4__012291);
            rule__Injector__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_4__1_in_rule__Injector__Group_4__012294);
            rule__Injector__Group_4__1();

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
    // $ANTLR end "rule__Injector__Group_4__0"


    // $ANTLR start "rule__Injector__Group_4__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6236:1: rule__Injector__Group_4__0__Impl : ( 'carsPerHour' ) ;
    public final void rule__Injector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6240:1: ( ( 'carsPerHour' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6241:1: ( 'carsPerHour' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6241:1: ( 'carsPerHour' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6242:1: 'carsPerHour'
            {
             before(grammarAccess.getInjectorAccess().getCarsPerHourKeyword_4_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Injector__Group_4__0__Impl12322); 
             after(grammarAccess.getInjectorAccess().getCarsPerHourKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_4__0__Impl"


    // $ANTLR start "rule__Injector__Group_4__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6255:1: rule__Injector__Group_4__1 : rule__Injector__Group_4__1__Impl ;
    public final void rule__Injector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6259:1: ( rule__Injector__Group_4__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6260:2: rule__Injector__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_4__1__Impl_in_rule__Injector__Group_4__112353);
            rule__Injector__Group_4__1__Impl();

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
    // $ANTLR end "rule__Injector__Group_4__1"


    // $ANTLR start "rule__Injector__Group_4__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6266:1: rule__Injector__Group_4__1__Impl : ( ( rule__Injector__CarsPerHourAssignment_4_1 ) ) ;
    public final void rule__Injector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6270:1: ( ( ( rule__Injector__CarsPerHourAssignment_4_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6271:1: ( ( rule__Injector__CarsPerHourAssignment_4_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6271:1: ( ( rule__Injector__CarsPerHourAssignment_4_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6272:1: ( rule__Injector__CarsPerHourAssignment_4_1 )
            {
             before(grammarAccess.getInjectorAccess().getCarsPerHourAssignment_4_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6273:1: ( rule__Injector__CarsPerHourAssignment_4_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6273:2: rule__Injector__CarsPerHourAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__CarsPerHourAssignment_4_1_in_rule__Injector__Group_4__1__Impl12380);
            rule__Injector__CarsPerHourAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getCarsPerHourAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_4__1__Impl"


    // $ANTLR start "rule__Injector__Group_8__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6287:1: rule__Injector__Group_8__0 : rule__Injector__Group_8__0__Impl rule__Injector__Group_8__1 ;
    public final void rule__Injector__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6291:1: ( rule__Injector__Group_8__0__Impl rule__Injector__Group_8__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6292:2: rule__Injector__Group_8__0__Impl rule__Injector__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_8__0__Impl_in_rule__Injector__Group_8__012414);
            rule__Injector__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_8__1_in_rule__Injector__Group_8__012417);
            rule__Injector__Group_8__1();

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
    // $ANTLR end "rule__Injector__Group_8__0"


    // $ANTLR start "rule__Injector__Group_8__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6299:1: rule__Injector__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Injector__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6303:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6304:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6304:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6305:1: ','
            {
             before(grammarAccess.getInjectorAccess().getCommaKeyword_8_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Injector__Group_8__0__Impl12445); 
             after(grammarAccess.getInjectorAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_8__0__Impl"


    // $ANTLR start "rule__Injector__Group_8__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6318:1: rule__Injector__Group_8__1 : rule__Injector__Group_8__1__Impl ;
    public final void rule__Injector__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6322:1: ( rule__Injector__Group_8__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6323:2: rule__Injector__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_8__1__Impl_in_rule__Injector__Group_8__112476);
            rule__Injector__Group_8__1__Impl();

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
    // $ANTLR end "rule__Injector__Group_8__1"


    // $ANTLR start "rule__Injector__Group_8__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6329:1: rule__Injector__Group_8__1__Impl : ( ( rule__Injector__HasStartsAssignment_8_1 ) ) ;
    public final void rule__Injector__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6333:1: ( ( ( rule__Injector__HasStartsAssignment_8_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6334:1: ( ( rule__Injector__HasStartsAssignment_8_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6334:1: ( ( rule__Injector__HasStartsAssignment_8_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6335:1: ( rule__Injector__HasStartsAssignment_8_1 )
            {
             before(grammarAccess.getInjectorAccess().getHasStartsAssignment_8_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6336:1: ( rule__Injector__HasStartsAssignment_8_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6336:2: rule__Injector__HasStartsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__HasStartsAssignment_8_1_in_rule__Injector__Group_8__1__Impl12503);
            rule__Injector__HasStartsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getHasStartsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_8__1__Impl"


    // $ANTLR start "rule__Injector__Group_10__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6350:1: rule__Injector__Group_10__0 : rule__Injector__Group_10__0__Impl rule__Injector__Group_10__1 ;
    public final void rule__Injector__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6354:1: ( rule__Injector__Group_10__0__Impl rule__Injector__Group_10__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6355:2: rule__Injector__Group_10__0__Impl rule__Injector__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__0__Impl_in_rule__Injector__Group_10__012537);
            rule__Injector__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__1_in_rule__Injector__Group_10__012540);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6362:1: rule__Injector__Group_10__0__Impl : ( 'hasEnds' ) ;
    public final void rule__Injector__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6366:1: ( ( 'hasEnds' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6367:1: ( 'hasEnds' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6367:1: ( 'hasEnds' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6368:1: 'hasEnds'
            {
             before(grammarAccess.getInjectorAccess().getHasEndsKeyword_10_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Injector__Group_10__0__Impl12568); 
             after(grammarAccess.getInjectorAccess().getHasEndsKeyword_10_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6381:1: rule__Injector__Group_10__1 : rule__Injector__Group_10__1__Impl rule__Injector__Group_10__2 ;
    public final void rule__Injector__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6385:1: ( rule__Injector__Group_10__1__Impl rule__Injector__Group_10__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6386:2: rule__Injector__Group_10__1__Impl rule__Injector__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__1__Impl_in_rule__Injector__Group_10__112599);
            rule__Injector__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__2_in_rule__Injector__Group_10__112602);
            rule__Injector__Group_10__2();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6393:1: rule__Injector__Group_10__1__Impl : ( '(' ) ;
    public final void rule__Injector__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6397:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6398:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6398:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6399:1: '('
            {
             before(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Injector__Group_10__1__Impl12630); 
             after(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Injector__Group_10__2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6412:1: rule__Injector__Group_10__2 : rule__Injector__Group_10__2__Impl rule__Injector__Group_10__3 ;
    public final void rule__Injector__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6416:1: ( rule__Injector__Group_10__2__Impl rule__Injector__Group_10__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6417:2: rule__Injector__Group_10__2__Impl rule__Injector__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__2__Impl_in_rule__Injector__Group_10__212661);
            rule__Injector__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__3_in_rule__Injector__Group_10__212664);
            rule__Injector__Group_10__3();

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
    // $ANTLR end "rule__Injector__Group_10__2"


    // $ANTLR start "rule__Injector__Group_10__2__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6424:1: rule__Injector__Group_10__2__Impl : ( ( rule__Injector__HasEndsAssignment_10_2 ) ) ;
    public final void rule__Injector__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6428:1: ( ( ( rule__Injector__HasEndsAssignment_10_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6429:1: ( ( rule__Injector__HasEndsAssignment_10_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6429:1: ( ( rule__Injector__HasEndsAssignment_10_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6430:1: ( rule__Injector__HasEndsAssignment_10_2 )
            {
             before(grammarAccess.getInjectorAccess().getHasEndsAssignment_10_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6431:1: ( rule__Injector__HasEndsAssignment_10_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6431:2: rule__Injector__HasEndsAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__HasEndsAssignment_10_2_in_rule__Injector__Group_10__2__Impl12691);
            rule__Injector__HasEndsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getHasEndsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_10__2__Impl"


    // $ANTLR start "rule__Injector__Group_10__3"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6441:1: rule__Injector__Group_10__3 : rule__Injector__Group_10__3__Impl rule__Injector__Group_10__4 ;
    public final void rule__Injector__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6445:1: ( rule__Injector__Group_10__3__Impl rule__Injector__Group_10__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6446:2: rule__Injector__Group_10__3__Impl rule__Injector__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__3__Impl_in_rule__Injector__Group_10__312721);
            rule__Injector__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__4_in_rule__Injector__Group_10__312724);
            rule__Injector__Group_10__4();

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
    // $ANTLR end "rule__Injector__Group_10__3"


    // $ANTLR start "rule__Injector__Group_10__3__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6453:1: rule__Injector__Group_10__3__Impl : ( ( rule__Injector__Group_10_3__0 )* ) ;
    public final void rule__Injector__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6457:1: ( ( ( rule__Injector__Group_10_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6458:1: ( ( rule__Injector__Group_10_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6458:1: ( ( rule__Injector__Group_10_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6459:1: ( rule__Injector__Group_10_3__0 )*
            {
             before(grammarAccess.getInjectorAccess().getGroup_10_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6460:1: ( rule__Injector__Group_10_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==17) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6460:2: rule__Injector__Group_10_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10_3__0_in_rule__Injector__Group_10__3__Impl12751);
            	    rule__Injector__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getInjectorAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_10__3__Impl"


    // $ANTLR start "rule__Injector__Group_10__4"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6470:1: rule__Injector__Group_10__4 : rule__Injector__Group_10__4__Impl ;
    public final void rule__Injector__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6474:1: ( rule__Injector__Group_10__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6475:2: rule__Injector__Group_10__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__4__Impl_in_rule__Injector__Group_10__412782);
            rule__Injector__Group_10__4__Impl();

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
    // $ANTLR end "rule__Injector__Group_10__4"


    // $ANTLR start "rule__Injector__Group_10__4__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6481:1: rule__Injector__Group_10__4__Impl : ( ')' ) ;
    public final void rule__Injector__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6485:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6486:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6486:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6487:1: ')'
            {
             before(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_10_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Injector__Group_10__4__Impl12810); 
             after(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_10__4__Impl"


    // $ANTLR start "rule__Injector__Group_10_3__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6510:1: rule__Injector__Group_10_3__0 : rule__Injector__Group_10_3__0__Impl rule__Injector__Group_10_3__1 ;
    public final void rule__Injector__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6514:1: ( rule__Injector__Group_10_3__0__Impl rule__Injector__Group_10_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6515:2: rule__Injector__Group_10_3__0__Impl rule__Injector__Group_10_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10_3__0__Impl_in_rule__Injector__Group_10_3__012851);
            rule__Injector__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10_3__1_in_rule__Injector__Group_10_3__012854);
            rule__Injector__Group_10_3__1();

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
    // $ANTLR end "rule__Injector__Group_10_3__0"


    // $ANTLR start "rule__Injector__Group_10_3__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6522:1: rule__Injector__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Injector__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6526:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6527:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6527:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6528:1: ','
            {
             before(grammarAccess.getInjectorAccess().getCommaKeyword_10_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Injector__Group_10_3__0__Impl12882); 
             after(grammarAccess.getInjectorAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_10_3__0__Impl"


    // $ANTLR start "rule__Injector__Group_10_3__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6541:1: rule__Injector__Group_10_3__1 : rule__Injector__Group_10_3__1__Impl ;
    public final void rule__Injector__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6545:1: ( rule__Injector__Group_10_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6546:2: rule__Injector__Group_10_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10_3__1__Impl_in_rule__Injector__Group_10_3__112913);
            rule__Injector__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__Injector__Group_10_3__1"


    // $ANTLR start "rule__Injector__Group_10_3__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6552:1: rule__Injector__Group_10_3__1__Impl : ( ( rule__Injector__HasEndsAssignment_10_3_1 ) ) ;
    public final void rule__Injector__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6556:1: ( ( ( rule__Injector__HasEndsAssignment_10_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6557:1: ( ( rule__Injector__HasEndsAssignment_10_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6557:1: ( ( rule__Injector__HasEndsAssignment_10_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6558:1: ( rule__Injector__HasEndsAssignment_10_3_1 )
            {
             before(grammarAccess.getInjectorAccess().getHasEndsAssignment_10_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6559:1: ( rule__Injector__HasEndsAssignment_10_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6559:2: rule__Injector__HasEndsAssignment_10_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__HasEndsAssignment_10_3_1_in_rule__Injector__Group_10_3__1__Impl12940);
            rule__Injector__HasEndsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getHasEndsAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_10_3__1__Impl"


    // $ANTLR start "rule__Injector__Group_11__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6573:1: rule__Injector__Group_11__0 : rule__Injector__Group_11__0__Impl rule__Injector__Group_11__1 ;
    public final void rule__Injector__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6577:1: ( rule__Injector__Group_11__0__Impl rule__Injector__Group_11__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6578:2: rule__Injector__Group_11__0__Impl rule__Injector__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__0__Impl_in_rule__Injector__Group_11__012974);
            rule__Injector__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__1_in_rule__Injector__Group_11__012977);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6585:1: rule__Injector__Group_11__0__Impl : ( 'semaphore' ) ;
    public final void rule__Injector__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6589:1: ( ( 'semaphore' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6590:1: ( 'semaphore' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6590:1: ( 'semaphore' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6591:1: 'semaphore'
            {
             before(grammarAccess.getInjectorAccess().getSemaphoreKeyword_11_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Injector__Group_11__0__Impl13005); 
             after(grammarAccess.getInjectorAccess().getSemaphoreKeyword_11_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6604:1: rule__Injector__Group_11__1 : rule__Injector__Group_11__1__Impl ;
    public final void rule__Injector__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6608:1: ( rule__Injector__Group_11__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6609:2: rule__Injector__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__1__Impl_in_rule__Injector__Group_11__113036);
            rule__Injector__Group_11__1__Impl();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6615:1: rule__Injector__Group_11__1__Impl : ( ( rule__Injector__SemaphoreAssignment_11_1 ) ) ;
    public final void rule__Injector__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6619:1: ( ( ( rule__Injector__SemaphoreAssignment_11_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6620:1: ( ( rule__Injector__SemaphoreAssignment_11_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6620:1: ( ( rule__Injector__SemaphoreAssignment_11_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6621:1: ( rule__Injector__SemaphoreAssignment_11_1 )
            {
             before(grammarAccess.getInjectorAccess().getSemaphoreAssignment_11_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6622:1: ( rule__Injector__SemaphoreAssignment_11_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6622:2: rule__Injector__SemaphoreAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__SemaphoreAssignment_11_1_in_rule__Injector__Group_11__1__Impl13063);
            rule__Injector__SemaphoreAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getSemaphoreAssignment_11_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Injector__Group_12__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6636:1: rule__Injector__Group_12__0 : rule__Injector__Group_12__0__Impl rule__Injector__Group_12__1 ;
    public final void rule__Injector__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6640:1: ( rule__Injector__Group_12__0__Impl rule__Injector__Group_12__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6641:2: rule__Injector__Group_12__0__Impl rule__Injector__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__0__Impl_in_rule__Injector__Group_12__013097);
            rule__Injector__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__1_in_rule__Injector__Group_12__013100);
            rule__Injector__Group_12__1();

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
    // $ANTLR end "rule__Injector__Group_12__0"


    // $ANTLR start "rule__Injector__Group_12__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6648:1: rule__Injector__Group_12__0__Impl : ( 'signals' ) ;
    public final void rule__Injector__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6652:1: ( ( 'signals' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6653:1: ( 'signals' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6653:1: ( 'signals' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6654:1: 'signals'
            {
             before(grammarAccess.getInjectorAccess().getSignalsKeyword_12_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Injector__Group_12__0__Impl13128); 
             after(grammarAccess.getInjectorAccess().getSignalsKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_12__0__Impl"


    // $ANTLR start "rule__Injector__Group_12__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6667:1: rule__Injector__Group_12__1 : rule__Injector__Group_12__1__Impl rule__Injector__Group_12__2 ;
    public final void rule__Injector__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6671:1: ( rule__Injector__Group_12__1__Impl rule__Injector__Group_12__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6672:2: rule__Injector__Group_12__1__Impl rule__Injector__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__1__Impl_in_rule__Injector__Group_12__113159);
            rule__Injector__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__2_in_rule__Injector__Group_12__113162);
            rule__Injector__Group_12__2();

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
    // $ANTLR end "rule__Injector__Group_12__1"


    // $ANTLR start "rule__Injector__Group_12__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6679:1: rule__Injector__Group_12__1__Impl : ( '(' ) ;
    public final void rule__Injector__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6683:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6684:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6684:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6685:1: '('
            {
             before(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_12_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Injector__Group_12__1__Impl13190); 
             after(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_12__1__Impl"


    // $ANTLR start "rule__Injector__Group_12__2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6698:1: rule__Injector__Group_12__2 : rule__Injector__Group_12__2__Impl rule__Injector__Group_12__3 ;
    public final void rule__Injector__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6702:1: ( rule__Injector__Group_12__2__Impl rule__Injector__Group_12__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6703:2: rule__Injector__Group_12__2__Impl rule__Injector__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__2__Impl_in_rule__Injector__Group_12__213221);
            rule__Injector__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__3_in_rule__Injector__Group_12__213224);
            rule__Injector__Group_12__3();

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
    // $ANTLR end "rule__Injector__Group_12__2"


    // $ANTLR start "rule__Injector__Group_12__2__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6710:1: rule__Injector__Group_12__2__Impl : ( ( rule__Injector__SignalsAssignment_12_2 ) ) ;
    public final void rule__Injector__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6714:1: ( ( ( rule__Injector__SignalsAssignment_12_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6715:1: ( ( rule__Injector__SignalsAssignment_12_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6715:1: ( ( rule__Injector__SignalsAssignment_12_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6716:1: ( rule__Injector__SignalsAssignment_12_2 )
            {
             before(grammarAccess.getInjectorAccess().getSignalsAssignment_12_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6717:1: ( rule__Injector__SignalsAssignment_12_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6717:2: rule__Injector__SignalsAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__SignalsAssignment_12_2_in_rule__Injector__Group_12__2__Impl13251);
            rule__Injector__SignalsAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getSignalsAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_12__2__Impl"


    // $ANTLR start "rule__Injector__Group_12__3"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6727:1: rule__Injector__Group_12__3 : rule__Injector__Group_12__3__Impl rule__Injector__Group_12__4 ;
    public final void rule__Injector__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6731:1: ( rule__Injector__Group_12__3__Impl rule__Injector__Group_12__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6732:2: rule__Injector__Group_12__3__Impl rule__Injector__Group_12__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__3__Impl_in_rule__Injector__Group_12__313281);
            rule__Injector__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__4_in_rule__Injector__Group_12__313284);
            rule__Injector__Group_12__4();

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
    // $ANTLR end "rule__Injector__Group_12__3"


    // $ANTLR start "rule__Injector__Group_12__3__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6739:1: rule__Injector__Group_12__3__Impl : ( ( rule__Injector__Group_12_3__0 )* ) ;
    public final void rule__Injector__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6743:1: ( ( ( rule__Injector__Group_12_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6744:1: ( ( rule__Injector__Group_12_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6744:1: ( ( rule__Injector__Group_12_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6745:1: ( rule__Injector__Group_12_3__0 )*
            {
             before(grammarAccess.getInjectorAccess().getGroup_12_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6746:1: ( rule__Injector__Group_12_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==17) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6746:2: rule__Injector__Group_12_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12_3__0_in_rule__Injector__Group_12__3__Impl13311);
            	    rule__Injector__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getInjectorAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_12__3__Impl"


    // $ANTLR start "rule__Injector__Group_12__4"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6756:1: rule__Injector__Group_12__4 : rule__Injector__Group_12__4__Impl ;
    public final void rule__Injector__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6760:1: ( rule__Injector__Group_12__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6761:2: rule__Injector__Group_12__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__4__Impl_in_rule__Injector__Group_12__413342);
            rule__Injector__Group_12__4__Impl();

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
    // $ANTLR end "rule__Injector__Group_12__4"


    // $ANTLR start "rule__Injector__Group_12__4__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6767:1: rule__Injector__Group_12__4__Impl : ( ')' ) ;
    public final void rule__Injector__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6771:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6772:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6772:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6773:1: ')'
            {
             before(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_12_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Injector__Group_12__4__Impl13370); 
             after(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_12__4__Impl"


    // $ANTLR start "rule__Injector__Group_12_3__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6796:1: rule__Injector__Group_12_3__0 : rule__Injector__Group_12_3__0__Impl rule__Injector__Group_12_3__1 ;
    public final void rule__Injector__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6800:1: ( rule__Injector__Group_12_3__0__Impl rule__Injector__Group_12_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6801:2: rule__Injector__Group_12_3__0__Impl rule__Injector__Group_12_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12_3__0__Impl_in_rule__Injector__Group_12_3__013411);
            rule__Injector__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12_3__1_in_rule__Injector__Group_12_3__013414);
            rule__Injector__Group_12_3__1();

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
    // $ANTLR end "rule__Injector__Group_12_3__0"


    // $ANTLR start "rule__Injector__Group_12_3__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6808:1: rule__Injector__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Injector__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6812:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6813:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6813:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6814:1: ','
            {
             before(grammarAccess.getInjectorAccess().getCommaKeyword_12_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Injector__Group_12_3__0__Impl13442); 
             after(grammarAccess.getInjectorAccess().getCommaKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_12_3__0__Impl"


    // $ANTLR start "rule__Injector__Group_12_3__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6827:1: rule__Injector__Group_12_3__1 : rule__Injector__Group_12_3__1__Impl ;
    public final void rule__Injector__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6831:1: ( rule__Injector__Group_12_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6832:2: rule__Injector__Group_12_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12_3__1__Impl_in_rule__Injector__Group_12_3__113473);
            rule__Injector__Group_12_3__1__Impl();

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
    // $ANTLR end "rule__Injector__Group_12_3__1"


    // $ANTLR start "rule__Injector__Group_12_3__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6838:1: rule__Injector__Group_12_3__1__Impl : ( ( rule__Injector__SignalsAssignment_12_3_1 ) ) ;
    public final void rule__Injector__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6842:1: ( ( ( rule__Injector__SignalsAssignment_12_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6843:1: ( ( rule__Injector__SignalsAssignment_12_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6843:1: ( ( rule__Injector__SignalsAssignment_12_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6844:1: ( rule__Injector__SignalsAssignment_12_3_1 )
            {
             before(grammarAccess.getInjectorAccess().getSignalsAssignment_12_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6845:1: ( rule__Injector__SignalsAssignment_12_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6845:2: rule__Injector__SignalsAssignment_12_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__SignalsAssignment_12_3_1_in_rule__Injector__Group_12_3__1__Impl13500);
            rule__Injector__SignalsAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInjectorAccess().getSignalsAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__Group_12_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6859:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6863:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6864:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__013534);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__013537);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6871:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6875:1: ( ( ( '-' )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6876:1: ( ( '-' )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6876:1: ( ( '-' )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6877:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6878:1: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6879:2: '-'
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_rule__EInt__Group__0__Impl13566); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6890:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6894:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6895:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__113599);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6901:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6905:1: ( ( RULE_INT ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6906:1: ( RULE_INT )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6906:1: ( RULE_INT )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6907:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl13626); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6922:1: rule__Speedlimit__Group__0 : rule__Speedlimit__Group__0__Impl rule__Speedlimit__Group__1 ;
    public final void rule__Speedlimit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6926:1: ( rule__Speedlimit__Group__0__Impl rule__Speedlimit__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6927:2: rule__Speedlimit__Group__0__Impl rule__Speedlimit__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__0__Impl_in_rule__Speedlimit__Group__013659);
            rule__Speedlimit__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__1_in_rule__Speedlimit__Group__013662);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6934:1: rule__Speedlimit__Group__0__Impl : ( 'Speedlimit' ) ;
    public final void rule__Speedlimit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6938:1: ( ( 'Speedlimit' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6939:1: ( 'Speedlimit' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6939:1: ( 'Speedlimit' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6940:1: 'Speedlimit'
            {
             before(grammarAccess.getSpeedlimitAccess().getSpeedlimitKeyword_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Speedlimit__Group__0__Impl13690); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6953:1: rule__Speedlimit__Group__1 : rule__Speedlimit__Group__1__Impl rule__Speedlimit__Group__2 ;
    public final void rule__Speedlimit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6957:1: ( rule__Speedlimit__Group__1__Impl rule__Speedlimit__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6958:2: rule__Speedlimit__Group__1__Impl rule__Speedlimit__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__1__Impl_in_rule__Speedlimit__Group__113721);
            rule__Speedlimit__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__2_in_rule__Speedlimit__Group__113724);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6965:1: rule__Speedlimit__Group__1__Impl : ( ( rule__Speedlimit__NameAssignment_1 ) ) ;
    public final void rule__Speedlimit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6969:1: ( ( ( rule__Speedlimit__NameAssignment_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6970:1: ( ( rule__Speedlimit__NameAssignment_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6970:1: ( ( rule__Speedlimit__NameAssignment_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6971:1: ( rule__Speedlimit__NameAssignment_1 )
            {
             before(grammarAccess.getSpeedlimitAccess().getNameAssignment_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6972:1: ( rule__Speedlimit__NameAssignment_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6972:2: rule__Speedlimit__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__NameAssignment_1_in_rule__Speedlimit__Group__1__Impl13751);
            rule__Speedlimit__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpeedlimitAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6982:1: rule__Speedlimit__Group__2 : rule__Speedlimit__Group__2__Impl rule__Speedlimit__Group__3 ;
    public final void rule__Speedlimit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6986:1: ( rule__Speedlimit__Group__2__Impl rule__Speedlimit__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6987:2: rule__Speedlimit__Group__2__Impl rule__Speedlimit__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__2__Impl_in_rule__Speedlimit__Group__213781);
            rule__Speedlimit__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__3_in_rule__Speedlimit__Group__213784);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6994:1: rule__Speedlimit__Group__2__Impl : ( '{' ) ;
    public final void rule__Speedlimit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6998:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6999:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6999:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7000:1: '{'
            {
             before(grammarAccess.getSpeedlimitAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Speedlimit__Group__2__Impl13812); 
             after(grammarAccess.getSpeedlimitAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7013:1: rule__Speedlimit__Group__3 : rule__Speedlimit__Group__3__Impl rule__Speedlimit__Group__4 ;
    public final void rule__Speedlimit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7017:1: ( rule__Speedlimit__Group__3__Impl rule__Speedlimit__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7018:2: rule__Speedlimit__Group__3__Impl rule__Speedlimit__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__3__Impl_in_rule__Speedlimit__Group__313843);
            rule__Speedlimit__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__4_in_rule__Speedlimit__Group__313846);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7025:1: rule__Speedlimit__Group__3__Impl : ( ( rule__Speedlimit__Group_3__0 )? ) ;
    public final void rule__Speedlimit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7029:1: ( ( ( rule__Speedlimit__Group_3__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7030:1: ( ( rule__Speedlimit__Group_3__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7030:1: ( ( rule__Speedlimit__Group_3__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7031:1: ( rule__Speedlimit__Group_3__0 )?
            {
             before(grammarAccess.getSpeedlimitAccess().getGroup_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7032:1: ( rule__Speedlimit__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7032:2: rule__Speedlimit__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group_3__0_in_rule__Speedlimit__Group__3__Impl13873);
                    rule__Speedlimit__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpeedlimitAccess().getGroup_3()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7042:1: rule__Speedlimit__Group__4 : rule__Speedlimit__Group__4__Impl rule__Speedlimit__Group__5 ;
    public final void rule__Speedlimit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7046:1: ( rule__Speedlimit__Group__4__Impl rule__Speedlimit__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7047:2: rule__Speedlimit__Group__4__Impl rule__Speedlimit__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__4__Impl_in_rule__Speedlimit__Group__413904);
            rule__Speedlimit__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__5_in_rule__Speedlimit__Group__413907);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7054:1: rule__Speedlimit__Group__4__Impl : ( 'belongsTo' ) ;
    public final void rule__Speedlimit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7058:1: ( ( 'belongsTo' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7059:1: ( 'belongsTo' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7059:1: ( 'belongsTo' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7060:1: 'belongsTo'
            {
             before(grammarAccess.getSpeedlimitAccess().getBelongsToKeyword_4()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Speedlimit__Group__4__Impl13935); 
             after(grammarAccess.getSpeedlimitAccess().getBelongsToKeyword_4()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7073:1: rule__Speedlimit__Group__5 : rule__Speedlimit__Group__5__Impl rule__Speedlimit__Group__6 ;
    public final void rule__Speedlimit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7077:1: ( rule__Speedlimit__Group__5__Impl rule__Speedlimit__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7078:2: rule__Speedlimit__Group__5__Impl rule__Speedlimit__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__5__Impl_in_rule__Speedlimit__Group__513966);
            rule__Speedlimit__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__6_in_rule__Speedlimit__Group__513969);
            rule__Speedlimit__Group__6();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7085:1: rule__Speedlimit__Group__5__Impl : ( ( rule__Speedlimit__BelongsToAssignment_5 ) ) ;
    public final void rule__Speedlimit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7089:1: ( ( ( rule__Speedlimit__BelongsToAssignment_5 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7090:1: ( ( rule__Speedlimit__BelongsToAssignment_5 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7090:1: ( ( rule__Speedlimit__BelongsToAssignment_5 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7091:1: ( rule__Speedlimit__BelongsToAssignment_5 )
            {
             before(grammarAccess.getSpeedlimitAccess().getBelongsToAssignment_5()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7092:1: ( rule__Speedlimit__BelongsToAssignment_5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7092:2: rule__Speedlimit__BelongsToAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__BelongsToAssignment_5_in_rule__Speedlimit__Group__5__Impl13996);
            rule__Speedlimit__BelongsToAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSpeedlimitAccess().getBelongsToAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Speedlimit__Group__6"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7102:1: rule__Speedlimit__Group__6 : rule__Speedlimit__Group__6__Impl ;
    public final void rule__Speedlimit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7106:1: ( rule__Speedlimit__Group__6__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7107:2: rule__Speedlimit__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__6__Impl_in_rule__Speedlimit__Group__614026);
            rule__Speedlimit__Group__6__Impl();

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
    // $ANTLR end "rule__Speedlimit__Group__6"


    // $ANTLR start "rule__Speedlimit__Group__6__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7113:1: rule__Speedlimit__Group__6__Impl : ( '}' ) ;
    public final void rule__Speedlimit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7117:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7118:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7118:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7119:1: '}'
            {
             before(grammarAccess.getSpeedlimitAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Speedlimit__Group__6__Impl14054); 
             after(grammarAccess.getSpeedlimitAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group__6__Impl"


    // $ANTLR start "rule__Speedlimit__Group_3__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7146:1: rule__Speedlimit__Group_3__0 : rule__Speedlimit__Group_3__0__Impl rule__Speedlimit__Group_3__1 ;
    public final void rule__Speedlimit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7150:1: ( rule__Speedlimit__Group_3__0__Impl rule__Speedlimit__Group_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7151:2: rule__Speedlimit__Group_3__0__Impl rule__Speedlimit__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group_3__0__Impl_in_rule__Speedlimit__Group_3__014099);
            rule__Speedlimit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group_3__1_in_rule__Speedlimit__Group_3__014102);
            rule__Speedlimit__Group_3__1();

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
    // $ANTLR end "rule__Speedlimit__Group_3__0"


    // $ANTLR start "rule__Speedlimit__Group_3__0__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7158:1: rule__Speedlimit__Group_3__0__Impl : ( 'Speed' ) ;
    public final void rule__Speedlimit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7162:1: ( ( 'Speed' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7163:1: ( 'Speed' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7163:1: ( 'Speed' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7164:1: 'Speed'
            {
             before(grammarAccess.getSpeedlimitAccess().getSpeedKeyword_3_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Speedlimit__Group_3__0__Impl14130); 
             after(grammarAccess.getSpeedlimitAccess().getSpeedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group_3__0__Impl"


    // $ANTLR start "rule__Speedlimit__Group_3__1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7177:1: rule__Speedlimit__Group_3__1 : rule__Speedlimit__Group_3__1__Impl ;
    public final void rule__Speedlimit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7181:1: ( rule__Speedlimit__Group_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7182:2: rule__Speedlimit__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group_3__1__Impl_in_rule__Speedlimit__Group_3__114161);
            rule__Speedlimit__Group_3__1__Impl();

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
    // $ANTLR end "rule__Speedlimit__Group_3__1"


    // $ANTLR start "rule__Speedlimit__Group_3__1__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7188:1: rule__Speedlimit__Group_3__1__Impl : ( ( rule__Speedlimit__SpeedAssignment_3_1 ) ) ;
    public final void rule__Speedlimit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7192:1: ( ( ( rule__Speedlimit__SpeedAssignment_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7193:1: ( ( rule__Speedlimit__SpeedAssignment_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7193:1: ( ( rule__Speedlimit__SpeedAssignment_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7194:1: ( rule__Speedlimit__SpeedAssignment_3_1 )
            {
             before(grammarAccess.getSpeedlimitAccess().getSpeedAssignment_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7195:1: ( rule__Speedlimit__SpeedAssignment_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7195:2: rule__Speedlimit__SpeedAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__SpeedAssignment_3_1_in_rule__Speedlimit__Group_3__1__Impl14188);
            rule__Speedlimit__SpeedAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSpeedlimitAccess().getSpeedAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__Group_3__1__Impl"


    // $ANTLR start "rule__Stop__Group__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7209:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7213:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7214:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__014222);
            rule__Stop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__014225);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7221:1: rule__Stop__Group__0__Impl : ( 'Stop' ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7225:1: ( ( 'Stop' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7226:1: ( 'Stop' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7226:1: ( 'Stop' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7227:1: 'Stop'
            {
             before(grammarAccess.getStopAccess().getStopKeyword_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Stop__Group__0__Impl14253); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7240:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl rule__Stop__Group__2 ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7244:1: ( rule__Stop__Group__1__Impl rule__Stop__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7245:2: rule__Stop__Group__1__Impl rule__Stop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__114284);
            rule__Stop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__114287);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7252:1: rule__Stop__Group__1__Impl : ( ( rule__Stop__NameAssignment_1 ) ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7256:1: ( ( ( rule__Stop__NameAssignment_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7257:1: ( ( rule__Stop__NameAssignment_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7257:1: ( ( rule__Stop__NameAssignment_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7258:1: ( rule__Stop__NameAssignment_1 )
            {
             before(grammarAccess.getStopAccess().getNameAssignment_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7259:1: ( rule__Stop__NameAssignment_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7259:2: rule__Stop__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__NameAssignment_1_in_rule__Stop__Group__1__Impl14314);
            rule__Stop__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7269:1: rule__Stop__Group__2 : rule__Stop__Group__2__Impl rule__Stop__Group__3 ;
    public final void rule__Stop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7273:1: ( rule__Stop__Group__2__Impl rule__Stop__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7274:2: rule__Stop__Group__2__Impl rule__Stop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__214344);
            rule__Stop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__214347);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7281:1: rule__Stop__Group__2__Impl : ( '{' ) ;
    public final void rule__Stop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7285:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7286:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7286:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7287:1: '{'
            {
             before(grammarAccess.getStopAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Stop__Group__2__Impl14375); 
             after(grammarAccess.getStopAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7300:1: rule__Stop__Group__3 : rule__Stop__Group__3__Impl rule__Stop__Group__4 ;
    public final void rule__Stop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7304:1: ( rule__Stop__Group__3__Impl rule__Stop__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7305:2: rule__Stop__Group__3__Impl rule__Stop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__314406);
            rule__Stop__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__4_in_rule__Stop__Group__314409);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7312:1: rule__Stop__Group__3__Impl : ( 'belongsTo' ) ;
    public final void rule__Stop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7316:1: ( ( 'belongsTo' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7317:1: ( 'belongsTo' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7317:1: ( 'belongsTo' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7318:1: 'belongsTo'
            {
             before(grammarAccess.getStopAccess().getBelongsToKeyword_3()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Stop__Group__3__Impl14437); 
             after(grammarAccess.getStopAccess().getBelongsToKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7331:1: rule__Stop__Group__4 : rule__Stop__Group__4__Impl rule__Stop__Group__5 ;
    public final void rule__Stop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7335:1: ( rule__Stop__Group__4__Impl rule__Stop__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7336:2: rule__Stop__Group__4__Impl rule__Stop__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__4__Impl_in_rule__Stop__Group__414468);
            rule__Stop__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__5_in_rule__Stop__Group__414471);
            rule__Stop__Group__5();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7343:1: rule__Stop__Group__4__Impl : ( ( rule__Stop__BelongsToAssignment_4 ) ) ;
    public final void rule__Stop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7347:1: ( ( ( rule__Stop__BelongsToAssignment_4 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7348:1: ( ( rule__Stop__BelongsToAssignment_4 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7348:1: ( ( rule__Stop__BelongsToAssignment_4 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7349:1: ( rule__Stop__BelongsToAssignment_4 )
            {
             before(grammarAccess.getStopAccess().getBelongsToAssignment_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7350:1: ( rule__Stop__BelongsToAssignment_4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7350:2: rule__Stop__BelongsToAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__BelongsToAssignment_4_in_rule__Stop__Group__4__Impl14498);
            rule__Stop__BelongsToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getBelongsToAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Stop__Group__5"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7360:1: rule__Stop__Group__5 : rule__Stop__Group__5__Impl ;
    public final void rule__Stop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7364:1: ( rule__Stop__Group__5__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7365:2: rule__Stop__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__5__Impl_in_rule__Stop__Group__514528);
            rule__Stop__Group__5__Impl();

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
    // $ANTLR end "rule__Stop__Group__5"


    // $ANTLR start "rule__Stop__Group__5__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7371:1: rule__Stop__Group__5__Impl : ( '}' ) ;
    public final void rule__Stop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7375:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7376:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7376:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7377:1: '}'
            {
             before(grammarAccess.getStopAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Stop__Group__5__Impl14556); 
             after(grammarAccess.getStopAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__5__Impl"


    // $ANTLR start "rule__Yield__Group__0"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7402:1: rule__Yield__Group__0 : rule__Yield__Group__0__Impl rule__Yield__Group__1 ;
    public final void rule__Yield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7406:1: ( rule__Yield__Group__0__Impl rule__Yield__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7407:2: rule__Yield__Group__0__Impl rule__Yield__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__0__Impl_in_rule__Yield__Group__014599);
            rule__Yield__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__1_in_rule__Yield__Group__014602);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7414:1: rule__Yield__Group__0__Impl : ( 'Yield' ) ;
    public final void rule__Yield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7418:1: ( ( 'Yield' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7419:1: ( 'Yield' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7419:1: ( 'Yield' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7420:1: 'Yield'
            {
             before(grammarAccess.getYieldAccess().getYieldKeyword_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Yield__Group__0__Impl14630); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7433:1: rule__Yield__Group__1 : rule__Yield__Group__1__Impl rule__Yield__Group__2 ;
    public final void rule__Yield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7437:1: ( rule__Yield__Group__1__Impl rule__Yield__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7438:2: rule__Yield__Group__1__Impl rule__Yield__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__1__Impl_in_rule__Yield__Group__114661);
            rule__Yield__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__2_in_rule__Yield__Group__114664);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7445:1: rule__Yield__Group__1__Impl : ( ( rule__Yield__NameAssignment_1 ) ) ;
    public final void rule__Yield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7449:1: ( ( ( rule__Yield__NameAssignment_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7450:1: ( ( rule__Yield__NameAssignment_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7450:1: ( ( rule__Yield__NameAssignment_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7451:1: ( rule__Yield__NameAssignment_1 )
            {
             before(grammarAccess.getYieldAccess().getNameAssignment_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7452:1: ( rule__Yield__NameAssignment_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7452:2: rule__Yield__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__NameAssignment_1_in_rule__Yield__Group__1__Impl14691);
            rule__Yield__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getYieldAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7462:1: rule__Yield__Group__2 : rule__Yield__Group__2__Impl rule__Yield__Group__3 ;
    public final void rule__Yield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7466:1: ( rule__Yield__Group__2__Impl rule__Yield__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7467:2: rule__Yield__Group__2__Impl rule__Yield__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__2__Impl_in_rule__Yield__Group__214721);
            rule__Yield__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__3_in_rule__Yield__Group__214724);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7474:1: rule__Yield__Group__2__Impl : ( '{' ) ;
    public final void rule__Yield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7478:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7479:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7479:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7480:1: '{'
            {
             before(grammarAccess.getYieldAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Yield__Group__2__Impl14752); 
             after(grammarAccess.getYieldAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7493:1: rule__Yield__Group__3 : rule__Yield__Group__3__Impl rule__Yield__Group__4 ;
    public final void rule__Yield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7497:1: ( rule__Yield__Group__3__Impl rule__Yield__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7498:2: rule__Yield__Group__3__Impl rule__Yield__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__3__Impl_in_rule__Yield__Group__314783);
            rule__Yield__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__4_in_rule__Yield__Group__314786);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7505:1: rule__Yield__Group__3__Impl : ( 'belongsTo' ) ;
    public final void rule__Yield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7509:1: ( ( 'belongsTo' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7510:1: ( 'belongsTo' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7510:1: ( 'belongsTo' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7511:1: 'belongsTo'
            {
             before(grammarAccess.getYieldAccess().getBelongsToKeyword_3()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Yield__Group__3__Impl14814); 
             after(grammarAccess.getYieldAccess().getBelongsToKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7524:1: rule__Yield__Group__4 : rule__Yield__Group__4__Impl rule__Yield__Group__5 ;
    public final void rule__Yield__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7528:1: ( rule__Yield__Group__4__Impl rule__Yield__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7529:2: rule__Yield__Group__4__Impl rule__Yield__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__4__Impl_in_rule__Yield__Group__414845);
            rule__Yield__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__5_in_rule__Yield__Group__414848);
            rule__Yield__Group__5();

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7536:1: rule__Yield__Group__4__Impl : ( ( rule__Yield__BelongsToAssignment_4 ) ) ;
    public final void rule__Yield__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7540:1: ( ( ( rule__Yield__BelongsToAssignment_4 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7541:1: ( ( rule__Yield__BelongsToAssignment_4 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7541:1: ( ( rule__Yield__BelongsToAssignment_4 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7542:1: ( rule__Yield__BelongsToAssignment_4 )
            {
             before(grammarAccess.getYieldAccess().getBelongsToAssignment_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7543:1: ( rule__Yield__BelongsToAssignment_4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7543:2: rule__Yield__BelongsToAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__BelongsToAssignment_4_in_rule__Yield__Group__4__Impl14875);
            rule__Yield__BelongsToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getYieldAccess().getBelongsToAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Yield__Group__5"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7553:1: rule__Yield__Group__5 : rule__Yield__Group__5__Impl ;
    public final void rule__Yield__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7557:1: ( rule__Yield__Group__5__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7558:2: rule__Yield__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__5__Impl_in_rule__Yield__Group__514905);
            rule__Yield__Group__5__Impl();

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
    // $ANTLR end "rule__Yield__Group__5"


    // $ANTLR start "rule__Yield__Group__5__Impl"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7564:1: rule__Yield__Group__5__Impl : ( '}' ) ;
    public final void rule__Yield__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7568:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7569:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7569:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7570:1: '}'
            {
             before(grammarAccess.getYieldAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Yield__Group__5__Impl14933); 
             after(grammarAccess.getYieldAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__5__Impl"


    // $ANTLR start "rule__Highway__InitSegmentsAssignment_3_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7596:1: rule__Highway__InitSegmentsAssignment_3_2 : ( ruleSegment ) ;
    public final void rule__Highway__InitSegmentsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7600:1: ( ( ruleSegment ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7601:1: ( ruleSegment )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7601:1: ( ruleSegment )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7602:1: ruleSegment
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSegment_in_rule__Highway__InitSegmentsAssignment_3_214981);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitSegmentsAssignment_3_2"


    // $ANTLR start "rule__Highway__InitSegmentsAssignment_3_3_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7611:1: rule__Highway__InitSegmentsAssignment_3_3_1 : ( ruleSegment ) ;
    public final void rule__Highway__InitSegmentsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7615:1: ( ( ruleSegment ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7616:1: ( ruleSegment )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7616:1: ( ruleSegment )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7617:1: ruleSegment
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSegment_in_rule__Highway__InitSegmentsAssignment_3_3_115012);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitSegmentsAssignment_3_3_1"


    // $ANTLR start "rule__Highway__InitNodesAssignment_4_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7626:1: rule__Highway__InitNodesAssignment_4_2 : ( ruleNode ) ;
    public final void rule__Highway__InitNodesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7630:1: ( ( ruleNode ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7631:1: ( ruleNode )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7631:1: ( ruleNode )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7632:1: ruleNode
            {
             before(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_rule__Highway__InitNodesAssignment_4_215043);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitNodesAssignment_4_2"


    // $ANTLR start "rule__Highway__InitNodesAssignment_4_3_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7641:1: rule__Highway__InitNodesAssignment_4_3_1 : ( ruleNode ) ;
    public final void rule__Highway__InitNodesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7645:1: ( ( ruleNode ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7646:1: ( ruleNode )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7646:1: ( ruleNode )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7647:1: ruleNode
            {
             before(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_rule__Highway__InitNodesAssignment_4_3_115074);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitNodesAssignment_4_3_1"


    // $ANTLR start "rule__Highway__InitCarsAssignment_5_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7656:1: rule__Highway__InitCarsAssignment_5_2 : ( ruleCar ) ;
    public final void rule__Highway__InitCarsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7660:1: ( ( ruleCar ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7661:1: ( ruleCar )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7661:1: ( ruleCar )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7662:1: ruleCar
            {
             before(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCar_in_rule__Highway__InitCarsAssignment_5_215105);
            ruleCar();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitCarsAssignment_5_2"


    // $ANTLR start "rule__Highway__InitCarsAssignment_5_3_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7671:1: rule__Highway__InitCarsAssignment_5_3_1 : ( ruleCar ) ;
    public final void rule__Highway__InitCarsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7675:1: ( ( ruleCar ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7676:1: ( ruleCar )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7676:1: ( ruleCar )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7677:1: ruleCar
            {
             before(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCar_in_rule__Highway__InitCarsAssignment_5_3_115136);
            ruleCar();

            state._fsp--;

             after(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Highway__InitCarsAssignment_5_3_1"


    // $ANTLR start "rule__Highway__InitSemaphoreAssignment_6_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7686:1: rule__Highway__InitSemaphoreAssignment_6_2 : ( ruleSemaphore ) ;
    public final void rule__Highway__InitSemaphoreAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7690:1: ( ( ruleSemaphore ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7691:1: ( ruleSemaphore )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7691:1: ( ruleSemaphore )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7692:1: ruleSemaphore
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreSemaphoreParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemaphore_in_rule__Highway__InitSemaphoreAssignment_6_215167);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7701:1: rule__Highway__InitSemaphoreAssignment_6_3_1 : ( ruleSemaphore ) ;
    public final void rule__Highway__InitSemaphoreAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7705:1: ( ( ruleSemaphore ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7706:1: ( ruleSemaphore )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7706:1: ( ruleSemaphore )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7707:1: ruleSemaphore
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreSemaphoreParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemaphore_in_rule__Highway__InitSemaphoreAssignment_6_3_115198);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7716:1: rule__Highway__InitSignalAssignment_7_2 : ( ruleSignal ) ;
    public final void rule__Highway__InitSignalAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7720:1: ( ( ruleSignal ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7721:1: ( ruleSignal )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7721:1: ( ruleSignal )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7722:1: ruleSignal
            {
             before(grammarAccess.getHighwayAccess().getInitSignalSignalParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_rule__Highway__InitSignalAssignment_7_215229);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7731:1: rule__Highway__InitSignalAssignment_7_3_1 : ( ruleSignal ) ;
    public final void rule__Highway__InitSignalAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7735:1: ( ( ruleSignal ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7736:1: ( ruleSignal )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7736:1: ( ruleSignal )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7737:1: ruleSignal
            {
             before(grammarAccess.getHighwayAccess().getInitSignalSignalParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_rule__Highway__InitSignalAssignment_7_3_115260);
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


    // $ANTLR start "rule__Node_Impl__NameAssignment_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7746:1: rule__Node_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Node_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7750:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7751:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7751:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7752:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__NameAssignment_215291);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__NameAssignment_2"


    // $ANTLR start "rule__Node_Impl__HasStartsAssignment_6"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7761:1: rule__Node_Impl__HasStartsAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__HasStartsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7765:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7766:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7766:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7767:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_6_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7768:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7769:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsSegmentEStringParserRuleCall_6_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__HasStartsAssignment_615326);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getHasStartsSegmentEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__HasStartsAssignment_6"


    // $ANTLR start "rule__Node_Impl__HasStartsAssignment_7_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7780:1: rule__Node_Impl__HasStartsAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__HasStartsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7784:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7785:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7785:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7786:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_7_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7787:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7788:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsSegmentEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__HasStartsAssignment_7_115365);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getHasStartsSegmentEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__HasStartsAssignment_7_1"


    // $ANTLR start "rule__Node_Impl__HasEndsAssignment_11"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7799:1: rule__Node_Impl__HasEndsAssignment_11 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__HasEndsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7803:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7804:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7804:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7805:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_11_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7806:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7807:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsSegmentEStringParserRuleCall_11_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__HasEndsAssignment_1115404);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getHasEndsSegmentEStringParserRuleCall_11_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__HasEndsAssignment_11"


    // $ANTLR start "rule__Node_Impl__HasEndsAssignment_12_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7818:1: rule__Node_Impl__HasEndsAssignment_12_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__HasEndsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7822:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7823:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7823:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7824:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_12_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7825:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7826:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsSegmentEStringParserRuleCall_12_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__HasEndsAssignment_12_115443);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getHasEndsSegmentEStringParserRuleCall_12_1_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__HasEndsAssignment_12_1"


    // $ANTLR start "rule__Node_Impl__SemaphoreAssignment_14_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7837:1: rule__Node_Impl__SemaphoreAssignment_14_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__SemaphoreAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7841:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7842:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7842:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7843:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getSemaphoreSemaphoreCrossReference_14_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7844:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7845:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getSemaphoreSemaphoreEStringParserRuleCall_14_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__SemaphoreAssignment_14_115482);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getSemaphoreSemaphoreEStringParserRuleCall_14_1_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getSemaphoreSemaphoreCrossReference_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__SemaphoreAssignment_14_1"


    // $ANTLR start "rule__Node_Impl__SignalsAssignment_15_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7856:1: rule__Node_Impl__SignalsAssignment_15_2 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__SignalsAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7860:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7861:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7861:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7862:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_15_2_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7863:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7864:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsSignalEStringParserRuleCall_15_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__SignalsAssignment_15_215521);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getSignalsSignalEStringParserRuleCall_15_2_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__SignalsAssignment_15_2"


    // $ANTLR start "rule__Node_Impl__SignalsAssignment_15_3_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7875:1: rule__Node_Impl__SignalsAssignment_15_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__SignalsAssignment_15_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7879:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7880:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7880:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7881:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_15_3_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7882:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7883:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsSignalEStringParserRuleCall_15_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__SignalsAssignment_15_3_115560);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getSignalsSignalEStringParserRuleCall_15_3_1_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_15_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__SignalsAssignment_15_3_1"


    // $ANTLR start "rule__Car__NameAssignment_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7894:1: rule__Car__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Car__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7898:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7899:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7899:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7900:1: ruleEString
            {
             before(grammarAccess.getCarAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Car__NameAssignment_215595);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCarAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__NameAssignment_2"


    // $ANTLR start "rule__Car__TimeInAssignment_4_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7909:1: rule__Car__TimeInAssignment_4_1 : ( ruleEDate ) ;
    public final void rule__Car__TimeInAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7913:1: ( ( ruleEDate ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7914:1: ( ruleEDate )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7914:1: ( ruleEDate )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7915:1: ruleEDate
            {
             before(grammarAccess.getCarAccess().getTimeInEDateParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDate_in_rule__Car__TimeInAssignment_4_115626);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getCarAccess().getTimeInEDateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__TimeInAssignment_4_1"


    // $ANTLR start "rule__Car__TimeOutAssignment_5_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7924:1: rule__Car__TimeOutAssignment_5_1 : ( ruleEDate ) ;
    public final void rule__Car__TimeOutAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7928:1: ( ( ruleEDate ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7929:1: ( ruleEDate )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7929:1: ( ruleEDate )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7930:1: ruleEDate
            {
             before(grammarAccess.getCarAccess().getTimeOutEDateParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDate_in_rule__Car__TimeOutAssignment_5_115657);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getCarAccess().getTimeOutEDateParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__TimeOutAssignment_5_1"


    // $ANTLR start "rule__Car__IsInSegmentAssignment_6_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7939:1: rule__Car__IsInSegmentAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Car__IsInSegmentAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7943:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7944:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7944:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7945:1: ( ruleEString )
            {
             before(grammarAccess.getCarAccess().getIsInSegmentSegmentCrossReference_6_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7946:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7947:1: ruleEString
            {
             before(grammarAccess.getCarAccess().getIsInSegmentSegmentEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Car__IsInSegmentAssignment_6_115692);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCarAccess().getIsInSegmentSegmentEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getCarAccess().getIsInSegmentSegmentCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__IsInSegmentAssignment_6_1"


    // $ANTLR start "rule__Segment__NameAssignment_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7958:1: rule__Segment__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Segment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7962:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7963:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7963:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7964:1: ruleEString
            {
             before(grammarAccess.getSegmentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Segment__NameAssignment_215727);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__NameAssignment_2"


    // $ANTLR start "rule__Segment__NumLanesAssignment_4_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7973:1: rule__Segment__NumLanesAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Segment__NumLanesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7977:1: ( ( ruleEInt ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7978:1: ( ruleEInt )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7978:1: ( ruleEInt )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7979:1: ruleEInt
            {
             before(grammarAccess.getSegmentAccess().getNumLanesEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Segment__NumLanesAssignment_4_115758);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getNumLanesEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__NumLanesAssignment_4_1"


    // $ANTLR start "rule__Segment__LengthAssignment_5_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7988:1: rule__Segment__LengthAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Segment__LengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7992:1: ( ( ruleEInt ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7993:1: ( ruleEInt )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7993:1: ( ruleEInt )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7994:1: ruleEInt
            {
             before(grammarAccess.getSegmentAccess().getLengthEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Segment__LengthAssignment_5_115789);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getLengthEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__LengthAssignment_5_1"


    // $ANTLR start "rule__Segment__HasCarsAssignment_6_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8003:1: rule__Segment__HasCarsAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__Segment__HasCarsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8007:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8008:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8008:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8009:1: ( ruleEString )
            {
             before(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_6_2_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8010:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8011:1: ruleEString
            {
             before(grammarAccess.getSegmentAccess().getHasCarsCarEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Segment__HasCarsAssignment_6_215824);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getHasCarsCarEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__HasCarsAssignment_6_2"


    // $ANTLR start "rule__Segment__HasCarsAssignment_6_3_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8022:1: rule__Segment__HasCarsAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Segment__HasCarsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8026:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8027:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8027:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8028:1: ( ruleEString )
            {
             before(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_6_3_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8029:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8030:1: ruleEString
            {
             before(grammarAccess.getSegmentAccess().getHasCarsCarEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Segment__HasCarsAssignment_6_3_115863);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getHasCarsCarEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__HasCarsAssignment_6_3_1"


    // $ANTLR start "rule__Semaphore__NameAssignment_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8041:1: rule__Semaphore__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Semaphore__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8045:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8046:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8046:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8047:1: ruleEString
            {
             before(grammarAccess.getSemaphoreAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Semaphore__NameAssignment_215898);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSemaphoreAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__NameAssignment_2"


    // $ANTLR start "rule__Semaphore__CanGoAssignment_4_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8056:1: rule__Semaphore__CanGoAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__Semaphore__CanGoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8060:1: ( ( ruleEBoolean ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8061:1: ( ruleEBoolean )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8061:1: ( ruleEBoolean )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8062:1: ruleEBoolean
            {
             before(grammarAccess.getSemaphoreAccess().getCanGoEBooleanParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__Semaphore__CanGoAssignment_4_115929);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getSemaphoreAccess().getCanGoEBooleanParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__CanGoAssignment_4_1"


    // $ANTLR start "rule__Semaphore__SecondsRedAssignment_5_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8071:1: rule__Semaphore__SecondsRedAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Semaphore__SecondsRedAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8075:1: ( ( ruleEInt ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8076:1: ( ruleEInt )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8076:1: ( ruleEInt )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8077:1: ruleEInt
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsRedEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Semaphore__SecondsRedAssignment_5_115960);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSemaphoreAccess().getSecondsRedEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__SecondsRedAssignment_5_1"


    // $ANTLR start "rule__Semaphore__SecondsGreenAssignment_6_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8086:1: rule__Semaphore__SecondsGreenAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Semaphore__SecondsGreenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8090:1: ( ( ruleEInt ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8091:1: ( ruleEInt )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8091:1: ( ruleEInt )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8092:1: ruleEInt
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsGreenEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Semaphore__SecondsGreenAssignment_6_115991);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSemaphoreAccess().getSecondsGreenEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__SecondsGreenAssignment_6_1"


    // $ANTLR start "rule__Semaphore__BelongsToAssignment_8"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8101:1: rule__Semaphore__BelongsToAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Semaphore__BelongsToAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8105:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8106:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8106:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8107:1: ( ruleEString )
            {
             before(grammarAccess.getSemaphoreAccess().getBelongsToNodeCrossReference_8_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8108:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8109:1: ruleEString
            {
             before(grammarAccess.getSemaphoreAccess().getBelongsToNodeEStringParserRuleCall_8_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Semaphore__BelongsToAssignment_816026);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSemaphoreAccess().getBelongsToNodeEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getSemaphoreAccess().getBelongsToNodeCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semaphore__BelongsToAssignment_8"


    // $ANTLR start "rule__Signal_Impl__NameAssignment_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8120:1: rule__Signal_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Signal_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8124:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8125:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8125:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8126:1: ruleEString
            {
             before(grammarAccess.getSignal_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Signal_Impl__NameAssignment_216061);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignal_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__NameAssignment_2"


    // $ANTLR start "rule__Signal_Impl__BelongsToAssignment_5"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8135:1: rule__Signal_Impl__BelongsToAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Signal_Impl__BelongsToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8139:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8140:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8140:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8141:1: ( ruleEString )
            {
             before(grammarAccess.getSignal_ImplAccess().getBelongsToNodeCrossReference_5_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8142:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8143:1: ruleEString
            {
             before(grammarAccess.getSignal_ImplAccess().getBelongsToNodeEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Signal_Impl__BelongsToAssignment_516096);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignal_ImplAccess().getBelongsToNodeEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSignal_ImplAccess().getBelongsToNodeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_Impl__BelongsToAssignment_5"


    // $ANTLR start "rule__Extractor__NameAssignment_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8154:1: rule__Extractor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Extractor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8158:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8159:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8159:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8160:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__NameAssignment_216131);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__NameAssignment_2"


    // $ANTLR start "rule__Extractor__HasStartsAssignment_4_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8169:1: rule__Extractor__HasStartsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__HasStartsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8173:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8174:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8174:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8175:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_4_2_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8176:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8177:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getHasStartsSegmentEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__HasStartsAssignment_4_216166);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getHasStartsSegmentEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__HasStartsAssignment_4_2"


    // $ANTLR start "rule__Extractor__HasStartsAssignment_4_3_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8188:1: rule__Extractor__HasStartsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__HasStartsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8192:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8193:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8193:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8194:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_4_3_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8195:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8196:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getHasStartsSegmentEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__HasStartsAssignment_4_3_116205);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getHasStartsSegmentEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__HasStartsAssignment_4_3_1"


    // $ANTLR start "rule__Extractor__HasEndsAssignment_7"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8207:1: rule__Extractor__HasEndsAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__HasEndsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8211:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8212:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8212:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8213:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_7_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8214:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8215:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getHasEndsSegmentEStringParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__HasEndsAssignment_716244);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getHasEndsSegmentEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__HasEndsAssignment_7"


    // $ANTLR start "rule__Extractor__HasEndsAssignment_8_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8226:1: rule__Extractor__HasEndsAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__HasEndsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8230:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8231:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8231:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8232:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_8_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8233:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8234:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getHasEndsSegmentEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__HasEndsAssignment_8_116283);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getHasEndsSegmentEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__HasEndsAssignment_8_1"


    // $ANTLR start "rule__Extractor__SemaphoreAssignment_10_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8245:1: rule__Extractor__SemaphoreAssignment_10_1 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__SemaphoreAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8249:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8250:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8250:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8251:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getSemaphoreSemaphoreCrossReference_10_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8252:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8253:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getSemaphoreSemaphoreEStringParserRuleCall_10_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__SemaphoreAssignment_10_116322);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getSemaphoreSemaphoreEStringParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getSemaphoreSemaphoreCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__SemaphoreAssignment_10_1"


    // $ANTLR start "rule__Extractor__SignalsAssignment_11_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8264:1: rule__Extractor__SignalsAssignment_11_2 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__SignalsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8268:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8269:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8269:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8270:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_11_2_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8271:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8272:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getSignalsSignalEStringParserRuleCall_11_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__SignalsAssignment_11_216361);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getSignalsSignalEStringParserRuleCall_11_2_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__SignalsAssignment_11_2"


    // $ANTLR start "rule__Extractor__SignalsAssignment_11_3_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8283:1: rule__Extractor__SignalsAssignment_11_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__SignalsAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8287:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8288:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8288:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8289:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_11_3_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8290:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8291:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getSignalsSignalEStringParserRuleCall_11_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__SignalsAssignment_11_3_116400);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractorAccess().getSignalsSignalEStringParserRuleCall_11_3_1_0_1()); 

            }

             after(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extractor__SignalsAssignment_11_3_1"


    // $ANTLR start "rule__Injector__NameAssignment_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8302:1: rule__Injector__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Injector__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8306:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8307:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8307:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8308:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__NameAssignment_216435);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__NameAssignment_2"


    // $ANTLR start "rule__Injector__CarsPerHourAssignment_4_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8317:1: rule__Injector__CarsPerHourAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Injector__CarsPerHourAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8321:1: ( ( ruleEInt ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8322:1: ( ruleEInt )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8322:1: ( ruleEInt )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8323:1: ruleEInt
            {
             before(grammarAccess.getInjectorAccess().getCarsPerHourEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Injector__CarsPerHourAssignment_4_116466);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getCarsPerHourEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__CarsPerHourAssignment_4_1"


    // $ANTLR start "rule__Injector__HasStartsAssignment_7"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8332:1: rule__Injector__HasStartsAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Injector__HasStartsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8336:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8337:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8337:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8338:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_7_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8339:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8340:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getHasStartsSegmentEStringParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__HasStartsAssignment_716501);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getHasStartsSegmentEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__HasStartsAssignment_7"


    // $ANTLR start "rule__Injector__HasStartsAssignment_8_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8351:1: rule__Injector__HasStartsAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Injector__HasStartsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8355:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8356:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8356:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8357:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_8_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8358:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8359:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getHasStartsSegmentEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__HasStartsAssignment_8_116540);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getHasStartsSegmentEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__HasStartsAssignment_8_1"


    // $ANTLR start "rule__Injector__HasEndsAssignment_10_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8370:1: rule__Injector__HasEndsAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__Injector__HasEndsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8374:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8375:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8375:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8376:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_10_2_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8377:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8378:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getHasEndsSegmentEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__HasEndsAssignment_10_216579);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getHasEndsSegmentEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__HasEndsAssignment_10_2"


    // $ANTLR start "rule__Injector__HasEndsAssignment_10_3_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8389:1: rule__Injector__HasEndsAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Injector__HasEndsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8393:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8394:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8394:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8395:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_10_3_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8396:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8397:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getHasEndsSegmentEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__HasEndsAssignment_10_3_116618);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getHasEndsSegmentEStringParserRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__HasEndsAssignment_10_3_1"


    // $ANTLR start "rule__Injector__SemaphoreAssignment_11_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8408:1: rule__Injector__SemaphoreAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__Injector__SemaphoreAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8412:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8413:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8413:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8414:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getSemaphoreSemaphoreCrossReference_11_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8415:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8416:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getSemaphoreSemaphoreEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__SemaphoreAssignment_11_116657);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getSemaphoreSemaphoreEStringParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getSemaphoreSemaphoreCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__SemaphoreAssignment_11_1"


    // $ANTLR start "rule__Injector__SignalsAssignment_12_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8427:1: rule__Injector__SignalsAssignment_12_2 : ( ( ruleEString ) ) ;
    public final void rule__Injector__SignalsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8431:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8432:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8432:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8433:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_12_2_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8434:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8435:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getSignalsSignalEStringParserRuleCall_12_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__SignalsAssignment_12_216696);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getSignalsSignalEStringParserRuleCall_12_2_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__SignalsAssignment_12_2"


    // $ANTLR start "rule__Injector__SignalsAssignment_12_3_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8446:1: rule__Injector__SignalsAssignment_12_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Injector__SignalsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8450:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8451:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8451:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8452:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_12_3_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8453:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8454:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getSignalsSignalEStringParserRuleCall_12_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__SignalsAssignment_12_3_116735);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInjectorAccess().getSignalsSignalEStringParserRuleCall_12_3_1_0_1()); 

            }

             after(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Injector__SignalsAssignment_12_3_1"


    // $ANTLR start "rule__Speedlimit__NameAssignment_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8465:1: rule__Speedlimit__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Speedlimit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8469:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8470:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8470:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8471:1: ruleEString
            {
             before(grammarAccess.getSpeedlimitAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Speedlimit__NameAssignment_116770);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpeedlimitAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__NameAssignment_1"


    // $ANTLR start "rule__Speedlimit__SpeedAssignment_3_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8480:1: rule__Speedlimit__SpeedAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Speedlimit__SpeedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8484:1: ( ( ruleEInt ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8485:1: ( ruleEInt )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8485:1: ( ruleEInt )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8486:1: ruleEInt
            {
             before(grammarAccess.getSpeedlimitAccess().getSpeedEIntParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Speedlimit__SpeedAssignment_3_116801);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSpeedlimitAccess().getSpeedEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__SpeedAssignment_3_1"


    // $ANTLR start "rule__Speedlimit__BelongsToAssignment_5"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8495:1: rule__Speedlimit__BelongsToAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Speedlimit__BelongsToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8499:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8500:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8500:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8501:1: ( ruleEString )
            {
             before(grammarAccess.getSpeedlimitAccess().getBelongsToNodeCrossReference_5_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8502:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8503:1: ruleEString
            {
             before(grammarAccess.getSpeedlimitAccess().getBelongsToNodeEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Speedlimit__BelongsToAssignment_516836);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpeedlimitAccess().getBelongsToNodeEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSpeedlimitAccess().getBelongsToNodeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speedlimit__BelongsToAssignment_5"


    // $ANTLR start "rule__Stop__NameAssignment_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8514:1: rule__Stop__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Stop__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8518:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8519:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8519:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8520:1: ruleEString
            {
             before(grammarAccess.getStopAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Stop__NameAssignment_116871);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStopAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__NameAssignment_1"


    // $ANTLR start "rule__Stop__BelongsToAssignment_4"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8529:1: rule__Stop__BelongsToAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Stop__BelongsToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8533:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8534:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8534:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8535:1: ( ruleEString )
            {
             before(grammarAccess.getStopAccess().getBelongsToNodeCrossReference_4_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8536:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8537:1: ruleEString
            {
             before(grammarAccess.getStopAccess().getBelongsToNodeEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Stop__BelongsToAssignment_416906);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStopAccess().getBelongsToNodeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getStopAccess().getBelongsToNodeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__BelongsToAssignment_4"


    // $ANTLR start "rule__Yield__NameAssignment_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8548:1: rule__Yield__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Yield__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8552:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8553:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8553:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8554:1: ruleEString
            {
             before(grammarAccess.getYieldAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Yield__NameAssignment_116941);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getYieldAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__NameAssignment_1"


    // $ANTLR start "rule__Yield__BelongsToAssignment_4"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8563:1: rule__Yield__BelongsToAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Yield__BelongsToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8567:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8568:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8568:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8569:1: ( ruleEString )
            {
             before(grammarAccess.getYieldAccess().getBelongsToNodeCrossReference_4_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8570:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8571:1: ruleEString
            {
             before(grammarAccess.getYieldAccess().getBelongsToNodeEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Yield__BelongsToAssignment_416976);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getYieldAccess().getBelongsToNodeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getYieldAccess().getBelongsToNodeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__BelongsToAssignment_4"

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
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractor_in_entryRuleExtractor601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtractor608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__0_in_ruleExtractor634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInjector_in_entryRuleInjector661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInjector668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__0_in_ruleInjector694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDate_in_entryRuleEDate781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDate788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEDate814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpeedlimit_in_entryRuleSpeedlimit900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpeedlimit907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__0_in_ruleSpeedlimit933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_entryRuleStop960 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStop967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0_in_ruleStop993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYield_in_entryRuleYield1020 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleYield1027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__0_in_ruleYield1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_Impl_in_rule__Node__Alternatives1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractor_in_rule__Node__Alternatives1106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInjector_in_rule__Node__Alternatives1123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_Impl_in_rule__Signal__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpeedlimit_in_rule__Signal__Alternatives1172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_rule__Signal__Alternatives1189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYield_in_rule__Signal__Alternatives1206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives1288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives1308 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__Highway__Group_3__1__Impl_in_rule__Highway__Group_3__11969 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__2_in_rule__Highway__Group_3__11972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Highway__Group_3__1__Impl2000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__2__Impl_in_rule__Highway__Group_3__22031 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__3_in_rule__Highway__Group_3__22034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSegmentsAssignment_3_2_in_rule__Highway__Group_3__2__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__3__Impl_in_rule__Highway__Group_3__32091 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__4_in_rule__Highway__Group_3__32094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3_3__0_in_rule__Highway__Group_3__3__Impl2121 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__4__Impl_in_rule__Highway__Group_3__42152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_3__4__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3_3__0__Impl_in_rule__Highway__Group_3_3__02221 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3_3__1_in_rule__Highway__Group_3_3__02224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Highway__Group_3_3__0__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3_3__1__Impl_in_rule__Highway__Group_3_3__12283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSegmentsAssignment_3_3_1_in_rule__Highway__Group_3_3__1__Impl2310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__0__Impl_in_rule__Highway__Group_4__02344 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__1_in_rule__Highway__Group_4__02347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Highway__Group_4__0__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__1__Impl_in_rule__Highway__Group_4__12406 = new BitSet(new long[]{0x0000180000400000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__2_in_rule__Highway__Group_4__12409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Highway__Group_4__1__Impl2437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__2__Impl_in_rule__Highway__Group_4__22468 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__3_in_rule__Highway__Group_4__22471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitNodesAssignment_4_2_in_rule__Highway__Group_4__2__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__3__Impl_in_rule__Highway__Group_4__32528 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__4_in_rule__Highway__Group_4__32531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4_3__0_in_rule__Highway__Group_4__3__Impl2558 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__4__Impl_in_rule__Highway__Group_4__42589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_4__4__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4_3__0__Impl_in_rule__Highway__Group_4_3__02658 = new BitSet(new long[]{0x0000180000400000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4_3__1_in_rule__Highway__Group_4_3__02661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Highway__Group_4_3__0__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4_3__1__Impl_in_rule__Highway__Group_4_3__12720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitNodesAssignment_4_3_1_in_rule__Highway__Group_4_3__1__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__0__Impl_in_rule__Highway__Group_5__02781 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__1_in_rule__Highway__Group_5__02784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Highway__Group_5__0__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__1__Impl_in_rule__Highway__Group_5__12843 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__2_in_rule__Highway__Group_5__12846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Highway__Group_5__1__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__2__Impl_in_rule__Highway__Group_5__22905 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__3_in_rule__Highway__Group_5__22908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitCarsAssignment_5_2_in_rule__Highway__Group_5__2__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__3__Impl_in_rule__Highway__Group_5__32965 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__4_in_rule__Highway__Group_5__32968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5_3__0_in_rule__Highway__Group_5__3__Impl2995 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__4__Impl_in_rule__Highway__Group_5__43026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_5__4__Impl3054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5_3__0__Impl_in_rule__Highway__Group_5_3__03095 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5_3__1_in_rule__Highway__Group_5_3__03098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Highway__Group_5_3__0__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5_3__1__Impl_in_rule__Highway__Group_5_3__13157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitCarsAssignment_5_3_1_in_rule__Highway__Group_5_3__1__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__Node_Impl__Group__1__Impl_in_rule__Node_Impl__Group__14153 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__2_in_rule__Node_Impl__Group__14156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Node_Impl__Group__1__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__2__Impl_in_rule__Node_Impl__Group__24215 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__3_in_rule__Node_Impl__Group__24218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__NameAssignment_2_in_rule__Node_Impl__Group__2__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__3__Impl_in_rule__Node_Impl__Group__34275 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__4_in_rule__Node_Impl__Group__34278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Node_Impl__Group__3__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__4__Impl_in_rule__Node_Impl__Group__44337 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__5_in_rule__Node_Impl__Group__44340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Node_Impl__Group__4__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__5__Impl_in_rule__Node_Impl__Group__54399 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__6_in_rule__Node_Impl__Group__54402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Node_Impl__Group__5__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__6__Impl_in_rule__Node_Impl__Group__64461 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__7_in_rule__Node_Impl__Group__64464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__HasStartsAssignment_6_in_rule__Node_Impl__Group__6__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__7__Impl_in_rule__Node_Impl__Group__74521 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__8_in_rule__Node_Impl__Group__74524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_7__0_in_rule__Node_Impl__Group__7__Impl4551 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__8__Impl_in_rule__Node_Impl__Group__84582 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__9_in_rule__Node_Impl__Group__84585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Node_Impl__Group__8__Impl4613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__9__Impl_in_rule__Node_Impl__Group__94644 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__10_in_rule__Node_Impl__Group__94647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Node_Impl__Group__9__Impl4675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__10__Impl_in_rule__Node_Impl__Group__104706 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__11_in_rule__Node_Impl__Group__104709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Node_Impl__Group__10__Impl4737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__11__Impl_in_rule__Node_Impl__Group__114768 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__12_in_rule__Node_Impl__Group__114771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__HasEndsAssignment_11_in_rule__Node_Impl__Group__11__Impl4798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__12__Impl_in_rule__Node_Impl__Group__124828 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__13_in_rule__Node_Impl__Group__124831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_12__0_in_rule__Node_Impl__Group__12__Impl4858 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__13__Impl_in_rule__Node_Impl__Group__134889 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__14_in_rule__Node_Impl__Group__134892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Node_Impl__Group__13__Impl4920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__14__Impl_in_rule__Node_Impl__Group__144951 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__15_in_rule__Node_Impl__Group__144954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__0_in_rule__Node_Impl__Group__14__Impl4981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__15__Impl_in_rule__Node_Impl__Group__155012 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__16_in_rule__Node_Impl__Group__155015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__0_in_rule__Node_Impl__Group__15__Impl5042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__16__Impl_in_rule__Node_Impl__Group__165073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Node_Impl__Group__16__Impl5101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_7__0__Impl_in_rule__Node_Impl__Group_7__05166 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_7__1_in_rule__Node_Impl__Group_7__05169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Node_Impl__Group_7__0__Impl5197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_7__1__Impl_in_rule__Node_Impl__Group_7__15228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__HasStartsAssignment_7_1_in_rule__Node_Impl__Group_7__1__Impl5255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_12__0__Impl_in_rule__Node_Impl__Group_12__05289 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_12__1_in_rule__Node_Impl__Group_12__05292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Node_Impl__Group_12__0__Impl5320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_12__1__Impl_in_rule__Node_Impl__Group_12__15351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__HasEndsAssignment_12_1_in_rule__Node_Impl__Group_12__1__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__0__Impl_in_rule__Node_Impl__Group_14__05412 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__1_in_rule__Node_Impl__Group_14__05415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Node_Impl__Group_14__0__Impl5443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__1__Impl_in_rule__Node_Impl__Group_14__15474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__SemaphoreAssignment_14_1_in_rule__Node_Impl__Group_14__1__Impl5501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__0__Impl_in_rule__Node_Impl__Group_15__05535 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__1_in_rule__Node_Impl__Group_15__05538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Node_Impl__Group_15__0__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__1__Impl_in_rule__Node_Impl__Group_15__15597 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__2_in_rule__Node_Impl__Group_15__15600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Node_Impl__Group_15__1__Impl5628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__2__Impl_in_rule__Node_Impl__Group_15__25659 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__3_in_rule__Node_Impl__Group_15__25662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__SignalsAssignment_15_2_in_rule__Node_Impl__Group_15__2__Impl5689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__3__Impl_in_rule__Node_Impl__Group_15__35719 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__4_in_rule__Node_Impl__Group_15__35722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15_3__0_in_rule__Node_Impl__Group_15__3__Impl5749 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__4__Impl_in_rule__Node_Impl__Group_15__45780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Node_Impl__Group_15__4__Impl5808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15_3__0__Impl_in_rule__Node_Impl__Group_15_3__05849 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15_3__1_in_rule__Node_Impl__Group_15_3__05852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Node_Impl__Group_15_3__0__Impl5880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15_3__1__Impl_in_rule__Node_Impl__Group_15_3__15911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__SignalsAssignment_15_3_1_in_rule__Node_Impl__Group_15_3__1__Impl5938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__0__Impl_in_rule__Car__Group__05972 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Car__Group__1_in_rule__Car__Group__05975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__1__Impl_in_rule__Car__Group__16033 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Car__Group__2_in_rule__Car__Group__16036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Car__Group__1__Impl6064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__2__Impl_in_rule__Car__Group__26095 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Car__Group__3_in_rule__Car__Group__26098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__NameAssignment_2_in_rule__Car__Group__2__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__3__Impl_in_rule__Car__Group__36155 = new BitSet(new long[]{0x00000001C0008000L});
        public static final BitSet FOLLOW_rule__Car__Group__4_in_rule__Car__Group__36158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Car__Group__3__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__4__Impl_in_rule__Car__Group__46217 = new BitSet(new long[]{0x00000001C0008000L});
        public static final BitSet FOLLOW_rule__Car__Group__5_in_rule__Car__Group__46220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_4__0_in_rule__Car__Group__4__Impl6247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__5__Impl_in_rule__Car__Group__56278 = new BitSet(new long[]{0x00000001C0008000L});
        public static final BitSet FOLLOW_rule__Car__Group__6_in_rule__Car__Group__56281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_5__0_in_rule__Car__Group__5__Impl6308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__6__Impl_in_rule__Car__Group__66339 = new BitSet(new long[]{0x00000001C0008000L});
        public static final BitSet FOLLOW_rule__Car__Group__7_in_rule__Car__Group__66342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_6__0_in_rule__Car__Group__6__Impl6369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__7__Impl_in_rule__Car__Group__76400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Car__Group__7__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_4__0__Impl_in_rule__Car__Group_4__06475 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Car__Group_4__1_in_rule__Car__Group_4__06478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Car__Group_4__0__Impl6506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_4__1__Impl_in_rule__Car__Group_4__16537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__TimeInAssignment_4_1_in_rule__Car__Group_4__1__Impl6564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_5__0__Impl_in_rule__Car__Group_5__06598 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Car__Group_5__1_in_rule__Car__Group_5__06601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Car__Group_5__0__Impl6629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_5__1__Impl_in_rule__Car__Group_5__16660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__TimeOutAssignment_5_1_in_rule__Car__Group_5__1__Impl6687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_6__0__Impl_in_rule__Car__Group_6__06721 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Car__Group_6__1_in_rule__Car__Group_6__06724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Car__Group_6__0__Impl6752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_6__1__Impl_in_rule__Car__Group_6__16783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__IsInSegmentAssignment_6_1_in_rule__Car__Group_6__1__Impl6810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__0__Impl_in_rule__Segment__Group__06844 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Segment__Group__1_in_rule__Segment__Group__06847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__1__Impl_in_rule__Segment__Group__16905 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Segment__Group__2_in_rule__Segment__Group__16908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Segment__Group__1__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__2__Impl_in_rule__Segment__Group__26967 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Segment__Group__3_in_rule__Segment__Group__26970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__NameAssignment_2_in_rule__Segment__Group__2__Impl6997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__3__Impl_in_rule__Segment__Group__37027 = new BitSet(new long[]{0x0000001C00008000L});
        public static final BitSet FOLLOW_rule__Segment__Group__4_in_rule__Segment__Group__37030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Segment__Group__3__Impl7058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__4__Impl_in_rule__Segment__Group__47089 = new BitSet(new long[]{0x0000001C00008000L});
        public static final BitSet FOLLOW_rule__Segment__Group__5_in_rule__Segment__Group__47092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_4__0_in_rule__Segment__Group__4__Impl7119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__5__Impl_in_rule__Segment__Group__57150 = new BitSet(new long[]{0x0000001C00008000L});
        public static final BitSet FOLLOW_rule__Segment__Group__6_in_rule__Segment__Group__57153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__0_in_rule__Segment__Group__5__Impl7180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__6__Impl_in_rule__Segment__Group__67211 = new BitSet(new long[]{0x0000001C00008000L});
        public static final BitSet FOLLOW_rule__Segment__Group__7_in_rule__Segment__Group__67214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__0_in_rule__Segment__Group__6__Impl7241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__7__Impl_in_rule__Segment__Group__77272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Segment__Group__7__Impl7300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_4__0__Impl_in_rule__Segment__Group_4__07347 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Segment__Group_4__1_in_rule__Segment__Group_4__07350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Segment__Group_4__0__Impl7378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_4__1__Impl_in_rule__Segment__Group_4__17409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__NumLanesAssignment_4_1_in_rule__Segment__Group_4__1__Impl7436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__0__Impl_in_rule__Segment__Group_5__07470 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__1_in_rule__Segment__Group_5__07473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Segment__Group_5__0__Impl7501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__1__Impl_in_rule__Segment__Group_5__17532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__LengthAssignment_5_1_in_rule__Segment__Group_5__1__Impl7559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__0__Impl_in_rule__Segment__Group_6__07593 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__1_in_rule__Segment__Group_6__07596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Segment__Group_6__0__Impl7624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__1__Impl_in_rule__Segment__Group_6__17655 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__2_in_rule__Segment__Group_6__17658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Segment__Group_6__1__Impl7686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__2__Impl_in_rule__Segment__Group_6__27717 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__3_in_rule__Segment__Group_6__27720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__HasCarsAssignment_6_2_in_rule__Segment__Group_6__2__Impl7747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__3__Impl_in_rule__Segment__Group_6__37777 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__4_in_rule__Segment__Group_6__37780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6_3__0_in_rule__Segment__Group_6__3__Impl7807 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__4__Impl_in_rule__Segment__Group_6__47838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Segment__Group_6__4__Impl7866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6_3__0__Impl_in_rule__Segment__Group_6_3__07907 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Segment__Group_6_3__1_in_rule__Segment__Group_6_3__07910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Segment__Group_6_3__0__Impl7938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6_3__1__Impl_in_rule__Segment__Group_6_3__17969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__HasCarsAssignment_6_3_1_in_rule__Segment__Group_6_3__1__Impl7996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__0__Impl_in_rule__Semaphore__Group__08030 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__1_in_rule__Semaphore__Group__08033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__1__Impl_in_rule__Semaphore__Group__18091 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__2_in_rule__Semaphore__Group__18094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Semaphore__Group__1__Impl8122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__2__Impl_in_rule__Semaphore__Group__28153 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__3_in_rule__Semaphore__Group__28156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__NameAssignment_2_in_rule__Semaphore__Group__2__Impl8183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__3__Impl_in_rule__Semaphore__Group__38213 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__4_in_rule__Semaphore__Group__38216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Semaphore__Group__3__Impl8244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__4__Impl_in_rule__Semaphore__Group__48275 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__5_in_rule__Semaphore__Group__48278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_4__0_in_rule__Semaphore__Group__4__Impl8305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__5__Impl_in_rule__Semaphore__Group__58336 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__6_in_rule__Semaphore__Group__58339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_5__0_in_rule__Semaphore__Group__5__Impl8366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__6__Impl_in_rule__Semaphore__Group__68397 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__7_in_rule__Semaphore__Group__68400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_6__0_in_rule__Semaphore__Group__6__Impl8427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__7__Impl_in_rule__Semaphore__Group__78458 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__8_in_rule__Semaphore__Group__78461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Semaphore__Group__7__Impl8489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__8__Impl_in_rule__Semaphore__Group__88520 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__9_in_rule__Semaphore__Group__88523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__BelongsToAssignment_8_in_rule__Semaphore__Group__8__Impl8550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__9__Impl_in_rule__Semaphore__Group__98580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Semaphore__Group__9__Impl8608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_4__0__Impl_in_rule__Semaphore__Group_4__08659 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_4__1_in_rule__Semaphore__Group_4__08662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Semaphore__Group_4__0__Impl8690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_4__1__Impl_in_rule__Semaphore__Group_4__18721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__CanGoAssignment_4_1_in_rule__Semaphore__Group_4__1__Impl8748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_5__0__Impl_in_rule__Semaphore__Group_5__08782 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_5__1_in_rule__Semaphore__Group_5__08785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Semaphore__Group_5__0__Impl8813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_5__1__Impl_in_rule__Semaphore__Group_5__18844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__SecondsRedAssignment_5_1_in_rule__Semaphore__Group_5__1__Impl8871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_6__0__Impl_in_rule__Semaphore__Group_6__08905 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_6__1_in_rule__Semaphore__Group_6__08908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Semaphore__Group_6__0__Impl8936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_6__1__Impl_in_rule__Semaphore__Group_6__18967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__SecondsGreenAssignment_6_1_in_rule__Semaphore__Group_6__1__Impl8994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__0__Impl_in_rule__Signal_Impl__Group__09028 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__1_in_rule__Signal_Impl__Group__09031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__1__Impl_in_rule__Signal_Impl__Group__19089 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__2_in_rule__Signal_Impl__Group__19092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Signal_Impl__Group__1__Impl9120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__2__Impl_in_rule__Signal_Impl__Group__29151 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__3_in_rule__Signal_Impl__Group__29154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__NameAssignment_2_in_rule__Signal_Impl__Group__2__Impl9181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__3__Impl_in_rule__Signal_Impl__Group__39211 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__4_in_rule__Signal_Impl__Group__39214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Signal_Impl__Group__3__Impl9242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__4__Impl_in_rule__Signal_Impl__Group__49273 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__5_in_rule__Signal_Impl__Group__49276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Signal_Impl__Group__4__Impl9304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__5__Impl_in_rule__Signal_Impl__Group__59335 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__6_in_rule__Signal_Impl__Group__59338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__BelongsToAssignment_5_in_rule__Signal_Impl__Group__5__Impl9365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__6__Impl_in_rule__Signal_Impl__Group__69395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Signal_Impl__Group__6__Impl9423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__0__Impl_in_rule__Extractor__Group__09468 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__1_in_rule__Extractor__Group__09471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__1__Impl_in_rule__Extractor__Group__19529 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group__2_in_rule__Extractor__Group__19532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Extractor__Group__1__Impl9560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__2__Impl_in_rule__Extractor__Group__29591 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__3_in_rule__Extractor__Group__29594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__NameAssignment_2_in_rule__Extractor__Group__2__Impl9621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__3__Impl_in_rule__Extractor__Group__39651 = new BitSet(new long[]{0x0000000004800000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__4_in_rule__Extractor__Group__39654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Extractor__Group__3__Impl9682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__4__Impl_in_rule__Extractor__Group__49713 = new BitSet(new long[]{0x0000000004800000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__5_in_rule__Extractor__Group__49716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__0_in_rule__Extractor__Group__4__Impl9743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__5__Impl_in_rule__Extractor__Group__59774 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__6_in_rule__Extractor__Group__59777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Extractor__Group__5__Impl9805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__6__Impl_in_rule__Extractor__Group__69836 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group__7_in_rule__Extractor__Group__69839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Extractor__Group__6__Impl9867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__7__Impl_in_rule__Extractor__Group__79898 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__8_in_rule__Extractor__Group__79901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__HasEndsAssignment_7_in_rule__Extractor__Group__7__Impl9928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__8__Impl_in_rule__Extractor__Group__89958 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__9_in_rule__Extractor__Group__89961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_8__0_in_rule__Extractor__Group__8__Impl9988 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__9__Impl_in_rule__Extractor__Group__910019 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__10_in_rule__Extractor__Group__910022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Extractor__Group__9__Impl10050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__10__Impl_in_rule__Extractor__Group__1010081 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__11_in_rule__Extractor__Group__1010084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__0_in_rule__Extractor__Group__10__Impl10111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__11__Impl_in_rule__Extractor__Group__1110142 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__12_in_rule__Extractor__Group__1110145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__0_in_rule__Extractor__Group__11__Impl10172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__12__Impl_in_rule__Extractor__Group__1210203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Extractor__Group__12__Impl10231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__0__Impl_in_rule__Extractor__Group_4__010288 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__1_in_rule__Extractor__Group_4__010291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Extractor__Group_4__0__Impl10319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__1__Impl_in_rule__Extractor__Group_4__110350 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__2_in_rule__Extractor__Group_4__110353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Extractor__Group_4__1__Impl10381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__2__Impl_in_rule__Extractor__Group_4__210412 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__3_in_rule__Extractor__Group_4__210415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__HasStartsAssignment_4_2_in_rule__Extractor__Group_4__2__Impl10442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__3__Impl_in_rule__Extractor__Group_4__310472 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__4_in_rule__Extractor__Group_4__310475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4_3__0_in_rule__Extractor__Group_4__3__Impl10502 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__4__Impl_in_rule__Extractor__Group_4__410533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Extractor__Group_4__4__Impl10561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4_3__0__Impl_in_rule__Extractor__Group_4_3__010602 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4_3__1_in_rule__Extractor__Group_4_3__010605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Extractor__Group_4_3__0__Impl10633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4_3__1__Impl_in_rule__Extractor__Group_4_3__110664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__HasStartsAssignment_4_3_1_in_rule__Extractor__Group_4_3__1__Impl10691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_8__0__Impl_in_rule__Extractor__Group_8__010725 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_8__1_in_rule__Extractor__Group_8__010728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Extractor__Group_8__0__Impl10756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_8__1__Impl_in_rule__Extractor__Group_8__110787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__HasEndsAssignment_8_1_in_rule__Extractor__Group_8__1__Impl10814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__0__Impl_in_rule__Extractor__Group_10__010848 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__1_in_rule__Extractor__Group_10__010851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Extractor__Group_10__0__Impl10879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__1__Impl_in_rule__Extractor__Group_10__110910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__SemaphoreAssignment_10_1_in_rule__Extractor__Group_10__1__Impl10937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__0__Impl_in_rule__Extractor__Group_11__010971 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__1_in_rule__Extractor__Group_11__010974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Extractor__Group_11__0__Impl11002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__1__Impl_in_rule__Extractor__Group_11__111033 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__2_in_rule__Extractor__Group_11__111036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Extractor__Group_11__1__Impl11064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__2__Impl_in_rule__Extractor__Group_11__211095 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__3_in_rule__Extractor__Group_11__211098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__SignalsAssignment_11_2_in_rule__Extractor__Group_11__2__Impl11125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__3__Impl_in_rule__Extractor__Group_11__311155 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__4_in_rule__Extractor__Group_11__311158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11_3__0_in_rule__Extractor__Group_11__3__Impl11185 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__4__Impl_in_rule__Extractor__Group_11__411216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Extractor__Group_11__4__Impl11244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11_3__0__Impl_in_rule__Extractor__Group_11_3__011285 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11_3__1_in_rule__Extractor__Group_11_3__011288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Extractor__Group_11_3__0__Impl11316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11_3__1__Impl_in_rule__Extractor__Group_11_3__111347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__SignalsAssignment_11_3_1_in_rule__Extractor__Group_11_3__1__Impl11374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__0__Impl_in_rule__Injector__Group__011408 = new BitSet(new long[]{0x0000180000400000L});
        public static final BitSet FOLLOW_rule__Injector__Group__1_in_rule__Injector__Group__011411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__1__Impl_in_rule__Injector__Group__111469 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group__2_in_rule__Injector__Group__111472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Injector__Group__1__Impl11500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__2__Impl_in_rule__Injector__Group__211531 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Injector__Group__3_in_rule__Injector__Group__211534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__NameAssignment_2_in_rule__Injector__Group__2__Impl11561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__3__Impl_in_rule__Injector__Group__311591 = new BitSet(new long[]{0x0000200000800000L});
        public static final BitSet FOLLOW_rule__Injector__Group__4_in_rule__Injector__Group__311594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Injector__Group__3__Impl11622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__4__Impl_in_rule__Injector__Group__411653 = new BitSet(new long[]{0x0000200000800000L});
        public static final BitSet FOLLOW_rule__Injector__Group__5_in_rule__Injector__Group__411656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_4__0_in_rule__Injector__Group__4__Impl11683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__5__Impl_in_rule__Injector__Group__511714 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Injector__Group__6_in_rule__Injector__Group__511717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Injector__Group__5__Impl11745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__6__Impl_in_rule__Injector__Group__611776 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group__7_in_rule__Injector__Group__611779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Injector__Group__6__Impl11807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__7__Impl_in_rule__Injector__Group__711838 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Injector__Group__8_in_rule__Injector__Group__711841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__HasStartsAssignment_7_in_rule__Injector__Group__7__Impl11868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__8__Impl_in_rule__Injector__Group__811898 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Injector__Group__9_in_rule__Injector__Group__811901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_8__0_in_rule__Injector__Group__8__Impl11928 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Injector__Group__9__Impl_in_rule__Injector__Group__911959 = new BitSet(new long[]{0x000000001C008000L});
        public static final BitSet FOLLOW_rule__Injector__Group__10_in_rule__Injector__Group__911962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Injector__Group__9__Impl11990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__10__Impl_in_rule__Injector__Group__1012021 = new BitSet(new long[]{0x000000001C008000L});
        public static final BitSet FOLLOW_rule__Injector__Group__11_in_rule__Injector__Group__1012024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__0_in_rule__Injector__Group__10__Impl12051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__11__Impl_in_rule__Injector__Group__1112082 = new BitSet(new long[]{0x000000001C008000L});
        public static final BitSet FOLLOW_rule__Injector__Group__12_in_rule__Injector__Group__1112085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__0_in_rule__Injector__Group__11__Impl12112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__12__Impl_in_rule__Injector__Group__1212143 = new BitSet(new long[]{0x000000001C008000L});
        public static final BitSet FOLLOW_rule__Injector__Group__13_in_rule__Injector__Group__1212146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__0_in_rule__Injector__Group__12__Impl12173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__13__Impl_in_rule__Injector__Group__1312204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Injector__Group__13__Impl12232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_4__0__Impl_in_rule__Injector__Group_4__012291 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Injector__Group_4__1_in_rule__Injector__Group_4__012294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Injector__Group_4__0__Impl12322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_4__1__Impl_in_rule__Injector__Group_4__112353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__CarsPerHourAssignment_4_1_in_rule__Injector__Group_4__1__Impl12380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_8__0__Impl_in_rule__Injector__Group_8__012414 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_8__1_in_rule__Injector__Group_8__012417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Injector__Group_8__0__Impl12445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_8__1__Impl_in_rule__Injector__Group_8__112476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__HasStartsAssignment_8_1_in_rule__Injector__Group_8__1__Impl12503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__0__Impl_in_rule__Injector__Group_10__012537 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__1_in_rule__Injector__Group_10__012540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Injector__Group_10__0__Impl12568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__1__Impl_in_rule__Injector__Group_10__112599 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__2_in_rule__Injector__Group_10__112602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Injector__Group_10__1__Impl12630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__2__Impl_in_rule__Injector__Group_10__212661 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__3_in_rule__Injector__Group_10__212664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__HasEndsAssignment_10_2_in_rule__Injector__Group_10__2__Impl12691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__3__Impl_in_rule__Injector__Group_10__312721 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__4_in_rule__Injector__Group_10__312724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10_3__0_in_rule__Injector__Group_10__3__Impl12751 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__4__Impl_in_rule__Injector__Group_10__412782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Injector__Group_10__4__Impl12810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10_3__0__Impl_in_rule__Injector__Group_10_3__012851 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_10_3__1_in_rule__Injector__Group_10_3__012854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Injector__Group_10_3__0__Impl12882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10_3__1__Impl_in_rule__Injector__Group_10_3__112913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__HasEndsAssignment_10_3_1_in_rule__Injector__Group_10_3__1__Impl12940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__0__Impl_in_rule__Injector__Group_11__012974 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__1_in_rule__Injector__Group_11__012977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Injector__Group_11__0__Impl13005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__1__Impl_in_rule__Injector__Group_11__113036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__SemaphoreAssignment_11_1_in_rule__Injector__Group_11__1__Impl13063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__0__Impl_in_rule__Injector__Group_12__013097 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__1_in_rule__Injector__Group_12__013100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Injector__Group_12__0__Impl13128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__1__Impl_in_rule__Injector__Group_12__113159 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__2_in_rule__Injector__Group_12__113162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Injector__Group_12__1__Impl13190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__2__Impl_in_rule__Injector__Group_12__213221 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__3_in_rule__Injector__Group_12__213224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__SignalsAssignment_12_2_in_rule__Injector__Group_12__2__Impl13251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__3__Impl_in_rule__Injector__Group_12__313281 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__4_in_rule__Injector__Group_12__313284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12_3__0_in_rule__Injector__Group_12__3__Impl13311 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__4__Impl_in_rule__Injector__Group_12__413342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Injector__Group_12__4__Impl13370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12_3__0__Impl_in_rule__Injector__Group_12_3__013411 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_12_3__1_in_rule__Injector__Group_12_3__013414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Injector__Group_12_3__0__Impl13442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12_3__1__Impl_in_rule__Injector__Group_12_3__113473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__SignalsAssignment_12_3_1_in_rule__Injector__Group_12_3__1__Impl13500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__013534 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__013537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__EInt__Group__0__Impl13566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__113599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl13626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__0__Impl_in_rule__Speedlimit__Group__013659 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__1_in_rule__Speedlimit__Group__013662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Speedlimit__Group__0__Impl13690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__1__Impl_in_rule__Speedlimit__Group__113721 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__2_in_rule__Speedlimit__Group__113724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__NameAssignment_1_in_rule__Speedlimit__Group__1__Impl13751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__2__Impl_in_rule__Speedlimit__Group__213781 = new BitSet(new long[]{0x0001004000000000L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__3_in_rule__Speedlimit__Group__213784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Speedlimit__Group__2__Impl13812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__3__Impl_in_rule__Speedlimit__Group__313843 = new BitSet(new long[]{0x0001004000000000L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__4_in_rule__Speedlimit__Group__313846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group_3__0_in_rule__Speedlimit__Group__3__Impl13873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__4__Impl_in_rule__Speedlimit__Group__413904 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__5_in_rule__Speedlimit__Group__413907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Speedlimit__Group__4__Impl13935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__5__Impl_in_rule__Speedlimit__Group__513966 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__6_in_rule__Speedlimit__Group__513969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__BelongsToAssignment_5_in_rule__Speedlimit__Group__5__Impl13996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__6__Impl_in_rule__Speedlimit__Group__614026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Speedlimit__Group__6__Impl14054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group_3__0__Impl_in_rule__Speedlimit__Group_3__014099 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group_3__1_in_rule__Speedlimit__Group_3__014102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Speedlimit__Group_3__0__Impl14130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group_3__1__Impl_in_rule__Speedlimit__Group_3__114161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__SpeedAssignment_3_1_in_rule__Speedlimit__Group_3__1__Impl14188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__014222 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__014225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Stop__Group__0__Impl14253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__114284 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__114287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__NameAssignment_1_in_rule__Stop__Group__1__Impl14314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__214344 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__214347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Stop__Group__2__Impl14375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__314406 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Stop__Group__4_in_rule__Stop__Group__314409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Stop__Group__3__Impl14437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__4__Impl_in_rule__Stop__Group__414468 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Stop__Group__5_in_rule__Stop__Group__414471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__BelongsToAssignment_4_in_rule__Stop__Group__4__Impl14498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__5__Impl_in_rule__Stop__Group__514528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Stop__Group__5__Impl14556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__0__Impl_in_rule__Yield__Group__014599 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Yield__Group__1_in_rule__Yield__Group__014602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Yield__Group__0__Impl14630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__1__Impl_in_rule__Yield__Group__114661 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Yield__Group__2_in_rule__Yield__Group__114664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__NameAssignment_1_in_rule__Yield__Group__1__Impl14691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__2__Impl_in_rule__Yield__Group__214721 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Yield__Group__3_in_rule__Yield__Group__214724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Yield__Group__2__Impl14752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__3__Impl_in_rule__Yield__Group__314783 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Yield__Group__4_in_rule__Yield__Group__314786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Yield__Group__3__Impl14814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__4__Impl_in_rule__Yield__Group__414845 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Yield__Group__5_in_rule__Yield__Group__414848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__BelongsToAssignment_4_in_rule__Yield__Group__4__Impl14875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__5__Impl_in_rule__Yield__Group__514905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Yield__Group__5__Impl14933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSegment_in_rule__Highway__InitSegmentsAssignment_3_214981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSegment_in_rule__Highway__InitSegmentsAssignment_3_3_115012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_rule__Highway__InitNodesAssignment_4_215043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_rule__Highway__InitNodesAssignment_4_3_115074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCar_in_rule__Highway__InitCarsAssignment_5_215105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCar_in_rule__Highway__InitCarsAssignment_5_3_115136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemaphore_in_rule__Highway__InitSemaphoreAssignment_6_215167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemaphore_in_rule__Highway__InitSemaphoreAssignment_6_3_115198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_in_rule__Highway__InitSignalAssignment_7_215229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_in_rule__Highway__InitSignalAssignment_7_3_115260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__NameAssignment_215291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__HasStartsAssignment_615326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__HasStartsAssignment_7_115365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__HasEndsAssignment_1115404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__HasEndsAssignment_12_115443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__SemaphoreAssignment_14_115482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__SignalsAssignment_15_215521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__SignalsAssignment_15_3_115560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Car__NameAssignment_215595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDate_in_rule__Car__TimeInAssignment_4_115626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDate_in_rule__Car__TimeOutAssignment_5_115657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Car__IsInSegmentAssignment_6_115692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Segment__NameAssignment_215727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Segment__NumLanesAssignment_4_115758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Segment__LengthAssignment_5_115789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Segment__HasCarsAssignment_6_215824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Segment__HasCarsAssignment_6_3_115863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Semaphore__NameAssignment_215898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__Semaphore__CanGoAssignment_4_115929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Semaphore__SecondsRedAssignment_5_115960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Semaphore__SecondsGreenAssignment_6_115991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Semaphore__BelongsToAssignment_816026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Signal_Impl__NameAssignment_216061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Signal_Impl__BelongsToAssignment_516096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__NameAssignment_216131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__HasStartsAssignment_4_216166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__HasStartsAssignment_4_3_116205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__HasEndsAssignment_716244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__HasEndsAssignment_8_116283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__SemaphoreAssignment_10_116322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__SignalsAssignment_11_216361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__SignalsAssignment_11_3_116400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__NameAssignment_216435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Injector__CarsPerHourAssignment_4_116466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__HasStartsAssignment_716501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__HasStartsAssignment_8_116540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__HasEndsAssignment_10_216579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__HasEndsAssignment_10_3_116618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__SemaphoreAssignment_11_116657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__SignalsAssignment_12_216696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__SignalsAssignment_12_3_116735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Speedlimit__NameAssignment_116770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Speedlimit__SpeedAssignment_3_116801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Speedlimit__BelongsToAssignment_516836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Stop__NameAssignment_116871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Stop__BelongsToAssignment_416906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Yield__NameAssignment_116941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Yield__BelongsToAssignment_416976 = new BitSet(new long[]{0x0000000000000002L});
    }


}