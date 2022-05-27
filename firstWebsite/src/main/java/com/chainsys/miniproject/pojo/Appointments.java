package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Appointments {
	private int APPOINTMENT_ID;
	private Date APPOINTMENT_DATE;
	private int DOCTOR_ID ;
	private String PATIENT_NAME;
	private float FEES_COLLECTED ;
	
	public int getAPPOINTMENT_ID() {
		return APPOINTMENT_ID;
	}
	public void setAPPOINTMENT_ID(int aPPOINTMENT_ID) {
		APPOINTMENT_ID = aPPOINTMENT_ID;
	}
	public Date getAPPOINTMENT_DATE() {
		return APPOINTMENT_DATE;
	}
	public void setAPPOINTMENT_DATE(Date aPPOINTMENT_DATE) {
		APPOINTMENT_DATE = aPPOINTMENT_DATE;
	}
	public int getDOCTOR_ID() {
		return DOCTOR_ID;
	}
	public void setDOCTOR_ID(int dOCTOR_ID) {
		DOCTOR_ID = dOCTOR_ID;
	}
	public String getPATIENT_NAME() {
		return PATIENT_NAME;
	}
	public void setPATIENT_NAME(String pATIENT_NAME) {
		PATIENT_NAME = pATIENT_NAME;
	}
	public float getFEES_COLLECTED() {
		return FEES_COLLECTED;
	}
	public void setFEES_COLLECTED(float f) {
		FEES_COLLECTED = f;
	}
	
}
