package mypack;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class ForEach2Demo {

	public static void main(String[] args) 
	{
		int[][] a={{10,20},{30,40},{50,60}};//declaration and initialization   
		System.out.println("Two dimensional array elements are");    
		for (int i = 0; i < 3; i++) 
		{
	            for (int j = 0; j < 2; j++) 
		    {
	                System.out.println(a[i][j]);
	            }
		}
		
		 int[][] arr = new int[2][4];  
		   
		    for (int i =0;i<3;i++)  
		    {  
		        for(int j=0;j<3;j++)  
		        {  
		             
		            System.out.println(arr[i][j]);  
		        }  
		    }  

	
	}

}
