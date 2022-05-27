import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String args[]) {
		String s="hii suriya hii abii";
		Pattern p=Pattern.compile("i");
		Matcher m=p.matcher(s);
		int count=0;
		while(m.find()) {
			//System.out.println(m.group());
		}
		
		
	}

}
