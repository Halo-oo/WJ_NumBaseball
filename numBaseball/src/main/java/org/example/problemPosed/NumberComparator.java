package org.example.problemPosed;

import org.example.baseBall.Ball;
import org.example.baseBall.Score;
import org.example.global.util.DataValidation;
import org.example.global.util.NumberRange;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberComparator {

    final NumberRange MAX_SELECTION_NUM_LIST_SIZE = NumberRange.MAX_SELECTION_NUM_LIST_SIZE;
    final DataValidation dataValidation = new DataValidation();


    /**
     * 정답과 플레이어의 숫자를 비교하여 Ball, Strike 개수 Count
     */
    public Score getBallAndStrikeCnt(List<Ball> answerNumList, List<Ball> playerNumList) {
        int ballCnt = 0;
        int strikeCnt = 0;

        for (int i = 0; i < MAX_SELECTION_NUM_LIST_SIZE.getValue(); i++) {
            Ball playerBall = playerNumList.get(i);
            Ball answerBall = answerNumList.get(i);

            // Ball 개수 Count
            int playerNum = playerBall.getNumber();
            if (dataValidation.checkDuplicateNum(answerNumList, playerNum)) {
                ballCnt += 1;

                // Strike 개수 Count
                strikeCnt += compareStrike(answerBall, playerBall);
            }
        }

        return new Score(strikeCnt, Math.abs(strikeCnt - ballCnt));
    }

    /**
     * 정답과 플레이어의 숫자 맟 위치를 비교하여_Strike 판단
     */
    public int compareStrike(Ball answerBall, Ball playerBall) {
        int answerNumber = answerBall.getNumber();
        int answerNumPosition = answerBall.getPosition();
        int playerNumber = playerBall.getNumber();
        int playerNumPosition = playerBall.getPosition();

        if (answerNumber == playerNumber && answerNumPosition == playerNumPosition) {
            return 1;
        }
        return 0;
    }

    /**
     * 비교한 결과값 문자열 반환
     *  - 위치가 같은 경우 '스트라이크'
     *  - 위치가 다른 경우 '볼'
     *  - 아무것도 맞지 않는 경우 '낫싱'
     */
    public String compareResultMessage(Score score) {
        int totalScore = score.getBall() + score.getStrike();
        if (totalScore == 0) return "낫싱";

        return "[" + score.getStrike() + " 스트라이크] / [" + score.getBall() + " 볼]";
    }
}
