package com.lalit.AddRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lalit.entity.Address;

public interface AddressRepo extends JpaRepository<Address,Integer> {
public Address findByEmpId(Integer id);
}
