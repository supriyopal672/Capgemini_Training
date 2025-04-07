package oops;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student(101,"Groot","UEM");
		System.out.println(s1.CollegeName + " " + s1.ID + " "  + " " +s1.Name);
		
		System.out.println("-----------------------------------------------------------");
		
		Student s2 = new Student(102,"Rocket");
		System.out.println(s2.CollegeName + " " + s2.ID + " " + " " +s2.Name);
		
		System.out.println("-----------------------------------------------------------");
		
		Student s3 = new Student();
		System.out.println(s3.CollegeName + " " + s3.ID + " " + " " +s3.Name);
		
		System.out.println("-----------------------------------------------------------");
		
		Student s4 = new Student(104);
		System.out.println(s4.CollegeName + " " + s4.ID + " " + " " +s4.Name);
		
	}
}
