package com.sgic.hrm.service;

import java.util.List;

import com.sgic.hrm.entity.Designation;

public interface DesignationService {
	
	boolean addDesignation(Designation designation);
	List<Designation> getDesignation();
//	boolean editDesignation(Designation designation,Integer id);
//	Optional<Designation> getDesignationId(Integer id);
//	boolean deleteDesignation(Integer id);
	
}
