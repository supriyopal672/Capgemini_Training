package QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		
		p.add("Sam");
		p.add("Sup");
		p.add("Tatha");
		p.add("Subh");
		p.add("Soum");
		
		System.out.println(p);
	}
}
