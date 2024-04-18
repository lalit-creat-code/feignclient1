package com.lalit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lalit.AddserviceImpl.AddressImpl;
import com.lalit.dto.AddressDto;
import com.lalit.entity.Address;

@RestController()
public class AddressController {
	@Autowired
	private AddressImpl service;
	@PostMapping("/save")
	public String save(Address add) {
		boolean save= service.save(add);
		if(save) {
			return "save sucessfully";
		}else return " not saved";
		  }
	@GetMapping("/address/{empId}")
	public ResponseEntity<AddressDto> getAddressByEmpId(@PathVariable("empId")Integer empId) {
		    
		   AddressDto add1= service.getAddressByEmpId(empId);
		      return new ResponseEntity<>(add1,HttpStatus.OK);
	}

}
