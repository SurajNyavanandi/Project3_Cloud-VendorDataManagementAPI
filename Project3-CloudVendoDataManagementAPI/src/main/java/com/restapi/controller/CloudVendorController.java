package com.restapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.CloudVendor;
import com.restapi.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	CloudVendorService cloudVendorService;
	public CloudVendorController(CloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}

	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable Integer vendorId) {
		return cloudVendorService.getCloudVendor(vendorId);
	}
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails() {
		return cloudVendorService.getAllCloudVendors();
	}
	
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
    	cloudVendorService.createCloudVendor(cloudVendor);
    	return "CloudVendor Created Successfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
    	cloudVendorService.updateCloudVendor(cloudVendor);
    	return "CloudVendor Details Updated Successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable Integer vendorId) {
    	cloudVendorService.deleteCloudVendor(vendorId);
    	return "CloudVendor Details Deleted Successfully";
    }
	
}
