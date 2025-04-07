package inheritence;

public class Parent {
static int a = 1;
int b = 20;
Child child;


static void print() {
	System.out.println("This is a static method");
}

public void message() {
	System.out.println("This is a non static initializer");
}

static {
	System.out.println("Static initializer");
}

{
	System.out.println("Non Static initializer");
}

Parent (){
	System.out.println("Parent Constructor");
}
}
