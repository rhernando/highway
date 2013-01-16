package org.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.HighwayGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHighwayParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Highway'", "'{'", "'Segments'", "','", "'}'", "'Nodes'", "'Cars'", "'Semaphores'", "'Signals'", "'Node'", "'hasStarts'", "'('", "')'", "'hasEnds'", "'semaphore'", "'signals'", "'Car'", "'timeIn'", "'timeOut'", "'isInSegment'", "'Segment'", "'numLanes'", "'length'", "'hasCars'", "'Semaphore'", "'canGo'", "'secondsRed'", "'secondsGreen'", "'belongsTo'", "'Signal'", "'Extractor'", "'Injector'", "'carsPerHour'", "'-'", "'true'", "'false'", "'Speedlimit'", "'Speed'", "'Stop'", "'Yield'"
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
    public String getGrammarFileName() { return "../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g"; }



     	private HighwayGrammarAccess grammarAccess;
     	
        public InternalHighwayParser(TokenStream input, HighwayGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Highway";	
       	}
       	
       	@Override
       	protected HighwayGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleHighway"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:67:1: entryRuleHighway returns [EObject current=null] : iv_ruleHighway= ruleHighway EOF ;
    public final EObject entryRuleHighway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighway = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:68:2: (iv_ruleHighway= ruleHighway EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:69:2: iv_ruleHighway= ruleHighway EOF
            {
             newCompositeNode(grammarAccess.getHighwayRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHighway_in_entryRuleHighway75);
            iv_ruleHighway=ruleHighway();

            state._fsp--;

             current =iv_ruleHighway; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHighway85); 

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
    // $ANTLR end "entryRuleHighway"


    // $ANTLR start "ruleHighway"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:76:1: ruleHighway returns [EObject current=null] : ( () otherlv_1= 'Highway' otherlv_2= '{' (otherlv_3= 'Segments' otherlv_4= '{' ( (lv_initSegments_5_0= ruleSegment ) ) (otherlv_6= ',' ( (lv_initSegments_7_0= ruleSegment ) ) )* otherlv_8= '}' )? (otherlv_9= 'Nodes' otherlv_10= '{' ( (lv_initNodes_11_0= ruleNode ) ) (otherlv_12= ',' ( (lv_initNodes_13_0= ruleNode ) ) )* otherlv_14= '}' )? (otherlv_15= 'Cars' otherlv_16= '{' ( (lv_initCars_17_0= ruleCar ) ) (otherlv_18= ',' ( (lv_initCars_19_0= ruleCar ) ) )* otherlv_20= '}' )? (otherlv_21= 'Semaphores' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}' )? (otherlv_27= 'Signals' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) ;
    public final EObject ruleHighway() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        EObject lv_initSegments_5_0 = null;

        EObject lv_initSegments_7_0 = null;

        EObject lv_initNodes_11_0 = null;

        EObject lv_initNodes_13_0 = null;

        EObject lv_initCars_17_0 = null;

        EObject lv_initCars_19_0 = null;

        EObject lv_initSemaphore_23_0 = null;

        EObject lv_initSemaphore_25_0 = null;

        EObject lv_initSignal_29_0 = null;

        EObject lv_initSignal_31_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:79:28: ( ( () otherlv_1= 'Highway' otherlv_2= '{' (otherlv_3= 'Segments' otherlv_4= '{' ( (lv_initSegments_5_0= ruleSegment ) ) (otherlv_6= ',' ( (lv_initSegments_7_0= ruleSegment ) ) )* otherlv_8= '}' )? (otherlv_9= 'Nodes' otherlv_10= '{' ( (lv_initNodes_11_0= ruleNode ) ) (otherlv_12= ',' ( (lv_initNodes_13_0= ruleNode ) ) )* otherlv_14= '}' )? (otherlv_15= 'Cars' otherlv_16= '{' ( (lv_initCars_17_0= ruleCar ) ) (otherlv_18= ',' ( (lv_initCars_19_0= ruleCar ) ) )* otherlv_20= '}' )? (otherlv_21= 'Semaphores' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}' )? (otherlv_27= 'Signals' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:80:1: ( () otherlv_1= 'Highway' otherlv_2= '{' (otherlv_3= 'Segments' otherlv_4= '{' ( (lv_initSegments_5_0= ruleSegment ) ) (otherlv_6= ',' ( (lv_initSegments_7_0= ruleSegment ) ) )* otherlv_8= '}' )? (otherlv_9= 'Nodes' otherlv_10= '{' ( (lv_initNodes_11_0= ruleNode ) ) (otherlv_12= ',' ( (lv_initNodes_13_0= ruleNode ) ) )* otherlv_14= '}' )? (otherlv_15= 'Cars' otherlv_16= '{' ( (lv_initCars_17_0= ruleCar ) ) (otherlv_18= ',' ( (lv_initCars_19_0= ruleCar ) ) )* otherlv_20= '}' )? (otherlv_21= 'Semaphores' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}' )? (otherlv_27= 'Signals' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:80:1: ( () otherlv_1= 'Highway' otherlv_2= '{' (otherlv_3= 'Segments' otherlv_4= '{' ( (lv_initSegments_5_0= ruleSegment ) ) (otherlv_6= ',' ( (lv_initSegments_7_0= ruleSegment ) ) )* otherlv_8= '}' )? (otherlv_9= 'Nodes' otherlv_10= '{' ( (lv_initNodes_11_0= ruleNode ) ) (otherlv_12= ',' ( (lv_initNodes_13_0= ruleNode ) ) )* otherlv_14= '}' )? (otherlv_15= 'Cars' otherlv_16= '{' ( (lv_initCars_17_0= ruleCar ) ) (otherlv_18= ',' ( (lv_initCars_19_0= ruleCar ) ) )* otherlv_20= '}' )? (otherlv_21= 'Semaphores' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}' )? (otherlv_27= 'Signals' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:80:2: () otherlv_1= 'Highway' otherlv_2= '{' (otherlv_3= 'Segments' otherlv_4= '{' ( (lv_initSegments_5_0= ruleSegment ) ) (otherlv_6= ',' ( (lv_initSegments_7_0= ruleSegment ) ) )* otherlv_8= '}' )? (otherlv_9= 'Nodes' otherlv_10= '{' ( (lv_initNodes_11_0= ruleNode ) ) (otherlv_12= ',' ( (lv_initNodes_13_0= ruleNode ) ) )* otherlv_14= '}' )? (otherlv_15= 'Cars' otherlv_16= '{' ( (lv_initCars_17_0= ruleCar ) ) (otherlv_18= ',' ( (lv_initCars_19_0= ruleCar ) ) )* otherlv_20= '}' )? (otherlv_21= 'Semaphores' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}' )? (otherlv_27= 'Signals' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}' )? otherlv_33= '}'
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:80:2: ()
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHighwayAccess().getHighwayAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHighway131); 

                	newLeafNode(otherlv_1, grammarAccess.getHighwayAccess().getHighwayKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHighway143); 

                	newLeafNode(otherlv_2, grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:94:1: (otherlv_3= 'Segments' otherlv_4= '{' ( (lv_initSegments_5_0= ruleSegment ) ) (otherlv_6= ',' ( (lv_initSegments_7_0= ruleSegment ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:94:3: otherlv_3= 'Segments' otherlv_4= '{' ( (lv_initSegments_5_0= ruleSegment ) ) (otherlv_6= ',' ( (lv_initSegments_7_0= ruleSegment ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHighway156); 

                        	newLeafNode(otherlv_3, grammarAccess.getHighwayAccess().getSegmentsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHighway168); 

                        	newLeafNode(otherlv_4, grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:102:1: ( (lv_initSegments_5_0= ruleSegment ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:103:1: (lv_initSegments_5_0= ruleSegment )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:103:1: (lv_initSegments_5_0= ruleSegment )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:104:3: lv_initSegments_5_0= ruleSegment
                    {
                     
                    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSegment_in_ruleHighway189);
                    lv_initSegments_5_0=ruleSegment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	        }
                           		add(
                           			current, 
                           			"initSegments",
                            		lv_initSegments_5_0, 
                            		"Segment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:120:2: (otherlv_6= ',' ( (lv_initSegments_7_0= ruleSegment ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:120:4: otherlv_6= ',' ( (lv_initSegments_7_0= ruleSegment ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHighway202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getHighwayAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:124:1: ( (lv_initSegments_7_0= ruleSegment ) )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:125:1: (lv_initSegments_7_0= ruleSegment )
                    	    {
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:125:1: (lv_initSegments_7_0= ruleSegment )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:126:3: lv_initSegments_7_0= ruleSegment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSegment_in_ruleHighway223);
                    	    lv_initSegments_7_0=ruleSegment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initSegments",
                    	            		lv_initSegments_7_0, 
                    	            		"Segment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHighway237); 

                        	newLeafNode(otherlv_8, grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:146:3: (otherlv_9= 'Nodes' otherlv_10= '{' ( (lv_initNodes_11_0= ruleNode ) ) (otherlv_12= ',' ( (lv_initNodes_13_0= ruleNode ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:146:5: otherlv_9= 'Nodes' otherlv_10= '{' ( (lv_initNodes_11_0= ruleNode ) ) (otherlv_12= ',' ( (lv_initNodes_13_0= ruleNode ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleHighway252); 

                        	newLeafNode(otherlv_9, grammarAccess.getHighwayAccess().getNodesKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHighway264); 

                        	newLeafNode(otherlv_10, grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:154:1: ( (lv_initNodes_11_0= ruleNode ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:155:1: (lv_initNodes_11_0= ruleNode )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:155:1: (lv_initNodes_11_0= ruleNode )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:156:3: lv_initNodes_11_0= ruleNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNode_in_ruleHighway285);
                    lv_initNodes_11_0=ruleNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	        }
                           		add(
                           			current, 
                           			"initNodes",
                            		lv_initNodes_11_0, 
                            		"Node");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:172:2: (otherlv_12= ',' ( (lv_initNodes_13_0= ruleNode ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:172:4: otherlv_12= ',' ( (lv_initNodes_13_0= ruleNode ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHighway298); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getHighwayAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:176:1: ( (lv_initNodes_13_0= ruleNode ) )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:177:1: (lv_initNodes_13_0= ruleNode )
                    	    {
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:177:1: (lv_initNodes_13_0= ruleNode )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:178:3: lv_initNodes_13_0= ruleNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleNode_in_ruleHighway319);
                    	    lv_initNodes_13_0=ruleNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initNodes",
                    	            		lv_initNodes_13_0, 
                    	            		"Node");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHighway333); 

                        	newLeafNode(otherlv_14, grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:198:3: (otherlv_15= 'Cars' otherlv_16= '{' ( (lv_initCars_17_0= ruleCar ) ) (otherlv_18= ',' ( (lv_initCars_19_0= ruleCar ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:198:5: otherlv_15= 'Cars' otherlv_16= '{' ( (lv_initCars_17_0= ruleCar ) ) (otherlv_18= ',' ( (lv_initCars_19_0= ruleCar ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleHighway348); 

                        	newLeafNode(otherlv_15, grammarAccess.getHighwayAccess().getCarsKeyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHighway360); 

                        	newLeafNode(otherlv_16, grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:206:1: ( (lv_initCars_17_0= ruleCar ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:207:1: (lv_initCars_17_0= ruleCar )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:207:1: (lv_initCars_17_0= ruleCar )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:208:3: lv_initCars_17_0= ruleCar
                    {
                     
                    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCar_in_ruleHighway381);
                    lv_initCars_17_0=ruleCar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	        }
                           		add(
                           			current, 
                           			"initCars",
                            		lv_initCars_17_0, 
                            		"Car");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:224:2: (otherlv_18= ',' ( (lv_initCars_19_0= ruleCar ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:224:4: otherlv_18= ',' ( (lv_initCars_19_0= ruleCar ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHighway394); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getHighwayAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:228:1: ( (lv_initCars_19_0= ruleCar ) )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:229:1: (lv_initCars_19_0= ruleCar )
                    	    {
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:229:1: (lv_initCars_19_0= ruleCar )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:230:3: lv_initCars_19_0= ruleCar
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCar_in_ruleHighway415);
                    	    lv_initCars_19_0=ruleCar();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initCars",
                    	            		lv_initCars_19_0, 
                    	            		"Car");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHighway429); 

                        	newLeafNode(otherlv_20, grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:250:3: (otherlv_21= 'Semaphores' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:250:5: otherlv_21= 'Semaphores' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleHighway444); 

                        	newLeafNode(otherlv_21, grammarAccess.getHighwayAccess().getSemaphoresKeyword_6_0());
                        
                    otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHighway456); 

                        	newLeafNode(otherlv_22, grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:258:1: ( (lv_initSemaphore_23_0= ruleSemaphore ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:259:1: (lv_initSemaphore_23_0= ruleSemaphore )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:259:1: (lv_initSemaphore_23_0= ruleSemaphore )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:260:3: lv_initSemaphore_23_0= ruleSemaphore
                    {
                     
                    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitSemaphoreSemaphoreParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSemaphore_in_ruleHighway477);
                    lv_initSemaphore_23_0=ruleSemaphore();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	        }
                           		add(
                           			current, 
                           			"initSemaphore",
                            		lv_initSemaphore_23_0, 
                            		"Semaphore");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:276:2: (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:276:4: otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHighway490); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getHighwayAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:280:1: ( (lv_initSemaphore_25_0= ruleSemaphore ) )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:281:1: (lv_initSemaphore_25_0= ruleSemaphore )
                    	    {
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:281:1: (lv_initSemaphore_25_0= ruleSemaphore )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:282:3: lv_initSemaphore_25_0= ruleSemaphore
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitSemaphoreSemaphoreParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSemaphore_in_ruleHighway511);
                    	    lv_initSemaphore_25_0=ruleSemaphore();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initSemaphore",
                    	            		lv_initSemaphore_25_0, 
                    	            		"Semaphore");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHighway525); 

                        	newLeafNode(otherlv_26, grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:302:3: (otherlv_27= 'Signals' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:302:5: otherlv_27= 'Signals' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleHighway540); 

                        	newLeafNode(otherlv_27, grammarAccess.getHighwayAccess().getSignalsKeyword_7_0());
                        
                    otherlv_28=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHighway552); 

                        	newLeafNode(otherlv_28, grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:310:1: ( (lv_initSignal_29_0= ruleSignal ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:311:1: (lv_initSignal_29_0= ruleSignal )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:311:1: (lv_initSignal_29_0= ruleSignal )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:312:3: lv_initSignal_29_0= ruleSignal
                    {
                     
                    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitSignalSignalParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleHighway573);
                    lv_initSignal_29_0=ruleSignal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	        }
                           		add(
                           			current, 
                           			"initSignal",
                            		lv_initSignal_29_0, 
                            		"Signal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:328:2: (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:328:4: otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHighway586); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getHighwayAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:332:1: ( (lv_initSignal_31_0= ruleSignal ) )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:333:1: (lv_initSignal_31_0= ruleSignal )
                    	    {
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:333:1: (lv_initSignal_31_0= ruleSignal )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:334:3: lv_initSignal_31_0= ruleSignal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitSignalSignalParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleHighway607);
                    	    lv_initSignal_31_0=ruleSignal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initSignal",
                    	            		lv_initSignal_31_0, 
                    	            		"Signal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHighway621); 

                        	newLeafNode(otherlv_32, grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_33=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHighway635); 

                	newLeafNode(otherlv_33, grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHighway"


    // $ANTLR start "entryRuleNode"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:366:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:367:2: (iv_ruleNode= ruleNode EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:368:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_entryRuleNode671);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNode681); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:375:1: ruleNode returns [EObject current=null] : (this_Node_Impl_0= ruleNode_Impl | this_Extractor_1= ruleExtractor | this_Injector_2= ruleInjector ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Node_Impl_0 = null;

        EObject this_Extractor_1 = null;

        EObject this_Injector_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:378:28: ( (this_Node_Impl_0= ruleNode_Impl | this_Extractor_1= ruleExtractor | this_Injector_2= ruleInjector ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:379:1: (this_Node_Impl_0= ruleNode_Impl | this_Extractor_1= ruleExtractor | this_Injector_2= ruleInjector )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:379:1: (this_Node_Impl_0= ruleNode_Impl | this_Extractor_1= ruleExtractor | this_Injector_2= ruleInjector )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:380:5: this_Node_Impl_0= ruleNode_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getNode_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNode_Impl_in_ruleNode728);
                    this_Node_Impl_0=ruleNode_Impl();

                    state._fsp--;

                     
                            current = this_Node_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:390:5: this_Extractor_1= ruleExtractor
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getExtractorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExtractor_in_ruleNode755);
                    this_Extractor_1=ruleExtractor();

                    state._fsp--;

                     
                            current = this_Extractor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:400:5: this_Injector_2= ruleInjector
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getInjectorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInjector_in_ruleNode782);
                    this_Injector_2=ruleInjector();

                    state._fsp--;

                     
                            current = this_Injector_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleSignal"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:416:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:417:2: (iv_ruleSignal= ruleSignal EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:418:2: iv_ruleSignal= ruleSignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_entryRuleSignal817);
            iv_ruleSignal=ruleSignal();

            state._fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignal827); 

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
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:425:1: ruleSignal returns [EObject current=null] : (this_Signal_Impl_0= ruleSignal_Impl | this_Speedlimit_1= ruleSpeedlimit | this_Stop_2= ruleStop | this_Yield_3= ruleYield ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        EObject this_Signal_Impl_0 = null;

        EObject this_Speedlimit_1 = null;

        EObject this_Stop_2 = null;

        EObject this_Yield_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:428:28: ( (this_Signal_Impl_0= ruleSignal_Impl | this_Speedlimit_1= ruleSpeedlimit | this_Stop_2= ruleStop | this_Yield_3= ruleYield ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:429:1: (this_Signal_Impl_0= ruleSignal_Impl | this_Speedlimit_1= ruleSpeedlimit | this_Stop_2= ruleStop | this_Yield_3= ruleYield )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:429:1: (this_Signal_Impl_0= ruleSignal_Impl | this_Speedlimit_1= ruleSpeedlimit | this_Stop_2= ruleStop | this_Yield_3= ruleYield )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt12=1;
                }
                break;
            case 47:
                {
                alt12=2;
                }
                break;
            case 49:
                {
                alt12=3;
                }
                break;
            case 50:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:430:5: this_Signal_Impl_0= ruleSignal_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getSignalAccess().getSignal_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSignal_Impl_in_ruleSignal874);
                    this_Signal_Impl_0=ruleSignal_Impl();

                    state._fsp--;

                     
                            current = this_Signal_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:440:5: this_Speedlimit_1= ruleSpeedlimit
                    {
                     
                            newCompositeNode(grammarAccess.getSignalAccess().getSpeedlimitParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSpeedlimit_in_ruleSignal901);
                    this_Speedlimit_1=ruleSpeedlimit();

                    state._fsp--;

                     
                            current = this_Speedlimit_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:450:5: this_Stop_2= ruleStop
                    {
                     
                            newCompositeNode(grammarAccess.getSignalAccess().getStopParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStop_in_ruleSignal928);
                    this_Stop_2=ruleStop();

                    state._fsp--;

                     
                            current = this_Stop_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:460:5: this_Yield_3= ruleYield
                    {
                     
                            newCompositeNode(grammarAccess.getSignalAccess().getYieldParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleYield_in_ruleSignal955);
                    this_Yield_3=ruleYield();

                    state._fsp--;

                     
                            current = this_Yield_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleNode_Impl"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:476:1: entryRuleNode_Impl returns [EObject current=null] : iv_ruleNode_Impl= ruleNode_Impl EOF ;
    public final EObject entryRuleNode_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode_Impl = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:477:2: (iv_ruleNode_Impl= ruleNode_Impl EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:478:2: iv_ruleNode_Impl= ruleNode_Impl EOF
            {
             newCompositeNode(grammarAccess.getNode_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_Impl_in_entryRuleNode_Impl990);
            iv_ruleNode_Impl=ruleNode_Impl();

            state._fsp--;

             current =iv_ruleNode_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNode_Impl1000); 

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
    // $ANTLR end "entryRuleNode_Impl"


    // $ANTLR start "ruleNode_Impl"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:485:1: ruleNode_Impl returns [EObject current=null] : ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'hasStarts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'hasEnds' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' (otherlv_16= 'semaphore' ( ( ruleEString ) ) )? (otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' ) ;
    public final EObject ruleNode_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:488:28: ( ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'hasStarts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'hasEnds' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' (otherlv_16= 'semaphore' ( ( ruleEString ) ) )? (otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:489:1: ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'hasStarts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'hasEnds' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' (otherlv_16= 'semaphore' ( ( ruleEString ) ) )? (otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:489:1: ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'hasStarts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'hasEnds' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' (otherlv_16= 'semaphore' ( ( ruleEString ) ) )? (otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:489:2: () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'hasStarts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'hasEnds' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' (otherlv_16= 'semaphore' ( ( ruleEString ) ) )? (otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}'
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:489:2: ()
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:490:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNode_ImplAccess().getNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNode_Impl1046); 

                	newLeafNode(otherlv_1, grammarAccess.getNode_ImplAccess().getNodeKeyword_1());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:499:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:500:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:500:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:501:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getNode_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1067);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNode_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNode_Impl1079); 

                	newLeafNode(otherlv_3, grammarAccess.getNode_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNode_Impl1091); 

                	newLeafNode(otherlv_4, grammarAccess.getNode_ImplAccess().getHasStartsKeyword_4());
                
            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNode_Impl1103); 

                	newLeafNode(otherlv_5, grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_5());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:529:1: ( ( ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:530:1: ( ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:530:1: ( ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:531:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNode_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1126);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:544:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:544:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNode_Impl1139); 

            	        	newLeafNode(otherlv_7, grammarAccess.getNode_ImplAccess().getCommaKeyword_7_0());
            	        
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:548:1: ( ( ruleEString ) )
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:549:1: ( ruleEString )
            	    {
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:549:1: ( ruleEString )
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:550:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNode_ImplRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1162);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNode_Impl1176); 

                	newLeafNode(otherlv_9, grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_8());
                
            otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNode_Impl1188); 

                	newLeafNode(otherlv_10, grammarAccess.getNode_ImplAccess().getHasEndsKeyword_9());
                
            otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNode_Impl1200); 

                	newLeafNode(otherlv_11, grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_10());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:575:1: ( ( ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:576:1: ( ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:576:1: ( ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:577:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNode_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1223);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:590:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:590:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNode_Impl1236); 

            	        	newLeafNode(otherlv_13, grammarAccess.getNode_ImplAccess().getCommaKeyword_12_0());
            	        
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:594:1: ( ( ruleEString ) )
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:595:1: ( ruleEString )
            	    {
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:595:1: ( ruleEString )
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:596:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNode_ImplRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_12_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1259);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNode_Impl1273); 

                	newLeafNode(otherlv_15, grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_13());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:613:1: (otherlv_16= 'semaphore' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:613:3: otherlv_16= 'semaphore' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNode_Impl1286); 

                        	newLeafNode(otherlv_16, grammarAccess.getNode_ImplAccess().getSemaphoreKeyword_14_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:617:1: ( ( ruleEString ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:618:1: ( ruleEString )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:618:1: ( ruleEString )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:619:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNode_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNode_ImplAccess().getSemaphoreSemaphoreCrossReference_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1309);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:632:4: (otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:632:6: otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')'
                    {
                    otherlv_18=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNode_Impl1324); 

                        	newLeafNode(otherlv_18, grammarAccess.getNode_ImplAccess().getSignalsKeyword_15_0());
                        
                    otherlv_19=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNode_Impl1336); 

                        	newLeafNode(otherlv_19, grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_15_1());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:640:1: ( ( ruleEString ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:641:1: ( ruleEString )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:641:1: ( ruleEString )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:642:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNode_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_15_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1359);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:655:2: (otherlv_21= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:655:4: otherlv_21= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNode_Impl1372); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getNode_ImplAccess().getCommaKeyword_15_3_0());
                    	        
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:659:1: ( ( ruleEString ) )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:660:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:660:1: ( ruleEString )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:661:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNode_ImplRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_15_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1395);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNode_Impl1409); 

                        	newLeafNode(otherlv_23, grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_15_4());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNode_Impl1423); 

                	newLeafNode(otherlv_24, grammarAccess.getNode_ImplAccess().getRightCurlyBracketKeyword_16());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode_Impl"


    // $ANTLR start "entryRuleCar"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:690:1: entryRuleCar returns [EObject current=null] : iv_ruleCar= ruleCar EOF ;
    public final EObject entryRuleCar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCar = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:691:2: (iv_ruleCar= ruleCar EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:692:2: iv_ruleCar= ruleCar EOF
            {
             newCompositeNode(grammarAccess.getCarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCar_in_entryRuleCar1459);
            iv_ruleCar=ruleCar();

            state._fsp--;

             current =iv_ruleCar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCar1469); 

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
    // $ANTLR end "entryRuleCar"


    // $ANTLR start "ruleCar"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:699:1: ruleCar returns [EObject current=null] : ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timeIn' ( (lv_timeIn_5_0= ruleEDate ) ) )? (otherlv_6= 'timeOut' ( (lv_timeOut_7_0= ruleEDate ) ) )? (otherlv_8= 'isInSegment' ( ( ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleCar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timeIn_5_0 = null;

        AntlrDatatypeRuleToken lv_timeOut_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:702:28: ( ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timeIn' ( (lv_timeIn_5_0= ruleEDate ) ) )? (otherlv_6= 'timeOut' ( (lv_timeOut_7_0= ruleEDate ) ) )? (otherlv_8= 'isInSegment' ( ( ruleEString ) ) )? otherlv_10= '}' ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:703:1: ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timeIn' ( (lv_timeIn_5_0= ruleEDate ) ) )? (otherlv_6= 'timeOut' ( (lv_timeOut_7_0= ruleEDate ) ) )? (otherlv_8= 'isInSegment' ( ( ruleEString ) ) )? otherlv_10= '}' )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:703:1: ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timeIn' ( (lv_timeIn_5_0= ruleEDate ) ) )? (otherlv_6= 'timeOut' ( (lv_timeOut_7_0= ruleEDate ) ) )? (otherlv_8= 'isInSegment' ( ( ruleEString ) ) )? otherlv_10= '}' )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:703:2: () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timeIn' ( (lv_timeIn_5_0= ruleEDate ) ) )? (otherlv_6= 'timeOut' ( (lv_timeOut_7_0= ruleEDate ) ) )? (otherlv_8= 'isInSegment' ( ( ruleEString ) ) )? otherlv_10= '}'
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:703:2: ()
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:704:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCarAccess().getCarAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCar1515); 

                	newLeafNode(otherlv_1, grammarAccess.getCarAccess().getCarKeyword_1());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:713:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:714:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:714:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:715:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCarAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCar1536);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCarRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCar1548); 

                	newLeafNode(otherlv_3, grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:735:1: (otherlv_4= 'timeIn' ( (lv_timeIn_5_0= ruleEDate ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:735:3: otherlv_4= 'timeIn' ( (lv_timeIn_5_0= ruleEDate ) )
                    {
                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCar1561); 

                        	newLeafNode(otherlv_4, grammarAccess.getCarAccess().getTimeInKeyword_4_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:739:1: ( (lv_timeIn_5_0= ruleEDate ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:740:1: (lv_timeIn_5_0= ruleEDate )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:740:1: (lv_timeIn_5_0= ruleEDate )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:741:3: lv_timeIn_5_0= ruleEDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarAccess().getTimeInEDateParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDate_in_ruleCar1582);
                    lv_timeIn_5_0=ruleEDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarRule());
                    	        }
                           		set(
                           			current, 
                           			"timeIn",
                            		lv_timeIn_5_0, 
                            		"EDate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:757:4: (otherlv_6= 'timeOut' ( (lv_timeOut_7_0= ruleEDate ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:757:6: otherlv_6= 'timeOut' ( (lv_timeOut_7_0= ruleEDate ) )
                    {
                    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCar1597); 

                        	newLeafNode(otherlv_6, grammarAccess.getCarAccess().getTimeOutKeyword_5_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:761:1: ( (lv_timeOut_7_0= ruleEDate ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:762:1: (lv_timeOut_7_0= ruleEDate )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:762:1: (lv_timeOut_7_0= ruleEDate )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:763:3: lv_timeOut_7_0= ruleEDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarAccess().getTimeOutEDateParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDate_in_ruleCar1618);
                    lv_timeOut_7_0=ruleEDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarRule());
                    	        }
                           		set(
                           			current, 
                           			"timeOut",
                            		lv_timeOut_7_0, 
                            		"EDate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:779:4: (otherlv_8= 'isInSegment' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:779:6: otherlv_8= 'isInSegment' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCar1633); 

                        	newLeafNode(otherlv_8, grammarAccess.getCarAccess().getIsInSegmentKeyword_6_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:783:1: ( ( ruleEString ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:784:1: ( ruleEString )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:784:1: ( ruleEString )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:785:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCarRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCarAccess().getIsInSegmentSegmentCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCar1656);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCar1670); 

                	newLeafNode(otherlv_10, grammarAccess.getCarAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCar"


    // $ANTLR start "entryRuleSegment"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:810:1: entryRuleSegment returns [EObject current=null] : iv_ruleSegment= ruleSegment EOF ;
    public final EObject entryRuleSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegment = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:811:2: (iv_ruleSegment= ruleSegment EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:812:2: iv_ruleSegment= ruleSegment EOF
            {
             newCompositeNode(grammarAccess.getSegmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSegment_in_entryRuleSegment1706);
            iv_ruleSegment=ruleSegment();

            state._fsp--;

             current =iv_ruleSegment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSegment1716); 

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
    // $ANTLR end "entryRuleSegment"


    // $ANTLR start "ruleSegment"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:819:1: ruleSegment returns [EObject current=null] : ( () otherlv_1= 'Segment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numLanes' ( (lv_numLanes_5_0= ruleEInt ) ) )? (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'hasCars' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) ;
    public final EObject ruleSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_numLanes_5_0 = null;

        AntlrDatatypeRuleToken lv_length_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:822:28: ( ( () otherlv_1= 'Segment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numLanes' ( (lv_numLanes_5_0= ruleEInt ) ) )? (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'hasCars' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:823:1: ( () otherlv_1= 'Segment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numLanes' ( (lv_numLanes_5_0= ruleEInt ) ) )? (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'hasCars' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:823:1: ( () otherlv_1= 'Segment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numLanes' ( (lv_numLanes_5_0= ruleEInt ) ) )? (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'hasCars' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:823:2: () otherlv_1= 'Segment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numLanes' ( (lv_numLanes_5_0= ruleEInt ) ) )? (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'hasCars' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}'
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:823:2: ()
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:824:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSegmentAccess().getSegmentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSegment1762); 

                	newLeafNode(otherlv_1, grammarAccess.getSegmentAccess().getSegmentKeyword_1());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:833:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:834:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:834:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:835:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSegmentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSegment1783);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSegmentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSegment1795); 

                	newLeafNode(otherlv_3, grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:855:1: (otherlv_4= 'numLanes' ( (lv_numLanes_5_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:855:3: otherlv_4= 'numLanes' ( (lv_numLanes_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSegment1808); 

                        	newLeafNode(otherlv_4, grammarAccess.getSegmentAccess().getNumLanesKeyword_4_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:859:1: ( (lv_numLanes_5_0= ruleEInt ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:860:1: (lv_numLanes_5_0= ruleEInt )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:860:1: (lv_numLanes_5_0= ruleEInt )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:861:3: lv_numLanes_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegmentAccess().getNumLanesEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSegment1829);
                    lv_numLanes_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegmentRule());
                    	        }
                           		set(
                           			current, 
                           			"numLanes",
                            		lv_numLanes_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:877:4: (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:877:6: otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSegment1844); 

                        	newLeafNode(otherlv_6, grammarAccess.getSegmentAccess().getLengthKeyword_5_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:881:1: ( (lv_length_7_0= ruleEInt ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:882:1: (lv_length_7_0= ruleEInt )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:882:1: (lv_length_7_0= ruleEInt )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:883:3: lv_length_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegmentAccess().getLengthEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSegment1865);
                    lv_length_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegmentRule());
                    	        }
                           		set(
                           			current, 
                           			"length",
                            		lv_length_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:899:4: (otherlv_8= 'hasCars' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:899:6: otherlv_8= 'hasCars' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSegment1880); 

                        	newLeafNode(otherlv_8, grammarAccess.getSegmentAccess().getHasCarsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSegment1892); 

                        	newLeafNode(otherlv_9, grammarAccess.getSegmentAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:907:1: ( ( ruleEString ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:908:1: ( ruleEString )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:908:1: ( ruleEString )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:909:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSegmentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSegment1915);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:922:2: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:922:4: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSegment1928); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getSegmentAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:926:1: ( ( ruleEString ) )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:927:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:927:1: ( ruleEString )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:928:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSegmentRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSegment1951);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSegment1965); 

                        	newLeafNode(otherlv_13, grammarAccess.getSegmentAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSegment1979); 

                	newLeafNode(otherlv_14, grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSegment"


    // $ANTLR start "entryRuleSemaphore"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:957:1: entryRuleSemaphore returns [EObject current=null] : iv_ruleSemaphore= ruleSemaphore EOF ;
    public final EObject entryRuleSemaphore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemaphore = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:958:2: (iv_ruleSemaphore= ruleSemaphore EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:959:2: iv_ruleSemaphore= ruleSemaphore EOF
            {
             newCompositeNode(grammarAccess.getSemaphoreRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemaphore_in_entryRuleSemaphore2015);
            iv_ruleSemaphore=ruleSemaphore();

            state._fsp--;

             current =iv_ruleSemaphore; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSemaphore2025); 

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
    // $ANTLR end "entryRuleSemaphore"


    // $ANTLR start "ruleSemaphore"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:966:1: ruleSemaphore returns [EObject current=null] : ( () otherlv_1= 'Semaphore' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'canGo' ( (lv_canGo_5_0= ruleEBoolean ) ) )? (otherlv_6= 'secondsRed' ( (lv_secondsRed_7_0= ruleEInt ) ) )? (otherlv_8= 'secondsGreen' ( (lv_secondsGreen_9_0= ruleEInt ) ) )? otherlv_10= 'belongsTo' ( ( ruleEString ) ) otherlv_12= '}' ) ;
    public final EObject ruleSemaphore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_canGo_5_0 = null;

        AntlrDatatypeRuleToken lv_secondsRed_7_0 = null;

        AntlrDatatypeRuleToken lv_secondsGreen_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:969:28: ( ( () otherlv_1= 'Semaphore' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'canGo' ( (lv_canGo_5_0= ruleEBoolean ) ) )? (otherlv_6= 'secondsRed' ( (lv_secondsRed_7_0= ruleEInt ) ) )? (otherlv_8= 'secondsGreen' ( (lv_secondsGreen_9_0= ruleEInt ) ) )? otherlv_10= 'belongsTo' ( ( ruleEString ) ) otherlv_12= '}' ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:970:1: ( () otherlv_1= 'Semaphore' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'canGo' ( (lv_canGo_5_0= ruleEBoolean ) ) )? (otherlv_6= 'secondsRed' ( (lv_secondsRed_7_0= ruleEInt ) ) )? (otherlv_8= 'secondsGreen' ( (lv_secondsGreen_9_0= ruleEInt ) ) )? otherlv_10= 'belongsTo' ( ( ruleEString ) ) otherlv_12= '}' )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:970:1: ( () otherlv_1= 'Semaphore' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'canGo' ( (lv_canGo_5_0= ruleEBoolean ) ) )? (otherlv_6= 'secondsRed' ( (lv_secondsRed_7_0= ruleEInt ) ) )? (otherlv_8= 'secondsGreen' ( (lv_secondsGreen_9_0= ruleEInt ) ) )? otherlv_10= 'belongsTo' ( ( ruleEString ) ) otherlv_12= '}' )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:970:2: () otherlv_1= 'Semaphore' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'canGo' ( (lv_canGo_5_0= ruleEBoolean ) ) )? (otherlv_6= 'secondsRed' ( (lv_secondsRed_7_0= ruleEInt ) ) )? (otherlv_8= 'secondsGreen' ( (lv_secondsGreen_9_0= ruleEInt ) ) )? otherlv_10= 'belongsTo' ( ( ruleEString ) ) otherlv_12= '}'
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:970:2: ()
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:971:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSemaphoreAccess().getSemaphoreAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSemaphore2071); 

                	newLeafNode(otherlv_1, grammarAccess.getSemaphoreAccess().getSemaphoreKeyword_1());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:980:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:981:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:981:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:982:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSemaphoreAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSemaphore2092);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSemaphoreRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSemaphore2104); 

                	newLeafNode(otherlv_3, grammarAccess.getSemaphoreAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1002:1: (otherlv_4= 'canGo' ( (lv_canGo_5_0= ruleEBoolean ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1002:3: otherlv_4= 'canGo' ( (lv_canGo_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSemaphore2117); 

                        	newLeafNode(otherlv_4, grammarAccess.getSemaphoreAccess().getCanGoKeyword_4_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1006:1: ( (lv_canGo_5_0= ruleEBoolean ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1007:1: (lv_canGo_5_0= ruleEBoolean )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1007:1: (lv_canGo_5_0= ruleEBoolean )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1008:3: lv_canGo_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getSemaphoreAccess().getCanGoEBooleanParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleSemaphore2138);
                    lv_canGo_5_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSemaphoreRule());
                    	        }
                           		set(
                           			current, 
                           			"canGo",
                            		lv_canGo_5_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1024:4: (otherlv_6= 'secondsRed' ( (lv_secondsRed_7_0= ruleEInt ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1024:6: otherlv_6= 'secondsRed' ( (lv_secondsRed_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSemaphore2153); 

                        	newLeafNode(otherlv_6, grammarAccess.getSemaphoreAccess().getSecondsRedKeyword_5_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1028:1: ( (lv_secondsRed_7_0= ruleEInt ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1029:1: (lv_secondsRed_7_0= ruleEInt )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1029:1: (lv_secondsRed_7_0= ruleEInt )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1030:3: lv_secondsRed_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSemaphoreAccess().getSecondsRedEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSemaphore2174);
                    lv_secondsRed_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSemaphoreRule());
                    	        }
                           		set(
                           			current, 
                           			"secondsRed",
                            		lv_secondsRed_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1046:4: (otherlv_8= 'secondsGreen' ( (lv_secondsGreen_9_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1046:6: otherlv_8= 'secondsGreen' ( (lv_secondsGreen_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSemaphore2189); 

                        	newLeafNode(otherlv_8, grammarAccess.getSemaphoreAccess().getSecondsGreenKeyword_6_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1050:1: ( (lv_secondsGreen_9_0= ruleEInt ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1051:1: (lv_secondsGreen_9_0= ruleEInt )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1051:1: (lv_secondsGreen_9_0= ruleEInt )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1052:3: lv_secondsGreen_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSemaphoreAccess().getSecondsGreenEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSemaphore2210);
                    lv_secondsGreen_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSemaphoreRule());
                    	        }
                           		set(
                           			current, 
                           			"secondsGreen",
                            		lv_secondsGreen_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSemaphore2224); 

                	newLeafNode(otherlv_10, grammarAccess.getSemaphoreAccess().getBelongsToKeyword_7());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1072:1: ( ( ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1073:1: ( ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1073:1: ( ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1074:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSemaphoreRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSemaphoreAccess().getBelongsToNodeCrossReference_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSemaphore2247);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSemaphore2259); 

                	newLeafNode(otherlv_12, grammarAccess.getSemaphoreAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSemaphore"


    // $ANTLR start "entryRuleSignal_Impl"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1099:1: entryRuleSignal_Impl returns [EObject current=null] : iv_ruleSignal_Impl= ruleSignal_Impl EOF ;
    public final EObject entryRuleSignal_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal_Impl = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1100:2: (iv_ruleSignal_Impl= ruleSignal_Impl EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1101:2: iv_ruleSignal_Impl= ruleSignal_Impl EOF
            {
             newCompositeNode(grammarAccess.getSignal_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignal_Impl_in_entryRuleSignal_Impl2295);
            iv_ruleSignal_Impl=ruleSignal_Impl();

            state._fsp--;

             current =iv_ruleSignal_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignal_Impl2305); 

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
    // $ANTLR end "entryRuleSignal_Impl"


    // $ANTLR start "ruleSignal_Impl"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1108:1: ruleSignal_Impl returns [EObject current=null] : ( () otherlv_1= 'Signal' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'belongsTo' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleSignal_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1111:28: ( ( () otherlv_1= 'Signal' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'belongsTo' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1112:1: ( () otherlv_1= 'Signal' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'belongsTo' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1112:1: ( () otherlv_1= 'Signal' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'belongsTo' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1112:2: () otherlv_1= 'Signal' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'belongsTo' ( ( ruleEString ) ) otherlv_6= '}'
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1112:2: ()
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1113:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSignal_ImplAccess().getSignalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSignal_Impl2351); 

                	newLeafNode(otherlv_1, grammarAccess.getSignal_ImplAccess().getSignalKeyword_1());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1122:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1123:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1123:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1124:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSignal_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSignal_Impl2372);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignal_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSignal_Impl2384); 

                	newLeafNode(otherlv_3, grammarAccess.getSignal_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSignal_Impl2396); 

                	newLeafNode(otherlv_4, grammarAccess.getSignal_ImplAccess().getBelongsToKeyword_4());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1148:1: ( ( ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1149:1: ( ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1149:1: ( ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1150:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSignal_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSignal_ImplAccess().getBelongsToNodeCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSignal_Impl2419);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSignal_Impl2431); 

                	newLeafNode(otherlv_6, grammarAccess.getSignal_ImplAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignal_Impl"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1175:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1176:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1177:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2468);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2479); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1184:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1187:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1188:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1188:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1188:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2519); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1196:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2545); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtractor"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1211:1: entryRuleExtractor returns [EObject current=null] : iv_ruleExtractor= ruleExtractor EOF ;
    public final EObject entryRuleExtractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractor = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1212:2: (iv_ruleExtractor= ruleExtractor EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1213:2: iv_ruleExtractor= ruleExtractor EOF
            {
             newCompositeNode(grammarAccess.getExtractorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtractor_in_entryRuleExtractor2590);
            iv_ruleExtractor=ruleExtractor();

            state._fsp--;

             current =iv_ruleExtractor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtractor2600); 

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
    // $ANTLR end "entryRuleExtractor"


    // $ANTLR start "ruleExtractor"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1220:1: ruleExtractor returns [EObject current=null] : ( () otherlv_1= 'Extractor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'hasStarts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'hasEnds' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' (otherlv_16= 'semaphore' ( ( ruleEString ) ) )? (otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' ) ;
    public final EObject ruleExtractor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1223:28: ( ( () otherlv_1= 'Extractor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'hasStarts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'hasEnds' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' (otherlv_16= 'semaphore' ( ( ruleEString ) ) )? (otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1224:1: ( () otherlv_1= 'Extractor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'hasStarts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'hasEnds' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' (otherlv_16= 'semaphore' ( ( ruleEString ) ) )? (otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1224:1: ( () otherlv_1= 'Extractor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'hasStarts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'hasEnds' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' (otherlv_16= 'semaphore' ( ( ruleEString ) ) )? (otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1224:2: () otherlv_1= 'Extractor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'hasStarts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'hasEnds' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' (otherlv_16= 'semaphore' ( ( ruleEString ) ) )? (otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}'
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1224:2: ()
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1225:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExtractorAccess().getExtractorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleExtractor2646); 

                	newLeafNode(otherlv_1, grammarAccess.getExtractorAccess().getExtractorKeyword_1());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1234:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1235:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1235:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1236:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExtractorAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2667);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractorRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExtractor2679); 

                	newLeafNode(otherlv_3, grammarAccess.getExtractorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1256:1: (otherlv_4= 'hasStarts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1256:3: otherlv_4= 'hasStarts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExtractor2692); 

                        	newLeafNode(otherlv_4, grammarAccess.getExtractorAccess().getHasStartsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtractor2704); 

                        	newLeafNode(otherlv_5, grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1264:1: ( ( ruleEString ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1265:1: ( ruleEString )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1265:1: ( ruleEString )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1266:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtractorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2727);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1279:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1279:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtractor2740); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getExtractorAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1283:1: ( ( ruleEString ) )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1284:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1284:1: ( ruleEString )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1285:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExtractorRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2763);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleExtractor2777); 

                        	newLeafNode(otherlv_9, grammarAccess.getExtractorAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExtractor2791); 

                	newLeafNode(otherlv_10, grammarAccess.getExtractorAccess().getHasEndsKeyword_5());
                
            otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtractor2803); 

                	newLeafNode(otherlv_11, grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_6());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1310:1: ( ( ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1311:1: ( ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1311:1: ( ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1312:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExtractorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2826);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1325:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==14) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1325:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtractor2839); 

            	        	newLeafNode(otherlv_13, grammarAccess.getExtractorAccess().getCommaKeyword_8_0());
            	        
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1329:1: ( ( ruleEString ) )
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1330:1: ( ruleEString )
            	    {
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1330:1: ( ruleEString )
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1331:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExtractorRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2862);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleExtractor2876); 

                	newLeafNode(otherlv_15, grammarAccess.getExtractorAccess().getRightParenthesisKeyword_9());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1348:1: (otherlv_16= 'semaphore' ( ( ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1348:3: otherlv_16= 'semaphore' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleExtractor2889); 

                        	newLeafNode(otherlv_16, grammarAccess.getExtractorAccess().getSemaphoreKeyword_10_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1352:1: ( ( ruleEString ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1353:1: ( ruleEString )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1353:1: ( ruleEString )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1354:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtractorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getExtractorAccess().getSemaphoreSemaphoreCrossReference_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2912);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1367:4: (otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1367:6: otherlv_18= 'signals' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')'
                    {
                    otherlv_18=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleExtractor2927); 

                        	newLeafNode(otherlv_18, grammarAccess.getExtractorAccess().getSignalsKeyword_11_0());
                        
                    otherlv_19=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtractor2939); 

                        	newLeafNode(otherlv_19, grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_11_1());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1375:1: ( ( ruleEString ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1376:1: ( ruleEString )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1376:1: ( ruleEString )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1377:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtractorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2962);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1390:2: (otherlv_21= ',' ( ( ruleEString ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1390:4: otherlv_21= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtractor2975); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getExtractorAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1394:1: ( ( ruleEString ) )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1395:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1395:1: ( ruleEString )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1396:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExtractorRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2998);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleExtractor3012); 

                        	newLeafNode(otherlv_23, grammarAccess.getExtractorAccess().getRightParenthesisKeyword_11_4());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExtractor3026); 

                	newLeafNode(otherlv_24, grammarAccess.getExtractorAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtractor"


    // $ANTLR start "entryRuleInjector"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1425:1: entryRuleInjector returns [EObject current=null] : iv_ruleInjector= ruleInjector EOF ;
    public final EObject entryRuleInjector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInjector = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1426:2: (iv_ruleInjector= ruleInjector EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1427:2: iv_ruleInjector= ruleInjector EOF
            {
             newCompositeNode(grammarAccess.getInjectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInjector_in_entryRuleInjector3062);
            iv_ruleInjector=ruleInjector();

            state._fsp--;

             current =iv_ruleInjector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInjector3072); 

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
    // $ANTLR end "entryRuleInjector"


    // $ANTLR start "ruleInjector"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1434:1: ruleInjector returns [EObject current=null] : ( () otherlv_1= 'Injector' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'carsPerHour' ( (lv_carsPerHour_5_0= ruleEInt ) ) )? otherlv_6= 'hasStarts' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'hasEnds' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'semaphore' ( ( ruleEString ) ) )? (otherlv_20= 'signals' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}' ) ;
    public final EObject ruleInjector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_carsPerHour_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1437:28: ( ( () otherlv_1= 'Injector' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'carsPerHour' ( (lv_carsPerHour_5_0= ruleEInt ) ) )? otherlv_6= 'hasStarts' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'hasEnds' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'semaphore' ( ( ruleEString ) ) )? (otherlv_20= 'signals' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}' ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1438:1: ( () otherlv_1= 'Injector' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'carsPerHour' ( (lv_carsPerHour_5_0= ruleEInt ) ) )? otherlv_6= 'hasStarts' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'hasEnds' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'semaphore' ( ( ruleEString ) ) )? (otherlv_20= 'signals' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}' )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1438:1: ( () otherlv_1= 'Injector' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'carsPerHour' ( (lv_carsPerHour_5_0= ruleEInt ) ) )? otherlv_6= 'hasStarts' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'hasEnds' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'semaphore' ( ( ruleEString ) ) )? (otherlv_20= 'signals' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}' )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1438:2: () otherlv_1= 'Injector' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'carsPerHour' ( (lv_carsPerHour_5_0= ruleEInt ) ) )? otherlv_6= 'hasStarts' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'hasEnds' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'semaphore' ( ( ruleEString ) ) )? (otherlv_20= 'signals' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}'
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1438:2: ()
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1439:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInjectorAccess().getInjectorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleInjector3118); 

                	newLeafNode(otherlv_1, grammarAccess.getInjectorAccess().getInjectorKeyword_1());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1448:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1449:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1449:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1450:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInjectorAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3139);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInjectorRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInjector3151); 

                	newLeafNode(otherlv_3, grammarAccess.getInjectorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1470:1: (otherlv_4= 'carsPerHour' ( (lv_carsPerHour_5_0= ruleEInt ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1470:3: otherlv_4= 'carsPerHour' ( (lv_carsPerHour_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleInjector3164); 

                        	newLeafNode(otherlv_4, grammarAccess.getInjectorAccess().getCarsPerHourKeyword_4_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1474:1: ( (lv_carsPerHour_5_0= ruleEInt ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1475:1: (lv_carsPerHour_5_0= ruleEInt )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1475:1: (lv_carsPerHour_5_0= ruleEInt )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1476:3: lv_carsPerHour_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInjectorAccess().getCarsPerHourEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInjector3185);
                    lv_carsPerHour_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInjectorRule());
                    	        }
                           		set(
                           			current, 
                           			"carsPerHour",
                            		lv_carsPerHour_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInjector3199); 

                	newLeafNode(otherlv_6, grammarAccess.getInjectorAccess().getHasStartsKeyword_5());
                
            otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInjector3211); 

                	newLeafNode(otherlv_7, grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_6());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1500:1: ( ( ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1501:1: ( ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1501:1: ( ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1502:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInjectorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3234);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1515:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==14) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1515:4: otherlv_9= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInjector3247); 

            	        	newLeafNode(otherlv_9, grammarAccess.getInjectorAccess().getCommaKeyword_8_0());
            	        
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1519:1: ( ( ruleEString ) )
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1520:1: ( ruleEString )
            	    {
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1520:1: ( ruleEString )
            	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1521:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInjectorRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3270);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInjector3284); 

                	newLeafNode(otherlv_11, grammarAccess.getInjectorAccess().getRightParenthesisKeyword_9());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1538:1: (otherlv_12= 'hasEnds' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1538:3: otherlv_12= 'hasEnds' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInjector3297); 

                        	newLeafNode(otherlv_12, grammarAccess.getInjectorAccess().getHasEndsKeyword_10_0());
                        
                    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInjector3309); 

                        	newLeafNode(otherlv_13, grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_10_1());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1546:1: ( ( ruleEString ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1547:1: ( ruleEString )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1547:1: ( ruleEString )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1548:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInjectorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3332);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1561:2: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1561:4: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInjector3345); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getInjectorAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1565:1: ( ( ruleEString ) )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1566:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1566:1: ( ruleEString )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1567:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getInjectorRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3368);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInjector3382); 

                        	newLeafNode(otherlv_17, grammarAccess.getInjectorAccess().getRightParenthesisKeyword_10_4());
                        

                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1584:3: (otherlv_18= 'semaphore' ( ( ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1584:5: otherlv_18= 'semaphore' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInjector3397); 

                        	newLeafNode(otherlv_18, grammarAccess.getInjectorAccess().getSemaphoreKeyword_11_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1588:1: ( ( ruleEString ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1589:1: ( ruleEString )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1589:1: ( ruleEString )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1590:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInjectorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInjectorAccess().getSemaphoreSemaphoreCrossReference_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3420);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1603:4: (otherlv_20= 'signals' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==26) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1603:6: otherlv_20= 'signals' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')'
                    {
                    otherlv_20=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInjector3435); 

                        	newLeafNode(otherlv_20, grammarAccess.getInjectorAccess().getSignalsKeyword_12_0());
                        
                    otherlv_21=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInjector3447); 

                        	newLeafNode(otherlv_21, grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_12_1());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1611:1: ( ( ruleEString ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1612:1: ( ruleEString )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1612:1: ( ruleEString )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1613:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInjectorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3470);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1626:2: (otherlv_23= ',' ( ( ruleEString ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==14) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1626:4: otherlv_23= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInjector3483); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getInjectorAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1630:1: ( ( ruleEString ) )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1631:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1631:1: ( ruleEString )
                    	    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1632:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getInjectorRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3506);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInjector3520); 

                        	newLeafNode(otherlv_25, grammarAccess.getInjectorAccess().getRightParenthesisKeyword_12_4());
                        

                    }
                    break;

            }

            otherlv_26=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInjector3534); 

                	newLeafNode(otherlv_26, grammarAccess.getInjectorAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInjector"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1661:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1662:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1663:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3571);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3582); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1670:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1673:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1674:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1674:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1674:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1674:2: (kw= '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1675:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEInt3621); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3638); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDate"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1695:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1696:2: (iv_ruleEDate= ruleEDate EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1697:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDate_in_entryRuleEDate3684);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDate3695); 

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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1704:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1707:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1708:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEDate3734); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1723:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1724:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1725:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean3779);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean3790); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1732:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1735:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1736:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1736:1: (kw= 'true' | kw= 'false' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==45) ) {
                alt43=1;
            }
            else if ( (LA43_0==46) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1737:2: kw= 'true'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEBoolean3828); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1744:2: kw= 'false'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEBoolean3847); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleSpeedlimit"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1757:1: entryRuleSpeedlimit returns [EObject current=null] : iv_ruleSpeedlimit= ruleSpeedlimit EOF ;
    public final EObject entryRuleSpeedlimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedlimit = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1758:2: (iv_ruleSpeedlimit= ruleSpeedlimit EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1759:2: iv_ruleSpeedlimit= ruleSpeedlimit EOF
            {
             newCompositeNode(grammarAccess.getSpeedlimitRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpeedlimit_in_entryRuleSpeedlimit3887);
            iv_ruleSpeedlimit=ruleSpeedlimit();

            state._fsp--;

             current =iv_ruleSpeedlimit; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpeedlimit3897); 

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
    // $ANTLR end "entryRuleSpeedlimit"


    // $ANTLR start "ruleSpeedlimit"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1766:1: ruleSpeedlimit returns [EObject current=null] : (otherlv_0= 'Speedlimit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Speed' ( (lv_Speed_4_0= ruleEInt ) ) )? otherlv_5= 'belongsTo' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleSpeedlimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_Speed_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1769:28: ( (otherlv_0= 'Speedlimit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Speed' ( (lv_Speed_4_0= ruleEInt ) ) )? otherlv_5= 'belongsTo' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1770:1: (otherlv_0= 'Speedlimit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Speed' ( (lv_Speed_4_0= ruleEInt ) ) )? otherlv_5= 'belongsTo' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1770:1: (otherlv_0= 'Speedlimit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Speed' ( (lv_Speed_4_0= ruleEInt ) ) )? otherlv_5= 'belongsTo' ( ( ruleEString ) ) otherlv_7= '}' )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1770:3: otherlv_0= 'Speedlimit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Speed' ( (lv_Speed_4_0= ruleEInt ) ) )? otherlv_5= 'belongsTo' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleSpeedlimit3934); 

                	newLeafNode(otherlv_0, grammarAccess.getSpeedlimitAccess().getSpeedlimitKeyword_0());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1774:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1775:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1775:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1776:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSpeedlimitAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSpeedlimit3955);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSpeedlimitRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSpeedlimit3967); 

                	newLeafNode(otherlv_2, grammarAccess.getSpeedlimitAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1796:1: (otherlv_3= 'Speed' ( (lv_Speed_4_0= ruleEInt ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1796:3: otherlv_3= 'Speed' ( (lv_Speed_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleSpeedlimit3980); 

                        	newLeafNode(otherlv_3, grammarAccess.getSpeedlimitAccess().getSpeedKeyword_3_0());
                        
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1800:1: ( (lv_Speed_4_0= ruleEInt ) )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1801:1: (lv_Speed_4_0= ruleEInt )
                    {
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1801:1: (lv_Speed_4_0= ruleEInt )
                    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1802:3: lv_Speed_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpeedlimitAccess().getSpeedEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSpeedlimit4001);
                    lv_Speed_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpeedlimitRule());
                    	        }
                           		set(
                           			current, 
                           			"Speed",
                            		lv_Speed_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSpeedlimit4015); 

                	newLeafNode(otherlv_5, grammarAccess.getSpeedlimitAccess().getBelongsToKeyword_4());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1822:1: ( ( ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1823:1: ( ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1823:1: ( ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1824:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSpeedlimitRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSpeedlimitAccess().getBelongsToNodeCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSpeedlimit4038);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSpeedlimit4050); 

                	newLeafNode(otherlv_7, grammarAccess.getSpeedlimitAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpeedlimit"


    // $ANTLR start "entryRuleStop"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1849:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1850:2: (iv_ruleStop= ruleStop EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1851:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStop_in_entryRuleStop4086);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStop4096); 

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
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1858:1: ruleStop returns [EObject current=null] : (otherlv_0= 'Stop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'belongsTo' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1861:28: ( (otherlv_0= 'Stop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'belongsTo' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1862:1: (otherlv_0= 'Stop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'belongsTo' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1862:1: (otherlv_0= 'Stop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'belongsTo' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1862:3: otherlv_0= 'Stop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'belongsTo' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleStop4133); 

                	newLeafNode(otherlv_0, grammarAccess.getStopAccess().getStopKeyword_0());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1866:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1867:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1867:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1868:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStopAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStop4154);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStopRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStop4166); 

                	newLeafNode(otherlv_2, grammarAccess.getStopAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleStop4178); 

                	newLeafNode(otherlv_3, grammarAccess.getStopAccess().getBelongsToKeyword_3());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1892:1: ( ( ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1893:1: ( ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1893:1: ( ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1894:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStopRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStopAccess().getBelongsToNodeCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStop4201);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStop4213); 

                	newLeafNode(otherlv_5, grammarAccess.getStopAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleYield"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1919:1: entryRuleYield returns [EObject current=null] : iv_ruleYield= ruleYield EOF ;
    public final EObject entryRuleYield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYield = null;


        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1920:2: (iv_ruleYield= ruleYield EOF )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1921:2: iv_ruleYield= ruleYield EOF
            {
             newCompositeNode(grammarAccess.getYieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleYield_in_entryRuleYield4249);
            iv_ruleYield=ruleYield();

            state._fsp--;

             current =iv_ruleYield; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleYield4259); 

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
    // $ANTLR end "entryRuleYield"


    // $ANTLR start "ruleYield"
    // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1928:1: ruleYield returns [EObject current=null] : (otherlv_0= 'Yield' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'belongsTo' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleYield() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1931:28: ( (otherlv_0= 'Yield' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'belongsTo' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1932:1: (otherlv_0= 'Yield' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'belongsTo' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1932:1: (otherlv_0= 'Yield' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'belongsTo' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1932:3: otherlv_0= 'Yield' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'belongsTo' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleYield4296); 

                	newLeafNode(otherlv_0, grammarAccess.getYieldAccess().getYieldKeyword_0());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1936:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1937:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1937:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1938:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getYieldAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleYield4317);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getYieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleYield4329); 

                	newLeafNode(otherlv_2, grammarAccess.getYieldAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleYield4341); 

                	newLeafNode(otherlv_3, grammarAccess.getYieldAccess().getBelongsToKeyword_3());
                
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1962:1: ( ( ruleEString ) )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1963:1: ( ruleEString )
            {
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1963:1: ( ruleEString )
            // ../org.xtext.Highway/src-gen/org/xtext/parser/antlr/internal/InternalHighway.g:1964:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getYieldRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getYieldAccess().getBelongsToNodeCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleYield4364);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleYield4376); 

                	newLeafNode(otherlv_5, grammarAccess.getYieldAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYield"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleHighway_in_entryRuleHighway75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHighway85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleHighway131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHighway143 = new BitSet(new long[]{0x00000000000FA000L});
        public static final BitSet FOLLOW_13_in_ruleHighway156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHighway168 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleSegment_in_ruleHighway189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleHighway202 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleSegment_in_ruleHighway223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleHighway237 = new BitSet(new long[]{0x00000000000F8000L});
        public static final BitSet FOLLOW_16_in_ruleHighway252 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHighway264 = new BitSet(new long[]{0x0000060000100000L});
        public static final BitSet FOLLOW_ruleNode_in_ruleHighway285 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleHighway298 = new BitSet(new long[]{0x0000060000100000L});
        public static final BitSet FOLLOW_ruleNode_in_ruleHighway319 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleHighway333 = new BitSet(new long[]{0x00000000000E8000L});
        public static final BitSet FOLLOW_17_in_ruleHighway348 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHighway360 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleCar_in_ruleHighway381 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleHighway394 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleCar_in_ruleHighway415 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleHighway429 = new BitSet(new long[]{0x00000000000C8000L});
        public static final BitSet FOLLOW_18_in_ruleHighway444 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHighway456 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleSemaphore_in_ruleHighway477 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleHighway490 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleSemaphore_in_ruleHighway511 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleHighway525 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleHighway540 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHighway552 = new BitSet(new long[]{0x0006810000000000L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleHighway573 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleHighway586 = new BitSet(new long[]{0x0006810000000000L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleHighway607 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleHighway621 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleHighway635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_entryRuleNode671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNode681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_Impl_in_ruleNode728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractor_in_ruleNode755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInjector_in_ruleNode782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal817 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignal827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_Impl_in_ruleSignal874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpeedlimit_in_ruleSignal901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_ruleSignal928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYield_in_ruleSignal955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_Impl_in_entryRuleNode_Impl990 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNode_Impl1000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleNode_Impl1046 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1067 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNode_Impl1079 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleNode_Impl1091 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleNode_Impl1103 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1126 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleNode_Impl1139 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1162 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleNode_Impl1176 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleNode_Impl1188 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleNode_Impl1200 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1223 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleNode_Impl1236 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1259 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleNode_Impl1273 = new BitSet(new long[]{0x0000000006008000L});
        public static final BitSet FOLLOW_25_in_ruleNode_Impl1286 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1309 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleNode_Impl1324 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleNode_Impl1336 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1359 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleNode_Impl1372 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1395 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleNode_Impl1409 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleNode_Impl1423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCar_in_entryRuleCar1459 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCar1469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleCar1515 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCar1536 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCar1548 = new BitSet(new long[]{0x0000000070008000L});
        public static final BitSet FOLLOW_28_in_ruleCar1561 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEDate_in_ruleCar1582 = new BitSet(new long[]{0x0000000060008000L});
        public static final BitSet FOLLOW_29_in_ruleCar1597 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEDate_in_ruleCar1618 = new BitSet(new long[]{0x0000000040008000L});
        public static final BitSet FOLLOW_30_in_ruleCar1633 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCar1656 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCar1670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSegment_in_entryRuleSegment1706 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSegment1716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSegment1762 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSegment1783 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSegment1795 = new BitSet(new long[]{0x0000000700008000L});
        public static final BitSet FOLLOW_32_in_ruleSegment1808 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSegment1829 = new BitSet(new long[]{0x0000000600008000L});
        public static final BitSet FOLLOW_33_in_ruleSegment1844 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSegment1865 = new BitSet(new long[]{0x0000000400008000L});
        public static final BitSet FOLLOW_34_in_ruleSegment1880 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleSegment1892 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSegment1915 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleSegment1928 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSegment1951 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleSegment1965 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSegment1979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemaphore_in_entryRuleSemaphore2015 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSemaphore2025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleSemaphore2071 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSemaphore2092 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSemaphore2104 = new BitSet(new long[]{0x000000F000000000L});
        public static final BitSet FOLLOW_36_in_ruleSemaphore2117 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleSemaphore2138 = new BitSet(new long[]{0x000000E000000000L});
        public static final BitSet FOLLOW_37_in_ruleSemaphore2153 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSemaphore2174 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_38_in_ruleSemaphore2189 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSemaphore2210 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleSemaphore2224 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSemaphore2247 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSemaphore2259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_Impl_in_entryRuleSignal_Impl2295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignal_Impl2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleSignal_Impl2351 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSignal_Impl2372 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSignal_Impl2384 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleSignal_Impl2396 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSignal_Impl2419 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSignal_Impl2431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2468 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractor_in_entryRuleExtractor2590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtractor2600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleExtractor2646 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2667 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExtractor2679 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_21_in_ruleExtractor2692 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleExtractor2704 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2727 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleExtractor2740 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2763 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleExtractor2777 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleExtractor2791 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleExtractor2803 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2826 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleExtractor2839 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2862 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleExtractor2876 = new BitSet(new long[]{0x0000000006008000L});
        public static final BitSet FOLLOW_25_in_ruleExtractor2889 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2912 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleExtractor2927 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleExtractor2939 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2962 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleExtractor2975 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2998 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleExtractor3012 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleExtractor3026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInjector_in_entryRuleInjector3062 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInjector3072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleInjector3118 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3139 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInjector3151 = new BitSet(new long[]{0x0000080000200000L});
        public static final BitSet FOLLOW_43_in_ruleInjector3164 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInjector3185 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleInjector3199 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInjector3211 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3234 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleInjector3247 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3270 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleInjector3284 = new BitSet(new long[]{0x0000000007008000L});
        public static final BitSet FOLLOW_24_in_ruleInjector3297 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInjector3309 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3332 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleInjector3345 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3368 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleInjector3382 = new BitSet(new long[]{0x0000000006008000L});
        public static final BitSet FOLLOW_25_in_ruleInjector3397 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3420 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleInjector3435 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInjector3447 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3470 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleInjector3483 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3506 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleInjector3520 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInjector3534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEInt3621 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDate_in_entryRuleEDate3684 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDate3695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEDate3734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean3779 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean3790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEBoolean3828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEBoolean3847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpeedlimit_in_entryRuleSpeedlimit3887 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpeedlimit3897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleSpeedlimit3934 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSpeedlimit3955 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSpeedlimit3967 = new BitSet(new long[]{0x0001008000000000L});
        public static final BitSet FOLLOW_48_in_ruleSpeedlimit3980 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSpeedlimit4001 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleSpeedlimit4015 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSpeedlimit4038 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSpeedlimit4050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_entryRuleStop4086 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStop4096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleStop4133 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStop4154 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStop4166 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleStop4178 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStop4201 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleStop4213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYield_in_entryRuleYield4249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleYield4259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleYield4296 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleYield4317 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleYield4329 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleYield4341 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleYield4364 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleYield4376 = new BitSet(new long[]{0x0000000000000002L});
    }


}