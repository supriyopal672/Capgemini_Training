package arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class EmployeeDriver {
	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(new Employee(3, "Supriyo"));
		employee.add(new Employee(2, "Samriddhi"));
		employee.add(new Employee(1, "Subham"));

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------------------------------");
		
//		Iterator<Employee> emp=employee.iterator();
//		while(emp.hasNext()) {
//			Employee n = emp.next();
//			if(n.name.equals("Samriddhi")) {
//				emp.remove();
//			}
//		}

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------------------------------");
		//Compare using Comparable
		System.out.println("Sorted By Id");
		Collections.sort(employee);
		System.out.println(employee);
		System.out.println("---------------------------------------------------------------------------------------");
		//Compare using Comparator
		System.out.println("Sorted By Name");
		Collections.sort(employee,new CompareByName());
		System.out.println(employee);

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
//		a1.add("helloo");

//		for (int i : a1) {
//			if(i==30) {
//				Integer x =i;
//				a1.remove(x);//Concurrent Modification Exception occurs when manipulating array list through loops
//				break;//break is used to avoid Concurrent Modification Exception after manipulating the array list
//			}
//		}
		
		
//		Iterator<Integer> itr=a1.iterator();
//		while(itr.hasNext()) {
//			int x =itr.next();
//			System.out.println(x);
//			if(x==30) {
//				itr.remove();
//			}
//		}
		System.out.println(a1);
		System.out.println("---------------------------------------------------------------------------------------");
		//List Iterator
		ListIterator list= a1.listIterator();
		while(list.hasNext()) {
			System.out.println("Index: "+list.nextIndex()+" Element: "+list.next());
		}
		//The pointer gets pointed at end
		while(list.hasPrevious()) {
			list.previous();
		}
		System.out.println("---------------------------------------------------------------------------------------");
		
		while(list.hasNext()) {
			int index = list.nextIndex();
			if(index==1) {
				list.add(100);
			}
			int element=(Integer)list.next();
			if(element==50) {
				list.set(200);
			}
		}
		
		System.out.println(a1);
		System.out.println("---------------------------------------------------------------------------------------");
		
		ArrayList<Integer> ls=new ArrayList();
		ls.add(50);
		ls.add(49);
		ls.add(16);
		ls.add(67);
		ls.add(10);
//		ls.add('c');
//		ls.add("");
		Collections.sort(ls);

		System.out.println(ls);
	}
}
