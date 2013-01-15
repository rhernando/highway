package grafihighway.features;

import highwayproj.highway.Car;
import highwayproj.highway.Segment;

import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

public class CreateAttachCarConnectionFeature extends
		AbstractCreateConnectionFeature implements ICreateConnectionFeature {

	public CreateAttachCarConnectionFeature(IFeatureProvider fp) {
		super(fp, "AttachCar",
				"Attach a Car to a Segment");
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		Anchor source = context.getSourceAnchor();
		return source != null
				&& (getBusinessObjectForPictogramElement(source.getParent()) instanceof Car );
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
			if (getBusinessObjectForPictogramElement(sourcePictogramElement) instanceof Car
					&& getBusinessObjectForPictogramElement(targetPictogramElement) instanceof Segment) {
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

		Car myCar = (Car)getBusinessObjectForPictogramElement(sourcePictogramElement);
		Segment mySegment = (Segment)getBusinessObjectForPictogramElement(targetPictogramElement);
		mySegment.getHasCars().add(myCar);

		// TODO: create the domain object connection here
		Object newDomainObjectConnetion = "CAR";

		AddConnectionContext addContext = new AddConnectionContext(
				context.getSourceAnchor(), context.getTargetAnchor());
		addContext.setNewObject(newDomainObjectConnetion);
		newConnection = (Connection) getFeatureProvider().addIfPossible(
				addContext);

		return newConnection;
	}
}
