package caseStudy;

public class Student extends Person {
	private int studentID;

	public Student(String name, int age, int studentID) {
		super(name, age);
		this.studentID = studentID;
	}

	public void displayStudentInfo() {

		System.out.println("Student ID: "+studentID);
		displayInfo();
	}

}
