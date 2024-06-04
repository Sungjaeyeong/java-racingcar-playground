package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GameSystemTest {
    @Test()
    void 연료의_양은_0에서_9사이() {
        int fuel = GameSystem.getFuel();
        assertThat(fuel).isBetween(0, 9);
    }
}