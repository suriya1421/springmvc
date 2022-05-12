package collections;

public class TestEmp {
	public static void main(String args[] ) {
		Emp firstEmp=new Emp(111, null);
		Emp secondEmp=new Emp(111, null);
		System.out.println(firstEmp.hashcode());
		System.out.println(secondEmp.hashcode());
		boolean result=firstEmp.equals(secondEmp);
		System.out.println(result);
		result=firstEmp.equals(firstEmp);
		System.out.println(result);
		result=firstEmp.equals("hello");
		System.out.println(result);

	}
}
