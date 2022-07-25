import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {

	public static void main(String[] args) {
       
		String s=  "hii i am suriya from chainsys";
		Pattern p=Pattern.compile("i? ");//specified for space
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group()+"");
		}
		
	}

}
