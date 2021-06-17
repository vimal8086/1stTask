package mypack2;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */

public class MyDateSG
{
	private int day,month,year;
	
	public MyDateSG()
	{
		//System.out.println("Default Constructor");
	}
	public MyDateSG(int d,int m,int y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
		
	}
	public void printDate()
	{
		System.out.println("Date is:-" +day+"/"+month+"/"+year);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
