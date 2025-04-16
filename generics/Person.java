package generics;

public class Person {
	 int id;
	private String name;
	
	Person(int id,String name){
		this.name=name;
		this.id=id;
	}
	
	public String toString() {
		return id+"  "+name;
	}
}
