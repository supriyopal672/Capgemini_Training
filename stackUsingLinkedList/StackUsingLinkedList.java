package stackUsingLinkedList;

public class StackUsingLinkedList {
	Node head;
	Node tail;
	static int count = 0;

	public void push(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			count++;
			return;
		} else {
			tail.next = node;
			tail = node;
			count++;
			return;
		}
	}

	public void pop() {
		if (head == null) {
			System.out.println("The Stack is Already Empty");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}

		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}

		// Delete the last node
		current.next = null;
		tail = current;
		count--;
	}

	public void peek() {
		System.out.println(tail.data);
	}

	public void display() {
		Node current = head;
		if (current == null) {
			System.out.println("No data to Display");
		}
		while (current != null) {

			System.out.print(current.data + " ");
			current = current.next;

		}
		System.out.println();
	}

}
