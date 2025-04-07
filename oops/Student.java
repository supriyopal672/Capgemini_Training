package oops;


public class Student {

	int ID;
	String Name;
	String CollegeName;
	
	public Student() {
		System.out.println("This is No arg Constructor");
	}
	
	public Student(int ID) {
		this.ID=ID;
	}
	
	public Student(int ID, String Name) {
		this(ID);
		this.Name= Name;
	}
	
	public Student(int ID, String Name, String CollegeName) {
		this(ID,Name);
		this.CollegeName=CollegeName;
	}
	
	public void Study() {
		System.out.println(Name+" is Studying ! ");
	}
}
