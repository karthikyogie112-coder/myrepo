package JavaUtil;

public class ConstructorConcept {
	
	
	public ConstructorConcept() {
		
		System.out.println("Constructor with no Parameter");
	}
	
	public ConstructorConcept(int i) {
		
		System.out.println("the value of I:"+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 =new ConstructorConcept(11);

	}

}
