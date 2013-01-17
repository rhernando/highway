package org.xtext.validation;
import java.util.List;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import Highway.highway.*;
 
public class HighwayJavaValidator extends AbstractHighwayJavaValidator {
	EStructuralFeature return_feat = null;
	
	@Check
	public void checkSignalSemaphoreBelongToNode (Node node) {
		Semaphore semaphore = node.getSemaphore();
		if (!node.equals(semaphore.getBelongsTo())) {
			warning("Semaphore doesn't belong to this node", return_feat);
		}
		
		List signals = node.getSignals();
		int size = signals.size();
		for (int i = 0; i < size; i++) {
			Signal signal = (Signal)signals.get(i);
			if (!node.equals(signal.getBelongsTo()))   {
				warning("Signal doesn't belong to this node", return_feat);
			}
		}
		
	}
	@Check
	public void checkSegmentHasTwoNodes(Segment segment, highway myhighway) {
		List nodes = myhighway.getInitNodes();
		List segments;
		Node node;
		boolean hasStart = false;
		boolean hasEnd = false;
		int sizeS;
		int sizeN = nodes.size();
		Segment segmentCheck;
		
		//loop over nodes 
		for (int i = 0; i < sizeN; i++) {
			node = (Node)nodes.get(i);
			
			//check if Segment has a starting node
			segments = node.getHasStarts();
			sizeS = segments.size();
			for (int j = 0; j < sizeS; j++) {
				segmentCheck = (Segment)segments.get(j);
				if (segment.equals(segmentCheck))
					hasStart = true;
			}
			
			//Check if segment has an ending node
			segments = node.getHasEnds();
			sizeS = segments.size();
			for (int j = 0; j < sizeS; j++) {
				segmentCheck = (Segment)segments.get(j);
				if (segment.equals(segmentCheck))
					hasStart = true;
			}
		}
		
		if (!hasStart || !hasEnd) {
			error("Segment must have starting and end node", return_feat);
		}
	}
	
	@Check
	public void checkNodeName (highway myhighway) {
		List nodes = myhighway.getInitNodes();
		int size = nodes.size();
		boolean doublename = false;
		
		for (int i = 1; i < size; i++) {
			Node node1 = (Node)nodes.get(i-1);
			Node node2 = (Node)nodes.get(i);
			if (node1.getName() == node2.getName()) {
				doublename = true;
			}
		}
		
		if (doublename) 
			error("Nodename already exists", return_feat);
	}

}
