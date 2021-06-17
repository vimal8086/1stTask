package mypack;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class VarArgDemo {
	public static void average(int...v)
	{
		System.out.println(v.length); 
	}

public static void main(String[] args) 
{
	average();
	average(12,12);
	

}

}
