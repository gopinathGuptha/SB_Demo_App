package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Employee;

public interface IemployeeRepo extends JpaRepository<Employee, Integer>{

}
