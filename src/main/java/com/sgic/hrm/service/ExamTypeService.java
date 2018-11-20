package com.sgic.hrm.service;

import java.util.List;

import com.sgic.hrm.entity.ExamType;


public interface ExamTypeService {
	boolean addExamType(ExamType examtype);
	List<ExamType>getAllExamType();
}
