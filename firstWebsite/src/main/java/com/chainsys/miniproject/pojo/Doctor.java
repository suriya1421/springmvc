package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Doctor {
	private int DOCTOR_ID;
	private String DOCTOR_NAME;
	private Date DOB ;
	private String SPECIALITY;
	private String CITY ;
	private Long PHONE_NO;
	private float STANDARD_FEES;
	
	public Long getPHONE_NO() {
		return PHONE_NO;
	}
	public void setPHONE_NO(Long phone_no) {
		PHONE_NO = phone_no;
	}
	
	
	
	public int getDOCTOR_ID() {
		return DOCTOR_ID;
	}
	public void setDOCTOR_ID(int dOCTOR_ID) {
		DOCTOR_ID = dOCTOR_ID;
	}
	public String getDOCTOR_NAME() {
		return DOCTOR_NAME;
	}
	public void setDOCTOR_NAME(String dOCTOR_NAME) {
		DOCTOR_NAME = dOCTOR_NAME;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getSPECIALITY() {
		return SPECIALITY;
	}
	public void setSPECIALITY(String sPECIALITY) {
		SPECIALITY = sPECIALITY;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public float getSTANDARD_FEES() {
		return STANDARD_FEES;
	}
	public void setSTANDARD_FEES(float f) {
		STANDARD_FEES = f;
	}
	
}
