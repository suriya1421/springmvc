package com.miniproject.ui;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.Doctordao;
import com.chainsys.miniproject.pojo.Doctor;

public class DoctorUi {
	public static void addNewDoctorInformation() {
        Scanner sc = new Scanner(System.in);
        Doctor newdoc = new Doctor();
        try {
            System.out.println("Enter Doctor ID : ");
            String id = sc.nextLine();
            try {
                Validator.checkStringForParseInt(id);
            } catch (InvalidInputDataException e) {
                e.printStackTrace();
            }
            int doc_id=Integer.parseInt(id);
            try {
                Validator.CheckNumberForGreaterThanZero(doc_id);
            } catch (InvalidInputDataException e) {
                e.printStackTrace();
            }
            newdoc.setDOCTOR_ID(doc_id);
            System.out.println("Enter Doctor Name : ");
            String Doc_name = sc.nextLine();
            try {
                Validator.checkStringOnly(Doc_name);
            } catch (InvalidInputDataException e) {
                System.out.println("Error :" + e.getMessage());
            }newdoc.setDOCTOR_NAME(Doc_name);
            Calendar c1 = Calendar.getInstance();
            java.util.Date newDate = c1.getTime();
            newdoc.setDOB(newDate);
            System.out.println("Enter Doctor Speciality : ");
            String Speciality = sc.nextLine();
            try {
                Validator.checkStringOnly(Speciality);
            } catch (InvalidInputDataException e) {
                System.out.println("Error :" + e.getMessage());
            }
            newdoc.setSPECIALITY(Speciality);
            System.out.println("Enter Doctor City : ");
            String City = sc.nextLine();
            try {
                Validator.checkStringOnly(City);
            } catch (InvalidInputDataException e) {
                System.out.println("Error :" + e.getMessage());
            }
            newdoc.setCITY(City);
            System.out.println("Enter Doctor Phone number : ");
            String Phone_No=sc.nextLine();
            try {
                Validator.checkStringForParseInt(Phone_No);
            } catch (InvalidInputDataException e) {
                e.printStackTrace();}
            Long Phone_no=Long.parseLong(Phone_No);
                try{
                Validator.CheckNumberForGreaterThanZero(Phone_no);
        } catch (InvalidInputDataException e) {
            e.printStackTrace();
        }
            newdoc.setPHONE_NO(Phone_no);
            System.out.println("Enter Doctor Standard fees : ");
            String Fee = sc.nextLine();
            try {
                Validator.checkStringForParseInt(Fee);
            } catch (InvalidInputDataException e) {
                e.printStackTrace();}
            float Fees=Float.parseFloat(Fee);
            try {
                Validator.CheckNumberForGreaterThanZero(Fees);
            } catch (InvalidInputDataException e) {
                e.printStackTrace();
            }
            newdoc.setSTANDARD_FEES(Fees);
            int result = Doctordao.insertDoctor(newdoc);
            System.out.println("Record added : " + result);
            sc.close();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }


	public static void updateDoctorDetails() {
	        java.util.Scanner sc = new java.util.Scanner(System.in);
	        try {
	            Doctor newdoc = new Doctor();
	            System.out.println("Enter Doctor_Id :");
	            String id = sc.nextLine();
	            //newdoc.setDOC_ID(sc.nextLine());
	            try {
	                Validator.checkStringForParseInt(id);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	                return;
	            }
	            int docId = Integer.parseInt(id);
	            
	            try {
	                Validator.CheckNumberForGreaterThanZero(docId);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	                return;
	            }
	            newdoc.setDOCTOR_ID(docId);
	            Doctor doc = Doctordao.getDoctorById(docId);
	            if (doc == null) {
	                System.out.println("Doctor Doesn't Exist For Id " + docId);
	                return;
	            }
	            newdoc.setDOCTOR_ID(docId);
	            System.out.println("Enter Update Name :");
	            String name = sc.nextLine();
	            try {
	                Validator.checkStringOnly(name);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	                return;
	            }
	            newdoc.setDOCTOR_NAME(name);
	            Calendar c1 = Calendar.getInstance();
	            java.util.Date newDate = new java.util.Date();
	            newdoc.setDOB(newDate);
	            System.out.println("Enter Update Speciality :");
	            String sp = sc.nextLine();
	            newdoc.setSPECIALITY(sc.nextLine());
	            try {
	                Validator.checkStringOnly(sp);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	                return;
	            }
	            newdoc.setSPECIALITY(sp);
	            // newdoc.setSpeciality(sc.nextLine());
	            System.out.println("Enter Update City :");
	            String cy = sc.nextLine();
	            try {
	                Validator.checkStringOnly(cy);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	                return;
	            }
	            newdoc.setCITY(cy);
	            System.out.println("Enter Update Phone_Number");
	            newdoc.setPHONE_NO(sc.nextLong());
	            System.out.println("Enter Update Standard_Fees :");
	            float fees = sc.nextFloat();
	            try {
	                Validator.checkStringForGreaterThanZero1(fees);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	                return;
	            }
	            newdoc.setSTANDARD_FEES(fees);
	            int result = Doctordao.updateDoctor(newdoc);
	            System.out.println(result);
	        } finally {
	            sc.close();
	        }
	    }

	public static void deleteDoctorDetails() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Doctor ID : ");
			String id=sc.next();
			try {
				Validator.checkStringForParseInt(id);
				
			}
			catch(InvalidInputDataException er)
			{
				er.printStackTrace();
			}
			int docid=Integer.parseInt(id);
			
			
		//	int id = Integer.parseInt(sc.nextLine());
			int result = Doctordao.deleteDoctor(docid);
			System.out.println("Records Deleted :" + result);
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void viewDoctorsDetailsById() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Doctor ID : ");
			String id=sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			}
			catch(InvalidInputDataException er) {
				er.printStackTrace();
			}
			int docId = Integer.parseInt(id);
			Doctor doc = Doctordao.getDoctorById(docId);
			System.out.println("Doctor ID : " + doc.getDOCTOR_ID() + "\n" + "Doctor Name : " + doc.getDOCTOR_NAME() + "\n"
					+ "Doctor Speciality : " + doc.getSPECIALITY() + "\n" + "Doctor City : " + doc.getCITY() + "\n"
					+ "Doctor Number : " + doc.getPHONE_NO() + "\n" + "Doctor Fees : " + doc.getSTANDARD_FEES());
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void viewAllDoctorsDetails() {
		try {
			List<Doctor> allDoctor = Doctordao.getAllDoctor();
			Iterator<Doctor> docIterator = allDoctor.iterator();
			while (docIterator.hasNext()) {
				Doctor doc = docIterator.next();
				System.out.println("Doctor ID : " + doc.getDOCTOR_ID() + "\n" + "Doctor Name : " + doc.getDOCTOR_NAME() + "\n"
						+ "Doctor Speciality : " + doc.getSPECIALITY() + "\n" + "Doctor City : " + doc.getCITY() + "\n"
						+ "Doctor Number : " + doc.getPHONE_NO() + "\n" + "Doctor Fees : " + doc.getSTANDARD_FEES());
				System.out.println("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



