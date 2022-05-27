package com.miniproject.ui;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.Appointmentsdao;
import com.chainsys.miniproject.pojo.Appointments;

public class AppointmentsUi {
	public static void addNewAppointments() {

		Scanner sc = new Scanner(System.in);
		Appointments app = null;
		try {
			app = new Appointments();

			System.out.println("Enter the Appointment id:");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int app_id = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(app_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setAPPOINTMENT_ID(app_id);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			app.setAPPOINTMENT_DATE(newDate);

			System.out.println("Enter Doctor ID : ");
			String docid = sc.nextLine();
			try {
				Validator.checkStringForParseInt(docid);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int doc_id = Integer.parseInt(docid);
			try {
				Validator.CheckNumberForGreaterThanZero(doc_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setDOCTOR_ID(doc_id);

			System.out.println("Enter patient Name:");
			String pat_name = sc.nextLine();
			try {
				Validator.checkStringOnly(pat_name);
			} catch (InvalidInputDataException e) {
				System.out.println("Error :" + e.getMessage());
			}
			app.setPATIENT_NAME(pat_name);
			System.out.println("Enter fees collected:");
			String Fee = sc.nextLine();
			try {
				Validator.checkStringForParseInt(Fee);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			float Fees = Float.parseFloat(Fee);
			try {
				Validator.CheckNumberForGreaterThanZero(Fees);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setFEES_COLLECTED(Fees);
			int result = Appointmentsdao.insertAppointment(app);
			System.out.println(result + "row inserted");
		} finally {
			sc.close();
		}
	}

	public static void viewAppointmentDetails() {
		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();
		System.out.println("Enter the Appointment id:");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		int app_id = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setAPPOINTMENT_ID(app_id);
		System.out.println("Appointment id:" + app.getAPPOINTMENT_ID());
		System.out.println("Appointment date:" + app.getAPPOINTMENT_DATE());
		System.out.println("Doctor id:" + app.getDOCTOR_ID());
		System.out.println("fees collected:" + app.getFEES_COLLECTED());
		sc.close();
	}

	public static void allAppointmentDetails() {
		List<Appointments> applist = Appointmentsdao.getAllAppointment();
		Iterator<Appointments> appItr = applist.iterator();
		while (appItr.hasNext()) {
			Appointments app = appItr.next();
			System.out.println("app id:" + app.getAPPOINTMENT_ID() + " " + "DOC ID" + " " + app.getDOCTOR_ID());
		}
	}

	public static void updateAppDetails() {
		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();

		System.out.println("Enter the Appointment id:");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		int app_id = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setAPPOINTMENT_ID(app_id);
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		app.setAPPOINTMENT_DATE(newDate);
		System.out.println("Enter Doctor id:");
		String doc_name = sc.nextLine();
		app.setDOCTOR_ID(Integer.parseInt(doc_name));

		System.out.println("Enter Doctor ID : ");
		String docid = sc.nextLine();
		try {
			Validator.checkStringForParseInt(docid);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		int doc_id = Integer.parseInt(docid);
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setDOCTOR_ID(doc_id);

		System.out.println("Enter patient Name:");
		String pat_name = sc.nextLine();
		try {
			Validator.checkStringOnly(pat_name);
		} catch (InvalidInputDataException e) {
			System.out.println("Error :" + e.getMessage());
		}
		app.setPATIENT_NAME(pat_name);
		System.out.println("Enter fees collected:");
		String Fee = sc.nextLine();
		try {
			Validator.checkStringForParseInt(Fee);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		float Fees = Float.parseFloat(Fee);
		try {
			Validator.CheckNumberForGreaterThanZero(Fees);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setFEES_COLLECTED(Fees);
		int result = Appointmentsdao.updateAppointment(app);
		System.out.println(result + "row updated");
		sc.close();
	}

	public static void deleteAppointmentDetails() {
		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();
		System.out.println("Enter the Appointment id:");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		int app_id = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setAPPOINTMENT_ID(app_id);
		int result = Appointmentsdao.deleteAppointment(app_id);
		System.out.println(result + "row deleted");
		sc.close();
	}

	public static void updatePatientName() {
		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();
		System.out.println("Enter patient Name:");
		String pat_name = sc.nextLine();
		try {
			Validator.checkStringOnly(pat_name);
		} catch (InvalidInputDataException e) {
			System.out.println("Error :" + e.getMessage());
		}
		app.setPATIENT_NAME(pat_name);
		System.out.println("Enter the Appointment id:");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		int app_id = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setAPPOINTMENT_ID(app_id);
		int result = Appointmentsdao.updateAppointmentName(app_id, pat_name);
		System.out.println(result + " row updated");
		sc.close();

	}

	public static void updateCollectedfees() {
		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();
		System.out.println("Enter fees collected:");
		String Fee = sc.nextLine();
		try {
			Validator.checkStringForParseInt(Fee);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		float Fees = Float.parseFloat(Fee);
		try {
			Validator.CheckNumberForGreaterThanZero(Fees);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setFEES_COLLECTED(Fees);
		System.out.println("Enter the Appointment id:");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		int app_id = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setAPPOINTMENT_ID(app_id);
		int result = Appointmentsdao.updateAppointmentFees(app_id, Fees);
		System.out.println(result + " row updated");
		sc.close();
	}
}