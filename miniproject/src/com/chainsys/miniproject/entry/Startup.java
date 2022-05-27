package com.chainsys.miniproject.entry;

import com.miniproject.ui.AppointmentsUi;
import com.miniproject.ui.DoctorUi;
import com.miniproject.ui.EmployeeUi;

public class Startup {
 public static void main(String args[]) {
	    loadMenu();
	    }

	    private static void loadMenu() {
	        System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
	        java.util.Scanner sc = new java.util.Scanner(System.in);
	      try {
	        int call = sc.nextInt();
	        switch (call) {
	        case 1:
	            loadEmployeeMenu();
	            break;
	        case 2:
	            loadDoctorMenu();
	            break;
	        case 3:
	            loadAppointmentMenu();
	            break;
	        }
	      }finally {
	          sc.close();
	      }
	    }

	    private static void loadEmployeeMenu() {
	        System.out.println(
	                "Enter Employee Method : 1=addNewEmployee, 2=viewEmployeeDetails ,3=ViewAllEmployeeDetails ,4=updateEmpDetails, 5=deleteEmpdetails");
	        java.util.Scanner sc = new java.util.Scanner(System.in);
	        try {
	        int call = sc.nextInt();
	        
	        switch (call) {
	        case 1:
	            EmployeeUi.addNewEmployee();
	            break;

	        case 2:
	            EmployeeUi.viewEmployeeDetails();
	            break;
	        case 3:
	            EmployeeUi.ViewAllEmployeeDetails();
	            break;
	        case 4:
	            EmployeeUi.updateEmpDetails();
	            break;
	        case 5:
	            EmployeeUi.deleteEmpdetails();
	            break;
	        }
	        }finally {
	            sc.close();
	        }
	    }

	    private static void loadDoctorMenu() {
	        System.out.println("Enter Doctor Method : 1=addNewDoctorInformation ,2=viewDoctorsDetailsById ,3=updateDoctorDetails ,4=viewAllDoctorsDetails, 5=deleteDoctorDetails ");
	        java.util.Scanner sc = new java.util.Scanner(System.in);
	        try {
	        int call = sc.nextInt();
	        switch (call) {
	        case 1:
	            DoctorUi.addNewDoctorInformation();
	            break;
	        case 2:
	            DoctorUi.viewDoctorsDetailsById();
	            break;
	        case 3:
	            DoctorUi.updateDoctorDetails();
	            break;
	        case 4:
	            DoctorUi.viewAllDoctorsDetails();
	            break;
	        case 5:
	            DoctorUi.deleteDoctorDetails();
	            break;
	        }
	        }finally {
	            sc.close();
	        }
	    }

	    private static void loadAppointmentMenu() {
	        System.out.println(
	                "Enter Method : 1=addNewAppointment ,2=getPatientById ,3=updateAppointment ,4=updatePatientName ,5=updateFeesCollected ,6=getAllAppointmentDetails ,7=deleteAppointment ,8= LeftOuterJoin ,9=RightOuterJoin ,10=FullOuterJoin");
	        java.util.Scanner sc = new java.util.Scanner(System.in);
	        try {
	        int call = sc.nextInt();
	        switch (call) {
	        case 1:
	            AppointmentsUi.addNewAppointments();
	            break;
	        case 2:
	            AppointmentsUi.viewAppointmentDetails();
	            break;
	        case 3:
	            AppointmentsUi.allAppointmentDetails();
	            break;
	        case 4:
	            AppointmentsUi.updateAppDetails();
	            break;
	        case 5:
	            AppointmentsUi.deleteAppointmentDetails();
	            break;
	        case 6:
	            AppointmentsUi.updatePatientName();
	            break;
	        case 7:
	            AppointmentsUi.updateCollectedfees();
	            break;
	        
	        }
	        }finally {
	            sc.close();
	        }
	    }



 }


