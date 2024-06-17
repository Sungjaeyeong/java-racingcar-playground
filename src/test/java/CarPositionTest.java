import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarPositionTest {
    @Test
    void test() {
        assertThat(new CarPosition(0)).isEqualTo(new CarPosition(0));
    }
}