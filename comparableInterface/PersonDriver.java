package comparableInterface;

public class PersonDriver {
public static void main(String[] args) {
	Person p1= new Person("Supriyo", 23);
	Person p2= new Person("Supriyo", 24);
	
	
	if(p1.compareTo(p2)>0) {
		System.out.println("Then p1 is Greater");
	}else if(p1.compareTo(p2)<0){
		System.out.println("Then p2 is Greater");
		
	}else {
		System.out.println("Then p1 is equal to p2");
		
	}
}
}
