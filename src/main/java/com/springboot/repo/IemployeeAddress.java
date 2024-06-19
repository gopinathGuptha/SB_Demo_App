package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.EmployeeAddress;

public interface IemployeeAddress extends JpaRepository<EmployeeAddress, Integer>{

}
