package caseStudy;

import java.util.Scanner;

public class UniDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Size of Array:");
		int size = sc.nextInt();
		
		University uni = new University(size);
		boolean flag= true;
		
		while(flag) {
			System.out.println(" Enter 1 to add Person \n Enter 2 to display Persons \n Enter 3 to exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter Person Name");
				String name = sc.nextLine();
				int age = sc.nextInt();
				sc.nextLine();
				Person p = new Person(name,age);
				uni.addPerson(p);
				System.out.println("Is he professor or student: :");
				String x = sc.next();
				if(x=="professor") {
					System.out.println("Specify Specialization: ");
					sc.nextLine();
					String str= sc.nextLine();
					Person pro = new Professor(name, age, str);
					pro.displayInfo();
				}else {

					int std= sc.nextInt();
					Person stu = new Student(name, age, std);
					stu.displayInfo();
				}
				break;
			case 2 :
				uni.showPeople();
				break;
			case 3 :
				flag=false;
				break;
			}
		
		
		}

		sc.close();
	}
}
