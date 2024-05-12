package org.example.global.util;

import java.util.List;

public class DataValidation {

    /**
     * 두 List 내 중복 숫자값 존재 유무 확인
     */
    public boolean checkDuplicateNum(List<Integer> numList, int randomNum) {

        if (numList.contains(randomNum)) {
            return true;
        }
        return false;
    }

    /**
     * 숫자 범위 체크
     */
    public boolean checkNumRange(int num) {
        NumberRange MIN_RANDOM_NUM_RANGE = NumberRange.MIN_RANDOM_NUM_RANGE;
        NumberRange MAX_RANDOM_NUM_RANGE = NumberRange.MAX_RANDOM_NUM_RANGE;

        if (MIN_RANDOM_NUM_RANGE.getValue() <= num && num <= MAX_RANDOM_NUM_RANGE.getValue()) {
            return true;
        }
        return false;
    }
}
