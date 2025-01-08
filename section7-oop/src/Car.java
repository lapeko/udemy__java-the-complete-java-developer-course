public class Car {
    private int numberOfDoors;

    public Car() {
        this(4);
    }

    public Car(int doors) {
        numberOfDoors = doors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
