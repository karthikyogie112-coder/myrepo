package JavaUtil;

import java.util.ArrayList;

public class Addall {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList ar = new ArrayList();
		
		ar.add( 121);
		ar.add(11.22);
		ar.add('e');
		ar.add("HasNext");
		
		
	ArrayList ar1 = new ArrayList();
	
	ar1.add(121);
	ar1.add(11.22);
	ar1.add('a');
	ar1.add("Strung");
	
	ar.retainAll(ar1);
	
	for(int i =0; i<ar.size(); i++) {
		
		System.out.println(ar.get(i));
		
		
		
	}
		
		

	}

}
