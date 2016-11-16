import java.util.Scanner;
public class Ex04{
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the starting number ");
		int start = kb.nextInt();
		System.out.println("Please enter your sequence size");
		int size = kb.nextInt();
		int [] seq = new int[size];
		for(int i=0; i<seq.length; i++){
			if (i==1 || i==0) {
				seq[i]=start;
			}
			else{
				seq[i]=seq[i-1]+seq[i-2];
			}
			System.out.println(seq[i]+" ");
		}
	}
}