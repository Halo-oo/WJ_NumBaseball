package org.example.global.util;

public enum NumberRange {

    /* 최대로 선택할 수 있는 숫자 개수 */
    MAX_SELECTION_NUM_LIST_SIZE(3),

    /* 선택 가능한 숫자의 최소값 */
    MIN_RANDOM_NUM_RANGE(1),
    /* 선택 가능한 숫자의 최대값 */
    MAX_RANDOM_NUM_RANGE(9);

    private int value;

    NumberRange(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
