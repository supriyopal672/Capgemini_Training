package linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList<Employee> employee = new LinkedList();
		employee.add(new Employee(3, "Supriyo"));
		employee.add(new Employee(2, "Samriddhi"));
		employee.add(new Employee(1, "Subham"));
		System.out.println(employee);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		
		
		employee.addLast(new Employee(0, "Rohit"));
		employee.addFirst(new Employee(5, "Soumyadip"));
		System.out.println(employee);

		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		
		Collections.sort(employee);
		System.out.println(employee);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		
		Iterator<Employee> emp = employee.descendingIterator();
		while(emp.hasNext()) {
			Employee e= emp.next();
			System.out.println(e);
		}
		
		
		
	}
}
