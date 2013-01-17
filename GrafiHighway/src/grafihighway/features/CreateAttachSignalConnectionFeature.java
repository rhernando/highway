package grafihighway.features;

import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import Highway.highway.Node;
import Highway.highway.Signal;

public class CreateAttachSignalConnectionFeature extends
		AbstractCreateConnectionFeature implements ICreateConnectionFeature {

	public CreateAttachSignalConnectionFeature(IFeatureProvider fp) {
		super(fp, "AttachSignal",
				"Attach a Signal to a Node");
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		Anchor source = context.getSourceAnchor();
		return source != null
				&& (getBusinessObjectForPictogramElement(source.getParent()) instanceof Signal );
		// TODO: check for right domain object instance below
		// return
		// getBusinessObjectForPictogramElement(context.getSourcePictogramElement())
		// instanceof <DomainObject>;

	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		PictogramElement sourcePictogramElement = context
				.getSourcePictogramElement();
		PictogramElement targetPictogramElement = context
				.getTargetPictogramElement();

		if (sourcePictogramElement != null && targetPictogramElement != null) {
			
			// : check for right domain object instance below
			if (getBusinessObjectForPictogramElement(sourcePictogramElement) instanceof Signal
					&& getBusinessObjectForPictogramElement(targetPictogramElement) instanceof Node) {
				return true;
			}else{
				return false;
			}
				
		}
		return sourcePictogramElement != null && targetPictogramElement != null;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		PictogramElement sourcePictogramElement = context
				.getSourcePictogramElement();
		PictogramElement targetPictogramElement = context
				.getTargetPictogramElement();

		Signal mySignal = (Signal)getBusinessObjectForPictogramElement(sourcePictogramElement);
		Node myNode = (Node)getBusinessObjectForPictogramElement(targetPictogramElement);
		myNode.getSignals().add(mySignal);

		// TODO: create the domain object connection here
		Object newDomainObjectConnetion = "SIG";

		AddConnectionContext addContext = new AddConnectionContext(
				context.getSourceAnchor(), context.getTargetAnchor());
		addContext.setNewObject(newDomainObjectConnetion);
		newConnection = (Connection) getFeatureProvider().addIfPossible(
				addContext);

		return newConnection;
	}
}
