package mypack2;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class DateMainP {

	public static void main(String[] args)
	{
		MyDateP ob=new MyDateP();
		MyDateP ob1=new MyDateP(1,2,2020);
		ob.printDate();
		
		System.out.println("Parameterize Constructor");
		ob1.printDate();
		
		

	}
}