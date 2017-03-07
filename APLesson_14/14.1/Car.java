import java.util.*;
public abstract class Car implements Location {
	private int id;
	public Car() {
		id = (int)(Math.random()* 999999) + 99999;
	}
	public int getID() {
		return id;
	}
}