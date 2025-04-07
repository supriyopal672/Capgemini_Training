package one_to_many;

public class Bank {
String bankName;
Customer[] cus;
static int index=0;

public Bank(int size,String bankName) {
	this.cus=new Customer[size];
	this.bankName=bankName;
}
public void addCustomer(Customer cust) {
	if (index<this.cus.length) {
		cus[index++]=cust;
	}else {
		System.out.println("Cannot Add Customer size is full...");
	}
}
public void displayCustomer() {
	for(int i=0;i<index;i++) {
		System.out.println(cus[i].customerName);
	}
}
}
