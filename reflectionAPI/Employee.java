package reflectionAPI;

public class Employee {
	private String name;
	private int id;
	private double Salary;
	private int age;

	Employee(int id, String name, double Salary, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.Salary = Salary;
	}

	@Deprecated
	public int getAge() {
		return age;
	}

	@Deprecated
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	@Deprecated
	public double getSalary() {
		return Salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + Salary + " " + age;
	}

}
