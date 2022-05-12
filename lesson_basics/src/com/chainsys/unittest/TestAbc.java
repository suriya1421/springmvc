package com.chainsys.unittest;

import testprograms.AbcBank;

public class TestAbc {
	public static  void AbcBank(int id) {
		AbcBank ab=new AbcBank();
		ab.setId(3122);
		System.out.println("customer id"+" "+ab.getId());
		ab.setCustomerName("suriya");
		System.out.println(ab.getCustomerName());
		ab.setEmployeeAccountNumber(1234567889);
		System.out.println(ab.getEmployeeAccountNumber());
		ab.getEmployeeAccountNumber();
		ab.setCustomerAddress("uthamapalayam,theni");
		System.out.println(ab.getCustomerAddress());
		ab.setCustomerPhoneNumber(754889462);
		System.out.println(ab.getCustomerPhoneNumber());
		ab.setCustomerEmailId("jaisuriya3232@gmail.com");
		ab.getCustomerEmailId();
		System.out.println("");
		AbcBank ab1=new AbcBank();
		ab1.setId(3104);
		System.out.println("customer id is"+" "+ab1.getId());
		ab1.setCustomerName("aravind");
		System.out.println(ab1.getCustomerName());
		ab1.setEmployeeAccountNumber(634342525);
		System.out.println(ab1.getEmployeeAccountNumber());
		ab1.getEmployeeAccountNumber();
		ab1.setCustomerAddress("natham,madurai");
		System.out.println(ab1.getCustomerAddress());
		ab1.setCustomerPhoneNumber(908016353);
		System.out.println(ab1.getCustomerPhoneNumber());
		ab1.setCustomerEmailId("aravind1133@gmail.com");
		ab1.getCustomerEmailId();
		
		
	}



		
	}


