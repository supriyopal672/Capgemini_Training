package caseStudy;

public class Professor extends Person {
	private String specialization;
	
	public Professor(String name, int age, String specialization) {
		super(name, age);
		this.specialization=specialization;
	}

	public void displayInfo() {

		super.displayInfo();

		System.out.println("Specialization: "+specialization);
	}
}
