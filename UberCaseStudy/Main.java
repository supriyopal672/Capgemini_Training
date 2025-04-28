package UberCaseStudy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        RideBookingSystem system = new RideBookingSystem();
        system.loadDriversFromFile();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Uber Rental Management System ---");
            System.out.println("1. Register a Customer");
            System.out.println("2. Register a Driver");
            System.out.println("3. Book a Ride");
            System.out.println("4. Show All Drivers");
            System.out.println("5. Save Data and Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Customer ID: ");
                        String custId = scanner.nextLine();
                        System.out.print("Enter Customer Name: ");
                        String custName = scanner.nextLine();
                        system.registerCustomer(new Customer(custId, custName));
                        System.out.println("Customer registered successfully.");
                        break;
                    case 2:
                        System.out.print("Enter Driver ID: ");
                        String driverId = scanner.nextLine();
                        System.out.print("Enter Driver Name: ");
                        String driverName = scanner.nextLine();
                        system.registerDriver(new Driver(driverId, driverName));
                        System.out.println("Driver registered successfully.");
                        break;
                    case 3:
                        System.out.print("Enter Customer ID for booking: ");
                        String customerId = scanner.nextLine();
                        Optional<Customer> customerOpt = system.getCustomers().stream()
                            .filter(c -> c.id.equals(customerId))
                            .findFirst();
                        if (customerOpt.isPresent()) {
                            Ride ride = system.bookRide(customerOpt.get());
                            System.out.println("Ride booked successfully!");
                            System.out.println(ride.rideDetails());
                        } else {
                            System.out.println("Invalid Customer ID.");
                        }
                        break;
                    case 4:
                        system.showAllDrivers();
                        break;
                    case 5:
                        system.saveRides();
                        system.saveDriversToFile();
                        running = false;
                        System.out.println("Data saved. Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (InvalidRideException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}

