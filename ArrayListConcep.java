package JavaUtil;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcep {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub

		
ArrayList ar = new ArrayList();


ar.add(12);
ar.add("Stench");
ar.add('e');
ar.add(11.22);
ar.add(false);

for(int i =0;i<ar.size();i++) {
	
	System.out.println(ar.get(i));
	
	
	
	Employee e1= new Employee("Naveen", 27, "QA");
	Employee e2= new Employee("Suresh", 27, "Admin");

	Employee e3= new Employee("Karthik", 33, "tech team");

	
	ArrayList<Employee> ar1 = new ArrayList<Employee>();
	
	ar1.add(e1);
	ar1.add(e2);
	ar1.add(e3);
	
	Iterator<Employee> it = ar1.iterator();
	
	while(it.hasNext()) {
		Employee Em = it.next();
		
		System.out.println(Em.Name);
		System.out.println(Em.age);
		System.out.println(Em.Dept);
		
		
		System.out.println("..................");
		
		ArrayList<String> ar2 = new ArrayList();
	
		
		ar2.add("Java Program");
		ar2.add("Selenium");
		
		ArrayList ar3 = new ArrayList();

		ar3.add("Java Program");
		ar3.add("Learning Skills");
		
		
		ar2.addAll(ar3);
		
		for(int j =0; j<ar2.size();j++) {
			
			System.out.println(ar2.get(j));
			
			System.out.println("...........");
			
			
	ar2.removeAll(ar3);
	
	for(int k =0; k<ar2.size();k++) {
		
		System.out.println(ar2.get(k));
		
	}
	
	System.out.println(".................");
	
	ar2.retainAll(ar3);
	
	
	System.out.println("............");
	
	for(int s=0; s<ar2.size(); s++) {
		
		System.out.println(ar2.get(s));
	}
	

		}
		
		
		
				
				
		
		
		
	}
	
	
}






	}

}
