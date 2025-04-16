package list;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		// add element
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		
		
		// add all collection
		ArrayList list = new ArrayList(al);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(null);
		list.addAll(al);
		list.add("Hello");
		System.out.println(list);
		System.out.println(list.size());
		
		
		// add element at a specific location
		al.add(0, 75);
		System.out.println(al);
		
		
		ArrayList al2 = new ArrayList<>();
		al2.add("hello");
		al2.add("world");
		
		// add all of collection at a specific index
		al.addAll(1, al2);
		System.out.println(al);
		
		// adding collection into another collection using add()
		al2.add(al);
		System.out.println(al2);
		System.out.println(al2.size());
		System.out.println(((ArrayList)al2.get(2)).get(1));
		
		
		// fetch element
		System.out.println(al.get(2));
		System.out.println(al.get(1));
		
		// clear all elements
		System.out.println(al2.size());
		al2.clear();
		System.out.println(al2.size());
		
		System.out.println("-------------------------------------------------------------");
		
		// remove element using remove(Object) and remove(index)
		ArrayList al3 = new ArrayList<>();
		al3.add(10);
		al3.add("hello");
		al3.add('c');
		al3.add(null);
		
		System.out.println(al3.remove(null));
		System.out.println(al3.remove("hello"));
		
//		System.out.println(al3.remove(10)); // throws IndexOUtOfBoundsException as 10 and character 'a' are implicitly calling
//		remove(index) rather than remove(Object)
		Integer x = 10;
		System.out.println(al3.remove(x));
		Character ch = 'c';
		System.out.println(al3.remove(ch));
		System.out.println(al3);
		
		System.out.println("-------------------------------------------------------------");
		
		// remove all
		
		ArrayList<Integer> al4 = new ArrayList<Integer>();
		al4.add(10);
		al4.add(20);
		al4.add(30);
		al4.add(10);
		
		ArrayList<Integer> al5 = new ArrayList<Integer>(al4);
		al5.add(10);
		al5.add(1);
		al5.add(2);
		
		System.out.println(al5);
		
		al5.removeAll(al4);
		System.out.println(al5);
		
		System.out.println("--------------------------------------------------------------");
		
		al5.add(10);
		al5.addAll(al4);
		System.out.println(al5);
		
		al5.retainAll(al4);
		System.out.println(al5);
	}
	
	
}
