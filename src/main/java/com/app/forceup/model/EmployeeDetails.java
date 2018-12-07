package com.app.forceup.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_DETAILS")
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer empId;
	Long empGroupId;
	String empName;
	String empMailId;
	String empOccupation;
	String empCompanyName;
	String empAddress;
	String empCity;
	String empState;
	Long empPostalcode;
	Long empPhoneNum;
	String empLinkedIn;
	String empFaceBook;
	String empTwitter;
	String empInstagram;
	Long empOrders;
	Long empIssueReports;
	String activeFlag;
	Date empJoiningDate;
	
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Long getEmpGroupId() {
		return empGroupId;
	}
	public void setEmpGroupId(Long empGroupId) {
		this.empGroupId = empGroupId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpMailId() {
		return empMailId;
	}
	public void setEmpMailId(String empMailId) {
		this.empMailId = empMailId;
	}
	public String getEmpOccupation() {
		return empOccupation;
	}
	public void setEmpOccupation(String empOccupation) {
		this.empOccupation = empOccupation;
	}
	public String getEmpCompanyName() {
		return empCompanyName;
	}
	public void setEmpCompanyName(String empCompanyName) {
		this.empCompanyName = empCompanyName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
	}
	public Long getEmpPostalcode() {
		return empPostalcode;
	}
	public void setEmpPostalcode(Long empPostalcode) {
		this.empPostalcode = empPostalcode;
	}
	public Long getEmpPhoneNum() {
		return empPhoneNum;
	}
	public void setEmpPhoneNum(Long empPhoneNum) {
		this.empPhoneNum = empPhoneNum;
	}
	public String getEmpLinkedIn() {
		return empLinkedIn;
	}
	public void setEmpLinkedIn(String empLinkedIn) {
		this.empLinkedIn = empLinkedIn;
	}
	public String getEmpFaceBook() {
		return empFaceBook;
	}
	public void setEmpFaceBook(String empFaceBook) {
		this.empFaceBook = empFaceBook;
	}
	public String getEmpTwitter() {
		return empTwitter;
	}
	public void setEmpTwitter(String empTwitter) {
		this.empTwitter = empTwitter;
	}
	public String getEmpInstagram() {
		return empInstagram;
	}
	public void setEmpInstagram(String empInstagram) {
		this.empInstagram = empInstagram;
	}
	public Long getEmpOrders() {
		return empOrders;
	}
	public void setEmpOrders(Long empOrders) {
		this.empOrders = empOrders;
	}
	public Long getEmpIssueReports() {
		return empIssueReports;
	}
	public void setEmpIssueReports(Long empIssueReports) {
		this.empIssueReports = empIssueReports;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public Date getEmpJoiningDate() {
		return empJoiningDate;
	}
	public void setEmpJoiningDate(Date empJoiningDate) {
		this.empJoiningDate = empJoiningDate;
	}
	
	

	
}
