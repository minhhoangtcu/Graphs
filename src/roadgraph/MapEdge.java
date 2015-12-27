package roadgraph;

import geography.GeographicPoint;

public class MapEdge {

	private GeographicPoint from, to;
	private String roadName, roadType;
	private double length;

	public MapEdge(GeographicPoint from, GeographicPoint to, String roadName, String roadType, double length) {
		this.from = from;
		this.to = to;
		this.roadName = roadName;
		this.roadType = roadType;
		this.length = length;
	}

	/**
	 * @return the from
	 */
	public GeographicPoint getFrom() {
		return from;
	}

	/**
	 * @return the to
	 */
	public GeographicPoint getTo() {
		return to;
	}

	/**
	 * @return the roadName
	 */
	public String getRoadName() {
		return roadName;
	}

	/**
	 * @return the roadType
	 */
	public String getRoadType() {
		return roadType;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
}
