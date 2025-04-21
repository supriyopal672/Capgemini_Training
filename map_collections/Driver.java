package map_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		Employee e1 = new Employee(3, "Supriyo");
		Employee e2 = new Employee(1, "Subham");
		Employee e3 = new Employee(5, "Samriddhi");
		List<Employee> ls = Arrays.asList(e1, e2, e3);

		Comparator<Employee> c = (o1, o2) -> o1.id-o2.id;

		Collections.sort(ls);
		System.out.println(ls);
	}
}
