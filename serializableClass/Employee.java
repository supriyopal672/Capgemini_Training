package serializableClass;

import java.io.Serializable;

public class Employee implements Serializable{
String name;
int id;
double Salary;

Employee(int id,String name,double Salary){
	this.id=id;
	this.name=name;
	this.Salary=Salary;
}

@Override
public String toString() {
	return id +" "+ name + " " + Salary +" ";
}


}
