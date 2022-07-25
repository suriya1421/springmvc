package projecttask;

import java.util.Scanner;

public class ExpensesTracker {
	int expen;
	  public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);

	    System.out.println("Enter name");

	    // String input
	    String name = myObj.nextLine();

	    // Numerical input
	    System.out.println("Enter age");
	    int age = myObj.nextInt();
	    System.out.println("Enter salary");
	    double salary = myObj.nextDouble();
	    System.out.println("enter your expen");
	    int expen=myObj.nextInt();
	    int total=(int) (salary-expen);
	    if(total<=5000) {
	    	System.out.println("pls maintain minimum balance");
	    }

	    // Output input by user
	    System.out.println("Name: " + name); 
	    System.out.println("Age: " + age); 
	    System.out.println("avaliable blance: " + total); 
	  }
	}
