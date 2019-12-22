import java.util.*;
class PalindromeString
  {
   public static void main(String args[])
    {Scanner p = new  Scanner(System.in);
	 String s,t="";
	 int x;
	 System.out.println("Enter the String");
	 s=p.nextLine();
	 x=s.length();
	 for(int i=x-1;i>=0;i--)
	  {t=t+s.charAt(i);
	  }
	  if(s.equals(t))
	    System.out.println("The String is PalindromeString");
	  else
	  System.out.println("Is nit an PalindromeString");
	  }
	}  
	    