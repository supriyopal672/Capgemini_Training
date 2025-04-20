package March29;

public class VehicleTest {
    public static void main(String[] args) {
    	AbstractVehicle car = new Car("Honda Civic");
    	AbstractVehicle bike = new Bike("Yamaha");
    	AbstractVehicle truck = new Truck("Volvo Truck");

        // Car
        car.start();
        car.accelerate();
        car.brake();
        ((AbstractVehicle) car).displayDetails();
        car.stop();

        System.out.println();

        // Bike
        bike.start();
        bike.accelerate();
        bike.brake();
        ((AbstractVehicle) bike).displayDetails();
        bike.stop();

        System.out.println();

        // Truck
        truck.start();
        truck.accelerate();
        truck.brake();
        ((AbstractVehicle) truck).displayDetails();
        truck.stop();
    }
}
