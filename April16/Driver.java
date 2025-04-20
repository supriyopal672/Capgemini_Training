package April16;

import java.util.*;

public class Driver {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Employee> arr = new ArrayList<Employee>();

		arr.add(new Employee(103, "Supriyo"));
		arr.add(new Employee(105, "Subham"));
		arr.add(new Employee(104, "Soumyadip"));
		arr.add(new Employee(102, "Tatha"));
		arr.add(new Employee(101, "Samriddhi"));
		
		System.out.println(arr);
		System.out.println("---------------------------");
		
		ArrayList<Employee> arr2 = new ArrayList<Employee>();
		arr2.add(new Employee(108,"Tarak"));
		arr2.add(new Employee(106,"Daya"));
		arr2.addAll(arr);
		System.out.println(arr2);
		System.out.println("---------------------------");
		
		
		Comparator<Employee> comp = (o1, o2) -> o1.id - o2.id;
		Collections.sort(arr2, comp);
		
		Iterator<Employee> itr = arr2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Enter your name: ");
		String search = sc.next();
		
		Iterator<Employee> itr2 = arr2.iterator();
		
		while(itr2.hasNext()) {
			Employee emp = itr2.next();
			if((emp.name).equalsIgnoreCase(search)) {
				System.out.println(emp);
				break;
			}
		}
		
	}

}
