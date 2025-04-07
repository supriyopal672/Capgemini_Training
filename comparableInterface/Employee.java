package comparableInterface;

public class Employee implements Comparable{
	public int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", salary=" + salary + " ";
	}

	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Employee e = (Employee)o;
//		return (int)(this.salary-e.salary);
//	}
//	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e = (Employee)o;
		return ((this.name).compareTo(e.name));
	}
}
