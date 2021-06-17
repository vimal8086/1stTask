package mypack;

public class Fibonacci {

	public static int fibo(int terms)
	{
		if(terms == 0)
		{
			return 0;
		}
		if(terms == 1 || terms == 2)
		{
				return 1;
		}
		return fibo(terms-2) + fibo(terms-1);
	}
	public static void main(String args[]) 
	{
		int maxNumber = 3;
		System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
		for(int i = 0; i < maxNumber; i++)
		{
				System.out.print(fibo(i) +" ");
		}
	}
}
