package methodOverriding;

public class AnimalDriver {
public static void main(String[] args) {
	Animal dogAnimal= new Dog("Siberian Husky");
	dogAnimal.sound();
	String dogBreed =((Dog)dogAnimal).breed;//cannot
	System.out.println(dogBreed);
	dogAnimal.sound();
	System.out.println("---------------------");
	
}

}
