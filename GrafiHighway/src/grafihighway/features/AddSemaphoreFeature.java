package grafihighway.features;

import highwayproj.highway.Semaphore;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

public class AddSemaphoreFeature extends AbstractAddFeature implements
		IAddFeature {

	public AddSemaphoreFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO: check for right domain object instance below
		return context.getNewObject() instanceof Semaphore && context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		
		Semaphore newSemaphore = (Semaphore)context.getNewObject();

		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
		Ellipse circ = gaService.createEllipse(containerShape);
		circ.setForeground(manageColor(IColorConstant.BLACK));
		circ.setLineWidth(5);
		gaService.setLocationAndSize(circ, context.getX(), context.getY(),
				50, 50);

		if (newSemaphore.isCanGo())
			circ.setBackground(manageColor(new ColorConstant(0,250,0)));
		else
			circ.setBackground(manageColor(new ColorConstant(250,0,0)));
		

		peCreateService.createChopboxAnchor(containerShape);

		link(containerShape, newSemaphore);

		return containerShape;
	}
}
