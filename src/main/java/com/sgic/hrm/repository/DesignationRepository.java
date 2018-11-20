package com.sgic.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.entity.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Integer> {
	
}
