package com.sgic.hrm.service;

import java.util.List;
import java.util.Optional;
import com.sgic.hrm.entity.UserWorkExperience;

public interface UserWorkExperienceService {
	boolean addUserWorkExperience(UserWorkExperience workExperience);
	List<UserWorkExperience> getAllUserWorkExperience();
	boolean editUserWorkExperience(UserWorkExperience workExperience,int id);
	Optional<UserWorkExperience> getUserWorkExperienceById(int id);
	boolean deleteUserWorkExperience(int id);

}
