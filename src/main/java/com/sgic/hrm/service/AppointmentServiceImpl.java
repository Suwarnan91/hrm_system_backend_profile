package com.sgic.hrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.Appointment;
import com.sgic.hrm.repository.AppointmentRepository;
	@Service
	public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	
	@Override
	public boolean addAppointment(Appointment appointment) {
		appointmentRepository.save(appointment);
		return true;
	}

	@Override
	public List<Appointment> getAppointment() {
		return appointmentRepository.findAll();
	}

}
