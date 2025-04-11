package queuesUsingArrays;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Queue Implementation using Array");
		System.out.print("Enter the size of the queue: ");
		int size = scanner.nextInt();
		Queues queue = new Queues(size);

		while (true) {
			System.out.println("\nChoose an operation:");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Peek");
			System.out.println("4. Check if empty");
			System.out.println("5. Check if full");
			System.out.println("6. Get size");
			System.out.println("7. Display queue");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the number to enqueue: ");
				int num = scanner.nextInt();
				queue.enqueue(num);
				break;
			case 2:
				queue.dequeue();
				break;
			case 3:
				int front = queue.peek();
				if (front != Integer.MIN_VALUE) {
					System.out.println("Front element is: " + front);
				}
				break;
			case 4:
				System.out.println("Queue is " + (queue.isEmpty() ? "empty" : "not empty"));
				break;
			case 5:
				System.out.println("Queue is " + (queue.isFull() ? "full" : "not full"));
				break;
			case 6:
				System.out.println("Queue size is: " + queue.size());
				break;
			case 7:
				queue.display();
				break;
			case 8:
				System.out.println("Exiting...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}

	}

}
