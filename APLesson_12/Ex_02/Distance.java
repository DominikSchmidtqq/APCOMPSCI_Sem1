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
    public Distance(int m_x, int m_y, int m_z, int m_xy) {
        x = m_x;
        y = m_y;
        z = m_z;
        xy = m_xy;
        dist = 0;
    }
    public void setVars(int m_x, int m_y, int m_z, int m_xy) {
        x = m_x;
        y = m_y;
        z = m_z;
        xy = m_xy;
    }
    public double getDist() {
        dist = Math.sqrt((y-x)*(y-x)+(xy-z)*(xy-z));
        return dist;
    }
}
