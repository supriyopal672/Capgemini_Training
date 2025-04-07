package inheritence;

public class DriverClass {
public static void main(String[] args) {
	CarClass c = new CarClass("101","Audi","A4",12000,true,4);
	BikeClass b = new BikeClass("102","Kawasaki","Ninja",6000,false,true);

	b.displayBike();
	c.displayCar();

}
}
