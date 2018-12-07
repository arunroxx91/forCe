package com.app.forceup.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LEAD_DETAILS")
public class LeadDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer leadReferenceId;
	Long empId;
	String leadName;
	String leadMailId;
	String empCompanyName;	
	String leadAddress;
	String leadCity;
	String leadState;
	Long leadPostalCode;
	Long leadPhoneNumber;
	String leadStatus;
	String leadSource;
	Date leadClosureDate;
	Date leadStartTime;
	Date leadEndTime;
	Date lastUpdatedTimestamp;
	Long dealAmount;
	
	
	
	public LeadDetails(Long empId, Integer leadReferenceId, String leadName, String leadMailId, String empCompanyName,
			String leadAddress, String leadCity, String leadState, Long leadPostalCode, Long leadPhoneNumber,
			String leadStatus, String leadSource, Date leadClosureDate,
			Date leadStartTime, Date leadEndTime,
			Date lastUpdatedTimestamp, Long dealAmount) {
		
		this.empId = empId;
		this.leadReferenceId = leadReferenceId;
		this.leadName = leadName;
		this.leadMailId = leadMailId;
		this.empCompanyName = empCompanyName;
		this.leadAddress = leadAddress;
		this.leadCity = leadCity;
		this.leadState = leadState;
		this.leadPostalCode = leadPostalCode;
		this.leadPhoneNumber = leadPhoneNumber;
		this.leadStatus = leadStatus;
		this.leadSource = leadSource;
		this.leadClosureDate = leadClosureDate;
		this.leadStartTime = leadStartTime;
		this.leadEndTime = leadEndTime;
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
		this.dealAmount = dealAmount;
	}
	
	
	public LeadDetails() {
		
	}


	public Integer getLeadReferenceId() {
		return leadReferenceId;
	}


	public void setLeadReferenceId(Integer leadReferenceId) {
		this.leadReferenceId = leadReferenceId;
	}


	public String getLeadSource() {
		return leadSource;
	}


	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}


	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public String getLeadMailId() {
		return leadMailId;
	}
	public void setLeadMailId(String leadMailId) {
		this.leadMailId = leadMailId;
	}
	public String getEmpCompanyName() {
		return empCompanyName;
	}
	public void setEmpCompanyName(String empCompanyName) {
		this.empCompanyName = empCompanyName;
	}
	public String getLeadAddress() {
		return leadAddress;
	}
	public void setLeadAddress(String leadAddress) {
		this.leadAddress = leadAddress;
	}
	public String getLeadCity() {
		return leadCity;
	}
	public void setLeadCity(String leadCity) {
		this.leadCity = leadCity;
	}
	public String getLeadState() {
		return leadState;
	}
	public void setLeadState(String leadState) {
		this.leadState = leadState;
	}
	public Long getLeadPostalCode() {
		return leadPostalCode;
	}
	public void setLeadPostalCode(Long leadPostalCode) {
		this.leadPostalCode = leadPostalCode;
	}
	public Long getLeadPhoneNumber() {
		return leadPhoneNumber;
	}
	public void setLeadPhoneNumber(Long leadPhoneNumber) {
		this.leadPhoneNumber = leadPhoneNumber;
	}
	public String getLeadStatus() {
		return leadStatus;
	}
	public void setLeadStatus(String leadStatus) {
		this.leadStatus = leadStatus;
	}
	public Date getLeadClosureDate() {
		return leadClosureDate;
	}
	public void setLeadClosureDate(Date leadClosureDate) {
		this.leadClosureDate = leadClosureDate;
	}
	public Date getLeadStartTime() {
		return leadStartTime;
	}
	public void setLeadStartTime(Date leadStartTime) {
		this.leadStartTime = leadStartTime;
	}
	public Date getLeadEndTime() {
		return leadEndTime;
	}
	public void setLeadEndTime(Date leadEndTime) {
		this.leadEndTime = leadEndTime;
	}
	public Date getLastUpdatedTimestamp() {
		return lastUpdatedTimestamp;
	}
	public void setLastUpdatedTimestamp(Date lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}
	public Long getDealAmount() {
		return dealAmount;
	}
	public void setDealAmount(Long dealAmount) {
		this.dealAmount = dealAmount;
	}
	
	
}
