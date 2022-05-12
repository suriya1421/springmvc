package com.chainsys.strings;

public class StringLessonA {
	public static void lessoneOne() {
		String firstString="chainsys";
		System.out.println(firstString);
		char dataOne[]={'c','h','a','i','n'};
		String secondString=new String(dataOne);
		System.out.println(secondString);
		String thirdString=new String(new char[] {'c','h','a','i','n'});
		System.out.println(thirdString);
		
	}
	public static void lessonTwo() {
		String firstString ="Hello";
		String secondString="Hello";
		String thirdString="Hello";
		int firstNumber=100;
		int secondNumber=100;
		int thirdNumber=100;
		System.out.println(firstString);
		System.out.println(secondString);
		firstString="Welcome";
		System.out.println(firstString);
		System.out.println(secondString);
	}
	public static void creatingStringInaForLoop() {
		for(int count=0;count<10;count++)
		{
			String s1="hello";
			
		}
	}
	public static void stringToCharArray() {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("enter a wors");
		String firstString=scanner.nextLine();
		scanner.close();
		int stringlength=firstString.length();
		System.out.println("length"+stringlength);
		char[]data=firstString.toCharArray();
		int dataarraylength=data.length;
		System.out.println("length"+dataarraylength);
	}
		public static void stringToUpperLower() {
			java.util.Scanner scanner=new java.util.Scanner(System.in);
			System.out.println("enter a word");
			String firstString=scanner.nextLine();
			scanner.close();
			System.out.println(firstString);
			String stringInUppercase=firstString.toUpperCase();
			System.out.println("touppercase"+stringInUppercase);
			//string in firstStrin is not modified,because STRINGS ARE immutable
			System.out.println("s1"+firstString);
			String stringInLowercase=firstString.toLowerCase();
			System.out.println("lowerCase"+stringInLowercase);
			System.out.println("s1="+firstString);
			String subString=firstString.substring(3);
			System.out.println(subString);
			//from 3rd char to 6th char
			//from index 2 to index 5
			subString=firstString.substring(2, 6);
			System.out.println(subString);
			//replace
			String replaceedString=firstString.replace('a', 'e');
			System.out.println(replaceedString);
			//equals
			boolean flag1=firstString.equals(stringInUppercase);//false
			System.out.println(flag1);
			//equalsIgnoreCase
			boolean flag=firstString.equalsIgnoreCase(stringInUppercase);//true
			System.out.println(flag);
		}
		public static void testStringTrim() {
			String secondString="     hope     it";
			System.out.println("befour trim"+secondString.length());
			secondString=secondString.trim();
			System.out.println("after trim"+secondString.length());
		}
public static void testSplit() {
	//String firstString="  tom and jerry"
}
	public static void reverse() {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("enter a sentance");
		String sentance=scanner.nextLine();
		char[]a=sentance.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		
			
		}}
		public static void verifyString(String s1){
			if(null==s1) {
				System.out.println("string is null");
				return;
			}
			else
				System.out.println("string is not null"+s1);
			if(!s1.isEmpty()) 
				System.out.println("\t not empty"+s1);
				else 
					System.out.println("\t string is empty");
			}
				
			
		}
		
			
		
	


