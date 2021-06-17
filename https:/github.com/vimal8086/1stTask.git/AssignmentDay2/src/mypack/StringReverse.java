package mypack;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */

public class StringReverse 
{
	public static String reverse(String str)
	{
		return new StringBuilder(str).reverse().toString();
	}
	public static void main(String[] args)
	{
		String str= "vimal"; 
		str= reverse(str);
		System.out.println("Result after reversing a string is : "+str);
	}

}
