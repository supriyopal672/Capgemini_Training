package April14;

import java.util.*;

class Flight<T extends Passenger> {
    private String flightNumber;
    private List<T> passengers;

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(T passenger) {
        passengers.add(passenger);
    }

    public void showPassengers() {
        System.out.println("Flight " + flightNumber + " Passenger List:");
        for (T passenger : passengers) {
            System.out.println(passenger);
        }
        System.out.println();
    }
}
