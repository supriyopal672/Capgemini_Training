package many_to_many;
import java.util.*;
public class StudentDriver {
public static void main(String[] args) {
	Student s1 = new Student("Rohit",3);
	Student s2 = new Student("Raj",2);
	
	Course c1 = new Course ("French",3);
	Course c2 = new Course ("Math",4);
	Course c3 = new Course ("English",2);
	
	s1.addCourse(c1);
	s1.addCourse(c2);
	s2.addCourse(c3);
	s2.addCourse(c1);
	
	System.out.println(Arrays.toString(s1.arr)+" "+Arrays.toString(s2.arr));
	
	
	String s ="hello";
	s=s.toUpperCase();
	char[] arr=s.toCharArray();
	System.out.println(Arrays.toString(arr));
}
}