package com.app.forceup.service;

import java.util.Map;

import org.apache.commons.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.app.appforceup.enumeration.EventChange;
import com.app.forceup.helper.StatusBuilder;
import com.app.forceup.repository.StatusRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StatusService {
	
	@Autowired
	@Qualifier("StatusBuilder")
	private StatusBuilder _statusBuilder;
	
	@Autowired
	StatusRepository statusRepository;
	
	@SuppressWarnings("unchecked")
	public com.app.forceup.model.Status updateStatus(Object statusDetails) {
		com.app.forceup.model.Status status = null;
		Map<String, Object> objectMapper = new ObjectMapper().convertValue(statusDetails, Map.class);
		final String eventType = objectMapper.get("type").toString();
		if(StringUtils.equals(EventChange.health.getEventChange(), eventType)) {
			status = _statusBuilder.createHealthUpdateStatus(objectMapper);
		} else if(StringUtils.equals(EventChange.status.getEventChange(), eventType)) {
			status = _statusBuilder.createChangeStatus(objectMapper);
		}  else if(StringUtils.equals(EventChange.location.getEventChange(), eventType)) {
			status = _statusBuilder.createLocationChange(objectMapper);
		}
		else {
			status = _statusBuilder.createActivityUpdateStatus(objectMapper);
			
		}
		statusRepository.save(status);
		return status;
	}



}
