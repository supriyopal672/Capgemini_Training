package inheritence;

public class Vehicle {
String name;
String engineType;

public Vehicle(String name, String engineType) {
	super();
	this.name=name;
	this.engineType=engineType;
	
	System.out.println("Parent");
}
}
