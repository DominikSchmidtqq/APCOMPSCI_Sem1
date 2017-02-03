public class ToyRunner {
    private AFigure action = new AFigure();
    private Car auto = new Car();
    public ToyRunner() {
        toString(action.getName(), action.getCount());
        toString(auto.getName(), auto.getCount());
    }
    public String toString(String name, int count) {
        return name + ", " + count + "\n";
    }
	public static void main(String args[]) {
	}
}