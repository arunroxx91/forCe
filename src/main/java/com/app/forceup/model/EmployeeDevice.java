package com.app.forceup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_DEVICE")
public class EmployeeDevice {
	

	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer employeeDeviceId;
    @Column(name = "employee_id", unique = true, nullable = false)
	String employeeId;
	String deviceId;

}
