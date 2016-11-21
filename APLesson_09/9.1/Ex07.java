import java.util.Scanner;
public class Ex07{
	public static void main(String args []){
		String words [] = new String [5];
		fillArray(words);
		System.out.println("For the following words");
		printArray(words);
		System.out.println("In "+ findZ(words)+"the letter Z is contained");
	}
	public static void fillArray(String words []){
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter five words");
		for (int i=0; i<words.length; i++){
			words[i]=kb.next();
		}
	}
	public static void printArray(String words []){
		for(String word:words){
			System.out.println(word+" ");
		}
	}
	public static String findZ(String words []){
		String z="";
		for(String word:words){
			if(word.indexOf("z")>=0){
				z += word + " ";
			}
		}
		return z;
	}
}