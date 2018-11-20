package com.sgic.hrm.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.entity.KeyActivity;
import com.sgic.hrm.entity.RolesAndResponsibilites;

public interface RolesAndResponsibilitiesService {
	boolean addRolesAndResponsibilites(RolesAndResponsibilites rolesAndResponsibilites);
	List<RolesAndResponsibilites>getRolesAndResponsibilites();
	boolean editRolesAndResponsibilites(RolesAndResponsibilites rolesAndResponsibilites,Integer id);
	Optional<RolesAndResponsibilites>getKeyActivityId(Integer id);
	boolean deleteRolesAndResponsibilites(Integer id);
}
