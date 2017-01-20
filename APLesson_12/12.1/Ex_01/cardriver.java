import java.util.Scanner;
public class cardriver {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the paint ");
        String paint = keyboard.nextLine();
        System.out.println("Enter the interior ");
        String interior = keyboard.nextLine();
        System.out.println("Enter the engine configuration");
        String engine = keyboard.nextLine();
        System.out.println("Enter the wheels ");
        String wheels = keyboard.nextLine();
        car cCar = new car(paint, interior, engine, wheels);
        System.out.println("Your rice mobile is ready!");
        System.out.println("Paint:\t" + cCar.getPaint());
        System.out.println("Interior:\t" + cCar.getInterior());
        System.out.println("Engine:\t" + cCar.getEngine());
        System.out.println("Wheels:\t" + cCar.getWheels());
    }
}