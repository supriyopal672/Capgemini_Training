package generics;

public class Employee<T extends Number>{
	T data1;
	T data2;
	
	Employee(T data1,T data2){
		this.data1=data1;
		this.data2=data2;
	}
	
	public String toString() {
//		System.out.println(data1+data2);
		return data1+"   "+data2;
	}
	
	public static <T> void print(T[] arr) {
		for(T i : arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Employee<Integer> e1 = new Employee<Integer>(10,20);
		System.out.println(e1.data1+e1.data2);
		System.out.println(e1);
		System.out.println(e1.data1 instanceof Integer);
		
		Integer[] arr1 = {1,2,3,4,5};
		
		String[] arr2 = {"hello","world","demo"};
		
		print(arr1);
		
	}
	
	
}
