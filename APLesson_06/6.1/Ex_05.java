import java.util.Scanner;
public class Ex_05
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("What is the number to count to?");
		int number = kb.nextInt();
		System.out.println("What is the number to count by?");
		int num = kb.nextInt();
		for (int i=1; i<=(number/num); i++)
		{
			System.out.printf((num*i)+" ");
			
		}
		System.out.println();
	}
	
}