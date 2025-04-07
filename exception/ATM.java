package exception;

public class ATM {
private  int pin=2612;
private double AccBalance=5000;

public void withdraw(int pin,double withdrawAmount) {
	if (this.pin != pin) {
		throw new InvalidPinException("The ATM PIN is invalid.");
	}else if( withdrawAmount>AccBalance) {
		throw new InSuffiecientBalanceException("You Have Insuffiecient Account Balance");
	}else {
		AccBalance -= withdrawAmount;
		System.out.println("The Amount Withdrawn: "+withdrawAmount+"\nThe availalable Balance: "+AccBalance);
	}
}

public static void main(String[] args) {
	ATM a = new ATM();
	a.withdraw(2612, 2000);
}
}
