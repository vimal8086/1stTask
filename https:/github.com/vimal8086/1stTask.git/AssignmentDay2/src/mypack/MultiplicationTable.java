package mypack;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class MultiplicationTable
{
	public static void mulTable(int n)
	{
		int  i = 1;
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", n, i, n * i);
            i++;
        }
	}

	public static void main(String[] args) 
	{
		mulTable(5);

	}

}

