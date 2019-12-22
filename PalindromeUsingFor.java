import java.util.*;
class PalindromeUsingFor
 {
  public static void main(String args[])
    { int org,rev=0,temp;
	  Scanner p = new Scanner(System.in);
	  System.out.println("Enter the number");
	  org=p.nextInt();
	  temp=org;
	  for(;org!=0;org=org/10)
	   { rev=(rev*10)+org%10;
	   }
	  if(rev==temp)
	   System.out.println("Is a palindrome number");
	  else
	   System.out.println("Is not a palindrome number");
	}
}
	  