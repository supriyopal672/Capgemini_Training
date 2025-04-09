package stackUsingLinkedList;

import java.util.Scanner;

public class Driver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		boolean flag = true;
		
		while(flag) {
			System.out.println("Enter Your Choice:\nEnter 1 to push an element\nEnter 2 to pop an element\nEnter 3 to display the Stack\nEnter 4 to peek\nEnter 5 to exit");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter your Data: ");
				int data=sc.nextInt();
				stack.push(data);
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				stack.display();
				break;
			case 4:
				stack.peek();
				break;
			case 5:
				flag=false;
				break;
			}
		}

	}
}
