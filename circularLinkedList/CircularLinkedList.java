package circularLinkedList;


public class CircularLinkedList {
	Node head;
	Node tail;
	static int count=0;
	
	public void insert(int data) {
		Node node = new Node(data);

        if (head == null) {
            head = node;
            node.next = head;
            count++;
        }else {
        	Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
        	 Node last = temp;
             last.next = node;
             node.next = head;
             count++;
        }
       
	}
	
	public void Modify(int data,int position) {
		
		Node current = head;
        int currentPosition = 1;
        
        do {
        	if (currentPosition == position) {
                current.data = data;
                return;
            }
        	current = current.next;
        	currentPosition++;
			
		} while (current != head);
	}
	
	public void deleteAt(int position) {
		Node current = head;
        int currentPosition = 1;
        if(position==1) {
        	current=current.next;
        	while (current.next != head) {
                current = current.next;
            }
        	head=head.next;
        	current.next=head;
        	count--;
        	return;
        }
        do {
        	if (currentPosition == position-1) {
                current.next = current.next.next;
                count--;
                return;
            }
        	current = current.next;
        	currentPosition++;
			
		} while (current != head);
	}
	
	public void insertAtPosition(int data,int position) {
		Node node = new Node(data);
		Node current = head;
        int currentPosition = 0;
        
        
        do {
            if (currentPosition == position - 1) {
                node.next = current.next;
                current.next = node;
                count++;
                return;
            }
            current = current.next;
            currentPosition++;
        } while (current != head);
	}
	
	public void display() {
        if (head == null) {
            System.out.println("List is empty");
        }else {
        	Node temp = head;
        	System.out.print(temp.data + " -> ");
            temp = temp.next;
        	while (temp != head) {
        		System.out.print(temp.data + " -> ");
                temp = temp.next;
        	}
        	System.out.println();
        }
    }
}
