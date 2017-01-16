import java.lang.Math;
public class MilesPerHour {
	private int dist, hours, min;
    private double mph;
    public MilesPerHour() {
        dist = 0; 
		hours = 0; 
		min	= 0;
        mph = 0;
    }
    public MilesPerHour(int m_dist, int m_hours, int m_min) {
        dist = m_dist;
        hours = m_hours;
        min = m_min;
        mph = 0;
    }
    public void setVars(int m_dist, int m_hours, int m_min) {
        dist = m_dist;
        hours = m_hours;
        min = m_min;
    }
    public double getMPH() {
        mph = Math.round(dist / (hours + min / 60));
        return mph;
    }
}