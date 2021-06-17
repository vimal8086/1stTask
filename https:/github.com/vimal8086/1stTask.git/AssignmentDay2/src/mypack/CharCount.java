package mypack;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 08/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */


public class CharCount
{
	public static int charCount(String str,char ch,int index)
	{
		if(index >= str.length())
		      return 0;
		      
		      int count=0;
		      
		      if(str.charAt(index) == ch)
		      count++;
		      
		      return count + charCount(str,ch,index+1);
	}
	public static void main(String[] args)
	{
		  String input = "vimal";
		  char ch = 'A';            
		  
		  int result = charCount(input,ch,0); 
		  
		  System.out.println("The Character '"+ch+"' appears "+result+" times.");
		  
	}

}