package grafihighway.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import grafihighway.features.AddDomainObjectConnectionConnectionFeature;
import grafihighway.features.AddHighwayFeature;
import grafihighway.features.AddNodeFeature;
import grafihighway.features.AddSegmentConnectionFeature;
import grafihighway.features.CreateDomainObjectConnectionConnectionFeature;
import grafihighway.features.CreateHighwayFeature;
import grafihighway.features.CreateNodeFeature;
import grafihighway.features.CreateSegmentConnectionFeature;
import grafihighway.features.LayoutHighwayFeature;
import grafihighway.features.LayoutNodeFeature;

import highway.Highway;
import highway.Node;
import highway.Segment;

public class GrafiHighwayFeatureProvider extends DefaultFeatureProvider {

	public GrafiHighwayFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] {new CreateHighwayFeature(this), new CreateNodeFeature(this)};
	}
	
	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {new CreateDomainObjectConnectionConnectionFeature(this), new CreateSegmentConnectionFeature(this)};
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if (context instanceof IAddContext){
			if (context.getNewObject() instanceof Node) return new AddNodeFeature(this);
		}
		if (context instanceof IAddConnectionContext){
			if (context.getNewObject() instanceof Segment) return new AddSegmentConnectionFeature(this);
		}
				
//		// TODO: check for right domain object instances below
//		if (context instanceof IAddConnectionContext /* && context.getNewObject() instanceof <DomainObject> */) {
//			return new AddDomainObjectConnectionConnectionFeature(this);
//		} else if (context instanceof IAddContext /* && context.getNewObject() instanceof <DomainObject> */) {
//			return new AddHighwayFeature(this);
//		}

		return super.getAddFeature(context);
	}
	
	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		// TODO: check for right domain object instances below
		if (context.getPictogramElement() instanceof ContainerShape /* && getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof <DomainObject> */) {
			Object object = getBusinessObjectForPictogramElement(context.getPictogramElement());
			if (object instanceof Node) return new LayoutNodeFeature(this);
			//return  new LayoutHighwayFeature(this);
		}
	
		return super.getLayoutFeature(context);
	}
}
