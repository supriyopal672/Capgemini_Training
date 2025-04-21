package map_collections;

import java.util.TreeMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMapImplmentation {
	public static void main(String[] args) {

		TreeMap tree = new TreeMap((o1, o2) -> (Integer) o2 - (Integer) o1);

		tree.put(1, "Hello");
		tree.put(2, "World");
		tree.put(3, "MF");

		System.out.println(tree);
		tree.put(3, "Mother Father");
		tree.put(4, null);
		System.out.println(tree);

		System.out.println("-----------------------------------------------------------------------------");

		Set<Integer> set = tree.keySet();
		Iterator<Integer> itr1 = set.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("-----------------------------------------------------------------------------");
		Collection<String> c = tree.values();
		Iterator<String> itr2 = c.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("-----------------------------------------------------------------------------");

		Set<Entry<Integer, String>> s = tree.entrySet();
		Iterator itr3 = s.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
		System.out.println();

		for (Entry<Integer, String> e : s) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println("-----------------------------------------------------------------------------");

		TreeMap<String, List<String>> map = new TreeMap();
		List l1 = Arrays.asList("HYDERABAD", "BANGALORE", "KOLKATA");
		List l2 = Arrays.asList("Pune", "Gurgaon", "Noida");
		List l3 = Arrays.asList("J&K", "Assam", "Chennai");

		map.put("Capgemini", l1);

		map.put("PWC", l2);

		map.put("JustPay", l3);

		System.out.println(map);
		
		System.out.println();
		
		Set<Entry<String,List<String>>> setEntry= map.entrySet();
		Iterator itr4 = setEntry.iterator();
		while (itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		
		System.out.println();

		for (Entry<String,List<String>> e : setEntry) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}
}
