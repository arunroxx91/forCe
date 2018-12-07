package com.app.forceup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.app.forceup.model.EmployeeDetails;

public interface EmployeeDetailsRepository extends CrudRepository<EmployeeDetails, Long>{

	@Query(value = "SELECT * FROM EMPLOYEE_DETAILS WHERE EMPLOYEE_MAIL_ID = ?1", nativeQuery = true)
	EmployeeDetails findByEmployeeMailId(String emailAddress);
}
