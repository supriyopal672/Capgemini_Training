package UberCaseStudy;

public class Ride {
private Customer customer;
private Driver driver;
private String status;

Ride(Customer customer, Driver driver) {
	this.customer = customer;
	this.driver=driver;
	this.status="Booked";
}

public void completeRide() {
	this.status="Completed";
	driver.setAvailable(true);
}

public String getStatus() {
	return status;
}

public String rideDetails() {
	return "Customer Name:"+customer.name+" Driver Name:"+driver.name+" Current Status:"+status;
}
}
