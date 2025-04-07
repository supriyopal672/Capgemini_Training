package inheritence;

public class CarClass extends VehicleClass{
private int numberOfDoor;
public CarClass(String vehicleNumber,String brand,String model,double rentalPrice,boolean isAvailable,int numberOfDoor) {
	super(vehicleNumber,brand,model,rentalPrice, isAvailable);
	this.numberOfDoor=numberOfDoor;
}
	
	public void displayCar() {
		displayVehicle();
		System.out.println("Number of Doors: "+numberOfDoor);
	}
}
