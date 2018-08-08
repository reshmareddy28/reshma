import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x, y, temp;
		Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      temp = x;
      x = y;
      y = temp;
 
      System.out.println(x+"\t"+y);
   }
}
