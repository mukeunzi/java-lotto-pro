package lotto.ui;

import lotto.domain.Lottos;

import java.util.Map;

public interface ResultView {

    void printPurchaseAmountMessage();
    void printPurchaseAckMessage(int count);
    void printLottos(Lottos lottos);
    void printLastWinLottoNumbersMessage();
    void printWinStatisticMessage();
    void printCorrespondLottoNumber(Map<Integer, Integer> statistic);
    void printTotalRevenueMessage(double percentage);
}