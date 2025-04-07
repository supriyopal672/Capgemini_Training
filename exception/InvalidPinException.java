package exception;

public class InvalidPinException extends RuntimeException {

	private String message;
	
	public InvalidPinException(String messgae) {
		this.message=messgae;
	}
	public String getMessage() {
		return message;
	}
}
