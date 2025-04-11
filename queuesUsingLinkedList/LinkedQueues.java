package queuesUsingLinkedList;

public class LinkedQueues {
    // Node class for linked list
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; // front of the queue
    private Node rear;  // rear of the queue
    private int size;   // size of the queue

    // Constructor
    public LinkedQueues() {
        front = null;
        rear = null;
        size = 0;
    }

    // Method to add an element to the queue (enqueue)
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
        System.out.println("Enqueued " + item);
    }

    // Method to remove an element from the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return Integer.MIN_VALUE;
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("Dequeued " + item);
        return item;
    }

    // Method to get the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return Integer.MIN_VALUE;
        }
        return front.data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (front == null);
    }

    // Method to get the current size of the queue
    public int size() {
        return size;
    }

    // Method to display the queue contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}