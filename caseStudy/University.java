package caseStudy;

public class University {
	private Person[] people;
	int size = 5;

	static int index = 0;

	public University(int size) {
		this.people = new Person[size];
	}

	public void addPerson(Person peoples) {
		if (index < people.length) {
			people[index++] = peoples;
		} else {
			System.out.println("Cannot Add Person size is full...");
		}
	}

	public void showPeople() {
		for (int i = 0; i < index; i++) {
			people[i].displayInfo();
		}
	}
	
	

}