import java.util.Scanner;
public class Ex_04{
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		System.out.println("Plz enter a word");
		String word = kb.nextLine();
		int stop = word.length();
		tree(word, stop);
	}
	public static String tree(String word, int stop, int start){
		if (start <= stop){
			System.out.printf("%15s\n"+ word.substring(0,start));
			start++;
			tree(word,start,stop);
		}
	}
}