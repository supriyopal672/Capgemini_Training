package abstractionCaseStudy;

public class PaymentDriver {
	public static void main(String[] args) {
        Payment creditPayment = new CreditCardPayment(600, "TXN12345");
        creditPayment.processPayment();

        Payment paypalPayment = new PayPalPayment(300, "TXN67890");
        paypalPayment.processPayment();
    }
}
