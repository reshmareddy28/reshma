import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, r,temp = n;    
		while(n>0)
		{    
			r = n % 10;   
			sum = (sum*10)+r;    
			n = n/10;    
		}    
		if(temp==sum)
		{
			System.out.println("yes"); 
		}
		else 
		{
			System.out.println("No");  
		}
	}  
}
