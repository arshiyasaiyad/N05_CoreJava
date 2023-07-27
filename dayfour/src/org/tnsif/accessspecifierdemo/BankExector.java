//Program to demonstrate on Access Specifier
//Driver Class
package org.tnsif.accessspecifierdemo;
import org.tnsif.accessspecifier.Bank;
public class BankExector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.bankName="SBI";
		b.displayPublic();
		/*pinNo and displayPrivate() method are private ,
		 * so we can't access into another class and 
		 * another package, only we can access private
		 * data members inside the same class */
		//b.pinNo;
		//b.displayPrivate();
		/*accountNo and siplayDefaualt() method are default that's why ,
		 * we are not able to access into another package,
		 * only we can access within the same package*/

		//b.accountNo;
		//b.displayDefault();
	}

}
