package mypack2;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */

public class DateMainSG {

	public static void main(String[] args) 
	{
		MyDateSG ob=new MyDateSG();
		System.out.println("Default Constructor");
		ob.printDate();
		
		MyDateSG ob1=new MyDateSG(2,12,1212);
		
		//ob.printDate();
		
		System.out.println("Parameterize Constructor");
		ob1.printDate();
		


	}
}
