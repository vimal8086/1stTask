package mypack2;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class Account
{
	//Private Non Static Data Member
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYear;
	
	//Private static Data Member
	private static float interestRate;
	private static int count;
	
	//static block
	static {
		interestRate=0.05f;
		
	}
	
	public Account()
	{
		accNo=1111;
		ownerName="vimal";
		balance=1222f;
		durationYear=1.5f;
		count++;
	}
	
	public Account(int accNo,String ownerName,double balance,float durationYear)
	{
		this.accNo=accNo;
		this.ownerName=ownerName;
		this.balance=balance;
		this.durationYear=durationYear;
		count++;
	}
	
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	

	public float getDurationYear() {
		return durationYear;
	}

	public void setDurationYear(float durationYear) {
		this.durationYear = durationYear;
	}
	

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public static float getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}

	
	  public static int getCount() { return count; }
	  
	 // public static void setCount(int count) { Account.count = count; }
	 
	
	public void calculateInterest()
	{
		//double interestRate=balance*durationYear;
		System.out.println("Simple Interest:-"+interestRate*balance*durationYear);
		
		//Account.getInterestRate();
	}
	
	public void printDetails()
	{
		System.out.print("Account Details is:-" +this.accNo+","+this.ownerName+","+this.balance+","+this.durationYear);
	}
	
	
	
	
}
