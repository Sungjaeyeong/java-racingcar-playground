import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class CarsTest {
    @Test
    void test()
    {
        Car aaa = new Car("aaa", 1);
        Car bbb = new Car("bbb", 2);
        Car ccc = new Car("ccc", 3);
        Cars cars = new Cars(Arrays.asList(aaa, bbb, ccc));

        assertThat(cars.findWinners()).isEqualTo(List.of(ccc));
    }
}