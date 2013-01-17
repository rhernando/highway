package grafihighway.features;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import Highway.highway.Segment;


public class AddSegmentConnectionFeature extends AbstractAddFeature implements
		IAddFeature {

	public AddSegmentConnectionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO: check for right domain object instance below
		return context instanceof IAddConnectionContext  && context.getNewObject() instanceof Segment ;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		Segment segm = (Segment)context.getNewObject();
		
		Connection connection = peCreateService
				.createFreeFormConnection(getDiagram());
		
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		int xy[] = new int[] { 0, 0, 50, 0, 25, 50 };
		int beforeAfter[] = new int[] { 5, 5, 5, 5, 5, 5};
		Polyline polyline = gaService.createPolyline(connection, xy, beforeAfter);
		polyline.setForeground(manageColor(IColorConstant.BLACK));
		int w = 2;
		if (segm.getNumLanes() != 0)
			w *=segm.getNumLanes();
		
		polyline.setLineWidth(w);
		polyline.setLineStyle(LineStyle.SOLID);
		polyline.setTransparency(0.5);
		
		peCreateService.createChopboxAnchor(connection);
		final BoxRelativeAnchor boxAnchor = peCreateService
				.createBoxRelativeAnchor(connection);
		boxAnchor.setRelativeWidth(1.0);
		boxAnchor.setRelativeHeight(0.38); // use golden section
		boxAnchor.setReferencedGraphicsAlgorithm(polyline);		 
	      final Rectangle rectangle = gaService.createPlainRectangle(boxAnchor);
	   //   rectangle.setForeground(manageColor(E_CLASS_FOREGROUND));
	 //     rectangle.setBackground(manageColor(E_CLASS_BACKGROUND));
	      rectangle.setLineWidth(2);
	      gaService.setLocationAndSize(rectangle, -12, -6, 12, 12);
		 
		ConnectionDecorator textDecorator = peCreateService
				.createConnectionDecorator(connection, true, 0.5, true);
		Text text = gaService.createDefaultText(getDiagram(), textDecorator);
		text.setForeground(manageColor(IColorConstant.BLACK));
		text.setValue(segm.getName() + " - " + segm.getLength() + " km. " + segm.getNumLanes() + " lanes ");
		gaService.setLocation(text, 10, 0);

		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 1.0,
				true);
		createArrow(cd);

		Object addedSegment = context.getNewObject();
		link(connection, addedSegment);

		return connection;
	}
	
	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
	    IGaService gaService = Graphiti.getGaService();
	    Polyline polyline =
	        gaService.createPolyline(gaContainer, new int[] { -15, 10, 0, 0, -15,
	                -10 });
	    polyline.setForeground(manageColor(IColorConstant.BLACK));
	    polyline.setLineWidth(2);
	    return polyline;
	}
}
