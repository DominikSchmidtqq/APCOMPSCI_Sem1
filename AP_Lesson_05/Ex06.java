import java.util.Scanner;
public class Ex06
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		String username = "User";
		String password = "Password";
		
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("What is the Username?");
		String entUsername = kb.next();
		System.out.println("What is the Password");
		String entPassword = kb.next();
		if (entUsername.equals("User"))
		{
			if (entPassword.equals("Password"))
				System.out.println("Your Password and Username are right. You are granted access.");
		
			else
				System.out.println("Your username is wrong but your password is right. Try again.");
				passCheck();
		}
		else
		{
			if (entPassword.equals("Password"))
			{
				System.out.println("Your Username is wrong but the password is right try again.");
				passCheck();
			}
			else
			{
				System.out.println("Your password and username are wrong. Try again.");
				passCheck();
			}
		}
	}
	
}