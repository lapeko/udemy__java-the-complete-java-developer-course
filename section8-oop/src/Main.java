public class Main {
    public static void main(String[] args) {
        var tram = new Tram();
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Tram();
        tram.start();
        vehicle1.start();

        if (vehicle1 instanceof Car)
            ((Car) vehicle1).drift();

        if (vehicle2 instanceof Tram tr)
            tr.closeDoors();
    }
}