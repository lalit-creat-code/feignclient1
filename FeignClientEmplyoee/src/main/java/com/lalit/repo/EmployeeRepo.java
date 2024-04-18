package com.lalit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lalit.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
