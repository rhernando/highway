package grafihighway.diagram;

import grafihighway.features.AddAttachSemaphoreConnectionFeature;
import grafihighway.features.AddAttachSignalConnectionFeature;
import grafihighway.features.AddNodeFeature;
import grafihighway.features.AddSegmentConnectionFeature;
import grafihighway.features.AddSemaphoreFeature;
import grafihighway.features.AddSignalFeature;
import grafihighway.features.CreateAttachSemaphoreConnectionFeature;
import grafihighway.features.CreateAttachSignalConnectionFeature;
import grafihighway.features.CreateDomainObjectConnectionConnectionFeature;
import grafihighway.features.CreateHighwayFeature;
import grafihighway.features.CreateNodeFeature;
import grafihighway.features.CreateSegmentConnectionFeature;
import grafihighway.features.CreateSemaphoreFeature;
import grafihighway.features.CreateSignalFeature;
import grafihighway.features.LayoutNodeFeature;
import grafihighway.features.LayoutSemaphoreFeature;
import highway.Node;
import highway.Segment;
import highway.Semaphore;
import highway.Signal;

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

public class GrafiHighwayFeatureProvider extends DefaultFeatureProvider {

	public GrafiHighwayFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] { new CreateHighwayFeature(this),
				new CreateNodeFeature(this), new CreateSemaphoreFeature(this),
				new CreateSignalFeature(this) };
	}
	
	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {
				new CreateDomainObjectConnectionConnectionFeature(this),
				new CreateSegmentConnectionFeature(this),
				new CreateAttachSignalConnectionFeature(this),
				new CreateAttachSemaphoreConnectionFeature(this) };
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if (context instanceof IAddContext){
			if (context.getNewObject() instanceof Node) return new AddNodeFeature(this);
			if (context.getNewObject() instanceof Semaphore) return new AddSemaphoreFeature(this);
			if (context.getNewObject() instanceof Signal) return new AddSignalFeature(this);
		}
		if (context instanceof IAddConnectionContext){
			if (context.getNewObject() instanceof Segment) return new AddSegmentConnectionFeature(this);
			if (context.getNewObject() instanceof String && context.getNewObject().equals("SEM")) return new AddAttachSemaphoreConnectionFeature(this);
			if (context.getNewObject() instanceof String && context.getNewObject().equals("SIG")) return new AddAttachSignalConnectionFeature(this);
			
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
			if (object instanceof Semaphore) return new LayoutSemaphoreFeature(this);
			//return  new LayoutHighwayFeature(this);
		}
	
		return super.getLayoutFeature(context);
	}
}
