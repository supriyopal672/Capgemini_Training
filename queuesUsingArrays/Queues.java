package queuesUsingArrays;

public class Queues {
	private int[] arr;
	private int front;
	private int rear;
	private int capacity;
	private int count;

	// Constructor to initialize the queue
	public Queues(int size) {
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	// Method to add an element to the queue (enqueue)
	// enqueue

	public void enqueue(int value) {

		if (rear == capacity - 1) {

			System.out.println("Queue overflow");

			return;

		}

		arr[++rear] = value;

	}

	// dequeue

	public int dequeue() {

		if (front > rear) {

			throw new RuntimeException("queue under-flow");

		}

		int element = arr[front];

		for (int i = 0; i < rear; i++) {

			arr[i] = arr[i + 1];

		}

		rear--;

		return element;

	}

	// peek

	public int peek() {

		if (front > rear) {

			throw new RuntimeException("queue is empty");
		}
		return arr[front];
	}

	public boolean isEmpty() {

		return front > rear;

	}

	// display
	public void display() {

		if (front > rear) {
			System.out.println("queue is empty");
			return;
		}
		for (int i = front; i <= rear; i++) {
			System.out.println(arr[1]);
		}
	}

	// Method to check if the queue is full
	public boolean isFull() {
		return (count == capacity);
	}

	// Method to get the current size of the queue
	public int size() {
		return count;
	}

}