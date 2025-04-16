package arrayLists;

public class Employee implements Comparable<Employee>{
int id;
String name;

Employee(int id,String name){
	this.id=id;
	this.name=name;
}

@Override
public String toString() {
	return  id + " " + name;
}

@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	Employee e = (Employee)o;
	return (int)(this.id-e.id);
}


}
