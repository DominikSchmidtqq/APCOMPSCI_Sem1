import java.util.Scanner;
public class Ex_02{
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		System.out.println("Plz enter a word");
		String word1 = kb.nextLine();
		System.out.println("Plz enter another word");
		String word2 = kb.next();
		System.out.println("Plz enter a last word");
		String word3 = kb.next();
		System.out.println(makeCenter(word1)+"\n"+ makeCenter(word2)+"\n"+ makeCenter(word3));
	}
	public static String makeCenter(String word){
		if(word.length() >=20){
			return word;
		}
		return makeCenter(" "+word+" ");
	}
}