

import java.util.Scanner;

class Test
{
 public static void main(String args[])
    { Scanner p= new Scanner(System.in);
      int n1=0,n2=1,n3,n;
	  System.out.println("Enter The number of terms");
	  n=p.nextInt();
	  System.out.println(" "+n1);
	  System.out.println(" "+n2);
	  for(int i=2;i<=n;i++)
	  { n3=n1+n2;
        System.out.println(" "+n3);
        n1=n2;
	    n2=n3;
	   
	  }
	  
	}
	
}