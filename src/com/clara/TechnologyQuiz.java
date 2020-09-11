package com.clara;

public class TechnologyQuiz implements ResponseListener {

    public void startQuiz() {
        System.out.println("Welcome to the quiz! Here's the question....");
        DataCollector collector = new RudeDataCollector(this);
        collector.collectData("What number system do computers use?");
    }

    @Override
    public void responseCollected(String response) {
        if (response.equalsIgnoreCase("Binary")) {
            System.out.println("Correct! Well done.");
        } else {
            System.out.println("Sorry, the answer is Binary.");
        }
    }

    @Override
    public void noResponseCollected(){
        System.out.println("There was no response.");
    }
}


