package com.blazcar.washer.controller;

import java.util.List;

import com.blazcar.washer.domain.VendorDetail;
import com.blazcar.washer.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarWashController {
	
	org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(CarWashController.class);
	
	@Autowired
    VendorService vendorService;

	/*@PostMapping("/vendorList")
	public Map<String,Map<String, List<VendorDetailDTO>>> fetchVendorListBy(@RequestBody VendorSearchCriteriaDTO searchCriteriaDTO){
		
		logger.info("Entering CarWashController.getVendorList()");
		
		System.out.println("************** : vendorList");
		
		return vendorService.getVendorList(searchCriteriaDTO);
	}*/
	
	@GetMapping("/vendorList")
	public List<VendorDetail> fetchVendorListBy(){
		
		logger.info("Entering CarWashController.getVendorList()");
		
		return vendorService.getVendorList();
	}
}
