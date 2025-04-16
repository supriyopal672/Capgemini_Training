package generics;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		Student<Person> student = new Student(new Person(10,"Rohit"));
		printDetails(student);
		
		List<Boolean> list = new ArrayList<Boolean>();
		list.add(true);
		list.add(false);
		list.add(true);
		list.add(true);
		
		Student<Person> s = new Student(new Person(10,"hi"));
		System.out.println();
//		print(list);
		
		
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		
//		printData(ls);.
		printList(list);
	}
	
	public static void printDetails(Student<? extends Person> student) {
		Person p = student.obj;
//		student.obj=new Person(10,"ram");
		System.out.println(p);
	}
	
	
	public static void print(List<? extends Number> list) {
//		list.add(true);
		System.out.println(list.get(0));
	}
	
	public static void printData(List<? super Number> list) {
		list.add(65);
		System.out.println(list.get(0));
	}
	
	public static void printList(List<? > list) {
		System.out.println(list);
		//list.add(50);
	}
	
	
}
