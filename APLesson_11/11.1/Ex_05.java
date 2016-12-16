import java.util.Scanner;
public class Ex_05 {
	static int bulletCount = 96;
	static int clipSize = 16;
	static int shotCount = 0;
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		printClip();
		while(bulletCount + shotCount > 0) {
			System.out.print("Do Something (r to reload, s to shoot)");
			String action = kb.next();
			if (action.equalsIgnoreCase("R")) {
				reload();
			}	
			else if (action.equalsIgnoreCase("S")) {
				shoot();
			}		
			else {
				System.out.println("Try again for 'MURICA.");
			}
			System.out.println("\n");
			printClip();
		}
	}
	public static void printClip() {
		String out = "Bullets:\t" + bulletCount + "\nClip:\t";
		for(int i = 0; i < clipSize; i++) {
			if(i < shotCount) {
				out += "[*] ";
			}
			else {
				out += "[ ] ";
			}
		}
		System.out.println(out);
	}
	public static void reload() {
		int shotCount1 = shotCount;
		shotCount = Math.min(shotCount + bulletCount, clipSize);
		bulletCount -= shotCount - shotCount1;
	}
	public static void shoot() {
		if(shotCount > 0) {
			shotCount--;
			System.out.println("DIIIIIIEEEEEEEEEE communist!");
		}
		else {
			System.out.println("reload pleb");
		}
	}
}
