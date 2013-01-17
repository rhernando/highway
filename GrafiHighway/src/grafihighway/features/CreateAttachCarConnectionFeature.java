package grafihighway.features;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import Highway.highway.Car;
import Highway.highway.Node;
import Highway.highway.Segment;

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
					&& getBusinessObjectForPictogramElement(targetPictogramElement) instanceof Node) {
				if (((Node)getBusinessObjectForPictogramElement(targetPictogramElement)).getHasEnds().isEmpty() && ((Node)getBusinessObjectForPictogramElement(targetPictogramElement)).getHasStarts().isEmpty())
					return false;
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
		Node myNode = (Node)getBusinessObjectForPictogramElement(targetPictogramElement);
		EList<Segment> segList = myNode.getHasEnds();
		segList.addAll(myNode.getHasStarts());
		Object[] options = new Object[segList.size()];
		int i = 0;
		for (Segment s : segList){
			options[i] = s.getName(); 
			i++;
		}
		Object seleccion = JOptionPane.showInputDialog(
				new JFrame(),
				   "Select SEGMENT",
				   "Options",
				   JOptionPane.QUESTION_MESSAGE,
				   null,  
				   options, 
				   options[0]);
		
		for (Segment s : segList){
			if (s.getName().equals(seleccion))
				s.getHasCars().add(myCar);
		}
		

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
