import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int temp;
		int T=sc.nextInt();
		
		for (int p=1;p<=T;p++)
		{int N=sc.nextInt();
		int A[]=new int[N];
		  for(int i=0;i<N;i++)
		 {A[i]=sc.nextInt();
		 }
		 for(int i=0;i<N;i++)
		 { for(int j=1;j<N;j++)
		    { if(A[j]<A[i])
		      {temp=A[i];
		      A[i]=A[j];
		      A[j]=temp;
		      }
		    }
		 }
		 System.out.print(A[0]+" "+A[N-1]);
	}
	}
	}