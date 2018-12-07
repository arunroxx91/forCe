package com.app.forceup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.forceup.service.StatusService;

@RestController
@RequestMapping("/status")
public class StatusController {
	
	@Autowired
	private  StatusService statusBusiness;

	@RequestMapping("/updateStatus")
	public com.app.forceup.model.Status process( @RequestBody Object statusDetails){
		System.out.println(statusDetails);
		return statusBusiness.updateStatus(statusDetails);
		
	}
	
	
	
	

}
