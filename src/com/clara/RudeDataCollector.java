package com.clara;

import java.util.Scanner;

public class RudeDataCollector extends DataCollector {

    private ResponseListener listener;

    public RudeDataCollector(ResponseListener listener) {
        this.listener = listener;
    }

    @Override
    public void collectData(String question) {
        System.out.println("Answer the question.");
        System.out.println(question);
        String response = new Scanner(System.in).nextLine();
        System.out.println("Time for something else to deal with whatever you typed.");
        listener.responseCollected(response);
    }
}
