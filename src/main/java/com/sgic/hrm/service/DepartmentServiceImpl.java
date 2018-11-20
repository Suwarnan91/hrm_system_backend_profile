package com.sgic.hrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.Department;
import com.sgic.hrm.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
@Autowired
private DepartmentRepository departmentRepo;
	@Override
	public boolean addDepartment(Department department) {
		departmentRepo.save(department);
		return true;
	}

	@Override
	public List<Department> getDepartment() {
		
		return departmentRepo.findAll();
	}

	
	
}
