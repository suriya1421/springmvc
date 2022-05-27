import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hii da how are you and you";
		Pattern p=Pattern.compile("you");
		Matcher m=p.matcher(a);
		while(m.find()) {
			System.out.println("the value is"+ m.group()+" "+"you is starts at"+m.start()+" "+"you is end at" + m.end());
		}
		//System.out.println("hiiii");
		

	}

}
