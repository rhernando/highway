package grafihighway.features;

import highway.Node;
import highway.Semaphore;

import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

public class CreateAttachSemaphoreConnectionFeature extends
		AbstractCreateConnectionFeature implements ICreateConnectionFeature {

	public CreateAttachSemaphoreConnectionFeature(IFeatureProvider fp) {
		super(fp, "AttachSemaphore",
				"Attach a Semaphore to a Node");
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		Anchor source = context.getSourceAnchor();
		return source != null
				&& (getBusinessObjectForPictogramElement(source.getParent()) instanceof Semaphore );
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
			if (getBusinessObjectForPictogramElement(sourcePictogramElement) instanceof Semaphore
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

		Semaphore mySemaphore = (Semaphore)getBusinessObjectForPictogramElement(sourcePictogramElement);
		Node myNode = (Node)getBusinessObjectForPictogramElement(targetPictogramElement);
		myNode.setSemaphore(mySemaphore);

		// TODO: create the domain object connection here
		Object newDomainObjectConnetion = "SEM";

		AddConnectionContext addContext = new AddConnectionContext(
				context.getSourceAnchor(), context.getTargetAnchor());
		addContext.setNewObject(newDomainObjectConnetion);
		newConnection = (Connection) getFeatureProvider().addIfPossible(
				addContext);

		return newConnection;
	}
}
