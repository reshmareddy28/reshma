import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char c[]=st.toCharArray();
		Arrays.sort(c);
		System.out.print(c);
	}
}
