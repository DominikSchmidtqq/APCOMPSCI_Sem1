import java.util.Scanner;
public class Ex01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your Math letter grade?");
		String g1 = kb.next();
		double mathGradePoint = calcPoints(g1);
		
		System.out.println("What is your Science letter grade?");
		String g2 = kb.next();
		double scienceGradePoint = calcPoints(g2);
		
		System.out.println("What is your History letter grade?");
		String g3 = kb.next();
		double historyGradePoint = calcPoints(g3);
		
		System.out.println("What is your English letter grade?");
		String g4 = kb.next();
		double englishGradePoint = calcPoints(g4);
		
		System.out.println("What is your CompSci letter grade?");
		String g5 = kb.next();
		double compsciGradePoint = calcPoints(g5);
		
		System.out.println("What is your art letter grade?");
		String g6 = kb.next();
		double artGradePoints = calcPoints(g6);
		
		System.out.println("What is your Social Science letter grade?");
		String g7 = kb.next();
		double socialscienceGradePoints = calcPoints(g7);
		
		double gpa = (mathGradePoint + scienceGradePoint + historyGradePoint + englishGradePoint+ compsciGradePoint+ artGradePoints + socialscienceGradePoints)/7;
		System.out.println("Your GPA is "+ gpa + " !");
	}
	public static double calcPoints(String g)
	{
		if (g.equalsIgnoreCase("A"))
			return 4.0;
		if (g.equalsIgnoreCase("B"))
			return 3.0;
		if (g.equalsIgnoreCase("C"))
			return 2.0;
		if (g.equalsIgnoreCase("D"))
			return 1.0;
		else
			return 0.0;
	}

}
