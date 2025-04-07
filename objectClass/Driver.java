package objectClass;

public class Driver {
public static void main(String[] args) {
	String s= new String("Sup's");
	Employee e1 = new Employee(101,"Sup's",30000);
	Object e2 = e1;
	System.out.println(e1.equals(e2));
	
}



}
