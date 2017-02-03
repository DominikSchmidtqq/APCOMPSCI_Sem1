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
        ToyStore store = new ToyStore("Hotwheel, Car, G.I.Joe, Action Figure, PennyRacer, Car, Matchbox, Car, Star Wars, Action Figure, Pullback, Car, Star Wars, Action Figure");
        System.out.println(store.getMostFrequentType());
		System.out.println(store.getMostFrequentToy());
		System.out.println(store.toString());
    }
}