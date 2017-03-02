import java.util.*;
public class Toyota implements Location {
	Scanner kb = new Scanner(System.in);
	private double x1, y1;
	private int ID;
	public Toyota(String pos) {
		ArrayList<String> position = new ArrayList<>(Arrays.asList(pos.split(", ")));
		double xpos = Double.parseDouble(position.get(0));
		double ypos = Double.parseDouble(position.get(1));
		move(xpos, ypos);
	}
	public void setID() {
		ID = (int)(Math.random()*999999) + 99999;
	}
	public int getID() {
		return ID;
	}
	public void move(double x, double y) {
		this.x1 += x;
		this.y1 += y;
	}
	public double [] getLoc() {
		double [] coords = {x1, y1};
		return coords;
	}
}