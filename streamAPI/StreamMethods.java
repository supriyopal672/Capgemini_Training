package streamAPI;

import java.util.*;
import java.util.stream.Stream;

public class StreamMethods {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 5, 4, 7, 6, 6, 8, 9, 10, 2);
		System.out.println(list);
		
//		Stream s = list.stream();
//		Stream s2 = s.distinct();//Once a Stream is used the Stream can't be used again. Its single use only
//		s2.forEach(n->System.out.println(n));
		
		
		list.stream().distinct().forEach(n->System.out.println(n));
		
		System.out.println("----------------------------------------------------------------------");
		Optional<Integer> op=list.stream().distinct().min((o1,o2)-> o1-o2);
		if(op.isPresent()) {
			System.out.println("Min Value: "+op.get());
		}
		System.out.println(list);
		
		Integer i = list.stream().max((o1,o2)-> o1-o2).get();
		System.out.println(i);
		System.out.println("------------------------------------");
		list.stream().sorted().forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println("-----------------------------------");
		list.stream().distinct().sorted().map(n->n*n).forEach(n->System.out.print(n+" "));
		System.out.println("-----------------------------------");
		list.stream().distinct().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println("--------------------------------------------");
		
		//toList
		List<Integer> ls= list.stream().sorted().filter(n->n%2==0).toList();
		System.out.println(ls);
		System.out.println("------------------------------------------------------");
		
		Stream s = Stream.of(1,3,4,"Demo",9,8);
		s.forEach(n->System.out.println(n));
		
		//findFirst()

		Optional<Integer> ops = list.stream().findFirst();

		System.out.println(ops.get());

		//findAny()

		System.out.println(list.stream().findAny().get());

		//count()

		System.out.println(list.stream().count());

		System.out.println("--------------------------------------------");

		// concat(Stream, Stream)

		List<String> strings = Arrays.asList("hello","demo", "hi");

		List<Integer> num = Arrays.asList(1,2,3);

		Stream s1 = strings.stream();

		Stream s2 = num.stream();

		Stream.concat(s1, s2).forEach(n -> System.out.print(n+" "));

		System.out.println();

		// allMatch(Predicate)

		System.out.println(list.stream().distinct().allMatch(n-> n%2==0));

		//anyMatch(Predicate)

		System.out.println(list.stream().distinct().anyMatch(n->n%2==0));
	}
}
