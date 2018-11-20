package com.sgic.hrm.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.entity.KeyActivity;
;

public interface KeyActivityService {
	boolean addKeyActivity(KeyActivity keyActivity);
	List<KeyActivity>getKeyActivity();
	boolean editKeyActivity(KeyActivity keyActivity,Integer id);
	Optional<KeyActivity>getKeyActivityId(Integer id);
	boolean deleteKeyActivity(Integer id);
}
