package com.blazcar.washer.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import com.blazcar.washer.common.base.BaseDomain;

@Document
public class Geometry extends BaseDomain{

	private Location location;
	private Viewport viewport;
	public Location getLocation() {
		return location;
	}
	public Viewport getViewport() {
		return viewport;
	}
	public void setViewport(Viewport viewport) {
		this.viewport = viewport;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
}
