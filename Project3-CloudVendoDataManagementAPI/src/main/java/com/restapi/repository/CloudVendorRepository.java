package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, Integer> {

}
