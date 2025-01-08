public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    public void drift() {
        System.out.println("Vroom vroom!");
    }
}
