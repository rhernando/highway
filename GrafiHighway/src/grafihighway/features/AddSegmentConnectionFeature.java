package grafihighway.features;

import highwayproj.highway.Segment;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;


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

		Polyline polyline = gaService.createPolyline(connection);
		polyline.setForeground(manageColor(IColorConstant.BLACK));
		int w = 2;
		if (segm.getNumLanes() != 0)
			w *=segm.getNumLanes();
		
		polyline.setLineWidth(w);
		polyline.setLineStyle(LineStyle.SOLID);

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
