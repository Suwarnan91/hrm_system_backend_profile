package com.sgic.hrm.service;

import java.util.List;

import com.sgic.hrm.entity.Appointment;

public interface AppointmentService {
	boolean addAppointment(Appointment appointment);
	List<Appointment> getAppointment();
//	boolean editDepartment(Department department,Integer id);
//	Optional<Department> getDepartmentId(Integer id);
//	boolean deleteDepartment(Integer id);
}
