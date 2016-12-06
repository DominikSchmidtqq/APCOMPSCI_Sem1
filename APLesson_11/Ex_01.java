public class Ex_01 {
	public static void main(String args[]) {
		int[][] nums = new int [4][4];
		for(int i=0; i < nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				nums[i][j] = (int)(Math.random()*50)+1;
			}
		}
		for(int i=0; i<nums.length; i++) {
			for(int d = 0; d<nums[i].length; d++) {
				System.out.print(nums[i][d]+"\t");
			}
			System.out.println();
		}
	}
}