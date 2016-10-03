import java.util.Scanner;
public class Cube1
{
	
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		Cube1 sur = new Cube1();
		System.out.println("What is the sidelength?");
		double s = kb.nextDouble();
	
		double surface = sur.calcAre(s);
		System.out.printf("Your surface area is %6.2f", surface);
		
	}
	public double calcAre(double s)
	{
		return (s*s)*6;
	}
	
}