package org.example;

import org.example.system.InputView;
import org.example.computer.NumberBaseball;
import org.example.system.ResultView;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final String GAME_END_SIGN_STRING = "yes";

        final ResultView resultView = new ResultView();
        final InputView inputView = new InputView();

        final NumberBaseball numberBaseball = new NumberBaseball();

        /* 숫자야구 */
        String gameRestartStatus = "start";
        while (!gameRestartStatus.equals(GAME_END_SIGN_STRING)) {
            numberBaseball.numberBaseballGame();    // 숫자야구 게임 시작

            resultView.printMessageToSystemOut("⚾ 정답입니다!");
            resultView.printMessageForInput("Game을 종료하시겠습니까? (yes / no)");
            gameRestartStatus = inputView.getUserInput();
        }
    }
}