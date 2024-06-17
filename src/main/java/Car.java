public class Car {
    private CarName name;
    private CarPosition position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition(0);
    }

    public void move(int randomValue) {
        if (isMoved(randomValue))
            position = position.plusOne();
    }

    public CarPosition getPosition() {
        return position;
    }

    private boolean isMoved(int randomValue) {
        return randomValue >= 4;
    }
}
