package grafihighway.features;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import highwayproj.highway.HighwayFactory;
import highwayproj.highway.Signal;
import highwayproj.highway.Speedlimit;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class CreateSignalFeature extends AbstractCreateFeature implements
		ICreateFeature {

	public CreateSignalFeature(IFeatureProvider fp) {
		super(fp, "Signal", "Creates a new Signal");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		Signal newSignal = HighwayFactory.eINSTANCE.createSignal();
		String name = JOptionPane.showInputDialog(new JFrame(),
				"Element Name", ""); 

		Object[] options = {"Speed Limit", "Stop", "Yield"};
		int opt = JOptionPane.showOptionDialog(new JFrame(), "Signal type", "Select signal type",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				options, options[1]);
		if (opt == 0){
			newSignal = HighwayFactory.eINSTANCE.createSpeedlimit();
			Object[] speedOptions = {"30","50","70","90","100","120"};
			
			Object seleccion = JOptionPane.showInputDialog(
					new JFrame(),
					   "Select max speed",
					   "Options",
					   JOptionPane.QUESTION_MESSAGE,
					   null,  
					   speedOptions, 
					   speedOptions[4]);
			((Speedlimit)newSignal).setSpeed(Integer.valueOf(seleccion.toString()));
		}else if (opt == 1){
			newSignal = HighwayFactory.eINSTANCE.createStop();			
		}else{
			newSignal = HighwayFactory.eINSTANCE.createYield();
		}

		newSignal.setName(name);
		
		// TODO: in case of an EMF object add the new object to a suitable resource
		getDiagram().eResource().getContents().add(newSignal);

		addGraphicalRepresentation(context, newSignal);
		return new Object[] { newSignal };
	}
}
