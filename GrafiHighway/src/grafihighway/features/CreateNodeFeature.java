package grafihighway.features;

import highwayproj.highway.HighwayFactory;
import highwayproj.highway.Injector;
import highwayproj.highway.Node;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class CreateNodeFeature extends AbstractCreateFeature implements
		ICreateFeature {

	public CreateNodeFeature(IFeatureProvider fp) {
		super(fp, "Node", "Creates a new Node");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		Node newNode = HighwayFactory.eINSTANCE.createNode();

		String name = JOptionPane.showInputDialog(new JFrame(),
				"Element Name", "");
		
		Object[] options = {"Injector", "Extractor", "Normal Node"};
		int opt = JOptionPane.showOptionDialog(new JFrame(), "Node type", "Select node type",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				options, options[1]);

		if (opt == 0){
			newNode = HighwayFactory.eINSTANCE.createInjector();
			SpinnerModel sm = new SpinnerNumberModel(0,0,3600, 1);
			JSpinner jsp = new JSpinner(sm);
	        int numCar = JOptionPane.showOptionDialog(null, jsp, "Number of cars per hour", JOptionPane.OK_OPTION, JOptionPane.CLOSED_OPTION, null, null, null);
	        ((Injector)newNode).setCarsPerHour(numCar);
	        
	        
		}else if (opt == 1){
			newNode = HighwayFactory.eINSTANCE.createExtractor();				
		}

		newNode.setName(name);
		
		// TODO: in case of an EMF object add the new object to a suitable resource
		getDiagram().eResource().getContents().add(newNode);

		addGraphicalRepresentation(context, newNode);
		return new Object[] { newNode };
	}
}
