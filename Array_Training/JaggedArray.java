package Array_Training;

import java.util.Scanner;

public class JaggedArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Program.print2D(createJagged());
	}

	public static int[][] createJagged() {
		System.out.println("Enter No. of Rows: ");
		int r = sc.nextInt();
		int[][] arr = new int[r][];
		for (int i = 0; i < r; i++) {
			System.out.println("Specify the Size of Column in row No. " + (i+1));
			int c = sc.nextInt();
			arr[i] = new int[c];
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter Your No. ");
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
}
