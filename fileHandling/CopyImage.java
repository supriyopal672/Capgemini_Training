package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
public static void main(String[] args) throws IOException {
	String DestinationPath ="C:\\Users\\supri\\Desktop\\FileHandlingKolkata\\Hello\\image.jpg";
	File destinationfile = new File(DestinationPath);
	destinationfile.createNewFile();
	
	//Creating file object of source image
	String sourcePath ="C:\\Users\\supri\\Downloads\\Arcane.jpg";
	File sourceFile = new File(sourcePath);
	
	//reading data from source
	FileInputStream fis = new FileInputStream(sourceFile);
	byte [] arr = new byte[(int)sourceFile.length()];
	fis.read(arr);//reads data from source file and stores in byte array
 	
	
//Writing data
	FileOutputStream fos = new FileOutputStream(destinationfile);
	fos.write(arr);
	
	fos.close();
	fis.close();
}
}
