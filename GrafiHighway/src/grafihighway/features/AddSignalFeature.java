package grafihighway.features;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import Highway.highway.Signal;
import Highway.highway.Speedlimit;
import Highway.highway.Stop;
import Highway.highway.Yield;

public class AddSignalFeature extends AbstractAddFeature implements
		IAddFeature {

	public AddSignalFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO: check for right domain object instance below
		return context.getNewObject() instanceof Signal && context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {

		Signal newSignal = (Signal) context.getNewObject();

		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		ContainerShape containerShape = peCreateService.createContainerShape(
				targetDiagram, true);

		if (context.getNewObject() instanceof Yield) {
			int xy[] = new int[] { 0, 0, 50, 0, 25, 50 };
			int beforeAfter[] = new int[] { 5, 5, 5, 5, 5, 5};
			Polygon p = gaService.createPolygon(containerShape, xy, beforeAfter);
			gaService.setLocationAndSize(p, context.getX(),
					context.getY(), context.getWidth(), context.getHeight());
			p.setForeground(manageColor(IColorConstant.RED));
			p.setBackground(manageColor(IColorConstant.WHITE));
			p.setLineWidth(5);
		}else if (context.getNewObject() instanceof Stop){
			int xy[] = new int[] { 0,25, 25,0, 50,0, 75,25, 75,50, 50,75, 25,75, 0,50};
			Polygon p = gaService.createPolygon(containerShape, xy);
			gaService.setLocationAndSize(p, context.getX(),
					context.getY(), context.getWidth(), context.getHeight());
			p.setForeground(manageColor(IColorConstant.WHITE));
			p.setBackground(manageColor(IColorConstant.RED));
			p.setLineWidth(5);

			Shape shape = peCreateService.createShape(containerShape, false);
			Text text = gaService.createText(shape, "STOP");
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setForeground(manageColor(IColorConstant.WHITE));
			gaService.setLocationAndSize(text, 25, 30, p.getWidth(), p.getHeight());

			
		} else {

			Ellipse circ = gaService.createEllipse(containerShape);
			circ.setForeground(manageColor(IColorConstant.RED));
			circ.setBackground(manageColor(IColorConstant.WHITE));
			circ.setLineWidth(7);
			gaService.setLocationAndSize(circ, context.getX(), context.getY(),
					75, 75);

			Shape shape = peCreateService.createShape(containerShape, false);
			Text text = gaService.createText(shape,
					Integer.toString(((Speedlimit) newSignal).getSpeed()));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			gaService.setLocationAndSize(text, 0, 0, circ.getWidth(),
					circ.getHeight());
		}

		peCreateService.createChopboxAnchor(containerShape);

		link(containerShape, newSignal);

		return containerShape;
	}
}
