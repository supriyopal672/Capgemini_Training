package oops;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		Employee e0 = new Employee();
		System.out.println(e0.CompanyName + " " + e0.ID + " " + " " +e0.Name+" "+e0.Salary);
		System.out.println("-----------------------------------------------------------");
		
		Employee e1 = new Employee(101);
		System.out.println(e1.CompanyName + " " + e1.ID + " "  + " " +e1.Name+" "+e1.Salary);
		
		System.out.println("-----------------------------------------------------------");
		
		Employee e2 = new Employee(102,"Rocket");
		System.out.println(e2.CompanyName + " " + e2.ID + " " + " " +e2.Name+" "+e2.Salary);
		
		System.out.println("-----------------------------------------------------------");
		
		Employee e3 = new Employee(103,"Groot","CapG");
		System.out.println(e3.CompanyName + " " + e3.ID + " " + " " +e3.Name+" "+e3.Salary);
		
		System.out.println("-----------------------------------------------------------");
		
		Employee e4 = new Employee(104,"Chris","Mindtree",425000);
		System.out.println(e4.CompanyName + " " + e4.ID + " " + " " +e4.Name+" "+e4.Salary);
		
	}
	
}
