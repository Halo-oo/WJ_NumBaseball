package org.example.system;

public class ResultView {

    /**
     * (기본) message 출력
     */
    public void printMessageToSystemOut(String message) {
        System.out.println(message);
    }

    /**
     * 사용자의 입력을 안내하는 message 출력
     */
    public void printMessageForInput(String message) {
        System.out.println(message + " > ");
    }
}
