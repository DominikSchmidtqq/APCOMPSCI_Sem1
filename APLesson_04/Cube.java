import java.util.Scanner;
public class Cube
{
	
	static double s;
	static double sa;
	
	
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the side length?");
		s = kb.nextInt();
		
		
		calcArea();
		print();
		
	}
	public static void calcArea()
	{
		sa = (s*s)*6;
	}
	
	public static void print()
	{
		System.out.println("Your surface area is \t" + sa + " feet.");
	}
}