package org.example.baseBall;

public class Ball {
    /* 숫자 (1-9까지의 범위) */
    int number;

    /* 위치 */
    int position;

    public Ball(int number, int position) {
        this.number = number;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return number + "";
    }
}
