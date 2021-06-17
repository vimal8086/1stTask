package mypack;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class Pelindrome
{
	static boolean checkPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) 
        {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
 
       
        return true;
    }
 
   
    public static void main(String[] args)
    {
        String str = "Vimal";
 
        if (checkPalindrome(str))
            System.out.print("prlindrome");
        else
            System.out.print("Not pelindrome");
    }

}
