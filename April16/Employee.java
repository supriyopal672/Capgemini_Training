package April16;

public class Employee{
String name;
int id;

Employee(int id,String name){
	this.name=name;
	this.id=id;
}

@Override
public String toString() {
	return id + " " + name;
}




}
