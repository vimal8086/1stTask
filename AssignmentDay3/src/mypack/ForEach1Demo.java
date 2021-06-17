package mypack;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class ForEach1Demo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double arr1[]= {1,2,3,4,5};
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		float arr2[]= {1,2,3,4,5};
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		String arr3[]= {"rose","sun-flower"};
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
		
		String arr4[]= {"rose","sun-flower"};
		for (int i =0;i<arr4.length;i++)  
	    {  
	        for(int j=0;j<arr4.length; j++)  
	        {  
	            System.out.print("2D Element");  
	            
	            System.out.println(arr4[i]);  
	            System.out.println(arr4[j]);
	        }  
	    }  
	    
	}


}
