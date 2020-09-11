package com.clara;

public class WeatherSurvey implements ResponseListener {

    public void start() {
        String question = "What is the weather like today?";
        DataCollector dataCollector = new PoliteDataCollector(this);
        dataCollector.collectData(question);
    }

    @Override
    public void responseCollected(String response) {
        // Process the response received
        System.out.println("The current weather is " + response);
    }

    @Override
    public void noResponseCollected() {
        System.out.println("There was no response, unknown weather.");
    }
}
