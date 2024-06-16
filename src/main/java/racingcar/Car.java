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

    public Car(String name, int location) {
        if (name.length() > 5) {
            throw new RuntimeException();
        }
        this.name = name;
        this.location = location;
    }

    public void move(int fuel) {
        if (isPossibleMove(fuel)) this.location++;
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String markLocation() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < location; i++) {
            result.append("-");
        }
        return result.toString();
    }

    private boolean isPossibleMove(int number) {
        return number >= 4;
    }

}
