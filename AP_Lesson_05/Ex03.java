import java.util.Scanner;
public class Ex03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height in m?");
		double height = kb.nextDouble();
		
		System.out.println("What is your weight in kg?");
		double weight = kb.nextDouble();
		
		double bmi = weight/(height*height);
		String cond = Condition(bmi);
		
		System.out.println("Your bmi is "+ bmi + " , your condition is "+ cond+ " !");
	}
	public static String Condition(double bmi)
	{
		if (bmi >= 39.9)
			return "Morbidly obese";
		if (bmi >= 35)
			return "Very Obese";
		if (bmi >= 29.9)
			return "Obese";
		if (bmi >= 25)
			return "Overweight";
		if (bmi >= 18.5)
			return "Normal";
		else
			return "underweight";
		
	}
}