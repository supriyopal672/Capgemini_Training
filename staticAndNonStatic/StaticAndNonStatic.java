package staticAndNonStatic;

public class StaticAndNonStatic {
	static int id=10;
	String name ="raj";
	
	public StaticAndNonStatic() {
		System.out.println(id);
		System.out.println(name);
	}
	
	
public static void main(String[] args) {
	System.out.println(id);
	
	StaticAndNonStatic d = new StaticAndNonStatic();
	System.out.println();
}
}
