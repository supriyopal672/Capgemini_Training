package SortingAlgo;

import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {
	int[] arr = { 23, 2, 56, 4, 32, 7 };
	System.out.println("Unsorted Array: " + Arrays.toString(arr));
	
	for(int i=1;i<arr.length;i++) {
		int j = i-1;
		int current =arr[i];
		while(j>=0 && arr[j]>current) {
			arr[j+1]=arr[j];
			j--;
			
		}
		arr[j+1]=current;
	}
	
	System.out.println("Sorted: "+Arrays.toString(arr));

}
}
