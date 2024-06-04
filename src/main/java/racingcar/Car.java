package racingcar;

public class Car {
    String name;

    public Car(String name) {
        if (name.length() > 5) {
            throw new RuntimeException();
        }
        this.name = name;
    }
}
