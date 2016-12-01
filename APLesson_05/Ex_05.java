import java.util.Scanner;
public class Ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the first item?");
		String item1 = kb.next();
		System.out.println("What is the price of the item?");
		double price1 = kb.nextDouble();
		
		System.out.println("What is the next item?");
		String item2 = kb.next();
		System.out.println("What is the price of the second item?");
		double price2 = kb.nextDouble();
		
		System.out.println("What is the next item?");
		String item3 = kb.next();
		System.out.println("What is the price of the third item?");
		double price3 = kb.nextDouble();
		
		System.out.println("What is the last item");
		String item4 = kb.next();
		System.out.println("What is the price of the last item?");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discountsubtotal = 0.0;
		double discount = 0.0;
		if (discount(subtotal))
		{
			discount = .15 * subtotal;
			discountsubtotal = (1.00 - .15) * subtotal;
		}
		double firggintaxes = discountsubtotal * .1;
		double netTotal = (1.00 + .1) * discountsubtotal;
		
		System.out.println("<<<<<<<<<<<<<<<<<<Receipt>>>>>>>>>>>>>>>>>>\n");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		format("Subtotal", subtotal);
		if (discount(subtotal))
		{
			format("Discount", discount);
		}
		else
		{
			format("Discount", 0.00);
		}
		format("Net Subtotal", discountsubtotal);
		format("Tax", firggintaxes);
		format("Total", netTotal);
		System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");
	}
	public static void format(String item, double price)
	{
		System.out.printf("\t%12s------------ %5.2f\n", item, price);
	}
	public static boolean discount(double subtotal)
	{
		if (subtotal <= 2000)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
}
