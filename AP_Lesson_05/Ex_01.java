
public class Ex_01
{
	public static void main(String[]args)
	{
		int player = (int) (1+Math.random()*6);
		int computer = (int) (1+Math.random()*6);
	
	if (player < computer)
		{
			System.out.println("The computer rolled "+ computer+ " and won.");
		}
		if (player > computer)
		{
			System.out.println("You rolled "+ player+ " and won.");
		}
		
	}
}