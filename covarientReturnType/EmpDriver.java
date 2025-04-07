package covarientReturnType;

public class EmpDriver {
	static void details(Employee e) {
if(e instanceof FullTimeEmployee) {
	e.Jobrole();
}else{
	e.Jobrole();

	((PartTimeEmployee)e).getDesignation();
}

	}
public static void main(String[] args) {
	Employee f = new FullTimeEmployee("Sups", 50000, 25000);
	Employee p = new PartTimeEmployee("Raj", 25000, 14);
	
	f.employeeInfo();
//	((FullTimeEmployee)f).Jobrole();
	details(f);
	
	p.employeeInfo();
//	((PartTimeEmployee)p).getDesignation();
	details(p);
	
}
}
