import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {
    @Test
    void 자동차_이름은_5자를_초과할_수_없다() {
        assertThatThrownBy(() -> new CarName("kiaaaa")).isInstanceOf(IllegalArgumentException.class);
    }
}