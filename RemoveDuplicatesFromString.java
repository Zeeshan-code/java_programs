import java.util.*;
class RemoveDuplicatesFromString
{
 public static void main(String args[])
  {String s;
  Scanner p= new Scanner(System.in);
  s=p.nextLine();
  ArrayList<Character> l=new ArrayList <Character>();
  char letter []=s.toCharArray();
  Arrays.sort(letter);
  char prev=letter[0];
  l.add(prev);
  for(int i=1;i<letter.length;i++)
   {
   if(!(prev==letter[i]))
    {l.add(letter[i]);
	}
	prev=letter[i];
	}
	for(int i=0;i<l.size();i++)
	 System.out.println(l.get(i));
	 }
	 }
	 