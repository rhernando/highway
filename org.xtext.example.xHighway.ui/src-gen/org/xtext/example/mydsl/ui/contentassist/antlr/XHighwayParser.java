/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.XHighwayGrammarAccess;

public class XHighwayParser extends AbstractContentAssistParser {
	
	@Inject
	private XHighwayGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalXHighwayParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalXHighwayParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalXHighwayParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNodeAccess().getAlternatives(), "rule__Node__Alternatives");
					put(grammarAccess.getSignalAccess().getAlternatives(), "rule__Signal__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getHighwayAccess().getGroup(), "rule__Highway__Group__0");
					put(grammarAccess.getHighwayAccess().getGroup_3(), "rule__Highway__Group_3__0");
					put(grammarAccess.getHighwayAccess().getGroup_3_3(), "rule__Highway__Group_3_3__0");
					put(grammarAccess.getHighwayAccess().getGroup_4(), "rule__Highway__Group_4__0");
					put(grammarAccess.getHighwayAccess().getGroup_4_3(), "rule__Highway__Group_4_3__0");
					put(grammarAccess.getHighwayAccess().getGroup_5(), "rule__Highway__Group_5__0");
					put(grammarAccess.getHighwayAccess().getGroup_5_3(), "rule__Highway__Group_5_3__0");
					put(grammarAccess.getHighwayAccess().getGroup_6(), "rule__Highway__Group_6__0");
					put(grammarAccess.getHighwayAccess().getGroup_6_3(), "rule__Highway__Group_6_3__0");
					put(grammarAccess.getHighwayAccess().getGroup_7(), "rule__Highway__Group_7__0");
					put(grammarAccess.getHighwayAccess().getGroup_7_3(), "rule__Highway__Group_7_3__0");
					put(grammarAccess.getNode_ImplAccess().getGroup(), "rule__Node_Impl__Group__0");
					put(grammarAccess.getNode_ImplAccess().getGroup_6(), "rule__Node_Impl__Group_6__0");
					put(grammarAccess.getNode_ImplAccess().getGroup_11(), "rule__Node_Impl__Group_11__0");
					put(grammarAccess.getNode_ImplAccess().getGroup_13(), "rule__Node_Impl__Group_13__0");
					put(grammarAccess.getNode_ImplAccess().getGroup_14(), "rule__Node_Impl__Group_14__0");
					put(grammarAccess.getNode_ImplAccess().getGroup_14_3(), "rule__Node_Impl__Group_14_3__0");
					put(grammarAccess.getCarAccess().getGroup(), "rule__Car__Group__0");
					put(grammarAccess.getCarAccess().getGroup_3(), "rule__Car__Group_3__0");
					put(grammarAccess.getCarAccess().getGroup_4(), "rule__Car__Group_4__0");
					put(grammarAccess.getCarAccess().getGroup_5(), "rule__Car__Group_5__0");
					put(grammarAccess.getSegmentAccess().getGroup(), "rule__Segment__Group__0");
					put(grammarAccess.getSegmentAccess().getGroup_3(), "rule__Segment__Group_3__0");
					put(grammarAccess.getSegmentAccess().getGroup_4(), "rule__Segment__Group_4__0");
					put(grammarAccess.getSegmentAccess().getGroup_5(), "rule__Segment__Group_5__0");
					put(grammarAccess.getSegmentAccess().getGroup_5_3(), "rule__Segment__Group_5_3__0");
					put(grammarAccess.getSemaphoreAccess().getGroup(), "rule__Semaphore__Group__0");
					put(grammarAccess.getSemaphoreAccess().getGroup_2(), "rule__Semaphore__Group_2__0");
					put(grammarAccess.getSemaphoreAccess().getGroup_3(), "rule__Semaphore__Group_3__0");
					put(grammarAccess.getSemaphoreAccess().getGroup_4(), "rule__Semaphore__Group_4__0");
					put(grammarAccess.getSignal_ImplAccess().getGroup(), "rule__Signal_Impl__Group__0");
					put(grammarAccess.getExtractorAccess().getGroup(), "rule__Extractor__Group__0");
					put(grammarAccess.getExtractorAccess().getGroup_3(), "rule__Extractor__Group_3__0");
					put(grammarAccess.getExtractorAccess().getGroup_3_3(), "rule__Extractor__Group_3_3__0");
					put(grammarAccess.getExtractorAccess().getGroup_7(), "rule__Extractor__Group_7__0");
					put(grammarAccess.getExtractorAccess().getGroup_9(), "rule__Extractor__Group_9__0");
					put(grammarAccess.getExtractorAccess().getGroup_10(), "rule__Extractor__Group_10__0");
					put(grammarAccess.getExtractorAccess().getGroup_10_3(), "rule__Extractor__Group_10_3__0");
					put(grammarAccess.getInjectorAccess().getGroup(), "rule__Injector__Group__0");
					put(grammarAccess.getInjectorAccess().getGroup_3(), "rule__Injector__Group_3__0");
					put(grammarAccess.getInjectorAccess().getGroup_7(), "rule__Injector__Group_7__0");
					put(grammarAccess.getInjectorAccess().getGroup_9(), "rule__Injector__Group_9__0");
					put(grammarAccess.getInjectorAccess().getGroup_9_3(), "rule__Injector__Group_9_3__0");
					put(grammarAccess.getInjectorAccess().getGroup_10(), "rule__Injector__Group_10__0");
					put(grammarAccess.getInjectorAccess().getGroup_11(), "rule__Injector__Group_11__0");
					put(grammarAccess.getInjectorAccess().getGroup_11_3(), "rule__Injector__Group_11_3__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getSpeedlimitAccess().getGroup(), "rule__Speedlimit__Group__0");
					put(grammarAccess.getSpeedlimitAccess().getGroup_2(), "rule__Speedlimit__Group_2__0");
					put(grammarAccess.getStopAccess().getGroup(), "rule__Stop__Group__0");
					put(grammarAccess.getYieldAccess().getGroup(), "rule__Yield__Group__0");
					put(grammarAccess.getHighwayAccess().getInitNodesAssignment_3_2(), "rule__Highway__InitNodesAssignment_3_2");
					put(grammarAccess.getHighwayAccess().getInitNodesAssignment_3_3_1(), "rule__Highway__InitNodesAssignment_3_3_1");
					put(grammarAccess.getHighwayAccess().getInitCarsAssignment_4_2(), "rule__Highway__InitCarsAssignment_4_2");
					put(grammarAccess.getHighwayAccess().getInitCarsAssignment_4_3_1(), "rule__Highway__InitCarsAssignment_4_3_1");
					put(grammarAccess.getHighwayAccess().getInitSegmentsAssignment_5_2(), "rule__Highway__InitSegmentsAssignment_5_2");
					put(grammarAccess.getHighwayAccess().getInitSegmentsAssignment_5_3_1(), "rule__Highway__InitSegmentsAssignment_5_3_1");
					put(grammarAccess.getHighwayAccess().getInitSemaphoreAssignment_6_2(), "rule__Highway__InitSemaphoreAssignment_6_2");
					put(grammarAccess.getHighwayAccess().getInitSemaphoreAssignment_6_3_1(), "rule__Highway__InitSemaphoreAssignment_6_3_1");
					put(grammarAccess.getHighwayAccess().getInitSignalAssignment_7_2(), "rule__Highway__InitSignalAssignment_7_2");
					put(grammarAccess.getHighwayAccess().getInitSignalAssignment_7_3_1(), "rule__Highway__InitSignalAssignment_7_3_1");
					put(grammarAccess.getNode_ImplAccess().getHasStartsAssignment_5(), "rule__Node_Impl__HasStartsAssignment_5");
					put(grammarAccess.getNode_ImplAccess().getHasStartsAssignment_6_1(), "rule__Node_Impl__HasStartsAssignment_6_1");
					put(grammarAccess.getNode_ImplAccess().getHasEndsAssignment_10(), "rule__Node_Impl__HasEndsAssignment_10");
					put(grammarAccess.getNode_ImplAccess().getHasEndsAssignment_11_1(), "rule__Node_Impl__HasEndsAssignment_11_1");
					put(grammarAccess.getNode_ImplAccess().getSemaphoreAssignment_13_1(), "rule__Node_Impl__SemaphoreAssignment_13_1");
					put(grammarAccess.getNode_ImplAccess().getSignalsAssignment_14_2(), "rule__Node_Impl__SignalsAssignment_14_2");
					put(grammarAccess.getNode_ImplAccess().getSignalsAssignment_14_3_1(), "rule__Node_Impl__SignalsAssignment_14_3_1");
					put(grammarAccess.getCarAccess().getTimeInAssignment_3_1(), "rule__Car__TimeInAssignment_3_1");
					put(grammarAccess.getCarAccess().getTimeOutAssignment_4_1(), "rule__Car__TimeOutAssignment_4_1");
					put(grammarAccess.getCarAccess().getIsInSegmentAssignment_5_1(), "rule__Car__IsInSegmentAssignment_5_1");
					put(grammarAccess.getSegmentAccess().getNumLanesAssignment_3_1(), "rule__Segment__NumLanesAssignment_3_1");
					put(grammarAccess.getSegmentAccess().getLengthAssignment_4_1(), "rule__Segment__LengthAssignment_4_1");
					put(grammarAccess.getSegmentAccess().getHasCarsAssignment_5_2(), "rule__Segment__HasCarsAssignment_5_2");
					put(grammarAccess.getSegmentAccess().getHasCarsAssignment_5_3_1(), "rule__Segment__HasCarsAssignment_5_3_1");
					put(grammarAccess.getSemaphoreAccess().getCanGoAssignment_2_1(), "rule__Semaphore__CanGoAssignment_2_1");
					put(grammarAccess.getSemaphoreAccess().getSecondsRedAssignment_3_1(), "rule__Semaphore__SecondsRedAssignment_3_1");
					put(grammarAccess.getSemaphoreAccess().getSecondsGreenAssignment_4_1(), "rule__Semaphore__SecondsGreenAssignment_4_1");
					put(grammarAccess.getSemaphoreAccess().getBelongsToAssignment_6(), "rule__Semaphore__BelongsToAssignment_6");
					put(grammarAccess.getSignal_ImplAccess().getBelongsToAssignment_3(), "rule__Signal_Impl__BelongsToAssignment_3");
					put(grammarAccess.getExtractorAccess().getHasStartsAssignment_3_2(), "rule__Extractor__HasStartsAssignment_3_2");
					put(grammarAccess.getExtractorAccess().getHasStartsAssignment_3_3_1(), "rule__Extractor__HasStartsAssignment_3_3_1");
					put(grammarAccess.getExtractorAccess().getHasEndsAssignment_6(), "rule__Extractor__HasEndsAssignment_6");
					put(grammarAccess.getExtractorAccess().getHasEndsAssignment_7_1(), "rule__Extractor__HasEndsAssignment_7_1");
					put(grammarAccess.getExtractorAccess().getSemaphoreAssignment_9_1(), "rule__Extractor__SemaphoreAssignment_9_1");
					put(grammarAccess.getExtractorAccess().getSignalsAssignment_10_2(), "rule__Extractor__SignalsAssignment_10_2");
					put(grammarAccess.getExtractorAccess().getSignalsAssignment_10_3_1(), "rule__Extractor__SignalsAssignment_10_3_1");
					put(grammarAccess.getInjectorAccess().getCarsPerHourAssignment_3_1(), "rule__Injector__CarsPerHourAssignment_3_1");
					put(grammarAccess.getInjectorAccess().getHasStartsAssignment_6(), "rule__Injector__HasStartsAssignment_6");
					put(grammarAccess.getInjectorAccess().getHasStartsAssignment_7_1(), "rule__Injector__HasStartsAssignment_7_1");
					put(grammarAccess.getInjectorAccess().getHasEndsAssignment_9_2(), "rule__Injector__HasEndsAssignment_9_2");
					put(grammarAccess.getInjectorAccess().getHasEndsAssignment_9_3_1(), "rule__Injector__HasEndsAssignment_9_3_1");
					put(grammarAccess.getInjectorAccess().getSemaphoreAssignment_10_1(), "rule__Injector__SemaphoreAssignment_10_1");
					put(grammarAccess.getInjectorAccess().getSignalsAssignment_11_2(), "rule__Injector__SignalsAssignment_11_2");
					put(grammarAccess.getInjectorAccess().getSignalsAssignment_11_3_1(), "rule__Injector__SignalsAssignment_11_3_1");
					put(grammarAccess.getSpeedlimitAccess().getSpeedAssignment_2_1(), "rule__Speedlimit__SpeedAssignment_2_1");
					put(grammarAccess.getSpeedlimitAccess().getBelongsToAssignment_4(), "rule__Speedlimit__BelongsToAssignment_4");
					put(grammarAccess.getStopAccess().getBelongsToAssignment_3(), "rule__Stop__BelongsToAssignment_3");
					put(grammarAccess.getYieldAccess().getBelongsToAssignment_3(), "rule__Yield__BelongsToAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalXHighwayParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalXHighwayParser) parser;
			typedParser.entryRuleHighway();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public XHighwayGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XHighwayGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
