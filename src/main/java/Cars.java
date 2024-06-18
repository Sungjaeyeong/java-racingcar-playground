import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> findWinners() {
        return cars.stream()
                .filter(car -> car.isWinner(getMaxPosition()))
                .toList();
    }

    private CarPosition getMaxPosition() {
        CarPosition maxPosition = new CarPosition(0);
        for (Car car : cars) {
            CarPosition carPosition = car.getPosition();
            if (carPosition.greaterThan(maxPosition))
                maxPosition = carPosition;
        }
        return maxPosition;
    }
}
