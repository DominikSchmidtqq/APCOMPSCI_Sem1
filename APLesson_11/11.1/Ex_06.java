import java.util.Scanner;
public class Ex_06 {
	static int healthload = 6;
	static int healthcount = healthload;
	static String[] health = new String[healthload];
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		String turn = "";
		for (int i=0; i<health.length; i++) {
			health[i] = "@";
		}
		while (!(turn.equalsIgnoreCase("QUIT")) && healthcount > 0) {
			System.out.println("Press a key if you wanna die");
			turn = keyboard.next();
			int damage = 1 + (int)(Math.random() * 2), amount = 1 + (int)(Math.random() * 6);
			takeDamage(damage, amount);
			printHealth();
		}
		System.out.println("RIP scrub ");
	}
	public static void printHealth() {
		String output = "";
		output += "Health:\t";
		for (int i=0; i<healthload; i++) {
			if (i < healthcount) {
				health[i] = "[@]";
			}
			else {
				health[i] = "[ ]";
			}
			output += health[i] + " ";
		}
		System.out.println(output);
	}

	public static void takeDamage(int dmg, int amt) {
		if (dmg == 1) {
			System.out.println("You take " + amt + " damage.");
			healthcount -= amt;
		}
		else {
			if (healthcount + amt < healthload) {
				healthcount += amt;
			}
			else {
				healthcount = healthload;
			}
			System.out.println("You gain " + amt + " health.");;
		}
	}
}
