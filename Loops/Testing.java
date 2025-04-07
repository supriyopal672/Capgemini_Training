package Loops;

import java.util.*;

public class Testing {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
		
		System.out.println(Arrays.deepToString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int p : arr[i]) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
		}
	
}
