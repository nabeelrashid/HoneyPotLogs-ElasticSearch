package com.logs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="geopoint",type="geopoint")
public class GeoPoint {
	@Id
	int lat;
	int lon;
	/**
	 * @return the lat
	 */
	public int getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(int lat) {
		this.lat = lat;
	}
	/**
	 * @return the lon
	 */
	public int getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(int lon) {
		this.lon = lon;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GeoPoint [lat=" + lat + ", lon=" + lon + "]";
	}

	
}
