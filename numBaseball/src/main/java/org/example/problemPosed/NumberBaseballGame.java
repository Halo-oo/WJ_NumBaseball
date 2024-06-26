package org.example.problemPosed;

import org.example.baseBall.Ball;
import org.example.baseBall.Score;
import org.example.system.InputView;
import org.example.system.ResultView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class NumberBaseballGame {
    final Logger logger = LoggerFactory.getLogger(NumberBaseballGame.class);

    List<Ball> answerNumList;
    List<Ball> playerNumList;

    final ResultView resultView = new ResultView();
    final InputView inputView = new InputView();

    final SelectRandomNum selectRandomNum = new SelectRandomNum();
    final NumberComparator numberComparator = new NumberComparator();

    /**
     * (컴퓨터)_랜덤 숫자 3개 선택
     */
    public void answerNumberSelect() {
        answerNumList = selectRandomNum.getRandomNumList();
        logger.info("#ADMIN# 정답 숫자: {}", answerNumList);
    }

    /**
     * 정답을 맞출 때까지 게임 진행
     */
    public void playUntilCorrectAnswer() throws IOException {
        int strike = 0;

        while (strike != 3) {
            // (플레이어)_3개의 숫자 입력받기
            resultView.printMessageForInput("공백을 기준으로 3개의 숫자를 입력해주세요. [범위 : 1~9 까지]");
            String playerInputNum = inputView.getUserInput();
            playerNumList = inputView.getUserInputNumList(playerInputNum);

            if (playerNumList.size() != 3) {
                resultView.printMessageToSystemOut("❗️올바른 숫자 입력해주세요.");
                continue;
            }

            // 정답과 플레이어의 숫자 비교하여 점수 계산
            Score score = numberComparator.getBallAndStrikeCnt(answerNumList, playerNumList);
            strike = score.getStrike();

            // 결과(hint) 출력
            String hintMessage = numberComparator.compareResultMessage(score);
            resultView.printMessageToSystemOut(hintMessage);
        }
    }

    /**
     * 플레이어의 게임 재시작 여부 확인
     */
    public String askForPlayRestart() throws IOException {
        resultView.printMessageToSystemOut("⚾ 정답입니다!");
        resultView.printMessageForInput("Game을 종료하시겠습니까? (yes / no)");

        return inputView.getUserInput();
    }
}
