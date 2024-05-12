package org.example.global.util;

import java.util.List;

public class DataValidation {

    /**
     * 두 List 내 중복 숫자값 존재 유무 확인
     * @return 존재 한다면 true ↔️ 존재 하지 않는 다면 false
     */
    public boolean checkDuplicateNum(List<Integer> numList, int randomNum) {
        if (numList.contains(randomNum)) {
            return true;
        }

        return false;
    }
}
