import java.util.Scanner;
public class Ex_01
{
	public static void main (String[]args)
	{
		
		Ex_01 form = new Ex_01();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter first item");
		String item1 = kb.next();
		System.out.println("Enter price");
		double price1 = kb.nextDouble();
		
		System.out.println("Enter next item");
		String item2 = kb.next();
		System.out.println("Enter price");
		double price2 = kb.nextDouble();
		
		
		System.out.println("Enter next item");
		String item3 = kb.next();
		System.out.println("Enter price");
		double price3 = kb.nextDouble();
		
		
		
		
		double total = price1 + price2 + price3;
		
		
		double price4 = total * .1;
		String item4 = "tax";
		
		
		
		double price5 = price4 + total;
		String item5 = ("Total");
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
		form.format("Subtotal", total);
		form.format(item5, price5);
		System.out.println("\n<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");

	}
	
	public void format(String item,  double price)
	{
		
		System.out.printf("\n%17s  %17.2f", item, price);
		
		
	}
	
}