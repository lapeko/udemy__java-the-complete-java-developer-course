public class Main {
    public static void main(String[] args) {
//        Car car = null;
        Car car = new Car();
        System.out.println(car.getNumberOfDoors());
        car.setNumberOfDoors(5);
        System.out.println(car.getNumberOfDoors());
        CarRec car2 = new CarRec(3);
        System.out.println(car2.numberOfDoors());
//        car2.numberOfDoors(2); // not allowed
    }
}