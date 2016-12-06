import java.util.Scanner;
public class Ex_04 {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int[][]nums = new int[4][4];
		for(int i=0; i<nums.length; i++){
			for (int j=0; j<nums[i].length;j++) {
				nums[i][j] = (int)(Math.random()*50)+1;
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Enter a divisor ");
		int divisor = kb.nextInt();
		int count = 0;
		for (int i = 0; i<nums.length; i++) {
			for(int j = 0; j<nums[i].length; j++) {
				if (nums[i][j]%divisor==0) {
					count++;
				}
			}
		}
		if(count==1){
			System.out.println("There is "+count+" numbers that is divisible by "+divisor+" in the Array.");
		}
		else{
			System.out.println("There are "+count+" numbers that are divisible by "+divisor+" in the Array.");
		}
	}
}