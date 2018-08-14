import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		for(i=0;i <str.length();i++)
		{
            		if((str.charAt(i) == 'a')||(str.charAt(i) == 'e') ||(str.charAt(i) == 'i')||(str.charAt(i) == 'o')||(str.charAt(i) == 'u')) 
            		{
            			System.out.println("yes");
            			break;
            		}
		}
            		if(i==str.length())
            		{
            			System.out.println("no");
            			
            			
            		}
		
	}
}
