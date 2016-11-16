import java.util.Scanner;
public class Ex02{
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words.");
		String [] words = new String[5];
		for(int i=0; i<words.length; i++){
			words[i]=kb.next();
		}
		first(words);
	}
	public static void first(String[]words){
		for(String word : words){
			System.out.println();
			System.out.print(word.substring(0,1));
		}
	}
}