package com.sgic.hrm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.entity.AcademicQualification;
import com.sgic.hrm.service.AcademicQualificationService;

@RestController
public class AcademicQualificationController{
	@Autowired
	private AcademicQualificationService academicQualificationSer;
	
	@PostMapping("/academicQualification")
	public HttpStatus createAcademicQualification(@Valid @RequestBody AcademicQualification academicqualification)
	{
		boolean test=academicQualificationSer.addAcademicQualification(academicqualification);
				if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
		@GetMapping("/academicQualification")
		public ResponseEntity <List<AcademicQualification>> getAcademicQualification()
		{
			List<AcademicQualification> academicquali = academicQualificationSer.getAllAcademicQualification();
			return new ResponseEntity<>(academicquali, HttpStatus.OK);
			
		}
		
		
	
	
	}
	

