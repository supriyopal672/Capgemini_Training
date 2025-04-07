package comparableInterface;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Raju Rastogi", 50000);
		Employee e2 = new Employee(102, "Supriyo", 65000);
	
		compareBasedOnId(e1, e2);
		compareBasedOnName(e1, e2);
		
		
}
	public static void compareBasedOnId(Employee e1,Employee e2) {
		CompareEmployeeById c = new CompareEmployeeById();
		
		if(c.compare(e1, e2)>0) {
			System.out.println("Then e1 is Greater");
		}else if(c.compare(e1, e2)<0){
			System.out.println("Then e2 is Greater");
			
		}else {
			System.out.println("Then e1 is equal to e2");
			
		}
		}
	
	
	public static void compareBasedOnName(Employee e1,Employee e2) {
		if(e1.compareTo(e2)>0) {
			System.out.println("Then e1 is Greater");
		}else if(e1.compareTo(e2)<0){
			System.out.println("Then e2 is Greater");
			
		}else {
			System.out.println("Then e1 is equal to e2");
			
		}
		}
	
}
