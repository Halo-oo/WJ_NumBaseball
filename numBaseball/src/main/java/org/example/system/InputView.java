package org.example.system;

import org.example.baseBall.Ball;
import org.example.global.util.DataValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputView {
    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final DataValidation dataValidation = new DataValidation();

    /**
     * (기본) 사용자 입력받기
     */
    public String getUserInput() throws IOException {
        return br.readLine();
    }

    /**
     * 입력 받은 3개의 숫자를 List 로 저장
     */
    public List<Ball> getUserInputNumList(String playerNumInput) {
        List<Ball> playerInputNumList = new ArrayList<>();
        int index = 0;

        for (String playerNumStr: playerNumInput.split(" ")) {
            int playerNum = Integer.parseInt(playerNumStr);

            if (dataValidation.checkNumRange(playerNum)) {
                Ball ball = new Ball(playerNum, ++index);
                playerInputNumList.add(ball);
            }
        }
        return playerInputNumList;
    }
}
