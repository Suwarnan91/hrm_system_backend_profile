package com.sgic.hrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.AppointmentType;
import com.sgic.hrm.repository.AppointmentTypeRepository;

@Service
public class AppointmentTypeServiceImpl implements AppointmentTypeService{
	@Autowired
	private AppointmentTypeRepository appointmentTypeRepository;

	@Override
	public boolean addAppointmentType(AppointmentType appointmentType) {
		appointmentTypeRepository.save(appointmentType);
		return true;
	}

	@Override
	public List<AppointmentType> getAppointmentType()
	{
		return appointmentTypeRepository.findAll();
	}
	
	
}
