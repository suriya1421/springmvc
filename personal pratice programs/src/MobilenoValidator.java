import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobilenoValidator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter mobile number");
		String a= sc.nextLine();
		//String phoneno= sc;
		Pattern p=Pattern.compile("^[[6-9]|0]?{2}[0-9]{10}$");
		Matcher m=p.matcher(a);	
		if(m.find()) {
			System.out.println("valid mobile no");
		}
		else {
			System.out.println("invalid mobile no");
		}
	}
}