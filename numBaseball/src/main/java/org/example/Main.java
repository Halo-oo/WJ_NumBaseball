package org.example;

import org.example.problemPosed.NumberBaseballGame;
import org.example.system.ResultView;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final String GAME_END_SIGN_STRING = "yes";

        final ResultView resultView = new ResultView();

        final NumberBaseballGame numberBaseballGame = new NumberBaseballGame();

        /* 숫자야구 */
        String gameRestartStatus = "start";
        while (!gameRestartStatus.equals(GAME_END_SIGN_STRING)) {
            resultView.printMessageToSystemOut("⚾️ 숫자야구 게임을 시작합니다.");

            // 1) (컴퓨터)_랜덤 숫자 3개 선택
            numberBaseballGame.answerNumberSelect();

            // 2) 정답을 맞출 때까지 게임 진행
            numberBaseballGame.playUntilCorrectAnswer();

            // 3) 게임 재시작 여부 확인
            gameRestartStatus = numberBaseballGame.askForPlayRestart();
        }
    }
}