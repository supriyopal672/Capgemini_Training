package exception;

public class StackOver {
	static StackOver c = new StackOver();

	StackOver() {

	}

	public static void main(String[] args) {
		StackOver c1 = new StackOver();
		System.out.println("Executed Succesfully");
	}
}
