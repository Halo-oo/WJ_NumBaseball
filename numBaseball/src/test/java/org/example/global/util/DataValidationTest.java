package org.example.global.util;

import org.example.baseBall.Ball;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("선택한 숫자에 대한 중복/범위 validation TEST")
class DataValidationTest {
    private DataValidation dataValidation;
    private int number;

    @BeforeEach
    public void setUp() {
        dataValidation = new DataValidation();
        number = 0;
    }

    @DisplayName("List 내 중복 숫자 존재")
    @Test
    void checkDuplicateNum_caseTrue() {
        // given
        List<Ball> numList = new ArrayList<>();

        // when
        numList.add(new Ball(1, 1));
        numList.add(new Ball(2, 2));
        numList.add(new Ball(3, 3));
        number = 2;

        // then
        assertTrue(dataValidation.checkDuplicateNum(numList, number), "List 내 중복 숫자 존재");
    }

    @DisplayName("List 내 중복 숫자 미존재")
    @Test
    void checkDuplicateNum_caseFalse() {
        // given
        List<Ball> numList = new ArrayList<>();

        // when
        numList.add(new Ball(1, 1));
        numList.add(new Ball(2, 2));
        numList.add(new Ball(3, 3));
        number = 4;

        // then
        assertFalse(dataValidation.checkDuplicateNum(numList, number), "List 내 중복 숫자 미존재");
    }

    @DisplayName("숫자가 MIN(1) ~ MAX(9) 범위 내 존재")
    @Test
    void checkNumRange_caseTrue() {
        // when
        number = 6;

        // then
        assertTrue(dataValidation.checkNumRange(number), "숫자가 MIN~MAX 범위 내 존재");
    }

    @DisplayName("숫자가 MIN(1) ~ MAX(9) 범위를 벗어남")
    @Test
    void checkNumRange_caseFalse() {
        // when
        number = 0;

        // then
        assertFalse(dataValidation.checkNumRange(number), "숫자가 MIN~MAX 범위를 벗어남");
    }
}