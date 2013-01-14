package grafihighway.features;

import highway.HighwayFactory;
import highway.Node;
import highway.Segment;

import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

public class CreateSegmentConnectionFeature extends
		AbstractCreateConnectionFeature implements ICreateConnectionFeature {

	public CreateSegmentConnectionFeature(IFeatureProvider fp) {
		super(fp, "Segment", "Creates a new Segment between two Nodes");
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		// TODO: check for right domain object instance below
		// return
		// getBusinessObjectForPictogramElement(context.getSourcePictogramElement())
		// instanceof <DomainObject>;
		Anchor source = context.getSourceAnchor();

		return (source != null && getBusinessObjectForPictogramElement(source.getParent()) instanceof Node);
		//return true;
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		PictogramElement sourcePictogramElement = context
				.getSourcePictogramElement();
		PictogramElement targetPictogramElement = context
				.getTargetPictogramElement();

		Anchor source = context.getSourceAnchor();
		Anchor target = context.getTargetAnchor();

		if (source != null
				&& target != null
				&& getBusinessObjectForPictogramElement(source.getParent()) instanceof Node
				&& getBusinessObjectForPictogramElement(target.getParent()) instanceof Node)
			return true;
		// TODO: check for right domain object instance below
		// if (getBusinessObjectForPictogramElement(sourcePictogramElement)
		// instanceof <DomainObject> &&
		// getBusinessObjectForPictogramElement(targetPictogramElement)
		// instanceof <DomainObject>) {
		// return true;
		// }

		return sourcePictogramElement != null && targetPictogramElement != null;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Segment newSegment = HighwayFactory.eINSTANCE.createSegment();
		
		PictogramElement source = context.getSourceAnchor().getParent();
		PictogramElement target = context.getTargetAnchor().getParent();
		
		Node startNode = (Node)getBusinessObjectForPictogramElement(source);
		Node endNode = (Node)getBusinessObjectForPictogramElement(target);
		
		startNode.getHasStarts().add(newSegment);
		endNode.getHasEnds().add(newSegment);
		
		Connection newConnection = null;

		// TODO: create the domain object connection here
		//Object newDomainObjectConnetion = null;

		AddConnectionContext addContext = new AddConnectionContext(
				context.getSourceAnchor(), context.getTargetAnchor());
		addContext.setNewObject(newSegment);
		newConnection = (Connection) getFeatureProvider().addIfPossible(
				addContext);

		return newConnection;
	}
}
