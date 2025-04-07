package aggregation;

public class BankDriver {
	public static void main(String[] args) {
		Customer c = new Customer("Raj");
		Bank bank = new Bank("BOB", c);
		bank.display();
		bank = null;
		System.out.println(c.customerName);
	}
}
