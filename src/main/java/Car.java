public class Car {
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        position++;
    }

    public int getPosition() {
        return position;
    }

}
