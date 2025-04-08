package singleLinkedList;

public class SingleLinkedList {
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
			tail = node;
			count++;
		}
	}

	public void Modify(int newData, int position) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		// Traverse to the specified position
		Node current = head;
		int currentPosition = 1;

		while (current != null && currentPosition != position) {
			current = current.next;
			++currentPosition;
		}

		// Check if position is valid
		if (current == null) {
			System.out.println("Position " + position + " is out of bounds");
		} else {
			current.data = newData;
			System.out.println("Updated position " + position + " with new data: " + newData);
		}
	}

	public void insertAtPosition(int data, int position) {
		// Create the new node
		Node newNode = new Node(data);

		// Special case: inserting at head (position 1)
		if (position == 1) {
			newNode.next = head;
			head = newNode;
			count++;
		} else {
			// Traverse to the node before the insertion point
			Node current = head;
			for (int i = 1; i < position - 1 && current != null; i++) {
				current = current.next;
			}

			// Check if position is invalid (beyond end of list)
			if (current == null) {
				System.out.println("Position out of bounds");
				return;
			}

			// Insert the new node
			newNode.next = current.next;
			current.next = newNode;
			count++;

		}

	}

//	public void delete(int position) {
//		Node current = head;
//		Node temp = head;
//		int i = 1;
//		
//		if(position<1 || position>count) {
//			System.out.println("Invalid Position");
//			return;
//		}
//		if (position == 1) {
//			head=head.next;
//			temp.next=null;
//			return;
//		}
//		
//		if (current == null) {
//			System.out.println("No data to Display");
//		}
//		while (i != position-1) {
//
//			System.out.print(current.data + " ");
//			current = current.next;
//			temp = current;
//			i++;
//
//		}
//		current = current.next;
//		
//		temp.next=current.next;
//		current.next=null;;
//		System.out.println();
//	}
	
	public void deleteAt(int position) {
	    // Check for empty list
	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }
	    
	    // Validate position
	    if (position < 1) {
	        System.out.println("Invalid position. Position must be ≥ 1");
	        return;
	    }
	    
	    // Special case: deleting the first node (position 1)
	    if (position == 1) {
	        head = head.next;
	        return;
	    }
	    
	    // Traverse to the node before the one to delete
	    Node current = head;
	    for (int i = 1; i < position - 1 && current.next != null; i++) {
	        current = current.next;
	    }
	    
	    // Check if position is invalid
	    if (current.next == null) {
	        System.out.println("Position " + position + " is out of bounds");
	        return;
	    }
	    
	    // Delete the node
	    current.next = current.next.next;
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
