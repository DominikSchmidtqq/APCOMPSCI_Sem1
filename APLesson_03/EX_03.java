import java.util.Scanner;
public class EX_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		Double inc  = kb.nextDouble();
		Double cmh = inc * 2.54;
		System.out.println("Your height in cm is..." + cmh);
		
	}
}