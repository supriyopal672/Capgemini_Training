package Array_Training;

import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr1 = arrDEC();
		print2D(arr1);
		System.out.println();
		System.out.println("The Transpose is : ");
		print2D(transpose(arr1));
	}

	public static int[][] arrDEC() {
		System.out.println("Enter the Size of array(r X c): ");
		int r = sc.nextInt(), c = sc.nextInt();
		int[][] arr = new int[r][c];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;

	}

	public static void maximum(int[][] arr) {
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (temp < arr[i][j]) {
					temp = arr[i][j];
				}
			}
		}
		System.out.println(temp);
	}

	public static int[][] transpose(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;

		int[][] res = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				res[j][i] = arr[i][j];
			}
		}
		return res;
	}

	public static void print2D(int[][] arr) {
		for (int[] i : arr) {
			for (int p : i) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
	}

}
