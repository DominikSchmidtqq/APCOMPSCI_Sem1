public class GMC implements Location {
    private double x1, y1;
    private int id;
    public GMC(double x, double y) {
        move(x, y);
    }
    public void setID() {
        id = (int)(Math.random() * 999999) + 99999;
    }
    public int getID() {
		return id;
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