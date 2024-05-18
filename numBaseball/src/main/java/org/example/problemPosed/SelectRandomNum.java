package org.example.problemPosed;

import org.example.baseBall.Ball;
import org.example.global.util.DataValidation;
import org.example.global.util.NumberRange;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectRandomNum {
    final DataValidation dataValidation = new DataValidation();

    /**
     * 숫자 랜덤 선택
     * ! 단, 1~9까지의 숫자 범위 제한
     */
    public int getRandomNum() {
        Random random = new Random(System.nanoTime());
        NumberRange MAX_RANDOM_NUM_RANGE = NumberRange.MAX_RANDOM_NUM_RANGE;
        return (int)random.nextInt(MAX_RANDOM_NUM_RANGE.getValue()) + 1;   // 1-9까지의 숫자 범위 제한
    }

    /**
     * 랜덤 숫자 목록(List) 저장
     */
    public List<Ball> getRandomNumList() {
        List<Ball> numList = new ArrayList<>();
        NumberRange MAX_SELECTION_NUM_LIST_SIZE = NumberRange.MAX_SELECTION_NUM_LIST_SIZE;

        for (int i = 0; i < MAX_SELECTION_NUM_LIST_SIZE.getValue(); i++) {
            int numPosition = i + 1;
            int randomNum = getRandomNum();

            if (!dataValidation.checkDuplicateNum(numList, randomNum)) {
                numList.add(new Ball(randomNum, numPosition));
            }
        }
        return numList;
    }
}
