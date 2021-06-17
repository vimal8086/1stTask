package mypack2;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */

public class DateMainT {

	public static void main(String[] args) 
	{
		MyDateT ob=new MyDateT();
		MyDateT ob1=new MyDateT(1,2,2020);
		ob.printDate();
		
		System.out.println("Parameterize Constructor");
		ob1.printDate();
		

	}

}