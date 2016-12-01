import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Ex_02 form = new Ex_02();
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Enter first your first name");
		String item1 = kb.nextLine();
		
		System.out.println("Enter your last name");
		String ite2 = kb.nextLine();
		
		System.out.println("Enter your title");
		String item3 = kb.nextLine();
		
		System.out.println("Enter the school site");
		String ite4 = kb.nextLine();
		
		System.out.println("Enter the school year");
		String item5 = kb.nextLine();
		
		System.out.println("What is your subject?");
		String ite6 = kb.nextLine();
		
		System.out.println("*************************");
	
		form.format(item1, ite2);
		form.format(item3, ite4);
		form.format(item5, ite6);
		
		System.out.println("\n*************************");
		
	}
	
	public void format(String item, String ite)
	{
		System.out.printf("\n*  %10s %10s *", item, ite);
	}
	
}