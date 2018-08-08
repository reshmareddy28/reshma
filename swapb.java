import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			int m, n;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println(m+"\t"+n);
   }
}
