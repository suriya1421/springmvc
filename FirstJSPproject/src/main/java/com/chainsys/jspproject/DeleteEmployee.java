package com.chainsys.jspproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jspproject.commonutil.ExceptionManager;
import com.chainsys.jspproject.commonutil.InvalidInputDataException;
import com.chainsys.jspproject.commonutil.Validator;
import com.chainsys.jspproject.dao.EmployeeDao;
import com.chainsys.jspproject.pojo.Employee;


/**
 * Servlet implementation class AddEmployee
 */
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DeleteEmployee() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String source="AddNewEmployee";
	 String message="<h1>Error while "+source+"</h1>";
	PrintWriter out = response.getWriter();
	Employee newemp = null;
	int result = 0;
	String empid = null;
	try {
	    empid=request.getParameter("id");
		Validator.checkStringForParseInt(empid);
	}catch(InvalidInputDataException e) {
		message +=" Error in Employee id: </p>";
		String errorPage=ExceptionManager.handleException(e, source, message);
		out.print(errorPage);
		return;
	}
	int emp_id=Integer.parseInt(empid);
	result = EmployeeDao.deleteEmployee(emp_id);
    request.setAttribute("DeleteEmp", result);
    RequestDispatcher rd = request.getRequestDispatcher("/DeleteEmp.jsp");
    rd.forward(request, response);	

	}

}
