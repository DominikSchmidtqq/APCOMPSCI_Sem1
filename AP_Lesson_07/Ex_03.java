import java.util.Scanner;
public class Ex_03
{
	static int rev = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = kb.nextInt();
		getReverse(number);
		
		System.out.println(number + " reversed is "+ rev);
	}
	public static void  getReverse(int num)
	{
		
		while(num > 0)
		{
			rev*=10;
			rev+=(num%10);
			num/=10;
		}
	}
}