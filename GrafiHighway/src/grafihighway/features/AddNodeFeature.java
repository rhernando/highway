package grafihighway.features;

import highwayproj.highway.Extractor;
import highwayproj.highway.Injector;
import highwayproj.highway.Node;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
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

public class AddNodeFeature extends AbstractAddFeature implements
		IAddFeature {

	public AddNodeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO: check for right domain object instance below
		return context.getNewObject() instanceof Node && context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		
		Node newNode = (Node)context.getNewObject();
	
		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

        int width = 80;
        int height = 80; 

		ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
		RoundedRectangle roundedRectangle = gaService.createRoundedRectangle(containerShape, 5, 5);
		if (newNode instanceof Injector){
			roundedRectangle.setBackground(manageColor(new ColorConstant(80,150,200)));
		}else if (newNode instanceof Extractor){
			roundedRectangle.setBackground(manageColor(new ColorConstant(120,80,220)));
		}else{
			roundedRectangle.setBackground(manageColor(new ColorConstant(60,80,220)));
		}

		roundedRectangle.setLineWidth(2);
		gaService.setLocationAndSize(roundedRectangle, context.getX(), context.getY(), width, height);
		
		Shape shape = peCreateService.createShape(containerShape, false);
		Text text = gaService.createText(shape, "N: " + newNode.getName());
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setForeground(manageColor(new ColorConstant(230,230,230)));
		
		gaService.setLocationAndSize(text, 0, 0, roundedRectangle.getWidth(), roundedRectangle.getHeight());

		peCreateService.createChopboxAnchor(containerShape);

		link(containerShape, newNode);

		return containerShape;
	}
}
