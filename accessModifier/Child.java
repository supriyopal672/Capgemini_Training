package accessModifier;

public class Child extends Parent{

	void validate() {
		System.out.println(Parent.a);
		Parent.print();
	}
	
}
