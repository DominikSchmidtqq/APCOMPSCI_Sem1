import java.util.Scanner;

public class EX_02
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height in m?");
		Float height = kb.nextFloat();
		System.out.println("What is your weight in kg?");
		Float weight = kb.nextFloat();
		Float bmi = weight/(height * height);
		System.out.println(" Your bmi is ..." + bmi);
		
		
	
	}
}