import java.util.Scanner;
class BubbleSort1
{
 public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
	 int temp;
	 System.out.println("Enter the number of elements to be entered : ");
	 int n=sc.nextInt();
	 int a[]=new int [n];
	 
	 for(int i=0;i<n;i++)
	   { a[i]=sc.nextInt();
	   }
	 for(int i=0;i<n;i++)
      {
        for(int j=i;j<n;j++)
         { if(a[j]<a[i])
		    { temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
			}
		 }
       }
       System.out.print(a[n-1]);
   }
}   