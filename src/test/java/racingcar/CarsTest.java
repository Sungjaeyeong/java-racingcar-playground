package racingcar;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class CarsTest {
    @Test
    void 가장_멀리_이동한_자동차의_위치() {
        Car kia = new Car("kia", 5);
        Car tesla = new Car("tesla", 6);
        Car h = new Car("h", 7);

        List<Car> carList = new ArrayList<>();
        carList.add(kia);
        carList.add(tesla);
        carList.add(h);

        Cars cars = new Cars(carList);
        assertThat(cars.maxCarLocation()).isEqualTo(7);
    }

    @Test
    void 가장_멀리_이동한_자동차_리스트() {
        Car kia = new Car("kia", 5);
        Car tesla = new Car("tesla", 5);
        Car h = new Car("h", 5);

        List<Car> carList = new ArrayList<>();
        carList.add(kia);
        carList.add(tesla);
        carList.add(h);

        Cars cars = new Cars(carList);
        assertThat(cars.maxLocationCars()).isEqualTo(carList);
    }
}
