package com.sgic.hrm.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.entity.User;

public interface UserService {
	boolean addUser(User user);
	List<User> getUser();
	boolean editUser(User user,Integer id);
	Optional<User> getUserId(Integer id);
	boolean deleteUser(Integer id);

}
