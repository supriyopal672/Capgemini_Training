package exception;

public class CustomException {
private int pin =1234;

public void login(int pin) throws InvalidPinException {
	if (this.pin==pin) {
		System.out.println("Login Succesful");
	}else {
		throw new InvalidPinException("The user pin is invalid");
	}
}
public static void main(String[] args) {
	System.out.println("Login Page Entered");
	CustomException user = new CustomException();
	try {
		user.login(1235);
	} catch (InvalidPinException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Login page Exit");
}
}
