public class Tram extends Vehicle {
    @Override
    public void start() {
        System.out.println("Tram started");
    }

    public void closeDoors() {
        System.out.println("Attention. The doors are closed.");
    }
}
