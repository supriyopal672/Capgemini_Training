package Program;

public class Student extends Person{
	private int StudentID;
	public Student(int StudentID, String name, int age) {
		super(name,age);
		this.StudentID=StudentID;

	}
	
	public void displayStudentID() {
		System.out.print("Student ID: "+StudentID+" ");
		displayPersonDetails();
	}

	

}
