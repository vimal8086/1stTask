package mypack;

public class Factorial 
{
	public static int  fact(int num)
	{
		int i, fact= 1;
		if(num ==0) {
			return fact;
		}
		if(num <0 ) {
			System.out.println("Proided number is negative");
			return 0;
		}
		
		for (i=1;i<=num;i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) 
	{
		
		System.out.println(fact(-1));
	}

}
