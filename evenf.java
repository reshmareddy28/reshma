import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			int n1=0,n2=0,i=0;
         
        Scanner sc = new Scanner(System.in);
         
        
        n1 = sc.nextInt();
        n2 = sc.nextInt();
         
        for(i=n1;i<n2; i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
        }   
        System.out.println();
         
    }
}
