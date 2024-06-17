public class Car {
    private String name;
    private int position;

    public Car(String name) {
        if (name.length() > 5)
            throw new IllegalArgumentException("자동차의 이름은 5자를 초과할 수 없습니다.");
        this.name = name;
    }

    public void move() {
        position++;
    }

    public int getPosition() {
        return position;
    }

}
