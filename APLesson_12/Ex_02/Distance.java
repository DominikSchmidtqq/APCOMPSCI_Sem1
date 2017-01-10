public class Distance {
    private int x, z, y, xy;
    private double dist;
    public Distance() {
        x = 0; 
		y = 0; 
		z = 0; 
		xy = 0;
        dist = 0;
    }
    public Distance(int xx, int xy, int xz, int xxy) {
        x = xx;
        y = xy;
        z = xz;
        xy = xxy;
        dist = 0;
    }
    public void setVars(int xx, int xy, int xz, int xxy) {
        x = xx;
        y = xy;
        z = xz;
        xy = xxy;
    }
    public double getDist() {
        dist = Math.sqrt((y-x)*(y-x)+(xy-z)*(xy-z));
        return dist;
    }
}
