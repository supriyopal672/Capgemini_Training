package map_collections;

public class Employee implements Comparable{
	int id;
	String name;

	Employee(int id, String name) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " " + name ;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e = (Employee)o;
		return this.id-e.id;
	}
	
	
	
	
}
