package mypack;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */

// Main class 
public class PrimeNumberCount
{
	public static void primeCount(int count)
	{
		int ct=0,n=0,i=1,j=1;  
		while(n<count)  
		{  
			j=1;  
			ct=0;  
		while(j<=i)  
		{  
			if(i%j==0)  
				ct++;  
				j++;   
		}  
		if(ct==2)  
		{  
			System.out.printf("%d ",i);  
			n++;  
		}  
		i++;  
		}  
		
	}


	public static void main(String[] args) 
	{
		primeCount(9);

	}

}
