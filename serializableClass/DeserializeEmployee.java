package serializableClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
public static void main(String[] args) throws ClassNotFoundException, IOException {
	String path = "C:\\Users\\supri\\Desktop\\FileHandlingKolkata\\Hello\\serialize.txt";
	File file = new File(path);
	
	FileInputStream fis = new FileInputStream(file);
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	Employee emp = (Employee)ois.readObject();
	System.out.println(emp);
}
}
