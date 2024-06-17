import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {
    @Test
    void 자동차의_초기_위치는_0이다() {
        Car car = new Car("kia");
        assertThat(car.getPosition()).isEqualTo(new CarPosition(0));
    }

    @Test
    void 랜덤값이_4이상이면_자동차가_전진한다() {
        Car car = new Car("kia");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(new CarPosition(1));
    }

    @Test
    void 랜덤값이_4미만이면_자동차가_전진하지_않는다() {
        Car car = new Car("kia");
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(new CarPosition(0));
    }
}