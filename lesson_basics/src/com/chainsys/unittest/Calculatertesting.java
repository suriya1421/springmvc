package com.chainsys.unittest;

import com.chainsys.introduction.Calculater1;
/**
 * @author suri3122
 * created on 25 mar 2022
 */

public class Calculatertesting {
	public static void testCalculateradd() {
		int add=Calculater1.add(5, 9);
		System.out.println("add value is:"+add);
		
	}
	public static void testCalculatersubtract() {
		int subtract=Calculater1.subtract(5, 9);
		System.out.println("subtract value is:"+subtract);
		
	}
	public static void testCalculatermultiply() {
		int multiply=Calculater1.multiply(5, 9);
		System.out.println("multiply value is:"+multiply);
		
	}
	public static void testCalculaterdivide() {
		int divide=Calculater1.divide(5, 2);
		System.out.println("divide value is"+divide);
		
	}

}
