package com.lalit.service;

import com.lalit.dto.AddressDto;
import com.lalit.entity.Address;

public interface AddressService {
	public boolean save(Address add);
	public AddressDto getAddressByEmpId(Integer id);
	
	

}
