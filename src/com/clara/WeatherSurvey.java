package com.clara;

public class WeatherSurvey implements ResponseListener {

    public void start() {
        String question = "What is the weather like today?";
        DataCollector dataCollector = new PoliteDataCollector(this);
        dataCollector.collectData(question);
    }

    @Override
    public void responseCollected(String response) {
        System.out.println("The current weather is " + response);
    }
}
