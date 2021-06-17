package mypack;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class Array2DDemo {

	public static void main(String[] args)
	{
		int[][] arr = new int[3][3];  
	     
	    for (int i =0;i<arr.length;i++)  
	    {  
	        for(int j=0;j<arr.length; j++)  
	        {  
	            System.out.print("2D Element");  
	            
	            System.out.println(arr[i][j]);  
	        }  
	    }  
	    
		/*
		 * int arr[3][3],i,j; for (int i =0;i<arr.length;i++) { for(int
		 * j=0;j<arr.length; j++) { System.out.print("2D Element");
		 * 
		 * System.out.println(arr[i][j]); } }
		 */
	}

}

