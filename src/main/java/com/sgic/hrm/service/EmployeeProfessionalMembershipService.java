package com.sgic.hrm.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.entity.EmployeeProfessionalMembership;

public interface EmployeeProfessionalMembershipService {
	
	boolean addEmployeeProfessionalMembership(EmployeeProfessionalMembership employeeProfessionalMembership);

	List<EmployeeProfessionalMembership> getAllEmployeeProfessionalMembership();
	
	boolean editEmployeeProfessionalMembership(EmployeeProfessionalMembership employeeProfessionalMembership,Integer id);
	
	Optional<EmployeeProfessionalMembership> getEmployeeProfessionalMembershipById(int id);
	
	boolean deleteEmployeeProfessionalMembership(Integer id);
}
