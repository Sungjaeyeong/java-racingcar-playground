import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {
    @Test
    void 자동차의_초기_위치는_0이다() {
        Car car = new Car("kia");
        assertThat(car.getPosition()).isEqualTo(new CarPosition(0));
    }

    @Test
    void 자동차가_전진할_경우_위치는_1만큼_증가한다() {
        Car car = new Car("kia");
        car.move();
        assertThat(car.getPosition()).isEqualTo(new CarPosition(1));
    }

}