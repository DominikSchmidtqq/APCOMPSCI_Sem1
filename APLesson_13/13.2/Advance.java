public class Advance extends TicketSuper {
	private int daysleft1;
	public Advance(int daysleft) {
		this.daysleft1 = daysleft;
	}
	public double getPrice() {
		if (daysleft1 >= 10) {
			return 30.0;
		}
		else {
			return 40.0;
		}
	}
}