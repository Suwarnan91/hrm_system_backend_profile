package com.sgic.hrm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppointmentType implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3097423479280681948L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String appointmentType;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAppointmentType() {
		return appointmentType;
	}
	public void setAppointmentTypeName(String appointmentType) {
		this.appointmentType = appointmentType;
	}
	
}
