package roadgraph;

import java.util.LinkedList;

import geography.GeographicPoint;

public class MapNode {

	private GeographicPoint location;
	private LinkedList<MapEdge> edges; // this list contains all out edges
	
	public MapNode(GeographicPoint location) {
		this.location = location;
		edges = new LinkedList<>();
	}

	public void addEdge(MapEdge edge) {
		edges.add(edge);
	}

	public GeographicPoint getLocation() {
		return location;
	}

	public LinkedList<MapEdge> getEdges() {
		return edges;
	}
	
	public LinkedList<GeographicPoint> getPoints() {
		LinkedList<GeographicPoint> points = new LinkedList<>();
		for (MapEdge mapEdge : edges) {
			points.add(mapEdge.getTo());
		}
		return points;
	}
}
