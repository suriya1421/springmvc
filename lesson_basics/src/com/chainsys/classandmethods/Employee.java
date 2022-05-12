package com.chainsys.classandmethods;

/**
 * this is class that contains employee related data
 * 
 * @author suri3122 related on :25 march 2022
 *
 */

public class Employee {
	private  final int empID;// cannot call static with final
	private String name;
	private String city;
	private long salary;

	// constructor
	public Employee(int id) {
		// assigning value to readonly field
		this.empID = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public String getCity() {
		return city;

	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getSalary() {
		return salary;

	}

	public void setsalary(long salary) {
		this.salary = salary;

	}
}
