import java.util.StringTokenizer;

public class StringDelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // StringTokenizer s1=new StringTokenizer("hii abii);//1st constructor
   // StringTokenizer st=new StringTokenizer("hii -abii","-");//second constuctor
		StringTokenizer st=new StringTokenizer("hii -abii","-",false);
    while(st.hasMoreElements()) {    
    	System.out.println(st.nextElement());
    }
    
	}

}
