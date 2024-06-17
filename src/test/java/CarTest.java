import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {
    @Test
    void 자동차의_초기_위치는_0이다() {
        Car car = new Car("kia");
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void 자동차가_전진할_경우_위치는_1만큼_증가한다() {
        Car car = new Car("kia");
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 자동차_이름은_5자를_초과할_수_없다() {
        assertThatThrownBy(() -> new Car("kiaaaa")).isInstanceOf(IllegalArgumentException.class);
    }
}