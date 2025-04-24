package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingData {
public static void main(String[] args) throws IOException {
	String path ="C:\\Users\\supri\\Desktop\\FileHandlingKolkata\\Hello\\Darknight.txt";
	
	File file = new File(path);
	
	FileOutputStream fos = new FileOutputStream(file,true);
	String message = "Go to Hell\n";
	
//	byte[] arr = message.getBytes();
//	
//	fos.write(arr);
	
	for(int i=0;i<message.length();i++) {
		fos.write(message.charAt(i));
	}
	
	FileInputStream fis = new FileInputStream(file);
	int x;
	while((x=fis.read())!=-1) {
		System.out.print((char)x);
	}
	
	
}
}
