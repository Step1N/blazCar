package com.blazcar.washer.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import com.blazcar.washer.common.base.BaseDomain;

@Document
public class Viewport extends BaseDomain{

	private Location northeast;
	private Location southwest;
	public Location getNortheast() {
		return northeast;
	}
	public void setNortheast(Location northeast) {
		this.northeast = northeast;
	}
	public Location getSouthwest() {
		return southwest;
	}
	public void setSouthwest(Location southwest) {
		this.southwest = southwest;
	}
}
