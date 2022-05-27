package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.Doctordao;
import com.chainsys.miniproject.pojo.Doctor;

public class TestDoctorDao {
	public static void testInsertEmployee() {
	   Doctor ndoc=new Doctor();
	   ndoc.setDOCTOR_ID(12);
	   ndoc.setDOCTOR_NAME("raju");
	   Calendar c1 = Calendar.getInstance();
		java.util.Date newDate =c1.getTime();
		ndoc.setDOB(newDate);
		ndoc.setSPECIALITY("ortho2");
	  ndoc.setCITY("chennai");
	  ndoc.setPHONE_NO(9842363880L);
	  ndoc.setSTANDARD_FEES(1500);
	  int result = Doctordao.insertDoctor(ndoc);
		System.out.println(result);
	
	}
	 public static void testUpdateDoctor() {
		   Doctor newdoc=new Doctor();
	   	newdoc.setDOCTOR_ID(11);
	   //	System.out.println(newdoc.getDOCTOR_ID()+" "+newdoc.getDOCTOR_NAME()+" "+newdoc.getDOB()+" "+newdoc.getSPECIALITY()+" "+newdoc.getCITY()+" "+newdoc.getPHONE_NO()+" "+newdoc.getSTANDARD_FEES());
	   	newdoc.setDOCTOR_NAME("mithu");
		Calendar c1 =Calendar.getInstance();
	   	java.util.Date newDate =new java.util.Date();
	   	newdoc.setDOB(newDate);
	   	newdoc.setSPECIALITY("Allergists");
	   	newdoc.setCITY("Chennai");
	   	newdoc.setPHONE_NO(1234567898L);
	   	newdoc.setSTANDARD_FEES(10000); 
	  
	   	int result =Doctordao.updateDoctor(newdoc);
	   	System.out.println(result+ "row updated!");
	   }
	   
	   public static void testUpdateDoctorName() {
//		   Doctor newdoc=new Doctor();
//	   	newdoc.setDOCTOR_ID(5);
//	   	newdoc.setDOCTOR_NAME("pandi");
	   	int result =Doctordao.updateDoctorFirstName(5,"raj");
	   	System.out.println(result);
	   }
	   public static void testUpdateDoctorFees() {
		   Doctor newdoc=new Doctor();
	   	newdoc.setDOCTOR_ID(03);
	   	newdoc.setSTANDARD_FEES(7000);
	   	int result =Doctordao.updateDoctorFees(03, 78000);
	   	System.out.println(result);
	   }
	   
	   public static void testDeleteDoctor() {
		//   Doctor newdoc=new Doctor();
	   	int result =Doctordao.deleteDoctor(12);
	   	System.out.println(result);
	   }
	   
	   public static void testGetDoctorById() {
		 	Doctor result =Doctordao.getDoctorById(1);
		 	System.out.println(result.getDOCTOR_ID()+" "+result.getDOCTOR_NAME()+" "+result.getDOB()+" "+result.getSPECIALITY()+" "+result.getCITY()+" "+result.getPHONE_NO()+" "+result.getSTANDARD_FEES());
	   }
	   
	   public static void testGetAllDoctors() {
	  	 List<Doctor> allDoctors =Doctordao.getAllDoctor();
	  	 Iterator <Doctor> drIterator = allDoctors.iterator();
	  	 while(drIterator.hasNext()) {
	  		 Doctor dr =drIterator.next();
	  		System.out.println(dr.getDOCTOR_ID()+" "+dr.getDOCTOR_NAME()+" "+dr.getDOB()+" "+dr.getSPECIALITY()+" "+dr.getCITY()+" "+dr.getPHONE_NO()+" "+dr.getSTANDARD_FEES());
	  	 }
	   }
	}  
	
	 
