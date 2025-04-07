package ScannerClass;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter Your Choice : \n 1 for Addition \n 2 for Subtraction \n 3 for Multiplication \n 4 for Division");
		int c = sc.nextInt();
		System.out.println("Enter First No. :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second No. :");
		int num2 = sc.nextInt();
		switch (c) {
		case 1:

			System.out.println(num1 + num2);
			break;
		case 2:

			System.out.println(num1 - num2);
			break;
		case 3:

			System.out.println(num1 * num2);
			break;
		case 4:

			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Invalid Choice!");
			break;
		}
		sc.close();
	}

}
