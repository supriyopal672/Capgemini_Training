package covarientReturnType;

public class Bike extends Vehicle{
public Vehicle getObject() {
	return new Bike(); //Bike() is getting UpCasted implicitly.
}

}
