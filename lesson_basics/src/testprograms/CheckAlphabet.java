package testprograms;

import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the value");
		   String str = sc.nextLine();
		 if(  str.length()<=7) {
		   boolean result = false;
		    result = str.matches("[a-zA-Z]+"); 
		   System.out.println("Original String : " + str);  
		   System.out.println("Does string contain only Alphabets? : " + result);
		 }
		 else {
			 System.out.println("pls enter eight charactors");
		 }
		   }
	}
	