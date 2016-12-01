import java.util.Scanner;
public class Average1
{
	
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		Average1 avg = new Average1();
		System.out.println("What is the first number?");
		double a = kb.nextDouble();
		System.out.println("What is the next number?");
		double b = kb.nextDouble();
		System.out.println("What is the last number?");
		double c = kb.nextDouble();
		double average = avg.calcAvgr(a,b,c);
		System.out.printf("Your average is %6.2f", average);
		
	}
	public double calcAvgr(double a, double b, double c)
	{
		return (a + b + c)/3;
	}
	
}