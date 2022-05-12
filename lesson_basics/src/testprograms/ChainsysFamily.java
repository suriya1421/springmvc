package testprograms;

public class ChainsysFamily implements JavaBatch,AngularBatch {

	@Override
	public void studentNames() {
		// TODO Auto-generated method stub
		System.out.println("students name is successfully updated");
		
	}

	@Override
	public void trainerDetails() {
		// TODO Auto-generated method stub
		System.out.println("we have a good trainer:mr.venkat ");
		
	}

	@Override
	public void companyName() {
		// TODO Auto-generated method stub
		System.out.println("chainsys");
		
	}

	@Override
	public void dateOfJpoining() {
		// TODO Auto-generated method stub
		System.out.println("angular is feb 10 & java batch is april 21");
		
	}
	public static void main(String args[]) {
		ChainsysFamily cf=new ChainsysFamily();
		cf.companyName();
		cf.trainerDetails();
		cf.studentNames();
		cf.dateOfJpoining();
		
	}

}
