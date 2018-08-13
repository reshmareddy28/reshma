import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		 int count = 0;

        while(num != 0)
        {
            num /= 10;
            ++count;
        }

        System.out.println(count);
    }
}
