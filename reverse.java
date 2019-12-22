import java.util.*;
import java.lang.*;
class ReverseString
{
public static void main(String args[])
{String org,rev;
Scanner p=new Scanner(System.in);
System.out.println("Enter the string");
org=p.nextLine();
rev= new StringBuffer(org).reverse().toString();
System.out.println("The Reverse of the String is: " +rev);
}
}
