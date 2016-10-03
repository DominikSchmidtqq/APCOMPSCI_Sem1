import java.util.Scanner;
public class Rectangle1
{
	
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		Rectangle1 perimete = new Rectangle1();
		System.out.println("What is the length?");
		int l = kb.nextInt();
		System.out.println("What is the width?");
		int w = kb.nextInt();
		double perimeter = perimete.calcPerim(l,w);
		System.out.printf("Your perimeter is %6.2f", perimeter);
		
	}
	public double calcPerim(int l, int w)
	{
		return (2*l + 2*w);
	}
	
}