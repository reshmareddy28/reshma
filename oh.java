import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		char ch=sc.next().charAt(0);
		int b=sc.nextInt();
		switch(ch)
		{
			case '/':int res=a/b;
			System.out.println(res);
			break;
			case '%':res=a%b;
			System.out.println(res);
			break;
		}
	}
}
