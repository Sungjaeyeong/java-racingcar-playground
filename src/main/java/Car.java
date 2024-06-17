public class Car {
    private String name;
    private CarPosition position;

    public Car(String name) {
        if (name.length() > 5)
            throw new IllegalArgumentException("자동차의 이름은 5자를 초과할 수 없습니다.");
        this.name = name;
        this.position = new CarPosition(0);
    }

    public void move() {
        position = position.plusOne();
    }

    public CarPosition getPosition() {
        return position;
    }
}
