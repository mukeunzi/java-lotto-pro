package model.generator;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.InstanceOfAssertFactories;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import model.Lotto;
import model.LottoPaper;
import model.common.LottoNumbers;
import model.common.LottoRule;

@DisplayName("랜덤 로또 생성기")
class RandomLottoMachineTest {

	@Test
	@DisplayName("객체화")
	void instance() {
		assertThatNoException()
			.isThrownBy(() -> RandomLottoMachine.from(defaultLottoRule()));
	}

	@Test
	@DisplayName("규칙 없이 객체화하면 IllegalArgumentException")
	void instance_nullRule_thrownIllegalArgumentException() {
		assertThatIllegalArgumentException()
			.isThrownBy(() -> RandomLottoMachine.from(null));
	}

	@Test
	@DisplayName("로또 생성")
	void lotto() {
		//given
		LottoRule lottoRule = defaultLottoRule();

		//when
		Lotto lotto = RandomLottoMachine.from(lottoRule)
			.lotto();

		//then
		assertThat(lotto)
			.isInstanceOf(LottoPaper.class)
			.extracting("lottoNumbers")
			.isInstanceOf(LottoNumbers.class)
			.extracting("collection", InstanceOfAssertFactories.LIST)
			.hasSize(6)
			.doesNotHaveDuplicates();
	}

	private LottoRule defaultLottoRule() {
		return LottoRule.of(1, 45, 6);
	}
}