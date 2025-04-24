package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
public static void main(String[] args) throws IOException{
	String path="C:\\Users\\supri\\Desktop\\FileHandlingKolkata\\test";
	String renamePath ="C:\\Users\\supri\\Desktop\\FileHandlingKolkata\\Hello\\Darknight.txt";
	File file = new File(path);
	File renameFile = new File(renamePath);
	
//	file.mkdir();
//	file.mkdirs();
//	file.renameTo(renameFile);
//	renameFile.delete();
	
//	renameFile.createNewFile();
//	String[] arr = renameFile.list();
//	
//	for(String s : arr) {
//		System.out.println(s);
//	}
	
	System.out.println(renameFile.canRead());
	System.out.println(renameFile.canWrite());
	System.out.println();
	
	
}
}
