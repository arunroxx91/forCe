package com.app.forceup.service;

import java.util.Map;


import org.springframework.stereotype.Service;
import com.app.forceup.model.EmployeeDevice;
import com.app.forceup.repository.EmployeeDeviceRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeService {
	
	private EmployeeDevice _employeeDevice;
	private EmployeeDeviceRepository _employeeDeviceRepository;
	
	
	@SuppressWarnings("unchecked")
	public void createEmployeeDetails(final Object employeeDetails) {
		Map<String, String> objectMapper = new ObjectMapper().convertValue(employeeDetails, Map.class);
		_employeeDevice.setDeviceId(objectMapper.get("device_id").toString());
		_employeeDevice.setEmployeeId(objectMapper.get("emp_id").toString());
		_employeeDeviceRepository.save(_employeeDevice);
	}
	
	public String getDeviceId(final String employeeId) {
		String deviceId = _employeeDeviceRepository.findByEmployeeId(employeeId);
		return deviceId;
	}
	
	

}
