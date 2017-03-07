public class GMC extends Car {
    private double x1, y1;
    public GMC(double x, double y) {
        move(x, y);
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