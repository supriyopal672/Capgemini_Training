package March29;

class Bike extends AbstractVehicle {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(name + " started.");
    }

    @Override
    public void stop() {
        System.out.println(name + " stopped.");
        speed = 0;
    }

    @Override
    public void accelerate() {
        speed += 15;
        System.out.println(name + " accelerating: " + speed + " km/h");
    }

    @Override
    public void brake() {
        speed -= 7;
        System.out.println(name + " braking: " + speed + " km/h");
    }

    @Override
    public int getCurrentSpeed() {
        return speed;
    }
}

