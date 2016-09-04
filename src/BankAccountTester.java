/**
   A class to test the BankAccount's addInterest method
*/
public class BankAccountTester {

	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount();
		account.deposit(1000);
		account.addInterest(10);
		
		System.out.println(account.getBalance());
		System.out.print("Expected: 1100.0");
	}
}
