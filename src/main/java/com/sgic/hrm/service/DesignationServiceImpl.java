package com.sgic.hrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.Designation;
import com.sgic.hrm.repository.DesignationRepository;

@Service
public class DesignationServiceImpl implements DesignationService{
	@Autowired
	private DesignationRepository designationRepository;
	
	@Override
	public boolean addDesignation(Designation designation) {
		designationRepository.save(designation);
		return true;
	}

	@Override
	public List<Designation> getDesignation() {
		
		return designationRepository.findAll();
	}
}
