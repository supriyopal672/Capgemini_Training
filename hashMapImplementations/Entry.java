package hashMapImplementations;

public class Entry {
	Entry next;
	int value;
	int key;

	Entry(int key, int value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
}
