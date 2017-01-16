import java.util.Scanner;
public class MPHRunner {
    static int dist, hours, min;
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a distance");
        dist = kb.nextInt();
        System.out.println("Enter the hours");
        hours = kb.nextInt();
        System.out.println("Enter the minutes");
        min = kb.nextInt();
        MilesPerHour miles = new MilesPerHour();
        miles.setVars(dist, hours, min);
        System.out.println(dist + " miles in " + hours + " hours and " + min + " minutes results in a speed of " + miles.getMPH() + " MPH.");
    }
}
