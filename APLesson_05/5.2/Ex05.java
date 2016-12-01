import java.util.Scanner;
public class Ex05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You see the entrance of an ominous looking cave, do you want to \n1. Enter the cave \n2. Keep out of trouble");
		int answer1 = kb.nextInt();
		
		if ( answer1 == 1)
		{
			System.out.println("You enter the cave. After a couple of minutes you \nfind yourself surrounded by a horde of angry cobolds. Do you want to \n 1. Fight the cobolds \n 2. Run from the cobolds ");
			int answer2 = kb.nextInt();
			if (answer2 ==1)
				System.out.println("You decide to fight the cobolds and decimate the horde in a bloody battle! Do you want to \n 1. Recover from battle \n 2. Try to find a way out of the cave");
			else
				System.out.println("You try to run but the cobolds are just to fast for you. You are forced to fight for your life and kill all the cobolds. Do you want to \n 1. Recover from battle \n 2. Try to find a way out of the cave");
			int answer3 = kb.nextInt();
			if(answer3 == 1)
				System.out.println("You recover from battle and swiftly find the way out of the cave the next morning.\n GAME OVER");
			else
				System.out.println("You find the way out of the cave, however shortly after exiting the cave you die of exhaustion.\n GAME OVER");
		
		
		}
		
		else
		{
			System.out.println("You decide to turn around and go back home. \nHowever after a few minutes you get kidnapped by an angy horde of cobolds which drag you in the cave. Do you want to \n 1. fight the cobolds \n 2. Try to escape from the cave.");
			int answer4 = kb.nextInt();
			if (answer4 ==1)
				System.out.println("You decide to fight the cobolds and decimate the horde in a bloody battle! Do you want to \n 1. Recover from battle \n 2. Try to find a way out of the cave");
			else
				System.out.println("You try to run but the cobolds are just to fast for you. You are forced to fight for your life and kill all the cobolds. Do you want to \n 1. Recover from battle \n 2. Try to find a way out of the cave");
			int answer5 = kb.nextInt();
			if(answer5 == 1)
				System.out.println("You recover from battle and swiftly find the way out of the cave the next morning.\n GAME OVER");
			else
				System.out.println("You find the way out of the cave, however shortly after exiting the cave you die of exhaustion.\n GAME OVER");
		}
	}
}