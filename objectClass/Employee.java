package objectClass;

import java.util.Objects;

public class Employee implements Cloneable{
private String name;
private int id;
private double salary;

public Employee(int id,String name,double salary) {
	this.name=name;
	this.id=id;
	this.salary=salary;
	
}



@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
}



@Override
public int hashCode() {
	return Objects.hash(id, name, salary);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return this.name.equals(other.name);
}

}
