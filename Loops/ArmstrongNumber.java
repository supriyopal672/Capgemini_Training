package Loops;

import java.util.*;

public class ArmstrongNumber {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your Number : ");
	int n = sc.nextInt();
	int sum = 0;
	for(int i = n; i>0; i /= 10 ) {
		int temp = i%10;
		sum+= temp*temp*temp;
		
	}
	if(sum == n) {
		System.out.println("Is a armstrong No.");
	}else {
		System.out.println("Not a armstrong No."+sum);
	}
}
}
