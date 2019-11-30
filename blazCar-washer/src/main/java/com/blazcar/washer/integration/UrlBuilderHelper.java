package com.blazcar.washer.integration;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class UrlBuilderHelper {

	/*private String baseUrl;
	private String location;
	private String radius;
	private String types;
	private String key;
	*/

	public String getUrl(String baseUrl, String location, String radius, String types, String key){
		
		UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(baseUrl);
		
		if(!StringUtils.isEmpty(location)){
			uriComponentsBuilder.replaceQueryParam("location", location);
		}
		
		if(!StringUtils.isEmpty(radius)){
			uriComponentsBuilder.replaceQueryParam("radius", radius);
		}
		
		if(!StringUtils.isEmpty(radius)){
			uriComponentsBuilder.replaceQueryParam("key", key);
		}
		
		if(!StringUtils.isEmpty(types)){
			uriComponentsBuilder.replaceQueryParam("types", types);
		}
		
		return uriComponentsBuilder.toString();
	}
}
