package mypack2;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class Bank {

	
	public static void main(String[] args) 
	{ 	
		System.out.println("interest"+Account.getInterestRate());
		Account ob=new Account();
		ob.setAccNo(1212);
		ob.setOwnerName("vimal");
		ob.setBalance(500000);
		ob.setDurationYear(1.5f);
		
		System.out.println("AccountNO:-"+ob.getAccNo());
		System.out.println("ownerName:-"+ob.getOwnerName());
		System.out.println("Balance:-"+ob.getBalance());
		System.out.println("Duration year:-"+ob.getDurationYear());
		//ob.printDetails();
		ob.calculateInterest();
	
		Account ob1=new Account(111,"vishal",200000,1.5f);
		System.out.println( " ");
		ob1.printDetails();
		ob1.calculateInterest();
		
		System.out.print("Account Count is:-" +Account.getCount());
		

	}

}
