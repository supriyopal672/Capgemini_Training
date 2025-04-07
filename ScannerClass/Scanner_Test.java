package ScannerClass;

import java.util.Scanner;


public class Scanner_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your No. ");
		int n = sc.nextInt();     
		int m = sc.nextInt();
		int o = sc.nextInt();
		System.out.println(n);
		System.out.println(m);
		System.out.println(o);
		System.out.println(sc.nextLine());
		sc.close();
	}
	
}
