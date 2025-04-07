package comparableInterface;

public class Person implements Comparable {
	String name;
	int age;

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		if (((this.name).compareTo(p.name)) == 0) {
			if (this.age > p.age) {
				return 1;
			} else if (this.age < p.age) {
				return -1;
			} else {
				return 0;
			}
		} else {
			return ((this.name).compareTo(p.name));
		}

	}
}
