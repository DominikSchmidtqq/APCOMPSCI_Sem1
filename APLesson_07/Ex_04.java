import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a String");
		String line = kb.next();
		while(line.indexOf("a") >= 0)
		{
		line = line.substring(0, line.indexOf("a")) + "@"+ line.substring(line.indexOf("a")+1);
		}
		System.out.println(line);
	}
}