package exceptions;

import java.util.Scanner;

public class Nestedtry {
	static String[] data;
	public static void main(String args[]) {
		int num=0;
		int numValue=0;
		data=new String[2];
		java.util.Scanner sc=null;
		try {
			sc=new Scanner (System.in);
			try {
				System.out.println("enter value for x");
				data[0]=sc.nextLine();
				numValue=Integer.parseInt(data[9]);
				System.out.println("the square is"+numValue*numValue);
				}
			catch(NumberFormatException nb) {
				System.out.println("Not a number!");
				}
			num=data.length;
			System.out.println("Array length"+num);
		}
		catch(ArrayIndexOutOfBoundsException ne) {
			System.out.println("ArrayIndexOutOfBounds-no argument given!!!");
		}
		catch(Exception er) {
			System.out.println("Exception"+er.getMessage());
		}
		}
	}

