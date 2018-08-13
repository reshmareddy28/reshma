import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int p=m*n;
		if(p%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
