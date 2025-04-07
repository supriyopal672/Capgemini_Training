package Array_Training;

import java.util.*;

public class Arrays {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		palindrome(arrays());
	}

	public static int[] arrays() {
		System.out.println("Decide the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;

	}

	public static void palindrome(int[] arr) {
		for (int p : arr) {
			int temp = p, rev = 0, num;
			while (temp != 0) {
				num = temp % 10;
				rev = rev * 10 + num;
				temp /= 10;
			}
			if (rev == p) {
				System.out.println(p + " is Palindrome");
			} else {
				System.out.println(p + " is not an Palindrome");
			}
		}
	}
}
