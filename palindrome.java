import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner h = new Scanner (System.in);
		int a,b=0,c,d;
		a = h.nextInt();
		d = a;
		 while (a > 0)
		  {
		     c = a%10;
		     b = (b * 10) + c;
		     a = a/10;
		  }
		  if ( b == d)
		   System.out.println("yes");
		  else
		   System.out.println("no");
	}
}
