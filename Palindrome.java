import java.util.Scanner;
class Palindrome
{
 public static void main(String args[])
   {Scanner p=new Scanner(System.in);
    int n,rev=0,temp;
	System.out.println("Enter the number");
	n=p.nextInt();
	temp=n;
	while(n>0)
	  {
	   rev=(rev*10)+n%10;
	   n=n/10;
	   }
	if(temp==rev)
      System.out.println("Number Is Palindrome");
	else
      System.out.println("Number is not Palindrome");
	}
}
	
	
