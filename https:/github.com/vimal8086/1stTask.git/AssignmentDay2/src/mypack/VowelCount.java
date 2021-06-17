package mypack;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class VowelCount
{
	 static int isVowel(char chars)
	    {
	        if (chars == 'a' || chars == 'e' || chars == 'i'
	            || chars == 'o' || chars == 'u') 
	        {
	            return 1;
	        }
	        else {
	            return 0;
	        }
	    }
	public static int countVowels(String str,int l)
	{
		if (l == 1) {
            return isVowel(str.charAt(l - 1));
        }
  
        return countVowels(str, l - 1)
            + isVowel(str.charAt(l - 1));
	}

	public static void main(String[] args)
	{
		 String str = "Hello";
		  
	        str = str.toLowerCase();
	  
	        System.out.println(
	            "Total number of vowels in string are:");
	  
	        System.out.println(countVowels(str, str.length()));

	}

}

