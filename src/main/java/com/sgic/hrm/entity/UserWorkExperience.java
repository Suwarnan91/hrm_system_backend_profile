package com.sgic.hrm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class UserWorkExperience implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4826817714969569889L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer id;
	private Integer userId;
	private Integer experienceId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getExperienceId() {
		return experienceId;
	}
	public void setExperienceId(Integer experienceId) {
		this.experienceId = experienceId;
	}
	
	
	
	
}
