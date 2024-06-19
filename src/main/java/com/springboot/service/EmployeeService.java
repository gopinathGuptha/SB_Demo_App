package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.entity.Employee;
import com.springboot.entity.EmployeeAddress;
import com.springboot.repo.IemployeeAddress;
import com.springboot.repo.IemployeeRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	private IemployeeRepo empRepo;
	private IemployeeAddress addrRepo;

	public EmployeeService(IemployeeRepo empRepo, IemployeeAddress addrRepo) {
		this.empRepo = empRepo;
		this.addrRepo = addrRepo;
	}

	@Transactional(rollbackOn = Exception.class) 
	public void saveEmployeeRecObj() {
		Employee emp = new Employee("Gopinath", 25000.00);
		Employee saveEmp = empRepo.save(emp);
	

		EmployeeAddress empAddr = new EmployeeAddress("Nandigama", "AP", "India", "Permanent", saveEmp.getEmpId());
		addrRepo.save(empAddr);
	}

}
