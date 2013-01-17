package grafihighway.features;

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

import Highway.highway.HighwayFactory;
import Highway.highway.Semaphore;

public class CreateSemaphoreFeature extends AbstractCreateFeature implements
		ICreateFeature {

	public CreateSemaphoreFeature(IFeatureProvider fp) {
		super(fp, "Semaphore", "Creates a new Semaphore");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// TODO: create the domain object here
		Semaphore newSemaphore = HighwayFactory.eINSTANCE.createSemaphore();
		newSemaphore.setName(JOptionPane.showInputDialog(new JFrame(),
				"Element Name", ""));

		Object[] options = {"Red", "Green"};
		int opt = JOptionPane.showOptionDialog(new JFrame(), "Initial value", "Select:",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				options, options[1]);
		newSemaphore.setCanGo(opt != 0);

		SpinnerModel sm = new SpinnerNumberModel(0,0,60, 1);
		JSpinner jsp = new JSpinner(sm);
		
        JOptionPane.showOptionDialog(null, jsp, "Red light delay", JOptionPane.CLOSED_OPTION, JOptionPane.CLOSED_OPTION, null, null, null);
        newSemaphore.setSecondsRed((Integer)sm.getValue());

        JOptionPane.showOptionDialog(null, jsp, "Green light delay", JOptionPane.CLOSED_OPTION, JOptionPane.CLOSED_OPTION, null, null, null);
        newSemaphore.setSecondsGreen((Integer)sm.getValue());
        
        
		// TODO: in case of an EMF object add the new object to a suitable resource
		getDiagram().eResource().getContents().add(newSemaphore);

		addGraphicalRepresentation(context, newSemaphore);
		return new Object[] { newSemaphore };
	}
}
