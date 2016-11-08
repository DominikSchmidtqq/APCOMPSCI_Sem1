import java.util.Scanner;
public class Ex_01{
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence plz");
		String line = kb.nextLine();

		System.out.println(replace(line));
	}
	public static String replace(String line){
		int z = line.indexOf(" ");
		if(z<0){
			return line;
		}
		else{
			return replace(line.substring(0,z) + "_" + line.substring(z+1));
		}
	}

	
	
	
	
	
	
	
	
	
	
}