package HashSetMethods;

import java.util.HashSet;

public class HashSetImplementation {
	public static void main(String[] args) {
		HashSet <Student>h = new HashSet();
		
		h.add(new Student(101,"Samriddhi"));
		h.add(new Student(102,"Supriyo"));
		h.add(new Student(103,"Subham"));
		h.add(new Student(104,"Soumyadip"));
		h.add(new Student(102,"Supriyo"));
		h.add(new Student(102,"Tathagata"));
		
		System.out.println(h);
		
	}
}
