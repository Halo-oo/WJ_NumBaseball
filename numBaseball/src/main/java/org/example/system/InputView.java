package org.example.system;

import org.example.global.util.DataValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
     * 입력 받은 3개의 숫자 List 조회
     */
    public List<Integer> getUserInputNumList(String playerNumInput) {
        List<Integer> playerInputNumList = new ArrayList<>();

        for (String playerNumStr: playerNumInput.split(" ")) {
            int playerNum  = Integer.parseInt(playerNumStr);

            if (dataValidation.checkNumRange(playerNum)) {
                playerInputNumList.add(playerNum);
            }
        }
        return playerInputNumList;
    }
}
