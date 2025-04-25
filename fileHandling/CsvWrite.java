package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWrite {
public static void main(String[] args) throws Exception{
	String path ="C:\\Users\\supri\\Desktop\\FileHandlingKolkata\\Hello\\studentData.csv";
	File file = new File(path);
	file.createNewFile();
	
	try(FileWriter writer = new FileWriter(file)){
		writer.append("id,name,age\n");
		writer.append("2,Supriyo,22\n");
		writer.append("3,Sam,22\n");
		writer.append("4,Subh,22\n");
		
		System.out.println("CSV file writen!");
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
