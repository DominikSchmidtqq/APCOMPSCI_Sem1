import java.util.Scanner;
public class Cube
{
	
	static double a;
	static double r;
	
	
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the radius?");
		r = kb.nextInt();
		
		
		calcArea();
		print();
		
	}
	public static void calcArea()
	{
		a = (r*r)*3.14;
	}
	
	public static void print()
	{
		System.out.println("Your area is \t" + a + " feet.");
	}
}