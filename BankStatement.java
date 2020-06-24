package JavaUtil;

import java.util.ArrayList;
import java.util.Iterator;

public class BankStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
Bank b1 = new Bank(12121212, "Raja", "AHIRP2eRB");
Bank b2 = new Bank(12354444, "Roja", "AHSRP2eRB");
Bank b3 = new Bank(32342343, "Reja", "AHISD2eRB");


ArrayList ar = new ArrayList();

ar.add(b1);
ar.add(b2);
ar.add(b3);

Iterator<Bank> it = ar.iterator();

while(it.hasNext()) {
	
	Bank ban = it.next();
	
	System.out.println(ban.AccountName);
	System.out.println(ban.Accountnumber);
	System.out.println(ban.PANNumber);
	
	
	
	
	
}









	}

}
