package com.chainsys.introduction;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //checkUserName();
		 findEvenNumbers();
		//swapNumbers();
		
	}
	public static void checkUserName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String userName=sc.nextLine();
		sc.close();
		System.out.println("Name is"+" "+userName);
		char[] nameAsCharacters=userName.toCharArray();
		int lengthOfCharArray=nameAsCharacters.length;
		System.out.println("Length of your name is"+lengthOfCharArray);
		if(lengthOfCharArray<3)
		{
			System.out.println("name must have atleast 3 charactor");
			
		}
	if(lengthOfCharArray>15){
		System.out.println("name must not have more then 15 char");
		return;
	}
	String nameInUpperCase=userName.toUpperCase();
	nameInUpperCase=nameInUpperCase.trim();
	System.out.println(nameInUpperCase);
	char[] uppercaseCharArray=nameInUpperCase.toCharArray();
	lengthOfCharArray=uppercaseCharArray.length;
	int asciiValue=0;
		for(int index=0;index<lengthOfCharArray;index++)
	
		{
			asciiValue=(int)uppercaseCharArray[index];
			System.out.println("Ascii:"+asciiValue);
			if(asciiValue<65||asciiValue>90) {
				if(asciiValue!=32) {
					System.out.println("invalid character in name");
					return;
				}
			}
		}}
		public static void findEvenNumbers() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter any 10 digit number");
			long value=sc.nextLong();
			sc.close();
			long num=value;
			long reminder=0;
			while(num>0)
			{
				reminder=num%10;
				if(reminder%2==0) {
					System.out.print(reminder);
				}
				num=num/10;
			}
		}
		public static void swapNumbers() {
			int	a=10;
			int b=15;
			a=a+b;
			b=a-b;
			a=a-b;
		System.out.println("a value is"+a);

		System.out.println("b value is"+b);
		}
		

}
