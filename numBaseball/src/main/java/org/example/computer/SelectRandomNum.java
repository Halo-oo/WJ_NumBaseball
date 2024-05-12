package org.example.computer;

import org.example.global.util.DataValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectRandomNum {
    final int MAX_RANDOM_NUM_RANGE = 9;
    final int MAX_SELECTION_NUM_LIST_SIZE = 3;

    final DataValidation dataValidation = new DataValidation();

    /**
     * 숫자 랜덤 선택
     * ! 단, 1~9까지의 숫자 범위 제한
     */
    public int getRandomNum() {
        Random random = new Random(System.nanoTime());
        return (int)random.nextInt(MAX_RANDOM_NUM_RANGE) + 1;   // 1-9까지의 숫자 범위 제한
    }

    /**
     * 랜덤 숫자 목록(List) 저장
     */
    public List<Integer> getRandomNumList() {
        List<Integer> numList = new ArrayList<>();

        while (numList.size() < MAX_SELECTION_NUM_LIST_SIZE) {
            int randomNum = getRandomNum();

            if (!dataValidation.checkDuplicateNum(numList, randomNum)) {
                numList.add(randomNum);
            }
        }
        return numList;
    }
}
