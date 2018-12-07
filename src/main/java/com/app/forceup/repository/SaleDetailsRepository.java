package com.app.forceup.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.app.forceup.model.SaleDetails;

public interface SaleDetailsRepository extends CrudRepository<SaleDetails, Long>{

	@Query(value = "SELECT * FROM SALE_DETAILS WHERE EMP_ID :empId AND YEAR(LAST_UPDATED_TIMESTAMP) = YEAR(CURRENT_DATE()) AND MONTH(LAST_UPDATED_TIMESTAMP) = MONTH(CURRENT_DATE()) ", nativeQuery = true)
	ArrayList<SaleDetails> findByEmployeeId(Integer empId);
	 
}
