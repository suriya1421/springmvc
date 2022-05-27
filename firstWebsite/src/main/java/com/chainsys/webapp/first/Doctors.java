package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.Doctordao;
import com.chainsys.miniproject.pojo.Doctor;

/**
 * Servlet implementation class Doctor
 */
public class Doctors extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Doctor> allDoctor = Doctordao.getAllDoctor();
		Iterator<Doctor> docIterator = allDoctor.iterator();
		while (docIterator.hasNext()) {
			Doctor doc = docIterator.next();
			out.println("</hr>");
			out.println( doc.getDOCTOR_ID() + " "+ doc.getDOCTOR_NAME()
					 + " "+doc.getSPECIALITY() + " "+doc.getCITY() +" "+ doc.getPHONE_NO()  + " "+doc.getSTANDARD_FEES());
			out.println("</p>");
		}
		
	} 


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 String source="AddNewEmployee";
		 String message="<h1>Error while "+source+"</h1>";
		Doctor newdoc = new Doctor();
		PrintWriter out = response.getWriter();
		if (request.getParameter("click").equals("ADD_DOC")) {
		try {
			String id=null;
			id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor Id input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			int doc_id = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(doc_id);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor Id input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newdoc.setDOCTOR_ID(doc_id);
			String Doc_name =null;
			Doc_name= request.getParameter("Doc_name");
			try {
				Validator.checkStringOnly(Doc_name);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor name input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newdoc.setDOCTOR_NAME(Doc_name);
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = request.getParameter("hdate");
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(emp_HireDate);
			} catch (ParseException e) {
				message +=" Error in doctor name input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}

			newdoc.setDOB(newDate);
			System.out.println("Enter Doctor Speciality : ");
			String Speciality =null;
			 Speciality = request.getParameter("Speciality");
			try {
				Validator.checkStringOnly(Speciality);
			} catch (InvalidInputDataException e) {
				message +=" Error in date input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			newdoc.setSPECIALITY(Speciality);
			System.out.println("Enter Doctor City : ");
			String City =null;
			City=request.getParameter("City");
			try {
				Validator.checkStringOnly(City);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor city input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			newdoc.setCITY(City);
			System.out.println("Enter Doctor Phone number : ");
			String Phone_No = null;
			Phone_No=request.getParameter("Phone_No");
			try {
				Validator.checkStringForParseInt(Phone_No);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor phone no input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			try {
				Validator.checkStringForParseInt(emp_HireDate);
			}catch(InvalidInputDataException e) {
				message +=" Error in doctor hire date input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			Long Phone_no = Long.parseLong(Phone_No);
			try {
				Validator.CheckNumberForGreaterThanZero(Phone_no);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor phone no input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			
			newdoc.setPHONE_NO(Phone_no);
			System.out.println("Enter Doctor Standard fees : ");
			String Fee =null;
			Fee=request.getParameter("Fee");
			try {
				Validator.checkStringForParseInt(Fee);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor fee input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			float Fees = Float.parseFloat(Fee);
			try {
				Validator.CheckNumberForGreaterThanZero(Fees);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor fees input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			
				}
			newdoc.setSTANDARD_FEES(Fees);
			int result = Doctordao.insertDoctor(newdoc);
			out.println("Record added : " + result);
		} catch (NumberFormatException e) {
		  e.printStackTrace();		}}
		else if (request.getParameter("click").equals("UPDATE_DOC")) {
			doPut(request, response);
		}if (request.getParameter("click").equals("DELETE_DOC")) {
			doDelete(request,response);
		}
}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String source="AddNewEmployee";
		 String message="<h1>Error while "+source+"</h1>";
		Doctor newdoc = new Doctor();
		PrintWriter out = response.getWriter();
		try {
			String id;
			id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor id input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			int doc_id = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(doc_id);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor id input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			newdoc.setDOCTOR_ID(doc_id);
			String Doc_name =null;
			Doc_name= request.getParameter("Doc_name");
			try {
				Validator.checkStringOnly(Doc_name);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor name input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			newdoc.setDOCTOR_NAME(Doc_name);
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = request.getParameter("hdate");
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(emp_HireDate);
			} catch (ParseException e) {
				message +=" Error in doctor hiredate input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}

			newdoc.setDOB(newDate);
			System.out.println("Enter Doctor Speciality : ");
			String Speciality =null;
			 Speciality = request.getParameter("Speciality");
			try {
				Validator.checkStringOnly(Speciality);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor speciality input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			newdoc.setSPECIALITY(Speciality);
			System.out.println("Enter Doctor City : ");
			String City =null;
			City=request.getParameter("City");
			try {
				Validator.checkStringOnly(City);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor city input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newdoc.setCITY(City);
			System.out.println("Enter Doctor Phone number : ");
			String Phone_No = null;
			Phone_No=request.getParameter("Phone_No");
			try {
				Validator.checkStringForParseInt(Phone_No);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor phoneno input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			try {
				Validator.checkStringForParseInt(Phone_No);
			}catch(InvalidInputDataException e) {
				message +=" Error in doctor phoneno input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			Long Phone_no = Long.parseLong(Phone_No);
			try {
				Validator.CheckNumberForGreaterThanZero(Phone_no);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor phoneno input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			
			newdoc.setPHONE_NO(Phone_no);
			System.out.println("Enter Doctor Standard fees : ");
			String Fee =null;
			Fee=request.getParameter("Fee");
			try {
				Validator.checkStringForParseInt(Fee);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor fee input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			float Fees = Float.parseFloat(Fee);
			try {
				Validator.CheckNumberForGreaterThanZero(Fees);
			} catch (InvalidInputDataException e) {
				message +=" Error in doctor fees input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;			}
			newdoc.setSTANDARD_FEES(Fees);
			int result = Doctordao.updateDoctor(newdoc);
			out.println("Record added : " + result);
		} catch (NumberFormatException e) {
			message +=" Error in doctor fees input: </p>";
			String errorPage=ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;		}	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		String source="AddNewEmployee";
		 String message="<h1>Error while "+source+"</h1>";
        Doctor newdoc = new Doctor();
        PrintWriter out = response.getWriter();
        String id = null;
        try {
            id = request.getParameter("id");
            try {
                Validator.checkStringForParseInt(id);
            } catch (InvalidInputDataException e) {
            	message +=" Error in doctor id input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;            }
            int doc_id = Integer.parseInt(id);
            try {
                Validator.CheckNumberForGreaterThanZero(doc_id);
            } catch (InvalidInputDataException e) {
            	message +=" Error in doctor id input: </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;                     }
            newdoc.setDOCTOR_ID(doc_id);
            int result = Doctordao.deleteDoctor(doc_id);
            out.println("Records Deleted :" + result);

        } catch (Exception e) {
        	message +=" Error in doctor id input: </p>";
			String errorPage=ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;                 }
    }
		}