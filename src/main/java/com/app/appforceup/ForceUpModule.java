package com.app.appforceup;

import com.app.forceup.model.EmployeeDevice;
import com.app.forceup.model.Status;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Singleton;

public class ForceUpModule extends AbstractModule {

	@Override
	protected void configure() {
		
	}
	
	@Singleton
	@Inject
	public Status returnStatusObject() {
		return new Status();
	}
	
	@Inject
	public EmployeeDevice returnEmployeeDevice() {
		return new EmployeeDevice();
	}
	
}
