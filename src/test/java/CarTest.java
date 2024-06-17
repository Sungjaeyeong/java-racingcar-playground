import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void 자동차의_초기_위치는_0이다() {
        Car car = new Car("kia");
        Assertions.assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void 자동차가_전진할_경우_위치는_1만큼_증가한다() {
        Car car = new Car("kia");
        car.move();
        Assertions.assertThat(car.getPosition()).isEqualTo(1);
    }
}