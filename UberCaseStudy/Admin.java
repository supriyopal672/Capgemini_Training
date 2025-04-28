package UberCaseStudy;
import java.lang.reflect.*;
import java.util.*;

@SecurityCheck(role = "Admin")
public class Admin extends User{
	Admin(String id, String name){
		super(id,name);
		
	}
	
	@Override
	void showProfile() {
		Class<SecurityCheck> c = SecurityCheck.class;
		SecurityCheck s = c.getDeclaredAnnotation(SecurityCheck.class);
		// TODO Auto-generated method stub
		System.out.println("Admin Name:"+name+" Role:"+s.role());
	}
	
	public void removeDriver(List<Driver> drivers, String driverId) {
		Class<SecurityCheck> c = SecurityCheck.class;
        if (c.isAnnotationPresent(SecurityCheck.class)) {
        	SecurityCheck s = c.getDeclaredAnnotation(SecurityCheck.class);
            if ("Admin".equalsIgnoreCase(s.role())) {
                Iterator<Driver> iterator = drivers.iterator();
                while (iterator.hasNext()) {
                    Driver driver = iterator.next();
                    if (driver.id.equals(driverId)) {
                    	System.out.println("Driver "+driver.name+" removed successfully.");
                        iterator.remove();
                        return;
                    }
                }
                System.out.println("Driver with ID " + driverId + " not found.");
            } else {
                System.out.println("Unauthorized operation.");
            }
        }
    }
}

	
