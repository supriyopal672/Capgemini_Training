package Loops;

import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		System.out.print("Enter Your No. : ");
		int n = sc.nextInt();
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				temp = i;
				break;
			}
		}
		if(temp == 0) {
			System.out.println(n + " is a Prime No.");
		}else {
			System.out.println(n+" is not a Prime No., it is divisible by "+temp);
		}
		
		sc.close();
	}
}
