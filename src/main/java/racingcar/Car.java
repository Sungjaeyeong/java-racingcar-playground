package racingcar;

import java.util.Random;

public class Car {
    String name;
    int location;

    public Car(String name) {
        if (name.length() > 5) {
            throw new RuntimeException();
        }
        this.name = name;
    }

    public void move(int fuel) {
        if (isPossibleMove(fuel)) this.location++;
    }

    public int getLocation() {
        return location;
    }

    private boolean isPossibleMove(int number) {
        return number >= 4;
    }
}
