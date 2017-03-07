import java.util.*;
public abstract class Car implements Location {
	private int ID;
	public Car() {
		ID = (int)(Math.random() * 1000000) + 100000;
	}
	public abstract void move(double x, double y);
	public int getID() {
		return ID;
	}
}