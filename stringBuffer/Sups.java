package stringBuffer;

public class Sups {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		s.append(true);
		s.append("heheheheheh");
		System.out.println(s);
		
		
		char[] arr= new char[] {
				'A','B','C','D','E'
		};
		StringBuffer s2 = new StringBuffer("hello World ");
		s2.insert(4, arr, 1,3);
		System.out.println(s2);
		System.out.println(s2.reverse());
		
		
		String s3= s2.toString();
		System.out.println(s3);
	}
}
