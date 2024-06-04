package racingcar;

public class Car {
    String name;
    int location;

    public Car(String name) {
        if (name.length() > 5) {
            throw new RuntimeException();
        }
        this.name = name;
    }

    public void move() {
        this.location++;
    }

    public int getLocation() {
        return location;
    }

    public boolean isPossibleMove(int number) {
        return number >= 4;
    }
}
