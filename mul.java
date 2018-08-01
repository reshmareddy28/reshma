import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			  Scanner sc = new Scanner(System.in);
        int no = 0;
        no = sc.nextInt();
        for (int i = 0; i <5; i++) {
            System.out.println(no * (i + 1));
        }
    }
}
