package mypack2;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class MyDateC 
{
	private int day,month,year;
	
	public MyDateC()
	{
		day=1;
		month=12;
		year=2020;
		System.out.println("Default Constructor");
	}
	public void printDate()
	{
		System.out.println("Date is:-" +day+"/"+month+"/"+year);
	}
	
}