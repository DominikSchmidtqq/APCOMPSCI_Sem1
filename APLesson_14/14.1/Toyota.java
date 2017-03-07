import java.util.*;
public class Toyota extends Car {
    private double x1, y1;
    public Toyota(String pos) {
        super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(pos.split(", ")));
        Double posX = Double.parseDouble(position.get(0)), posY = Double.parseDouble(position.get(1));
        move(posX, posY);
    }
    public void move(double x, double y) {
        this.x1 += x;
        this.y1 += y;
    }
    public double[] getLoc() {
        double[] coords = {x1, y1};
        return coords;
    }
}