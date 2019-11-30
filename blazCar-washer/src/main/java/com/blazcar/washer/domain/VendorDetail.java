package com.blazcar.washer.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.blazcar.washer.common.base.BaseDomain;

@Document
public class VendorDetail extends BaseDomain{

	@Id
	private String id;
	private Geometry geometry;
	private String name;
	private String imageURL;
	private PlusCode plusCode;
	private String rating;
	private String userRatingsTotal;
	private String vicinity;
	
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public PlusCode getPlusCode() {
		return plusCode;
	}
	public void setPlusCode(PlusCode plusCode) {
		this.plusCode = plusCode;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getUserRatingsTotal() {
		return userRatingsTotal;
	}
	public void setUserRatingsTotal(String userRatingsTotal) {
		this.userRatingsTotal = userRatingsTotal;
	}
	public String getVicinity() {
		return vicinity;
	}
	public void setVicinity(String vicinity) {
		this.vicinity = vicinity;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
