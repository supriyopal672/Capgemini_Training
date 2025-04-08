package DoublyLinkedList;
import java.util.Scanner;


public class Driver {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter 1 to insert the data \nEnter 2 to Display Forward\nEnter 3 to Display Backward \nEnter 4 to Update at a position\nEnter 5 to Insert at a position\nEnter 7 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the data: ");
				int data = sc.nextInt();
				list.insert(data);
				break;
			case 2:
				list.displayForward();
				break;
			case 3:
				list.displayBackward();
				break;
			case 4:
				System.out.println("Enter the data: ");
				int DATA = sc.nextInt();
				System.out.println("Enter the Position: ");
				int pos = sc.nextInt();
				list.Modify(DATA, pos);
				break;
			case 5:
				System.out.println("Enter the data: ");
				int D = sc.nextInt();
				System.out.println("Enter the Position: ");
				int position = sc.nextInt();
				list.insertAtPosition(D, position);
				break;
			case 6:
				System.out.println("Enter the deletion position: ");
				int d = sc.nextInt();
				list.deleteAt(d);
				break;
			case 7:
				flag = false;
				break;
			default:
				System.out.println("Invalid Choice");

			}
		}
		sc.close();
	}
}
