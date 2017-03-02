public class Honda implements Location {
    private double x1, y1;
    private int ID;
    public Honda(double[] pos) {
        move(pos[0], pos[1]);
    }
    public void setID() {
        ID = (int)(Math.random() * 999999) + 99999;
    }
    public int getID() {
        return ID;
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