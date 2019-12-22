import java.io.*;
import java.util.*;
class ReverseUsingInputMethod
{public static void main(String args[])
 {String s;
 Scanner p=new Scanner(System.in);
 System.out.println("Enter the String: ");
 s=p.nextLine();
 char [] ch=s.toCharArray();
 for(int i=ch.length-1;i>=0;i--)
 {System.out.println(ch[i]);
 }
 }
 }