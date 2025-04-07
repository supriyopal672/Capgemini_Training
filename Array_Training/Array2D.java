package Array_Training;

import java.util.*;
import java.util.Arrays;

public class Array2D {
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
		for (int[] i : arr) {
			for (int p : i) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
		}
	}
//}
