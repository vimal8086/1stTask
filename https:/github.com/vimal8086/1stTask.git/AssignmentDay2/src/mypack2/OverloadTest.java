package mypack2;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class OverloadTest {

	public static void main(String[] args) 
	{
		MathEngine ob=new MathEngine();
		
		int mul1 = ob.multiply(1, 2); 
		System.out.println("multiplication of the two integer value :"
                + mul1);
		
		ob.multiply(1, 2,3); 
		
		float mul2= ob.multiply(2f, 3);
		System.out.println("multiplication of float and integer value :"
                + mul2);
		
		float mul3=ob.multiply(2, 3f);
		System.out.println("multiplication of integer and float value :"
                + mul3);
		
	}

}

