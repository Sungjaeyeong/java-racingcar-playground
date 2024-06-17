public class Car {
    private CarName name;
    private CarPosition position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition(0);
    }

    public void move() {
        position = position.plusOne();
    }

    public CarPosition getPosition() {
        return position;
    }
}
