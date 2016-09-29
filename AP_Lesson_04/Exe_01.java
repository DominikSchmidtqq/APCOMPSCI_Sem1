import java.util.scanner;
public Rectangle
{
	
	static int l;
	static int w;
	
	
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length?")
		l = kb.nextInt();
		System.out.println("What is the width?");
		w = kb.nextInt90;
		calcPerim();
		print();
		
	}
	public static int calcPerim(int l, int w)
	{
		return(2*l + 2*w);
	}
	
	public static void print()
	{
		System.out.prinln("Your rectangle is" + calcPerim + " feet around.")
	}
}