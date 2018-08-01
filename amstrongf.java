import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			 int n1,n2,num;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(num=n1+ 1; num<n2; ++num)
		{
            		int digits = 0;
            		int result = 0;
            		int original= num;
            		while (original!= 0)
            		{
            			original/= 10;
            			++digits;
            		}
			original= num;
			 while (original!= 0) 
			 {
            			 int remainder = original% 10;
            			result += Math.pow(remainder, digits);
            			original /= 10;
            		 }
			if (result == num)
            		System.out.print(num + " ");
		}
	 }
}
