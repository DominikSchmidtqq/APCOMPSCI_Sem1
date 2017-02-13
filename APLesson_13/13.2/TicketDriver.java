import java.util.Scanner;
public class TicketDriver {
	static Scanner kb = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Will you be buying student or non student tickets?");
		String ans = kb.nextLine();
		if (ans.equalsIgnoreCase("student")) {
			System.out.println("How many days are left to buy a student ticket?");
			int student = kb.nextInt();
			Walkup walk = new Walkup();
			StudentAdvance student1 = new StudentAdvance(student);
			System.out.println("Walk in:\n"+ walk.toString());
			System.out.println();
			System.out.println("\nAdvance (student):\n" + student1.toString());

		}
		else {
			System.out.println("How many days are left to buy a non student ticket?");
			int adult = kb.nextInt();
			Walkup walk = new Walkup();
			Advance Adult1 = new Advance(adult);
			System.out.println("Walk in:\n"+ walk.toString());
			System.out.println();
			System.out.println("Advance (adult):\n"+ Adult1.toString());
		}
	}
}