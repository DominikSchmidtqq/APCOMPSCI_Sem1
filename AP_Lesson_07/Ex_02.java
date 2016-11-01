import java.util.Scanner;
public class Ex_02
{
	static int digits = 0;
	static int average = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = kb.nextInt();
		avgDigits(number);
		System.out.println("The average of the digits of "+number+" is "+average); 
	}
	public static void avgDigits(int num)
	{
		
		while(num > 0)
		{
			
			digits++;
			average += num % 10;
			num /= 10;
		}
		average = (average / digits);
	}
}