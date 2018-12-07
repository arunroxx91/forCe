package com.app.forceup.module;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.forceup.helper.StatusBuilder;
import com.app.forceup.model.EmployeeDevice;
import com.app.forceup.model.Status;
import com.app.forceup.service.EmployeeService;
import com.app.forceup.service.GeocodingService;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.maps.GeoApiContext;

@Configuration
public class ForceUpModule extends AbstractModule {

	@Override
	protected void configure() {
		
	}
	
	@Singleton
	@Bean("StatusObject")
	public Status returnStatusObject() {
		return new Status();
	}
	
	@Bean("EmployeeDevice")
	public EmployeeDevice returnEmployeeDevice() {
		return new EmployeeDevice();
	}
	
	@Bean("StatusBuilder")
	public StatusBuilder returnStatusBuilder() {
		return new StatusBuilder();
	}
	
	@Bean("GeoApiContext")
	@Singleton
	public GeoApiContext returnGeoContext() {
		return new GeoApiContext().setApiKey("AIzaSyAF8QvOk_o2Q8ozOfLX1p1F9js9u8ezSow");
	}
	
	@Bean("GeocodingService")
	public GeocodingService returnGeoCodingService() {
		return new GeocodingService();
	}
	
	@Bean("EmployeeService")
	public EmployeeService returnEmployeeService() {
		return new EmployeeService();
	}
	
}
