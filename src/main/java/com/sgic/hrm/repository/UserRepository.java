package com.sgic.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
