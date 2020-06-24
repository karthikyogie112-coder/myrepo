package JavaUtil;

import java.util.ArrayList;
import java.util.Iterator;

public class Patient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PatientHistory p1 =new PatientHistory("Karthik", 23, "A");
		PatientHistory p2 = new PatientHistory("James", 25, "AB");
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(p1);
		ar.add(p2);
		
		
Iterator<PatientHistory> it = ar.iterator();

while(it.hasNext()) {
	
	PatientHistory Pat = it.next();
	
	System.out.println(Pat.Name);
	System.out.println(Pat.age);
	System.out.println(Pat.BloodGroup);
	
	ArrayList ar1 = new ArrayList();
	
	ar1.add(111);
	ar1.add("Hello Selenium");
	
	ArrayList ar2 = new ArrayList();
	
	ar2.add("Hello Selenium");
	ar2.add(123);
	
	
	ar1.addAll(ar2);
	
for(int i =0; i<ar1.size();i++)	{
	
	System.out.println(ar1.get(i));
	
	System.out.println(".................");
	
	
	ar1.removeAll(ar2);
	
	for(int j=0; j<ar1.size(); j++) {
		
		System.out.println(ar1.get(j));
	}
}
}
		
		
		

	}

}
