package com.lalit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lalit.entity.Employee;
import com.lalit.response.EmpResponse;
import com.lalit.serviceImpl.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl service;
	@GetMapping("/getDetails/{id}")
	public ResponseEntity<EmpResponse> getDetails(@PathVariable("id") Integer id){
		       // Integer id= emplyoee.getId();
		EmpResponse emp=service.getDetails(id);
		  return new ResponseEntity<>(emp,HttpStatus.OK);
		
	}

}
