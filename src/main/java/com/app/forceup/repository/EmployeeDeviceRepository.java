package com.app.forceup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.app.forceup.model.EmployeeDevice;

public interface EmployeeDeviceRepository extends CrudRepository<EmployeeDevice, Long> {
	
	
	@Query(value = "SELECT DEVICE_ID FROM employee_device WHERE employee_id = ?1", nativeQuery = true)
	String findByEmployeeId(String employeeId);

}
