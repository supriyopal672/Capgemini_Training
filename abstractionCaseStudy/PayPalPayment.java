package abstractionCaseStudy;

public class PayPalPayment extends Payment {
	public PayPalPayment(double amount, String transactionId) {
		super(amount, transactionId);
	}

	@Override
	public void processPayment() {
		System.out.println("Processing PayPal Payment...");
		System.out.println("Transaction ID: " + getTransactionId());
		System.out.println("Original Amount: $" + getAmount());
		double finalAmount = calculateFinalAmount(3);
		double discount = getAmount() > 500 ? 0.1 * getAmount() : 0;
		double fee = (getAmount() - discount) * (3 / 100.0);
		System.out.println("Discount Applied: $" + discount);
		System.out.println("Transaction Fee: $" + fee);
		System.out.println("Final Payable Amount: $" + finalAmount);
		System.out.println("PayPal Payment Successful!\n");
	}
}
