package covarientReturnType;

public class PartTimeEmployee extends Employee{
private int workingHours;
public PartTimeEmployee(String name,double salary,int workingHours) {
	super(name,salary);
	this.workingHours=workingHours;
}
public void employeeInfo() {
	super.employeeInfo();
	System.out.println(" Working Hours: "+workingHours);
}

public void Jobrole() {

	System.out.println("The jobrole of part time employee is cloud engineer. ");
	
}

public void getDesignation() {
	System.out.println("The Employee is Intern ");
}
}
