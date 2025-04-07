package Loops;

import java.util.*;

public class Loops_Training {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter Your No. : ");
		int n = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <=n; i++) {
			fact = fact * i;
			
		}
		System.out.println("Factorial : "+fact);
		sc.close();
	}
}
