package com.sgic.hrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.hrm.entity.AppointmentType;
import com.sgic.hrm.service.AppointmentTypeService;

@RestController
public class AppointmentTypeController {
	@Autowired
	private AppointmentTypeService appointmentTypeService;
	
	@PostMapping("/appointmentType")
	public HttpStatus AddAppointmentType(@RequestBody AppointmentType appointmentType) 
	{
		boolean testadd= appointmentTypeService.addAppointmentType(appointmentType);
		if(testadd) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@GetMapping("/appointmentType")
	public ResponseEntity <List<AppointmentType>> GetAppointmentType()
	{
		List<AppointmentType> appointmentType= appointmentTypeService.getAppointmentType();
		ResponseEntity<List<AppointmentType>> 
		response =  new ResponseEntity<>(appointmentType,HttpStatus.OK);
		return response;
		
	}
}
