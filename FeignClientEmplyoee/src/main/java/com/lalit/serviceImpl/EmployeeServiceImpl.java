package com.lalit.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lalit.entity.Employee;
import com.lalit.feignclient.AddressClient;
import com.lalit.repo.EmployeeRepo;
import com.lalit.response.AddressResponse;
import com.lalit.response.EmpResponse;
import com.lalit.service.EmplyoeeService;


@Service
public class EmployeeServiceImpl implements EmplyoeeService {
@Autowired
private EmployeeRepo repo;
@Autowired
private ModelMapper mapper;
@Autowired
private AddressClient addressClient;
	
	@Override
	public EmpResponse getDetails(Integer id) {
		                 Employee employee=repo.findById(id).orElseThrow();
		                EmpResponse emp= mapper.map(employee,EmpResponse.class);
		                   emp.setEmpId(id);
		                              ResponseEntity<AddressResponse> add= addressClient.getAddressByEmpId(id);
		                                        emp.setAddResponse(add.getBody());        
		return emp;
	}
	

}
