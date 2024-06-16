package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> cars) {
        this.carList = cars;
    }

    public int maxCarLocation() {
        int result = 0;
        for (Car car : carList) {
            if (car.getLocation() > 0) result = car.getLocation();
        }
        return result;
    }

    public List<Car> maxLocationCars() {
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            if (car.getLocation() == maxCarLocation()) result.add(car);
        }
        return result;
    }

    public void moveAll() {
        carList.forEach(car -> car.move(GameSystem.getFuel()));
    }

    public void printResultOfCars() {
        for (Car car : carList) {
            System.out.println(car.getName() + " : " + car.markLocation());
        }
    }
}
