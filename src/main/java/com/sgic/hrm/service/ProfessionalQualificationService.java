package com.sgic.hrm.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.entity.ProfessionalQualification;

public interface ProfessionalQualificationService {

	boolean addProfessionalQualification(ProfessionalQualification professionalQualification);
	
	List<ProfessionalQualification> getAllProfessionalQualifications();
	
	boolean editProfessionalQualification(ProfessionalQualification professionalQualification,Integer id);
	
	Optional<ProfessionalQualification> getProfessionalQualificationById(int id);
	
	boolean deleteProfessionalQualification(Integer id);
}
