package mypack;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class ArmstrongNumberCount
{
	public static void armstrongCount(int count)
	{
		int i=1,arm;
		System.out.println("Armstrong numbers");
		
		int loop  = 0;
		
		while(true)
		{
		arm=armstrongOrNot(i);
		if(arm==i) {
			System.out.println(i);
			loop++;
		}
		if(loop == count) {
			break;
		}
		i++;
		}
	}
	
	static int armstrongOrNot(int num)
	{
		int x,a=0;
		while(num!=0)
		{
			x=num%10;
			a=a+(x*x*x);
			num/=10 ;
		}
		return a;
	}
	
	public static void main(String[] args) 
	{
		armstrongCount(3);

	}

}
