import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			 int i,fact=1;  
		 int num;
		 Scanner sc=new Scanner(System.in);
		 num=sc.nextInt();
		for(i=1;i<=num;i++)
		{    
			fact=fact*i;    
		}    
		System.out.println(fact);    
	}  
}  
