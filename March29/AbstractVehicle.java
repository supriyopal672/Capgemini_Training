package March29;

abstract class AbstractVehicle implements Vehicle {
	protected String name;
	protected int speed;

	public AbstractVehicle(String name) {
		this.name = name;
		this.speed = 0;
	}

	public void displayDetails() {
		System.out.println("Vehicle Name: " + name + " Current Speed: " + speed + " km/h");
	}
}
