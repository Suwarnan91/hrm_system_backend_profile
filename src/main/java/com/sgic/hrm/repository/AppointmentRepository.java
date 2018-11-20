package com.sgic.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}
