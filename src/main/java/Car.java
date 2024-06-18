public class Car {
    private CarName name;
    private CarPosition position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition(0);
    }

    public Car(String name, int position) {
        this.name = new CarName(name);
        this.position = new CarPosition(position);
    }

    public void move(int randomValue) {
        if (isMoved(randomValue))
            position = position.plusOne();
    }

    public boolean isWinner(CarPosition maxPosition) {
        return maxPosition.equals(this.position);
    }

    public CarPosition getPosition() {
        return position;
    }

    private boolean isMoved(int randomValue) {
        return randomValue >= 4;
    }
}
