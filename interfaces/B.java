package interfaces;

public interface B {
double a = 10;

static void message() {
	System.out.println("B ");
}
default void print() {
	System.out.println("Hey");
}
}
