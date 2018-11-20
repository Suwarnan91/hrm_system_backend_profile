package com.sgic.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.entity.AppointmentType;

public interface AppointmentTypeRepository extends JpaRepository<AppointmentType, Integer> {
	
}
