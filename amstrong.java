import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  int c=0,a;
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt();
    int temp=n; 
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("yes");   
    else  
        System.out.println("No");   
   }  
}  
