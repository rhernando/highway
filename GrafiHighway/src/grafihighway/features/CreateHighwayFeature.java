package grafihighway.features;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class CreateHighwayFeature extends AbstractCreateFeature implements
		ICreateFeature {

	public CreateHighwayFeature(IFeatureProvider fp) {
		super(fp, "Highway", "Creates a new Highway");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// TODO: create the domain object here
		Object newHighway = null;
		
		// TODO: in case of an EMF object add the new object to a suitable resource
		// getDiagram().eResource().getContents().add(newHighway);

		addGraphicalRepresentation(context, newHighway);
		return new Object[] { newHighway };
	}
}
