package UberCaseStudy;

public class Driver extends User {
	private boolean available;
	
	Driver(String id, String name){
		super(id,name);
		available=true;
	}
	
	public boolean isAvailable() {
		if(available==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public void setAvailable(boolean available) {
		this.available=available;
	}

	@Override
	void showProfile() {
		// TODO Auto-generated method stub
		System.out.println("Driver Name:"+name+" Available:"+available);
	}

}
