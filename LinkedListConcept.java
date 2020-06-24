package JavaUtil;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String>  ll = new LinkedList();
		
		ll.add("Now");
		ll.add("we");
		ll.add("are");
		ll.add("testing");
		ll.add("Linked List");
		
		System.out.println("Contents of LL:"+ll);
		
		
		//Methos add/set/remove
		ll.addFirst("Karthik");
		ll.addLast("Ramanathan");
		
		System.out.println(ll);
		
		
		System.out.println(ll.get(0));
		
		ll.set(3, "element");
		
		System.out.println(ll.get(3));
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		ll.remove(2);
		
		System.out.println(ll);
		
//advance FOR loop
		
		for(String str:ll) {
			
			System.out.println(str);
			
			
			System.out.println("Using Iterator");
			
			Iterator<String> it = ll.iterator();
			
			while(it.hasNext()) {
				
				System.out.println(it.next());
				
				
				//while
				
				int n = 0;
				
				while(ll.size()>n) {
					System.out.println(ll.get(n));
					n++;
				}
	
			}
		}
		
		
		

	}

}
