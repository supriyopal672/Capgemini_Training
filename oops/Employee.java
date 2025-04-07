package oops;

public class Employee {
	int ID;
	String Name;
	double Salary;
	String CompanyName;

	public Employee(){
	System.out.println("This is No Arg Constructor !!!");	
	}

	public Employee(int ID) {
		this.ID=ID;
	}
	
	public Employee(int ID, String Name) {
		this(ID);
		this.Name= Name;
	}
	
	public Employee(int ID, String Name, String CompanyName) {
		this(ID,Name);
		this.CompanyName=CompanyName;
	}
	
	public  Employee(int ID, String Name, String CompanyName,int Salary) {
		this(ID,Name,CompanyName);
		this.Salary=Salary;
	}
}
