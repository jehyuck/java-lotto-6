package lotto;

import lotto.lottoGame.LottoGame;
import lotto.lottoGame.LottoRandomGenerator;
import lotto.lottoService.LottoService;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        LottoRandomGenerator lottoRandomGenerator = new LottoRandomGenerator();
        LottoGame lottoGame = new LottoGame(lottoRandomGenerator);

        lottoGame.run();
    }
}
