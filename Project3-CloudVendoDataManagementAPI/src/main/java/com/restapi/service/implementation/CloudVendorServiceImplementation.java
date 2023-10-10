package com.restapi.service.implementation;

import java.util.List;
import org.springframework.stereotype.Service;
import com.restapi.model.CloudVendor;
import com.restapi.repository.CloudVendorRepository;
import com.restapi.service.CloudVendorService;

@Service
public class CloudVendorServiceImplementation implements CloudVendorService{
	
	CloudVendorRepository cloudVendorRepository;
	public CloudVendorServiceImplementation(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}
	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}
	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}
	@Override
	public int deleteCloudVendor(Integer cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return 18;
	}
	@Override
	public CloudVendor getCloudVendor(Integer cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
	}
	@Override
	public List<CloudVendor> getAllCloudVendors() {
		
		return cloudVendorRepository.findAll();
	}


	
}
