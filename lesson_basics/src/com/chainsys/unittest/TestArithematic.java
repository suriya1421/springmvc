package com.chainsys.unittest;

import personalpratice.ICalculator;

public class TestArithematic implements ICalculator {

	public int add(int v1,int v2)
	{
		return (v1+v2);
	}
	public int multiply(int v1,int v2)
	{
		return (v1*v2);
	}
	public int divide(int v1,int v2)
	{
		if (v2==0)
		{
			System.out.println("V2 should be > 0");
		}
		return (v1/v2);
	}
}
