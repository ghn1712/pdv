package com.ghn1712.zxventures.pdv;

import com.mongodb.client.model.geojson.Point;

public class Address implements GeoArea<Point>{
	String type;
	Point coordinates;
	
	@Override
	public String returnType() {
		return this.type;
	}
	@Override
	public Point returnCoordinates() {
		return this.coordinates;
	}
	
}
