package Program;

public class Child extends Parent {
	double a = 11;
	static int b = 1;
	public void print() {
		
		System.out.println(a);
		System.out.println(super.a);
	
		System.out.println(b);
		System.out.println(Parent.b);
	}
}
