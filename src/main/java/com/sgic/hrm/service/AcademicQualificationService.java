package com.sgic.hrm.service;

import java.util.List;
import com.sgic.hrm.entity.AcademicQualification;

public interface AcademicQualificationService {
	boolean addAcademicQualification( AcademicQualification academicqualification);
	List<AcademicQualification> getAllAcademicQualification();
	boolean editAcademicQualification(AcademicQualification academicQualification, Integer id);
	boolean deleteAcademicQualification(Integer id);
	AcademicQualification getAcademicQualificationById(int id);
}
