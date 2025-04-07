package encapsulation;

import java.util.*;

public class Students {
	static Scanner sc = new Scanner(System.in);
	private int Pin=1234;
	private String Name = "Groot";
	private int Age= 18;
	private String Email= "abc@gmail.com";
	private String Gender = "Male";
	private String Stream = "CSE";
	
	
	public void setPin(String Email,int Pin) {
		if (this.Email.equals(Email)) {
			if (this.Pin==Pin) {
				System.out.println("Enter Your new Password :");
				int a = sc.nextInt();
				System.out.println("Enter Your new Password Again :");
				int b = sc.nextInt();
				if (a==b) {
					System.out.println("Password Updated Succesfully ");
					Pin = a;
					
				}else {
					System.out.println("Password is Not Mathcing");
				}
			
			}
		}else {

			System.out.println("Wrong Email");
		}
		
		
	}
//	public void getName(String Email,int Pin) {
//		return Name;
//	}
//	public void setName(String Email,int Pin) {
//		Name = name;
//	}
//	public int getAge(String Email,int Pin) {
//		return Age;
//	}
//	public void setAge(String Email,int Pin) {
//		Age = age;
//	}
//	public String getGender(String Email,int Pin) {
//		return Gender;
//	}
//	public void setGender(String Email,int Pin,String Email) {
//		Gender = gender;
//	}
//	public String getStream(String Email,int Pin) {
//		return Stream;
//	}
//	public void setStream(String Email,int Pin) {
//		Stream = stream;
//	}
//	
//	
//	public void fetch(String Email,int Pin) {
//		if (this.Email)
//	}
//	

}
