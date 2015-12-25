package roadgraph;

import java.util.LinkedList;

import geography.GeographicPoint;

public class MapNode {

	private GeographicPoint location;
	private LinkedList<MapEdge> edges; // this list contains all out edges
	private MapNode backTrack;
	
	public MapNode(GeographicPoint location) {
		this.location = location;
		edges = new LinkedList<>();
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

	public MapNode getBackTrack() {
		return backTrack;
	}

	public void setBackTrack(MapNode backTrack) {
		this.backTrack = backTrack;
	}
}
