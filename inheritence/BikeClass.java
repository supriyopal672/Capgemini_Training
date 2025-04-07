package inheritence;

public class BikeClass extends VehicleClass {
private boolean hasGear;
	public BikeClass(String vehicleNumber,String brand,String model,double rentalPrice,boolean isAvailable,boolean hasGear) {
		super(vehicleNumber,brand,model,rentalPrice, isAvailable);
		this.hasGear=hasGear;
	}
	
	public void displayBike() {
		displayVehicle();
		if (hasGear==true) {
			System.out.println("It has Gear");
		}else {

			System.out.println("It does not have Gear");
		}
	}
	
}
