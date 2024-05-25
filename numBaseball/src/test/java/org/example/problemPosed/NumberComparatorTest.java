package org.example.problemPosed;

import org.example.baseBall.Ball;
import org.example.baseBall.Score;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("정답 숫자와 플레이어의 숫자 비교 TEST")
class NumberComparatorTest {

    private NumberComparator numberComparator;

    @BeforeEach
    public void setUp() {
        numberComparator = new NumberComparator();
    }

    @DisplayName("Strike 또는 Ball의 개수 불일치")
    @Test
    void getBallAndStrikeCnt() {
        // given
        List<Ball> answerNumList = new ArrayList<>();
        List<Ball> playerNumList = new ArrayList<>();

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
        assertEquals(1, score.getStrike(), "스트라이크 개수 불일치");
        assertEquals(2, score.getBall(), "볼 개수 불일치");
    }

    @Test
    void compareStrike() {
    }

    @Test
    void compareResultMessage() {
    }
}