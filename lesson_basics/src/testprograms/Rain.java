package testprograms;

import java.util.Scanner;

public class Rain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter");
		String input=sc.nextLine();
		String rain="rainy season";
		String notRain="not rainy season";
		if(rain.equals(input)) {
			System.out.println("please take umbrella");
		}
		else if(notRain.equals(input)) {
			System.out.println("dont bring umberlla");
		}
		int degree;
		System.out.println("enter degrees");
		for( degree=sc.nextInt();degree<=50;degree++) {
			
			if(degree<=32) {
			System.out.println("please bring a heavy jacket");
		    break;
			}
			if(degree>32)
			System.out.println("please bring a light jacket");
			break;
		}
		

	}

}
