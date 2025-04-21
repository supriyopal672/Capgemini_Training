package map_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDriver {
public static void main(String[] args) {
	Demo l1 = () -> System.out.println("Hello");
	Demo2 l2 = () -> System.out.println("World");
	Demo3 l3 = (x,y) -> {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	};
	
	System.out.println(l3.check(10, 20));
	l1.print();
	l2.greet();
	
	System.out.println("---------------------------------------------------------------------------");
	List<Integer> l =Arrays.asList(100,200,37,4,59,6,78,8,9);
	System.out.println(l);
	Comparator<Integer> comp = (o1,o2) -> o2-o1;
	Collections.sort(l,comp);
	System.out.println(l);
	
	
}
}
