package Array_Training;


public class ArrayUtitlity {
public static void main(String[] args) {
	int[] arr = new int[] {1,4,45,67,78};
	int t = 45;
	int s= 0,e = arr.length -1;
	boolean flag = false;
	int m=0;
	while(s<=e) {
		m = (s+e)/2;
		if (arr[m]==t) {
			flag = true;
			break;
		}else if(m>t) {
			e=m-1;
		
		}else if(m<t) {
			s=m+1;
		}
	}
	if (flag == true) {
		System.out.println("Found at "+m);
	}else {
		System.out.println("Not Found");
	}
	
}
}
