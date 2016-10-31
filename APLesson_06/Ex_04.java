import java.util.Scanner;
public class Ex_04 
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int integer = kb.nextInt(); 
		System.out.println("Enter the size of the table");
		int tablesize = kb.nextInt(); 
		System.out.println("\nFormula: " + integer + "x");
		System.out.println("____________________");
		for (int i=1; i<(tablesize + 1); i++) {
			int t = integer * i;
			format(i, t);
		}
		System.out.println("____________________");
	}
	public static void format(int f, int b) {
		System.out.printf("| %3d |\t%5d\t|\n", f, b);
	}
}