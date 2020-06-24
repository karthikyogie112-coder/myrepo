package JavaUtil;

public class FinalConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//used to define constant value that cannot change/also prevents inheritance
		
		//public final class to stop inheritance from Parent to Child
		
final		int i = 1;
		
		System.out.println(i);
		
	}
	
	public static void test() {
		
		try {
			System.out.println("Inside test1 method");
			
			throw new RuntimeException("test");
			
		}catch(Exception e) {
			
			System.out.println("inside catch block");
		}
		
		finally {
			
			System.out.println("inside system block");
		}
	}

		// TODO Auto-generated method stub
	}


