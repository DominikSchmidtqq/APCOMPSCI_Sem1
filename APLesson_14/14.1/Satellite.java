import java.util.ArrayList;
public class Satellite {
	public static void main(String[]args) {
		ArrayList<Location> locate = new ArrayList<>();
		double[] positions = new double [6];
		for(int i = 0; i<6; i++) {
			positions [i] = (double)(Math.random() *100) +1;
		}
		double[] honLoc = {positions[1], positions[2]};
		String pos23 = positions[2] +", "+ positions[3];
		locate.add(new Honda(honLoc));
		locate.add(new Toyota(pos23));
		locate.add(new GMC(positions [4], positions[5]));
        double[] home = {0, 0};
        String printout = "\n\n" +"==========================" + "\nStarting locations...";
        for (Location l : locate) {
			l.setID();
			printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
        }
        printout += "\n\n" + "==========================" + "\nDistance from home...";
		for (Location l : locate) {
			printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
		}
		System.out.println(printout);
   }
   public static double getDistance(double[] car, double[] home) {
	   return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }
   public static String getLocation(double[] loc) {
	   return loc[0] + ", " + loc[1];
   }
}