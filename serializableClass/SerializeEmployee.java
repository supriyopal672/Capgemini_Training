package serializableClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
public static void main(String[] args) throws IOException {
	String path = "C:\\Users\\supri\\Desktop\\FileHandlingKolkata\\Hello\\serialize.txt";
	File file = new File(path);
	
	file.createNewFile();
	Employee emp = new Employee(1, "Supriyo", 30000);
	
	FileOutputStream fos = new FileOutputStream(file);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	
	oos.writeObject(emp);
	oos.flush();
	
	oos.close();
	fos.close();
}
}
