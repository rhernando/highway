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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'true'", "'false'", "'Highway'", "'{'", "'}'", "'Segments'", "','", "'Nodes'", "'Cars'", "'Semaphore'", "'Signal'", "'Node'", "'hasStarts'", "'('", "')'", "'hasEnds'", "'semaphore'", "'signals'", "'Car'", "'timeIn'", "'timeOut'", "'isInSegment'", "'Segment'", "'numLanes'", "'length'", "'hasCars'", "'belongsTo'", "'canGo'", "'secondsRed'", "'secondsGreen'", "'Extractor'", "'Injector'", "'carsPerHour'", "'-'", "'Speedlimit'", "'Speed'", "'Stop'", "'Yield'"
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:405:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:409:2: ( ( 'EDate' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:410:1: ( 'EDate' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:410:1: ( 'EDate' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:411:1: 'EDate'
            {
             before(grammarAccess.getEDateAccess().getEDateKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleEDate815); 
             after(grammarAccess.getEDateAccess().getEDateKeyword()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:426:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:427:1: ( ruleEBoolean EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:428:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean843);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean850); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:435:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:439:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:440:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:440:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:441:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:442:1: ( rule__EBoolean__Alternatives )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:442:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean876);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:454:1: entryRuleSpeedlimit : ruleSpeedlimit EOF ;
    public final void entryRuleSpeedlimit() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:455:1: ( ruleSpeedlimit EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:456:1: ruleSpeedlimit EOF
            {
             before(grammarAccess.getSpeedlimitRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpeedlimit_in_entryRuleSpeedlimit903);
            ruleSpeedlimit();

            state._fsp--;

             after(grammarAccess.getSpeedlimitRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpeedlimit910); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:463:1: ruleSpeedlimit : ( ( rule__Speedlimit__Group__0 ) ) ;
    public final void ruleSpeedlimit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:467:2: ( ( ( rule__Speedlimit__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:468:1: ( ( rule__Speedlimit__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:468:1: ( ( rule__Speedlimit__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:469:1: ( rule__Speedlimit__Group__0 )
            {
             before(grammarAccess.getSpeedlimitAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:470:1: ( rule__Speedlimit__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:470:2: rule__Speedlimit__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__0_in_ruleSpeedlimit936);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:482:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:483:1: ( ruleStop EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:484:1: ruleStop EOF
            {
             before(grammarAccess.getStopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStop_in_entryRuleStop963);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getStopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStop970); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:491:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:495:2: ( ( ( rule__Stop__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:496:1: ( ( rule__Stop__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:496:1: ( ( rule__Stop__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:497:1: ( rule__Stop__Group__0 )
            {
             before(grammarAccess.getStopAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:498:1: ( rule__Stop__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:498:2: rule__Stop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0_in_ruleStop996);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:510:1: entryRuleYield : ruleYield EOF ;
    public final void entryRuleYield() throws RecognitionException {
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:511:1: ( ruleYield EOF )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:512:1: ruleYield EOF
            {
             before(grammarAccess.getYieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleYield_in_entryRuleYield1023);
            ruleYield();

            state._fsp--;

             after(grammarAccess.getYieldRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleYield1030); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:519:1: ruleYield : ( ( rule__Yield__Group__0 ) ) ;
    public final void ruleYield() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:523:2: ( ( ( rule__Yield__Group__0 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:524:1: ( ( rule__Yield__Group__0 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:524:1: ( ( rule__Yield__Group__0 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:525:1: ( rule__Yield__Group__0 )
            {
             before(grammarAccess.getYieldAccess().getGroup()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:526:1: ( rule__Yield__Group__0 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:526:2: rule__Yield__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__0_in_ruleYield1056);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:538:1: rule__Node__Alternatives : ( ( ruleNode_Impl ) | ( ruleExtractor ) | ( ruleInjector ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:542:1: ( ( ruleNode_Impl ) | ( ruleExtractor ) | ( ruleInjector ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 42:
                {
                alt1=2;
                }
                break;
            case 43:
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
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:543:1: ( ruleNode_Impl )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:543:1: ( ruleNode_Impl )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:544:1: ruleNode_Impl
                    {
                     before(grammarAccess.getNodeAccess().getNode_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNode_Impl_in_rule__Node__Alternatives1092);
                    ruleNode_Impl();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getNode_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:549:6: ( ruleExtractor )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:549:6: ( ruleExtractor )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:550:1: ruleExtractor
                    {
                     before(grammarAccess.getNodeAccess().getExtractorParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExtractor_in_rule__Node__Alternatives1109);
                    ruleExtractor();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getExtractorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:555:6: ( ruleInjector )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:555:6: ( ruleInjector )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:556:1: ruleInjector
                    {
                     before(grammarAccess.getNodeAccess().getInjectorParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInjector_in_rule__Node__Alternatives1126);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:566:1: rule__Signal__Alternatives : ( ( ruleSignal_Impl ) | ( ruleSpeedlimit ) | ( ruleStop ) | ( ruleYield ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:570:1: ( ( ruleSignal_Impl ) | ( ruleSpeedlimit ) | ( ruleStop ) | ( ruleYield ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 46:
                {
                alt2=2;
                }
                break;
            case 48:
                {
                alt2=3;
                }
                break;
            case 49:
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
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:571:1: ( ruleSignal_Impl )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:571:1: ( ruleSignal_Impl )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:572:1: ruleSignal_Impl
                    {
                     before(grammarAccess.getSignalAccess().getSignal_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSignal_Impl_in_rule__Signal__Alternatives1158);
                    ruleSignal_Impl();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getSignal_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:577:6: ( ruleSpeedlimit )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:577:6: ( ruleSpeedlimit )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:578:1: ruleSpeedlimit
                    {
                     before(grammarAccess.getSignalAccess().getSpeedlimitParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSpeedlimit_in_rule__Signal__Alternatives1175);
                    ruleSpeedlimit();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getSpeedlimitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:583:6: ( ruleStop )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:583:6: ( ruleStop )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:584:1: ruleStop
                    {
                     before(grammarAccess.getSignalAccess().getStopParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStop_in_rule__Signal__Alternatives1192);
                    ruleStop();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getStopParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:589:6: ( ruleYield )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:589:6: ( ruleYield )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:590:1: ruleYield
                    {
                     before(grammarAccess.getSignalAccess().getYieldParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleYield_in_rule__Signal__Alternatives1209);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:600:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:604:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:605:1: ( RULE_STRING )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:605:1: ( RULE_STRING )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:606:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1241); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:611:6: ( RULE_ID )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:611:6: ( RULE_ID )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:612:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1258); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:622:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:626:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:627:1: ( 'true' )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:627:1: ( 'true' )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:628:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives1291); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:635:6: ( 'false' )
                    {
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:635:6: ( 'false' )
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:636:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__EBoolean__Alternatives1311); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:650:1: rule__Highway__Group__0 : rule__Highway__Group__0__Impl rule__Highway__Group__1 ;
    public final void rule__Highway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:654:1: ( rule__Highway__Group__0__Impl rule__Highway__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:655:2: rule__Highway__Group__0__Impl rule__Highway__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__0__Impl_in_rule__Highway__Group__01343);
            rule__Highway__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__1_in_rule__Highway__Group__01346);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:662:1: rule__Highway__Group__0__Impl : ( () ) ;
    public final void rule__Highway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:666:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:667:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:667:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:668:1: ()
            {
             before(grammarAccess.getHighwayAccess().getHighwayAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:669:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:671:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:681:1: rule__Highway__Group__1 : rule__Highway__Group__1__Impl rule__Highway__Group__2 ;
    public final void rule__Highway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:685:1: ( rule__Highway__Group__1__Impl rule__Highway__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:686:2: rule__Highway__Group__1__Impl rule__Highway__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__1__Impl_in_rule__Highway__Group__11404);
            rule__Highway__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__2_in_rule__Highway__Group__11407);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:693:1: rule__Highway__Group__1__Impl : ( 'Highway' ) ;
    public final void rule__Highway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:697:1: ( ( 'Highway' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:698:1: ( 'Highway' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:698:1: ( 'Highway' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:699:1: 'Highway'
            {
             before(grammarAccess.getHighwayAccess().getHighwayKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Highway__Group__1__Impl1435); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:712:1: rule__Highway__Group__2 : rule__Highway__Group__2__Impl rule__Highway__Group__3 ;
    public final void rule__Highway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:716:1: ( rule__Highway__Group__2__Impl rule__Highway__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:717:2: rule__Highway__Group__2__Impl rule__Highway__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__2__Impl_in_rule__Highway__Group__21466);
            rule__Highway__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__3_in_rule__Highway__Group__21469);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:724:1: rule__Highway__Group__2__Impl : ( '{' ) ;
    public final void rule__Highway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:728:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:729:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:729:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:730:1: '{'
            {
             before(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Highway__Group__2__Impl1497); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:743:1: rule__Highway__Group__3 : rule__Highway__Group__3__Impl rule__Highway__Group__4 ;
    public final void rule__Highway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:747:1: ( rule__Highway__Group__3__Impl rule__Highway__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:748:2: rule__Highway__Group__3__Impl rule__Highway__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__3__Impl_in_rule__Highway__Group__31528);
            rule__Highway__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__4_in_rule__Highway__Group__31531);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:755:1: rule__Highway__Group__3__Impl : ( ( rule__Highway__Group_3__0 )? ) ;
    public final void rule__Highway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:759:1: ( ( ( rule__Highway__Group_3__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:760:1: ( ( rule__Highway__Group_3__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:760:1: ( ( rule__Highway__Group_3__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:761:1: ( rule__Highway__Group_3__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:762:1: ( rule__Highway__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:762:2: rule__Highway__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__0_in_rule__Highway__Group__3__Impl1558);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:772:1: rule__Highway__Group__4 : rule__Highway__Group__4__Impl rule__Highway__Group__5 ;
    public final void rule__Highway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:776:1: ( rule__Highway__Group__4__Impl rule__Highway__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:777:2: rule__Highway__Group__4__Impl rule__Highway__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__4__Impl_in_rule__Highway__Group__41589);
            rule__Highway__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__5_in_rule__Highway__Group__41592);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:784:1: rule__Highway__Group__4__Impl : ( ( rule__Highway__Group_4__0 )? ) ;
    public final void rule__Highway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:788:1: ( ( ( rule__Highway__Group_4__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:789:1: ( ( rule__Highway__Group_4__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:789:1: ( ( rule__Highway__Group_4__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:790:1: ( rule__Highway__Group_4__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:791:1: ( rule__Highway__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:791:2: rule__Highway__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__0_in_rule__Highway__Group__4__Impl1619);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:801:1: rule__Highway__Group__5 : rule__Highway__Group__5__Impl rule__Highway__Group__6 ;
    public final void rule__Highway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:805:1: ( rule__Highway__Group__5__Impl rule__Highway__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:806:2: rule__Highway__Group__5__Impl rule__Highway__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__5__Impl_in_rule__Highway__Group__51650);
            rule__Highway__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__6_in_rule__Highway__Group__51653);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:813:1: rule__Highway__Group__5__Impl : ( ( rule__Highway__Group_5__0 )? ) ;
    public final void rule__Highway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:817:1: ( ( ( rule__Highway__Group_5__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:818:1: ( ( rule__Highway__Group_5__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:818:1: ( ( rule__Highway__Group_5__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:819:1: ( rule__Highway__Group_5__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_5()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:820:1: ( rule__Highway__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:820:2: rule__Highway__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__0_in_rule__Highway__Group__5__Impl1680);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:830:1: rule__Highway__Group__6 : rule__Highway__Group__6__Impl rule__Highway__Group__7 ;
    public final void rule__Highway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:834:1: ( rule__Highway__Group__6__Impl rule__Highway__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:835:2: rule__Highway__Group__6__Impl rule__Highway__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__6__Impl_in_rule__Highway__Group__61711);
            rule__Highway__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__7_in_rule__Highway__Group__61714);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:842:1: rule__Highway__Group__6__Impl : ( ( rule__Highway__Group_6__0 )? ) ;
    public final void rule__Highway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:846:1: ( ( ( rule__Highway__Group_6__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:847:1: ( ( rule__Highway__Group_6__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:847:1: ( ( rule__Highway__Group_6__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:848:1: ( rule__Highway__Group_6__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_6()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:849:1: ( rule__Highway__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:849:2: rule__Highway__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__0_in_rule__Highway__Group__6__Impl1741);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:859:1: rule__Highway__Group__7 : rule__Highway__Group__7__Impl rule__Highway__Group__8 ;
    public final void rule__Highway__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:863:1: ( rule__Highway__Group__7__Impl rule__Highway__Group__8 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:864:2: rule__Highway__Group__7__Impl rule__Highway__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__7__Impl_in_rule__Highway__Group__71772);
            rule__Highway__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__8_in_rule__Highway__Group__71775);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:871:1: rule__Highway__Group__7__Impl : ( ( rule__Highway__Group_7__0 )? ) ;
    public final void rule__Highway__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:875:1: ( ( ( rule__Highway__Group_7__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:876:1: ( ( rule__Highway__Group_7__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:876:1: ( ( rule__Highway__Group_7__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:877:1: ( rule__Highway__Group_7__0 )?
            {
             before(grammarAccess.getHighwayAccess().getGroup_7()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:878:1: ( rule__Highway__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:878:2: rule__Highway__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__0_in_rule__Highway__Group__7__Impl1802);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:888:1: rule__Highway__Group__8 : rule__Highway__Group__8__Impl ;
    public final void rule__Highway__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:892:1: ( rule__Highway__Group__8__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:893:2: rule__Highway__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group__8__Impl_in_rule__Highway__Group__81833);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:899:1: rule__Highway__Group__8__Impl : ( '}' ) ;
    public final void rule__Highway__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:903:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:904:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:904:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:905:1: '}'
            {
             before(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Highway__Group__8__Impl1861); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:936:1: rule__Highway__Group_3__0 : rule__Highway__Group_3__0__Impl rule__Highway__Group_3__1 ;
    public final void rule__Highway__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:940:1: ( rule__Highway__Group_3__0__Impl rule__Highway__Group_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:941:2: rule__Highway__Group_3__0__Impl rule__Highway__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__0__Impl_in_rule__Highway__Group_3__01910);
            rule__Highway__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__1_in_rule__Highway__Group_3__01913);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:948:1: rule__Highway__Group_3__0__Impl : ( 'Segments' ) ;
    public final void rule__Highway__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:952:1: ( ( 'Segments' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:953:1: ( 'Segments' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:953:1: ( 'Segments' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:954:1: 'Segments'
            {
             before(grammarAccess.getHighwayAccess().getSegmentsKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Highway__Group_3__0__Impl1941); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:967:1: rule__Highway__Group_3__1 : rule__Highway__Group_3__1__Impl rule__Highway__Group_3__2 ;
    public final void rule__Highway__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:971:1: ( rule__Highway__Group_3__1__Impl rule__Highway__Group_3__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:972:2: rule__Highway__Group_3__1__Impl rule__Highway__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__1__Impl_in_rule__Highway__Group_3__11972);
            rule__Highway__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__2_in_rule__Highway__Group_3__11975);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:979:1: rule__Highway__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:983:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:984:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:984:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:985:1: '{'
            {
             before(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Highway__Group_3__1__Impl2003); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:998:1: rule__Highway__Group_3__2 : rule__Highway__Group_3__2__Impl rule__Highway__Group_3__3 ;
    public final void rule__Highway__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1002:1: ( rule__Highway__Group_3__2__Impl rule__Highway__Group_3__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1003:2: rule__Highway__Group_3__2__Impl rule__Highway__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__2__Impl_in_rule__Highway__Group_3__22034);
            rule__Highway__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__3_in_rule__Highway__Group_3__22037);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1010:1: rule__Highway__Group_3__2__Impl : ( ( rule__Highway__InitSegmentsAssignment_3_2 ) ) ;
    public final void rule__Highway__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1014:1: ( ( ( rule__Highway__InitSegmentsAssignment_3_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1015:1: ( ( rule__Highway__InitSegmentsAssignment_3_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1015:1: ( ( rule__Highway__InitSegmentsAssignment_3_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1016:1: ( rule__Highway__InitSegmentsAssignment_3_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsAssignment_3_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1017:1: ( rule__Highway__InitSegmentsAssignment_3_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1017:2: rule__Highway__InitSegmentsAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSegmentsAssignment_3_2_in_rule__Highway__Group_3__2__Impl2064);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1027:1: rule__Highway__Group_3__3 : rule__Highway__Group_3__3__Impl rule__Highway__Group_3__4 ;
    public final void rule__Highway__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1031:1: ( rule__Highway__Group_3__3__Impl rule__Highway__Group_3__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1032:2: rule__Highway__Group_3__3__Impl rule__Highway__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__3__Impl_in_rule__Highway__Group_3__32094);
            rule__Highway__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__4_in_rule__Highway__Group_3__32097);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1039:1: rule__Highway__Group_3__3__Impl : ( ( rule__Highway__Group_3_3__0 )* ) ;
    public final void rule__Highway__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1043:1: ( ( ( rule__Highway__Group_3_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1044:1: ( ( rule__Highway__Group_3_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1044:1: ( ( rule__Highway__Group_3_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1045:1: ( rule__Highway__Group_3_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_3_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1046:1: ( rule__Highway__Group_3_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1046:2: rule__Highway__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3_3__0_in_rule__Highway__Group_3__3__Impl2124);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1056:1: rule__Highway__Group_3__4 : rule__Highway__Group_3__4__Impl ;
    public final void rule__Highway__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1060:1: ( rule__Highway__Group_3__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1061:2: rule__Highway__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3__4__Impl_in_rule__Highway__Group_3__42155);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1067:1: rule__Highway__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1071:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1072:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1072:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1073:1: '}'
            {
             before(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Highway__Group_3__4__Impl2183); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1096:1: rule__Highway__Group_3_3__0 : rule__Highway__Group_3_3__0__Impl rule__Highway__Group_3_3__1 ;
    public final void rule__Highway__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1100:1: ( rule__Highway__Group_3_3__0__Impl rule__Highway__Group_3_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1101:2: rule__Highway__Group_3_3__0__Impl rule__Highway__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3_3__0__Impl_in_rule__Highway__Group_3_3__02224);
            rule__Highway__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3_3__1_in_rule__Highway__Group_3_3__02227);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1108:1: rule__Highway__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1112:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1113:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1113:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1114:1: ','
            {
             before(grammarAccess.getHighwayAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Highway__Group_3_3__0__Impl2255); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1127:1: rule__Highway__Group_3_3__1 : rule__Highway__Group_3_3__1__Impl ;
    public final void rule__Highway__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1131:1: ( rule__Highway__Group_3_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1132:2: rule__Highway__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_3_3__1__Impl_in_rule__Highway__Group_3_3__12286);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1138:1: rule__Highway__Group_3_3__1__Impl : ( ( rule__Highway__InitSegmentsAssignment_3_3_1 ) ) ;
    public final void rule__Highway__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1142:1: ( ( ( rule__Highway__InitSegmentsAssignment_3_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1143:1: ( ( rule__Highway__InitSegmentsAssignment_3_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1143:1: ( ( rule__Highway__InitSegmentsAssignment_3_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1144:1: ( rule__Highway__InitSegmentsAssignment_3_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsAssignment_3_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1145:1: ( rule__Highway__InitSegmentsAssignment_3_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1145:2: rule__Highway__InitSegmentsAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSegmentsAssignment_3_3_1_in_rule__Highway__Group_3_3__1__Impl2313);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1159:1: rule__Highway__Group_4__0 : rule__Highway__Group_4__0__Impl rule__Highway__Group_4__1 ;
    public final void rule__Highway__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1163:1: ( rule__Highway__Group_4__0__Impl rule__Highway__Group_4__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1164:2: rule__Highway__Group_4__0__Impl rule__Highway__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__0__Impl_in_rule__Highway__Group_4__02347);
            rule__Highway__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__1_in_rule__Highway__Group_4__02350);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1171:1: rule__Highway__Group_4__0__Impl : ( 'Nodes' ) ;
    public final void rule__Highway__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1175:1: ( ( 'Nodes' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1176:1: ( 'Nodes' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1176:1: ( 'Nodes' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1177:1: 'Nodes'
            {
             before(grammarAccess.getHighwayAccess().getNodesKeyword_4_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Highway__Group_4__0__Impl2378); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1190:1: rule__Highway__Group_4__1 : rule__Highway__Group_4__1__Impl rule__Highway__Group_4__2 ;
    public final void rule__Highway__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1194:1: ( rule__Highway__Group_4__1__Impl rule__Highway__Group_4__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1195:2: rule__Highway__Group_4__1__Impl rule__Highway__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__1__Impl_in_rule__Highway__Group_4__12409);
            rule__Highway__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__2_in_rule__Highway__Group_4__12412);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1202:1: rule__Highway__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1206:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1207:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1207:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1208:1: '{'
            {
             before(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Highway__Group_4__1__Impl2440); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1221:1: rule__Highway__Group_4__2 : rule__Highway__Group_4__2__Impl rule__Highway__Group_4__3 ;
    public final void rule__Highway__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1225:1: ( rule__Highway__Group_4__2__Impl rule__Highway__Group_4__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1226:2: rule__Highway__Group_4__2__Impl rule__Highway__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__2__Impl_in_rule__Highway__Group_4__22471);
            rule__Highway__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__3_in_rule__Highway__Group_4__22474);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1233:1: rule__Highway__Group_4__2__Impl : ( ( rule__Highway__InitNodesAssignment_4_2 ) ) ;
    public final void rule__Highway__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1237:1: ( ( ( rule__Highway__InitNodesAssignment_4_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1238:1: ( ( rule__Highway__InitNodesAssignment_4_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1238:1: ( ( rule__Highway__InitNodesAssignment_4_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1239:1: ( rule__Highway__InitNodesAssignment_4_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitNodesAssignment_4_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1240:1: ( rule__Highway__InitNodesAssignment_4_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1240:2: rule__Highway__InitNodesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitNodesAssignment_4_2_in_rule__Highway__Group_4__2__Impl2501);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1250:1: rule__Highway__Group_4__3 : rule__Highway__Group_4__3__Impl rule__Highway__Group_4__4 ;
    public final void rule__Highway__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1254:1: ( rule__Highway__Group_4__3__Impl rule__Highway__Group_4__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1255:2: rule__Highway__Group_4__3__Impl rule__Highway__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__3__Impl_in_rule__Highway__Group_4__32531);
            rule__Highway__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__4_in_rule__Highway__Group_4__32534);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1262:1: rule__Highway__Group_4__3__Impl : ( ( rule__Highway__Group_4_3__0 )* ) ;
    public final void rule__Highway__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1266:1: ( ( ( rule__Highway__Group_4_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1267:1: ( ( rule__Highway__Group_4_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1267:1: ( ( rule__Highway__Group_4_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1268:1: ( rule__Highway__Group_4_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_4_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1269:1: ( rule__Highway__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1269:2: rule__Highway__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4_3__0_in_rule__Highway__Group_4__3__Impl2561);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1279:1: rule__Highway__Group_4__4 : rule__Highway__Group_4__4__Impl ;
    public final void rule__Highway__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1283:1: ( rule__Highway__Group_4__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1284:2: rule__Highway__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4__4__Impl_in_rule__Highway__Group_4__42592);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1290:1: rule__Highway__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1294:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1295:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1295:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1296:1: '}'
            {
             before(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Highway__Group_4__4__Impl2620); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1319:1: rule__Highway__Group_4_3__0 : rule__Highway__Group_4_3__0__Impl rule__Highway__Group_4_3__1 ;
    public final void rule__Highway__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1323:1: ( rule__Highway__Group_4_3__0__Impl rule__Highway__Group_4_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1324:2: rule__Highway__Group_4_3__0__Impl rule__Highway__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4_3__0__Impl_in_rule__Highway__Group_4_3__02661);
            rule__Highway__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4_3__1_in_rule__Highway__Group_4_3__02664);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1331:1: rule__Highway__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1335:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1336:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1336:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1337:1: ','
            {
             before(grammarAccess.getHighwayAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Highway__Group_4_3__0__Impl2692); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1350:1: rule__Highway__Group_4_3__1 : rule__Highway__Group_4_3__1__Impl ;
    public final void rule__Highway__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1354:1: ( rule__Highway__Group_4_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1355:2: rule__Highway__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_4_3__1__Impl_in_rule__Highway__Group_4_3__12723);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1361:1: rule__Highway__Group_4_3__1__Impl : ( ( rule__Highway__InitNodesAssignment_4_3_1 ) ) ;
    public final void rule__Highway__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1365:1: ( ( ( rule__Highway__InitNodesAssignment_4_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1366:1: ( ( rule__Highway__InitNodesAssignment_4_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1366:1: ( ( rule__Highway__InitNodesAssignment_4_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1367:1: ( rule__Highway__InitNodesAssignment_4_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitNodesAssignment_4_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1368:1: ( rule__Highway__InitNodesAssignment_4_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1368:2: rule__Highway__InitNodesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitNodesAssignment_4_3_1_in_rule__Highway__Group_4_3__1__Impl2750);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1382:1: rule__Highway__Group_5__0 : rule__Highway__Group_5__0__Impl rule__Highway__Group_5__1 ;
    public final void rule__Highway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1386:1: ( rule__Highway__Group_5__0__Impl rule__Highway__Group_5__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1387:2: rule__Highway__Group_5__0__Impl rule__Highway__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__0__Impl_in_rule__Highway__Group_5__02784);
            rule__Highway__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__1_in_rule__Highway__Group_5__02787);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1394:1: rule__Highway__Group_5__0__Impl : ( 'Cars' ) ;
    public final void rule__Highway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1398:1: ( ( 'Cars' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1399:1: ( 'Cars' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1399:1: ( 'Cars' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1400:1: 'Cars'
            {
             before(grammarAccess.getHighwayAccess().getCarsKeyword_5_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Highway__Group_5__0__Impl2815); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1413:1: rule__Highway__Group_5__1 : rule__Highway__Group_5__1__Impl rule__Highway__Group_5__2 ;
    public final void rule__Highway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1417:1: ( rule__Highway__Group_5__1__Impl rule__Highway__Group_5__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1418:2: rule__Highway__Group_5__1__Impl rule__Highway__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__1__Impl_in_rule__Highway__Group_5__12846);
            rule__Highway__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__2_in_rule__Highway__Group_5__12849);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1425:1: rule__Highway__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1429:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1430:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1430:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1431:1: '{'
            {
             before(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Highway__Group_5__1__Impl2877); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1444:1: rule__Highway__Group_5__2 : rule__Highway__Group_5__2__Impl rule__Highway__Group_5__3 ;
    public final void rule__Highway__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1448:1: ( rule__Highway__Group_5__2__Impl rule__Highway__Group_5__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1449:2: rule__Highway__Group_5__2__Impl rule__Highway__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__2__Impl_in_rule__Highway__Group_5__22908);
            rule__Highway__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__3_in_rule__Highway__Group_5__22911);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1456:1: rule__Highway__Group_5__2__Impl : ( ( rule__Highway__InitCarsAssignment_5_2 ) ) ;
    public final void rule__Highway__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1460:1: ( ( ( rule__Highway__InitCarsAssignment_5_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1461:1: ( ( rule__Highway__InitCarsAssignment_5_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1461:1: ( ( rule__Highway__InitCarsAssignment_5_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1462:1: ( rule__Highway__InitCarsAssignment_5_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitCarsAssignment_5_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1463:1: ( rule__Highway__InitCarsAssignment_5_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1463:2: rule__Highway__InitCarsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitCarsAssignment_5_2_in_rule__Highway__Group_5__2__Impl2938);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1473:1: rule__Highway__Group_5__3 : rule__Highway__Group_5__3__Impl rule__Highway__Group_5__4 ;
    public final void rule__Highway__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1477:1: ( rule__Highway__Group_5__3__Impl rule__Highway__Group_5__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1478:2: rule__Highway__Group_5__3__Impl rule__Highway__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__3__Impl_in_rule__Highway__Group_5__32968);
            rule__Highway__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__4_in_rule__Highway__Group_5__32971);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1485:1: rule__Highway__Group_5__3__Impl : ( ( rule__Highway__Group_5_3__0 )* ) ;
    public final void rule__Highway__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1489:1: ( ( ( rule__Highway__Group_5_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1490:1: ( ( rule__Highway__Group_5_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1490:1: ( ( rule__Highway__Group_5_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1491:1: ( rule__Highway__Group_5_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_5_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1492:1: ( rule__Highway__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1492:2: rule__Highway__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5_3__0_in_rule__Highway__Group_5__3__Impl2998);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1502:1: rule__Highway__Group_5__4 : rule__Highway__Group_5__4__Impl ;
    public final void rule__Highway__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1506:1: ( rule__Highway__Group_5__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1507:2: rule__Highway__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5__4__Impl_in_rule__Highway__Group_5__43029);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1513:1: rule__Highway__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1517:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1518:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1518:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1519:1: '}'
            {
             before(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Highway__Group_5__4__Impl3057); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1542:1: rule__Highway__Group_5_3__0 : rule__Highway__Group_5_3__0__Impl rule__Highway__Group_5_3__1 ;
    public final void rule__Highway__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1546:1: ( rule__Highway__Group_5_3__0__Impl rule__Highway__Group_5_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1547:2: rule__Highway__Group_5_3__0__Impl rule__Highway__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5_3__0__Impl_in_rule__Highway__Group_5_3__03098);
            rule__Highway__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5_3__1_in_rule__Highway__Group_5_3__03101);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1554:1: rule__Highway__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1558:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1559:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1559:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1560:1: ','
            {
             before(grammarAccess.getHighwayAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Highway__Group_5_3__0__Impl3129); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1573:1: rule__Highway__Group_5_3__1 : rule__Highway__Group_5_3__1__Impl ;
    public final void rule__Highway__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1577:1: ( rule__Highway__Group_5_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1578:2: rule__Highway__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_5_3__1__Impl_in_rule__Highway__Group_5_3__13160);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1584:1: rule__Highway__Group_5_3__1__Impl : ( ( rule__Highway__InitCarsAssignment_5_3_1 ) ) ;
    public final void rule__Highway__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1588:1: ( ( ( rule__Highway__InitCarsAssignment_5_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1589:1: ( ( rule__Highway__InitCarsAssignment_5_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1589:1: ( ( rule__Highway__InitCarsAssignment_5_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1590:1: ( rule__Highway__InitCarsAssignment_5_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitCarsAssignment_5_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1591:1: ( rule__Highway__InitCarsAssignment_5_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1591:2: rule__Highway__InitCarsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitCarsAssignment_5_3_1_in_rule__Highway__Group_5_3__1__Impl3187);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1605:1: rule__Highway__Group_6__0 : rule__Highway__Group_6__0__Impl rule__Highway__Group_6__1 ;
    public final void rule__Highway__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1609:1: ( rule__Highway__Group_6__0__Impl rule__Highway__Group_6__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1610:2: rule__Highway__Group_6__0__Impl rule__Highway__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__0__Impl_in_rule__Highway__Group_6__03221);
            rule__Highway__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__1_in_rule__Highway__Group_6__03224);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1617:1: rule__Highway__Group_6__0__Impl : ( 'Semaphore' ) ;
    public final void rule__Highway__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1621:1: ( ( 'Semaphore' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1622:1: ( 'Semaphore' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1622:1: ( 'Semaphore' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1623:1: 'Semaphore'
            {
             before(grammarAccess.getHighwayAccess().getSemaphoreKeyword_6_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Highway__Group_6__0__Impl3252); 
             after(grammarAccess.getHighwayAccess().getSemaphoreKeyword_6_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1636:1: rule__Highway__Group_6__1 : rule__Highway__Group_6__1__Impl rule__Highway__Group_6__2 ;
    public final void rule__Highway__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1640:1: ( rule__Highway__Group_6__1__Impl rule__Highway__Group_6__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1641:2: rule__Highway__Group_6__1__Impl rule__Highway__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__1__Impl_in_rule__Highway__Group_6__13283);
            rule__Highway__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__2_in_rule__Highway__Group_6__13286);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1648:1: rule__Highway__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1652:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1653:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1653:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1654:1: '{'
            {
             before(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Highway__Group_6__1__Impl3314); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1667:1: rule__Highway__Group_6__2 : rule__Highway__Group_6__2__Impl rule__Highway__Group_6__3 ;
    public final void rule__Highway__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1671:1: ( rule__Highway__Group_6__2__Impl rule__Highway__Group_6__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1672:2: rule__Highway__Group_6__2__Impl rule__Highway__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__2__Impl_in_rule__Highway__Group_6__23345);
            rule__Highway__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__3_in_rule__Highway__Group_6__23348);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1679:1: rule__Highway__Group_6__2__Impl : ( ( rule__Highway__InitSemaphoreAssignment_6_2 ) ) ;
    public final void rule__Highway__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1683:1: ( ( ( rule__Highway__InitSemaphoreAssignment_6_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1684:1: ( ( rule__Highway__InitSemaphoreAssignment_6_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1684:1: ( ( rule__Highway__InitSemaphoreAssignment_6_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1685:1: ( rule__Highway__InitSemaphoreAssignment_6_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreAssignment_6_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1686:1: ( rule__Highway__InitSemaphoreAssignment_6_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1686:2: rule__Highway__InitSemaphoreAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSemaphoreAssignment_6_2_in_rule__Highway__Group_6__2__Impl3375);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1696:1: rule__Highway__Group_6__3 : rule__Highway__Group_6__3__Impl rule__Highway__Group_6__4 ;
    public final void rule__Highway__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1700:1: ( rule__Highway__Group_6__3__Impl rule__Highway__Group_6__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1701:2: rule__Highway__Group_6__3__Impl rule__Highway__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__3__Impl_in_rule__Highway__Group_6__33405);
            rule__Highway__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__4_in_rule__Highway__Group_6__33408);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1708:1: rule__Highway__Group_6__3__Impl : ( ( rule__Highway__Group_6_3__0 )* ) ;
    public final void rule__Highway__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1712:1: ( ( ( rule__Highway__Group_6_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1713:1: ( ( rule__Highway__Group_6_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1713:1: ( ( rule__Highway__Group_6_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1714:1: ( rule__Highway__Group_6_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_6_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1715:1: ( rule__Highway__Group_6_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1715:2: rule__Highway__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6_3__0_in_rule__Highway__Group_6__3__Impl3435);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1725:1: rule__Highway__Group_6__4 : rule__Highway__Group_6__4__Impl ;
    public final void rule__Highway__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1729:1: ( rule__Highway__Group_6__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1730:2: rule__Highway__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6__4__Impl_in_rule__Highway__Group_6__43466);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1736:1: rule__Highway__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1740:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1741:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1741:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1742:1: '}'
            {
             before(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Highway__Group_6__4__Impl3494); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1765:1: rule__Highway__Group_6_3__0 : rule__Highway__Group_6_3__0__Impl rule__Highway__Group_6_3__1 ;
    public final void rule__Highway__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1769:1: ( rule__Highway__Group_6_3__0__Impl rule__Highway__Group_6_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1770:2: rule__Highway__Group_6_3__0__Impl rule__Highway__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6_3__0__Impl_in_rule__Highway__Group_6_3__03535);
            rule__Highway__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6_3__1_in_rule__Highway__Group_6_3__03538);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1777:1: rule__Highway__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1781:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1782:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1782:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1783:1: ','
            {
             before(grammarAccess.getHighwayAccess().getCommaKeyword_6_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Highway__Group_6_3__0__Impl3566); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1796:1: rule__Highway__Group_6_3__1 : rule__Highway__Group_6_3__1__Impl ;
    public final void rule__Highway__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1800:1: ( rule__Highway__Group_6_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1801:2: rule__Highway__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_6_3__1__Impl_in_rule__Highway__Group_6_3__13597);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1807:1: rule__Highway__Group_6_3__1__Impl : ( ( rule__Highway__InitSemaphoreAssignment_6_3_1 ) ) ;
    public final void rule__Highway__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1811:1: ( ( ( rule__Highway__InitSemaphoreAssignment_6_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1812:1: ( ( rule__Highway__InitSemaphoreAssignment_6_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1812:1: ( ( rule__Highway__InitSemaphoreAssignment_6_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1813:1: ( rule__Highway__InitSemaphoreAssignment_6_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreAssignment_6_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1814:1: ( rule__Highway__InitSemaphoreAssignment_6_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1814:2: rule__Highway__InitSemaphoreAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSemaphoreAssignment_6_3_1_in_rule__Highway__Group_6_3__1__Impl3624);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1828:1: rule__Highway__Group_7__0 : rule__Highway__Group_7__0__Impl rule__Highway__Group_7__1 ;
    public final void rule__Highway__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1832:1: ( rule__Highway__Group_7__0__Impl rule__Highway__Group_7__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1833:2: rule__Highway__Group_7__0__Impl rule__Highway__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__0__Impl_in_rule__Highway__Group_7__03658);
            rule__Highway__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__1_in_rule__Highway__Group_7__03661);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1840:1: rule__Highway__Group_7__0__Impl : ( 'Signal' ) ;
    public final void rule__Highway__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1844:1: ( ( 'Signal' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1845:1: ( 'Signal' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1845:1: ( 'Signal' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1846:1: 'Signal'
            {
             before(grammarAccess.getHighwayAccess().getSignalKeyword_7_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Highway__Group_7__0__Impl3689); 
             after(grammarAccess.getHighwayAccess().getSignalKeyword_7_0()); 

            }


            }

        }
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1859:1: rule__Highway__Group_7__1 : rule__Highway__Group_7__1__Impl rule__Highway__Group_7__2 ;
    public final void rule__Highway__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1863:1: ( rule__Highway__Group_7__1__Impl rule__Highway__Group_7__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1864:2: rule__Highway__Group_7__1__Impl rule__Highway__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__1__Impl_in_rule__Highway__Group_7__13720);
            rule__Highway__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__2_in_rule__Highway__Group_7__13723);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1871:1: rule__Highway__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Highway__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1875:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1876:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1876:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1877:1: '{'
            {
             before(grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Highway__Group_7__1__Impl3751); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1890:1: rule__Highway__Group_7__2 : rule__Highway__Group_7__2__Impl rule__Highway__Group_7__3 ;
    public final void rule__Highway__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1894:1: ( rule__Highway__Group_7__2__Impl rule__Highway__Group_7__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1895:2: rule__Highway__Group_7__2__Impl rule__Highway__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__2__Impl_in_rule__Highway__Group_7__23782);
            rule__Highway__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__3_in_rule__Highway__Group_7__23785);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1902:1: rule__Highway__Group_7__2__Impl : ( ( rule__Highway__InitSignalAssignment_7_2 ) ) ;
    public final void rule__Highway__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1906:1: ( ( ( rule__Highway__InitSignalAssignment_7_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1907:1: ( ( rule__Highway__InitSignalAssignment_7_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1907:1: ( ( rule__Highway__InitSignalAssignment_7_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1908:1: ( rule__Highway__InitSignalAssignment_7_2 )
            {
             before(grammarAccess.getHighwayAccess().getInitSignalAssignment_7_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1909:1: ( rule__Highway__InitSignalAssignment_7_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1909:2: rule__Highway__InitSignalAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSignalAssignment_7_2_in_rule__Highway__Group_7__2__Impl3812);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1919:1: rule__Highway__Group_7__3 : rule__Highway__Group_7__3__Impl rule__Highway__Group_7__4 ;
    public final void rule__Highway__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1923:1: ( rule__Highway__Group_7__3__Impl rule__Highway__Group_7__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1924:2: rule__Highway__Group_7__3__Impl rule__Highway__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__3__Impl_in_rule__Highway__Group_7__33842);
            rule__Highway__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__4_in_rule__Highway__Group_7__33845);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1931:1: rule__Highway__Group_7__3__Impl : ( ( rule__Highway__Group_7_3__0 )* ) ;
    public final void rule__Highway__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1935:1: ( ( ( rule__Highway__Group_7_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1936:1: ( ( rule__Highway__Group_7_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1936:1: ( ( rule__Highway__Group_7_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1937:1: ( rule__Highway__Group_7_3__0 )*
            {
             before(grammarAccess.getHighwayAccess().getGroup_7_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1938:1: ( rule__Highway__Group_7_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1938:2: rule__Highway__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7_3__0_in_rule__Highway__Group_7__3__Impl3872);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1948:1: rule__Highway__Group_7__4 : rule__Highway__Group_7__4__Impl ;
    public final void rule__Highway__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1952:1: ( rule__Highway__Group_7__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1953:2: rule__Highway__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7__4__Impl_in_rule__Highway__Group_7__43903);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1959:1: rule__Highway__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Highway__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1963:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1964:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1964:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1965:1: '}'
            {
             before(grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Highway__Group_7__4__Impl3931); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1988:1: rule__Highway__Group_7_3__0 : rule__Highway__Group_7_3__0__Impl rule__Highway__Group_7_3__1 ;
    public final void rule__Highway__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1992:1: ( rule__Highway__Group_7_3__0__Impl rule__Highway__Group_7_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:1993:2: rule__Highway__Group_7_3__0__Impl rule__Highway__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7_3__0__Impl_in_rule__Highway__Group_7_3__03972);
            rule__Highway__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7_3__1_in_rule__Highway__Group_7_3__03975);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2000:1: rule__Highway__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Highway__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2004:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2005:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2005:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2006:1: ','
            {
             before(grammarAccess.getHighwayAccess().getCommaKeyword_7_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Highway__Group_7_3__0__Impl4003); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2019:1: rule__Highway__Group_7_3__1 : rule__Highway__Group_7_3__1__Impl ;
    public final void rule__Highway__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2023:1: ( rule__Highway__Group_7_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2024:2: rule__Highway__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__Group_7_3__1__Impl_in_rule__Highway__Group_7_3__14034);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2030:1: rule__Highway__Group_7_3__1__Impl : ( ( rule__Highway__InitSignalAssignment_7_3_1 ) ) ;
    public final void rule__Highway__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2034:1: ( ( ( rule__Highway__InitSignalAssignment_7_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2035:1: ( ( rule__Highway__InitSignalAssignment_7_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2035:1: ( ( rule__Highway__InitSignalAssignment_7_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2036:1: ( rule__Highway__InitSignalAssignment_7_3_1 )
            {
             before(grammarAccess.getHighwayAccess().getInitSignalAssignment_7_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2037:1: ( rule__Highway__InitSignalAssignment_7_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2037:2: rule__Highway__InitSignalAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Highway__InitSignalAssignment_7_3_1_in_rule__Highway__Group_7_3__1__Impl4061);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2051:1: rule__Node_Impl__Group__0 : rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1 ;
    public final void rule__Node_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2055:1: ( rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2056:2: rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__0__Impl_in_rule__Node_Impl__Group__04095);
            rule__Node_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__1_in_rule__Node_Impl__Group__04098);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2063:1: rule__Node_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Node_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2067:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2068:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2068:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2069:1: ()
            {
             before(grammarAccess.getNode_ImplAccess().getNodeAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2070:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2072:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2082:1: rule__Node_Impl__Group__1 : rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2 ;
    public final void rule__Node_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2086:1: ( rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2087:2: rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__1__Impl_in_rule__Node_Impl__Group__14156);
            rule__Node_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__2_in_rule__Node_Impl__Group__14159);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2094:1: rule__Node_Impl__Group__1__Impl : ( 'Node' ) ;
    public final void rule__Node_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2098:1: ( ( 'Node' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2099:1: ( 'Node' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2099:1: ( 'Node' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2100:1: 'Node'
            {
             before(grammarAccess.getNode_ImplAccess().getNodeKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Node_Impl__Group__1__Impl4187); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2113:1: rule__Node_Impl__Group__2 : rule__Node_Impl__Group__2__Impl rule__Node_Impl__Group__3 ;
    public final void rule__Node_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2117:1: ( rule__Node_Impl__Group__2__Impl rule__Node_Impl__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2118:2: rule__Node_Impl__Group__2__Impl rule__Node_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__2__Impl_in_rule__Node_Impl__Group__24218);
            rule__Node_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__3_in_rule__Node_Impl__Group__24221);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2125:1: rule__Node_Impl__Group__2__Impl : ( ( rule__Node_Impl__NameAssignment_2 ) ) ;
    public final void rule__Node_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2129:1: ( ( ( rule__Node_Impl__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2130:1: ( ( rule__Node_Impl__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2130:1: ( ( rule__Node_Impl__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2131:1: ( rule__Node_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getNode_ImplAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2132:1: ( rule__Node_Impl__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2132:2: rule__Node_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__NameAssignment_2_in_rule__Node_Impl__Group__2__Impl4248);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2142:1: rule__Node_Impl__Group__3 : rule__Node_Impl__Group__3__Impl rule__Node_Impl__Group__4 ;
    public final void rule__Node_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2146:1: ( rule__Node_Impl__Group__3__Impl rule__Node_Impl__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2147:2: rule__Node_Impl__Group__3__Impl rule__Node_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__3__Impl_in_rule__Node_Impl__Group__34278);
            rule__Node_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__4_in_rule__Node_Impl__Group__34281);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2154:1: rule__Node_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Node_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2158:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2159:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2159:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2160:1: '{'
            {
             before(grammarAccess.getNode_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Node_Impl__Group__3__Impl4309); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2173:1: rule__Node_Impl__Group__4 : rule__Node_Impl__Group__4__Impl rule__Node_Impl__Group__5 ;
    public final void rule__Node_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2177:1: ( rule__Node_Impl__Group__4__Impl rule__Node_Impl__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2178:2: rule__Node_Impl__Group__4__Impl rule__Node_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__4__Impl_in_rule__Node_Impl__Group__44340);
            rule__Node_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__5_in_rule__Node_Impl__Group__44343);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2185:1: rule__Node_Impl__Group__4__Impl : ( 'hasStarts' ) ;
    public final void rule__Node_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2189:1: ( ( 'hasStarts' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2190:1: ( 'hasStarts' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2190:1: ( 'hasStarts' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2191:1: 'hasStarts'
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsKeyword_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Node_Impl__Group__4__Impl4371); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2204:1: rule__Node_Impl__Group__5 : rule__Node_Impl__Group__5__Impl rule__Node_Impl__Group__6 ;
    public final void rule__Node_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2208:1: ( rule__Node_Impl__Group__5__Impl rule__Node_Impl__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2209:2: rule__Node_Impl__Group__5__Impl rule__Node_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__5__Impl_in_rule__Node_Impl__Group__54402);
            rule__Node_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__6_in_rule__Node_Impl__Group__54405);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2216:1: rule__Node_Impl__Group__5__Impl : ( '(' ) ;
    public final void rule__Node_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2220:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2221:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2221:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2222:1: '('
            {
             before(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Node_Impl__Group__5__Impl4433); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2235:1: rule__Node_Impl__Group__6 : rule__Node_Impl__Group__6__Impl rule__Node_Impl__Group__7 ;
    public final void rule__Node_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2239:1: ( rule__Node_Impl__Group__6__Impl rule__Node_Impl__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2240:2: rule__Node_Impl__Group__6__Impl rule__Node_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__6__Impl_in_rule__Node_Impl__Group__64464);
            rule__Node_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__7_in_rule__Node_Impl__Group__64467);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2247:1: rule__Node_Impl__Group__6__Impl : ( ( rule__Node_Impl__HasStartsAssignment_6 ) ) ;
    public final void rule__Node_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2251:1: ( ( ( rule__Node_Impl__HasStartsAssignment_6 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2252:1: ( ( rule__Node_Impl__HasStartsAssignment_6 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2252:1: ( ( rule__Node_Impl__HasStartsAssignment_6 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2253:1: ( rule__Node_Impl__HasStartsAssignment_6 )
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsAssignment_6()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2254:1: ( rule__Node_Impl__HasStartsAssignment_6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2254:2: rule__Node_Impl__HasStartsAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__HasStartsAssignment_6_in_rule__Node_Impl__Group__6__Impl4494);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2264:1: rule__Node_Impl__Group__7 : rule__Node_Impl__Group__7__Impl rule__Node_Impl__Group__8 ;
    public final void rule__Node_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2268:1: ( rule__Node_Impl__Group__7__Impl rule__Node_Impl__Group__8 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2269:2: rule__Node_Impl__Group__7__Impl rule__Node_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__7__Impl_in_rule__Node_Impl__Group__74524);
            rule__Node_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__8_in_rule__Node_Impl__Group__74527);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2276:1: rule__Node_Impl__Group__7__Impl : ( ( rule__Node_Impl__Group_7__0 )* ) ;
    public final void rule__Node_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2280:1: ( ( ( rule__Node_Impl__Group_7__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2281:1: ( ( rule__Node_Impl__Group_7__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2281:1: ( ( rule__Node_Impl__Group_7__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2282:1: ( rule__Node_Impl__Group_7__0 )*
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_7()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2283:1: ( rule__Node_Impl__Group_7__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2283:2: rule__Node_Impl__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_7__0_in_rule__Node_Impl__Group__7__Impl4554);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2293:1: rule__Node_Impl__Group__8 : rule__Node_Impl__Group__8__Impl rule__Node_Impl__Group__9 ;
    public final void rule__Node_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2297:1: ( rule__Node_Impl__Group__8__Impl rule__Node_Impl__Group__9 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2298:2: rule__Node_Impl__Group__8__Impl rule__Node_Impl__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__8__Impl_in_rule__Node_Impl__Group__84585);
            rule__Node_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__9_in_rule__Node_Impl__Group__84588);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2305:1: rule__Node_Impl__Group__8__Impl : ( ')' ) ;
    public final void rule__Node_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2309:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2310:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2310:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2311:1: ')'
            {
             before(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_8()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Node_Impl__Group__8__Impl4616); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2324:1: rule__Node_Impl__Group__9 : rule__Node_Impl__Group__9__Impl rule__Node_Impl__Group__10 ;
    public final void rule__Node_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2328:1: ( rule__Node_Impl__Group__9__Impl rule__Node_Impl__Group__10 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2329:2: rule__Node_Impl__Group__9__Impl rule__Node_Impl__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__9__Impl_in_rule__Node_Impl__Group__94647);
            rule__Node_Impl__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__10_in_rule__Node_Impl__Group__94650);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2336:1: rule__Node_Impl__Group__9__Impl : ( 'hasEnds' ) ;
    public final void rule__Node_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2340:1: ( ( 'hasEnds' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2341:1: ( 'hasEnds' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2341:1: ( 'hasEnds' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2342:1: 'hasEnds'
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsKeyword_9()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Node_Impl__Group__9__Impl4678); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2355:1: rule__Node_Impl__Group__10 : rule__Node_Impl__Group__10__Impl rule__Node_Impl__Group__11 ;
    public final void rule__Node_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2359:1: ( rule__Node_Impl__Group__10__Impl rule__Node_Impl__Group__11 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2360:2: rule__Node_Impl__Group__10__Impl rule__Node_Impl__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__10__Impl_in_rule__Node_Impl__Group__104709);
            rule__Node_Impl__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__11_in_rule__Node_Impl__Group__104712);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2367:1: rule__Node_Impl__Group__10__Impl : ( '(' ) ;
    public final void rule__Node_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2371:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2372:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2372:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2373:1: '('
            {
             before(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_10()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Node_Impl__Group__10__Impl4740); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2386:1: rule__Node_Impl__Group__11 : rule__Node_Impl__Group__11__Impl rule__Node_Impl__Group__12 ;
    public final void rule__Node_Impl__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2390:1: ( rule__Node_Impl__Group__11__Impl rule__Node_Impl__Group__12 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2391:2: rule__Node_Impl__Group__11__Impl rule__Node_Impl__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__11__Impl_in_rule__Node_Impl__Group__114771);
            rule__Node_Impl__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__12_in_rule__Node_Impl__Group__114774);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2398:1: rule__Node_Impl__Group__11__Impl : ( ( rule__Node_Impl__HasEndsAssignment_11 ) ) ;
    public final void rule__Node_Impl__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2402:1: ( ( ( rule__Node_Impl__HasEndsAssignment_11 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2403:1: ( ( rule__Node_Impl__HasEndsAssignment_11 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2403:1: ( ( rule__Node_Impl__HasEndsAssignment_11 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2404:1: ( rule__Node_Impl__HasEndsAssignment_11 )
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsAssignment_11()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2405:1: ( rule__Node_Impl__HasEndsAssignment_11 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2405:2: rule__Node_Impl__HasEndsAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__HasEndsAssignment_11_in_rule__Node_Impl__Group__11__Impl4801);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2415:1: rule__Node_Impl__Group__12 : rule__Node_Impl__Group__12__Impl rule__Node_Impl__Group__13 ;
    public final void rule__Node_Impl__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2419:1: ( rule__Node_Impl__Group__12__Impl rule__Node_Impl__Group__13 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2420:2: rule__Node_Impl__Group__12__Impl rule__Node_Impl__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__12__Impl_in_rule__Node_Impl__Group__124831);
            rule__Node_Impl__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__13_in_rule__Node_Impl__Group__124834);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2427:1: rule__Node_Impl__Group__12__Impl : ( ( rule__Node_Impl__Group_12__0 )* ) ;
    public final void rule__Node_Impl__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2431:1: ( ( ( rule__Node_Impl__Group_12__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2432:1: ( ( rule__Node_Impl__Group_12__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2432:1: ( ( rule__Node_Impl__Group_12__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2433:1: ( rule__Node_Impl__Group_12__0 )*
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_12()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2434:1: ( rule__Node_Impl__Group_12__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2434:2: rule__Node_Impl__Group_12__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_12__0_in_rule__Node_Impl__Group__12__Impl4861);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2444:1: rule__Node_Impl__Group__13 : rule__Node_Impl__Group__13__Impl rule__Node_Impl__Group__14 ;
    public final void rule__Node_Impl__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2448:1: ( rule__Node_Impl__Group__13__Impl rule__Node_Impl__Group__14 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2449:2: rule__Node_Impl__Group__13__Impl rule__Node_Impl__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__13__Impl_in_rule__Node_Impl__Group__134892);
            rule__Node_Impl__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__14_in_rule__Node_Impl__Group__134895);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2456:1: rule__Node_Impl__Group__13__Impl : ( ')' ) ;
    public final void rule__Node_Impl__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2460:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2461:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2461:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2462:1: ')'
            {
             before(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_13()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Node_Impl__Group__13__Impl4923); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2475:1: rule__Node_Impl__Group__14 : rule__Node_Impl__Group__14__Impl rule__Node_Impl__Group__15 ;
    public final void rule__Node_Impl__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2479:1: ( rule__Node_Impl__Group__14__Impl rule__Node_Impl__Group__15 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2480:2: rule__Node_Impl__Group__14__Impl rule__Node_Impl__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__14__Impl_in_rule__Node_Impl__Group__144954);
            rule__Node_Impl__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__15_in_rule__Node_Impl__Group__144957);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2487:1: rule__Node_Impl__Group__14__Impl : ( ( rule__Node_Impl__Group_14__0 )? ) ;
    public final void rule__Node_Impl__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2491:1: ( ( ( rule__Node_Impl__Group_14__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2492:1: ( ( rule__Node_Impl__Group_14__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2492:1: ( ( rule__Node_Impl__Group_14__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2493:1: ( rule__Node_Impl__Group_14__0 )?
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_14()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2494:1: ( rule__Node_Impl__Group_14__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2494:2: rule__Node_Impl__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__0_in_rule__Node_Impl__Group__14__Impl4984);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2504:1: rule__Node_Impl__Group__15 : rule__Node_Impl__Group__15__Impl rule__Node_Impl__Group__16 ;
    public final void rule__Node_Impl__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2508:1: ( rule__Node_Impl__Group__15__Impl rule__Node_Impl__Group__16 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2509:2: rule__Node_Impl__Group__15__Impl rule__Node_Impl__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__15__Impl_in_rule__Node_Impl__Group__155015);
            rule__Node_Impl__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__16_in_rule__Node_Impl__Group__155018);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2516:1: rule__Node_Impl__Group__15__Impl : ( ( rule__Node_Impl__Group_15__0 )? ) ;
    public final void rule__Node_Impl__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2520:1: ( ( ( rule__Node_Impl__Group_15__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2521:1: ( ( rule__Node_Impl__Group_15__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2521:1: ( ( rule__Node_Impl__Group_15__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2522:1: ( rule__Node_Impl__Group_15__0 )?
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_15()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2523:1: ( rule__Node_Impl__Group_15__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2523:2: rule__Node_Impl__Group_15__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__0_in_rule__Node_Impl__Group__15__Impl5045);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2533:1: rule__Node_Impl__Group__16 : rule__Node_Impl__Group__16__Impl ;
    public final void rule__Node_Impl__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2537:1: ( rule__Node_Impl__Group__16__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2538:2: rule__Node_Impl__Group__16__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group__16__Impl_in_rule__Node_Impl__Group__165076);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2544:1: rule__Node_Impl__Group__16__Impl : ( '}' ) ;
    public final void rule__Node_Impl__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2548:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2549:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2549:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2550:1: '}'
            {
             before(grammarAccess.getNode_ImplAccess().getRightCurlyBracketKeyword_16()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Node_Impl__Group__16__Impl5104); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2597:1: rule__Node_Impl__Group_7__0 : rule__Node_Impl__Group_7__0__Impl rule__Node_Impl__Group_7__1 ;
    public final void rule__Node_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2601:1: ( rule__Node_Impl__Group_7__0__Impl rule__Node_Impl__Group_7__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2602:2: rule__Node_Impl__Group_7__0__Impl rule__Node_Impl__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_7__0__Impl_in_rule__Node_Impl__Group_7__05169);
            rule__Node_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_7__1_in_rule__Node_Impl__Group_7__05172);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2609:1: rule__Node_Impl__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Node_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2613:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2614:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2614:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2615:1: ','
            {
             before(grammarAccess.getNode_ImplAccess().getCommaKeyword_7_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Node_Impl__Group_7__0__Impl5200); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2628:1: rule__Node_Impl__Group_7__1 : rule__Node_Impl__Group_7__1__Impl ;
    public final void rule__Node_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2632:1: ( rule__Node_Impl__Group_7__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2633:2: rule__Node_Impl__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_7__1__Impl_in_rule__Node_Impl__Group_7__15231);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2639:1: rule__Node_Impl__Group_7__1__Impl : ( ( rule__Node_Impl__HasStartsAssignment_7_1 ) ) ;
    public final void rule__Node_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2643:1: ( ( ( rule__Node_Impl__HasStartsAssignment_7_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2644:1: ( ( rule__Node_Impl__HasStartsAssignment_7_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2644:1: ( ( rule__Node_Impl__HasStartsAssignment_7_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2645:1: ( rule__Node_Impl__HasStartsAssignment_7_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsAssignment_7_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2646:1: ( rule__Node_Impl__HasStartsAssignment_7_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2646:2: rule__Node_Impl__HasStartsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__HasStartsAssignment_7_1_in_rule__Node_Impl__Group_7__1__Impl5258);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2660:1: rule__Node_Impl__Group_12__0 : rule__Node_Impl__Group_12__0__Impl rule__Node_Impl__Group_12__1 ;
    public final void rule__Node_Impl__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2664:1: ( rule__Node_Impl__Group_12__0__Impl rule__Node_Impl__Group_12__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2665:2: rule__Node_Impl__Group_12__0__Impl rule__Node_Impl__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_12__0__Impl_in_rule__Node_Impl__Group_12__05292);
            rule__Node_Impl__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_12__1_in_rule__Node_Impl__Group_12__05295);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2672:1: rule__Node_Impl__Group_12__0__Impl : ( ',' ) ;
    public final void rule__Node_Impl__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2676:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2677:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2677:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2678:1: ','
            {
             before(grammarAccess.getNode_ImplAccess().getCommaKeyword_12_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Node_Impl__Group_12__0__Impl5323); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2691:1: rule__Node_Impl__Group_12__1 : rule__Node_Impl__Group_12__1__Impl ;
    public final void rule__Node_Impl__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2695:1: ( rule__Node_Impl__Group_12__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2696:2: rule__Node_Impl__Group_12__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_12__1__Impl_in_rule__Node_Impl__Group_12__15354);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2702:1: rule__Node_Impl__Group_12__1__Impl : ( ( rule__Node_Impl__HasEndsAssignment_12_1 ) ) ;
    public final void rule__Node_Impl__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2706:1: ( ( ( rule__Node_Impl__HasEndsAssignment_12_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2707:1: ( ( rule__Node_Impl__HasEndsAssignment_12_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2707:1: ( ( rule__Node_Impl__HasEndsAssignment_12_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2708:1: ( rule__Node_Impl__HasEndsAssignment_12_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsAssignment_12_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2709:1: ( rule__Node_Impl__HasEndsAssignment_12_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2709:2: rule__Node_Impl__HasEndsAssignment_12_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__HasEndsAssignment_12_1_in_rule__Node_Impl__Group_12__1__Impl5381);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2723:1: rule__Node_Impl__Group_14__0 : rule__Node_Impl__Group_14__0__Impl rule__Node_Impl__Group_14__1 ;
    public final void rule__Node_Impl__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2727:1: ( rule__Node_Impl__Group_14__0__Impl rule__Node_Impl__Group_14__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2728:2: rule__Node_Impl__Group_14__0__Impl rule__Node_Impl__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__0__Impl_in_rule__Node_Impl__Group_14__05415);
            rule__Node_Impl__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__1_in_rule__Node_Impl__Group_14__05418);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2735:1: rule__Node_Impl__Group_14__0__Impl : ( 'semaphore' ) ;
    public final void rule__Node_Impl__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2739:1: ( ( 'semaphore' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2740:1: ( 'semaphore' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2740:1: ( 'semaphore' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2741:1: 'semaphore'
            {
             before(grammarAccess.getNode_ImplAccess().getSemaphoreKeyword_14_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Node_Impl__Group_14__0__Impl5446); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2754:1: rule__Node_Impl__Group_14__1 : rule__Node_Impl__Group_14__1__Impl ;
    public final void rule__Node_Impl__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2758:1: ( rule__Node_Impl__Group_14__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2759:2: rule__Node_Impl__Group_14__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_14__1__Impl_in_rule__Node_Impl__Group_14__15477);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2765:1: rule__Node_Impl__Group_14__1__Impl : ( ( rule__Node_Impl__SemaphoreAssignment_14_1 ) ) ;
    public final void rule__Node_Impl__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2769:1: ( ( ( rule__Node_Impl__SemaphoreAssignment_14_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2770:1: ( ( rule__Node_Impl__SemaphoreAssignment_14_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2770:1: ( ( rule__Node_Impl__SemaphoreAssignment_14_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2771:1: ( rule__Node_Impl__SemaphoreAssignment_14_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getSemaphoreAssignment_14_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2772:1: ( rule__Node_Impl__SemaphoreAssignment_14_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2772:2: rule__Node_Impl__SemaphoreAssignment_14_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__SemaphoreAssignment_14_1_in_rule__Node_Impl__Group_14__1__Impl5504);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2786:1: rule__Node_Impl__Group_15__0 : rule__Node_Impl__Group_15__0__Impl rule__Node_Impl__Group_15__1 ;
    public final void rule__Node_Impl__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2790:1: ( rule__Node_Impl__Group_15__0__Impl rule__Node_Impl__Group_15__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2791:2: rule__Node_Impl__Group_15__0__Impl rule__Node_Impl__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__0__Impl_in_rule__Node_Impl__Group_15__05538);
            rule__Node_Impl__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__1_in_rule__Node_Impl__Group_15__05541);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2798:1: rule__Node_Impl__Group_15__0__Impl : ( 'signals' ) ;
    public final void rule__Node_Impl__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2802:1: ( ( 'signals' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2803:1: ( 'signals' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2803:1: ( 'signals' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2804:1: 'signals'
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsKeyword_15_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Node_Impl__Group_15__0__Impl5569); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2817:1: rule__Node_Impl__Group_15__1 : rule__Node_Impl__Group_15__1__Impl rule__Node_Impl__Group_15__2 ;
    public final void rule__Node_Impl__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2821:1: ( rule__Node_Impl__Group_15__1__Impl rule__Node_Impl__Group_15__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2822:2: rule__Node_Impl__Group_15__1__Impl rule__Node_Impl__Group_15__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__1__Impl_in_rule__Node_Impl__Group_15__15600);
            rule__Node_Impl__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__2_in_rule__Node_Impl__Group_15__15603);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2829:1: rule__Node_Impl__Group_15__1__Impl : ( '(' ) ;
    public final void rule__Node_Impl__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2833:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2834:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2834:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2835:1: '('
            {
             before(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_15_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Node_Impl__Group_15__1__Impl5631); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2848:1: rule__Node_Impl__Group_15__2 : rule__Node_Impl__Group_15__2__Impl rule__Node_Impl__Group_15__3 ;
    public final void rule__Node_Impl__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2852:1: ( rule__Node_Impl__Group_15__2__Impl rule__Node_Impl__Group_15__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2853:2: rule__Node_Impl__Group_15__2__Impl rule__Node_Impl__Group_15__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__2__Impl_in_rule__Node_Impl__Group_15__25662);
            rule__Node_Impl__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__3_in_rule__Node_Impl__Group_15__25665);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2860:1: rule__Node_Impl__Group_15__2__Impl : ( ( rule__Node_Impl__SignalsAssignment_15_2 ) ) ;
    public final void rule__Node_Impl__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2864:1: ( ( ( rule__Node_Impl__SignalsAssignment_15_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2865:1: ( ( rule__Node_Impl__SignalsAssignment_15_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2865:1: ( ( rule__Node_Impl__SignalsAssignment_15_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2866:1: ( rule__Node_Impl__SignalsAssignment_15_2 )
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsAssignment_15_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2867:1: ( rule__Node_Impl__SignalsAssignment_15_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2867:2: rule__Node_Impl__SignalsAssignment_15_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__SignalsAssignment_15_2_in_rule__Node_Impl__Group_15__2__Impl5692);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2877:1: rule__Node_Impl__Group_15__3 : rule__Node_Impl__Group_15__3__Impl rule__Node_Impl__Group_15__4 ;
    public final void rule__Node_Impl__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2881:1: ( rule__Node_Impl__Group_15__3__Impl rule__Node_Impl__Group_15__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2882:2: rule__Node_Impl__Group_15__3__Impl rule__Node_Impl__Group_15__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__3__Impl_in_rule__Node_Impl__Group_15__35722);
            rule__Node_Impl__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__4_in_rule__Node_Impl__Group_15__35725);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2889:1: rule__Node_Impl__Group_15__3__Impl : ( ( rule__Node_Impl__Group_15_3__0 )* ) ;
    public final void rule__Node_Impl__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2893:1: ( ( ( rule__Node_Impl__Group_15_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2894:1: ( ( rule__Node_Impl__Group_15_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2894:1: ( ( rule__Node_Impl__Group_15_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2895:1: ( rule__Node_Impl__Group_15_3__0 )*
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_15_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2896:1: ( rule__Node_Impl__Group_15_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2896:2: rule__Node_Impl__Group_15_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15_3__0_in_rule__Node_Impl__Group_15__3__Impl5752);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2906:1: rule__Node_Impl__Group_15__4 : rule__Node_Impl__Group_15__4__Impl ;
    public final void rule__Node_Impl__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2910:1: ( rule__Node_Impl__Group_15__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2911:2: rule__Node_Impl__Group_15__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15__4__Impl_in_rule__Node_Impl__Group_15__45783);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2917:1: rule__Node_Impl__Group_15__4__Impl : ( ')' ) ;
    public final void rule__Node_Impl__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2921:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2922:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2922:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2923:1: ')'
            {
             before(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_15_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Node_Impl__Group_15__4__Impl5811); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2946:1: rule__Node_Impl__Group_15_3__0 : rule__Node_Impl__Group_15_3__0__Impl rule__Node_Impl__Group_15_3__1 ;
    public final void rule__Node_Impl__Group_15_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2950:1: ( rule__Node_Impl__Group_15_3__0__Impl rule__Node_Impl__Group_15_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2951:2: rule__Node_Impl__Group_15_3__0__Impl rule__Node_Impl__Group_15_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15_3__0__Impl_in_rule__Node_Impl__Group_15_3__05852);
            rule__Node_Impl__Group_15_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15_3__1_in_rule__Node_Impl__Group_15_3__05855);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2958:1: rule__Node_Impl__Group_15_3__0__Impl : ( ',' ) ;
    public final void rule__Node_Impl__Group_15_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2962:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2963:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2963:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2964:1: ','
            {
             before(grammarAccess.getNode_ImplAccess().getCommaKeyword_15_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Node_Impl__Group_15_3__0__Impl5883); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2977:1: rule__Node_Impl__Group_15_3__1 : rule__Node_Impl__Group_15_3__1__Impl ;
    public final void rule__Node_Impl__Group_15_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2981:1: ( rule__Node_Impl__Group_15_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2982:2: rule__Node_Impl__Group_15_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__Group_15_3__1__Impl_in_rule__Node_Impl__Group_15_3__15914);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2988:1: rule__Node_Impl__Group_15_3__1__Impl : ( ( rule__Node_Impl__SignalsAssignment_15_3_1 ) ) ;
    public final void rule__Node_Impl__Group_15_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2992:1: ( ( ( rule__Node_Impl__SignalsAssignment_15_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2993:1: ( ( rule__Node_Impl__SignalsAssignment_15_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2993:1: ( ( rule__Node_Impl__SignalsAssignment_15_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2994:1: ( rule__Node_Impl__SignalsAssignment_15_3_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsAssignment_15_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2995:1: ( rule__Node_Impl__SignalsAssignment_15_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:2995:2: rule__Node_Impl__SignalsAssignment_15_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node_Impl__SignalsAssignment_15_3_1_in_rule__Node_Impl__Group_15_3__1__Impl5941);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3009:1: rule__Car__Group__0 : rule__Car__Group__0__Impl rule__Car__Group__1 ;
    public final void rule__Car__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3013:1: ( rule__Car__Group__0__Impl rule__Car__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3014:2: rule__Car__Group__0__Impl rule__Car__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__0__Impl_in_rule__Car__Group__05975);
            rule__Car__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__1_in_rule__Car__Group__05978);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3021:1: rule__Car__Group__0__Impl : ( () ) ;
    public final void rule__Car__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3025:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3026:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3026:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3027:1: ()
            {
             before(grammarAccess.getCarAccess().getCarAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3028:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3030:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3040:1: rule__Car__Group__1 : rule__Car__Group__1__Impl rule__Car__Group__2 ;
    public final void rule__Car__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3044:1: ( rule__Car__Group__1__Impl rule__Car__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3045:2: rule__Car__Group__1__Impl rule__Car__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__1__Impl_in_rule__Car__Group__16036);
            rule__Car__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__2_in_rule__Car__Group__16039);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3052:1: rule__Car__Group__1__Impl : ( 'Car' ) ;
    public final void rule__Car__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3056:1: ( ( 'Car' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3057:1: ( 'Car' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3057:1: ( 'Car' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3058:1: 'Car'
            {
             before(grammarAccess.getCarAccess().getCarKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Car__Group__1__Impl6067); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3071:1: rule__Car__Group__2 : rule__Car__Group__2__Impl rule__Car__Group__3 ;
    public final void rule__Car__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3075:1: ( rule__Car__Group__2__Impl rule__Car__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3076:2: rule__Car__Group__2__Impl rule__Car__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__2__Impl_in_rule__Car__Group__26098);
            rule__Car__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__3_in_rule__Car__Group__26101);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3083:1: rule__Car__Group__2__Impl : ( '{' ) ;
    public final void rule__Car__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3087:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3088:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3088:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3089:1: '{'
            {
             before(grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Car__Group__2__Impl6129); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3102:1: rule__Car__Group__3 : rule__Car__Group__3__Impl rule__Car__Group__4 ;
    public final void rule__Car__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3106:1: ( rule__Car__Group__3__Impl rule__Car__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3107:2: rule__Car__Group__3__Impl rule__Car__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__3__Impl_in_rule__Car__Group__36160);
            rule__Car__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__4_in_rule__Car__Group__36163);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3114:1: rule__Car__Group__3__Impl : ( ( rule__Car__Group_3__0 )? ) ;
    public final void rule__Car__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3118:1: ( ( ( rule__Car__Group_3__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3119:1: ( ( rule__Car__Group_3__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3119:1: ( ( rule__Car__Group_3__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3120:1: ( rule__Car__Group_3__0 )?
            {
             before(grammarAccess.getCarAccess().getGroup_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3121:1: ( rule__Car__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3121:2: rule__Car__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Car__Group_3__0_in_rule__Car__Group__3__Impl6190);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3131:1: rule__Car__Group__4 : rule__Car__Group__4__Impl rule__Car__Group__5 ;
    public final void rule__Car__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3135:1: ( rule__Car__Group__4__Impl rule__Car__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3136:2: rule__Car__Group__4__Impl rule__Car__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__4__Impl_in_rule__Car__Group__46221);
            rule__Car__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__5_in_rule__Car__Group__46224);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3143:1: rule__Car__Group__4__Impl : ( ( rule__Car__Group_4__0 )? ) ;
    public final void rule__Car__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3147:1: ( ( ( rule__Car__Group_4__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3148:1: ( ( rule__Car__Group_4__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3148:1: ( ( rule__Car__Group_4__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3149:1: ( rule__Car__Group_4__0 )?
            {
             before(grammarAccess.getCarAccess().getGroup_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3150:1: ( rule__Car__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3150:2: rule__Car__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Car__Group_4__0_in_rule__Car__Group__4__Impl6251);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3160:1: rule__Car__Group__5 : rule__Car__Group__5__Impl rule__Car__Group__6 ;
    public final void rule__Car__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3164:1: ( rule__Car__Group__5__Impl rule__Car__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3165:2: rule__Car__Group__5__Impl rule__Car__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__5__Impl_in_rule__Car__Group__56282);
            rule__Car__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__6_in_rule__Car__Group__56285);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3172:1: rule__Car__Group__5__Impl : ( ( rule__Car__Group_5__0 )? ) ;
    public final void rule__Car__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3176:1: ( ( ( rule__Car__Group_5__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3177:1: ( ( rule__Car__Group_5__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3177:1: ( ( rule__Car__Group_5__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3178:1: ( rule__Car__Group_5__0 )?
            {
             before(grammarAccess.getCarAccess().getGroup_5()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3179:1: ( rule__Car__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3179:2: rule__Car__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Car__Group_5__0_in_rule__Car__Group__5__Impl6312);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3189:1: rule__Car__Group__6 : rule__Car__Group__6__Impl ;
    public final void rule__Car__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3193:1: ( rule__Car__Group__6__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3194:2: rule__Car__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group__6__Impl_in_rule__Car__Group__66343);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3200:1: rule__Car__Group__6__Impl : ( '}' ) ;
    public final void rule__Car__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3204:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3205:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3205:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3206:1: '}'
            {
             before(grammarAccess.getCarAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Car__Group__6__Impl6371); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3233:1: rule__Car__Group_3__0 : rule__Car__Group_3__0__Impl rule__Car__Group_3__1 ;
    public final void rule__Car__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3237:1: ( rule__Car__Group_3__0__Impl rule__Car__Group_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3238:2: rule__Car__Group_3__0__Impl rule__Car__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_3__0__Impl_in_rule__Car__Group_3__06416);
            rule__Car__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_3__1_in_rule__Car__Group_3__06419);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3245:1: rule__Car__Group_3__0__Impl : ( 'timeIn' ) ;
    public final void rule__Car__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3249:1: ( ( 'timeIn' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3250:1: ( 'timeIn' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3250:1: ( 'timeIn' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3251:1: 'timeIn'
            {
             before(grammarAccess.getCarAccess().getTimeInKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Car__Group_3__0__Impl6447); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3264:1: rule__Car__Group_3__1 : rule__Car__Group_3__1__Impl ;
    public final void rule__Car__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3268:1: ( rule__Car__Group_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3269:2: rule__Car__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_3__1__Impl_in_rule__Car__Group_3__16478);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3275:1: rule__Car__Group_3__1__Impl : ( ( rule__Car__TimeInAssignment_3_1 ) ) ;
    public final void rule__Car__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3279:1: ( ( ( rule__Car__TimeInAssignment_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3280:1: ( ( rule__Car__TimeInAssignment_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3280:1: ( ( rule__Car__TimeInAssignment_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3281:1: ( rule__Car__TimeInAssignment_3_1 )
            {
             before(grammarAccess.getCarAccess().getTimeInAssignment_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3282:1: ( rule__Car__TimeInAssignment_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3282:2: rule__Car__TimeInAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__TimeInAssignment_3_1_in_rule__Car__Group_3__1__Impl6505);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3296:1: rule__Car__Group_4__0 : rule__Car__Group_4__0__Impl rule__Car__Group_4__1 ;
    public final void rule__Car__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3300:1: ( rule__Car__Group_4__0__Impl rule__Car__Group_4__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3301:2: rule__Car__Group_4__0__Impl rule__Car__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_4__0__Impl_in_rule__Car__Group_4__06539);
            rule__Car__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_4__1_in_rule__Car__Group_4__06542);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3308:1: rule__Car__Group_4__0__Impl : ( 'timeOut' ) ;
    public final void rule__Car__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3312:1: ( ( 'timeOut' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3313:1: ( 'timeOut' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3313:1: ( 'timeOut' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3314:1: 'timeOut'
            {
             before(grammarAccess.getCarAccess().getTimeOutKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Car__Group_4__0__Impl6570); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3327:1: rule__Car__Group_4__1 : rule__Car__Group_4__1__Impl ;
    public final void rule__Car__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3331:1: ( rule__Car__Group_4__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3332:2: rule__Car__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_4__1__Impl_in_rule__Car__Group_4__16601);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3338:1: rule__Car__Group_4__1__Impl : ( ( rule__Car__TimeOutAssignment_4_1 ) ) ;
    public final void rule__Car__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3342:1: ( ( ( rule__Car__TimeOutAssignment_4_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3343:1: ( ( rule__Car__TimeOutAssignment_4_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3343:1: ( ( rule__Car__TimeOutAssignment_4_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3344:1: ( rule__Car__TimeOutAssignment_4_1 )
            {
             before(grammarAccess.getCarAccess().getTimeOutAssignment_4_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3345:1: ( rule__Car__TimeOutAssignment_4_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3345:2: rule__Car__TimeOutAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__TimeOutAssignment_4_1_in_rule__Car__Group_4__1__Impl6628);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3359:1: rule__Car__Group_5__0 : rule__Car__Group_5__0__Impl rule__Car__Group_5__1 ;
    public final void rule__Car__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3363:1: ( rule__Car__Group_5__0__Impl rule__Car__Group_5__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3364:2: rule__Car__Group_5__0__Impl rule__Car__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_5__0__Impl_in_rule__Car__Group_5__06662);
            rule__Car__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_5__1_in_rule__Car__Group_5__06665);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3371:1: rule__Car__Group_5__0__Impl : ( 'isInSegment' ) ;
    public final void rule__Car__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3375:1: ( ( 'isInSegment' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3376:1: ( 'isInSegment' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3376:1: ( 'isInSegment' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3377:1: 'isInSegment'
            {
             before(grammarAccess.getCarAccess().getIsInSegmentKeyword_5_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Car__Group_5__0__Impl6693); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3390:1: rule__Car__Group_5__1 : rule__Car__Group_5__1__Impl ;
    public final void rule__Car__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3394:1: ( rule__Car__Group_5__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3395:2: rule__Car__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__Group_5__1__Impl_in_rule__Car__Group_5__16724);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3401:1: rule__Car__Group_5__1__Impl : ( ( rule__Car__IsInSegmentAssignment_5_1 ) ) ;
    public final void rule__Car__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3405:1: ( ( ( rule__Car__IsInSegmentAssignment_5_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3406:1: ( ( rule__Car__IsInSegmentAssignment_5_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3406:1: ( ( rule__Car__IsInSegmentAssignment_5_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3407:1: ( rule__Car__IsInSegmentAssignment_5_1 )
            {
             before(grammarAccess.getCarAccess().getIsInSegmentAssignment_5_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3408:1: ( rule__Car__IsInSegmentAssignment_5_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3408:2: rule__Car__IsInSegmentAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Car__IsInSegmentAssignment_5_1_in_rule__Car__Group_5__1__Impl6751);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3422:1: rule__Segment__Group__0 : rule__Segment__Group__0__Impl rule__Segment__Group__1 ;
    public final void rule__Segment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3426:1: ( rule__Segment__Group__0__Impl rule__Segment__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3427:2: rule__Segment__Group__0__Impl rule__Segment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__0__Impl_in_rule__Segment__Group__06785);
            rule__Segment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__1_in_rule__Segment__Group__06788);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3434:1: rule__Segment__Group__0__Impl : ( () ) ;
    public final void rule__Segment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3438:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3439:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3439:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3440:1: ()
            {
             before(grammarAccess.getSegmentAccess().getSegmentAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3441:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3443:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3453:1: rule__Segment__Group__1 : rule__Segment__Group__1__Impl rule__Segment__Group__2 ;
    public final void rule__Segment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3457:1: ( rule__Segment__Group__1__Impl rule__Segment__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3458:2: rule__Segment__Group__1__Impl rule__Segment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__1__Impl_in_rule__Segment__Group__16846);
            rule__Segment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__2_in_rule__Segment__Group__16849);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3465:1: rule__Segment__Group__1__Impl : ( 'Segment' ) ;
    public final void rule__Segment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3469:1: ( ( 'Segment' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3470:1: ( 'Segment' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3470:1: ( 'Segment' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3471:1: 'Segment'
            {
             before(grammarAccess.getSegmentAccess().getSegmentKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Segment__Group__1__Impl6877); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3484:1: rule__Segment__Group__2 : rule__Segment__Group__2__Impl rule__Segment__Group__3 ;
    public final void rule__Segment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3488:1: ( rule__Segment__Group__2__Impl rule__Segment__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3489:2: rule__Segment__Group__2__Impl rule__Segment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__2__Impl_in_rule__Segment__Group__26908);
            rule__Segment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__3_in_rule__Segment__Group__26911);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3496:1: rule__Segment__Group__2__Impl : ( ( rule__Segment__NameAssignment_2 ) ) ;
    public final void rule__Segment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3500:1: ( ( ( rule__Segment__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3501:1: ( ( rule__Segment__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3501:1: ( ( rule__Segment__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3502:1: ( rule__Segment__NameAssignment_2 )
            {
             before(grammarAccess.getSegmentAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3503:1: ( rule__Segment__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3503:2: rule__Segment__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__NameAssignment_2_in_rule__Segment__Group__2__Impl6938);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3513:1: rule__Segment__Group__3 : rule__Segment__Group__3__Impl rule__Segment__Group__4 ;
    public final void rule__Segment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3517:1: ( rule__Segment__Group__3__Impl rule__Segment__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3518:2: rule__Segment__Group__3__Impl rule__Segment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__3__Impl_in_rule__Segment__Group__36968);
            rule__Segment__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__4_in_rule__Segment__Group__36971);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3525:1: rule__Segment__Group__3__Impl : ( '{' ) ;
    public final void rule__Segment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3529:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3530:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3530:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3531:1: '{'
            {
             before(grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Segment__Group__3__Impl6999); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3544:1: rule__Segment__Group__4 : rule__Segment__Group__4__Impl rule__Segment__Group__5 ;
    public final void rule__Segment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3548:1: ( rule__Segment__Group__4__Impl rule__Segment__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3549:2: rule__Segment__Group__4__Impl rule__Segment__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__4__Impl_in_rule__Segment__Group__47030);
            rule__Segment__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__5_in_rule__Segment__Group__47033);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3556:1: rule__Segment__Group__4__Impl : ( ( rule__Segment__Group_4__0 )? ) ;
    public final void rule__Segment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3560:1: ( ( ( rule__Segment__Group_4__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3561:1: ( ( rule__Segment__Group_4__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3561:1: ( ( rule__Segment__Group_4__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3562:1: ( rule__Segment__Group_4__0 )?
            {
             before(grammarAccess.getSegmentAccess().getGroup_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3563:1: ( rule__Segment__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3563:2: rule__Segment__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_4__0_in_rule__Segment__Group__4__Impl7060);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3573:1: rule__Segment__Group__5 : rule__Segment__Group__5__Impl rule__Segment__Group__6 ;
    public final void rule__Segment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3577:1: ( rule__Segment__Group__5__Impl rule__Segment__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3578:2: rule__Segment__Group__5__Impl rule__Segment__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__5__Impl_in_rule__Segment__Group__57091);
            rule__Segment__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__6_in_rule__Segment__Group__57094);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3585:1: rule__Segment__Group__5__Impl : ( ( rule__Segment__Group_5__0 )? ) ;
    public final void rule__Segment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3589:1: ( ( ( rule__Segment__Group_5__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3590:1: ( ( rule__Segment__Group_5__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3590:1: ( ( rule__Segment__Group_5__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3591:1: ( rule__Segment__Group_5__0 )?
            {
             before(grammarAccess.getSegmentAccess().getGroup_5()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3592:1: ( rule__Segment__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3592:2: rule__Segment__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__0_in_rule__Segment__Group__5__Impl7121);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3602:1: rule__Segment__Group__6 : rule__Segment__Group__6__Impl rule__Segment__Group__7 ;
    public final void rule__Segment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3606:1: ( rule__Segment__Group__6__Impl rule__Segment__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3607:2: rule__Segment__Group__6__Impl rule__Segment__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__6__Impl_in_rule__Segment__Group__67152);
            rule__Segment__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__7_in_rule__Segment__Group__67155);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3614:1: rule__Segment__Group__6__Impl : ( ( rule__Segment__Group_6__0 )? ) ;
    public final void rule__Segment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3618:1: ( ( ( rule__Segment__Group_6__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3619:1: ( ( rule__Segment__Group_6__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3619:1: ( ( rule__Segment__Group_6__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3620:1: ( rule__Segment__Group_6__0 )?
            {
             before(grammarAccess.getSegmentAccess().getGroup_6()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3621:1: ( rule__Segment__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3621:2: rule__Segment__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__0_in_rule__Segment__Group__6__Impl7182);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3631:1: rule__Segment__Group__7 : rule__Segment__Group__7__Impl ;
    public final void rule__Segment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3635:1: ( rule__Segment__Group__7__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3636:2: rule__Segment__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group__7__Impl_in_rule__Segment__Group__77213);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3642:1: rule__Segment__Group__7__Impl : ( '}' ) ;
    public final void rule__Segment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3646:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3647:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3647:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3648:1: '}'
            {
             before(grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Segment__Group__7__Impl7241); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3677:1: rule__Segment__Group_4__0 : rule__Segment__Group_4__0__Impl rule__Segment__Group_4__1 ;
    public final void rule__Segment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3681:1: ( rule__Segment__Group_4__0__Impl rule__Segment__Group_4__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3682:2: rule__Segment__Group_4__0__Impl rule__Segment__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_4__0__Impl_in_rule__Segment__Group_4__07288);
            rule__Segment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_4__1_in_rule__Segment__Group_4__07291);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3689:1: rule__Segment__Group_4__0__Impl : ( 'numLanes' ) ;
    public final void rule__Segment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3693:1: ( ( 'numLanes' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3694:1: ( 'numLanes' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3694:1: ( 'numLanes' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3695:1: 'numLanes'
            {
             before(grammarAccess.getSegmentAccess().getNumLanesKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Segment__Group_4__0__Impl7319); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3708:1: rule__Segment__Group_4__1 : rule__Segment__Group_4__1__Impl ;
    public final void rule__Segment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3712:1: ( rule__Segment__Group_4__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3713:2: rule__Segment__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_4__1__Impl_in_rule__Segment__Group_4__17350);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3719:1: rule__Segment__Group_4__1__Impl : ( ( rule__Segment__NumLanesAssignment_4_1 ) ) ;
    public final void rule__Segment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3723:1: ( ( ( rule__Segment__NumLanesAssignment_4_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3724:1: ( ( rule__Segment__NumLanesAssignment_4_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3724:1: ( ( rule__Segment__NumLanesAssignment_4_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3725:1: ( rule__Segment__NumLanesAssignment_4_1 )
            {
             before(grammarAccess.getSegmentAccess().getNumLanesAssignment_4_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3726:1: ( rule__Segment__NumLanesAssignment_4_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3726:2: rule__Segment__NumLanesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__NumLanesAssignment_4_1_in_rule__Segment__Group_4__1__Impl7377);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3740:1: rule__Segment__Group_5__0 : rule__Segment__Group_5__0__Impl rule__Segment__Group_5__1 ;
    public final void rule__Segment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3744:1: ( rule__Segment__Group_5__0__Impl rule__Segment__Group_5__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3745:2: rule__Segment__Group_5__0__Impl rule__Segment__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__0__Impl_in_rule__Segment__Group_5__07411);
            rule__Segment__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__1_in_rule__Segment__Group_5__07414);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3752:1: rule__Segment__Group_5__0__Impl : ( 'length' ) ;
    public final void rule__Segment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3756:1: ( ( 'length' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3757:1: ( 'length' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3757:1: ( 'length' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3758:1: 'length'
            {
             before(grammarAccess.getSegmentAccess().getLengthKeyword_5_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Segment__Group_5__0__Impl7442); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3771:1: rule__Segment__Group_5__1 : rule__Segment__Group_5__1__Impl ;
    public final void rule__Segment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3775:1: ( rule__Segment__Group_5__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3776:2: rule__Segment__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_5__1__Impl_in_rule__Segment__Group_5__17473);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3782:1: rule__Segment__Group_5__1__Impl : ( ( rule__Segment__LengthAssignment_5_1 ) ) ;
    public final void rule__Segment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3786:1: ( ( ( rule__Segment__LengthAssignment_5_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3787:1: ( ( rule__Segment__LengthAssignment_5_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3787:1: ( ( rule__Segment__LengthAssignment_5_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3788:1: ( rule__Segment__LengthAssignment_5_1 )
            {
             before(grammarAccess.getSegmentAccess().getLengthAssignment_5_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3789:1: ( rule__Segment__LengthAssignment_5_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3789:2: rule__Segment__LengthAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__LengthAssignment_5_1_in_rule__Segment__Group_5__1__Impl7500);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3803:1: rule__Segment__Group_6__0 : rule__Segment__Group_6__0__Impl rule__Segment__Group_6__1 ;
    public final void rule__Segment__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3807:1: ( rule__Segment__Group_6__0__Impl rule__Segment__Group_6__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3808:2: rule__Segment__Group_6__0__Impl rule__Segment__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__0__Impl_in_rule__Segment__Group_6__07534);
            rule__Segment__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__1_in_rule__Segment__Group_6__07537);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3815:1: rule__Segment__Group_6__0__Impl : ( 'hasCars' ) ;
    public final void rule__Segment__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3819:1: ( ( 'hasCars' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3820:1: ( 'hasCars' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3820:1: ( 'hasCars' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3821:1: 'hasCars'
            {
             before(grammarAccess.getSegmentAccess().getHasCarsKeyword_6_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Segment__Group_6__0__Impl7565); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3834:1: rule__Segment__Group_6__1 : rule__Segment__Group_6__1__Impl rule__Segment__Group_6__2 ;
    public final void rule__Segment__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3838:1: ( rule__Segment__Group_6__1__Impl rule__Segment__Group_6__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3839:2: rule__Segment__Group_6__1__Impl rule__Segment__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__1__Impl_in_rule__Segment__Group_6__17596);
            rule__Segment__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__2_in_rule__Segment__Group_6__17599);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3846:1: rule__Segment__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Segment__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3850:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3851:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3851:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3852:1: '('
            {
             before(grammarAccess.getSegmentAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Segment__Group_6__1__Impl7627); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3865:1: rule__Segment__Group_6__2 : rule__Segment__Group_6__2__Impl rule__Segment__Group_6__3 ;
    public final void rule__Segment__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3869:1: ( rule__Segment__Group_6__2__Impl rule__Segment__Group_6__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3870:2: rule__Segment__Group_6__2__Impl rule__Segment__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__2__Impl_in_rule__Segment__Group_6__27658);
            rule__Segment__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__3_in_rule__Segment__Group_6__27661);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3877:1: rule__Segment__Group_6__2__Impl : ( ( rule__Segment__HasCarsAssignment_6_2 ) ) ;
    public final void rule__Segment__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3881:1: ( ( ( rule__Segment__HasCarsAssignment_6_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3882:1: ( ( rule__Segment__HasCarsAssignment_6_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3882:1: ( ( rule__Segment__HasCarsAssignment_6_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3883:1: ( rule__Segment__HasCarsAssignment_6_2 )
            {
             before(grammarAccess.getSegmentAccess().getHasCarsAssignment_6_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3884:1: ( rule__Segment__HasCarsAssignment_6_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3884:2: rule__Segment__HasCarsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__HasCarsAssignment_6_2_in_rule__Segment__Group_6__2__Impl7688);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3894:1: rule__Segment__Group_6__3 : rule__Segment__Group_6__3__Impl rule__Segment__Group_6__4 ;
    public final void rule__Segment__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3898:1: ( rule__Segment__Group_6__3__Impl rule__Segment__Group_6__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3899:2: rule__Segment__Group_6__3__Impl rule__Segment__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__3__Impl_in_rule__Segment__Group_6__37718);
            rule__Segment__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__4_in_rule__Segment__Group_6__37721);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3906:1: rule__Segment__Group_6__3__Impl : ( ( rule__Segment__Group_6_3__0 )* ) ;
    public final void rule__Segment__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3910:1: ( ( ( rule__Segment__Group_6_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3911:1: ( ( rule__Segment__Group_6_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3911:1: ( ( rule__Segment__Group_6_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3912:1: ( rule__Segment__Group_6_3__0 )*
            {
             before(grammarAccess.getSegmentAccess().getGroup_6_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3913:1: ( rule__Segment__Group_6_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3913:2: rule__Segment__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6_3__0_in_rule__Segment__Group_6__3__Impl7748);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3923:1: rule__Segment__Group_6__4 : rule__Segment__Group_6__4__Impl ;
    public final void rule__Segment__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3927:1: ( rule__Segment__Group_6__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3928:2: rule__Segment__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6__4__Impl_in_rule__Segment__Group_6__47779);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3934:1: rule__Segment__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Segment__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3938:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3939:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3939:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3940:1: ')'
            {
             before(grammarAccess.getSegmentAccess().getRightParenthesisKeyword_6_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Segment__Group_6__4__Impl7807); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3963:1: rule__Segment__Group_6_3__0 : rule__Segment__Group_6_3__0__Impl rule__Segment__Group_6_3__1 ;
    public final void rule__Segment__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3967:1: ( rule__Segment__Group_6_3__0__Impl rule__Segment__Group_6_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3968:2: rule__Segment__Group_6_3__0__Impl rule__Segment__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6_3__0__Impl_in_rule__Segment__Group_6_3__07848);
            rule__Segment__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6_3__1_in_rule__Segment__Group_6_3__07851);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3975:1: rule__Segment__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Segment__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3979:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3980:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3980:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3981:1: ','
            {
             before(grammarAccess.getSegmentAccess().getCommaKeyword_6_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Segment__Group_6_3__0__Impl7879); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3994:1: rule__Segment__Group_6_3__1 : rule__Segment__Group_6_3__1__Impl ;
    public final void rule__Segment__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3998:1: ( rule__Segment__Group_6_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:3999:2: rule__Segment__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__Group_6_3__1__Impl_in_rule__Segment__Group_6_3__17910);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4005:1: rule__Segment__Group_6_3__1__Impl : ( ( rule__Segment__HasCarsAssignment_6_3_1 ) ) ;
    public final void rule__Segment__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4009:1: ( ( ( rule__Segment__HasCarsAssignment_6_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4010:1: ( ( rule__Segment__HasCarsAssignment_6_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4010:1: ( ( rule__Segment__HasCarsAssignment_6_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4011:1: ( rule__Segment__HasCarsAssignment_6_3_1 )
            {
             before(grammarAccess.getSegmentAccess().getHasCarsAssignment_6_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4012:1: ( rule__Segment__HasCarsAssignment_6_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4012:2: rule__Segment__HasCarsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Segment__HasCarsAssignment_6_3_1_in_rule__Segment__Group_6_3__1__Impl7937);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4026:1: rule__Semaphore__Group__0 : rule__Semaphore__Group__0__Impl rule__Semaphore__Group__1 ;
    public final void rule__Semaphore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4030:1: ( rule__Semaphore__Group__0__Impl rule__Semaphore__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4031:2: rule__Semaphore__Group__0__Impl rule__Semaphore__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__0__Impl_in_rule__Semaphore__Group__07971);
            rule__Semaphore__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__1_in_rule__Semaphore__Group__07974);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4038:1: rule__Semaphore__Group__0__Impl : ( () ) ;
    public final void rule__Semaphore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4042:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4043:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4043:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4044:1: ()
            {
             before(grammarAccess.getSemaphoreAccess().getSemaphoreAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4045:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4047:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4057:1: rule__Semaphore__Group__1 : rule__Semaphore__Group__1__Impl rule__Semaphore__Group__2 ;
    public final void rule__Semaphore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4061:1: ( rule__Semaphore__Group__1__Impl rule__Semaphore__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4062:2: rule__Semaphore__Group__1__Impl rule__Semaphore__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__1__Impl_in_rule__Semaphore__Group__18032);
            rule__Semaphore__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__2_in_rule__Semaphore__Group__18035);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4069:1: rule__Semaphore__Group__1__Impl : ( 'Semaphore' ) ;
    public final void rule__Semaphore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4073:1: ( ( 'Semaphore' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4074:1: ( 'Semaphore' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4074:1: ( 'Semaphore' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4075:1: 'Semaphore'
            {
             before(grammarAccess.getSemaphoreAccess().getSemaphoreKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Semaphore__Group__1__Impl8063); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4088:1: rule__Semaphore__Group__2 : rule__Semaphore__Group__2__Impl rule__Semaphore__Group__3 ;
    public final void rule__Semaphore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4092:1: ( rule__Semaphore__Group__2__Impl rule__Semaphore__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4093:2: rule__Semaphore__Group__2__Impl rule__Semaphore__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__2__Impl_in_rule__Semaphore__Group__28094);
            rule__Semaphore__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__3_in_rule__Semaphore__Group__28097);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4100:1: rule__Semaphore__Group__2__Impl : ( ( rule__Semaphore__NameAssignment_2 ) ) ;
    public final void rule__Semaphore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4104:1: ( ( ( rule__Semaphore__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4105:1: ( ( rule__Semaphore__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4105:1: ( ( rule__Semaphore__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4106:1: ( rule__Semaphore__NameAssignment_2 )
            {
             before(grammarAccess.getSemaphoreAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4107:1: ( rule__Semaphore__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4107:2: rule__Semaphore__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__NameAssignment_2_in_rule__Semaphore__Group__2__Impl8124);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4117:1: rule__Semaphore__Group__3 : rule__Semaphore__Group__3__Impl rule__Semaphore__Group__4 ;
    public final void rule__Semaphore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4121:1: ( rule__Semaphore__Group__3__Impl rule__Semaphore__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4122:2: rule__Semaphore__Group__3__Impl rule__Semaphore__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__3__Impl_in_rule__Semaphore__Group__38154);
            rule__Semaphore__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__4_in_rule__Semaphore__Group__38157);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4129:1: rule__Semaphore__Group__3__Impl : ( '{' ) ;
    public final void rule__Semaphore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4133:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4134:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4134:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4135:1: '{'
            {
             before(grammarAccess.getSemaphoreAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Semaphore__Group__3__Impl8185); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4148:1: rule__Semaphore__Group__4 : rule__Semaphore__Group__4__Impl rule__Semaphore__Group__5 ;
    public final void rule__Semaphore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4152:1: ( rule__Semaphore__Group__4__Impl rule__Semaphore__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4153:2: rule__Semaphore__Group__4__Impl rule__Semaphore__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__4__Impl_in_rule__Semaphore__Group__48216);
            rule__Semaphore__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__5_in_rule__Semaphore__Group__48219);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4160:1: rule__Semaphore__Group__4__Impl : ( ( rule__Semaphore__Group_4__0 )? ) ;
    public final void rule__Semaphore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4164:1: ( ( ( rule__Semaphore__Group_4__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4165:1: ( ( rule__Semaphore__Group_4__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4165:1: ( ( rule__Semaphore__Group_4__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4166:1: ( rule__Semaphore__Group_4__0 )?
            {
             before(grammarAccess.getSemaphoreAccess().getGroup_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4167:1: ( rule__Semaphore__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4167:2: rule__Semaphore__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_4__0_in_rule__Semaphore__Group__4__Impl8246);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4177:1: rule__Semaphore__Group__5 : rule__Semaphore__Group__5__Impl rule__Semaphore__Group__6 ;
    public final void rule__Semaphore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4181:1: ( rule__Semaphore__Group__5__Impl rule__Semaphore__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4182:2: rule__Semaphore__Group__5__Impl rule__Semaphore__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__5__Impl_in_rule__Semaphore__Group__58277);
            rule__Semaphore__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__6_in_rule__Semaphore__Group__58280);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4189:1: rule__Semaphore__Group__5__Impl : ( ( rule__Semaphore__Group_5__0 )? ) ;
    public final void rule__Semaphore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4193:1: ( ( ( rule__Semaphore__Group_5__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4194:1: ( ( rule__Semaphore__Group_5__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4194:1: ( ( rule__Semaphore__Group_5__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4195:1: ( rule__Semaphore__Group_5__0 )?
            {
             before(grammarAccess.getSemaphoreAccess().getGroup_5()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4196:1: ( rule__Semaphore__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4196:2: rule__Semaphore__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_5__0_in_rule__Semaphore__Group__5__Impl8307);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4206:1: rule__Semaphore__Group__6 : rule__Semaphore__Group__6__Impl rule__Semaphore__Group__7 ;
    public final void rule__Semaphore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4210:1: ( rule__Semaphore__Group__6__Impl rule__Semaphore__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4211:2: rule__Semaphore__Group__6__Impl rule__Semaphore__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__6__Impl_in_rule__Semaphore__Group__68338);
            rule__Semaphore__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__7_in_rule__Semaphore__Group__68341);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4218:1: rule__Semaphore__Group__6__Impl : ( ( rule__Semaphore__Group_6__0 )? ) ;
    public final void rule__Semaphore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4222:1: ( ( ( rule__Semaphore__Group_6__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4223:1: ( ( rule__Semaphore__Group_6__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4223:1: ( ( rule__Semaphore__Group_6__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4224:1: ( rule__Semaphore__Group_6__0 )?
            {
             before(grammarAccess.getSemaphoreAccess().getGroup_6()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4225:1: ( rule__Semaphore__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4225:2: rule__Semaphore__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_6__0_in_rule__Semaphore__Group__6__Impl8368);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4235:1: rule__Semaphore__Group__7 : rule__Semaphore__Group__7__Impl rule__Semaphore__Group__8 ;
    public final void rule__Semaphore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4239:1: ( rule__Semaphore__Group__7__Impl rule__Semaphore__Group__8 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4240:2: rule__Semaphore__Group__7__Impl rule__Semaphore__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__7__Impl_in_rule__Semaphore__Group__78399);
            rule__Semaphore__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__8_in_rule__Semaphore__Group__78402);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4247:1: rule__Semaphore__Group__7__Impl : ( 'belongsTo' ) ;
    public final void rule__Semaphore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4251:1: ( ( 'belongsTo' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4252:1: ( 'belongsTo' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4252:1: ( 'belongsTo' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4253:1: 'belongsTo'
            {
             before(grammarAccess.getSemaphoreAccess().getBelongsToKeyword_7()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Semaphore__Group__7__Impl8430); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4266:1: rule__Semaphore__Group__8 : rule__Semaphore__Group__8__Impl rule__Semaphore__Group__9 ;
    public final void rule__Semaphore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4270:1: ( rule__Semaphore__Group__8__Impl rule__Semaphore__Group__9 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4271:2: rule__Semaphore__Group__8__Impl rule__Semaphore__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__8__Impl_in_rule__Semaphore__Group__88461);
            rule__Semaphore__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__9_in_rule__Semaphore__Group__88464);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4278:1: rule__Semaphore__Group__8__Impl : ( ( rule__Semaphore__BelongsToAssignment_8 ) ) ;
    public final void rule__Semaphore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4282:1: ( ( ( rule__Semaphore__BelongsToAssignment_8 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4283:1: ( ( rule__Semaphore__BelongsToAssignment_8 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4283:1: ( ( rule__Semaphore__BelongsToAssignment_8 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4284:1: ( rule__Semaphore__BelongsToAssignment_8 )
            {
             before(grammarAccess.getSemaphoreAccess().getBelongsToAssignment_8()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4285:1: ( rule__Semaphore__BelongsToAssignment_8 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4285:2: rule__Semaphore__BelongsToAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__BelongsToAssignment_8_in_rule__Semaphore__Group__8__Impl8491);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4295:1: rule__Semaphore__Group__9 : rule__Semaphore__Group__9__Impl ;
    public final void rule__Semaphore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4299:1: ( rule__Semaphore__Group__9__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4300:2: rule__Semaphore__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group__9__Impl_in_rule__Semaphore__Group__98521);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4306:1: rule__Semaphore__Group__9__Impl : ( '}' ) ;
    public final void rule__Semaphore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4310:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4311:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4311:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4312:1: '}'
            {
             before(grammarAccess.getSemaphoreAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Semaphore__Group__9__Impl8549); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4345:1: rule__Semaphore__Group_4__0 : rule__Semaphore__Group_4__0__Impl rule__Semaphore__Group_4__1 ;
    public final void rule__Semaphore__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4349:1: ( rule__Semaphore__Group_4__0__Impl rule__Semaphore__Group_4__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4350:2: rule__Semaphore__Group_4__0__Impl rule__Semaphore__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_4__0__Impl_in_rule__Semaphore__Group_4__08600);
            rule__Semaphore__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_4__1_in_rule__Semaphore__Group_4__08603);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4357:1: rule__Semaphore__Group_4__0__Impl : ( 'canGo' ) ;
    public final void rule__Semaphore__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4361:1: ( ( 'canGo' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4362:1: ( 'canGo' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4362:1: ( 'canGo' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4363:1: 'canGo'
            {
             before(grammarAccess.getSemaphoreAccess().getCanGoKeyword_4_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Semaphore__Group_4__0__Impl8631); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4376:1: rule__Semaphore__Group_4__1 : rule__Semaphore__Group_4__1__Impl ;
    public final void rule__Semaphore__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4380:1: ( rule__Semaphore__Group_4__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4381:2: rule__Semaphore__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_4__1__Impl_in_rule__Semaphore__Group_4__18662);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4387:1: rule__Semaphore__Group_4__1__Impl : ( ( rule__Semaphore__CanGoAssignment_4_1 ) ) ;
    public final void rule__Semaphore__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4391:1: ( ( ( rule__Semaphore__CanGoAssignment_4_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4392:1: ( ( rule__Semaphore__CanGoAssignment_4_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4392:1: ( ( rule__Semaphore__CanGoAssignment_4_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4393:1: ( rule__Semaphore__CanGoAssignment_4_1 )
            {
             before(grammarAccess.getSemaphoreAccess().getCanGoAssignment_4_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4394:1: ( rule__Semaphore__CanGoAssignment_4_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4394:2: rule__Semaphore__CanGoAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__CanGoAssignment_4_1_in_rule__Semaphore__Group_4__1__Impl8689);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4408:1: rule__Semaphore__Group_5__0 : rule__Semaphore__Group_5__0__Impl rule__Semaphore__Group_5__1 ;
    public final void rule__Semaphore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4412:1: ( rule__Semaphore__Group_5__0__Impl rule__Semaphore__Group_5__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4413:2: rule__Semaphore__Group_5__0__Impl rule__Semaphore__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_5__0__Impl_in_rule__Semaphore__Group_5__08723);
            rule__Semaphore__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_5__1_in_rule__Semaphore__Group_5__08726);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4420:1: rule__Semaphore__Group_5__0__Impl : ( 'secondsRed' ) ;
    public final void rule__Semaphore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4424:1: ( ( 'secondsRed' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4425:1: ( 'secondsRed' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4425:1: ( 'secondsRed' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4426:1: 'secondsRed'
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsRedKeyword_5_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Semaphore__Group_5__0__Impl8754); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4439:1: rule__Semaphore__Group_5__1 : rule__Semaphore__Group_5__1__Impl ;
    public final void rule__Semaphore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4443:1: ( rule__Semaphore__Group_5__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4444:2: rule__Semaphore__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_5__1__Impl_in_rule__Semaphore__Group_5__18785);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4450:1: rule__Semaphore__Group_5__1__Impl : ( ( rule__Semaphore__SecondsRedAssignment_5_1 ) ) ;
    public final void rule__Semaphore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4454:1: ( ( ( rule__Semaphore__SecondsRedAssignment_5_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4455:1: ( ( rule__Semaphore__SecondsRedAssignment_5_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4455:1: ( ( rule__Semaphore__SecondsRedAssignment_5_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4456:1: ( rule__Semaphore__SecondsRedAssignment_5_1 )
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsRedAssignment_5_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4457:1: ( rule__Semaphore__SecondsRedAssignment_5_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4457:2: rule__Semaphore__SecondsRedAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__SecondsRedAssignment_5_1_in_rule__Semaphore__Group_5__1__Impl8812);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4471:1: rule__Semaphore__Group_6__0 : rule__Semaphore__Group_6__0__Impl rule__Semaphore__Group_6__1 ;
    public final void rule__Semaphore__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4475:1: ( rule__Semaphore__Group_6__0__Impl rule__Semaphore__Group_6__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4476:2: rule__Semaphore__Group_6__0__Impl rule__Semaphore__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_6__0__Impl_in_rule__Semaphore__Group_6__08846);
            rule__Semaphore__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_6__1_in_rule__Semaphore__Group_6__08849);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4483:1: rule__Semaphore__Group_6__0__Impl : ( 'secondsGreen' ) ;
    public final void rule__Semaphore__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4487:1: ( ( 'secondsGreen' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4488:1: ( 'secondsGreen' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4488:1: ( 'secondsGreen' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4489:1: 'secondsGreen'
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsGreenKeyword_6_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Semaphore__Group_6__0__Impl8877); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4502:1: rule__Semaphore__Group_6__1 : rule__Semaphore__Group_6__1__Impl ;
    public final void rule__Semaphore__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4506:1: ( rule__Semaphore__Group_6__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4507:2: rule__Semaphore__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__Group_6__1__Impl_in_rule__Semaphore__Group_6__18908);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4513:1: rule__Semaphore__Group_6__1__Impl : ( ( rule__Semaphore__SecondsGreenAssignment_6_1 ) ) ;
    public final void rule__Semaphore__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4517:1: ( ( ( rule__Semaphore__SecondsGreenAssignment_6_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4518:1: ( ( rule__Semaphore__SecondsGreenAssignment_6_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4518:1: ( ( rule__Semaphore__SecondsGreenAssignment_6_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4519:1: ( rule__Semaphore__SecondsGreenAssignment_6_1 )
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsGreenAssignment_6_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4520:1: ( rule__Semaphore__SecondsGreenAssignment_6_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4520:2: rule__Semaphore__SecondsGreenAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semaphore__SecondsGreenAssignment_6_1_in_rule__Semaphore__Group_6__1__Impl8935);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4534:1: rule__Signal_Impl__Group__0 : rule__Signal_Impl__Group__0__Impl rule__Signal_Impl__Group__1 ;
    public final void rule__Signal_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4538:1: ( rule__Signal_Impl__Group__0__Impl rule__Signal_Impl__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4539:2: rule__Signal_Impl__Group__0__Impl rule__Signal_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__0__Impl_in_rule__Signal_Impl__Group__08969);
            rule__Signal_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__1_in_rule__Signal_Impl__Group__08972);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4546:1: rule__Signal_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Signal_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4550:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4551:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4551:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4552:1: ()
            {
             before(grammarAccess.getSignal_ImplAccess().getSignalAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4553:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4555:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4565:1: rule__Signal_Impl__Group__1 : rule__Signal_Impl__Group__1__Impl rule__Signal_Impl__Group__2 ;
    public final void rule__Signal_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4569:1: ( rule__Signal_Impl__Group__1__Impl rule__Signal_Impl__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4570:2: rule__Signal_Impl__Group__1__Impl rule__Signal_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__1__Impl_in_rule__Signal_Impl__Group__19030);
            rule__Signal_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__2_in_rule__Signal_Impl__Group__19033);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4577:1: rule__Signal_Impl__Group__1__Impl : ( 'Signal' ) ;
    public final void rule__Signal_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4581:1: ( ( 'Signal' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4582:1: ( 'Signal' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4582:1: ( 'Signal' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4583:1: 'Signal'
            {
             before(grammarAccess.getSignal_ImplAccess().getSignalKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Signal_Impl__Group__1__Impl9061); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4596:1: rule__Signal_Impl__Group__2 : rule__Signal_Impl__Group__2__Impl rule__Signal_Impl__Group__3 ;
    public final void rule__Signal_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4600:1: ( rule__Signal_Impl__Group__2__Impl rule__Signal_Impl__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4601:2: rule__Signal_Impl__Group__2__Impl rule__Signal_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__2__Impl_in_rule__Signal_Impl__Group__29092);
            rule__Signal_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__3_in_rule__Signal_Impl__Group__29095);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4608:1: rule__Signal_Impl__Group__2__Impl : ( ( rule__Signal_Impl__NameAssignment_2 ) ) ;
    public final void rule__Signal_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4612:1: ( ( ( rule__Signal_Impl__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4613:1: ( ( rule__Signal_Impl__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4613:1: ( ( rule__Signal_Impl__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4614:1: ( rule__Signal_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getSignal_ImplAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4615:1: ( rule__Signal_Impl__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4615:2: rule__Signal_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__NameAssignment_2_in_rule__Signal_Impl__Group__2__Impl9122);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4625:1: rule__Signal_Impl__Group__3 : rule__Signal_Impl__Group__3__Impl rule__Signal_Impl__Group__4 ;
    public final void rule__Signal_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4629:1: ( rule__Signal_Impl__Group__3__Impl rule__Signal_Impl__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4630:2: rule__Signal_Impl__Group__3__Impl rule__Signal_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__3__Impl_in_rule__Signal_Impl__Group__39152);
            rule__Signal_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__4_in_rule__Signal_Impl__Group__39155);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4637:1: rule__Signal_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Signal_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4641:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4642:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4642:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4643:1: '{'
            {
             before(grammarAccess.getSignal_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Signal_Impl__Group__3__Impl9183); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4656:1: rule__Signal_Impl__Group__4 : rule__Signal_Impl__Group__4__Impl rule__Signal_Impl__Group__5 ;
    public final void rule__Signal_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4660:1: ( rule__Signal_Impl__Group__4__Impl rule__Signal_Impl__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4661:2: rule__Signal_Impl__Group__4__Impl rule__Signal_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__4__Impl_in_rule__Signal_Impl__Group__49214);
            rule__Signal_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__5_in_rule__Signal_Impl__Group__49217);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4668:1: rule__Signal_Impl__Group__4__Impl : ( 'belongsTo' ) ;
    public final void rule__Signal_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4672:1: ( ( 'belongsTo' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4673:1: ( 'belongsTo' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4673:1: ( 'belongsTo' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4674:1: 'belongsTo'
            {
             before(grammarAccess.getSignal_ImplAccess().getBelongsToKeyword_4()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Signal_Impl__Group__4__Impl9245); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4687:1: rule__Signal_Impl__Group__5 : rule__Signal_Impl__Group__5__Impl rule__Signal_Impl__Group__6 ;
    public final void rule__Signal_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4691:1: ( rule__Signal_Impl__Group__5__Impl rule__Signal_Impl__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4692:2: rule__Signal_Impl__Group__5__Impl rule__Signal_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__5__Impl_in_rule__Signal_Impl__Group__59276);
            rule__Signal_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__6_in_rule__Signal_Impl__Group__59279);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4699:1: rule__Signal_Impl__Group__5__Impl : ( ( rule__Signal_Impl__BelongsToAssignment_5 ) ) ;
    public final void rule__Signal_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4703:1: ( ( ( rule__Signal_Impl__BelongsToAssignment_5 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4704:1: ( ( rule__Signal_Impl__BelongsToAssignment_5 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4704:1: ( ( rule__Signal_Impl__BelongsToAssignment_5 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4705:1: ( rule__Signal_Impl__BelongsToAssignment_5 )
            {
             before(grammarAccess.getSignal_ImplAccess().getBelongsToAssignment_5()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4706:1: ( rule__Signal_Impl__BelongsToAssignment_5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4706:2: rule__Signal_Impl__BelongsToAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__BelongsToAssignment_5_in_rule__Signal_Impl__Group__5__Impl9306);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4716:1: rule__Signal_Impl__Group__6 : rule__Signal_Impl__Group__6__Impl ;
    public final void rule__Signal_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4720:1: ( rule__Signal_Impl__Group__6__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4721:2: rule__Signal_Impl__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signal_Impl__Group__6__Impl_in_rule__Signal_Impl__Group__69336);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4727:1: rule__Signal_Impl__Group__6__Impl : ( '}' ) ;
    public final void rule__Signal_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4731:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4732:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4732:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4733:1: '}'
            {
             before(grammarAccess.getSignal_ImplAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Signal_Impl__Group__6__Impl9364); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4760:1: rule__Extractor__Group__0 : rule__Extractor__Group__0__Impl rule__Extractor__Group__1 ;
    public final void rule__Extractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4764:1: ( rule__Extractor__Group__0__Impl rule__Extractor__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4765:2: rule__Extractor__Group__0__Impl rule__Extractor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__0__Impl_in_rule__Extractor__Group__09409);
            rule__Extractor__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__1_in_rule__Extractor__Group__09412);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4772:1: rule__Extractor__Group__0__Impl : ( () ) ;
    public final void rule__Extractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4776:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4777:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4777:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4778:1: ()
            {
             before(grammarAccess.getExtractorAccess().getExtractorAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4779:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4781:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4791:1: rule__Extractor__Group__1 : rule__Extractor__Group__1__Impl rule__Extractor__Group__2 ;
    public final void rule__Extractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4795:1: ( rule__Extractor__Group__1__Impl rule__Extractor__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4796:2: rule__Extractor__Group__1__Impl rule__Extractor__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__1__Impl_in_rule__Extractor__Group__19470);
            rule__Extractor__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__2_in_rule__Extractor__Group__19473);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4803:1: rule__Extractor__Group__1__Impl : ( 'Extractor' ) ;
    public final void rule__Extractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4807:1: ( ( 'Extractor' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4808:1: ( 'Extractor' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4808:1: ( 'Extractor' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4809:1: 'Extractor'
            {
             before(grammarAccess.getExtractorAccess().getExtractorKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Extractor__Group__1__Impl9501); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4822:1: rule__Extractor__Group__2 : rule__Extractor__Group__2__Impl rule__Extractor__Group__3 ;
    public final void rule__Extractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4826:1: ( rule__Extractor__Group__2__Impl rule__Extractor__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4827:2: rule__Extractor__Group__2__Impl rule__Extractor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__2__Impl_in_rule__Extractor__Group__29532);
            rule__Extractor__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__3_in_rule__Extractor__Group__29535);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4834:1: rule__Extractor__Group__2__Impl : ( ( rule__Extractor__NameAssignment_2 ) ) ;
    public final void rule__Extractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4838:1: ( ( ( rule__Extractor__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4839:1: ( ( rule__Extractor__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4839:1: ( ( rule__Extractor__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4840:1: ( rule__Extractor__NameAssignment_2 )
            {
             before(grammarAccess.getExtractorAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4841:1: ( rule__Extractor__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4841:2: rule__Extractor__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__NameAssignment_2_in_rule__Extractor__Group__2__Impl9562);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4851:1: rule__Extractor__Group__3 : rule__Extractor__Group__3__Impl rule__Extractor__Group__4 ;
    public final void rule__Extractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4855:1: ( rule__Extractor__Group__3__Impl rule__Extractor__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4856:2: rule__Extractor__Group__3__Impl rule__Extractor__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__3__Impl_in_rule__Extractor__Group__39592);
            rule__Extractor__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__4_in_rule__Extractor__Group__39595);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4863:1: rule__Extractor__Group__3__Impl : ( '{' ) ;
    public final void rule__Extractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4867:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4868:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4868:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4869:1: '{'
            {
             before(grammarAccess.getExtractorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Extractor__Group__3__Impl9623); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4882:1: rule__Extractor__Group__4 : rule__Extractor__Group__4__Impl rule__Extractor__Group__5 ;
    public final void rule__Extractor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4886:1: ( rule__Extractor__Group__4__Impl rule__Extractor__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4887:2: rule__Extractor__Group__4__Impl rule__Extractor__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__4__Impl_in_rule__Extractor__Group__49654);
            rule__Extractor__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__5_in_rule__Extractor__Group__49657);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4894:1: rule__Extractor__Group__4__Impl : ( ( rule__Extractor__Group_4__0 )? ) ;
    public final void rule__Extractor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4898:1: ( ( ( rule__Extractor__Group_4__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4899:1: ( ( rule__Extractor__Group_4__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4899:1: ( ( rule__Extractor__Group_4__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4900:1: ( rule__Extractor__Group_4__0 )?
            {
             before(grammarAccess.getExtractorAccess().getGroup_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4901:1: ( rule__Extractor__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4901:2: rule__Extractor__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__0_in_rule__Extractor__Group__4__Impl9684);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4911:1: rule__Extractor__Group__5 : rule__Extractor__Group__5__Impl rule__Extractor__Group__6 ;
    public final void rule__Extractor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4915:1: ( rule__Extractor__Group__5__Impl rule__Extractor__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4916:2: rule__Extractor__Group__5__Impl rule__Extractor__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__5__Impl_in_rule__Extractor__Group__59715);
            rule__Extractor__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__6_in_rule__Extractor__Group__59718);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4923:1: rule__Extractor__Group__5__Impl : ( 'hasEnds' ) ;
    public final void rule__Extractor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4927:1: ( ( 'hasEnds' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4928:1: ( 'hasEnds' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4928:1: ( 'hasEnds' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4929:1: 'hasEnds'
            {
             before(grammarAccess.getExtractorAccess().getHasEndsKeyword_5()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Extractor__Group__5__Impl9746); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4942:1: rule__Extractor__Group__6 : rule__Extractor__Group__6__Impl rule__Extractor__Group__7 ;
    public final void rule__Extractor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4946:1: ( rule__Extractor__Group__6__Impl rule__Extractor__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4947:2: rule__Extractor__Group__6__Impl rule__Extractor__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__6__Impl_in_rule__Extractor__Group__69777);
            rule__Extractor__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__7_in_rule__Extractor__Group__69780);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4954:1: rule__Extractor__Group__6__Impl : ( '(' ) ;
    public final void rule__Extractor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4958:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4959:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4959:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4960:1: '('
            {
             before(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_6()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Extractor__Group__6__Impl9808); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4973:1: rule__Extractor__Group__7 : rule__Extractor__Group__7__Impl rule__Extractor__Group__8 ;
    public final void rule__Extractor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4977:1: ( rule__Extractor__Group__7__Impl rule__Extractor__Group__8 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4978:2: rule__Extractor__Group__7__Impl rule__Extractor__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__7__Impl_in_rule__Extractor__Group__79839);
            rule__Extractor__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__8_in_rule__Extractor__Group__79842);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4985:1: rule__Extractor__Group__7__Impl : ( ( rule__Extractor__HasEndsAssignment_7 ) ) ;
    public final void rule__Extractor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4989:1: ( ( ( rule__Extractor__HasEndsAssignment_7 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4990:1: ( ( rule__Extractor__HasEndsAssignment_7 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4990:1: ( ( rule__Extractor__HasEndsAssignment_7 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4991:1: ( rule__Extractor__HasEndsAssignment_7 )
            {
             before(grammarAccess.getExtractorAccess().getHasEndsAssignment_7()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4992:1: ( rule__Extractor__HasEndsAssignment_7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:4992:2: rule__Extractor__HasEndsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__HasEndsAssignment_7_in_rule__Extractor__Group__7__Impl9869);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5002:1: rule__Extractor__Group__8 : rule__Extractor__Group__8__Impl rule__Extractor__Group__9 ;
    public final void rule__Extractor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5006:1: ( rule__Extractor__Group__8__Impl rule__Extractor__Group__9 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5007:2: rule__Extractor__Group__8__Impl rule__Extractor__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__8__Impl_in_rule__Extractor__Group__89899);
            rule__Extractor__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__9_in_rule__Extractor__Group__89902);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5014:1: rule__Extractor__Group__8__Impl : ( ( rule__Extractor__Group_8__0 )* ) ;
    public final void rule__Extractor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5018:1: ( ( ( rule__Extractor__Group_8__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5019:1: ( ( rule__Extractor__Group_8__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5019:1: ( ( rule__Extractor__Group_8__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5020:1: ( rule__Extractor__Group_8__0 )*
            {
             before(grammarAccess.getExtractorAccess().getGroup_8()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5021:1: ( rule__Extractor__Group_8__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5021:2: rule__Extractor__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_8__0_in_rule__Extractor__Group__8__Impl9929);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5031:1: rule__Extractor__Group__9 : rule__Extractor__Group__9__Impl rule__Extractor__Group__10 ;
    public final void rule__Extractor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5035:1: ( rule__Extractor__Group__9__Impl rule__Extractor__Group__10 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5036:2: rule__Extractor__Group__9__Impl rule__Extractor__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__9__Impl_in_rule__Extractor__Group__99960);
            rule__Extractor__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__10_in_rule__Extractor__Group__99963);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5043:1: rule__Extractor__Group__9__Impl : ( ')' ) ;
    public final void rule__Extractor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5047:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5048:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5048:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5049:1: ')'
            {
             before(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_9()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Extractor__Group__9__Impl9991); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5062:1: rule__Extractor__Group__10 : rule__Extractor__Group__10__Impl rule__Extractor__Group__11 ;
    public final void rule__Extractor__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5066:1: ( rule__Extractor__Group__10__Impl rule__Extractor__Group__11 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5067:2: rule__Extractor__Group__10__Impl rule__Extractor__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__10__Impl_in_rule__Extractor__Group__1010022);
            rule__Extractor__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__11_in_rule__Extractor__Group__1010025);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5074:1: rule__Extractor__Group__10__Impl : ( ( rule__Extractor__Group_10__0 )? ) ;
    public final void rule__Extractor__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5078:1: ( ( ( rule__Extractor__Group_10__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5079:1: ( ( rule__Extractor__Group_10__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5079:1: ( ( rule__Extractor__Group_10__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5080:1: ( rule__Extractor__Group_10__0 )?
            {
             before(grammarAccess.getExtractorAccess().getGroup_10()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5081:1: ( rule__Extractor__Group_10__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5081:2: rule__Extractor__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__0_in_rule__Extractor__Group__10__Impl10052);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5091:1: rule__Extractor__Group__11 : rule__Extractor__Group__11__Impl rule__Extractor__Group__12 ;
    public final void rule__Extractor__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5095:1: ( rule__Extractor__Group__11__Impl rule__Extractor__Group__12 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5096:2: rule__Extractor__Group__11__Impl rule__Extractor__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__11__Impl_in_rule__Extractor__Group__1110083);
            rule__Extractor__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__12_in_rule__Extractor__Group__1110086);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5103:1: rule__Extractor__Group__11__Impl : ( ( rule__Extractor__Group_11__0 )? ) ;
    public final void rule__Extractor__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5107:1: ( ( ( rule__Extractor__Group_11__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5108:1: ( ( rule__Extractor__Group_11__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5108:1: ( ( rule__Extractor__Group_11__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5109:1: ( rule__Extractor__Group_11__0 )?
            {
             before(grammarAccess.getExtractorAccess().getGroup_11()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5110:1: ( rule__Extractor__Group_11__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5110:2: rule__Extractor__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__0_in_rule__Extractor__Group__11__Impl10113);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5120:1: rule__Extractor__Group__12 : rule__Extractor__Group__12__Impl ;
    public final void rule__Extractor__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5124:1: ( rule__Extractor__Group__12__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5125:2: rule__Extractor__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group__12__Impl_in_rule__Extractor__Group__1210144);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5131:1: rule__Extractor__Group__12__Impl : ( '}' ) ;
    public final void rule__Extractor__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5135:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5136:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5136:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5137:1: '}'
            {
             before(grammarAccess.getExtractorAccess().getRightCurlyBracketKeyword_12()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Extractor__Group__12__Impl10172); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5176:1: rule__Extractor__Group_4__0 : rule__Extractor__Group_4__0__Impl rule__Extractor__Group_4__1 ;
    public final void rule__Extractor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5180:1: ( rule__Extractor__Group_4__0__Impl rule__Extractor__Group_4__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5181:2: rule__Extractor__Group_4__0__Impl rule__Extractor__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__0__Impl_in_rule__Extractor__Group_4__010229);
            rule__Extractor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__1_in_rule__Extractor__Group_4__010232);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5188:1: rule__Extractor__Group_4__0__Impl : ( 'hasStarts' ) ;
    public final void rule__Extractor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5192:1: ( ( 'hasStarts' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5193:1: ( 'hasStarts' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5193:1: ( 'hasStarts' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5194:1: 'hasStarts'
            {
             before(grammarAccess.getExtractorAccess().getHasStartsKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Extractor__Group_4__0__Impl10260); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5207:1: rule__Extractor__Group_4__1 : rule__Extractor__Group_4__1__Impl rule__Extractor__Group_4__2 ;
    public final void rule__Extractor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5211:1: ( rule__Extractor__Group_4__1__Impl rule__Extractor__Group_4__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5212:2: rule__Extractor__Group_4__1__Impl rule__Extractor__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__1__Impl_in_rule__Extractor__Group_4__110291);
            rule__Extractor__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__2_in_rule__Extractor__Group_4__110294);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5219:1: rule__Extractor__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Extractor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5223:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5224:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5224:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5225:1: '('
            {
             before(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Extractor__Group_4__1__Impl10322); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5238:1: rule__Extractor__Group_4__2 : rule__Extractor__Group_4__2__Impl rule__Extractor__Group_4__3 ;
    public final void rule__Extractor__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5242:1: ( rule__Extractor__Group_4__2__Impl rule__Extractor__Group_4__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5243:2: rule__Extractor__Group_4__2__Impl rule__Extractor__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__2__Impl_in_rule__Extractor__Group_4__210353);
            rule__Extractor__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__3_in_rule__Extractor__Group_4__210356);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5250:1: rule__Extractor__Group_4__2__Impl : ( ( rule__Extractor__HasStartsAssignment_4_2 ) ) ;
    public final void rule__Extractor__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5254:1: ( ( ( rule__Extractor__HasStartsAssignment_4_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5255:1: ( ( rule__Extractor__HasStartsAssignment_4_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5255:1: ( ( rule__Extractor__HasStartsAssignment_4_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5256:1: ( rule__Extractor__HasStartsAssignment_4_2 )
            {
             before(grammarAccess.getExtractorAccess().getHasStartsAssignment_4_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5257:1: ( rule__Extractor__HasStartsAssignment_4_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5257:2: rule__Extractor__HasStartsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__HasStartsAssignment_4_2_in_rule__Extractor__Group_4__2__Impl10383);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5267:1: rule__Extractor__Group_4__3 : rule__Extractor__Group_4__3__Impl rule__Extractor__Group_4__4 ;
    public final void rule__Extractor__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5271:1: ( rule__Extractor__Group_4__3__Impl rule__Extractor__Group_4__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5272:2: rule__Extractor__Group_4__3__Impl rule__Extractor__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__3__Impl_in_rule__Extractor__Group_4__310413);
            rule__Extractor__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__4_in_rule__Extractor__Group_4__310416);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5279:1: rule__Extractor__Group_4__3__Impl : ( ( rule__Extractor__Group_4_3__0 )* ) ;
    public final void rule__Extractor__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5283:1: ( ( ( rule__Extractor__Group_4_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5284:1: ( ( rule__Extractor__Group_4_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5284:1: ( ( rule__Extractor__Group_4_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5285:1: ( rule__Extractor__Group_4_3__0 )*
            {
             before(grammarAccess.getExtractorAccess().getGroup_4_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5286:1: ( rule__Extractor__Group_4_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==18) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5286:2: rule__Extractor__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4_3__0_in_rule__Extractor__Group_4__3__Impl10443);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5296:1: rule__Extractor__Group_4__4 : rule__Extractor__Group_4__4__Impl ;
    public final void rule__Extractor__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5300:1: ( rule__Extractor__Group_4__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5301:2: rule__Extractor__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4__4__Impl_in_rule__Extractor__Group_4__410474);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5307:1: rule__Extractor__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Extractor__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5311:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5312:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5312:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5313:1: ')'
            {
             before(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_4_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Extractor__Group_4__4__Impl10502); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5336:1: rule__Extractor__Group_4_3__0 : rule__Extractor__Group_4_3__0__Impl rule__Extractor__Group_4_3__1 ;
    public final void rule__Extractor__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5340:1: ( rule__Extractor__Group_4_3__0__Impl rule__Extractor__Group_4_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5341:2: rule__Extractor__Group_4_3__0__Impl rule__Extractor__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4_3__0__Impl_in_rule__Extractor__Group_4_3__010543);
            rule__Extractor__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4_3__1_in_rule__Extractor__Group_4_3__010546);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5348:1: rule__Extractor__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Extractor__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5352:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5353:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5353:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5354:1: ','
            {
             before(grammarAccess.getExtractorAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Extractor__Group_4_3__0__Impl10574); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5367:1: rule__Extractor__Group_4_3__1 : rule__Extractor__Group_4_3__1__Impl ;
    public final void rule__Extractor__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5371:1: ( rule__Extractor__Group_4_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5372:2: rule__Extractor__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_4_3__1__Impl_in_rule__Extractor__Group_4_3__110605);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5378:1: rule__Extractor__Group_4_3__1__Impl : ( ( rule__Extractor__HasStartsAssignment_4_3_1 ) ) ;
    public final void rule__Extractor__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5382:1: ( ( ( rule__Extractor__HasStartsAssignment_4_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5383:1: ( ( rule__Extractor__HasStartsAssignment_4_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5383:1: ( ( rule__Extractor__HasStartsAssignment_4_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5384:1: ( rule__Extractor__HasStartsAssignment_4_3_1 )
            {
             before(grammarAccess.getExtractorAccess().getHasStartsAssignment_4_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5385:1: ( rule__Extractor__HasStartsAssignment_4_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5385:2: rule__Extractor__HasStartsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__HasStartsAssignment_4_3_1_in_rule__Extractor__Group_4_3__1__Impl10632);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5399:1: rule__Extractor__Group_8__0 : rule__Extractor__Group_8__0__Impl rule__Extractor__Group_8__1 ;
    public final void rule__Extractor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5403:1: ( rule__Extractor__Group_8__0__Impl rule__Extractor__Group_8__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5404:2: rule__Extractor__Group_8__0__Impl rule__Extractor__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_8__0__Impl_in_rule__Extractor__Group_8__010666);
            rule__Extractor__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_8__1_in_rule__Extractor__Group_8__010669);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5411:1: rule__Extractor__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Extractor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5415:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5416:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5416:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5417:1: ','
            {
             before(grammarAccess.getExtractorAccess().getCommaKeyword_8_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Extractor__Group_8__0__Impl10697); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5430:1: rule__Extractor__Group_8__1 : rule__Extractor__Group_8__1__Impl ;
    public final void rule__Extractor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5434:1: ( rule__Extractor__Group_8__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5435:2: rule__Extractor__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_8__1__Impl_in_rule__Extractor__Group_8__110728);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5441:1: rule__Extractor__Group_8__1__Impl : ( ( rule__Extractor__HasEndsAssignment_8_1 ) ) ;
    public final void rule__Extractor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5445:1: ( ( ( rule__Extractor__HasEndsAssignment_8_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5446:1: ( ( rule__Extractor__HasEndsAssignment_8_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5446:1: ( ( rule__Extractor__HasEndsAssignment_8_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5447:1: ( rule__Extractor__HasEndsAssignment_8_1 )
            {
             before(grammarAccess.getExtractorAccess().getHasEndsAssignment_8_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5448:1: ( rule__Extractor__HasEndsAssignment_8_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5448:2: rule__Extractor__HasEndsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__HasEndsAssignment_8_1_in_rule__Extractor__Group_8__1__Impl10755);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5462:1: rule__Extractor__Group_10__0 : rule__Extractor__Group_10__0__Impl rule__Extractor__Group_10__1 ;
    public final void rule__Extractor__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5466:1: ( rule__Extractor__Group_10__0__Impl rule__Extractor__Group_10__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5467:2: rule__Extractor__Group_10__0__Impl rule__Extractor__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__0__Impl_in_rule__Extractor__Group_10__010789);
            rule__Extractor__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__1_in_rule__Extractor__Group_10__010792);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5474:1: rule__Extractor__Group_10__0__Impl : ( 'semaphore' ) ;
    public final void rule__Extractor__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5478:1: ( ( 'semaphore' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5479:1: ( 'semaphore' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5479:1: ( 'semaphore' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5480:1: 'semaphore'
            {
             before(grammarAccess.getExtractorAccess().getSemaphoreKeyword_10_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Extractor__Group_10__0__Impl10820); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5493:1: rule__Extractor__Group_10__1 : rule__Extractor__Group_10__1__Impl ;
    public final void rule__Extractor__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5497:1: ( rule__Extractor__Group_10__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5498:2: rule__Extractor__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_10__1__Impl_in_rule__Extractor__Group_10__110851);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5504:1: rule__Extractor__Group_10__1__Impl : ( ( rule__Extractor__SemaphoreAssignment_10_1 ) ) ;
    public final void rule__Extractor__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5508:1: ( ( ( rule__Extractor__SemaphoreAssignment_10_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5509:1: ( ( rule__Extractor__SemaphoreAssignment_10_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5509:1: ( ( rule__Extractor__SemaphoreAssignment_10_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5510:1: ( rule__Extractor__SemaphoreAssignment_10_1 )
            {
             before(grammarAccess.getExtractorAccess().getSemaphoreAssignment_10_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5511:1: ( rule__Extractor__SemaphoreAssignment_10_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5511:2: rule__Extractor__SemaphoreAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__SemaphoreAssignment_10_1_in_rule__Extractor__Group_10__1__Impl10878);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5525:1: rule__Extractor__Group_11__0 : rule__Extractor__Group_11__0__Impl rule__Extractor__Group_11__1 ;
    public final void rule__Extractor__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5529:1: ( rule__Extractor__Group_11__0__Impl rule__Extractor__Group_11__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5530:2: rule__Extractor__Group_11__0__Impl rule__Extractor__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__0__Impl_in_rule__Extractor__Group_11__010912);
            rule__Extractor__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__1_in_rule__Extractor__Group_11__010915);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5537:1: rule__Extractor__Group_11__0__Impl : ( 'signals' ) ;
    public final void rule__Extractor__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5541:1: ( ( 'signals' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5542:1: ( 'signals' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5542:1: ( 'signals' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5543:1: 'signals'
            {
             before(grammarAccess.getExtractorAccess().getSignalsKeyword_11_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Extractor__Group_11__0__Impl10943); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5556:1: rule__Extractor__Group_11__1 : rule__Extractor__Group_11__1__Impl rule__Extractor__Group_11__2 ;
    public final void rule__Extractor__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5560:1: ( rule__Extractor__Group_11__1__Impl rule__Extractor__Group_11__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5561:2: rule__Extractor__Group_11__1__Impl rule__Extractor__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__1__Impl_in_rule__Extractor__Group_11__110974);
            rule__Extractor__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__2_in_rule__Extractor__Group_11__110977);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5568:1: rule__Extractor__Group_11__1__Impl : ( '(' ) ;
    public final void rule__Extractor__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5572:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5573:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5573:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5574:1: '('
            {
             before(grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_11_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Extractor__Group_11__1__Impl11005); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5587:1: rule__Extractor__Group_11__2 : rule__Extractor__Group_11__2__Impl rule__Extractor__Group_11__3 ;
    public final void rule__Extractor__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5591:1: ( rule__Extractor__Group_11__2__Impl rule__Extractor__Group_11__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5592:2: rule__Extractor__Group_11__2__Impl rule__Extractor__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__2__Impl_in_rule__Extractor__Group_11__211036);
            rule__Extractor__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__3_in_rule__Extractor__Group_11__211039);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5599:1: rule__Extractor__Group_11__2__Impl : ( ( rule__Extractor__SignalsAssignment_11_2 ) ) ;
    public final void rule__Extractor__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5603:1: ( ( ( rule__Extractor__SignalsAssignment_11_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5604:1: ( ( rule__Extractor__SignalsAssignment_11_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5604:1: ( ( rule__Extractor__SignalsAssignment_11_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5605:1: ( rule__Extractor__SignalsAssignment_11_2 )
            {
             before(grammarAccess.getExtractorAccess().getSignalsAssignment_11_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5606:1: ( rule__Extractor__SignalsAssignment_11_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5606:2: rule__Extractor__SignalsAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__SignalsAssignment_11_2_in_rule__Extractor__Group_11__2__Impl11066);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5616:1: rule__Extractor__Group_11__3 : rule__Extractor__Group_11__3__Impl rule__Extractor__Group_11__4 ;
    public final void rule__Extractor__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5620:1: ( rule__Extractor__Group_11__3__Impl rule__Extractor__Group_11__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5621:2: rule__Extractor__Group_11__3__Impl rule__Extractor__Group_11__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__3__Impl_in_rule__Extractor__Group_11__311096);
            rule__Extractor__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__4_in_rule__Extractor__Group_11__311099);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5628:1: rule__Extractor__Group_11__3__Impl : ( ( rule__Extractor__Group_11_3__0 )* ) ;
    public final void rule__Extractor__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5632:1: ( ( ( rule__Extractor__Group_11_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5633:1: ( ( rule__Extractor__Group_11_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5633:1: ( ( rule__Extractor__Group_11_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5634:1: ( rule__Extractor__Group_11_3__0 )*
            {
             before(grammarAccess.getExtractorAccess().getGroup_11_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5635:1: ( rule__Extractor__Group_11_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==18) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5635:2: rule__Extractor__Group_11_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11_3__0_in_rule__Extractor__Group_11__3__Impl11126);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5645:1: rule__Extractor__Group_11__4 : rule__Extractor__Group_11__4__Impl ;
    public final void rule__Extractor__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5649:1: ( rule__Extractor__Group_11__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5650:2: rule__Extractor__Group_11__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11__4__Impl_in_rule__Extractor__Group_11__411157);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5656:1: rule__Extractor__Group_11__4__Impl : ( ')' ) ;
    public final void rule__Extractor__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5660:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5661:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5661:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5662:1: ')'
            {
             before(grammarAccess.getExtractorAccess().getRightParenthesisKeyword_11_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Extractor__Group_11__4__Impl11185); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5685:1: rule__Extractor__Group_11_3__0 : rule__Extractor__Group_11_3__0__Impl rule__Extractor__Group_11_3__1 ;
    public final void rule__Extractor__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5689:1: ( rule__Extractor__Group_11_3__0__Impl rule__Extractor__Group_11_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5690:2: rule__Extractor__Group_11_3__0__Impl rule__Extractor__Group_11_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11_3__0__Impl_in_rule__Extractor__Group_11_3__011226);
            rule__Extractor__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11_3__1_in_rule__Extractor__Group_11_3__011229);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5697:1: rule__Extractor__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Extractor__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5701:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5702:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5702:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5703:1: ','
            {
             before(grammarAccess.getExtractorAccess().getCommaKeyword_11_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Extractor__Group_11_3__0__Impl11257); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5716:1: rule__Extractor__Group_11_3__1 : rule__Extractor__Group_11_3__1__Impl ;
    public final void rule__Extractor__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5720:1: ( rule__Extractor__Group_11_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5721:2: rule__Extractor__Group_11_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__Group_11_3__1__Impl_in_rule__Extractor__Group_11_3__111288);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5727:1: rule__Extractor__Group_11_3__1__Impl : ( ( rule__Extractor__SignalsAssignment_11_3_1 ) ) ;
    public final void rule__Extractor__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5731:1: ( ( ( rule__Extractor__SignalsAssignment_11_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5732:1: ( ( rule__Extractor__SignalsAssignment_11_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5732:1: ( ( rule__Extractor__SignalsAssignment_11_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5733:1: ( rule__Extractor__SignalsAssignment_11_3_1 )
            {
             before(grammarAccess.getExtractorAccess().getSignalsAssignment_11_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5734:1: ( rule__Extractor__SignalsAssignment_11_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5734:2: rule__Extractor__SignalsAssignment_11_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Extractor__SignalsAssignment_11_3_1_in_rule__Extractor__Group_11_3__1__Impl11315);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5748:1: rule__Injector__Group__0 : rule__Injector__Group__0__Impl rule__Injector__Group__1 ;
    public final void rule__Injector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5752:1: ( rule__Injector__Group__0__Impl rule__Injector__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5753:2: rule__Injector__Group__0__Impl rule__Injector__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__0__Impl_in_rule__Injector__Group__011349);
            rule__Injector__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__1_in_rule__Injector__Group__011352);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5760:1: rule__Injector__Group__0__Impl : ( () ) ;
    public final void rule__Injector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5764:1: ( ( () ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5765:1: ( () )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5765:1: ( () )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5766:1: ()
            {
             before(grammarAccess.getInjectorAccess().getInjectorAction_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5767:1: ()
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5769:1: 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5779:1: rule__Injector__Group__1 : rule__Injector__Group__1__Impl rule__Injector__Group__2 ;
    public final void rule__Injector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5783:1: ( rule__Injector__Group__1__Impl rule__Injector__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5784:2: rule__Injector__Group__1__Impl rule__Injector__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__1__Impl_in_rule__Injector__Group__111410);
            rule__Injector__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__2_in_rule__Injector__Group__111413);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5791:1: rule__Injector__Group__1__Impl : ( 'Injector' ) ;
    public final void rule__Injector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5795:1: ( ( 'Injector' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5796:1: ( 'Injector' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5796:1: ( 'Injector' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5797:1: 'Injector'
            {
             before(grammarAccess.getInjectorAccess().getInjectorKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Injector__Group__1__Impl11441); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5810:1: rule__Injector__Group__2 : rule__Injector__Group__2__Impl rule__Injector__Group__3 ;
    public final void rule__Injector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5814:1: ( rule__Injector__Group__2__Impl rule__Injector__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5815:2: rule__Injector__Group__2__Impl rule__Injector__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__2__Impl_in_rule__Injector__Group__211472);
            rule__Injector__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__3_in_rule__Injector__Group__211475);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5822:1: rule__Injector__Group__2__Impl : ( ( rule__Injector__NameAssignment_2 ) ) ;
    public final void rule__Injector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5826:1: ( ( ( rule__Injector__NameAssignment_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5827:1: ( ( rule__Injector__NameAssignment_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5827:1: ( ( rule__Injector__NameAssignment_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5828:1: ( rule__Injector__NameAssignment_2 )
            {
             before(grammarAccess.getInjectorAccess().getNameAssignment_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5829:1: ( rule__Injector__NameAssignment_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5829:2: rule__Injector__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__NameAssignment_2_in_rule__Injector__Group__2__Impl11502);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5839:1: rule__Injector__Group__3 : rule__Injector__Group__3__Impl rule__Injector__Group__4 ;
    public final void rule__Injector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5843:1: ( rule__Injector__Group__3__Impl rule__Injector__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5844:2: rule__Injector__Group__3__Impl rule__Injector__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__3__Impl_in_rule__Injector__Group__311532);
            rule__Injector__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__4_in_rule__Injector__Group__311535);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5851:1: rule__Injector__Group__3__Impl : ( '{' ) ;
    public final void rule__Injector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5855:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5856:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5856:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5857:1: '{'
            {
             before(grammarAccess.getInjectorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Injector__Group__3__Impl11563); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5870:1: rule__Injector__Group__4 : rule__Injector__Group__4__Impl rule__Injector__Group__5 ;
    public final void rule__Injector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5874:1: ( rule__Injector__Group__4__Impl rule__Injector__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5875:2: rule__Injector__Group__4__Impl rule__Injector__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__4__Impl_in_rule__Injector__Group__411594);
            rule__Injector__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__5_in_rule__Injector__Group__411597);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5882:1: rule__Injector__Group__4__Impl : ( ( rule__Injector__Group_4__0 )? ) ;
    public final void rule__Injector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5886:1: ( ( ( rule__Injector__Group_4__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5887:1: ( ( rule__Injector__Group_4__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5887:1: ( ( rule__Injector__Group_4__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5888:1: ( rule__Injector__Group_4__0 )?
            {
             before(grammarAccess.getInjectorAccess().getGroup_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5889:1: ( rule__Injector__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5889:2: rule__Injector__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_4__0_in_rule__Injector__Group__4__Impl11624);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5899:1: rule__Injector__Group__5 : rule__Injector__Group__5__Impl rule__Injector__Group__6 ;
    public final void rule__Injector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5903:1: ( rule__Injector__Group__5__Impl rule__Injector__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5904:2: rule__Injector__Group__5__Impl rule__Injector__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__5__Impl_in_rule__Injector__Group__511655);
            rule__Injector__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__6_in_rule__Injector__Group__511658);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5911:1: rule__Injector__Group__5__Impl : ( 'hasStarts' ) ;
    public final void rule__Injector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5915:1: ( ( 'hasStarts' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5916:1: ( 'hasStarts' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5916:1: ( 'hasStarts' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5917:1: 'hasStarts'
            {
             before(grammarAccess.getInjectorAccess().getHasStartsKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Injector__Group__5__Impl11686); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5930:1: rule__Injector__Group__6 : rule__Injector__Group__6__Impl rule__Injector__Group__7 ;
    public final void rule__Injector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5934:1: ( rule__Injector__Group__6__Impl rule__Injector__Group__7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5935:2: rule__Injector__Group__6__Impl rule__Injector__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__6__Impl_in_rule__Injector__Group__611717);
            rule__Injector__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__7_in_rule__Injector__Group__611720);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5942:1: rule__Injector__Group__6__Impl : ( '(' ) ;
    public final void rule__Injector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5946:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5947:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5947:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5948:1: '('
            {
             before(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_6()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Injector__Group__6__Impl11748); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5961:1: rule__Injector__Group__7 : rule__Injector__Group__7__Impl rule__Injector__Group__8 ;
    public final void rule__Injector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5965:1: ( rule__Injector__Group__7__Impl rule__Injector__Group__8 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5966:2: rule__Injector__Group__7__Impl rule__Injector__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__7__Impl_in_rule__Injector__Group__711779);
            rule__Injector__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__8_in_rule__Injector__Group__711782);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5973:1: rule__Injector__Group__7__Impl : ( ( rule__Injector__HasStartsAssignment_7 ) ) ;
    public final void rule__Injector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5977:1: ( ( ( rule__Injector__HasStartsAssignment_7 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5978:1: ( ( rule__Injector__HasStartsAssignment_7 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5978:1: ( ( rule__Injector__HasStartsAssignment_7 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5979:1: ( rule__Injector__HasStartsAssignment_7 )
            {
             before(grammarAccess.getInjectorAccess().getHasStartsAssignment_7()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5980:1: ( rule__Injector__HasStartsAssignment_7 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5980:2: rule__Injector__HasStartsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__HasStartsAssignment_7_in_rule__Injector__Group__7__Impl11809);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5990:1: rule__Injector__Group__8 : rule__Injector__Group__8__Impl rule__Injector__Group__9 ;
    public final void rule__Injector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5994:1: ( rule__Injector__Group__8__Impl rule__Injector__Group__9 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:5995:2: rule__Injector__Group__8__Impl rule__Injector__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__8__Impl_in_rule__Injector__Group__811839);
            rule__Injector__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__9_in_rule__Injector__Group__811842);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6002:1: rule__Injector__Group__8__Impl : ( ( rule__Injector__Group_8__0 )* ) ;
    public final void rule__Injector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6006:1: ( ( ( rule__Injector__Group_8__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6007:1: ( ( rule__Injector__Group_8__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6007:1: ( ( rule__Injector__Group_8__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6008:1: ( rule__Injector__Group_8__0 )*
            {
             before(grammarAccess.getInjectorAccess().getGroup_8()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6009:1: ( rule__Injector__Group_8__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==18) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6009:2: rule__Injector__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_8__0_in_rule__Injector__Group__8__Impl11869);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6019:1: rule__Injector__Group__9 : rule__Injector__Group__9__Impl rule__Injector__Group__10 ;
    public final void rule__Injector__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6023:1: ( rule__Injector__Group__9__Impl rule__Injector__Group__10 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6024:2: rule__Injector__Group__9__Impl rule__Injector__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__9__Impl_in_rule__Injector__Group__911900);
            rule__Injector__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__10_in_rule__Injector__Group__911903);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6031:1: rule__Injector__Group__9__Impl : ( ')' ) ;
    public final void rule__Injector__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6035:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6036:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6036:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6037:1: ')'
            {
             before(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_9()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Injector__Group__9__Impl11931); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6050:1: rule__Injector__Group__10 : rule__Injector__Group__10__Impl rule__Injector__Group__11 ;
    public final void rule__Injector__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6054:1: ( rule__Injector__Group__10__Impl rule__Injector__Group__11 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6055:2: rule__Injector__Group__10__Impl rule__Injector__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__10__Impl_in_rule__Injector__Group__1011962);
            rule__Injector__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__11_in_rule__Injector__Group__1011965);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6062:1: rule__Injector__Group__10__Impl : ( ( rule__Injector__Group_10__0 )? ) ;
    public final void rule__Injector__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6066:1: ( ( ( rule__Injector__Group_10__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6067:1: ( ( rule__Injector__Group_10__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6067:1: ( ( rule__Injector__Group_10__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6068:1: ( rule__Injector__Group_10__0 )?
            {
             before(grammarAccess.getInjectorAccess().getGroup_10()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6069:1: ( rule__Injector__Group_10__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==27) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6069:2: rule__Injector__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__0_in_rule__Injector__Group__10__Impl11992);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6079:1: rule__Injector__Group__11 : rule__Injector__Group__11__Impl rule__Injector__Group__12 ;
    public final void rule__Injector__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6083:1: ( rule__Injector__Group__11__Impl rule__Injector__Group__12 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6084:2: rule__Injector__Group__11__Impl rule__Injector__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__11__Impl_in_rule__Injector__Group__1112023);
            rule__Injector__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__12_in_rule__Injector__Group__1112026);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6091:1: rule__Injector__Group__11__Impl : ( ( rule__Injector__Group_11__0 )? ) ;
    public final void rule__Injector__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6095:1: ( ( ( rule__Injector__Group_11__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6096:1: ( ( rule__Injector__Group_11__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6096:1: ( ( rule__Injector__Group_11__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6097:1: ( rule__Injector__Group_11__0 )?
            {
             before(grammarAccess.getInjectorAccess().getGroup_11()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6098:1: ( rule__Injector__Group_11__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==28) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6098:2: rule__Injector__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__0_in_rule__Injector__Group__11__Impl12053);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6108:1: rule__Injector__Group__12 : rule__Injector__Group__12__Impl rule__Injector__Group__13 ;
    public final void rule__Injector__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6112:1: ( rule__Injector__Group__12__Impl rule__Injector__Group__13 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6113:2: rule__Injector__Group__12__Impl rule__Injector__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__12__Impl_in_rule__Injector__Group__1212084);
            rule__Injector__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__13_in_rule__Injector__Group__1212087);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6120:1: rule__Injector__Group__12__Impl : ( ( rule__Injector__Group_12__0 )? ) ;
    public final void rule__Injector__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6124:1: ( ( ( rule__Injector__Group_12__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6125:1: ( ( rule__Injector__Group_12__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6125:1: ( ( rule__Injector__Group_12__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6126:1: ( rule__Injector__Group_12__0 )?
            {
             before(grammarAccess.getInjectorAccess().getGroup_12()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6127:1: ( rule__Injector__Group_12__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==29) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6127:2: rule__Injector__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__0_in_rule__Injector__Group__12__Impl12114);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6137:1: rule__Injector__Group__13 : rule__Injector__Group__13__Impl ;
    public final void rule__Injector__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6141:1: ( rule__Injector__Group__13__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6142:2: rule__Injector__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group__13__Impl_in_rule__Injector__Group__1312145);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6148:1: rule__Injector__Group__13__Impl : ( '}' ) ;
    public final void rule__Injector__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6152:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6153:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6153:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6154:1: '}'
            {
             before(grammarAccess.getInjectorAccess().getRightCurlyBracketKeyword_13()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Injector__Group__13__Impl12173); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6195:1: rule__Injector__Group_4__0 : rule__Injector__Group_4__0__Impl rule__Injector__Group_4__1 ;
    public final void rule__Injector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6199:1: ( rule__Injector__Group_4__0__Impl rule__Injector__Group_4__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6200:2: rule__Injector__Group_4__0__Impl rule__Injector__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_4__0__Impl_in_rule__Injector__Group_4__012232);
            rule__Injector__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_4__1_in_rule__Injector__Group_4__012235);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6207:1: rule__Injector__Group_4__0__Impl : ( 'carsPerHour' ) ;
    public final void rule__Injector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6211:1: ( ( 'carsPerHour' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6212:1: ( 'carsPerHour' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6212:1: ( 'carsPerHour' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6213:1: 'carsPerHour'
            {
             before(grammarAccess.getInjectorAccess().getCarsPerHourKeyword_4_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Injector__Group_4__0__Impl12263); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6226:1: rule__Injector__Group_4__1 : rule__Injector__Group_4__1__Impl ;
    public final void rule__Injector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6230:1: ( rule__Injector__Group_4__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6231:2: rule__Injector__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_4__1__Impl_in_rule__Injector__Group_4__112294);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6237:1: rule__Injector__Group_4__1__Impl : ( ( rule__Injector__CarsPerHourAssignment_4_1 ) ) ;
    public final void rule__Injector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6241:1: ( ( ( rule__Injector__CarsPerHourAssignment_4_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6242:1: ( ( rule__Injector__CarsPerHourAssignment_4_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6242:1: ( ( rule__Injector__CarsPerHourAssignment_4_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6243:1: ( rule__Injector__CarsPerHourAssignment_4_1 )
            {
             before(grammarAccess.getInjectorAccess().getCarsPerHourAssignment_4_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6244:1: ( rule__Injector__CarsPerHourAssignment_4_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6244:2: rule__Injector__CarsPerHourAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__CarsPerHourAssignment_4_1_in_rule__Injector__Group_4__1__Impl12321);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6258:1: rule__Injector__Group_8__0 : rule__Injector__Group_8__0__Impl rule__Injector__Group_8__1 ;
    public final void rule__Injector__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6262:1: ( rule__Injector__Group_8__0__Impl rule__Injector__Group_8__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6263:2: rule__Injector__Group_8__0__Impl rule__Injector__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_8__0__Impl_in_rule__Injector__Group_8__012355);
            rule__Injector__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_8__1_in_rule__Injector__Group_8__012358);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6270:1: rule__Injector__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Injector__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6274:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6275:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6275:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6276:1: ','
            {
             before(grammarAccess.getInjectorAccess().getCommaKeyword_8_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Injector__Group_8__0__Impl12386); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6289:1: rule__Injector__Group_8__1 : rule__Injector__Group_8__1__Impl ;
    public final void rule__Injector__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6293:1: ( rule__Injector__Group_8__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6294:2: rule__Injector__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_8__1__Impl_in_rule__Injector__Group_8__112417);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6300:1: rule__Injector__Group_8__1__Impl : ( ( rule__Injector__HasStartsAssignment_8_1 ) ) ;
    public final void rule__Injector__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6304:1: ( ( ( rule__Injector__HasStartsAssignment_8_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6305:1: ( ( rule__Injector__HasStartsAssignment_8_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6305:1: ( ( rule__Injector__HasStartsAssignment_8_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6306:1: ( rule__Injector__HasStartsAssignment_8_1 )
            {
             before(grammarAccess.getInjectorAccess().getHasStartsAssignment_8_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6307:1: ( rule__Injector__HasStartsAssignment_8_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6307:2: rule__Injector__HasStartsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__HasStartsAssignment_8_1_in_rule__Injector__Group_8__1__Impl12444);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6321:1: rule__Injector__Group_10__0 : rule__Injector__Group_10__0__Impl rule__Injector__Group_10__1 ;
    public final void rule__Injector__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6325:1: ( rule__Injector__Group_10__0__Impl rule__Injector__Group_10__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6326:2: rule__Injector__Group_10__0__Impl rule__Injector__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__0__Impl_in_rule__Injector__Group_10__012478);
            rule__Injector__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__1_in_rule__Injector__Group_10__012481);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6333:1: rule__Injector__Group_10__0__Impl : ( 'hasEnds' ) ;
    public final void rule__Injector__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6337:1: ( ( 'hasEnds' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6338:1: ( 'hasEnds' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6338:1: ( 'hasEnds' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6339:1: 'hasEnds'
            {
             before(grammarAccess.getInjectorAccess().getHasEndsKeyword_10_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Injector__Group_10__0__Impl12509); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6352:1: rule__Injector__Group_10__1 : rule__Injector__Group_10__1__Impl rule__Injector__Group_10__2 ;
    public final void rule__Injector__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6356:1: ( rule__Injector__Group_10__1__Impl rule__Injector__Group_10__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6357:2: rule__Injector__Group_10__1__Impl rule__Injector__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__1__Impl_in_rule__Injector__Group_10__112540);
            rule__Injector__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__2_in_rule__Injector__Group_10__112543);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6364:1: rule__Injector__Group_10__1__Impl : ( '(' ) ;
    public final void rule__Injector__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6368:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6369:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6369:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6370:1: '('
            {
             before(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Injector__Group_10__1__Impl12571); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6383:1: rule__Injector__Group_10__2 : rule__Injector__Group_10__2__Impl rule__Injector__Group_10__3 ;
    public final void rule__Injector__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6387:1: ( rule__Injector__Group_10__2__Impl rule__Injector__Group_10__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6388:2: rule__Injector__Group_10__2__Impl rule__Injector__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__2__Impl_in_rule__Injector__Group_10__212602);
            rule__Injector__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__3_in_rule__Injector__Group_10__212605);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6395:1: rule__Injector__Group_10__2__Impl : ( ( rule__Injector__HasEndsAssignment_10_2 ) ) ;
    public final void rule__Injector__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6399:1: ( ( ( rule__Injector__HasEndsAssignment_10_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6400:1: ( ( rule__Injector__HasEndsAssignment_10_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6400:1: ( ( rule__Injector__HasEndsAssignment_10_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6401:1: ( rule__Injector__HasEndsAssignment_10_2 )
            {
             before(grammarAccess.getInjectorAccess().getHasEndsAssignment_10_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6402:1: ( rule__Injector__HasEndsAssignment_10_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6402:2: rule__Injector__HasEndsAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__HasEndsAssignment_10_2_in_rule__Injector__Group_10__2__Impl12632);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6412:1: rule__Injector__Group_10__3 : rule__Injector__Group_10__3__Impl rule__Injector__Group_10__4 ;
    public final void rule__Injector__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6416:1: ( rule__Injector__Group_10__3__Impl rule__Injector__Group_10__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6417:2: rule__Injector__Group_10__3__Impl rule__Injector__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__3__Impl_in_rule__Injector__Group_10__312662);
            rule__Injector__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__4_in_rule__Injector__Group_10__312665);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6424:1: rule__Injector__Group_10__3__Impl : ( ( rule__Injector__Group_10_3__0 )* ) ;
    public final void rule__Injector__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6428:1: ( ( ( rule__Injector__Group_10_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6429:1: ( ( rule__Injector__Group_10_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6429:1: ( ( rule__Injector__Group_10_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6430:1: ( rule__Injector__Group_10_3__0 )*
            {
             before(grammarAccess.getInjectorAccess().getGroup_10_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6431:1: ( rule__Injector__Group_10_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==18) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6431:2: rule__Injector__Group_10_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10_3__0_in_rule__Injector__Group_10__3__Impl12692);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6441:1: rule__Injector__Group_10__4 : rule__Injector__Group_10__4__Impl ;
    public final void rule__Injector__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6445:1: ( rule__Injector__Group_10__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6446:2: rule__Injector__Group_10__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10__4__Impl_in_rule__Injector__Group_10__412723);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6452:1: rule__Injector__Group_10__4__Impl : ( ')' ) ;
    public final void rule__Injector__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6456:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6457:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6457:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6458:1: ')'
            {
             before(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_10_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Injector__Group_10__4__Impl12751); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6481:1: rule__Injector__Group_10_3__0 : rule__Injector__Group_10_3__0__Impl rule__Injector__Group_10_3__1 ;
    public final void rule__Injector__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6485:1: ( rule__Injector__Group_10_3__0__Impl rule__Injector__Group_10_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6486:2: rule__Injector__Group_10_3__0__Impl rule__Injector__Group_10_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10_3__0__Impl_in_rule__Injector__Group_10_3__012792);
            rule__Injector__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10_3__1_in_rule__Injector__Group_10_3__012795);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6493:1: rule__Injector__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Injector__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6497:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6498:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6498:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6499:1: ','
            {
             before(grammarAccess.getInjectorAccess().getCommaKeyword_10_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Injector__Group_10_3__0__Impl12823); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6512:1: rule__Injector__Group_10_3__1 : rule__Injector__Group_10_3__1__Impl ;
    public final void rule__Injector__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6516:1: ( rule__Injector__Group_10_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6517:2: rule__Injector__Group_10_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_10_3__1__Impl_in_rule__Injector__Group_10_3__112854);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6523:1: rule__Injector__Group_10_3__1__Impl : ( ( rule__Injector__HasEndsAssignment_10_3_1 ) ) ;
    public final void rule__Injector__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6527:1: ( ( ( rule__Injector__HasEndsAssignment_10_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6528:1: ( ( rule__Injector__HasEndsAssignment_10_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6528:1: ( ( rule__Injector__HasEndsAssignment_10_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6529:1: ( rule__Injector__HasEndsAssignment_10_3_1 )
            {
             before(grammarAccess.getInjectorAccess().getHasEndsAssignment_10_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6530:1: ( rule__Injector__HasEndsAssignment_10_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6530:2: rule__Injector__HasEndsAssignment_10_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__HasEndsAssignment_10_3_1_in_rule__Injector__Group_10_3__1__Impl12881);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6544:1: rule__Injector__Group_11__0 : rule__Injector__Group_11__0__Impl rule__Injector__Group_11__1 ;
    public final void rule__Injector__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6548:1: ( rule__Injector__Group_11__0__Impl rule__Injector__Group_11__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6549:2: rule__Injector__Group_11__0__Impl rule__Injector__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__0__Impl_in_rule__Injector__Group_11__012915);
            rule__Injector__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__1_in_rule__Injector__Group_11__012918);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6556:1: rule__Injector__Group_11__0__Impl : ( 'semaphore' ) ;
    public final void rule__Injector__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6560:1: ( ( 'semaphore' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6561:1: ( 'semaphore' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6561:1: ( 'semaphore' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6562:1: 'semaphore'
            {
             before(grammarAccess.getInjectorAccess().getSemaphoreKeyword_11_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Injector__Group_11__0__Impl12946); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6575:1: rule__Injector__Group_11__1 : rule__Injector__Group_11__1__Impl ;
    public final void rule__Injector__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6579:1: ( rule__Injector__Group_11__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6580:2: rule__Injector__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_11__1__Impl_in_rule__Injector__Group_11__112977);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6586:1: rule__Injector__Group_11__1__Impl : ( ( rule__Injector__SemaphoreAssignment_11_1 ) ) ;
    public final void rule__Injector__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6590:1: ( ( ( rule__Injector__SemaphoreAssignment_11_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6591:1: ( ( rule__Injector__SemaphoreAssignment_11_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6591:1: ( ( rule__Injector__SemaphoreAssignment_11_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6592:1: ( rule__Injector__SemaphoreAssignment_11_1 )
            {
             before(grammarAccess.getInjectorAccess().getSemaphoreAssignment_11_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6593:1: ( rule__Injector__SemaphoreAssignment_11_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6593:2: rule__Injector__SemaphoreAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__SemaphoreAssignment_11_1_in_rule__Injector__Group_11__1__Impl13004);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6607:1: rule__Injector__Group_12__0 : rule__Injector__Group_12__0__Impl rule__Injector__Group_12__1 ;
    public final void rule__Injector__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6611:1: ( rule__Injector__Group_12__0__Impl rule__Injector__Group_12__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6612:2: rule__Injector__Group_12__0__Impl rule__Injector__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__0__Impl_in_rule__Injector__Group_12__013038);
            rule__Injector__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__1_in_rule__Injector__Group_12__013041);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6619:1: rule__Injector__Group_12__0__Impl : ( 'signals' ) ;
    public final void rule__Injector__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6623:1: ( ( 'signals' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6624:1: ( 'signals' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6624:1: ( 'signals' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6625:1: 'signals'
            {
             before(grammarAccess.getInjectorAccess().getSignalsKeyword_12_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Injector__Group_12__0__Impl13069); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6638:1: rule__Injector__Group_12__1 : rule__Injector__Group_12__1__Impl rule__Injector__Group_12__2 ;
    public final void rule__Injector__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6642:1: ( rule__Injector__Group_12__1__Impl rule__Injector__Group_12__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6643:2: rule__Injector__Group_12__1__Impl rule__Injector__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__1__Impl_in_rule__Injector__Group_12__113100);
            rule__Injector__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__2_in_rule__Injector__Group_12__113103);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6650:1: rule__Injector__Group_12__1__Impl : ( '(' ) ;
    public final void rule__Injector__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6654:1: ( ( '(' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6655:1: ( '(' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6655:1: ( '(' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6656:1: '('
            {
             before(grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_12_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Injector__Group_12__1__Impl13131); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6669:1: rule__Injector__Group_12__2 : rule__Injector__Group_12__2__Impl rule__Injector__Group_12__3 ;
    public final void rule__Injector__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6673:1: ( rule__Injector__Group_12__2__Impl rule__Injector__Group_12__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6674:2: rule__Injector__Group_12__2__Impl rule__Injector__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__2__Impl_in_rule__Injector__Group_12__213162);
            rule__Injector__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__3_in_rule__Injector__Group_12__213165);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6681:1: rule__Injector__Group_12__2__Impl : ( ( rule__Injector__SignalsAssignment_12_2 ) ) ;
    public final void rule__Injector__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6685:1: ( ( ( rule__Injector__SignalsAssignment_12_2 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6686:1: ( ( rule__Injector__SignalsAssignment_12_2 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6686:1: ( ( rule__Injector__SignalsAssignment_12_2 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6687:1: ( rule__Injector__SignalsAssignment_12_2 )
            {
             before(grammarAccess.getInjectorAccess().getSignalsAssignment_12_2()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6688:1: ( rule__Injector__SignalsAssignment_12_2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6688:2: rule__Injector__SignalsAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__SignalsAssignment_12_2_in_rule__Injector__Group_12__2__Impl13192);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6698:1: rule__Injector__Group_12__3 : rule__Injector__Group_12__3__Impl rule__Injector__Group_12__4 ;
    public final void rule__Injector__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6702:1: ( rule__Injector__Group_12__3__Impl rule__Injector__Group_12__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6703:2: rule__Injector__Group_12__3__Impl rule__Injector__Group_12__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__3__Impl_in_rule__Injector__Group_12__313222);
            rule__Injector__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__4_in_rule__Injector__Group_12__313225);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6710:1: rule__Injector__Group_12__3__Impl : ( ( rule__Injector__Group_12_3__0 )* ) ;
    public final void rule__Injector__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6714:1: ( ( ( rule__Injector__Group_12_3__0 )* ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6715:1: ( ( rule__Injector__Group_12_3__0 )* )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6715:1: ( ( rule__Injector__Group_12_3__0 )* )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6716:1: ( rule__Injector__Group_12_3__0 )*
            {
             before(grammarAccess.getInjectorAccess().getGroup_12_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6717:1: ( rule__Injector__Group_12_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==18) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6717:2: rule__Injector__Group_12_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12_3__0_in_rule__Injector__Group_12__3__Impl13252);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6727:1: rule__Injector__Group_12__4 : rule__Injector__Group_12__4__Impl ;
    public final void rule__Injector__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6731:1: ( rule__Injector__Group_12__4__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6732:2: rule__Injector__Group_12__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12__4__Impl_in_rule__Injector__Group_12__413283);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6738:1: rule__Injector__Group_12__4__Impl : ( ')' ) ;
    public final void rule__Injector__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6742:1: ( ( ')' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6743:1: ( ')' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6743:1: ( ')' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6744:1: ')'
            {
             before(grammarAccess.getInjectorAccess().getRightParenthesisKeyword_12_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Injector__Group_12__4__Impl13311); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6767:1: rule__Injector__Group_12_3__0 : rule__Injector__Group_12_3__0__Impl rule__Injector__Group_12_3__1 ;
    public final void rule__Injector__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6771:1: ( rule__Injector__Group_12_3__0__Impl rule__Injector__Group_12_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6772:2: rule__Injector__Group_12_3__0__Impl rule__Injector__Group_12_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12_3__0__Impl_in_rule__Injector__Group_12_3__013352);
            rule__Injector__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12_3__1_in_rule__Injector__Group_12_3__013355);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6779:1: rule__Injector__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Injector__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6783:1: ( ( ',' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6784:1: ( ',' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6784:1: ( ',' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6785:1: ','
            {
             before(grammarAccess.getInjectorAccess().getCommaKeyword_12_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Injector__Group_12_3__0__Impl13383); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6798:1: rule__Injector__Group_12_3__1 : rule__Injector__Group_12_3__1__Impl ;
    public final void rule__Injector__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6802:1: ( rule__Injector__Group_12_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6803:2: rule__Injector__Group_12_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__Group_12_3__1__Impl_in_rule__Injector__Group_12_3__113414);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6809:1: rule__Injector__Group_12_3__1__Impl : ( ( rule__Injector__SignalsAssignment_12_3_1 ) ) ;
    public final void rule__Injector__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6813:1: ( ( ( rule__Injector__SignalsAssignment_12_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6814:1: ( ( rule__Injector__SignalsAssignment_12_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6814:1: ( ( rule__Injector__SignalsAssignment_12_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6815:1: ( rule__Injector__SignalsAssignment_12_3_1 )
            {
             before(grammarAccess.getInjectorAccess().getSignalsAssignment_12_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6816:1: ( rule__Injector__SignalsAssignment_12_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6816:2: rule__Injector__SignalsAssignment_12_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Injector__SignalsAssignment_12_3_1_in_rule__Injector__Group_12_3__1__Impl13441);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6830:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6834:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6835:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__013475);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__013478);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6842:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6846:1: ( ( ( '-' )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6847:1: ( ( '-' )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6847:1: ( ( '-' )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6848:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6849:1: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==45) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6850:2: '-'
                    {
                    match(input,45,FollowSets000.FOLLOW_45_in_rule__EInt__Group__0__Impl13507); 

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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6861:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6865:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6866:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__113540);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6872:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6876:1: ( ( RULE_INT ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6877:1: ( RULE_INT )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6877:1: ( RULE_INT )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6878:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl13567); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6893:1: rule__Speedlimit__Group__0 : rule__Speedlimit__Group__0__Impl rule__Speedlimit__Group__1 ;
    public final void rule__Speedlimit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6897:1: ( rule__Speedlimit__Group__0__Impl rule__Speedlimit__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6898:2: rule__Speedlimit__Group__0__Impl rule__Speedlimit__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__0__Impl_in_rule__Speedlimit__Group__013600);
            rule__Speedlimit__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__1_in_rule__Speedlimit__Group__013603);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6905:1: rule__Speedlimit__Group__0__Impl : ( 'Speedlimit' ) ;
    public final void rule__Speedlimit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6909:1: ( ( 'Speedlimit' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6910:1: ( 'Speedlimit' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6910:1: ( 'Speedlimit' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6911:1: 'Speedlimit'
            {
             before(grammarAccess.getSpeedlimitAccess().getSpeedlimitKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Speedlimit__Group__0__Impl13631); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6924:1: rule__Speedlimit__Group__1 : rule__Speedlimit__Group__1__Impl rule__Speedlimit__Group__2 ;
    public final void rule__Speedlimit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6928:1: ( rule__Speedlimit__Group__1__Impl rule__Speedlimit__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6929:2: rule__Speedlimit__Group__1__Impl rule__Speedlimit__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__1__Impl_in_rule__Speedlimit__Group__113662);
            rule__Speedlimit__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__2_in_rule__Speedlimit__Group__113665);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6936:1: rule__Speedlimit__Group__1__Impl : ( ( rule__Speedlimit__NameAssignment_1 ) ) ;
    public final void rule__Speedlimit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6940:1: ( ( ( rule__Speedlimit__NameAssignment_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6941:1: ( ( rule__Speedlimit__NameAssignment_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6941:1: ( ( rule__Speedlimit__NameAssignment_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6942:1: ( rule__Speedlimit__NameAssignment_1 )
            {
             before(grammarAccess.getSpeedlimitAccess().getNameAssignment_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6943:1: ( rule__Speedlimit__NameAssignment_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6943:2: rule__Speedlimit__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__NameAssignment_1_in_rule__Speedlimit__Group__1__Impl13692);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6953:1: rule__Speedlimit__Group__2 : rule__Speedlimit__Group__2__Impl rule__Speedlimit__Group__3 ;
    public final void rule__Speedlimit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6957:1: ( rule__Speedlimit__Group__2__Impl rule__Speedlimit__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6958:2: rule__Speedlimit__Group__2__Impl rule__Speedlimit__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__2__Impl_in_rule__Speedlimit__Group__213722);
            rule__Speedlimit__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__3_in_rule__Speedlimit__Group__213725);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6965:1: rule__Speedlimit__Group__2__Impl : ( '{' ) ;
    public final void rule__Speedlimit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6969:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6970:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6970:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6971:1: '{'
            {
             before(grammarAccess.getSpeedlimitAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Speedlimit__Group__2__Impl13753); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6984:1: rule__Speedlimit__Group__3 : rule__Speedlimit__Group__3__Impl rule__Speedlimit__Group__4 ;
    public final void rule__Speedlimit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6988:1: ( rule__Speedlimit__Group__3__Impl rule__Speedlimit__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6989:2: rule__Speedlimit__Group__3__Impl rule__Speedlimit__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__3__Impl_in_rule__Speedlimit__Group__313784);
            rule__Speedlimit__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__4_in_rule__Speedlimit__Group__313787);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:6996:1: rule__Speedlimit__Group__3__Impl : ( ( rule__Speedlimit__Group_3__0 )? ) ;
    public final void rule__Speedlimit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7000:1: ( ( ( rule__Speedlimit__Group_3__0 )? ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7001:1: ( ( rule__Speedlimit__Group_3__0 )? )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7001:1: ( ( rule__Speedlimit__Group_3__0 )? )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7002:1: ( rule__Speedlimit__Group_3__0 )?
            {
             before(grammarAccess.getSpeedlimitAccess().getGroup_3()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7003:1: ( rule__Speedlimit__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7003:2: rule__Speedlimit__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group_3__0_in_rule__Speedlimit__Group__3__Impl13814);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7013:1: rule__Speedlimit__Group__4 : rule__Speedlimit__Group__4__Impl rule__Speedlimit__Group__5 ;
    public final void rule__Speedlimit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7017:1: ( rule__Speedlimit__Group__4__Impl rule__Speedlimit__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7018:2: rule__Speedlimit__Group__4__Impl rule__Speedlimit__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__4__Impl_in_rule__Speedlimit__Group__413845);
            rule__Speedlimit__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__5_in_rule__Speedlimit__Group__413848);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7025:1: rule__Speedlimit__Group__4__Impl : ( 'belongsTo' ) ;
    public final void rule__Speedlimit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7029:1: ( ( 'belongsTo' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7030:1: ( 'belongsTo' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7030:1: ( 'belongsTo' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7031:1: 'belongsTo'
            {
             before(grammarAccess.getSpeedlimitAccess().getBelongsToKeyword_4()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Speedlimit__Group__4__Impl13876); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7044:1: rule__Speedlimit__Group__5 : rule__Speedlimit__Group__5__Impl rule__Speedlimit__Group__6 ;
    public final void rule__Speedlimit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7048:1: ( rule__Speedlimit__Group__5__Impl rule__Speedlimit__Group__6 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7049:2: rule__Speedlimit__Group__5__Impl rule__Speedlimit__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__5__Impl_in_rule__Speedlimit__Group__513907);
            rule__Speedlimit__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__6_in_rule__Speedlimit__Group__513910);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7056:1: rule__Speedlimit__Group__5__Impl : ( ( rule__Speedlimit__BelongsToAssignment_5 ) ) ;
    public final void rule__Speedlimit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7060:1: ( ( ( rule__Speedlimit__BelongsToAssignment_5 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7061:1: ( ( rule__Speedlimit__BelongsToAssignment_5 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7061:1: ( ( rule__Speedlimit__BelongsToAssignment_5 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7062:1: ( rule__Speedlimit__BelongsToAssignment_5 )
            {
             before(grammarAccess.getSpeedlimitAccess().getBelongsToAssignment_5()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7063:1: ( rule__Speedlimit__BelongsToAssignment_5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7063:2: rule__Speedlimit__BelongsToAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__BelongsToAssignment_5_in_rule__Speedlimit__Group__5__Impl13937);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7073:1: rule__Speedlimit__Group__6 : rule__Speedlimit__Group__6__Impl ;
    public final void rule__Speedlimit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7077:1: ( rule__Speedlimit__Group__6__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7078:2: rule__Speedlimit__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group__6__Impl_in_rule__Speedlimit__Group__613967);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7084:1: rule__Speedlimit__Group__6__Impl : ( '}' ) ;
    public final void rule__Speedlimit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7088:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7089:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7089:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7090:1: '}'
            {
             before(grammarAccess.getSpeedlimitAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Speedlimit__Group__6__Impl13995); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7117:1: rule__Speedlimit__Group_3__0 : rule__Speedlimit__Group_3__0__Impl rule__Speedlimit__Group_3__1 ;
    public final void rule__Speedlimit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7121:1: ( rule__Speedlimit__Group_3__0__Impl rule__Speedlimit__Group_3__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7122:2: rule__Speedlimit__Group_3__0__Impl rule__Speedlimit__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group_3__0__Impl_in_rule__Speedlimit__Group_3__014040);
            rule__Speedlimit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group_3__1_in_rule__Speedlimit__Group_3__014043);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7129:1: rule__Speedlimit__Group_3__0__Impl : ( 'Speed' ) ;
    public final void rule__Speedlimit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7133:1: ( ( 'Speed' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7134:1: ( 'Speed' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7134:1: ( 'Speed' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7135:1: 'Speed'
            {
             before(grammarAccess.getSpeedlimitAccess().getSpeedKeyword_3_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Speedlimit__Group_3__0__Impl14071); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7148:1: rule__Speedlimit__Group_3__1 : rule__Speedlimit__Group_3__1__Impl ;
    public final void rule__Speedlimit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7152:1: ( rule__Speedlimit__Group_3__1__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7153:2: rule__Speedlimit__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__Group_3__1__Impl_in_rule__Speedlimit__Group_3__114102);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7159:1: rule__Speedlimit__Group_3__1__Impl : ( ( rule__Speedlimit__SpeedAssignment_3_1 ) ) ;
    public final void rule__Speedlimit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7163:1: ( ( ( rule__Speedlimit__SpeedAssignment_3_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7164:1: ( ( rule__Speedlimit__SpeedAssignment_3_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7164:1: ( ( rule__Speedlimit__SpeedAssignment_3_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7165:1: ( rule__Speedlimit__SpeedAssignment_3_1 )
            {
             before(grammarAccess.getSpeedlimitAccess().getSpeedAssignment_3_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7166:1: ( rule__Speedlimit__SpeedAssignment_3_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7166:2: rule__Speedlimit__SpeedAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Speedlimit__SpeedAssignment_3_1_in_rule__Speedlimit__Group_3__1__Impl14129);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7180:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7184:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7185:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__014163);
            rule__Stop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__014166);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7192:1: rule__Stop__Group__0__Impl : ( 'Stop' ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7196:1: ( ( 'Stop' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7197:1: ( 'Stop' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7197:1: ( 'Stop' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7198:1: 'Stop'
            {
             before(grammarAccess.getStopAccess().getStopKeyword_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Stop__Group__0__Impl14194); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7211:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl rule__Stop__Group__2 ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7215:1: ( rule__Stop__Group__1__Impl rule__Stop__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7216:2: rule__Stop__Group__1__Impl rule__Stop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__114225);
            rule__Stop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__114228);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7223:1: rule__Stop__Group__1__Impl : ( ( rule__Stop__NameAssignment_1 ) ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7227:1: ( ( ( rule__Stop__NameAssignment_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7228:1: ( ( rule__Stop__NameAssignment_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7228:1: ( ( rule__Stop__NameAssignment_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7229:1: ( rule__Stop__NameAssignment_1 )
            {
             before(grammarAccess.getStopAccess().getNameAssignment_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7230:1: ( rule__Stop__NameAssignment_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7230:2: rule__Stop__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__NameAssignment_1_in_rule__Stop__Group__1__Impl14255);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7240:1: rule__Stop__Group__2 : rule__Stop__Group__2__Impl rule__Stop__Group__3 ;
    public final void rule__Stop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7244:1: ( rule__Stop__Group__2__Impl rule__Stop__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7245:2: rule__Stop__Group__2__Impl rule__Stop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__214285);
            rule__Stop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__214288);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7252:1: rule__Stop__Group__2__Impl : ( '{' ) ;
    public final void rule__Stop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7256:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7257:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7257:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7258:1: '{'
            {
             before(grammarAccess.getStopAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Stop__Group__2__Impl14316); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7271:1: rule__Stop__Group__3 : rule__Stop__Group__3__Impl rule__Stop__Group__4 ;
    public final void rule__Stop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7275:1: ( rule__Stop__Group__3__Impl rule__Stop__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7276:2: rule__Stop__Group__3__Impl rule__Stop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__314347);
            rule__Stop__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__4_in_rule__Stop__Group__314350);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7283:1: rule__Stop__Group__3__Impl : ( 'belongsTo' ) ;
    public final void rule__Stop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7287:1: ( ( 'belongsTo' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7288:1: ( 'belongsTo' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7288:1: ( 'belongsTo' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7289:1: 'belongsTo'
            {
             before(grammarAccess.getStopAccess().getBelongsToKeyword_3()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Stop__Group__3__Impl14378); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7302:1: rule__Stop__Group__4 : rule__Stop__Group__4__Impl rule__Stop__Group__5 ;
    public final void rule__Stop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7306:1: ( rule__Stop__Group__4__Impl rule__Stop__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7307:2: rule__Stop__Group__4__Impl rule__Stop__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__4__Impl_in_rule__Stop__Group__414409);
            rule__Stop__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__5_in_rule__Stop__Group__414412);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7314:1: rule__Stop__Group__4__Impl : ( ( rule__Stop__BelongsToAssignment_4 ) ) ;
    public final void rule__Stop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7318:1: ( ( ( rule__Stop__BelongsToAssignment_4 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7319:1: ( ( rule__Stop__BelongsToAssignment_4 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7319:1: ( ( rule__Stop__BelongsToAssignment_4 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7320:1: ( rule__Stop__BelongsToAssignment_4 )
            {
             before(grammarAccess.getStopAccess().getBelongsToAssignment_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7321:1: ( rule__Stop__BelongsToAssignment_4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7321:2: rule__Stop__BelongsToAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__BelongsToAssignment_4_in_rule__Stop__Group__4__Impl14439);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7331:1: rule__Stop__Group__5 : rule__Stop__Group__5__Impl ;
    public final void rule__Stop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7335:1: ( rule__Stop__Group__5__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7336:2: rule__Stop__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__5__Impl_in_rule__Stop__Group__514469);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7342:1: rule__Stop__Group__5__Impl : ( '}' ) ;
    public final void rule__Stop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7346:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7347:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7347:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7348:1: '}'
            {
             before(grammarAccess.getStopAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Stop__Group__5__Impl14497); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7373:1: rule__Yield__Group__0 : rule__Yield__Group__0__Impl rule__Yield__Group__1 ;
    public final void rule__Yield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7377:1: ( rule__Yield__Group__0__Impl rule__Yield__Group__1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7378:2: rule__Yield__Group__0__Impl rule__Yield__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__0__Impl_in_rule__Yield__Group__014540);
            rule__Yield__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__1_in_rule__Yield__Group__014543);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7385:1: rule__Yield__Group__0__Impl : ( 'Yield' ) ;
    public final void rule__Yield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7389:1: ( ( 'Yield' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7390:1: ( 'Yield' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7390:1: ( 'Yield' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7391:1: 'Yield'
            {
             before(grammarAccess.getYieldAccess().getYieldKeyword_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Yield__Group__0__Impl14571); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7404:1: rule__Yield__Group__1 : rule__Yield__Group__1__Impl rule__Yield__Group__2 ;
    public final void rule__Yield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7408:1: ( rule__Yield__Group__1__Impl rule__Yield__Group__2 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7409:2: rule__Yield__Group__1__Impl rule__Yield__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__1__Impl_in_rule__Yield__Group__114602);
            rule__Yield__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__2_in_rule__Yield__Group__114605);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7416:1: rule__Yield__Group__1__Impl : ( ( rule__Yield__NameAssignment_1 ) ) ;
    public final void rule__Yield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7420:1: ( ( ( rule__Yield__NameAssignment_1 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7421:1: ( ( rule__Yield__NameAssignment_1 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7421:1: ( ( rule__Yield__NameAssignment_1 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7422:1: ( rule__Yield__NameAssignment_1 )
            {
             before(grammarAccess.getYieldAccess().getNameAssignment_1()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7423:1: ( rule__Yield__NameAssignment_1 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7423:2: rule__Yield__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__NameAssignment_1_in_rule__Yield__Group__1__Impl14632);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7433:1: rule__Yield__Group__2 : rule__Yield__Group__2__Impl rule__Yield__Group__3 ;
    public final void rule__Yield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7437:1: ( rule__Yield__Group__2__Impl rule__Yield__Group__3 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7438:2: rule__Yield__Group__2__Impl rule__Yield__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__2__Impl_in_rule__Yield__Group__214662);
            rule__Yield__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__3_in_rule__Yield__Group__214665);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7445:1: rule__Yield__Group__2__Impl : ( '{' ) ;
    public final void rule__Yield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7449:1: ( ( '{' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7450:1: ( '{' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7450:1: ( '{' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7451:1: '{'
            {
             before(grammarAccess.getYieldAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Yield__Group__2__Impl14693); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7464:1: rule__Yield__Group__3 : rule__Yield__Group__3__Impl rule__Yield__Group__4 ;
    public final void rule__Yield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7468:1: ( rule__Yield__Group__3__Impl rule__Yield__Group__4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7469:2: rule__Yield__Group__3__Impl rule__Yield__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__3__Impl_in_rule__Yield__Group__314724);
            rule__Yield__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__4_in_rule__Yield__Group__314727);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7476:1: rule__Yield__Group__3__Impl : ( 'belongsTo' ) ;
    public final void rule__Yield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7480:1: ( ( 'belongsTo' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7481:1: ( 'belongsTo' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7481:1: ( 'belongsTo' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7482:1: 'belongsTo'
            {
             before(grammarAccess.getYieldAccess().getBelongsToKeyword_3()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Yield__Group__3__Impl14755); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7495:1: rule__Yield__Group__4 : rule__Yield__Group__4__Impl rule__Yield__Group__5 ;
    public final void rule__Yield__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7499:1: ( rule__Yield__Group__4__Impl rule__Yield__Group__5 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7500:2: rule__Yield__Group__4__Impl rule__Yield__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__4__Impl_in_rule__Yield__Group__414786);
            rule__Yield__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__5_in_rule__Yield__Group__414789);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7507:1: rule__Yield__Group__4__Impl : ( ( rule__Yield__BelongsToAssignment_4 ) ) ;
    public final void rule__Yield__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7511:1: ( ( ( rule__Yield__BelongsToAssignment_4 ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7512:1: ( ( rule__Yield__BelongsToAssignment_4 ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7512:1: ( ( rule__Yield__BelongsToAssignment_4 ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7513:1: ( rule__Yield__BelongsToAssignment_4 )
            {
             before(grammarAccess.getYieldAccess().getBelongsToAssignment_4()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7514:1: ( rule__Yield__BelongsToAssignment_4 )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7514:2: rule__Yield__BelongsToAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__BelongsToAssignment_4_in_rule__Yield__Group__4__Impl14816);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7524:1: rule__Yield__Group__5 : rule__Yield__Group__5__Impl ;
    public final void rule__Yield__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7528:1: ( rule__Yield__Group__5__Impl )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7529:2: rule__Yield__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Yield__Group__5__Impl_in_rule__Yield__Group__514846);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7535:1: rule__Yield__Group__5__Impl : ( '}' ) ;
    public final void rule__Yield__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7539:1: ( ( '}' ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7540:1: ( '}' )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7540:1: ( '}' )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7541:1: '}'
            {
             before(grammarAccess.getYieldAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Yield__Group__5__Impl14874); 
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7567:1: rule__Highway__InitSegmentsAssignment_3_2 : ( ruleSegment ) ;
    public final void rule__Highway__InitSegmentsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7571:1: ( ( ruleSegment ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7572:1: ( ruleSegment )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7572:1: ( ruleSegment )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7573:1: ruleSegment
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSegment_in_rule__Highway__InitSegmentsAssignment_3_214922);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7582:1: rule__Highway__InitSegmentsAssignment_3_3_1 : ( ruleSegment ) ;
    public final void rule__Highway__InitSegmentsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7586:1: ( ( ruleSegment ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7587:1: ( ruleSegment )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7587:1: ( ruleSegment )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7588:1: ruleSegment
            {
             before(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSegment_in_rule__Highway__InitSegmentsAssignment_3_3_114953);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7597:1: rule__Highway__InitNodesAssignment_4_2 : ( ruleNode ) ;
    public final void rule__Highway__InitNodesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7601:1: ( ( ruleNode ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7602:1: ( ruleNode )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7602:1: ( ruleNode )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7603:1: ruleNode
            {
             before(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_rule__Highway__InitNodesAssignment_4_214984);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7612:1: rule__Highway__InitNodesAssignment_4_3_1 : ( ruleNode ) ;
    public final void rule__Highway__InitNodesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7616:1: ( ( ruleNode ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7617:1: ( ruleNode )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7617:1: ( ruleNode )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7618:1: ruleNode
            {
             before(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_rule__Highway__InitNodesAssignment_4_3_115015);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7627:1: rule__Highway__InitCarsAssignment_5_2 : ( ruleCar ) ;
    public final void rule__Highway__InitCarsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7631:1: ( ( ruleCar ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7632:1: ( ruleCar )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7632:1: ( ruleCar )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7633:1: ruleCar
            {
             before(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCar_in_rule__Highway__InitCarsAssignment_5_215046);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7642:1: rule__Highway__InitCarsAssignment_5_3_1 : ( ruleCar ) ;
    public final void rule__Highway__InitCarsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7646:1: ( ( ruleCar ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7647:1: ( ruleCar )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7647:1: ( ruleCar )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7648:1: ruleCar
            {
             before(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCar_in_rule__Highway__InitCarsAssignment_5_3_115077);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7657:1: rule__Highway__InitSemaphoreAssignment_6_2 : ( ruleSemaphore ) ;
    public final void rule__Highway__InitSemaphoreAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7661:1: ( ( ruleSemaphore ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7662:1: ( ruleSemaphore )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7662:1: ( ruleSemaphore )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7663:1: ruleSemaphore
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreSemaphoreParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemaphore_in_rule__Highway__InitSemaphoreAssignment_6_215108);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7672:1: rule__Highway__InitSemaphoreAssignment_6_3_1 : ( ruleSemaphore ) ;
    public final void rule__Highway__InitSemaphoreAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7676:1: ( ( ruleSemaphore ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7677:1: ( ruleSemaphore )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7677:1: ( ruleSemaphore )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7678:1: ruleSemaphore
            {
             before(grammarAccess.getHighwayAccess().getInitSemaphoreSemaphoreParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemaphore_in_rule__Highway__InitSemaphoreAssignment_6_3_115139);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7687:1: rule__Highway__InitSignalAssignment_7_2 : ( ruleSignal ) ;
    public final void rule__Highway__InitSignalAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7691:1: ( ( ruleSignal ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7692:1: ( ruleSignal )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7692:1: ( ruleSignal )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7693:1: ruleSignal
            {
             before(grammarAccess.getHighwayAccess().getInitSignalSignalParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_rule__Highway__InitSignalAssignment_7_215170);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7702:1: rule__Highway__InitSignalAssignment_7_3_1 : ( ruleSignal ) ;
    public final void rule__Highway__InitSignalAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7706:1: ( ( ruleSignal ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7707:1: ( ruleSignal )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7707:1: ( ruleSignal )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7708:1: ruleSignal
            {
             before(grammarAccess.getHighwayAccess().getInitSignalSignalParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_rule__Highway__InitSignalAssignment_7_3_115201);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7717:1: rule__Node_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Node_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7721:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7722:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7722:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7723:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__NameAssignment_215232);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7732:1: rule__Node_Impl__HasStartsAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__HasStartsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7736:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7737:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7737:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7738:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_6_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7739:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7740:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsSegmentEStringParserRuleCall_6_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__HasStartsAssignment_615267);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7751:1: rule__Node_Impl__HasStartsAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__HasStartsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7755:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7756:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7756:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7757:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_7_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7758:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7759:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getHasStartsSegmentEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__HasStartsAssignment_7_115306);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7770:1: rule__Node_Impl__HasEndsAssignment_11 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__HasEndsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7774:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7775:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7775:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7776:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_11_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7777:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7778:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsSegmentEStringParserRuleCall_11_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__HasEndsAssignment_1115345);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7789:1: rule__Node_Impl__HasEndsAssignment_12_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__HasEndsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7793:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7794:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7794:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7795:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_12_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7796:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7797:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getHasEndsSegmentEStringParserRuleCall_12_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__HasEndsAssignment_12_115384);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7808:1: rule__Node_Impl__SemaphoreAssignment_14_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__SemaphoreAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7812:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7813:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7813:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7814:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getSemaphoreSemaphoreCrossReference_14_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7815:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7816:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getSemaphoreSemaphoreEStringParserRuleCall_14_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__SemaphoreAssignment_14_115423);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7827:1: rule__Node_Impl__SignalsAssignment_15_2 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__SignalsAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7831:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7832:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7832:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7833:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_15_2_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7834:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7835:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsSignalEStringParserRuleCall_15_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__SignalsAssignment_15_215462);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7846:1: rule__Node_Impl__SignalsAssignment_15_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__SignalsAssignment_15_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7850:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7851:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7851:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7852:1: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_15_3_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7853:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7854:1: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getSignalsSignalEStringParserRuleCall_15_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Node_Impl__SignalsAssignment_15_3_115501);
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


    // $ANTLR start "rule__Car__TimeInAssignment_3_1"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7865:1: rule__Car__TimeInAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__Car__TimeInAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7869:1: ( ( ruleEDate ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7870:1: ( ruleEDate )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7870:1: ( ruleEDate )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7871:1: ruleEDate
            {
             before(grammarAccess.getCarAccess().getTimeInEDateParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDate_in_rule__Car__TimeInAssignment_3_115536);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7880:1: rule__Car__TimeOutAssignment_4_1 : ( ruleEDate ) ;
    public final void rule__Car__TimeOutAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7884:1: ( ( ruleEDate ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7885:1: ( ruleEDate )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7885:1: ( ruleEDate )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7886:1: ruleEDate
            {
             before(grammarAccess.getCarAccess().getTimeOutEDateParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDate_in_rule__Car__TimeOutAssignment_4_115567);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7895:1: rule__Car__IsInSegmentAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Car__IsInSegmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7899:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7900:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7900:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7901:1: ( ruleEString )
            {
             before(grammarAccess.getCarAccess().getIsInSegmentSegmentCrossReference_5_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7902:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7903:1: ruleEString
            {
             before(grammarAccess.getCarAccess().getIsInSegmentSegmentEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Car__IsInSegmentAssignment_5_115602);
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


    // $ANTLR start "rule__Segment__NameAssignment_2"
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7914:1: rule__Segment__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Segment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7918:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7919:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7919:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7920:1: ruleEString
            {
             before(grammarAccess.getSegmentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Segment__NameAssignment_215637);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7929:1: rule__Segment__NumLanesAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Segment__NumLanesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7933:1: ( ( ruleEInt ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7934:1: ( ruleEInt )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7934:1: ( ruleEInt )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7935:1: ruleEInt
            {
             before(grammarAccess.getSegmentAccess().getNumLanesEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Segment__NumLanesAssignment_4_115668);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7944:1: rule__Segment__LengthAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Segment__LengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7948:1: ( ( ruleEInt ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7949:1: ( ruleEInt )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7949:1: ( ruleEInt )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7950:1: ruleEInt
            {
             before(grammarAccess.getSegmentAccess().getLengthEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Segment__LengthAssignment_5_115699);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7959:1: rule__Segment__HasCarsAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__Segment__HasCarsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7963:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7964:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7964:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7965:1: ( ruleEString )
            {
             before(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_6_2_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7966:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7967:1: ruleEString
            {
             before(grammarAccess.getSegmentAccess().getHasCarsCarEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Segment__HasCarsAssignment_6_215734);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7978:1: rule__Segment__HasCarsAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Segment__HasCarsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7982:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7983:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7983:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7984:1: ( ruleEString )
            {
             before(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_6_3_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7985:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7986:1: ruleEString
            {
             before(grammarAccess.getSegmentAccess().getHasCarsCarEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Segment__HasCarsAssignment_6_3_115773);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:7997:1: rule__Semaphore__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Semaphore__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8001:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8002:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8002:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8003:1: ruleEString
            {
             before(grammarAccess.getSemaphoreAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Semaphore__NameAssignment_215808);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8012:1: rule__Semaphore__CanGoAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__Semaphore__CanGoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8016:1: ( ( ruleEBoolean ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8017:1: ( ruleEBoolean )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8017:1: ( ruleEBoolean )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8018:1: ruleEBoolean
            {
             before(grammarAccess.getSemaphoreAccess().getCanGoEBooleanParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__Semaphore__CanGoAssignment_4_115839);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8027:1: rule__Semaphore__SecondsRedAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Semaphore__SecondsRedAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8031:1: ( ( ruleEInt ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8032:1: ( ruleEInt )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8032:1: ( ruleEInt )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8033:1: ruleEInt
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsRedEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Semaphore__SecondsRedAssignment_5_115870);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8042:1: rule__Semaphore__SecondsGreenAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Semaphore__SecondsGreenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8046:1: ( ( ruleEInt ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8047:1: ( ruleEInt )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8047:1: ( ruleEInt )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8048:1: ruleEInt
            {
             before(grammarAccess.getSemaphoreAccess().getSecondsGreenEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Semaphore__SecondsGreenAssignment_6_115901);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8057:1: rule__Semaphore__BelongsToAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Semaphore__BelongsToAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8061:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8062:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8062:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8063:1: ( ruleEString )
            {
             before(grammarAccess.getSemaphoreAccess().getBelongsToNodeCrossReference_8_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8064:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8065:1: ruleEString
            {
             before(grammarAccess.getSemaphoreAccess().getBelongsToNodeEStringParserRuleCall_8_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Semaphore__BelongsToAssignment_815936);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8076:1: rule__Signal_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Signal_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8080:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8081:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8081:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8082:1: ruleEString
            {
             before(grammarAccess.getSignal_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Signal_Impl__NameAssignment_215971);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8091:1: rule__Signal_Impl__BelongsToAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Signal_Impl__BelongsToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8095:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8096:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8096:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8097:1: ( ruleEString )
            {
             before(grammarAccess.getSignal_ImplAccess().getBelongsToNodeCrossReference_5_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8098:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8099:1: ruleEString
            {
             before(grammarAccess.getSignal_ImplAccess().getBelongsToNodeEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Signal_Impl__BelongsToAssignment_516006);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8110:1: rule__Extractor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Extractor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8114:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8115:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8115:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8116:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__NameAssignment_216041);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8125:1: rule__Extractor__HasStartsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__HasStartsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8129:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8130:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8130:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8131:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_4_2_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8132:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8133:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getHasStartsSegmentEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__HasStartsAssignment_4_216076);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8144:1: rule__Extractor__HasStartsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__HasStartsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8148:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8149:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8149:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8150:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_4_3_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8151:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8152:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getHasStartsSegmentEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__HasStartsAssignment_4_3_116115);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8163:1: rule__Extractor__HasEndsAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__HasEndsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8167:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8168:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8168:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8169:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_7_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8170:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8171:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getHasEndsSegmentEStringParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__HasEndsAssignment_716154);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8182:1: rule__Extractor__HasEndsAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__HasEndsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8186:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8187:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8187:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8188:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_8_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8189:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8190:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getHasEndsSegmentEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__HasEndsAssignment_8_116193);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8201:1: rule__Extractor__SemaphoreAssignment_10_1 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__SemaphoreAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8205:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8206:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8206:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8207:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getSemaphoreSemaphoreCrossReference_10_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8208:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8209:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getSemaphoreSemaphoreEStringParserRuleCall_10_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__SemaphoreAssignment_10_116232);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8220:1: rule__Extractor__SignalsAssignment_11_2 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__SignalsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8224:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8225:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8225:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8226:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_11_2_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8227:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8228:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getSignalsSignalEStringParserRuleCall_11_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__SignalsAssignment_11_216271);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8239:1: rule__Extractor__SignalsAssignment_11_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Extractor__SignalsAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8243:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8244:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8244:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8245:1: ( ruleEString )
            {
             before(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_11_3_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8246:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8247:1: ruleEString
            {
             before(grammarAccess.getExtractorAccess().getSignalsSignalEStringParserRuleCall_11_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Extractor__SignalsAssignment_11_3_116310);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8258:1: rule__Injector__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Injector__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8262:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8263:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8263:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8264:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__NameAssignment_216345);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8273:1: rule__Injector__CarsPerHourAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Injector__CarsPerHourAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8277:1: ( ( ruleEInt ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8278:1: ( ruleEInt )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8278:1: ( ruleEInt )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8279:1: ruleEInt
            {
             before(grammarAccess.getInjectorAccess().getCarsPerHourEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Injector__CarsPerHourAssignment_4_116376);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8288:1: rule__Injector__HasStartsAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Injector__HasStartsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8292:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8293:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8293:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8294:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_7_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8295:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8296:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getHasStartsSegmentEStringParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__HasStartsAssignment_716411);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8307:1: rule__Injector__HasStartsAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Injector__HasStartsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8311:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8312:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8312:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8313:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_8_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8314:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8315:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getHasStartsSegmentEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__HasStartsAssignment_8_116450);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8326:1: rule__Injector__HasEndsAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__Injector__HasEndsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8330:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8331:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8331:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8332:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_10_2_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8333:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8334:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getHasEndsSegmentEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__HasEndsAssignment_10_216489);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8345:1: rule__Injector__HasEndsAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Injector__HasEndsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8349:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8350:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8350:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8351:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_10_3_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8352:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8353:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getHasEndsSegmentEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__HasEndsAssignment_10_3_116528);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8364:1: rule__Injector__SemaphoreAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__Injector__SemaphoreAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8368:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8369:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8369:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8370:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getSemaphoreSemaphoreCrossReference_11_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8371:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8372:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getSemaphoreSemaphoreEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__SemaphoreAssignment_11_116567);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8383:1: rule__Injector__SignalsAssignment_12_2 : ( ( ruleEString ) ) ;
    public final void rule__Injector__SignalsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8387:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8388:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8388:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8389:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_12_2_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8390:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8391:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getSignalsSignalEStringParserRuleCall_12_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__SignalsAssignment_12_216606);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8402:1: rule__Injector__SignalsAssignment_12_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Injector__SignalsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8406:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8407:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8407:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8408:1: ( ruleEString )
            {
             before(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_12_3_1_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8409:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8410:1: ruleEString
            {
             before(grammarAccess.getInjectorAccess().getSignalsSignalEStringParserRuleCall_12_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Injector__SignalsAssignment_12_3_116645);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8421:1: rule__Speedlimit__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Speedlimit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8425:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8426:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8426:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8427:1: ruleEString
            {
             before(grammarAccess.getSpeedlimitAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Speedlimit__NameAssignment_116680);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8436:1: rule__Speedlimit__SpeedAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Speedlimit__SpeedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8440:1: ( ( ruleEInt ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8441:1: ( ruleEInt )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8441:1: ( ruleEInt )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8442:1: ruleEInt
            {
             before(grammarAccess.getSpeedlimitAccess().getSpeedEIntParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Speedlimit__SpeedAssignment_3_116711);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8451:1: rule__Speedlimit__BelongsToAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Speedlimit__BelongsToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8455:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8456:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8456:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8457:1: ( ruleEString )
            {
             before(grammarAccess.getSpeedlimitAccess().getBelongsToNodeCrossReference_5_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8458:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8459:1: ruleEString
            {
             before(grammarAccess.getSpeedlimitAccess().getBelongsToNodeEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Speedlimit__BelongsToAssignment_516746);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8470:1: rule__Stop__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Stop__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8474:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8475:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8475:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8476:1: ruleEString
            {
             before(grammarAccess.getStopAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Stop__NameAssignment_116781);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8485:1: rule__Stop__BelongsToAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Stop__BelongsToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8489:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8490:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8490:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8491:1: ( ruleEString )
            {
             before(grammarAccess.getStopAccess().getBelongsToNodeCrossReference_4_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8492:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8493:1: ruleEString
            {
             before(grammarAccess.getStopAccess().getBelongsToNodeEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Stop__BelongsToAssignment_416816);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8504:1: rule__Yield__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Yield__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8508:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8509:1: ( ruleEString )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8509:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8510:1: ruleEString
            {
             before(grammarAccess.getYieldAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Yield__NameAssignment_116851);
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
    // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8519:1: rule__Yield__BelongsToAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Yield__BelongsToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8523:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8524:1: ( ( ruleEString ) )
            {
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8524:1: ( ( ruleEString ) )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8525:1: ( ruleEString )
            {
             before(grammarAccess.getYieldAccess().getBelongsToNodeCrossReference_4_0()); 
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8526:1: ( ruleEString )
            // ../org.xtext.Highway.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalHighway.g:8527:1: ruleEString
            {
             before(grammarAccess.getYieldAccess().getBelongsToNodeEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Yield__BelongsToAssignment_416886);
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
        public static final BitSet FOLLOW_11_in_ruleEDate815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpeedlimit_in_entryRuleSpeedlimit903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpeedlimit910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__0_in_ruleSpeedlimit936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_entryRuleStop963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStop970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0_in_ruleStop996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYield_in_entryRuleYield1023 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleYield1030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__0_in_ruleYield1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_Impl_in_rule__Node__Alternatives1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractor_in_rule__Node__Alternatives1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInjector_in_rule__Node__Alternatives1126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_Impl_in_rule__Signal__Alternatives1158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpeedlimit_in_rule__Signal__Alternatives1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_rule__Signal__Alternatives1192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYield_in_rule__Signal__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives1291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EBoolean__Alternatives1311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__0__Impl_in_rule__Highway__Group__01343 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Highway__Group__1_in_rule__Highway__Group__01346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__1__Impl_in_rule__Highway__Group__11404 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Highway__Group__2_in_rule__Highway__Group__11407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Highway__Group__1__Impl1435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__2__Impl_in_rule__Highway__Group__21466 = new BitSet(new long[]{0x00000000007B0000L});
        public static final BitSet FOLLOW_rule__Highway__Group__3_in_rule__Highway__Group__21469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group__2__Impl1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__3__Impl_in_rule__Highway__Group__31528 = new BitSet(new long[]{0x00000000007B0000L});
        public static final BitSet FOLLOW_rule__Highway__Group__4_in_rule__Highway__Group__31531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__0_in_rule__Highway__Group__3__Impl1558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__4__Impl_in_rule__Highway__Group__41589 = new BitSet(new long[]{0x00000000007B0000L});
        public static final BitSet FOLLOW_rule__Highway__Group__5_in_rule__Highway__Group__41592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__0_in_rule__Highway__Group__4__Impl1619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__5__Impl_in_rule__Highway__Group__51650 = new BitSet(new long[]{0x00000000007B0000L});
        public static final BitSet FOLLOW_rule__Highway__Group__6_in_rule__Highway__Group__51653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__0_in_rule__Highway__Group__5__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__6__Impl_in_rule__Highway__Group__61711 = new BitSet(new long[]{0x00000000007B0000L});
        public static final BitSet FOLLOW_rule__Highway__Group__7_in_rule__Highway__Group__61714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__0_in_rule__Highway__Group__6__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__7__Impl_in_rule__Highway__Group__71772 = new BitSet(new long[]{0x00000000007B0000L});
        public static final BitSet FOLLOW_rule__Highway__Group__8_in_rule__Highway__Group__71775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__0_in_rule__Highway__Group__7__Impl1802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group__8__Impl_in_rule__Highway__Group__81833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Highway__Group__8__Impl1861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__0__Impl_in_rule__Highway__Group_3__01910 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__1_in_rule__Highway__Group_3__01913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Highway__Group_3__0__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__1__Impl_in_rule__Highway__Group_3__11972 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__2_in_rule__Highway__Group_3__11975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_3__1__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__2__Impl_in_rule__Highway__Group_3__22034 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__3_in_rule__Highway__Group_3__22037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSegmentsAssignment_3_2_in_rule__Highway__Group_3__2__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__3__Impl_in_rule__Highway__Group_3__32094 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__4_in_rule__Highway__Group_3__32097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3_3__0_in_rule__Highway__Group_3__3__Impl2124 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3__4__Impl_in_rule__Highway__Group_3__42155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Highway__Group_3__4__Impl2183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3_3__0__Impl_in_rule__Highway__Group_3_3__02224 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_3_3__1_in_rule__Highway__Group_3_3__02227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Highway__Group_3_3__0__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_3_3__1__Impl_in_rule__Highway__Group_3_3__12286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSegmentsAssignment_3_3_1_in_rule__Highway__Group_3_3__1__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__0__Impl_in_rule__Highway__Group_4__02347 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__1_in_rule__Highway__Group_4__02350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Highway__Group_4__0__Impl2378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__1__Impl_in_rule__Highway__Group_4__12409 = new BitSet(new long[]{0x00000C0000800000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__2_in_rule__Highway__Group_4__12412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_4__1__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__2__Impl_in_rule__Highway__Group_4__22471 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__3_in_rule__Highway__Group_4__22474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitNodesAssignment_4_2_in_rule__Highway__Group_4__2__Impl2501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__3__Impl_in_rule__Highway__Group_4__32531 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__4_in_rule__Highway__Group_4__32534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4_3__0_in_rule__Highway__Group_4__3__Impl2561 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4__4__Impl_in_rule__Highway__Group_4__42592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Highway__Group_4__4__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4_3__0__Impl_in_rule__Highway__Group_4_3__02661 = new BitSet(new long[]{0x00000C0000800000L});
        public static final BitSet FOLLOW_rule__Highway__Group_4_3__1_in_rule__Highway__Group_4_3__02664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Highway__Group_4_3__0__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_4_3__1__Impl_in_rule__Highway__Group_4_3__12723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitNodesAssignment_4_3_1_in_rule__Highway__Group_4_3__1__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__0__Impl_in_rule__Highway__Group_5__02784 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__1_in_rule__Highway__Group_5__02787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Highway__Group_5__0__Impl2815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__1__Impl_in_rule__Highway__Group_5__12846 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__2_in_rule__Highway__Group_5__12849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_5__1__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__2__Impl_in_rule__Highway__Group_5__22908 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__3_in_rule__Highway__Group_5__22911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitCarsAssignment_5_2_in_rule__Highway__Group_5__2__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__3__Impl_in_rule__Highway__Group_5__32968 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__4_in_rule__Highway__Group_5__32971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5_3__0_in_rule__Highway__Group_5__3__Impl2998 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5__4__Impl_in_rule__Highway__Group_5__43029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Highway__Group_5__4__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5_3__0__Impl_in_rule__Highway__Group_5_3__03098 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Highway__Group_5_3__1_in_rule__Highway__Group_5_3__03101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Highway__Group_5_3__0__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_5_3__1__Impl_in_rule__Highway__Group_5_3__13160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitCarsAssignment_5_3_1_in_rule__Highway__Group_5_3__1__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__0__Impl_in_rule__Highway__Group_6__03221 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__1_in_rule__Highway__Group_6__03224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Highway__Group_6__0__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__1__Impl_in_rule__Highway__Group_6__13283 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__2_in_rule__Highway__Group_6__13286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_6__1__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__2__Impl_in_rule__Highway__Group_6__23345 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__3_in_rule__Highway__Group_6__23348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSemaphoreAssignment_6_2_in_rule__Highway__Group_6__2__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__3__Impl_in_rule__Highway__Group_6__33405 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__4_in_rule__Highway__Group_6__33408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6_3__0_in_rule__Highway__Group_6__3__Impl3435 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6__4__Impl_in_rule__Highway__Group_6__43466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Highway__Group_6__4__Impl3494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6_3__0__Impl_in_rule__Highway__Group_6_3__03535 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Highway__Group_6_3__1_in_rule__Highway__Group_6_3__03538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Highway__Group_6_3__0__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_6_3__1__Impl_in_rule__Highway__Group_6_3__13597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSemaphoreAssignment_6_3_1_in_rule__Highway__Group_6_3__1__Impl3624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__0__Impl_in_rule__Highway__Group_7__03658 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__1_in_rule__Highway__Group_7__03661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Highway__Group_7__0__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__1__Impl_in_rule__Highway__Group_7__13720 = new BitSet(new long[]{0x0003400000400000L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__2_in_rule__Highway__Group_7__13723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Highway__Group_7__1__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__2__Impl_in_rule__Highway__Group_7__23782 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__3_in_rule__Highway__Group_7__23785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSignalAssignment_7_2_in_rule__Highway__Group_7__2__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__3__Impl_in_rule__Highway__Group_7__33842 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__4_in_rule__Highway__Group_7__33845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7_3__0_in_rule__Highway__Group_7__3__Impl3872 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7__4__Impl_in_rule__Highway__Group_7__43903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Highway__Group_7__4__Impl3931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7_3__0__Impl_in_rule__Highway__Group_7_3__03972 = new BitSet(new long[]{0x0003400000400000L});
        public static final BitSet FOLLOW_rule__Highway__Group_7_3__1_in_rule__Highway__Group_7_3__03975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Highway__Group_7_3__0__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__Group_7_3__1__Impl_in_rule__Highway__Group_7_3__14034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Highway__InitSignalAssignment_7_3_1_in_rule__Highway__Group_7_3__1__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__0__Impl_in_rule__Node_Impl__Group__04095 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__1_in_rule__Node_Impl__Group__04098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__1__Impl_in_rule__Node_Impl__Group__14156 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__2_in_rule__Node_Impl__Group__14159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Node_Impl__Group__1__Impl4187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__2__Impl_in_rule__Node_Impl__Group__24218 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__3_in_rule__Node_Impl__Group__24221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__NameAssignment_2_in_rule__Node_Impl__Group__2__Impl4248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__3__Impl_in_rule__Node_Impl__Group__34278 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__4_in_rule__Node_Impl__Group__34281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Node_Impl__Group__3__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__4__Impl_in_rule__Node_Impl__Group__44340 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__5_in_rule__Node_Impl__Group__44343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Node_Impl__Group__4__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__5__Impl_in_rule__Node_Impl__Group__54402 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__6_in_rule__Node_Impl__Group__54405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Node_Impl__Group__5__Impl4433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__6__Impl_in_rule__Node_Impl__Group__64464 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__7_in_rule__Node_Impl__Group__64467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__HasStartsAssignment_6_in_rule__Node_Impl__Group__6__Impl4494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__7__Impl_in_rule__Node_Impl__Group__74524 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__8_in_rule__Node_Impl__Group__74527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_7__0_in_rule__Node_Impl__Group__7__Impl4554 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__8__Impl_in_rule__Node_Impl__Group__84585 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__9_in_rule__Node_Impl__Group__84588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Node_Impl__Group__8__Impl4616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__9__Impl_in_rule__Node_Impl__Group__94647 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__10_in_rule__Node_Impl__Group__94650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Node_Impl__Group__9__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__10__Impl_in_rule__Node_Impl__Group__104709 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__11_in_rule__Node_Impl__Group__104712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Node_Impl__Group__10__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__11__Impl_in_rule__Node_Impl__Group__114771 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__12_in_rule__Node_Impl__Group__114774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__HasEndsAssignment_11_in_rule__Node_Impl__Group__11__Impl4801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__12__Impl_in_rule__Node_Impl__Group__124831 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__13_in_rule__Node_Impl__Group__124834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_12__0_in_rule__Node_Impl__Group__12__Impl4861 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__13__Impl_in_rule__Node_Impl__Group__134892 = new BitSet(new long[]{0x0000000030010000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__14_in_rule__Node_Impl__Group__134895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Node_Impl__Group__13__Impl4923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__14__Impl_in_rule__Node_Impl__Group__144954 = new BitSet(new long[]{0x0000000030010000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__15_in_rule__Node_Impl__Group__144957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__0_in_rule__Node_Impl__Group__14__Impl4984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__15__Impl_in_rule__Node_Impl__Group__155015 = new BitSet(new long[]{0x0000000030010000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__16_in_rule__Node_Impl__Group__155018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__0_in_rule__Node_Impl__Group__15__Impl5045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group__16__Impl_in_rule__Node_Impl__Group__165076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Node_Impl__Group__16__Impl5104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_7__0__Impl_in_rule__Node_Impl__Group_7__05169 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_7__1_in_rule__Node_Impl__Group_7__05172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Node_Impl__Group_7__0__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_7__1__Impl_in_rule__Node_Impl__Group_7__15231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__HasStartsAssignment_7_1_in_rule__Node_Impl__Group_7__1__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_12__0__Impl_in_rule__Node_Impl__Group_12__05292 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_12__1_in_rule__Node_Impl__Group_12__05295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Node_Impl__Group_12__0__Impl5323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_12__1__Impl_in_rule__Node_Impl__Group_12__15354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__HasEndsAssignment_12_1_in_rule__Node_Impl__Group_12__1__Impl5381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__0__Impl_in_rule__Node_Impl__Group_14__05415 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__1_in_rule__Node_Impl__Group_14__05418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Node_Impl__Group_14__0__Impl5446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_14__1__Impl_in_rule__Node_Impl__Group_14__15477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__SemaphoreAssignment_14_1_in_rule__Node_Impl__Group_14__1__Impl5504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__0__Impl_in_rule__Node_Impl__Group_15__05538 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__1_in_rule__Node_Impl__Group_15__05541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Node_Impl__Group_15__0__Impl5569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__1__Impl_in_rule__Node_Impl__Group_15__15600 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__2_in_rule__Node_Impl__Group_15__15603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Node_Impl__Group_15__1__Impl5631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__2__Impl_in_rule__Node_Impl__Group_15__25662 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__3_in_rule__Node_Impl__Group_15__25665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__SignalsAssignment_15_2_in_rule__Node_Impl__Group_15__2__Impl5692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__3__Impl_in_rule__Node_Impl__Group_15__35722 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__4_in_rule__Node_Impl__Group_15__35725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15_3__0_in_rule__Node_Impl__Group_15__3__Impl5752 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15__4__Impl_in_rule__Node_Impl__Group_15__45783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Node_Impl__Group_15__4__Impl5811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15_3__0__Impl_in_rule__Node_Impl__Group_15_3__05852 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15_3__1_in_rule__Node_Impl__Group_15_3__05855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Node_Impl__Group_15_3__0__Impl5883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__Group_15_3__1__Impl_in_rule__Node_Impl__Group_15_3__15914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node_Impl__SignalsAssignment_15_3_1_in_rule__Node_Impl__Group_15_3__1__Impl5941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__0__Impl_in_rule__Car__Group__05975 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Car__Group__1_in_rule__Car__Group__05978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__1__Impl_in_rule__Car__Group__16036 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Car__Group__2_in_rule__Car__Group__16039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Car__Group__1__Impl6067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__2__Impl_in_rule__Car__Group__26098 = new BitSet(new long[]{0x0000000380010000L});
        public static final BitSet FOLLOW_rule__Car__Group__3_in_rule__Car__Group__26101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Car__Group__2__Impl6129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__3__Impl_in_rule__Car__Group__36160 = new BitSet(new long[]{0x0000000380010000L});
        public static final BitSet FOLLOW_rule__Car__Group__4_in_rule__Car__Group__36163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_3__0_in_rule__Car__Group__3__Impl6190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__4__Impl_in_rule__Car__Group__46221 = new BitSet(new long[]{0x0000000380010000L});
        public static final BitSet FOLLOW_rule__Car__Group__5_in_rule__Car__Group__46224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_4__0_in_rule__Car__Group__4__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__5__Impl_in_rule__Car__Group__56282 = new BitSet(new long[]{0x0000000380010000L});
        public static final BitSet FOLLOW_rule__Car__Group__6_in_rule__Car__Group__56285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_5__0_in_rule__Car__Group__5__Impl6312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group__6__Impl_in_rule__Car__Group__66343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Car__Group__6__Impl6371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_3__0__Impl_in_rule__Car__Group_3__06416 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Car__Group_3__1_in_rule__Car__Group_3__06419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Car__Group_3__0__Impl6447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_3__1__Impl_in_rule__Car__Group_3__16478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__TimeInAssignment_3_1_in_rule__Car__Group_3__1__Impl6505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_4__0__Impl_in_rule__Car__Group_4__06539 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Car__Group_4__1_in_rule__Car__Group_4__06542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Car__Group_4__0__Impl6570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_4__1__Impl_in_rule__Car__Group_4__16601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__TimeOutAssignment_4_1_in_rule__Car__Group_4__1__Impl6628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_5__0__Impl_in_rule__Car__Group_5__06662 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Car__Group_5__1_in_rule__Car__Group_5__06665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Car__Group_5__0__Impl6693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__Group_5__1__Impl_in_rule__Car__Group_5__16724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Car__IsInSegmentAssignment_5_1_in_rule__Car__Group_5__1__Impl6751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__0__Impl_in_rule__Segment__Group__06785 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Segment__Group__1_in_rule__Segment__Group__06788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__1__Impl_in_rule__Segment__Group__16846 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Segment__Group__2_in_rule__Segment__Group__16849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Segment__Group__1__Impl6877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__2__Impl_in_rule__Segment__Group__26908 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Segment__Group__3_in_rule__Segment__Group__26911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__NameAssignment_2_in_rule__Segment__Group__2__Impl6938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__3__Impl_in_rule__Segment__Group__36968 = new BitSet(new long[]{0x0000003800010000L});
        public static final BitSet FOLLOW_rule__Segment__Group__4_in_rule__Segment__Group__36971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Segment__Group__3__Impl6999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__4__Impl_in_rule__Segment__Group__47030 = new BitSet(new long[]{0x0000003800010000L});
        public static final BitSet FOLLOW_rule__Segment__Group__5_in_rule__Segment__Group__47033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_4__0_in_rule__Segment__Group__4__Impl7060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__5__Impl_in_rule__Segment__Group__57091 = new BitSet(new long[]{0x0000003800010000L});
        public static final BitSet FOLLOW_rule__Segment__Group__6_in_rule__Segment__Group__57094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__0_in_rule__Segment__Group__5__Impl7121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__6__Impl_in_rule__Segment__Group__67152 = new BitSet(new long[]{0x0000003800010000L});
        public static final BitSet FOLLOW_rule__Segment__Group__7_in_rule__Segment__Group__67155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__0_in_rule__Segment__Group__6__Impl7182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group__7__Impl_in_rule__Segment__Group__77213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Segment__Group__7__Impl7241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_4__0__Impl_in_rule__Segment__Group_4__07288 = new BitSet(new long[]{0x0000200000000040L});
        public static final BitSet FOLLOW_rule__Segment__Group_4__1_in_rule__Segment__Group_4__07291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Segment__Group_4__0__Impl7319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_4__1__Impl_in_rule__Segment__Group_4__17350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__NumLanesAssignment_4_1_in_rule__Segment__Group_4__1__Impl7377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__0__Impl_in_rule__Segment__Group_5__07411 = new BitSet(new long[]{0x0000200000000040L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__1_in_rule__Segment__Group_5__07414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Segment__Group_5__0__Impl7442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_5__1__Impl_in_rule__Segment__Group_5__17473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__LengthAssignment_5_1_in_rule__Segment__Group_5__1__Impl7500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__0__Impl_in_rule__Segment__Group_6__07534 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__1_in_rule__Segment__Group_6__07537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Segment__Group_6__0__Impl7565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__1__Impl_in_rule__Segment__Group_6__17596 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__2_in_rule__Segment__Group_6__17599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Segment__Group_6__1__Impl7627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__2__Impl_in_rule__Segment__Group_6__27658 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__3_in_rule__Segment__Group_6__27661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__HasCarsAssignment_6_2_in_rule__Segment__Group_6__2__Impl7688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__3__Impl_in_rule__Segment__Group_6__37718 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__4_in_rule__Segment__Group_6__37721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6_3__0_in_rule__Segment__Group_6__3__Impl7748 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6__4__Impl_in_rule__Segment__Group_6__47779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Segment__Group_6__4__Impl7807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6_3__0__Impl_in_rule__Segment__Group_6_3__07848 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Segment__Group_6_3__1_in_rule__Segment__Group_6_3__07851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Segment__Group_6_3__0__Impl7879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__Group_6_3__1__Impl_in_rule__Segment__Group_6_3__17910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Segment__HasCarsAssignment_6_3_1_in_rule__Segment__Group_6_3__1__Impl7937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__0__Impl_in_rule__Semaphore__Group__07971 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__1_in_rule__Semaphore__Group__07974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__1__Impl_in_rule__Semaphore__Group__18032 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__2_in_rule__Semaphore__Group__18035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Semaphore__Group__1__Impl8063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__2__Impl_in_rule__Semaphore__Group__28094 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__3_in_rule__Semaphore__Group__28097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__NameAssignment_2_in_rule__Semaphore__Group__2__Impl8124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__3__Impl_in_rule__Semaphore__Group__38154 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__4_in_rule__Semaphore__Group__38157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Semaphore__Group__3__Impl8185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__4__Impl_in_rule__Semaphore__Group__48216 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__5_in_rule__Semaphore__Group__48219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_4__0_in_rule__Semaphore__Group__4__Impl8246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__5__Impl_in_rule__Semaphore__Group__58277 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__6_in_rule__Semaphore__Group__58280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_5__0_in_rule__Semaphore__Group__5__Impl8307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__6__Impl_in_rule__Semaphore__Group__68338 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__7_in_rule__Semaphore__Group__68341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_6__0_in_rule__Semaphore__Group__6__Impl8368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__7__Impl_in_rule__Semaphore__Group__78399 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__8_in_rule__Semaphore__Group__78402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Semaphore__Group__7__Impl8430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__8__Impl_in_rule__Semaphore__Group__88461 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__9_in_rule__Semaphore__Group__88464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__BelongsToAssignment_8_in_rule__Semaphore__Group__8__Impl8491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group__9__Impl_in_rule__Semaphore__Group__98521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Semaphore__Group__9__Impl8549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_4__0__Impl_in_rule__Semaphore__Group_4__08600 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_4__1_in_rule__Semaphore__Group_4__08603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Semaphore__Group_4__0__Impl8631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_4__1__Impl_in_rule__Semaphore__Group_4__18662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__CanGoAssignment_4_1_in_rule__Semaphore__Group_4__1__Impl8689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_5__0__Impl_in_rule__Semaphore__Group_5__08723 = new BitSet(new long[]{0x0000200000000040L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_5__1_in_rule__Semaphore__Group_5__08726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Semaphore__Group_5__0__Impl8754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_5__1__Impl_in_rule__Semaphore__Group_5__18785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__SecondsRedAssignment_5_1_in_rule__Semaphore__Group_5__1__Impl8812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_6__0__Impl_in_rule__Semaphore__Group_6__08846 = new BitSet(new long[]{0x0000200000000040L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_6__1_in_rule__Semaphore__Group_6__08849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Semaphore__Group_6__0__Impl8877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__Group_6__1__Impl_in_rule__Semaphore__Group_6__18908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semaphore__SecondsGreenAssignment_6_1_in_rule__Semaphore__Group_6__1__Impl8935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__0__Impl_in_rule__Signal_Impl__Group__08969 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__1_in_rule__Signal_Impl__Group__08972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__1__Impl_in_rule__Signal_Impl__Group__19030 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__2_in_rule__Signal_Impl__Group__19033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Signal_Impl__Group__1__Impl9061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__2__Impl_in_rule__Signal_Impl__Group__29092 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__3_in_rule__Signal_Impl__Group__29095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__NameAssignment_2_in_rule__Signal_Impl__Group__2__Impl9122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__3__Impl_in_rule__Signal_Impl__Group__39152 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__4_in_rule__Signal_Impl__Group__39155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Signal_Impl__Group__3__Impl9183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__4__Impl_in_rule__Signal_Impl__Group__49214 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__5_in_rule__Signal_Impl__Group__49217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Signal_Impl__Group__4__Impl9245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__5__Impl_in_rule__Signal_Impl__Group__59276 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__6_in_rule__Signal_Impl__Group__59279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__BelongsToAssignment_5_in_rule__Signal_Impl__Group__5__Impl9306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signal_Impl__Group__6__Impl_in_rule__Signal_Impl__Group__69336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Signal_Impl__Group__6__Impl9364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__0__Impl_in_rule__Extractor__Group__09409 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__1_in_rule__Extractor__Group__09412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__1__Impl_in_rule__Extractor__Group__19470 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group__2_in_rule__Extractor__Group__19473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Extractor__Group__1__Impl9501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__2__Impl_in_rule__Extractor__Group__29532 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__3_in_rule__Extractor__Group__29535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__NameAssignment_2_in_rule__Extractor__Group__2__Impl9562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__3__Impl_in_rule__Extractor__Group__39592 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__4_in_rule__Extractor__Group__39595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Extractor__Group__3__Impl9623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__4__Impl_in_rule__Extractor__Group__49654 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__5_in_rule__Extractor__Group__49657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__0_in_rule__Extractor__Group__4__Impl9684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__5__Impl_in_rule__Extractor__Group__59715 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__6_in_rule__Extractor__Group__59718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Extractor__Group__5__Impl9746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__6__Impl_in_rule__Extractor__Group__69777 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group__7_in_rule__Extractor__Group__69780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Extractor__Group__6__Impl9808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__7__Impl_in_rule__Extractor__Group__79839 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__8_in_rule__Extractor__Group__79842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__HasEndsAssignment_7_in_rule__Extractor__Group__7__Impl9869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__8__Impl_in_rule__Extractor__Group__89899 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__9_in_rule__Extractor__Group__89902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_8__0_in_rule__Extractor__Group__8__Impl9929 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__9__Impl_in_rule__Extractor__Group__99960 = new BitSet(new long[]{0x0000000030010000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__10_in_rule__Extractor__Group__99963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Extractor__Group__9__Impl9991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__10__Impl_in_rule__Extractor__Group__1010022 = new BitSet(new long[]{0x0000000030010000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__11_in_rule__Extractor__Group__1010025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__0_in_rule__Extractor__Group__10__Impl10052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__11__Impl_in_rule__Extractor__Group__1110083 = new BitSet(new long[]{0x0000000030010000L});
        public static final BitSet FOLLOW_rule__Extractor__Group__12_in_rule__Extractor__Group__1110086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__0_in_rule__Extractor__Group__11__Impl10113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group__12__Impl_in_rule__Extractor__Group__1210144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Extractor__Group__12__Impl10172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__0__Impl_in_rule__Extractor__Group_4__010229 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__1_in_rule__Extractor__Group_4__010232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Extractor__Group_4__0__Impl10260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__1__Impl_in_rule__Extractor__Group_4__110291 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__2_in_rule__Extractor__Group_4__110294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Extractor__Group_4__1__Impl10322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__2__Impl_in_rule__Extractor__Group_4__210353 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__3_in_rule__Extractor__Group_4__210356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__HasStartsAssignment_4_2_in_rule__Extractor__Group_4__2__Impl10383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__3__Impl_in_rule__Extractor__Group_4__310413 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__4_in_rule__Extractor__Group_4__310416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4_3__0_in_rule__Extractor__Group_4__3__Impl10443 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4__4__Impl_in_rule__Extractor__Group_4__410474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Extractor__Group_4__4__Impl10502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4_3__0__Impl_in_rule__Extractor__Group_4_3__010543 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4_3__1_in_rule__Extractor__Group_4_3__010546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Extractor__Group_4_3__0__Impl10574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_4_3__1__Impl_in_rule__Extractor__Group_4_3__110605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__HasStartsAssignment_4_3_1_in_rule__Extractor__Group_4_3__1__Impl10632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_8__0__Impl_in_rule__Extractor__Group_8__010666 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_8__1_in_rule__Extractor__Group_8__010669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Extractor__Group_8__0__Impl10697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_8__1__Impl_in_rule__Extractor__Group_8__110728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__HasEndsAssignment_8_1_in_rule__Extractor__Group_8__1__Impl10755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__0__Impl_in_rule__Extractor__Group_10__010789 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__1_in_rule__Extractor__Group_10__010792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Extractor__Group_10__0__Impl10820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_10__1__Impl_in_rule__Extractor__Group_10__110851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__SemaphoreAssignment_10_1_in_rule__Extractor__Group_10__1__Impl10878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__0__Impl_in_rule__Extractor__Group_11__010912 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__1_in_rule__Extractor__Group_11__010915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Extractor__Group_11__0__Impl10943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__1__Impl_in_rule__Extractor__Group_11__110974 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__2_in_rule__Extractor__Group_11__110977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Extractor__Group_11__1__Impl11005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__2__Impl_in_rule__Extractor__Group_11__211036 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__3_in_rule__Extractor__Group_11__211039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__SignalsAssignment_11_2_in_rule__Extractor__Group_11__2__Impl11066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__3__Impl_in_rule__Extractor__Group_11__311096 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__4_in_rule__Extractor__Group_11__311099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11_3__0_in_rule__Extractor__Group_11__3__Impl11126 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11__4__Impl_in_rule__Extractor__Group_11__411157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Extractor__Group_11__4__Impl11185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11_3__0__Impl_in_rule__Extractor__Group_11_3__011226 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11_3__1_in_rule__Extractor__Group_11_3__011229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Extractor__Group_11_3__0__Impl11257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__Group_11_3__1__Impl_in_rule__Extractor__Group_11_3__111288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Extractor__SignalsAssignment_11_3_1_in_rule__Extractor__Group_11_3__1__Impl11315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__0__Impl_in_rule__Injector__Group__011349 = new BitSet(new long[]{0x00000C0000800000L});
        public static final BitSet FOLLOW_rule__Injector__Group__1_in_rule__Injector__Group__011352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__1__Impl_in_rule__Injector__Group__111410 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group__2_in_rule__Injector__Group__111413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Injector__Group__1__Impl11441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__2__Impl_in_rule__Injector__Group__211472 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Injector__Group__3_in_rule__Injector__Group__211475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__NameAssignment_2_in_rule__Injector__Group__2__Impl11502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__3__Impl_in_rule__Injector__Group__311532 = new BitSet(new long[]{0x0000100001000000L});
        public static final BitSet FOLLOW_rule__Injector__Group__4_in_rule__Injector__Group__311535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Injector__Group__3__Impl11563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__4__Impl_in_rule__Injector__Group__411594 = new BitSet(new long[]{0x0000100001000000L});
        public static final BitSet FOLLOW_rule__Injector__Group__5_in_rule__Injector__Group__411597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_4__0_in_rule__Injector__Group__4__Impl11624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__5__Impl_in_rule__Injector__Group__511655 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Injector__Group__6_in_rule__Injector__Group__511658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Injector__Group__5__Impl11686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__6__Impl_in_rule__Injector__Group__611717 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group__7_in_rule__Injector__Group__611720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Injector__Group__6__Impl11748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__7__Impl_in_rule__Injector__Group__711779 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Injector__Group__8_in_rule__Injector__Group__711782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__HasStartsAssignment_7_in_rule__Injector__Group__7__Impl11809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__8__Impl_in_rule__Injector__Group__811839 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Injector__Group__9_in_rule__Injector__Group__811842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_8__0_in_rule__Injector__Group__8__Impl11869 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Injector__Group__9__Impl_in_rule__Injector__Group__911900 = new BitSet(new long[]{0x0000000038010000L});
        public static final BitSet FOLLOW_rule__Injector__Group__10_in_rule__Injector__Group__911903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Injector__Group__9__Impl11931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__10__Impl_in_rule__Injector__Group__1011962 = new BitSet(new long[]{0x0000000038010000L});
        public static final BitSet FOLLOW_rule__Injector__Group__11_in_rule__Injector__Group__1011965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__0_in_rule__Injector__Group__10__Impl11992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__11__Impl_in_rule__Injector__Group__1112023 = new BitSet(new long[]{0x0000000038010000L});
        public static final BitSet FOLLOW_rule__Injector__Group__12_in_rule__Injector__Group__1112026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__0_in_rule__Injector__Group__11__Impl12053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__12__Impl_in_rule__Injector__Group__1212084 = new BitSet(new long[]{0x0000000038010000L});
        public static final BitSet FOLLOW_rule__Injector__Group__13_in_rule__Injector__Group__1212087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__0_in_rule__Injector__Group__12__Impl12114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group__13__Impl_in_rule__Injector__Group__1312145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Injector__Group__13__Impl12173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_4__0__Impl_in_rule__Injector__Group_4__012232 = new BitSet(new long[]{0x0000200000000040L});
        public static final BitSet FOLLOW_rule__Injector__Group_4__1_in_rule__Injector__Group_4__012235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Injector__Group_4__0__Impl12263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_4__1__Impl_in_rule__Injector__Group_4__112294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__CarsPerHourAssignment_4_1_in_rule__Injector__Group_4__1__Impl12321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_8__0__Impl_in_rule__Injector__Group_8__012355 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_8__1_in_rule__Injector__Group_8__012358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Injector__Group_8__0__Impl12386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_8__1__Impl_in_rule__Injector__Group_8__112417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__HasStartsAssignment_8_1_in_rule__Injector__Group_8__1__Impl12444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__0__Impl_in_rule__Injector__Group_10__012478 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__1_in_rule__Injector__Group_10__012481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Injector__Group_10__0__Impl12509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__1__Impl_in_rule__Injector__Group_10__112540 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__2_in_rule__Injector__Group_10__112543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Injector__Group_10__1__Impl12571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__2__Impl_in_rule__Injector__Group_10__212602 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__3_in_rule__Injector__Group_10__212605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__HasEndsAssignment_10_2_in_rule__Injector__Group_10__2__Impl12632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__3__Impl_in_rule__Injector__Group_10__312662 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__4_in_rule__Injector__Group_10__312665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10_3__0_in_rule__Injector__Group_10__3__Impl12692 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10__4__Impl_in_rule__Injector__Group_10__412723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Injector__Group_10__4__Impl12751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10_3__0__Impl_in_rule__Injector__Group_10_3__012792 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_10_3__1_in_rule__Injector__Group_10_3__012795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Injector__Group_10_3__0__Impl12823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_10_3__1__Impl_in_rule__Injector__Group_10_3__112854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__HasEndsAssignment_10_3_1_in_rule__Injector__Group_10_3__1__Impl12881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__0__Impl_in_rule__Injector__Group_11__012915 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__1_in_rule__Injector__Group_11__012918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Injector__Group_11__0__Impl12946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_11__1__Impl_in_rule__Injector__Group_11__112977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__SemaphoreAssignment_11_1_in_rule__Injector__Group_11__1__Impl13004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__0__Impl_in_rule__Injector__Group_12__013038 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__1_in_rule__Injector__Group_12__013041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Injector__Group_12__0__Impl13069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__1__Impl_in_rule__Injector__Group_12__113100 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__2_in_rule__Injector__Group_12__113103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Injector__Group_12__1__Impl13131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__2__Impl_in_rule__Injector__Group_12__213162 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__3_in_rule__Injector__Group_12__213165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__SignalsAssignment_12_2_in_rule__Injector__Group_12__2__Impl13192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__3__Impl_in_rule__Injector__Group_12__313222 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__4_in_rule__Injector__Group_12__313225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12_3__0_in_rule__Injector__Group_12__3__Impl13252 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12__4__Impl_in_rule__Injector__Group_12__413283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Injector__Group_12__4__Impl13311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12_3__0__Impl_in_rule__Injector__Group_12_3__013352 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Injector__Group_12_3__1_in_rule__Injector__Group_12_3__013355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Injector__Group_12_3__0__Impl13383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__Group_12_3__1__Impl_in_rule__Injector__Group_12_3__113414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Injector__SignalsAssignment_12_3_1_in_rule__Injector__Group_12_3__1__Impl13441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__013475 = new BitSet(new long[]{0x0000200000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__013478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__EInt__Group__0__Impl13507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__113540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl13567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__0__Impl_in_rule__Speedlimit__Group__013600 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__1_in_rule__Speedlimit__Group__013603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Speedlimit__Group__0__Impl13631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__1__Impl_in_rule__Speedlimit__Group__113662 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__2_in_rule__Speedlimit__Group__113665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__NameAssignment_1_in_rule__Speedlimit__Group__1__Impl13692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__2__Impl_in_rule__Speedlimit__Group__213722 = new BitSet(new long[]{0x0000804000000000L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__3_in_rule__Speedlimit__Group__213725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Speedlimit__Group__2__Impl13753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__3__Impl_in_rule__Speedlimit__Group__313784 = new BitSet(new long[]{0x0000804000000000L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__4_in_rule__Speedlimit__Group__313787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group_3__0_in_rule__Speedlimit__Group__3__Impl13814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__4__Impl_in_rule__Speedlimit__Group__413845 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__5_in_rule__Speedlimit__Group__413848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Speedlimit__Group__4__Impl13876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__5__Impl_in_rule__Speedlimit__Group__513907 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__6_in_rule__Speedlimit__Group__513910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__BelongsToAssignment_5_in_rule__Speedlimit__Group__5__Impl13937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group__6__Impl_in_rule__Speedlimit__Group__613967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Speedlimit__Group__6__Impl13995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group_3__0__Impl_in_rule__Speedlimit__Group_3__014040 = new BitSet(new long[]{0x0000200000000040L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group_3__1_in_rule__Speedlimit__Group_3__014043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Speedlimit__Group_3__0__Impl14071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__Group_3__1__Impl_in_rule__Speedlimit__Group_3__114102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Speedlimit__SpeedAssignment_3_1_in_rule__Speedlimit__Group_3__1__Impl14129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__014163 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__014166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Stop__Group__0__Impl14194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__114225 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__114228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__NameAssignment_1_in_rule__Stop__Group__1__Impl14255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__214285 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__214288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Stop__Group__2__Impl14316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__314347 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Stop__Group__4_in_rule__Stop__Group__314350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Stop__Group__3__Impl14378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__4__Impl_in_rule__Stop__Group__414409 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Stop__Group__5_in_rule__Stop__Group__414412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__BelongsToAssignment_4_in_rule__Stop__Group__4__Impl14439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__5__Impl_in_rule__Stop__Group__514469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Stop__Group__5__Impl14497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__0__Impl_in_rule__Yield__Group__014540 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Yield__Group__1_in_rule__Yield__Group__014543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Yield__Group__0__Impl14571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__1__Impl_in_rule__Yield__Group__114602 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Yield__Group__2_in_rule__Yield__Group__114605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__NameAssignment_1_in_rule__Yield__Group__1__Impl14632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__2__Impl_in_rule__Yield__Group__214662 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Yield__Group__3_in_rule__Yield__Group__214665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Yield__Group__2__Impl14693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__3__Impl_in_rule__Yield__Group__314724 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Yield__Group__4_in_rule__Yield__Group__314727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Yield__Group__3__Impl14755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__4__Impl_in_rule__Yield__Group__414786 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Yield__Group__5_in_rule__Yield__Group__414789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__BelongsToAssignment_4_in_rule__Yield__Group__4__Impl14816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Yield__Group__5__Impl_in_rule__Yield__Group__514846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Yield__Group__5__Impl14874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSegment_in_rule__Highway__InitSegmentsAssignment_3_214922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSegment_in_rule__Highway__InitSegmentsAssignment_3_3_114953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_rule__Highway__InitNodesAssignment_4_214984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_rule__Highway__InitNodesAssignment_4_3_115015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCar_in_rule__Highway__InitCarsAssignment_5_215046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCar_in_rule__Highway__InitCarsAssignment_5_3_115077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemaphore_in_rule__Highway__InitSemaphoreAssignment_6_215108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemaphore_in_rule__Highway__InitSemaphoreAssignment_6_3_115139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_in_rule__Highway__InitSignalAssignment_7_215170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_in_rule__Highway__InitSignalAssignment_7_3_115201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__NameAssignment_215232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__HasStartsAssignment_615267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__HasStartsAssignment_7_115306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__HasEndsAssignment_1115345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__HasEndsAssignment_12_115384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__SemaphoreAssignment_14_115423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__SignalsAssignment_15_215462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Node_Impl__SignalsAssignment_15_3_115501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDate_in_rule__Car__TimeInAssignment_3_115536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDate_in_rule__Car__TimeOutAssignment_4_115567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Car__IsInSegmentAssignment_5_115602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Segment__NameAssignment_215637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Segment__NumLanesAssignment_4_115668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Segment__LengthAssignment_5_115699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Segment__HasCarsAssignment_6_215734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Segment__HasCarsAssignment_6_3_115773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Semaphore__NameAssignment_215808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__Semaphore__CanGoAssignment_4_115839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Semaphore__SecondsRedAssignment_5_115870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Semaphore__SecondsGreenAssignment_6_115901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Semaphore__BelongsToAssignment_815936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Signal_Impl__NameAssignment_215971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Signal_Impl__BelongsToAssignment_516006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__NameAssignment_216041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__HasStartsAssignment_4_216076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__HasStartsAssignment_4_3_116115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__HasEndsAssignment_716154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__HasEndsAssignment_8_116193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__SemaphoreAssignment_10_116232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__SignalsAssignment_11_216271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Extractor__SignalsAssignment_11_3_116310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__NameAssignment_216345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Injector__CarsPerHourAssignment_4_116376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__HasStartsAssignment_716411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__HasStartsAssignment_8_116450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__HasEndsAssignment_10_216489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__HasEndsAssignment_10_3_116528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__SemaphoreAssignment_11_116567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__SignalsAssignment_12_216606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Injector__SignalsAssignment_12_3_116645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Speedlimit__NameAssignment_116680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Speedlimit__SpeedAssignment_3_116711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Speedlimit__BelongsToAssignment_516746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Stop__NameAssignment_116781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Stop__BelongsToAssignment_416816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Yield__NameAssignment_116851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Yield__BelongsToAssignment_416886 = new BitSet(new long[]{0x0000000000000002L});
    }


}