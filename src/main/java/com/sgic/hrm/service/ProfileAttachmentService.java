package com.sgic.hrm.service;

import java.util.List;


import com.sgic.hrm.entity.ProfileAttachments;


public interface ProfileAttachmentService {
	boolean addAttachment(ProfileAttachments profileAttachments);
	List<ProfileAttachments> getAttachments();
	
}
