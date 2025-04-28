package UberCaseStudy;

public class Customer extends User{

	
	
	Customer(String id, String name) {
		super(id, name);
		}

	@Override
	void showProfile() {
		// TODO Auto-generated method stub
		System.out.println("Customer Name:"+name);
	}

}
