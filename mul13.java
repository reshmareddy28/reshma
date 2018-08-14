import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		if(m%13==0)
			System.out.println("yes");
		else
			System.out.print("no");
	}
}
