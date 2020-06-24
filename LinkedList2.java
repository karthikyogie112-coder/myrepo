package JavaUtil;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll = new LinkedList();
		
		ll.add(111);
		ll.add(121);
		ll.add(112);
		ll.add(222);
		
		System.out.println(ll);
		
		ll.add(0, 171);
		
		System.out.println(ll);
		
		for(int i : ll) {
			
System.out.println(i);	


ll.set(3, 282);

ll.getFirst();

System.out.println(ll.get(1));

System.out.println(ll);

		
		}
		

	}

}
