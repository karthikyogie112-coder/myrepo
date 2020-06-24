package JavaUtil;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeaDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EmployeeA e1 = new EmployeeA("Karthik", 111508, "Ramanathan");
		EmployeeA e2 = new EmployeeA("Rajesh", 121334, "Elumalai");
		EmployeeA e3 = new EmployeeA("Ramesh", 141234, "Radha");
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		
	Iterator<EmployeeA> it = ar.iterator();
	
	while(it.hasNext()) {
		
		EmployeeA emp = it.next();
		
		System.out.println(emp.FirstName);
		System.out.println(emp.EmployeeNum);
		System.out.println(emp.LastName);

    
	}
		
		
		
	}

}
