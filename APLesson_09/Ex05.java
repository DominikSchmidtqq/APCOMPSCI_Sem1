public class Ex05{
	public static void main(String args []){
		int [] array = new int[10];
		fillArray(array);
		System.out.println("For the following numbers ");
		printArray(array);
		System.out.println();
		System.out.println("There are "+ getOdds(array)+ " odd numbers");
	}
	public static void fillArray(int numbers []){
		for(int i=0; i<numbers.length; i++){
			numbers[i]=(int)(Math.random()*100)+1;
		}
	}
	public static void printArray(int numbers []){
		for(int num:numbers){
			System.out.print(num + " ");
		}
	}
	public static int getOdds(int numbers []){
		int odds=0;
		for(int number:numbers){
			if (number%2==0){
				odds++;
			}
		}
		return odds;
	}
}
