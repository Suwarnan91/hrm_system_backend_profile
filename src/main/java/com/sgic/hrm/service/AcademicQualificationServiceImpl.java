package com.sgic.hrm.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.AcademicQualification;
import com.sgic.hrm.repository.AcademicQualificationRepository;

@Service
public class AcademicQualificationServiceImpl implements AcademicQualificationService {
	@Autowired
	private AcademicQualificationRepository academicQualificationRepository;
	
	@Override
	public boolean addAcademicQualification(AcademicQualification academicqualification) {
		academicQualificationRepository.save(academicqualification);
		return true;
	}
	
	@Override
	public List<AcademicQualification> getAllAcademicQualification() {
		
		return academicQualificationRepository.findAll();
	}

	@Override
	public boolean editAcademicQualification(AcademicQualification academicQualification, Integer id) {
		boolean editsucess=false;
		if(academicQualificationRepository.getOne(id) != null) {
			academicQualification.setId(id);
			academicQualificationRepository.save(academicQualification);
			editsucess=true;
		}
		return editsucess;
	}

	@Override
	public boolean deleteAcademicQualification(Integer id) {
		AcademicQualification academicQualification=academicQualificationRepository.getOne(id);
		if(academicQualification.getId()== id) {
			academicQualificationRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
	@Override
	public AcademicQualification getAcademicQualificationById(int id) {
		// TODO Auto-generated method stub
		return academicQualificationRepository.getOne(id);
	}
	
}

