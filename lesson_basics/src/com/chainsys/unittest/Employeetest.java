package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;

public class Employeetest {
	public static final int empID=10; 
	public static void testName(){
		Employee firstEmployee = new Employee(12);
		firstEmployee.setName("suriya");
		System.out.println(firstEmployee.getName());
		
	}
	public static void testCity(){
		Employee firstEmployee = new Employee(12);
		firstEmployee.setCity("theni");
		System.out.println(firstEmployee.getCity());
	}
	public static void testSalary(){
		Employee firstEmployee = new Employee(12);
		firstEmployee.setsalary(50000);
		System.out.println(firstEmployee.getSalary());
		
	}
	{
		
		
	}

}
