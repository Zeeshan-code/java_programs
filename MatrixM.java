import java.util.Scanner;
class MatrixM
{
  public static void main(String args[])
    {
	 Scanner sc=new Scanner (System.in);
	 int i=0,j=0;
	 int cols= sc.nextInt();
	 int rows= sc.nextInt();
	 int a[][]=new int [rows][cols];
	 int b[][]=new int [rows][cols];
	 int c[][]=new int [rows][cols];
	 for(i=0;i<rows;i++)
	     {for(j=0;j<cols;j++)
		   {a[i][j]= sc.nextInt();
	        b[i][j]= sc.nextInt();
		   }
		 }
	 
	 if(rows==cols)
	  { for(i=0;i<rows;i++)
	     {for(j=0;j<cols;j++)
		   {c[i][j]=a[i][j]*b[i][j];
		   }
		 }
		 
		 for(i=0;i<rows;i++)
	     {for(j=0;j<cols;j++)
		   { System.out.print(c[i][j]+ " ");
		   }
		   System.out.println();
		 }
		
      }
	  else
	  {System.out.println("Matrices can't be multiplied ");
	  }
	  
	}
}	
	  
	  
			 
		  