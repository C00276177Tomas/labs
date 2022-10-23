package itcarlow.Lab3q2;

public class Lab3q2 
{

	public static void main(String[] args) 
	{
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(.04);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("Saver1 balance is :" + saver1.getSavingsBalance() + ". Saver 2 balance is :" + saver2.getSavingsBalance());
		
		SavingsAccount.modifyInterestRate(.05);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("Saver1 balance for next month will be :" + saver1.getSavingsBalance() + ". Saver 2 balance for next month will be :" + saver2.getSavingsBalance());
	}

}
