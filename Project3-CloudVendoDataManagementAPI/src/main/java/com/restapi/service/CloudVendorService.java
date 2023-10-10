package com.restapi.service;

import java.util.List;

import com.restapi.model.CloudVendor;

public interface CloudVendorService {
	
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public int deleteCloudVendor(Integer cloudVendorId);
	public CloudVendor getCloudVendor(Integer cloudVendorId);
	public List<CloudVendor> getAllCloudVendors();

}
