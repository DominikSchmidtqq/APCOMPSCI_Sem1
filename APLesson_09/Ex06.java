public class Ex06{
	public static void main(String args []){
		int array [] = new int [10];
		fillArray(array);
		System.out.println("For the following numbers");
		printArray(array);
		//System.out.println();
		System.out.println("The biggest number is " + getNum(array));
	}
	public static void fillArray(int numbers []){
		for(int i=0; i<numbers.length;i++){
			numbers [i] = (int)(Math.random()*100)+1;
		}
	}
	public static void printArray(int numbers []){
		for (int num:numbers){
			System.out.println(num+" ");
		}
	}
	public static int getNum(int numbers []){
		int max=0;
		for(int number:numbers){
			if (number>max){
				max=number;
			}
		}
		return max;
	}
}