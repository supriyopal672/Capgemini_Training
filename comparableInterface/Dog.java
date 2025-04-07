package comparableInterface;

import java.util.Arrays;

public class Dog implements Comparable{
	String name;
	int age;
	String breed;

	public Dog(String name, int age,String breed) {
		this.name = name;
		this.age = age;
		this.breed=breed;
	}

	public static void main(String[] args) {
		Dog[] d = new Dog[3];
		d[0] = new Dog("TOM", 5,"Golden Retriver");
		d[1] = new Dog("TOMMY", 10,"Spinx");
		d[2] = new Dog("TOM", 5,"Husky");

		compareBreed c = new compareBreed();
		Arrays.sort(d,c);
		for (Dog p : d) {
			System.out.println(p.name +" "+p.age+" "+p.breed);
		}
	}

	@Override
	public int compareTo(Object o) {
		Dog dog = (Dog) o;
		if ((this.name).compareTo(dog.name) != 0) {
			return (this.name).compareTo(dog.name);
		} else {
			if ((this.age - dog.age) != 0) {
				return (this.age - dog.age);
			} else {
				return 0;
			}
		}
	}

	
}
