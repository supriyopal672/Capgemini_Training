package exception;

public class InSuffiecientBalanceException extends RuntimeException{
private String message;

	public InSuffiecientBalanceException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
