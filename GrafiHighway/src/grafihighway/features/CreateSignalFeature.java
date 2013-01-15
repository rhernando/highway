package grafihighway.features;

import highway.HighwayFactory;
import highway.Signal;

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
		// TODO: create the domain object here
		Signal newSignal = HighwayFactory.eINSTANCE.createSignal();
		
		// TODO: in case of an EMF object add the new object to a suitable resource
		getDiagram().eResource().getContents().add(newSignal);

		addGraphicalRepresentation(context, newSignal);
		return new Object[] { newSignal };
	}
}
