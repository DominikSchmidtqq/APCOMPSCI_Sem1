import java.util.*;
public abstract class TicketSuper {
	public int getSerial() {
		return (int)(Math.random() * 9999999) + 1000000;
	}
	public abstract double getPrice();
	public String toString() {
		return "Serial Number: "+ getSerial() + "\nPrice: $"+ getPrice();
	}
}