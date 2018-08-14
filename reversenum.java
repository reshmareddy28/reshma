import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		while(n !=0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n /=10;
		}
		System.out.print(rev);
	}
}
