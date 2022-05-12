package com.chainsys.unittest;
/*
 * @author chainsys-
 * @category to test Demoa class,its fields,methods
 * date:mar 24 2022
 */

import com.chainsys.variables.Demoa;

public class VariableTester {
	/*
	 * Test Static variable
	 */
	public static void testStaticVariable() {
		//display the value of static value
		System.out.println("DataA"+Demoa.DataA);
		//display the value of immutable field
		//this is not possible without an object
		//System.out.println("DataB"+Demoa.DataB);
		//display the value of constand field
		//System.out.println("DataC"+Demoa.DataC);
		//modifiying value of the static field DataC
		//Error
		Demoa.DataA=2345;
		System.out.println("DataA:"+Demoa.DataA);
	}
	public static void testImmutableVariable()
	{
		//cannot make a static reference to the non-static field Demoa.DemoB	
		/**
		 * first create an object or the class
		 * pass an int value as an argument to the constructor
		 * access the immutable instance field using the object reference
		 */
		Demoa firstObject=new Demoa(123);
		System.out.println(firstObject.DataB);
		/*
		 * value assigned to an immutable field can not be changed
		 * value for the immutable field can be assigned only through the constructor
		 */
		 //firstObject.DataB=567;
	}
	/**
	 * calling static method using class name
	 * without creating an object
	 * created on: 25 march 2022
	 */
	public static void testStaticMethod() {
		Demoa.sayHello();
		
	}
	/**
	 * calling non_static method using object reference
	 * non static method cannot be called
	 * created on: 25 march 2022
	 */
	public static void testNonStaticMethod() {
		//Error
		//Demoa.greetUser();
		Demoa firstObject=new Demoa(111);
		//call the non static method
		firstObject.greetUser();
		
		
	}


}
