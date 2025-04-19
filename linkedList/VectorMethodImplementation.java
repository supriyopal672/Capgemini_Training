package linkedList;

import java.util.Stack;

public class VectorMethodImplementation {

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push(10);

		stack.push(20);

		stack.push(30);

		System.out.println(stack);

		Stack s = new Stack();

		s.add(10);

		s.add(20);

		s.add(30);

		System.out.println(s);

		System.out.println(s.search(10));

		System.out.println(s.search(30));

		System.out.println(stack.search(10));

		System.out.println(stack.search(30));

		System.out.println("----------------------");

		System.out.println(stack.get(0));
		System.out.println(s.get(0));

	}

}