package exception;

public class ExceptionPropagation {
public static void main(String[] args) {
	
	alpha();
	
}

public static void alpha() {
	System.out.println("This is Alpha");
	Beta();
}
public static void Beta() {

	System.out.println("This is Beta");
	Gamma();
}
public static void Gamma() {
try {
	
	System.out.println(10/0);
}catch (Exception e) {
	System.out.println("This is Gamma");
}
	
}
}
