public class Honda extends Car {
    private double x1, y1;
    public Honda(double[] pos) {
        super();
        move(pos[0], pos[1]);
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