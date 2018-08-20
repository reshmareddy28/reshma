
import java.util.*;
 
class Composite
{
    static boolean isComposite(int n)
    {
        if (n <= 1) 
        System.out.println("False");
         
        if (n <= 3) 
        System.out.println("False");
        if (n % 2 == 0 || n % 3 == 0) return true;
 
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
            return true;
 
        return false;
    }
    public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	
        System.out.println(isComposite(n) ?
                       "yes" : "no");
    }
}
