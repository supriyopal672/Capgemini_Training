package hashMapImplementations;

public class HashMapImplementation {
	Entry[] buckets = new Entry[16];
	int bucketSize = buckets.length;

	public int getBucketIndex(int key) {
		return Math.abs(Integer.hashCode(key)) % bucketSize;
	}

	public void put(int key, int value) {
		Entry node = new Entry(key, value);
		int index = getBucketIndex(key);
		System.out.println("The Entry is added at index: " + index);
		if (buckets[index] == null) {
			buckets[index] = node;

		} else {
			Entry head = buckets[index];

			while (head != null) {
				if (buckets[index].key == key) {
					buckets[index].value = value;
				} else {
					head = head.next;
				}
			}
			node.next = buckets[index];
			buckets[index] = node;

		}

	}

	public int getValue(int key) {
		int index = getBucketIndex(key);
		if (buckets[index] == null) {
			throw new RuntimeException("The Bucket at index " + index + " is Empty.");
		} else {
			Entry head = buckets[index];

			while (head != null) {
				if (buckets[index].key == key) {
					return head.value;
				} else {
					head = head.next;
				}

			}
			throw new RuntimeException("The Key Does Not Exists.");
		}
	}

	public void DeleteByKey(int key) {
		int index = getBucketIndex(key);
		Entry current = buckets[index];
		Entry previous = null;
		if (buckets[index] == null) {
			throw new RuntimeException("The Bucket at index " + index + " is Empty.");
		} else if (current.next == null) {
			buckets[index] = null;
			current = null;
			previous = null;
		} else if (current.key == key) {
			buckets[index] = current.next;
			current = current.next;
			previous = current;
//			throw new RuntimeException( "The Key Does Not Exists.");
		} else {
			while (current != null) {
				previous = current;
				current = current.next;

				if (previous.next.key == key) {
					previous.next = current.next;
	
					break;

				}

			}
		}
	}

	public void display() {
		System.out.println();
		for (Entry e : buckets) {
			if (e == null) {
				continue;
			} else if (e.next == null) {
				System.out.println("Key: "+e.key+" Value: "+e.value);
			} else {
				Entry current = e;
				while (current != null) {
					System.out.print("Key: "+current.key + " Value: ");
					System.out.print(current.value + "-->");
					current = current.next;
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		HashMapImplementation map = new HashMapImplementation();
		map.put(10, 1);
		map.put(20, 20);
		map.put(40, 86);
		map.put(300, 776);
		map.put(69, 2786);
		map.display();
		map.DeleteByKey(20);
		map.display();
		map.DeleteByKey(40);
		map.display();
	}
}
