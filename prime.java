import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			int num, i, count=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(i=2; i<num; i++)
		{
            		if(num%i == 0)
            		{
            			count++;
            			break;
            		}
		}
		if(count == 0)
		{
            		System.out.print("yes");
		}
		else
		{
            		System.out.print("no");
		}
	}
}
