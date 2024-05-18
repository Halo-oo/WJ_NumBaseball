package org.example.problemPosed;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberComparator {

    /**
     * 정답과 플레이어의 숫자를 비교하여_Ball 개수 Count
     */
    public int compareBallCnt(List<Integer> answerNumList, List<Integer> playerNumList) {
        return answerNumList.stream()
                .filter(answer -> playerNumList.stream()
                        .anyMatch(Predicate.isEqual(answer)))
                .collect(Collectors.toList()).size();
    }

    /**
     * 정답과 플레이어의 숫자를 비교하여_Strike 개수 Count
     */
    public int compareStrikeCnt(List<Integer> answerNumList, List<Integer> playerNumList) {
        int strike = 0;

        for (int i = 0; i < playerNumList.size(); i++) {
            if (answerNumList.get(i) == playerNumList.get(i)) strike++;
        }
        return strike;
    }

    /**
     * 비교한 결과값 문자열 반환
     *  - 위치가 같은 경우 '스트라이크'
     *  - 위치가 다른 경우 '볼'
     *  - 아무것도 맞지 않는 경우 '낫싱'
     */
    public String compareResultMessage(int strikeCnt, int ballCnt) {
        if (ballCnt == 0) return "낫싱";

        return "[" + strikeCnt + " 스트라이크] / [" + Math.abs(strikeCnt - ballCnt) + " 볼]";
    }
}
