import java.util.*;
public class ToyStore {
    private ArrayList<Toy> toyList = new ArrayList<>();
    public ToyStore(String ts) {
        loadToys(ts);
    }
    public void loadToys(String ts) {
        ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
        for(int i=0; i<toys.size(); i++) {
            String name = toys.get(i);
            String type = toys.get(i+1);
            Toy toy;
        }
    }
    public Toy getThatToy(String nm) {
        for(Toy t : toyList) {
            if(t.getName().equals(nm)) {
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
            return "Cars!";
        }
        else if(figures > cars) {
            return "Action figures!";
        }
        else {
            return "Equal amounts of action figures and cars!";
        }
    }
    /*public String toString() {
        return
    }*/
}