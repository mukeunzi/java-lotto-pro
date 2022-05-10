import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetCollectionTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("중복이 잘 제거되었는지 Set의 사이즈를 확인한다.")
    void checkSetSize() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @DisplayName("Set에 1, 2, 3이 존재하는지 확인한다.")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void checkHasValue(int input) {
        assertThat(numbers.contains(input)).isTrue();
    }
}
