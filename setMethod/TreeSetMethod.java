package setMethod;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethod {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new CompareByName());

		t.add(new Employee("Supriyo", 75000));
		t.add(new Employee("Samriddhi", 25000));
		t.add(new Employee("Subham", 60000));
		t.add(new Employee("Tathagatha", 70000));
		t.add(new Employee("Soumyadip", 6000));

		System.out.println(t);

		System.out.println("----------------------------------------------------------------------------");

		TreeSet<Integer> ts = new TreeSet();

		ts.add(10);

		ts.add(2);

		ts.add(8);

		ts.add(30);

		ts.add(1);

		System.out.println(ts);

		System.out.println(ts.ceiling(3));

		System.out.println(ts.headSet(9));

		System.out.println(ts.headSet(3, true));

		System.out.println(ts.lower(10));

		System.out.println(ts.lower(1));

		SortedSet<Integer> ss = ts.tailSet(8);

		System.out.println(ss);

		NavigableSet<Integer> n = ts.tailSet(8, true);

		System.out.println(n);

		NavigableSet<Integer> m = ts.tailSet(8, false);

		System.out.println(m);
	}
}
