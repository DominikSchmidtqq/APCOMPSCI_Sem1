import java.util.Scanner;
public class EX_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name");
		String name = keyboard.next();
		System.out.println("Wow!" + name +  "is a terrible name");
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		System.out.println(age + "? That's really old.");
		System.out.println("What do you do for fun?");
		String activity = keyboard.next();
		System.out.println(activity + "? You must be a boring person.");
		System.out.println("What kind of music do you like?");
		String music = keyboard.next();
		System.out.println(music + "? You have no taste!");
		System.out.println("How many siblings do you have?");
		String siblings = keyboard.next();
		System.out.println( siblings + "? I hope they are less annyoing than you!");
		System.out.println("What do you want to be when you grow up?");
		String job = keyboard.next();
		System.out.println(job + "? Good luck with that," + name);
		System.out.println("Just kidding " + name + "! We're cool");
		
	}
}