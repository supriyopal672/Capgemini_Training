package Array_Training;

public class Rotate {
public static void main(String[] args) {
	int [] [] arr = Program.arrDEC();
	Program.print2D(rotates(arr));
	
	
}
public static int[][] rotates(int[][] arr){
	int n = arr.length;

    int[][] res = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            res[j][n - i - 1] = arr[i][j];
        }
    }

    return res;
}
}
