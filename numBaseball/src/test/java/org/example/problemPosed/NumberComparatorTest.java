package org.example.problemPosed;

import org.example.baseBall.Ball;
import org.example.baseBall.Score;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("정답 숫자와 플레이어의 숫자 비교 TEST")
class NumberComparatorTest {

    private NumberComparator numberComparator;

    private List<Ball> answerNumList;
    private List<Ball> playerNumList;

    @BeforeEach
    public void setUp() {
        numberComparator = new NumberComparator();

        // given
        answerNumList = new ArrayList<>();
        playerNumList = new ArrayList<>();
    }

    @DisplayName("Strike/Ball 개수 불일치")
    @Test
    void testGetBallAndStrikeCnt() {
        // when
        // Strike : 1 - Ball : 2 세팅
        answerNumList.add(new Ball(1, 1));
        answerNumList.add(new Ball(2, 2));
        answerNumList.add(new Ball(3, 3));

        playerNumList.add(new Ball(1, 1));
        playerNumList.add(new Ball(3, 2));
        playerNumList.add(new Ball(2, 3));
        Score score = numberComparator.getBallAndStrikeCnt(answerNumList, playerNumList);

        // then
        assertEquals(1, score.getStrike(), "Strike 개수 불일치 - Strike는 숫자와 위치 모두가 동일 해야함");
        assertEquals(2, score.getBall(), "Ball 개수 불일치");
    }

    @DisplayName("정답과 아무것도 맞는 숫자가 없는 '낫싱' 경우 TEST")
    @Test
    void testGetBallAndStrikeCntCaseNothing() {
        // when
        // Strike : 0 - Ball : 0 세팅
        answerNumList.add(new Ball(1, 1));
        answerNumList.add(new Ball(2, 2));
        answerNumList.add(new Ball(3, 3));

        playerNumList.add(new Ball(4, 1));
        playerNumList.add(new Ball(5, 2));
        playerNumList.add(new Ball(6, 3));
        Score score = numberComparator.getBallAndStrikeCnt(answerNumList, playerNumList);

        // then
        assertEquals(0, score.getStrike(), "[case. 낫싱] Strike 개수 불일치 - Strike는 숫자와 위치 모두가 동일 해야함");
        assertEquals(0, score.getBall(), "[case. 낫싱] Ball 개수 불일치");
    }
}