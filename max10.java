import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
					Scanner data = new Scanner(System.in);
		int num=10, i, temp, max;
		max = data.nextInt();
		for (i=1; i <10; i++) 
		{ 
			temp = data.nextInt();
			if(temp < max)
			continue;
			else
			max = temp;
		}
		System.out.println(max);
	}
}
