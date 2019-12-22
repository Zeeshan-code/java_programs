import java.util.Scanner;
class BubbleSort
{
 public static void main (String [] args)
   { Scanner sc=new Scanner(System.in);
     int n,temp;
     System.out.println("Enter the number of items to be stored");
	 n=sc.nextInt();
     int [] a= new int [n];
	 for (int i=0;i<n;i++)
	  { a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		 {for(int j=i;j<n;j++)
		   { if(a[j]<a[i])
		      {temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
			  }
           }
         }
		for(int i=0;i<n;i++)
		 {System.out.print(a[i]+" ");
          }
	}
}	
		 
	 