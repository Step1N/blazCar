package com.blazcar.washer.dto;

public class VendorDetailDTO {

	private String vendorName;
	private VendorAddressDTO address;
	private String rating;
	private String imageLink;
	
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public VendorAddressDTO getAddress() {
		return address;
	}
	public void setAddress(VendorAddressDTO address) {
		this.address = address;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
}
