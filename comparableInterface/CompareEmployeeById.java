package comparableInterface;

import java.util.Comparator;

public class CompareEmployeeById implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		return e1.id-e2.id;
	}


}
