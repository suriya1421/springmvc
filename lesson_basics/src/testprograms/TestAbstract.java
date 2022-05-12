package testprograms;

public class TestAbstract extends Demoabstract {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("name:suriya");
		
	}

	@Override
	void gender() {
		// TODO Auto-generated method stub
		System.out.println("gender:male");
		
	}
	public static void main(String args[]) {
		TestAbstract tb=new TestAbstract();
		tb.name();
		tb.age();
		tb.gender();
		tb.area();
		
	}

}
