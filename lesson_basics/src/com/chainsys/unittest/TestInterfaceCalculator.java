package com.chainsys.unittest;

import personalpratice.ICalculator;

public class TestInterfaceCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICalculator d= new TestArithematic();
		int c=d.add(5, 5);
		System.out.println(c);
	c=d.divide(20, 5);
	System.out.println(c);
	c=d.multiply(2, 10);
	System.out.println(c);
	}

}
