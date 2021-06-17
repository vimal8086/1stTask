package mypack2;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */

public class MyDateT 
{
	private int day,month,year;
	
	public MyDateT()
	{
		this.day=1;
		this.month=12;
		this.year=2020;
		System.out.println("Default Constructor");
	}
	public MyDateT(int d,int m,int y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
		
	}
	public void printDate()
	{
		System.out.println("Date is:-" +day+"/"+month+"/"+year);
	}
}