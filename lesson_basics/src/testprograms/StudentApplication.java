package testprograms;

public class StudentApplication {
	private static int studentId;
	private String studentName;
	private String StudentDob;
	private String StudentBloodgroup;
	private float StudentHeight;
	private int StudentMark;
	public StudentApplication() {
		
	}
	public static int getStudentId() {
		return studentId;
	}
	public static void setStudentId(int studentId) {
		StudentApplication.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDob() {
		return StudentDob;
	}
	public void setStudentDob(String studentDob) {
		StudentDob = studentDob;
	}
	public String getStudentBloodgroup() {
		return StudentBloodgroup;
	}
	public void setStudentBloodgroup(String studentBloodgroup) {
		StudentBloodgroup = studentBloodgroup;
	}
	public float getStudentHeight() {
		return StudentHeight;
	}
	public void setStudentHeight(float studentHeight) {
		StudentHeight = studentHeight;
	}
	public int getStudentMarkdetails() {
		return StudentMark;
	}
	public int setStudentMarkdetails( int studentMark) {
		return StudentMark = getStudentMarkdetails();
	}
	


}
