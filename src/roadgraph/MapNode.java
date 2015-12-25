package roadgraph;

import java.util.LinkedList;

import geography.GeographicPoint;

public class MapNode {
	
	private GeographicPoint location;
	private LinkedList<MapEdge> edges;
	
	public MapNode(GeographicPoint location) {
		this.location = location;
	}

	public void addEdge(MapEdge edge) {
		edges.add(edge);
	}

	/**
	 * @return the location
	 */
	public GeographicPoint getLocation() {
		return location;
	}

	/**
	 * @return the edges
	 */
	public LinkedList<MapEdge> getEdges() {
		return edges;
	}
}
