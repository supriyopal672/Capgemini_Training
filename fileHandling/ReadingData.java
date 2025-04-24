package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingData {
	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\supri\\Desktop\\FileHandlingKolkata\\Hello\\Darknight.txt";

		File file = new File(path);

		String message = "Hello World!\n";
		FileWriter writer = new FileWriter(file,true);
//		writer.write(message);
		BufferedWriter buffer=new BufferedWriter(writer);
		for(int i=0;i<message.length();i++) {
			buffer.write(message.charAt(i));
		}
		buffer.flush();
		
		buffer.close();
		writer.close();
		
		
//		FileInputStream fis = new FileInputStream(file);
//		int x;
//		while ((x = fis.read()) != -1) {
//			System.out.print((char) x);
//		}
//		fis.close();
		
		
	}
}
