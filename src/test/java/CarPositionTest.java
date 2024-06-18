import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarPositionTest {
    @Test
    void 위치값이_같으면_같다() {
        assertThat(new CarPosition(0)).isEqualTo(new CarPosition(0));
    }

    @Test
    void 위치값_1증가() {
        CarPosition zeroPosition = new CarPosition(0);
        CarPosition onePosition = zeroPosition.plusOne();
        assertThat(onePosition).isEqualTo(new CarPosition(1));
    }

    @Test
    void 위치_크기_비교() {
        CarPosition zeroPosition = new CarPosition(0);
        CarPosition onePosition = new CarPosition(1);
        assertThat(onePosition.greaterThan(zeroPosition)).isTrue();
    }
}