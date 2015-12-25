package roadgraph;

import geography.GeographicPoint;

public class MapEdge {

	private GeographicPoint from, to;
	private MapNode wFrom, wTo;
	private String roadName, roadType;
	private double length;

	public MapEdge(MapNode wFrom, MapNode wTo, String roadName, String roadType, double length) {
		this.wFrom = wFrom;
		this.wTo = wTo;
		this.from = wFrom.getLocation();
		this.to = wTo.getLocation();
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

	public MapNode getwFrom() {
		return wFrom;
	}

	public MapNode getwTo() {
		return wTo;
	}
	
	

}
