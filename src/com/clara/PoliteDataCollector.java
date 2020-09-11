package com.clara;

import java.util.Scanner;

public class PoliteDataCollector extends DataCollector {

    private ResponseListener listener;

    public PoliteDataCollector(ResponseListener listener) {
        this.listener = listener;
    }

    @Override
    public void collectData(String question) {
        System.out.println("Please provide an answer to the following question. Many thanks in advance!");
        System.out.println(question);
        String response = new Scanner(System.in).nextLine();
        System.out.println("Got it! I will deliver your response promptly. Have a wonderful day!");
        listener.responseCollected(response);
    }
}
