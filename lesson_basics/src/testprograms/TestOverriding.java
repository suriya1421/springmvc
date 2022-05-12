package testprograms;

public class TestOverriding extends Overriding {
	public void food () {
		System.out.println("i like veg food");
	}
	public void eyecolor() {
		System.out.println("eyes is black");
	}
public static void main(String[] args) {
	TestOverriding to=new  TestOverriding();
	to.food();
	to.eyecolor();
	to.gender();
}
}
