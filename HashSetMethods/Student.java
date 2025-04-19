package HashSetMethods;

import java.util.Objects;

public class Student {
	String name;
	int id;

	Student(int id, String name) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return name + " " + id ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}
