package Loops;

import java.util.*;

public class WhileLoops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your No. : ");
		int n = sc.nextInt();
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		System.out.println("The No. of Digits : " + count);
		sc.close();
	}
}
