package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test()
    @DisplayName("자동차 이름이 5자를 초과할 경우 예외가 발생해야 한다.")
    void 자동차_이름_5자_이내() {
        Assertions.assertThatThrownBy(() -> new Car("aaaaaa"))
                .isInstanceOf(RuntimeException.class);
    }
}