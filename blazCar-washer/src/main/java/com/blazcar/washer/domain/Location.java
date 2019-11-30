package com.blazcar.washer.domain;

import com.blazcar.washer.common.base.BaseDomain;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Location extends BaseDomain {

	private String lat;
	private String lng;
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	
	
}
