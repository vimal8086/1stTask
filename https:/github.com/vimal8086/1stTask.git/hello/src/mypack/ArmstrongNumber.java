package mypack;

public class ArmstrongNumber {

	public static void armstrong(int num)
	{
		int a,arm=0,temp;
		temp=num;
		for( ;num!=0;num/=10 )
		{
			a=num%10;
			arm=arm+(a*a*a);
		}
		if(arm==temp)
		System.out.println(temp+" is a armstrong number ");
		else
		System.out.println(temp+" is not a armstrong number ");
	 }
    
	public static void main(String[] args) 
	{
		armstrong(153);
    }

}
