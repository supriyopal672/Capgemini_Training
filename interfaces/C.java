package interfaces;

public interface C extends A,B {
default void check() {
	System.out.println(A.a);
	A.message();
	B.message();
	print();
}
	
	
	@Override
	default void print() {
		// TODO Auto-generated method stub
		A.super.print();
	}

	
}
