package org.example.baseBall;

public class Score {
    int strike;
    int ball;

    public Score(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    @Override
    public String toString() {
        return "Score{" +
                "strike=" + strike +
                ", ball=" + ball +
                '}';
    }
}
