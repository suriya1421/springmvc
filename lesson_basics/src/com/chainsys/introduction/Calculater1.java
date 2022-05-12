package com.chainsys.introduction;
/**
 * 
 * @author chainsys-suri3122
 * created on:25 march 2022
 *
 */

public class Calculater1 {
/**
 * Add Method:will take 2 values using the  following parameters
 * and will add the values.the result of the totaling will be returned back to the caller
 * this a static method object reference is not required.
 * 
 * @param param1 of type int
 * @param param2 of type int
 * @return type int
 */
	public static int add(int param1,int param2) {
		int result=param1+param2;
		return result;
	}
	/**
	 * multiply Method: takes 2 values using the  following parameters and will
	 *  add the values.the result of the totaling will be returned back to the caller
	 * this a static method object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
		
	public static int subtract(int param1,int param2) {
		int result=param1-param2;
		return result;
	}
		public static int multiply(int param1,int param2) {
			int result=param1*param2;
			return result;
		}
		public static int divide(int param1,int param2) {
			if(param2==0) {
				System.out.println("value of parameter 2 is not valid ");
				return 0;
			}
			int result=param1/param2;
			return result;
		}
}
