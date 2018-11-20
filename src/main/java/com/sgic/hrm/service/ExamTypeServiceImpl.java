package com.sgic.hrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.ExamType;
import com.sgic.hrm.repository.ExamTypeRepository;

@Service
public class ExamTypeServiceImpl implements ExamTypeService{
	@Autowired
	private ExamTypeRepository examTypeRepository;
	
	@Override
	public boolean addExamType(ExamType examtype) {
		
		 examTypeRepository.save(examtype);
		 return true;
	}

	@Override
	public List<ExamType> getAllExamType() {
		
		return examTypeRepository.findAll();
	}
	
}