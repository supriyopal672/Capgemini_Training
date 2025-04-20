package April14;

class VipPassenger extends Passenger {
    public VipPassenger(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "VIP Passenger: " + getName(); 
    }
}
