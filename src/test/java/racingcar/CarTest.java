package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {
    @Test()
    @DisplayName("자동차 이름이 5자를 초과할 경우 예외가 발생해야 한다.")
    void 자동차_이름_5자_이내() {
        assertThatThrownBy(() -> new Car("aaaaaa"))
                .isInstanceOf(RuntimeException.class);
    }

    @Test()
    @DisplayName("자동차의 연료가 4 이상일 경우 위치가 1 증가한다.")
    void 자동차_위치_1증가() {
        Car car = new Car("kia");
        car.move(4);
        assertThat(car.getLocation()).isEqualTo(1);
    }
    @Test()
    @DisplayName("자동차의 연료가 4 미만일 경우 위치는 그대로다.")
    void 자동차_위치_유지() {
        Car car = new Car("kia");
        car.move(3);
        assertThat(car.getLocation()).isEqualTo(0);
    }

    @Test()
    @DisplayName("자동차의 위치만큼 '-'의 개수로 표현한다.")
    void 자동차_위치_표시() {
        Car car = new Car("kia", 4);
        assertThat(car.markLocation()).isEqualTo("----");
    }
}