import java.util.*;
public class Car implements Location {
	private final int ID = (int)(Math.random() * 1000000) + 100000;
	private double[] Loc;
	
	public Car() {
		Loc = new double[2];
	}
	
	public void move(double x, double y) {
		Loc[0] += x;
		Loc[1] += y;
	}
	public double[] getLoc() {
		return Loc;
	}
	
	public int getID() {
		return ID;
	}
}