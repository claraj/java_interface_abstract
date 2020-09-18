package com.clara;

import java.util.Scanner;

public class RudeDataCollector extends DataCollector {

    private ResponseListener listener;

    public RudeDataCollector(ResponseListener listener) {
        // Save a reference to the listener object - what wants to know what the response is?
        this.listener = listener;
    }

    @Override
    public void collectData(String question) {
        System.out.println("Answer the question.");
        System.out.println(question);
        String response = new Scanner(System.in).nextLine();
        System.out.println("Time for something else to deal with whatever you typed.");
        if (response.isEmpty()) {
            listener.noResponseCollected();
        } else {
            listener.responseCollected(response);
        }
    }
}
