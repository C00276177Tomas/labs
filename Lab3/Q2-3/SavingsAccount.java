package itcarlow.Lab3q2;

public class SavingsAccount 
{
	static int accountNo = 0;
	static double annualInterestRate = .20;
	private double savingsBalance;
	private double monthlyInterest;
	
	public SavingsAccount()
	{
		setAnnualInterestRate(annualInterestRate);
		setSavingsBalance(0);
		setAccountNo(accountNo);
		accountNo++;
	}
	public SavingsAccount(double savingsBal)	
	{
		setSavingsBalance(savingsBal);
		setAnnualInterestRate(annualInterestRate);
		setAccountNo(accountNo);
		accountNo++;
	}
	
	public void setAccountNo(int accountNum)
	{
		accountNo = accountNum;		
	}
	public void setAnnualInterestRate(double annualInterest)
	{
		annualInterestRate = annualInterest;		
	}
	public void setSavingsBalance(double savingBal)
	{
		savingsBalance = savingBal;		
	}
	public double calculateMonthlyInterest()
	{
		monthlyInterest = (savingsBalance*annualInterestRate)/12;
		savingsBalance = savingsBalance+monthlyInterest;
		return monthlyInterest;
	}
	public static void modifyInterestRate(double annualInterest) 
	{
		annualInterestRate = annualInterest;
	}
	
	public int getAccountNo()
	{
		return accountNo;
	}
	public double getInterestRate()
	{
		return annualInterestRate;
	}
	public double getSavingsBalance()
	{
		return savingsBalance;
	}
}
