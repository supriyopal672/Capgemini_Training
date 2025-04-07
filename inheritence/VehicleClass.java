package inheritence;

public class VehicleClass {
private String vehicleNumber;
private String brand;
private String model;
private double rentalPrice;
private boolean isAvailable;

public VehicleClass(String vehicleNumber,String brand,String model,double rentalPrice,boolean isAvailable){
	this.vehicleNumber=vehicleNumber;
	this.brand=brand;
	this.model=model;
	this.rentalPrice=rentalPrice;
	this.isAvailable=isAvailable;
}

public void displayVehicle() {
	if (isAvailable==true) {
		System.out.println(vehicleNumber+ " "+ brand +" " +model+" "+rentalPrice+"\nThe Vehicle is Available");

	}else {
		System.out.println(vehicleNumber+ " "+ brand +" " +model+" "+rentalPrice+"\nThe Vehicle is Not Available");
	}
	}

}
