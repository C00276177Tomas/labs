package itcarlow.Lab3q2;

import java.util.Scanner;

public class BankCustomer 
{
	
	private String name;
	private String address;
	private int savingsAccounts = 0;
	static int noOfAccountsCreated = 0;
	private int account1;
	private int account2;
	private int account3;
	
	public BankCustomer()
	{
		setName(name);
		setAddress(address);
		setSavingsAccounts(0);
		setAccount1(0);
		setAccount2(0);
		setAccount3(0);
	}
	
	public BankCustomer(String name, String address)
	{
		setName(name);
		setAddress(address);
		setSavingsAccounts(0);
		setAccount1(0);
		setAccount2(0);
		setAccount3(0);
	}
	public void setAccount1(int account1)
	{
		this.account1 = account1;
	}
	public void setAccount2(int account2)
	{
		this.account2 = account2;
	}
	public void setAccount3(int account3)
	{
		this.account3 = account3;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setSavingsAccounts(int savingsAccounts)
	{
		this.savingsAccounts = savingsAccounts;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public int getSavingsAccounts()
	{
		return savingsAccounts;
	}
	public int getAccount1()
	{
		return account1;
	}
	public int getAccount2()
	{
		return account2;
	}
	public int getAccount3()
	{
		return account3;
	}
	public void addAccount(double savingsBal)
	{
		if(savingsAccounts<3)
		{
			SavingsAccount[] accounts = new SavingsAccount[100];
			SavingsAccount account = new SavingsAccount(savingsBal);
			savingsAccounts++;
			accounts[noOfAccountsCreated] = account;
			noOfAccountsCreated++;
			if(savingsAccounts == 1)
			{
				account1=SavingsAccount.accountNo;
			}
			else if(savingsAccounts == 2)
			{
				account2=SavingsAccount.accountNo;
			}
			else if(savingsAccounts == 3)
			{
				account3=SavingsAccount.accountNo;
			}
		}
		else
		{
			System.out.println("Too many savings accounts, Account was not created");
		}
	}
	public void balance()
	{
		int account1;
		int account2;
		int account3;
		
		
	}
}
