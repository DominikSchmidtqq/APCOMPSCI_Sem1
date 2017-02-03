import java.util.*;
public class ToyStore {
    private ArrayList<Toy> toyList = new ArrayList<>();
    public ToyStore(String ts) {
        loadToys(ts);
    }
	
    public void loadToys(String ts) {
        ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
        for(int i=0; i<toys.size(); i+=2) {
            String name = toys.get(i);
            String type = toys.get(i+1);
            Toy bar = this.getThatToy(name);
            if(bar == null) {
                if(type.equalsIgnoreCase("Car")) {
                    toyList.add(new Car(name));
                }
                else if(type.equalsIgnoreCase("Action Figure")) {
                    toyList.add(new AFigure(name));
                }
            }
            else {
                bar.setCount(bar.getCount() + 1);
            }
        }
    }
	
    public Toy getThatToy(String title) {
        for(Toy t : toyList) {
            if(t.getName().equals(title)) {
                return t;
            }
        }
        return null;
    }
	
    public String getMostFrequentToy() {
        String name = "";
        int max = Integer.MIN_VALUE;
        for(Toy t : toyList) {
            if(max < t.getCount()) {
                max = t.getCount();
                name = t.getName();
            }
        }
        return name;
    }
	
    public String getMostFrequentType() {
        int cars = 0, figures = 0;
        for(Toy t : toyList) {
            if(t.getType().equals("Car")) {
                cars++;
            }
            else if(t.getType().equals("Action Figure")) {
                figures++;
            }
        }
        if(cars > figures) {
            return "There are more Cars";
        }
        else if(figures > cars) {
            return "There are more action figures";
        }
        else {
            return "Same amount of action figures and cars";
        }
    }
	
    public String toString() {
        return toyList + "";
    }
}