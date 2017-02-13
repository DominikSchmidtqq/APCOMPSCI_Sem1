public class StudentAdvance extends Advance {
	private int daysleft1;
	public StudentAdvance(int daysleft) {
		super(daysleft);
		this.daysleft1 = daysleft;
	}
	public double getPrice() { 
		if(daysleft1 >= 10) {
			return 15.0;
		}
		else {
			return 20.0;
		}
	}
	public String toString() { 
		return "Serial Number:" + getSerial() + "\nPrice:" + getPrice() + "\nStudent ID required"; 
	}
}