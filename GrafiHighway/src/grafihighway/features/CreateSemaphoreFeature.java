package grafihighway.features;

import highway.HighwayFactory;
import highway.Semaphore;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

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
		
		// TODO: in case of an EMF object add the new object to a suitable resource
		getDiagram().eResource().getContents().add(newSemaphore);

		addGraphicalRepresentation(context, newSemaphore);
		return new Object[] { newSemaphore };
	}
}
