
import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Ex_03 interest = new Ex_03();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your principal?");
		double p = kb.nextDouble();
		
		System.out.println("What is your interest rate?");
		double r = kb.nextDouble();
		
		System.out.println("What is the number of times the loan is compounded per year?");
		double n = kb.nextDouble();
		
		System.out.println("What is the life of the loan (in years)");
		double t = kb.nextDouble();
		
		double payment = interest.calcInt(p, r, n, t);
		
		System.out.printf("Your total monthly payment is $%6.2f", payment);
	}
	public double calcInt(double one, double two, double three, double four)
	{
		
		return (one*Math.pow((1 + (two/three)), (three*four)))/(12*four);


	}
}