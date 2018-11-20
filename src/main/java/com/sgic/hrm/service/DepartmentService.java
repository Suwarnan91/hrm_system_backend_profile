package com.sgic.hrm.service;

import java.util.List;


import com.sgic.hrm.entity.Department;

public interface DepartmentService {

	boolean addDepartment(Department department);
	List<Department> getDepartment();
//	boolean editDepartment(Department department,Integer id);
//	Optional<Department> getDepartmentId(Integer id);
//	boolean deleteDepartment(Integer id);
}
