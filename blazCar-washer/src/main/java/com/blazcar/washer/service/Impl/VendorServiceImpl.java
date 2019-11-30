package com.blazcar.washer.service.Impl;

import java.io.IOException;
import java.util.List;

import com.blazcar.washer.domain.VendorDetail;
import com.blazcar.washer.integration.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blazcar.washer.common.util.JsonParserHelper;
import com.blazcar.washer.integration.UrlBuilderHelper;
import com.blazcar.washer.repository.VendorDetailRepository;
import com.blazcar.washer.service.VendorService;


@Service
public class VendorServiceImpl implements VendorService{

	@Autowired
    HttpService httpService;
	
	@Autowired
	UrlBuilderHelper urlBuilderHelper;
	
	@Autowired
	JsonParserHelper jsonParserHelper;
	
	@Autowired
	VendorDetailRepository vendorDetailRepository;
	
	/*@Override
	public Map<String, Map<String, List<VendorDetailDTO>>> getVendorList(VendorSearchCriteriaDTO searchCriteriaDTO) {
		
		String baseUrl = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";
		String location = "12.9207533,77.7072302";
		String radius = "2000";
		String types = "travel_agency";
		String key = "AIzaSyDzhb2JFt-h8JhsFGuJFNK8dAf7dT9OQ2k";
		
		String url  = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=12.9207533,77.7072302&radius=2000&types=car_wash&key=AIzaSyDzhb2JFt-h8JhsFGuJFNK8dAf7dT9OQ2k";
		String rawData = null;
		try {
			rawData = httpService.readUrl(url);
			List<VendorDetail> vendorDetails = jsonParserHelper.prepareVendorDetail(rawData);
			vendorDetailRepository.saveAll(vendorDetails);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}*/
	
	@Override //@@TODO temporary remove after testing
	public List<VendorDetail> getVendorList() {
		List<VendorDetail> vendorDetails = null;
		String baseUrl = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";
		String location = "12.9207533,77.7072302";
		String radius = "2000";
		String types = "travel_agency";
		String key = "AIzaSyDzhb2JFt-h8JhsFGuJFNK8dAf7dT9OQ2k";
		
		String url  = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=12.9207533,77.7072302&radius=2000&types=car_wash&key=AIzaSyDzhb2JFt-h8JhsFGuJFNK8dAf7dT9OQ2k";
		String rawData = null;
		
		try {
			rawData = httpService.readUrl(url);
			vendorDetails = jsonParserHelper.prepareVendorDetail(rawData);
			vendorDetailRepository.saveAll(vendorDetails);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vendorDetails;
	}
}
