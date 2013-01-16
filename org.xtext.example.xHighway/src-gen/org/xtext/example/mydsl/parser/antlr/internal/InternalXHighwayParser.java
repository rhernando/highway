package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.XHighwayGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXHighwayParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Highway'", "'{'", "'initNodes'", "','", "'}'", "'initCars'", "'initSegments'", "'initSemaphore'", "'initSignal'", "'Node'", "'hasStarts'", "'('", "')'", "'hasEnds'", "'semaphore'", "'signals'", "'Car'", "'timeIn'", "'timeOut'", "'isInSegment'", "'Segment'", "'numLanes'", "'length'", "'hasCars'", "'Semaphore'", "'canGo'", "'secondsRed'", "'secondsGreen'", "'belongsTo'", "'Signal'", "'Extractor'", "'Injector'", "'carsPerHour'", "'-'", "'true'", "'false'", "'Speedlimit'", "'Speed'", "'Stop'", "'Yield'"
    };
    public static final int RULE_ID=6;
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
    public static final int RULE_INT=4;
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
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g"; }



     	private XHighwayGrammarAccess grammarAccess;
     	
        public InternalXHighwayParser(TokenStream input, XHighwayGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Highway";	
       	}
       	
       	@Override
       	protected XHighwayGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleHighway"
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:67:1: entryRuleHighway returns [EObject current=null] : iv_ruleHighway= ruleHighway EOF ;
    public final EObject entryRuleHighway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighway = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:68:2: (iv_ruleHighway= ruleHighway EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:69:2: iv_ruleHighway= ruleHighway EOF
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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:76:1: ruleHighway returns [EObject current=null] : ( () otherlv_1= 'Highway' otherlv_2= '{' (otherlv_3= 'initNodes' otherlv_4= '{' ( (lv_initNodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_initNodes_7_0= ruleNode ) ) )* otherlv_8= '}' )? (otherlv_9= 'initCars' otherlv_10= '{' ( (lv_initCars_11_0= ruleCar ) ) (otherlv_12= ',' ( (lv_initCars_13_0= ruleCar ) ) )* otherlv_14= '}' )? (otherlv_15= 'initSegments' otherlv_16= '{' ( (lv_initSegments_17_0= ruleSegment ) ) (otherlv_18= ',' ( (lv_initSegments_19_0= ruleSegment ) ) )* otherlv_20= '}' )? (otherlv_21= 'initSemaphore' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}' )? (otherlv_27= 'initSignal' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) ;
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
        EObject lv_initNodes_5_0 = null;

        EObject lv_initNodes_7_0 = null;

        EObject lv_initCars_11_0 = null;

        EObject lv_initCars_13_0 = null;

        EObject lv_initSegments_17_0 = null;

        EObject lv_initSegments_19_0 = null;

        EObject lv_initSemaphore_23_0 = null;

        EObject lv_initSemaphore_25_0 = null;

        EObject lv_initSignal_29_0 = null;

        EObject lv_initSignal_31_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:79:28: ( ( () otherlv_1= 'Highway' otherlv_2= '{' (otherlv_3= 'initNodes' otherlv_4= '{' ( (lv_initNodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_initNodes_7_0= ruleNode ) ) )* otherlv_8= '}' )? (otherlv_9= 'initCars' otherlv_10= '{' ( (lv_initCars_11_0= ruleCar ) ) (otherlv_12= ',' ( (lv_initCars_13_0= ruleCar ) ) )* otherlv_14= '}' )? (otherlv_15= 'initSegments' otherlv_16= '{' ( (lv_initSegments_17_0= ruleSegment ) ) (otherlv_18= ',' ( (lv_initSegments_19_0= ruleSegment ) ) )* otherlv_20= '}' )? (otherlv_21= 'initSemaphore' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}' )? (otherlv_27= 'initSignal' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:80:1: ( () otherlv_1= 'Highway' otherlv_2= '{' (otherlv_3= 'initNodes' otherlv_4= '{' ( (lv_initNodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_initNodes_7_0= ruleNode ) ) )* otherlv_8= '}' )? (otherlv_9= 'initCars' otherlv_10= '{' ( (lv_initCars_11_0= ruleCar ) ) (otherlv_12= ',' ( (lv_initCars_13_0= ruleCar ) ) )* otherlv_14= '}' )? (otherlv_15= 'initSegments' otherlv_16= '{' ( (lv_initSegments_17_0= ruleSegment ) ) (otherlv_18= ',' ( (lv_initSegments_19_0= ruleSegment ) ) )* otherlv_20= '}' )? (otherlv_21= 'initSemaphore' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}' )? (otherlv_27= 'initSignal' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:80:1: ( () otherlv_1= 'Highway' otherlv_2= '{' (otherlv_3= 'initNodes' otherlv_4= '{' ( (lv_initNodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_initNodes_7_0= ruleNode ) ) )* otherlv_8= '}' )? (otherlv_9= 'initCars' otherlv_10= '{' ( (lv_initCars_11_0= ruleCar ) ) (otherlv_12= ',' ( (lv_initCars_13_0= ruleCar ) ) )* otherlv_14= '}' )? (otherlv_15= 'initSegments' otherlv_16= '{' ( (lv_initSegments_17_0= ruleSegment ) ) (otherlv_18= ',' ( (lv_initSegments_19_0= ruleSegment ) ) )* otherlv_20= '}' )? (otherlv_21= 'initSemaphore' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}' )? (otherlv_27= 'initSignal' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:80:2: () otherlv_1= 'Highway' otherlv_2= '{' (otherlv_3= 'initNodes' otherlv_4= '{' ( (lv_initNodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_initNodes_7_0= ruleNode ) ) )* otherlv_8= '}' )? (otherlv_9= 'initCars' otherlv_10= '{' ( (lv_initCars_11_0= ruleCar ) ) (otherlv_12= ',' ( (lv_initCars_13_0= ruleCar ) ) )* otherlv_14= '}' )? (otherlv_15= 'initSegments' otherlv_16= '{' ( (lv_initSegments_17_0= ruleSegment ) ) (otherlv_18= ',' ( (lv_initSegments_19_0= ruleSegment ) ) )* otherlv_20= '}' )? (otherlv_21= 'initSemaphore' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}' )? (otherlv_27= 'initSignal' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}' )? otherlv_33= '}'
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:80:2: ()
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHighwayAccess().getHighwayAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHighway131); 

                	newLeafNode(otherlv_1, grammarAccess.getHighwayAccess().getHighwayKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHighway143); 

                	newLeafNode(otherlv_2, grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:94:1: (otherlv_3= 'initNodes' otherlv_4= '{' ( (lv_initNodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_initNodes_7_0= ruleNode ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:94:3: otherlv_3= 'initNodes' otherlv_4= '{' ( (lv_initNodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_initNodes_7_0= ruleNode ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHighway156); 

                        	newLeafNode(otherlv_3, grammarAccess.getHighwayAccess().getInitNodesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHighway168); 

                        	newLeafNode(otherlv_4, grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:102:1: ( (lv_initNodes_5_0= ruleNode ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:103:1: (lv_initNodes_5_0= ruleNode )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:103:1: (lv_initNodes_5_0= ruleNode )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:104:3: lv_initNodes_5_0= ruleNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNode_in_ruleHighway189);
                    lv_initNodes_5_0=ruleNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	        }
                           		add(
                           			current, 
                           			"initNodes",
                            		lv_initNodes_5_0, 
                            		"Node");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:120:2: (otherlv_6= ',' ( (lv_initNodes_7_0= ruleNode ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:120:4: otherlv_6= ',' ( (lv_initNodes_7_0= ruleNode ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHighway202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getHighwayAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:124:1: ( (lv_initNodes_7_0= ruleNode ) )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:125:1: (lv_initNodes_7_0= ruleNode )
                    	    {
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:125:1: (lv_initNodes_7_0= ruleNode )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:126:3: lv_initNodes_7_0= ruleNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitNodesNodeParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleNode_in_ruleHighway223);
                    	    lv_initNodes_7_0=ruleNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initNodes",
                    	            		lv_initNodes_7_0, 
                    	            		"Node");
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

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:146:3: (otherlv_9= 'initCars' otherlv_10= '{' ( (lv_initCars_11_0= ruleCar ) ) (otherlv_12= ',' ( (lv_initCars_13_0= ruleCar ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:146:5: otherlv_9= 'initCars' otherlv_10= '{' ( (lv_initCars_11_0= ruleCar ) ) (otherlv_12= ',' ( (lv_initCars_13_0= ruleCar ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleHighway252); 

                        	newLeafNode(otherlv_9, grammarAccess.getHighwayAccess().getInitCarsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHighway264); 

                        	newLeafNode(otherlv_10, grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:154:1: ( (lv_initCars_11_0= ruleCar ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:155:1: (lv_initCars_11_0= ruleCar )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:155:1: (lv_initCars_11_0= ruleCar )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:156:3: lv_initCars_11_0= ruleCar
                    {
                     
                    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCar_in_ruleHighway285);
                    lv_initCars_11_0=ruleCar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	        }
                           		add(
                           			current, 
                           			"initCars",
                            		lv_initCars_11_0, 
                            		"Car");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:172:2: (otherlv_12= ',' ( (lv_initCars_13_0= ruleCar ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:172:4: otherlv_12= ',' ( (lv_initCars_13_0= ruleCar ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHighway298); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getHighwayAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:176:1: ( (lv_initCars_13_0= ruleCar ) )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:177:1: (lv_initCars_13_0= ruleCar )
                    	    {
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:177:1: (lv_initCars_13_0= ruleCar )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:178:3: lv_initCars_13_0= ruleCar
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitCarsCarParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCar_in_ruleHighway319);
                    	    lv_initCars_13_0=ruleCar();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initCars",
                    	            		lv_initCars_13_0, 
                    	            		"Car");
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

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:198:3: (otherlv_15= 'initSegments' otherlv_16= '{' ( (lv_initSegments_17_0= ruleSegment ) ) (otherlv_18= ',' ( (lv_initSegments_19_0= ruleSegment ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:198:5: otherlv_15= 'initSegments' otherlv_16= '{' ( (lv_initSegments_17_0= ruleSegment ) ) (otherlv_18= ',' ( (lv_initSegments_19_0= ruleSegment ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleHighway348); 

                        	newLeafNode(otherlv_15, grammarAccess.getHighwayAccess().getInitSegmentsKeyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHighway360); 

                        	newLeafNode(otherlv_16, grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:206:1: ( (lv_initSegments_17_0= ruleSegment ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:207:1: (lv_initSegments_17_0= ruleSegment )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:207:1: (lv_initSegments_17_0= ruleSegment )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:208:3: lv_initSegments_17_0= ruleSegment
                    {
                     
                    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSegment_in_ruleHighway381);
                    lv_initSegments_17_0=ruleSegment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	        }
                           		add(
                           			current, 
                           			"initSegments",
                            		lv_initSegments_17_0, 
                            		"Segment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:224:2: (otherlv_18= ',' ( (lv_initSegments_19_0= ruleSegment ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:224:4: otherlv_18= ',' ( (lv_initSegments_19_0= ruleSegment ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHighway394); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getHighwayAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:228:1: ( (lv_initSegments_19_0= ruleSegment ) )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:229:1: (lv_initSegments_19_0= ruleSegment )
                    	    {
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:229:1: (lv_initSegments_19_0= ruleSegment )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:230:3: lv_initSegments_19_0= ruleSegment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHighwayAccess().getInitSegmentsSegmentParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSegment_in_ruleHighway415);
                    	    lv_initSegments_19_0=ruleSegment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHighwayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initSegments",
                    	            		lv_initSegments_19_0, 
                    	            		"Segment");
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

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:250:3: (otherlv_21= 'initSemaphore' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:250:5: otherlv_21= 'initSemaphore' otherlv_22= '{' ( (lv_initSemaphore_23_0= ruleSemaphore ) ) (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleHighway444); 

                        	newLeafNode(otherlv_21, grammarAccess.getHighwayAccess().getInitSemaphoreKeyword_6_0());
                        
                    otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHighway456); 

                        	newLeafNode(otherlv_22, grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:258:1: ( (lv_initSemaphore_23_0= ruleSemaphore ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:259:1: (lv_initSemaphore_23_0= ruleSemaphore )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:259:1: (lv_initSemaphore_23_0= ruleSemaphore )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:260:3: lv_initSemaphore_23_0= ruleSemaphore
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

                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:276:2: (otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:276:4: otherlv_24= ',' ( (lv_initSemaphore_25_0= ruleSemaphore ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHighway490); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getHighwayAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:280:1: ( (lv_initSemaphore_25_0= ruleSemaphore ) )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:281:1: (lv_initSemaphore_25_0= ruleSemaphore )
                    	    {
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:281:1: (lv_initSemaphore_25_0= ruleSemaphore )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:282:3: lv_initSemaphore_25_0= ruleSemaphore
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

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:302:3: (otherlv_27= 'initSignal' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:302:5: otherlv_27= 'initSignal' otherlv_28= '{' ( (lv_initSignal_29_0= ruleSignal ) ) (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleHighway540); 

                        	newLeafNode(otherlv_27, grammarAccess.getHighwayAccess().getInitSignalKeyword_7_0());
                        
                    otherlv_28=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHighway552); 

                        	newLeafNode(otherlv_28, grammarAccess.getHighwayAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:310:1: ( (lv_initSignal_29_0= ruleSignal ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:311:1: (lv_initSignal_29_0= ruleSignal )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:311:1: (lv_initSignal_29_0= ruleSignal )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:312:3: lv_initSignal_29_0= ruleSignal
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

                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:328:2: (otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:328:4: otherlv_30= ',' ( (lv_initSignal_31_0= ruleSignal ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHighway586); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getHighwayAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:332:1: ( (lv_initSignal_31_0= ruleSignal ) )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:333:1: (lv_initSignal_31_0= ruleSignal )
                    	    {
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:333:1: (lv_initSignal_31_0= ruleSignal )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:334:3: lv_initSignal_31_0= ruleSignal
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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:366:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:367:2: (iv_ruleNode= ruleNode EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:368:2: iv_ruleNode= ruleNode EOF
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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:375:1: ruleNode returns [EObject current=null] : (this_Node_Impl_0= ruleNode_Impl | this_Extractor_1= ruleExtractor | this_Injector_2= ruleInjector ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Node_Impl_0 = null;

        EObject this_Extractor_1 = null;

        EObject this_Injector_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:378:28: ( (this_Node_Impl_0= ruleNode_Impl | this_Extractor_1= ruleExtractor | this_Injector_2= ruleInjector ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:379:1: (this_Node_Impl_0= ruleNode_Impl | this_Extractor_1= ruleExtractor | this_Injector_2= ruleInjector )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:379:1: (this_Node_Impl_0= ruleNode_Impl | this_Extractor_1= ruleExtractor | this_Injector_2= ruleInjector )
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
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:380:5: this_Node_Impl_0= ruleNode_Impl
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
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:390:5: this_Extractor_1= ruleExtractor
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
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:400:5: this_Injector_2= ruleInjector
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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:416:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:417:2: (iv_ruleSignal= ruleSignal EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:418:2: iv_ruleSignal= ruleSignal EOF
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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:425:1: ruleSignal returns [EObject current=null] : (this_Signal_Impl_0= ruleSignal_Impl | this_Speedlimit_1= ruleSpeedlimit | this_Stop_2= ruleStop | this_Yield_3= ruleYield ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        EObject this_Signal_Impl_0 = null;

        EObject this_Speedlimit_1 = null;

        EObject this_Stop_2 = null;

        EObject this_Yield_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:428:28: ( (this_Signal_Impl_0= ruleSignal_Impl | this_Speedlimit_1= ruleSpeedlimit | this_Stop_2= ruleStop | this_Yield_3= ruleYield ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:429:1: (this_Signal_Impl_0= ruleSignal_Impl | this_Speedlimit_1= ruleSpeedlimit | this_Stop_2= ruleStop | this_Yield_3= ruleYield )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:429:1: (this_Signal_Impl_0= ruleSignal_Impl | this_Speedlimit_1= ruleSpeedlimit | this_Stop_2= ruleStop | this_Yield_3= ruleYield )
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
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:430:5: this_Signal_Impl_0= ruleSignal_Impl
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
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:440:5: this_Speedlimit_1= ruleSpeedlimit
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
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:450:5: this_Stop_2= ruleStop
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
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:460:5: this_Yield_3= ruleYield
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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:476:1: entryRuleNode_Impl returns [EObject current=null] : iv_ruleNode_Impl= ruleNode_Impl EOF ;
    public final EObject entryRuleNode_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode_Impl = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:477:2: (iv_ruleNode_Impl= ruleNode_Impl EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:478:2: iv_ruleNode_Impl= ruleNode_Impl EOF
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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:485:1: ruleNode_Impl returns [EObject current=null] : ( () otherlv_1= 'Node' otherlv_2= '{' otherlv_3= 'hasStarts' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'hasEnds' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'semaphore' ( ( ruleEString ) ) )? (otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' ) ;
    public final EObject ruleNode_Impl() throws RecognitionException {
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
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:488:28: ( ( () otherlv_1= 'Node' otherlv_2= '{' otherlv_3= 'hasStarts' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'hasEnds' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'semaphore' ( ( ruleEString ) ) )? (otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:489:1: ( () otherlv_1= 'Node' otherlv_2= '{' otherlv_3= 'hasStarts' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'hasEnds' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'semaphore' ( ( ruleEString ) ) )? (otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:489:1: ( () otherlv_1= 'Node' otherlv_2= '{' otherlv_3= 'hasStarts' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'hasEnds' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'semaphore' ( ( ruleEString ) ) )? (otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:489:2: () otherlv_1= 'Node' otherlv_2= '{' otherlv_3= 'hasStarts' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'hasEnds' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'semaphore' ( ( ruleEString ) ) )? (otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}'
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:489:2: ()
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:490:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNode_ImplAccess().getNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNode_Impl1046); 

                	newLeafNode(otherlv_1, grammarAccess.getNode_ImplAccess().getNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNode_Impl1058); 

                	newLeafNode(otherlv_2, grammarAccess.getNode_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNode_Impl1070); 

                	newLeafNode(otherlv_3, grammarAccess.getNode_ImplAccess().getHasStartsKeyword_3());
                
            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNode_Impl1082); 

                	newLeafNode(otherlv_4, grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_4());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:511:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:512:1: ( ruleEString )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:512:1: ( ruleEString )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:513:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNode_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1105);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:526:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:526:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNode_Impl1118); 

            	        	newLeafNode(otherlv_6, grammarAccess.getNode_ImplAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:530:1: ( ( ruleEString ) )
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:531:1: ( ruleEString )
            	    {
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:531:1: ( ruleEString )
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:532:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNode_ImplRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getNode_ImplAccess().getHasStartsSegmentCrossReference_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1141);
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

            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNode_Impl1155); 

                	newLeafNode(otherlv_8, grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_7());
                
            otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNode_Impl1167); 

                	newLeafNode(otherlv_9, grammarAccess.getNode_ImplAccess().getHasEndsKeyword_8());
                
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNode_Impl1179); 

                	newLeafNode(otherlv_10, grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_9());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:557:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:558:1: ( ruleEString )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:558:1: ( ruleEString )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:559:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNode_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1202);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:572:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:572:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNode_Impl1215); 

            	        	newLeafNode(otherlv_12, grammarAccess.getNode_ImplAccess().getCommaKeyword_11_0());
            	        
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:576:1: ( ( ruleEString ) )
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:577:1: ( ruleEString )
            	    {
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:577:1: ( ruleEString )
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:578:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNode_ImplRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getNode_ImplAccess().getHasEndsSegmentCrossReference_11_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1238);
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

            otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNode_Impl1252); 

                	newLeafNode(otherlv_14, grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_12());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:595:1: (otherlv_15= 'semaphore' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:595:3: otherlv_15= 'semaphore' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNode_Impl1265); 

                        	newLeafNode(otherlv_15, grammarAccess.getNode_ImplAccess().getSemaphoreKeyword_13_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:599:1: ( ( ruleEString ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:600:1: ( ruleEString )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:600:1: ( ruleEString )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:601:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNode_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNode_ImplAccess().getSemaphoreSemaphoreCrossReference_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1288);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:614:4: (otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:614:6: otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNode_Impl1303); 

                        	newLeafNode(otherlv_17, grammarAccess.getNode_ImplAccess().getSignalsKeyword_14_0());
                        
                    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNode_Impl1315); 

                        	newLeafNode(otherlv_18, grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_14_1());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:622:1: ( ( ruleEString ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:623:1: ( ruleEString )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:623:1: ( ruleEString )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:624:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNode_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1338);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:637:2: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:637:4: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNode_Impl1351); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getNode_ImplAccess().getCommaKeyword_14_3_0());
                    	        
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:641:1: ( ( ruleEString ) )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:642:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:642:1: ( ruleEString )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:643:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNode_ImplRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getNode_ImplAccess().getSignalsSignalCrossReference_14_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNode_Impl1374);
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

                    otherlv_22=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNode_Impl1388); 

                        	newLeafNode(otherlv_22, grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_14_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNode_Impl1402); 

                	newLeafNode(otherlv_23, grammarAccess.getNode_ImplAccess().getRightCurlyBracketKeyword_15());
                

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:672:1: entryRuleCar returns [EObject current=null] : iv_ruleCar= ruleCar EOF ;
    public final EObject entryRuleCar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCar = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:673:2: (iv_ruleCar= ruleCar EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:674:2: iv_ruleCar= ruleCar EOF
            {
             newCompositeNode(grammarAccess.getCarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCar_in_entryRuleCar1438);
            iv_ruleCar=ruleCar();

            state._fsp--;

             current =iv_ruleCar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCar1448); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:681:1: ruleCar returns [EObject current=null] : ( () otherlv_1= 'Car' otherlv_2= '{' (otherlv_3= 'timeIn' ( (lv_timeIn_4_0= ruleEDate ) ) )? (otherlv_5= 'timeOut' ( (lv_timeOut_6_0= ruleEDate ) ) )? (otherlv_7= 'isInSegment' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleCar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_timeIn_4_0 = null;

        AntlrDatatypeRuleToken lv_timeOut_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:684:28: ( ( () otherlv_1= 'Car' otherlv_2= '{' (otherlv_3= 'timeIn' ( (lv_timeIn_4_0= ruleEDate ) ) )? (otherlv_5= 'timeOut' ( (lv_timeOut_6_0= ruleEDate ) ) )? (otherlv_7= 'isInSegment' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:685:1: ( () otherlv_1= 'Car' otherlv_2= '{' (otherlv_3= 'timeIn' ( (lv_timeIn_4_0= ruleEDate ) ) )? (otherlv_5= 'timeOut' ( (lv_timeOut_6_0= ruleEDate ) ) )? (otherlv_7= 'isInSegment' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:685:1: ( () otherlv_1= 'Car' otherlv_2= '{' (otherlv_3= 'timeIn' ( (lv_timeIn_4_0= ruleEDate ) ) )? (otherlv_5= 'timeOut' ( (lv_timeOut_6_0= ruleEDate ) ) )? (otherlv_7= 'isInSegment' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:685:2: () otherlv_1= 'Car' otherlv_2= '{' (otherlv_3= 'timeIn' ( (lv_timeIn_4_0= ruleEDate ) ) )? (otherlv_5= 'timeOut' ( (lv_timeOut_6_0= ruleEDate ) ) )? (otherlv_7= 'isInSegment' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:685:2: ()
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:686:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCarAccess().getCarAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCar1494); 

                	newLeafNode(otherlv_1, grammarAccess.getCarAccess().getCarKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCar1506); 

                	newLeafNode(otherlv_2, grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:699:1: (otherlv_3= 'timeIn' ( (lv_timeIn_4_0= ruleEDate ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:699:3: otherlv_3= 'timeIn' ( (lv_timeIn_4_0= ruleEDate ) )
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCar1519); 

                        	newLeafNode(otherlv_3, grammarAccess.getCarAccess().getTimeInKeyword_3_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:703:1: ( (lv_timeIn_4_0= ruleEDate ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:704:1: (lv_timeIn_4_0= ruleEDate )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:704:1: (lv_timeIn_4_0= ruleEDate )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:705:3: lv_timeIn_4_0= ruleEDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarAccess().getTimeInEDateParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDate_in_ruleCar1540);
                    lv_timeIn_4_0=ruleEDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarRule());
                    	        }
                           		set(
                           			current, 
                           			"timeIn",
                            		lv_timeIn_4_0, 
                            		"EDate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:721:4: (otherlv_5= 'timeOut' ( (lv_timeOut_6_0= ruleEDate ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:721:6: otherlv_5= 'timeOut' ( (lv_timeOut_6_0= ruleEDate ) )
                    {
                    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCar1555); 

                        	newLeafNode(otherlv_5, grammarAccess.getCarAccess().getTimeOutKeyword_4_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:725:1: ( (lv_timeOut_6_0= ruleEDate ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:726:1: (lv_timeOut_6_0= ruleEDate )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:726:1: (lv_timeOut_6_0= ruleEDate )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:727:3: lv_timeOut_6_0= ruleEDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarAccess().getTimeOutEDateParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDate_in_ruleCar1576);
                    lv_timeOut_6_0=ruleEDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarRule());
                    	        }
                           		set(
                           			current, 
                           			"timeOut",
                            		lv_timeOut_6_0, 
                            		"EDate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:743:4: (otherlv_7= 'isInSegment' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:743:6: otherlv_7= 'isInSegment' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCar1591); 

                        	newLeafNode(otherlv_7, grammarAccess.getCarAccess().getIsInSegmentKeyword_5_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:747:1: ( ( ruleEString ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:748:1: ( ruleEString )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:748:1: ( ruleEString )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:749:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCarRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCarAccess().getIsInSegmentSegmentCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCar1614);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCar1628); 

                	newLeafNode(otherlv_9, grammarAccess.getCarAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:774:1: entryRuleSegment returns [EObject current=null] : iv_ruleSegment= ruleSegment EOF ;
    public final EObject entryRuleSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegment = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:775:2: (iv_ruleSegment= ruleSegment EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:776:2: iv_ruleSegment= ruleSegment EOF
            {
             newCompositeNode(grammarAccess.getSegmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSegment_in_entryRuleSegment1664);
            iv_ruleSegment=ruleSegment();

            state._fsp--;

             current =iv_ruleSegment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSegment1674); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:783:1: ruleSegment returns [EObject current=null] : ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'numLanes' ( (lv_numLanes_4_0= ruleEInt ) ) )? (otherlv_5= 'length' ( (lv_length_6_0= ruleEInt ) ) )? (otherlv_7= 'hasCars' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) ;
    public final EObject ruleSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_numLanes_4_0 = null;

        AntlrDatatypeRuleToken lv_length_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:786:28: ( ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'numLanes' ( (lv_numLanes_4_0= ruleEInt ) ) )? (otherlv_5= 'length' ( (lv_length_6_0= ruleEInt ) ) )? (otherlv_7= 'hasCars' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:787:1: ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'numLanes' ( (lv_numLanes_4_0= ruleEInt ) ) )? (otherlv_5= 'length' ( (lv_length_6_0= ruleEInt ) ) )? (otherlv_7= 'hasCars' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:787:1: ( () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'numLanes' ( (lv_numLanes_4_0= ruleEInt ) ) )? (otherlv_5= 'length' ( (lv_length_6_0= ruleEInt ) ) )? (otherlv_7= 'hasCars' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:787:2: () otherlv_1= 'Segment' otherlv_2= '{' (otherlv_3= 'numLanes' ( (lv_numLanes_4_0= ruleEInt ) ) )? (otherlv_5= 'length' ( (lv_length_6_0= ruleEInt ) ) )? (otherlv_7= 'hasCars' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}'
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:787:2: ()
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:788:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSegmentAccess().getSegmentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSegment1720); 

                	newLeafNode(otherlv_1, grammarAccess.getSegmentAccess().getSegmentKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSegment1732); 

                	newLeafNode(otherlv_2, grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:801:1: (otherlv_3= 'numLanes' ( (lv_numLanes_4_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:801:3: otherlv_3= 'numLanes' ( (lv_numLanes_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSegment1745); 

                        	newLeafNode(otherlv_3, grammarAccess.getSegmentAccess().getNumLanesKeyword_3_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:805:1: ( (lv_numLanes_4_0= ruleEInt ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:806:1: (lv_numLanes_4_0= ruleEInt )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:806:1: (lv_numLanes_4_0= ruleEInt )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:807:3: lv_numLanes_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegmentAccess().getNumLanesEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSegment1766);
                    lv_numLanes_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegmentRule());
                    	        }
                           		set(
                           			current, 
                           			"numLanes",
                            		lv_numLanes_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:823:4: (otherlv_5= 'length' ( (lv_length_6_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:823:6: otherlv_5= 'length' ( (lv_length_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSegment1781); 

                        	newLeafNode(otherlv_5, grammarAccess.getSegmentAccess().getLengthKeyword_4_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:827:1: ( (lv_length_6_0= ruleEInt ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:828:1: (lv_length_6_0= ruleEInt )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:828:1: (lv_length_6_0= ruleEInt )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:829:3: lv_length_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegmentAccess().getLengthEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSegment1802);
                    lv_length_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegmentRule());
                    	        }
                           		set(
                           			current, 
                           			"length",
                            		lv_length_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:845:4: (otherlv_7= 'hasCars' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:845:6: otherlv_7= 'hasCars' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSegment1817); 

                        	newLeafNode(otherlv_7, grammarAccess.getSegmentAccess().getHasCarsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSegment1829); 

                        	newLeafNode(otherlv_8, grammarAccess.getSegmentAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:853:1: ( ( ruleEString ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:854:1: ( ruleEString )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:854:1: ( ruleEString )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:855:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSegmentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSegment1852);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:868:2: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:868:4: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSegment1865); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSegmentAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:872:1: ( ( ruleEString ) )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:873:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:873:1: ( ruleEString )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:874:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSegmentRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegmentAccess().getHasCarsCarCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSegment1888);
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

                    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSegment1902); 

                        	newLeafNode(otherlv_12, grammarAccess.getSegmentAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSegment1916); 

                	newLeafNode(otherlv_13, grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:903:1: entryRuleSemaphore returns [EObject current=null] : iv_ruleSemaphore= ruleSemaphore EOF ;
    public final EObject entryRuleSemaphore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemaphore = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:904:2: (iv_ruleSemaphore= ruleSemaphore EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:905:2: iv_ruleSemaphore= ruleSemaphore EOF
            {
             newCompositeNode(grammarAccess.getSemaphoreRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemaphore_in_entryRuleSemaphore1952);
            iv_ruleSemaphore=ruleSemaphore();

            state._fsp--;

             current =iv_ruleSemaphore; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSemaphore1962); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:912:1: ruleSemaphore returns [EObject current=null] : (otherlv_0= 'Semaphore' otherlv_1= '{' (otherlv_2= 'canGo' ( (lv_canGo_3_0= ruleEBoolean ) ) )? (otherlv_4= 'secondsRed' ( (lv_secondsRed_5_0= ruleEInt ) ) )? (otherlv_6= 'secondsGreen' ( (lv_secondsGreen_7_0= ruleEInt ) ) )? otherlv_8= 'belongsTo' ( ( ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleSemaphore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_canGo_3_0 = null;

        AntlrDatatypeRuleToken lv_secondsRed_5_0 = null;

        AntlrDatatypeRuleToken lv_secondsGreen_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:915:28: ( (otherlv_0= 'Semaphore' otherlv_1= '{' (otherlv_2= 'canGo' ( (lv_canGo_3_0= ruleEBoolean ) ) )? (otherlv_4= 'secondsRed' ( (lv_secondsRed_5_0= ruleEInt ) ) )? (otherlv_6= 'secondsGreen' ( (lv_secondsGreen_7_0= ruleEInt ) ) )? otherlv_8= 'belongsTo' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:916:1: (otherlv_0= 'Semaphore' otherlv_1= '{' (otherlv_2= 'canGo' ( (lv_canGo_3_0= ruleEBoolean ) ) )? (otherlv_4= 'secondsRed' ( (lv_secondsRed_5_0= ruleEInt ) ) )? (otherlv_6= 'secondsGreen' ( (lv_secondsGreen_7_0= ruleEInt ) ) )? otherlv_8= 'belongsTo' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:916:1: (otherlv_0= 'Semaphore' otherlv_1= '{' (otherlv_2= 'canGo' ( (lv_canGo_3_0= ruleEBoolean ) ) )? (otherlv_4= 'secondsRed' ( (lv_secondsRed_5_0= ruleEInt ) ) )? (otherlv_6= 'secondsGreen' ( (lv_secondsGreen_7_0= ruleEInt ) ) )? otherlv_8= 'belongsTo' ( ( ruleEString ) ) otherlv_10= '}' )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:916:3: otherlv_0= 'Semaphore' otherlv_1= '{' (otherlv_2= 'canGo' ( (lv_canGo_3_0= ruleEBoolean ) ) )? (otherlv_4= 'secondsRed' ( (lv_secondsRed_5_0= ruleEInt ) ) )? (otherlv_6= 'secondsGreen' ( (lv_secondsGreen_7_0= ruleEInt ) ) )? otherlv_8= 'belongsTo' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSemaphore1999); 

                	newLeafNode(otherlv_0, grammarAccess.getSemaphoreAccess().getSemaphoreKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSemaphore2011); 

                	newLeafNode(otherlv_1, grammarAccess.getSemaphoreAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:924:1: (otherlv_2= 'canGo' ( (lv_canGo_3_0= ruleEBoolean ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:924:3: otherlv_2= 'canGo' ( (lv_canGo_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSemaphore2024); 

                        	newLeafNode(otherlv_2, grammarAccess.getSemaphoreAccess().getCanGoKeyword_2_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:928:1: ( (lv_canGo_3_0= ruleEBoolean ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:929:1: (lv_canGo_3_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:929:1: (lv_canGo_3_0= ruleEBoolean )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:930:3: lv_canGo_3_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getSemaphoreAccess().getCanGoEBooleanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleSemaphore2045);
                    lv_canGo_3_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSemaphoreRule());
                    	        }
                           		set(
                           			current, 
                           			"canGo",
                            		lv_canGo_3_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:946:4: (otherlv_4= 'secondsRed' ( (lv_secondsRed_5_0= ruleEInt ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:946:6: otherlv_4= 'secondsRed' ( (lv_secondsRed_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSemaphore2060); 

                        	newLeafNode(otherlv_4, grammarAccess.getSemaphoreAccess().getSecondsRedKeyword_3_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:950:1: ( (lv_secondsRed_5_0= ruleEInt ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:951:1: (lv_secondsRed_5_0= ruleEInt )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:951:1: (lv_secondsRed_5_0= ruleEInt )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:952:3: lv_secondsRed_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSemaphoreAccess().getSecondsRedEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSemaphore2081);
                    lv_secondsRed_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSemaphoreRule());
                    	        }
                           		set(
                           			current, 
                           			"secondsRed",
                            		lv_secondsRed_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:968:4: (otherlv_6= 'secondsGreen' ( (lv_secondsGreen_7_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:968:6: otherlv_6= 'secondsGreen' ( (lv_secondsGreen_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSemaphore2096); 

                        	newLeafNode(otherlv_6, grammarAccess.getSemaphoreAccess().getSecondsGreenKeyword_4_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:972:1: ( (lv_secondsGreen_7_0= ruleEInt ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:973:1: (lv_secondsGreen_7_0= ruleEInt )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:973:1: (lv_secondsGreen_7_0= ruleEInt )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:974:3: lv_secondsGreen_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSemaphoreAccess().getSecondsGreenEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSemaphore2117);
                    lv_secondsGreen_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSemaphoreRule());
                    	        }
                           		set(
                           			current, 
                           			"secondsGreen",
                            		lv_secondsGreen_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSemaphore2131); 

                	newLeafNode(otherlv_8, grammarAccess.getSemaphoreAccess().getBelongsToKeyword_5());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:994:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:995:1: ( ruleEString )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:995:1: ( ruleEString )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:996:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSemaphoreRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSemaphoreAccess().getBelongsToNodeCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSemaphore2154);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSemaphore2166); 

                	newLeafNode(otherlv_10, grammarAccess.getSemaphoreAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1021:1: entryRuleSignal_Impl returns [EObject current=null] : iv_ruleSignal_Impl= ruleSignal_Impl EOF ;
    public final EObject entryRuleSignal_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal_Impl = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1022:2: (iv_ruleSignal_Impl= ruleSignal_Impl EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1023:2: iv_ruleSignal_Impl= ruleSignal_Impl EOF
            {
             newCompositeNode(grammarAccess.getSignal_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignal_Impl_in_entryRuleSignal_Impl2202);
            iv_ruleSignal_Impl=ruleSignal_Impl();

            state._fsp--;

             current =iv_ruleSignal_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignal_Impl2212); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1030:1: ruleSignal_Impl returns [EObject current=null] : (otherlv_0= 'Signal' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleSignal_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1033:28: ( (otherlv_0= 'Signal' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1034:1: (otherlv_0= 'Signal' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1034:1: (otherlv_0= 'Signal' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1034:3: otherlv_0= 'Signal' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSignal_Impl2249); 

                	newLeafNode(otherlv_0, grammarAccess.getSignal_ImplAccess().getSignalKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSignal_Impl2261); 

                	newLeafNode(otherlv_1, grammarAccess.getSignal_ImplAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSignal_Impl2273); 

                	newLeafNode(otherlv_2, grammarAccess.getSignal_ImplAccess().getBelongsToKeyword_2());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1046:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1047:1: ( ruleEString )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1047:1: ( ruleEString )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1048:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSignal_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSignal_ImplAccess().getBelongsToNodeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSignal_Impl2296);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSignal_Impl2308); 

                	newLeafNode(otherlv_4, grammarAccess.getSignal_ImplAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleExtractor"
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1073:1: entryRuleExtractor returns [EObject current=null] : iv_ruleExtractor= ruleExtractor EOF ;
    public final EObject entryRuleExtractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractor = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1074:2: (iv_ruleExtractor= ruleExtractor EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1075:2: iv_ruleExtractor= ruleExtractor EOF
            {
             newCompositeNode(grammarAccess.getExtractorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtractor_in_entryRuleExtractor2344);
            iv_ruleExtractor=ruleExtractor();

            state._fsp--;

             current =iv_ruleExtractor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtractor2354); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1082:1: ruleExtractor returns [EObject current=null] : ( () otherlv_1= 'Extractor' otherlv_2= '{' (otherlv_3= 'hasStarts' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'hasEnds' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'semaphore' ( ( ruleEString ) ) )? (otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' ) ;
    public final EObject ruleExtractor() throws RecognitionException {
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
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1085:28: ( ( () otherlv_1= 'Extractor' otherlv_2= '{' (otherlv_3= 'hasStarts' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'hasEnds' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'semaphore' ( ( ruleEString ) ) )? (otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1086:1: ( () otherlv_1= 'Extractor' otherlv_2= '{' (otherlv_3= 'hasStarts' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'hasEnds' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'semaphore' ( ( ruleEString ) ) )? (otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1086:1: ( () otherlv_1= 'Extractor' otherlv_2= '{' (otherlv_3= 'hasStarts' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'hasEnds' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'semaphore' ( ( ruleEString ) ) )? (otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1086:2: () otherlv_1= 'Extractor' otherlv_2= '{' (otherlv_3= 'hasStarts' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'hasEnds' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'semaphore' ( ( ruleEString ) ) )? (otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}'
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1086:2: ()
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1087:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExtractorAccess().getExtractorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleExtractor2400); 

                	newLeafNode(otherlv_1, grammarAccess.getExtractorAccess().getExtractorKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExtractor2412); 

                	newLeafNode(otherlv_2, grammarAccess.getExtractorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1100:1: (otherlv_3= 'hasStarts' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1100:3: otherlv_3= 'hasStarts' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExtractor2425); 

                        	newLeafNode(otherlv_3, grammarAccess.getExtractorAccess().getHasStartsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtractor2437); 

                        	newLeafNode(otherlv_4, grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1108:1: ( ( ruleEString ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1109:1: ( ruleEString )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1109:1: ( ruleEString )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1110:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtractorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2460);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1123:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1123:4: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtractor2473); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getExtractorAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1127:1: ( ( ruleEString ) )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1128:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1128:1: ( ruleEString )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1129:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExtractorRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtractorAccess().getHasStartsSegmentCrossReference_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2496);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleExtractor2510); 

                        	newLeafNode(otherlv_8, grammarAccess.getExtractorAccess().getRightParenthesisKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExtractor2524); 

                	newLeafNode(otherlv_9, grammarAccess.getExtractorAccess().getHasEndsKeyword_4());
                
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtractor2536); 

                	newLeafNode(otherlv_10, grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_5());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1154:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1155:1: ( ruleEString )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1155:1: ( ruleEString )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1156:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExtractorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2559);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1169:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==14) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1169:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtractor2572); 

            	        	newLeafNode(otherlv_12, grammarAccess.getExtractorAccess().getCommaKeyword_7_0());
            	        
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1173:1: ( ( ruleEString ) )
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1174:1: ( ruleEString )
            	    {
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1174:1: ( ruleEString )
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1175:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExtractorRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getExtractorAccess().getHasEndsSegmentCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2595);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleExtractor2609); 

                	newLeafNode(otherlv_14, grammarAccess.getExtractorAccess().getRightParenthesisKeyword_8());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1192:1: (otherlv_15= 'semaphore' ( ( ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==25) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1192:3: otherlv_15= 'semaphore' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleExtractor2622); 

                        	newLeafNode(otherlv_15, grammarAccess.getExtractorAccess().getSemaphoreKeyword_9_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1196:1: ( ( ruleEString ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1197:1: ( ruleEString )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1197:1: ( ruleEString )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1198:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtractorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getExtractorAccess().getSemaphoreSemaphoreCrossReference_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2645);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1211:4: (otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1211:6: otherlv_17= 'signals' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleExtractor2660); 

                        	newLeafNode(otherlv_17, grammarAccess.getExtractorAccess().getSignalsKeyword_10_0());
                        
                    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtractor2672); 

                        	newLeafNode(otherlv_18, grammarAccess.getExtractorAccess().getLeftParenthesisKeyword_10_1());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1219:1: ( ( ruleEString ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1220:1: ( ruleEString )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1220:1: ( ruleEString )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1221:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtractorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2695);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1234:2: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1234:4: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtractor2708); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getExtractorAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1238:1: ( ( ruleEString ) )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1239:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1239:1: ( ruleEString )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1240:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExtractorRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtractorAccess().getSignalsSignalCrossReference_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtractor2731);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleExtractor2745); 

                        	newLeafNode(otherlv_22, grammarAccess.getExtractorAccess().getRightParenthesisKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExtractor2759); 

                	newLeafNode(otherlv_23, grammarAccess.getExtractorAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1269:1: entryRuleInjector returns [EObject current=null] : iv_ruleInjector= ruleInjector EOF ;
    public final EObject entryRuleInjector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInjector = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1270:2: (iv_ruleInjector= ruleInjector EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1271:2: iv_ruleInjector= ruleInjector EOF
            {
             newCompositeNode(grammarAccess.getInjectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInjector_in_entryRuleInjector2795);
            iv_ruleInjector=ruleInjector();

            state._fsp--;

             current =iv_ruleInjector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInjector2805); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1278:1: ruleInjector returns [EObject current=null] : ( () otherlv_1= 'Injector' otherlv_2= '{' (otherlv_3= 'carsPerHour' ( (lv_carsPerHour_4_0= ruleEInt ) ) )? otherlv_5= 'hasStarts' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'hasEnds' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'semaphore' ( ( ruleEString ) ) )? (otherlv_19= 'signals' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')' )? otherlv_25= '}' ) ;
    public final EObject ruleInjector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_carsPerHour_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1281:28: ( ( () otherlv_1= 'Injector' otherlv_2= '{' (otherlv_3= 'carsPerHour' ( (lv_carsPerHour_4_0= ruleEInt ) ) )? otherlv_5= 'hasStarts' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'hasEnds' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'semaphore' ( ( ruleEString ) ) )? (otherlv_19= 'signals' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')' )? otherlv_25= '}' ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1282:1: ( () otherlv_1= 'Injector' otherlv_2= '{' (otherlv_3= 'carsPerHour' ( (lv_carsPerHour_4_0= ruleEInt ) ) )? otherlv_5= 'hasStarts' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'hasEnds' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'semaphore' ( ( ruleEString ) ) )? (otherlv_19= 'signals' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')' )? otherlv_25= '}' )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1282:1: ( () otherlv_1= 'Injector' otherlv_2= '{' (otherlv_3= 'carsPerHour' ( (lv_carsPerHour_4_0= ruleEInt ) ) )? otherlv_5= 'hasStarts' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'hasEnds' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'semaphore' ( ( ruleEString ) ) )? (otherlv_19= 'signals' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')' )? otherlv_25= '}' )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1282:2: () otherlv_1= 'Injector' otherlv_2= '{' (otherlv_3= 'carsPerHour' ( (lv_carsPerHour_4_0= ruleEInt ) ) )? otherlv_5= 'hasStarts' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'hasEnds' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'semaphore' ( ( ruleEString ) ) )? (otherlv_19= 'signals' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')' )? otherlv_25= '}'
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1282:2: ()
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1283:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInjectorAccess().getInjectorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleInjector2851); 

                	newLeafNode(otherlv_1, grammarAccess.getInjectorAccess().getInjectorKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInjector2863); 

                	newLeafNode(otherlv_2, grammarAccess.getInjectorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1296:1: (otherlv_3= 'carsPerHour' ( (lv_carsPerHour_4_0= ruleEInt ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1296:3: otherlv_3= 'carsPerHour' ( (lv_carsPerHour_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleInjector2876); 

                        	newLeafNode(otherlv_3, grammarAccess.getInjectorAccess().getCarsPerHourKeyword_3_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1300:1: ( (lv_carsPerHour_4_0= ruleEInt ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1301:1: (lv_carsPerHour_4_0= ruleEInt )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1301:1: (lv_carsPerHour_4_0= ruleEInt )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1302:3: lv_carsPerHour_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInjectorAccess().getCarsPerHourEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInjector2897);
                    lv_carsPerHour_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInjectorRule());
                    	        }
                           		set(
                           			current, 
                           			"carsPerHour",
                            		lv_carsPerHour_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInjector2911); 

                	newLeafNode(otherlv_5, grammarAccess.getInjectorAccess().getHasStartsKeyword_4());
                
            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInjector2923); 

                	newLeafNode(otherlv_6, grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_5());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1326:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1327:1: ( ruleEString )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1327:1: ( ruleEString )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1328:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInjectorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector2946);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1341:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==14) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1341:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInjector2959); 

            	        	newLeafNode(otherlv_8, grammarAccess.getInjectorAccess().getCommaKeyword_7_0());
            	        
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1345:1: ( ( ruleEString ) )
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1346:1: ( ruleEString )
            	    {
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1346:1: ( ruleEString )
            	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1347:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInjectorRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getInjectorAccess().getHasStartsSegmentCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector2982);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInjector2996); 

                	newLeafNode(otherlv_10, grammarAccess.getInjectorAccess().getRightParenthesisKeyword_8());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1364:1: (otherlv_11= 'hasEnds' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1364:3: otherlv_11= 'hasEnds' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInjector3009); 

                        	newLeafNode(otherlv_11, grammarAccess.getInjectorAccess().getHasEndsKeyword_9_0());
                        
                    otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInjector3021); 

                        	newLeafNode(otherlv_12, grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_9_1());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1372:1: ( ( ruleEString ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1373:1: ( ruleEString )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1373:1: ( ruleEString )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1374:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInjectorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3044);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1387:2: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1387:4: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInjector3057); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getInjectorAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1391:1: ( ( ruleEString ) )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1392:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1392:1: ( ruleEString )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1393:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getInjectorRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getInjectorAccess().getHasEndsSegmentCrossReference_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3080);
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

                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInjector3094); 

                        	newLeafNode(otherlv_16, grammarAccess.getInjectorAccess().getRightParenthesisKeyword_9_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1410:3: (otherlv_17= 'semaphore' ( ( ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1410:5: otherlv_17= 'semaphore' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInjector3109); 

                        	newLeafNode(otherlv_17, grammarAccess.getInjectorAccess().getSemaphoreKeyword_10_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1414:1: ( ( ruleEString ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1415:1: ( ruleEString )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1415:1: ( ruleEString )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1416:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInjectorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInjectorAccess().getSemaphoreSemaphoreCrossReference_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3132);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1429:4: (otherlv_19= 'signals' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==26) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1429:6: otherlv_19= 'signals' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')'
                    {
                    otherlv_19=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInjector3147); 

                        	newLeafNode(otherlv_19, grammarAccess.getInjectorAccess().getSignalsKeyword_11_0());
                        
                    otherlv_20=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInjector3159); 

                        	newLeafNode(otherlv_20, grammarAccess.getInjectorAccess().getLeftParenthesisKeyword_11_1());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1437:1: ( ( ruleEString ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1438:1: ( ruleEString )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1438:1: ( ruleEString )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1439:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInjectorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3182);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1452:2: (otherlv_22= ',' ( ( ruleEString ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1452:4: otherlv_22= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInjector3195); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getInjectorAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1456:1: ( ( ruleEString ) )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1457:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1457:1: ( ruleEString )
                    	    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1458:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getInjectorRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getInjectorAccess().getSignalsSignalCrossReference_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInjector3218);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInjector3232); 

                        	newLeafNode(otherlv_24, grammarAccess.getInjectorAccess().getRightParenthesisKeyword_11_4());
                        

                    }
                    break;

            }

            otherlv_25=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInjector3246); 

                	newLeafNode(otherlv_25, grammarAccess.getInjectorAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1487:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1488:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1489:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3283);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3294); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1496:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1499:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1500:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1500:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1500:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1500:2: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1501:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEInt3333); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3350); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1521:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1522:2: (iv_ruleEDate= ruleEDate EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1523:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDate_in_entryRuleEDate3396);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDate3407); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1530:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1533:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1534:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEDate3446); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1549:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1550:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1551:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean3491);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean3502); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1558:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1561:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1562:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1562:1: (kw= 'true' | kw= 'false' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==45) ) {
                alt42=1;
            }
            else if ( (LA42_0==46) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1563:2: kw= 'true'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEBoolean3540); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1570:2: kw= 'false'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEBoolean3559); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1583:1: entryRuleSpeedlimit returns [EObject current=null] : iv_ruleSpeedlimit= ruleSpeedlimit EOF ;
    public final EObject entryRuleSpeedlimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedlimit = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1584:2: (iv_ruleSpeedlimit= ruleSpeedlimit EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1585:2: iv_ruleSpeedlimit= ruleSpeedlimit EOF
            {
             newCompositeNode(grammarAccess.getSpeedlimitRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpeedlimit_in_entryRuleSpeedlimit3599);
            iv_ruleSpeedlimit=ruleSpeedlimit();

            state._fsp--;

             current =iv_ruleSpeedlimit; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpeedlimit3609); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1592:1: ruleSpeedlimit returns [EObject current=null] : (otherlv_0= 'Speedlimit' otherlv_1= '{' (otherlv_2= 'Speed' ( (lv_Speed_3_0= ruleEInt ) ) )? otherlv_4= 'belongsTo' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleSpeedlimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_Speed_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1595:28: ( (otherlv_0= 'Speedlimit' otherlv_1= '{' (otherlv_2= 'Speed' ( (lv_Speed_3_0= ruleEInt ) ) )? otherlv_4= 'belongsTo' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1596:1: (otherlv_0= 'Speedlimit' otherlv_1= '{' (otherlv_2= 'Speed' ( (lv_Speed_3_0= ruleEInt ) ) )? otherlv_4= 'belongsTo' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1596:1: (otherlv_0= 'Speedlimit' otherlv_1= '{' (otherlv_2= 'Speed' ( (lv_Speed_3_0= ruleEInt ) ) )? otherlv_4= 'belongsTo' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1596:3: otherlv_0= 'Speedlimit' otherlv_1= '{' (otherlv_2= 'Speed' ( (lv_Speed_3_0= ruleEInt ) ) )? otherlv_4= 'belongsTo' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleSpeedlimit3646); 

                	newLeafNode(otherlv_0, grammarAccess.getSpeedlimitAccess().getSpeedlimitKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSpeedlimit3658); 

                	newLeafNode(otherlv_1, grammarAccess.getSpeedlimitAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1604:1: (otherlv_2= 'Speed' ( (lv_Speed_3_0= ruleEInt ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==48) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1604:3: otherlv_2= 'Speed' ( (lv_Speed_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleSpeedlimit3671); 

                        	newLeafNode(otherlv_2, grammarAccess.getSpeedlimitAccess().getSpeedKeyword_2_0());
                        
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1608:1: ( (lv_Speed_3_0= ruleEInt ) )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1609:1: (lv_Speed_3_0= ruleEInt )
                    {
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1609:1: (lv_Speed_3_0= ruleEInt )
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1610:3: lv_Speed_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpeedlimitAccess().getSpeedEIntParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSpeedlimit3692);
                    lv_Speed_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpeedlimitRule());
                    	        }
                           		set(
                           			current, 
                           			"Speed",
                            		lv_Speed_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSpeedlimit3706); 

                	newLeafNode(otherlv_4, grammarAccess.getSpeedlimitAccess().getBelongsToKeyword_3());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1630:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1631:1: ( ruleEString )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1631:1: ( ruleEString )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1632:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSpeedlimitRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSpeedlimitAccess().getBelongsToNodeCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSpeedlimit3729);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSpeedlimit3741); 

                	newLeafNode(otherlv_6, grammarAccess.getSpeedlimitAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1657:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1658:2: (iv_ruleStop= ruleStop EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1659:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStop_in_entryRuleStop3777);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStop3787); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1666:1: ruleStop returns [EObject current=null] : (otherlv_0= 'Stop' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1669:28: ( (otherlv_0= 'Stop' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1670:1: (otherlv_0= 'Stop' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1670:1: (otherlv_0= 'Stop' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1670:3: otherlv_0= 'Stop' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleStop3824); 

                	newLeafNode(otherlv_0, grammarAccess.getStopAccess().getStopKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStop3836); 

                	newLeafNode(otherlv_1, grammarAccess.getStopAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleStop3848); 

                	newLeafNode(otherlv_2, grammarAccess.getStopAccess().getBelongsToKeyword_2());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1682:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1683:1: ( ruleEString )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1683:1: ( ruleEString )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1684:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStopRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStopAccess().getBelongsToNodeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStop3871);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStop3883); 

                	newLeafNode(otherlv_4, grammarAccess.getStopAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1709:1: entryRuleYield returns [EObject current=null] : iv_ruleYield= ruleYield EOF ;
    public final EObject entryRuleYield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYield = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1710:2: (iv_ruleYield= ruleYield EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1711:2: iv_ruleYield= ruleYield EOF
            {
             newCompositeNode(grammarAccess.getYieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleYield_in_entryRuleYield3919);
            iv_ruleYield=ruleYield();

            state._fsp--;

             current =iv_ruleYield; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleYield3929); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1718:1: ruleYield returns [EObject current=null] : (otherlv_0= 'Yield' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleYield() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1721:28: ( (otherlv_0= 'Yield' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1722:1: (otherlv_0= 'Yield' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1722:1: (otherlv_0= 'Yield' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1722:3: otherlv_0= 'Yield' otherlv_1= '{' otherlv_2= 'belongsTo' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleYield3966); 

                	newLeafNode(otherlv_0, grammarAccess.getYieldAccess().getYieldKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleYield3978); 

                	newLeafNode(otherlv_1, grammarAccess.getYieldAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleYield3990); 

                	newLeafNode(otherlv_2, grammarAccess.getYieldAccess().getBelongsToKeyword_2());
                
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1734:1: ( ( ruleEString ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1735:1: ( ruleEString )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1735:1: ( ruleEString )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1736:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getYieldRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getYieldAccess().getBelongsToNodeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleYield4013);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleYield4025); 

                	newLeafNode(otherlv_4, grammarAccess.getYieldAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1761:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1762:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1763:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString4062);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString4073); 

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
    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1770:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1773:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1774:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1774:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1774:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString4113); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xHighway/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalXHighway.g:1782:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString4139); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleHighway_in_entryRuleHighway75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHighway85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleHighway131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHighway143 = new BitSet(new long[]{0x00000000000FA000L});
        public static final BitSet FOLLOW_13_in_ruleHighway156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHighway168 = new BitSet(new long[]{0x0000060000100000L});
        public static final BitSet FOLLOW_ruleNode_in_ruleHighway189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleHighway202 = new BitSet(new long[]{0x0000060000100000L});
        public static final BitSet FOLLOW_ruleNode_in_ruleHighway223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleHighway237 = new BitSet(new long[]{0x00000000000F8000L});
        public static final BitSet FOLLOW_16_in_ruleHighway252 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHighway264 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleCar_in_ruleHighway285 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleHighway298 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleCar_in_ruleHighway319 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleHighway333 = new BitSet(new long[]{0x00000000000E8000L});
        public static final BitSet FOLLOW_17_in_ruleHighway348 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHighway360 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleSegment_in_ruleHighway381 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleHighway394 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleSegment_in_ruleHighway415 = new BitSet(new long[]{0x000000000000C000L});
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
        public static final BitSet FOLLOW_20_in_ruleNode_Impl1046 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNode_Impl1058 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleNode_Impl1070 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleNode_Impl1082 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1105 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleNode_Impl1118 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1141 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleNode_Impl1155 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleNode_Impl1167 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleNode_Impl1179 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1202 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleNode_Impl1215 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1238 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleNode_Impl1252 = new BitSet(new long[]{0x0000000006008000L});
        public static final BitSet FOLLOW_25_in_ruleNode_Impl1265 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1288 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleNode_Impl1303 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleNode_Impl1315 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1338 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleNode_Impl1351 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNode_Impl1374 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleNode_Impl1388 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleNode_Impl1402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCar_in_entryRuleCar1438 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCar1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleCar1494 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCar1506 = new BitSet(new long[]{0x0000000070008000L});
        public static final BitSet FOLLOW_28_in_ruleCar1519 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEDate_in_ruleCar1540 = new BitSet(new long[]{0x0000000060008000L});
        public static final BitSet FOLLOW_29_in_ruleCar1555 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEDate_in_ruleCar1576 = new BitSet(new long[]{0x0000000040008000L});
        public static final BitSet FOLLOW_30_in_ruleCar1591 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCar1614 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCar1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSegment_in_entryRuleSegment1664 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSegment1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSegment1720 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSegment1732 = new BitSet(new long[]{0x0000000700008000L});
        public static final BitSet FOLLOW_32_in_ruleSegment1745 = new BitSet(new long[]{0x0000100000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSegment1766 = new BitSet(new long[]{0x0000000600008000L});
        public static final BitSet FOLLOW_33_in_ruleSegment1781 = new BitSet(new long[]{0x0000100000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSegment1802 = new BitSet(new long[]{0x0000000400008000L});
        public static final BitSet FOLLOW_34_in_ruleSegment1817 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleSegment1829 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSegment1852 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleSegment1865 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSegment1888 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleSegment1902 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSegment1916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemaphore_in_entryRuleSemaphore1952 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSemaphore1962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleSemaphore1999 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSemaphore2011 = new BitSet(new long[]{0x000000F000000000L});
        public static final BitSet FOLLOW_36_in_ruleSemaphore2024 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleSemaphore2045 = new BitSet(new long[]{0x000000E000000000L});
        public static final BitSet FOLLOW_37_in_ruleSemaphore2060 = new BitSet(new long[]{0x0000100000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSemaphore2081 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_38_in_ruleSemaphore2096 = new BitSet(new long[]{0x0000100000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSemaphore2117 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleSemaphore2131 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSemaphore2154 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSemaphore2166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_Impl_in_entryRuleSignal_Impl2202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignal_Impl2212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleSignal_Impl2249 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSignal_Impl2261 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleSignal_Impl2273 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSignal_Impl2296 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSignal_Impl2308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractor_in_entryRuleExtractor2344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtractor2354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleExtractor2400 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExtractor2412 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_21_in_ruleExtractor2425 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleExtractor2437 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2460 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleExtractor2473 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2496 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleExtractor2510 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleExtractor2524 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleExtractor2536 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2559 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleExtractor2572 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2595 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleExtractor2609 = new BitSet(new long[]{0x0000000006008000L});
        public static final BitSet FOLLOW_25_in_ruleExtractor2622 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2645 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleExtractor2660 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleExtractor2672 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2695 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleExtractor2708 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtractor2731 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleExtractor2745 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleExtractor2759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInjector_in_entryRuleInjector2795 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInjector2805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleInjector2851 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInjector2863 = new BitSet(new long[]{0x0000080000200000L});
        public static final BitSet FOLLOW_43_in_ruleInjector2876 = new BitSet(new long[]{0x0000100000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInjector2897 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleInjector2911 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInjector2923 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector2946 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleInjector2959 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector2982 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleInjector2996 = new BitSet(new long[]{0x0000000007008000L});
        public static final BitSet FOLLOW_24_in_ruleInjector3009 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInjector3021 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3044 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleInjector3057 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3080 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleInjector3094 = new BitSet(new long[]{0x0000000006008000L});
        public static final BitSet FOLLOW_25_in_ruleInjector3109 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3132 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleInjector3147 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInjector3159 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3182 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleInjector3195 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInjector3218 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleInjector3232 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInjector3246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEInt3333 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDate_in_entryRuleEDate3396 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDate3407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEDate3446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean3491 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean3502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEBoolean3540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEBoolean3559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpeedlimit_in_entryRuleSpeedlimit3599 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpeedlimit3609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleSpeedlimit3646 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSpeedlimit3658 = new BitSet(new long[]{0x0001008000000000L});
        public static final BitSet FOLLOW_48_in_ruleSpeedlimit3671 = new BitSet(new long[]{0x0000100000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSpeedlimit3692 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleSpeedlimit3706 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSpeedlimit3729 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSpeedlimit3741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_entryRuleStop3777 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStop3787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleStop3824 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStop3836 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleStop3848 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStop3871 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleStop3883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYield_in_entryRuleYield3919 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleYield3929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleYield3966 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleYield3978 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleYield3990 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleYield4013 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleYield4025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString4062 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString4073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString4113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString4139 = new BitSet(new long[]{0x0000000000000002L});
    }


}