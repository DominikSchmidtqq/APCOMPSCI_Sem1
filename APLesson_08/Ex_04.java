import java.util.Scanner;
public class Ex_04{
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		System.out.println("Plz enter a word");
		String word = kb.nextLine();
		int stop = word.length();
		tree(word, 0,stop);
	}
	public static void tree(String word,  int start, int stop){
		if (start <= stop){
			System.out.printf("%15s\n", word.substring(0,start));
			start++;
			tree(word, start, stop);

		}
	}
}