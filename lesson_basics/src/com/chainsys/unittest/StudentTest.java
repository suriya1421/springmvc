package com.chainsys.unittest;

import testprograms.StudentApplication;

public class StudentTest {
	public static void StudentTest() {
		StudentApplication sa=new StudentApplication ();
		sa.setStudentId(01);
		System.out.println(sa.getStudentId());
		sa.setStudentName("suriya");
		System.out.println(sa.getStudentName());
		sa.setStudentDob("14/07/1997");
		System.out.println(sa.getStudentDob());
		sa.setStudentBloodgroup("AB+");
		System.out.println(sa.getStudentBloodgroup());
		sa.setStudentHeight((float) 1.72);
		System.out.println(sa.getStudentHeight());
	int total=	sa.setStudentMarkdetails(450);
		System.out.println(total);
		
	}

}
