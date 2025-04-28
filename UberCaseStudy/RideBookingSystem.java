package UberCaseStudy;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class RideBookingSystem {
    List<Customer> customers = new ArrayList<>();
    List<Driver> drivers = new ArrayList<>();
    List<Ride> rides = new ArrayList<>();

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public Ride bookRide(Customer customer) {
        Driver availableDriver = drivers.stream().filter(Driver::isAvailable).findFirst().orElseThrow(() -> new InvalidRideException("No available drivers at the moment !!"));
        availableDriver.setAvailable(false);
        Ride ride = new Ride(customer, availableDriver);
        rides.add(ride);
        return ride;
    }

    public void saveRides() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("rides.txt"))) {
            for (Ride ride : rides) {
                bw.write(ride.rideDetails());
                bw.newLine();
            }
            System.out.println("Rides saved to rides.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadDriversFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("drivers.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    registerDriver(new Driver(parts[0], parts[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("No drivers file found. Skipping load.");
        }
    }

    public void saveDriversToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("drivers.txt"))) {
            for (Driver driver : drivers) {
                bw.write(driver.id + "," + driver.name);
                bw.newLine();
            }
            System.out.println("Drivers saved to drivers.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showAllDrivers() {
        for (Driver driver : drivers) {
            driver.showProfile();
        }
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }
}

