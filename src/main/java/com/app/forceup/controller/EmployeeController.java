package com.app.forceup.controller;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.app.forceup.service.EmployeeService;
import com.app.forceup.service.GeocodingService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
    @Resource
    @Qualifier("EmployeeService")
	private  EmployeeService _employeeService;
	
    @Resource
    @Qualifier("GeocodingService")
	private GeocodingService _geoCodingService;

	@RequestMapping("/createEmployee")
	public void process( @RequestBody Object employeeDetails){
		_employeeService.createEmployeeDetails(employeeDetails);
	}
	
	@RequestMapping("/getEmployee")
    public String findDeviceId(@RequestParam("id") String id){
        String result = _employeeService.getDeviceId(id);
        return result;
    }
	
	@RequestMapping("/getLocation")
	public String getAddress(@RequestParam("latitude") double latitude, @RequestParam("longitude") double longitude) throws Exception {
		return _geoCodingService.computeReverseGeoLocation(latitude, longitude);
	}
	

}
