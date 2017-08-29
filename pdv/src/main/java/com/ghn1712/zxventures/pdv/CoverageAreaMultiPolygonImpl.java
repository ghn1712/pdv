package com.ghn1712.zxventures.pdv;

import org.mongodb.morphia.geo.MultiPolygon;

public class CoverageAreaMultiPolygonImpl implements GeoArea<MultiPolygon>{
	String type;
	MultiPolygon coordinates;
	@Override
	public String returnType() {
		return this.type;
	}
	@Override
	public MultiPolygon returnCoordinates() {
		return this.coordinates;
	}
	
}
