import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Ex_04 volume = new Ex_04();
		
		System.out.println("What is the height in inches?");
		double h = kb.nextDouble();
		
		System.out.println("What is the lengh in inches?");
		double l = kb.nextDouble();
		
		System.out.println("What is the width in inches?");
		double w = kb.nextDouble();
		
		double vol = volume.calcVol(h, l, w);
		System.out.println("The volume in cubic feet is "+ vol*0.000578704);
	}
	public double calcVol(double h, double l, double w)
	{
		return (h*l*w);
	}
}