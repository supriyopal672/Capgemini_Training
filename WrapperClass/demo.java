package WrapperClass;

public class demo {
public static void main(String[] args) {

	Integer i = new Integer(0);
	Integer o = 10;
	int a= 50;
	Integer b= Integer.valueOf(a);
	int c = o.intValue();
	System.out.println(i+" "+o+" "+a+" "+" "+b+" "+c+" "+o.getClass().getSimpleName());
	
	Integer e = 10;
	Integer f = 10;
	System.out.println(e==f);
	String str = ""+(o+a);
	System.out.println(str);
}
}
