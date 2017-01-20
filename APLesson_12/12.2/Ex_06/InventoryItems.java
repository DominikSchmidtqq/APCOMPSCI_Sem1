import java.math.*;
import java.util.*;
public class InventoryItems {
	private String manufacturer, name, category;
	private long UPC;
	private double price;
	public InventoryItems(String m, String n) {
		manufacturer = m;
		name = n;
		UPC = (long)(Math.random()*9999999)+1;
	}
	public InventoryItems(String m, String n, String c, double p){
		manufacturer = m;
		name = n;
		category = c;
		UPC = UPC = (long)(Math.random()*9999999)+1;
		price = p;
	}
	public String toString() {
		return "Item \nManufacturer: "+manufacturer+"\nName: "+name+"\nCategory: "+category+"\nUPC: "+UPC+"\nPrice: "+price;
	}
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		System.out.println("Will you be entering category and price?(yes or no)");
		String admin = kb.nextLine();
		if (admin.equalsIgnoreCase("yes")) {
			System.out.println("Enter the manufacturer:");
			String m = kb.nextLine();
			System.out.println("Enter the name:");
			String n = kb.nextLine();
			System.out.println("Enter the category:");
			String c = kb.nextLine();
			System.out.println("Enter the price:");
			double p = kb.nextDouble();
			InventoryItems it = new InventoryItems(m, n, c, p);
			System.out.println(it.toString());
		}
		else {
			System.out.println("Enter the manufacturer:");
			String m = kb.nextLine();
			System.out.println("Enter the name:");
			String n = kb.nextLine();
			InventoryItems it = new InventoryItems(m,n);
			System.out.println(it.toString());
		}
	}
}
