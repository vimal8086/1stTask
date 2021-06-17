package containment.date;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class MyDate 
{
	private int day,month,year;
	
	public MyDate()
	{
		day=1;
		month=12;
		year=2020;
		System.out.println("Default Constructor");
	}
	public MyDate(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
		
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
	public String toString()
	{
		return  +day+"/"+month+"/"+year;
	}
	
	
	
	
	

}
