package com.lalit.AddserviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lalit.AddRepo.AddressRepo;
import com.lalit.dto.AddressDto;
import com.lalit.entity.Address;
import com.lalit.service.AddressService;
@Service
public class AddressImpl implements AddressService{
@Autowired
private AddressRepo arepo;
@Autowired
private AddressDto drepo;
@Autowired
private ModelMapper mapper;

	@Override
	public boolean save(Address add) {
		
		arepo.save(add);
		return true;
	}

	@Override
	public AddressDto getAddressByEmpId(Integer id) {
		 Address address=arepo.findByEmpId(id);
		        AddressDto addressdto=mapper.map( address,AddressDto.class);
		return addressdto;
	}

	

}
