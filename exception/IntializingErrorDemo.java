package exception;

public class IntializingErrorDemo {
	static String s1= null;
	static String s2= s1.toUpperCase();
	public static void main(String[] args) {
		System.out.println(s1);
		System.out.println(s2);
		
		
		
	}
}
