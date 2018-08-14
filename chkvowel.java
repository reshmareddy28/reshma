import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		for(int i=0;i <str.length();i++)
		{
            		if((str.charAt(i) == 'a')||(str.charAt(i) == 'e') ||(str.charAt(i) == 'i')||(str.charAt(i) == 'o')||(str.charAt(i) == 'u')) 
            		{
            			System.out.println("yes");
            			break;
            		}
            		else
            		{
            			System.out.println("no");
            			break;
            			
            		}
		}
	}
}
