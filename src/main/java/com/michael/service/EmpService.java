package com.michael.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.dao.EmpRepo;
import com.michael.model.Emp;

@Service
public class EmpService {
	@Autowired
	private EmpRepo empRepo;
	
	public Emp createEmp(Emp emp) {
		return empRepo.save(emp);
	}
	public List<Emp> findAllEmps(){
		return (List<Emp>)empRepo.findAll();
	}
	public Optional<Emp> findById(int empId) {
		return empRepo.findById(empId);
	}
	
	public void deleteById(int empId) {
		empRepo.deleteById(empId);
	}
	
	public void updateEmp(int empId) {
		Emp e=new Emp();
		empRepo.save(e);
	}
	
}
