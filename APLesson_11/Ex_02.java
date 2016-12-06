import java.util.Scanner;
public class Ex_02 {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		String [][] words = new String[4][4];
		for(int i=0; i < words.length; i++) {
			for (int j=0; j<words[i].length; j++) {
				System.out.println("Enter a word.");
				words[i][j] = kb.next();
			}
		}
		for(int i=0; i<words.length; i++) {
			for(int d = 0; d<words[i].length; d++) {
				System.out.print(words[i][d]+"\t");
			}
			System.out.println();
		}
	}
}