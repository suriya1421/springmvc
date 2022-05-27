import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
public static void main(String args[]) {
	String s="abASEFFDDRcdbdsacssabcdab12345";
	Pattern p=Pattern.compile("[a-zA-Z0-9]");
	Matcher m=p.matcher(s);
	while(m.find())
	{
		System.out.println("the word is "+m.group());
		//System.out.println("starting point is"+m.start());
		//System.out.println("ending point is"+m.end());
		System.out.println();
	}
}
}
