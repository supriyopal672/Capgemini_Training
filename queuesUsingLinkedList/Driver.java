package queuesUsingLinkedList;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedQueues queue = new LinkedQueues();
        
        System.out.println("Queue Implementation using Linked List");
        
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if empty");
            System.out.println("5. Get size");
            System.out.println("6. Display queue");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear the invalid input
                continue;
            }
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the number to enqueue: ");
                    try {
                        int num = scanner.nextInt();
                        queue.enqueue(num);
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.next(); // clear the invalid input
                    }
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
                    System.out.println("Queue size is: " + queue.size());
                    break;
                case 6:
                    queue.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
