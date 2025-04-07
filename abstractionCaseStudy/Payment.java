package abstractionCaseStudy;

public abstract class Payment {
	private double amount;
	private String transactionId;

	public Payment(double amount, String transactionId) {
		this.amount = amount;
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public double calculateFinalAmount(double feePercentage) {
		double discount = amount > 500 ? 0.1 * amount : 0;
		double fee = (amount - discount) * (feePercentage / 100);
		return (amount - discount) + fee;
	}

	public abstract void processPayment();
}
