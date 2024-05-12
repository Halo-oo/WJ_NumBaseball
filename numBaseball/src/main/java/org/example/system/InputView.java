package org.example.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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

        return Arrays.stream(playerNumInput.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
