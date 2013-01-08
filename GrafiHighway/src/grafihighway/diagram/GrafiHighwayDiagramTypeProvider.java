package grafihighway.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class GrafiHighwayDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public GrafiHighwayDiagramTypeProvider() {
		super();
		setFeatureProvider(new GrafiHighwayFeatureProvider(this));
	}
}
