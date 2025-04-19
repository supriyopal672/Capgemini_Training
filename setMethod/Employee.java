package setMethod;

public class Employee implements Comparable{
	String name;
	double Salary;

	public Employee(String name, double Salary) {
		this.name = name;
		this.Salary = Salary;
	}

	@Override
	public String toString() {
		return name + " " + Salary ;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e =(Employee)o;
		return (int)(this.Salary-e.Salary);
	}
}
