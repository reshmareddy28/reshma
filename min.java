import java.util.Scanner;
class Ideone
{
		public static void main (String[] args) throws java.lang.Exception
	{
		 	 		int n,temp,i;
			Scanner data = new Scanner(System.in);
			n=data.nextInt();
			int value[]= new int[n];
			for(i=0; i < n; i++ )
			value[i] = data.nextInt();
			temp = value[0];
			for(i=0; i < n; i++ )
			{
					if(temp < value[i])
					continue;
					else
					temp = value[i];
			}
			System.out.println(temp);
	}
}


