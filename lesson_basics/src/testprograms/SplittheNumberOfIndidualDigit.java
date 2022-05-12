package testprograms;

import java.util.Scanner;

public class SplittheNumberOfIndidualDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String number=sc.nextLine();
	char[]n=number.toCharArray();
	System.out.println("Split The Number Of Indidual Digit is");
	for(int i=0;i<=n.length-1;i++) {
		System.out.println(n[i]);
	}
		

	}

}
