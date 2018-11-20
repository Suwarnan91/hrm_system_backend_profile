package com.sgic.hrm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "", schema = "profile")
public class EmployeeProfessionalQualification implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2001727149577562677L;

	@Id
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User userId;

	@ManyToOne
	@JoinColumn(name="professionalqualification_id")
	private ProfessionalQualification professionalQualificationId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public ProfessionalQualification getProfessionalQualificationId() {
		return professionalQualificationId;
	}

	public void setProfessionalQualificationId(ProfessionalQualification professionalQualificationId) {
		this.professionalQualificationId = professionalQualificationId;
	}

}
