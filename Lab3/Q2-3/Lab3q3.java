package itcarlow.Lab3q2;

public class Lab3q3
{

	public static void main(String[] args) 
	{
		BankCustomer customer1 = new BankCustomer("Tom", "Wexford");
		
		System.out.println("Customer name: " + customer1.getName() + ". Customer address: " + customer1.getAddress() + ". Customer accounts : " + customer1.getSavingsAccounts() + ".");
		
		customer1.addAccount(1000);
		
		System.out.println("Customer name: " + customer1.getName() + ". Customer address: " + customer1.getAddress() + ". Customer accounts : " + customer1.getSavingsAccounts() + ".");
		
		customer1.addAccount(2000);
		
		System.out.println("Customer name: " + customer1.getName() + ". Customer address: " + customer1.getAddress() + ". Customer accounts : " + customer1.getSavingsAccounts() + ".");
		
		customer1.addAccount(3000);
		
		System.out.println("Customer name: " + customer1.getName() + ". Customer address: " + customer1.getAddress() + ". Customer accounts : " + customer1.getSavingsAccounts() + ".");
		
		customer1.addAccount(4000);
		
		System.out.println("Customer name: " + customer1.getName() + ". Customer address: " + customer1.getAddress() + ". Customer accounts : " + customer1.getSavingsAccounts() + ".");
		
		BankCustomer customer2 = new BankCustomer("John", "Waterford");
		
		customer2.addAccount(5000);
		
		System.out.println("Customer name: " + customer2.getName() + ". Customer address: " + customer2.getAddress() + ". Customer accounts : " + customer2.getSavingsAccounts() + ".");
		
		customer2.addAccount(6000);
		
		System.out.println("Customer name: " + customer2.getName() + ". Customer address: " + customer2.getAddress() + ". Customer accounts : " + customer2.getSavingsAccounts() + ".");
		
		System.out.println("Account 1 no. : " + customer1.getAccount1() + ". Account 2 no. : " + customer1.getAccount2() + ". Account 3 no. : " + customer1.getAccount3() + ". Account 1 no. for customer2 is : " + customer2.getAccount1() + ". Account 2 no. for customer2 is : "+ customer2.getAccount2() + ".");
		
	}

}

