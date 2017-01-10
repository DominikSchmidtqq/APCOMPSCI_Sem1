import java.util.*;
public class DistanceRunner {
    static int x, y, z, xy;
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first x coordinate");
        x = kb.nextInt();
        System.out.println("Enter the second x coordinate");
        z = kb.nextInt();
        System.out.println("Enter the first y component");
        y = kb.nextInt();
        System.out.println("Enter the second y component:");
        xy = kb.nextInt();
        Distance point = new Distance();
        point.setVars(x, y, z, xy);
        System.out.println("The distance between ("+ x +"," + y + ") and (" + z + "," + xy + ") is: " + point.getDist());
    }
}