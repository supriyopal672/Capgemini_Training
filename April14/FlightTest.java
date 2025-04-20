package April14;

public class FlightTest {
    public static void main(String[] args) {
        // Economy Flight
        Flight<Passenger> economyFlight = new Flight<>("A123");
        Passenger john = new Passenger("John");
        economyFlight.addPassenger(john);

        // VIP Flight
        Flight<VipPassenger> vipFlight = new Flight<>("B456");
        VipPassenger alice = new VipPassenger("Alice");
        vipFlight.addPassenger(alice);

        // Display Passenger Lists
        economyFlight.showPassengers();
        vipFlight.showPassengers();
    }
}