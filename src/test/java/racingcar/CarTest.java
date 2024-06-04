package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test()
    @DisplayName("자동차 이름이 5자를 초과할 경우 예외가 발생해야 한다.")
    void 자동차_이름_5자_이내() {
        assertThatThrownBy(() -> new Car("aaaaaa"))
                .isInstanceOf(RuntimeException.class);
    }

    @Test()
    @DisplayName("자동차가 전진할 경우 위치가 1만큼 증가한다.")
    void 자동차_전진시_위치_1증가() {
        Car car = new Car("kia");
        car.move();
        assertThat(car.getLocation()).isEqualTo(1);
    }

    @Test()
    @DisplayName("4")
    void 전달값이_4이상인_경우_전진가능() {
        Car car = new Car("kia");
        assertTrue(car.isPossibleMove(4));
        assertFalse(car.isPossibleMove(3));
    }
}