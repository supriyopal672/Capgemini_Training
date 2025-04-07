package SortingAlgo;

import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 23, 2, 56, 4, 32, 7 };
		System.out.println("Unsorted Array: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];

					arr[j] = arr[j + 1];

					arr[j + 1] = temp;

				}

			}

			System.out.println(Arrays.toString(arr));

		}

		System.out.println("Sorted Array: " + Arrays.toString(arr));

	}
}
