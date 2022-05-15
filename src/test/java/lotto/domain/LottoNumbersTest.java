package lotto.domain;

import calculator.utils.Splitter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

public class LottoNumbersTest {
    @DisplayName("6자리가 아닐 경우 오류가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"1", "1,2,3", "1,2,3,4,5,6,7"})
    void checkExceptionWithNoneSixNumbers(String numbers) {
        assertAll(
            () -> assertThatThrownBy(() ->
                new LottoNumbers(Splitter.splitString(numbers))
            ).isInstanceOf(IllegalArgumentException.class)
        );
    }

    @DisplayName("중복되는 숫자가 있을 경우 오류가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"1,2,3,4,5,5", "1,1,1,2,3,4", "6,6,6,6,6,6"})
    void checkExceptionWithDuplicatedNumbers(String numbers) {
        assertAll(
            () -> assertThatThrownBy(() ->
                new LottoNumbers(Splitter.splitString(numbers))
            ).isInstanceOf(IllegalArgumentException.class)
        );
    }

    @DisplayName("6자리일 경우 값이 정상적으로 생성된다.")
    @ParameterizedTest
    @CsvSource(value = {"1,2,3,4,5,6:6", "1,20,21,33,36,45:6"}, delimiter = ':')
    void checkSixNumbers(String numbers, int size) {
        assertAll(
            () -> assertThat(new LottoNumbers(Splitter.splitString(numbers)).getLottoNumbers().size()).isEqualTo(size)
        );
    }
}