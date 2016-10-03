import java.util.Scanner;
public class Circle1
{
	
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		Circle1 ar = new Circle1();
		System.out.println("What is the sidelength?");
		double r = kb.nextDouble();
	
		double area = ar.calcAre(r);
		System.out.printf("Your area is %6.2f", area);
		
	}
	public double calcAre(double r)
	{
		return (r*r)*3.14;
	}
	
}