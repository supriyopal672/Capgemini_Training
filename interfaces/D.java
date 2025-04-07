package interfaces;
import java.io.Serializable;
public class D implements A,B,Serializable{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		B.super.print();
	}

}
