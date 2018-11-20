package com.sgic.hrm.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.ProfileAttachments;

import com.sgic.hrm.repository.ProfileAttachmentRepository;

@Service
public class ProfileAttachmentServiceImpl implements ProfileAttachmentService{
	
	@Autowired
	private ProfileAttachmentRepository profileAttachmentRepository;

	@Override
	public boolean addAttachment(ProfileAttachments profileAttachments) {
		profileAttachmentRepository.save(profileAttachments);
		return true;
	}

	@Override
	public List<ProfileAttachments> getAttachments() {
		return profileAttachmentRepository.findAll();
	}

	@Override
	public void save(ProfileAttachments profileAttachments) {
		// TODO Auto-generated method stub
		
	}

	

}
