package DoublyLinkedList;

public class DoublyLinkedList {
	Node head;
	Node tail;
	static int count;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;

			count++;

		} else {
			tail.next = node;
			node.previous = tail;
			tail = node;
			count++;
		}
	}

	public void Modify(int data, int position) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		if (position == 1) {
			head.data = data;
			return;
		}
		if (position == count) {
			tail.data = data;
			return;
		}
		Node current = head;
		int i = 1;
		while (current != null) {
			if (i == position) {
				current.data = data;
				return;
			}
			i++;
			current = current.next;

		}
	}

	public void insertAtPosition(int data, int position) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			count++;
			return;
		}
		if (position < 1 || position > count) {
			System.out.println("Position out of Bounds");
			return;
		}
		if (position == count) {
			Node current = tail;
			current = current.previous;
			current.next = node;
			node.previous = current;
			node.next = tail;
			tail.previous = node;
			count++;
			return;
		} else {
			Node current = head;
			int i = 1;
			while (current != null) {
				if (i == position-1) {
					
					node.next=current.next;
					current.next.previous=node;
					current.next=node;
					node.previous=current;
					count++;
					return;
				}
				current = current.next;
				i++;
			}
		}
	}

	public void deleteAt(int position) {
		if(head== null) {

			System.out.println("No data to delete");

			return;

			}

			if(position==1) {

			Node temp= head;

			head=head.next;

			temp.next=null;

			head.previous= null;

			count--;

			return;

			}

			if(position==count) {
				Node temp=tail; 
				tail=tail.previous;

				tail.next=null;

				temp.previous=null;

				count--;

				return;
			}

			Node current = head;
			Node PreviousNode;
			Node temp;

			int i = 1;

			while(current!=null) {

			if(position==i) {
				PreviousNode=current.previous;
				temp=current.next;
				PreviousNode = temp;
				temp.previous=PreviousNode;
				
				current.next=current.previous=null;
			}
			i++;
			current=current.next;
			}
		

			}

	public void displayForward() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " <--> ");
			current = current.next;
		}
		System.out.println();
	}

	public void displayBackward() {
		Node current = tail;
		while (current != null) {
			System.out.print(current.data + " <--> ");
			current = current.next;
		}
		System.out.println();
	}
}
