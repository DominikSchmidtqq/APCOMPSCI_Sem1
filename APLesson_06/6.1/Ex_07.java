import java.util.Scanner;
public class Ex_07
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string:");
		String word = kb.next();
		System.out.println();
		for (int i=0;i<=word.length();i++) 
		{
			System.out.println(word.substring(0,i));
		}
	}
}	