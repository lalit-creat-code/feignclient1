package com.lalit.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lalit.response.AddressResponse;

@FeignClient(name = "address-api" , url = "http://localhost:8081",path = "/address-service")
	public interface AddressClient {
	 
	    @GetMapping("/address/{empId}")
	    public ResponseEntity<AddressResponse> getAddressByEmpId(@PathVariable("empId") int empId);
	 
	}

