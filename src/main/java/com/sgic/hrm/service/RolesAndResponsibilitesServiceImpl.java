package com.sgic.hrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.RolesAndResponsibilites;
import com.sgic.hrm.repository.RolesAndResponsibilityRepository;
@Service
public class RolesAndResponsibilitesServiceImpl implements RolesAndResponsibilitiesService {
	@Autowired
	private RolesAndResponsibilityRepository rolesAndResponsibilitesRepository;
	@Override
	public boolean addRolesAndResponsibilites(RolesAndResponsibilites rolesAndResponsibilites) {
		rolesAndResponsibilitesRepository.save(rolesAndResponsibilites);
		return true;
	}

	@Override
	public List<RolesAndResponsibilites> getRolesAndResponsibilites() {
		return rolesAndResponsibilitesRepository.findAll();
	}

	@Override
	public boolean editRolesAndResponsibilites(RolesAndResponsibilites rolesAndResponsibilites, Integer id) {
	if (rolesAndResponsibilitesRepository.getOne(id)!=null) {
		rolesAndResponsibilites.setId(id);
		rolesAndResponsibilitesRepository.save(rolesAndResponsibilites);
		return true;
	}
	return false;
	}

	@Override
	public Optional<RolesAndResponsibilites> getKeyActivityId(Integer id) {
		return rolesAndResponsibilitesRepository.findById(id);
	}

	@Override
	public boolean deleteRolesAndResponsibilites(Integer id) {
		if (rolesAndResponsibilitesRepository.getOne(id)!=null) {
			
			rolesAndResponsibilitesRepository.deleteById(id);
			return true;
		}
		return false;
	}

}
