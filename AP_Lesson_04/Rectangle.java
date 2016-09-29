import java.util.Scanner;
public class Rectangle
{
	
	static double l;
	static double w;
	static double p;
	
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length?");
		l = kb.nextInt();
		System.out.println("What is the width?");
		w = kb.nextInt();
		calcPerim();
		print();
		
	}
	public static void calcPerim()
	{
		p = (2*l + 2*w);
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is \t" + p + " feet around.");
	}
}