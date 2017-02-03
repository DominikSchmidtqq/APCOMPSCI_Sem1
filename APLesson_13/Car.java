public class Car extends Toy {
    public Car() {
        super("Car");
        Car figure = new Car();
        figure.getType();
    }
    public String getType() {
        return "Car";
    }
}