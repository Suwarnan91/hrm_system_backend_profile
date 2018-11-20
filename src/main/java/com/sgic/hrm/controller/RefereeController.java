package com.sgic.hrm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.sgic.hrm.entity.Referee;

import com.sgic.hrm.service.RefereeService;

@CrossOrigin(origins= "",maxAge=3600)
@RestController
public class RefereeController {
	@Autowired
	private RefereeService refereeService;
	
	@PostMapping("/referee")
	public HttpStatus addReferee(@Valid @RequestBody Referee referee) {
		boolean test = refereeService.addReferee(referee);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@GetMapping("/referee")
	public ResponseEntity<List<Referee>> GetReferee(){
		List<Referee> referee=refereeService.getAllReferee();
		ResponseEntity<List<Referee>> response=new ResponseEntity<>(referee,HttpStatus.OK);
		return response;
	}
	
	
}
