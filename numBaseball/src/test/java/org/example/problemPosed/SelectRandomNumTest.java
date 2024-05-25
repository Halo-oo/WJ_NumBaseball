package org.example.problemPosed;

import org.example.baseBall.Ball;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("랜덤으로 선택한 정답 숫자 TEST")
class SelectRandomNumTest {
    private SelectRandomNum selectRandomNum;

    @BeforeEach
    public void setUp() {
        selectRandomNum = new SelectRandomNum();
    }

    @DisplayName("선택한 랜덤숫자의 값이 1~9 범위가 아님")
    @Test
    void getRandomNum() {
        int randomNum = selectRandomNum.getRandomNum();
        assertTrue(1 <= randomNum && randomNum <= 9, "1~9 사이의 랜덤값 선택 해야한다. - random 값: " + randomNum);
    }

    @DisplayName("선택한 랜덤 숫자의 개수(size)가 3이 아님")
    @Test
    public void testGetRandomNumListSize() {
        List<Ball> numList = selectRandomNum.getRandomNumList();
        assertEquals(3, numList.size(), "3개의 랜덤 숫자를 선택 해야한다.");
    }
}