package grafihighway.features;

import highwayproj.highway.Car;
import highwayproj.highway.HighwayFactory;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class CreateCarFeature extends AbstractCreateFeature implements
		ICreateFeature {

	public CreateCarFeature(IFeatureProvider fp) {
		super(fp, "Car", "Creates a new Car");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// TODO: create the domain object here
		Car newCar = HighwayFactory.eINSTANCE.createCar();
		String name = JOptionPane.showInputDialog(new JFrame(),
				"Element Name", "");

		newCar.setName(name);
		// TODO: in case of an EMF object add the new object to a suitable resource
		getDiagram().eResource().getContents().add(newCar);

		addGraphicalRepresentation(context, newCar);
		return new Object[] { newCar };
	}
}
