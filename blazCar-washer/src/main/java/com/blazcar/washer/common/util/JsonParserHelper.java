package com.blazcar.washer.common.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.blazcar.washer.domain.Geometry;
import com.blazcar.washer.domain.Location;
import com.blazcar.washer.domain.PlusCode;
import com.blazcar.washer.domain.VendorDetail;
import com.blazcar.washer.domain.Viewport;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Component
public class JsonParserHelper {
	
	private final String RESULTS= "results";
	private final String GEOMETRY= "geometry";
	private final String LOCATION= "location";
	private final String LNG= "lng";
	private final String LAT= "lat";
	private final String NORTHEAST= "northeast";
	private final String SOUTHWEST= "southwest";
	private final String VICINITY= "vicinity";
	private final String VIEWPORT= "viewport";
	private final String NAME= "name";
	private final String RATING= "rating";
	private final String USER_RATNG_TOTAL= "user_ratings_total";
	private final String PLUS_CODE= "plus_code";
	private final String COMPOUND_CODE= "compound_code";
	private final String GLOBAL_CODE= "global_code";
	
	
	public List<VendorDetail> prepareVendorDetail(String rawData){
		List<VendorDetail> vendorDetails = new ArrayList<>();
		JsonArray jsonArray = getArray(rawData, RESULTS);
		if(jsonArray!=null){
			for(JsonElement element: jsonArray){
				VendorDetail vendorDetail = new VendorDetail();
				JsonObject jsonObject = element.getAsJsonObject();
				vendorDetail.setGeometry(prepareGeometry(jsonObject.getAsJsonObject(GEOMETRY)));
				vendorDetail.setName(getValue(jsonObject, NAME));
				vendorDetail.setRating(getValue(jsonObject, RATING));
				vendorDetail.setUserRatingsTotal(getValue(jsonObject, USER_RATNG_TOTAL));
				vendorDetail.setVicinity(getValue(jsonObject, VICINITY));
				//@@TODO
				vendorDetail.setImageURL("");
				vendorDetail.setPlusCode(preparePlusCode(jsonObject));
				vendorDetails.add(vendorDetail);
			}
			 
		}
		
		return vendorDetails;
	}
	
	private PlusCode preparePlusCode(JsonObject json){
		if(isNull(json)){
			return null;
		}
		
		PlusCode plusCode = new PlusCode();
		JsonObject jsonObject = json.getAsJsonObject(PLUS_CODE);
		plusCode.setCompoundCode(getValue(jsonObject, COMPOUND_CODE));
		plusCode.setGlobalCode(getValue(jsonObject, GLOBAL_CODE));
		
		return plusCode;
	}
	
	private Location prepareLocation(JsonObject loc){
		if(isNull(loc)){
			return null;
		}
		Location location = new Location();
		location.setLat(getValue(loc, LAT));
		location.setLng(getValue(loc, LNG));
		return location;
	}
	
	private Viewport prepareViewport(JsonObject jsonObject){
		if(isNull(jsonObject)){
			return null;
		}
		Viewport viewport = new Viewport();
		viewport.setNortheast(prepareLocation(jsonObject.getAsJsonObject(NORTHEAST)));
		viewport.setSouthwest(prepareLocation(jsonObject.getAsJsonObject(SOUTHWEST)));
		
		return viewport;
	}
	
	private Geometry prepareGeometry(JsonObject jsonObject){
		if(isNull(jsonObject)){
			return null;
		}
		Geometry geometry = new Geometry();
		
		geometry.setLocation(prepareLocation(jsonObject.getAsJsonObject(LOCATION)));
		geometry.setViewport(prepareViewport(jsonObject.getAsJsonObject(VIEWPORT)));
		
		return geometry;
	}
	
	private boolean isNull(JsonObject jsonObject){
		if(jsonObject == null ){
			return true;
		}
		
		return false;
	}
	
	private JsonArray getArray(String rawData, String key){
		JsonParser jsonParser = new JsonParser();
		JsonElement jsonElement = jsonParser.parse(rawData);
		if(jsonElement.isJsonObject()){
			JsonObject jsonObject = jsonElement.getAsJsonObject();
			JsonArray jsonArray = jsonObject.getAsJsonArray(key);
			if(jsonArray.isJsonArray()){
				return jsonArray;
			}
		}
		
		return null;
	}
	
	private String getValue(JsonObject object, String key){
		JsonElement element = object.get(key);
		if(!(element == null || element instanceof JsonNull)){
			return element.getAsString();
		}
		
		return null;
	}
}
