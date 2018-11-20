package com.sgic.hrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.ProfessionalQualification;
import com.sgic.hrm.repository.ProfessionalQualificationRepository;

@Service
public class ProfessionalQualificationServiceImpl implements ProfessionalQualificationService {
	
	@Autowired
	private ProfessionalQualificationRepository professionalQualificationRepository;

	@Override
	public boolean addProfessionalQualification(ProfessionalQualification professionalQualification) {
		professionalQualificationRepository.save(professionalQualification);
		return true;
	}

	@Override
	public List<ProfessionalQualification> getAllProfessionalQualifications() {
		
		return professionalQualificationRepository.findAll();
	}

	@Override
	public boolean editProfessionalQualification(ProfessionalQualification professionalQualification, Integer id) {
		if(professionalQualificationRepository.getOne(id)!=null) {
			professionalQualification.setId(id);
			professionalQualificationRepository.save(professionalQualification);
			return true;
		}
		return false;
	}

	@Override
	public Optional<ProfessionalQualification> getProfessionalQualificationById(int id) {
		// TODO Auto-generated method stub
		return professionalQualificationRepository.findById(id);
	}

	@Override
	public boolean deleteProfessionalQualification(Integer id) {
		if(professionalQualificationRepository.getOne(id) !=null) {
			professionalQualificationRepository.deleteById(id);
			return true;
		}
		return false;
	}
}
