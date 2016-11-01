import java.util.Scanner;
public class Ex_08
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye", 1);
	}
	public static void sing(String word, int repeat) 
	{
		for (int i=0; i<repeat; i++) 
		{
			System.out.printf(word + " ");
		}
		System.out.println();
	}
}