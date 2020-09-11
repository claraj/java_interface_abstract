package com.clara;

/**
 *
 * Demo of Java interfaces and abstract classes
 *
 * * Abstract classes *
 * You want to use a class? And you expect to have some specific behavior?
 *
 * DataCollector is an abstract class, defining methods any DataCollector subclass
 * must provide. To be a DataCollector subclass, you must provide methods listed in DataCollector.
 * This means that anything that uses a DataCollector can be guaranteed that it will be able
 * to call the methods. In this example, there's only one method but an abstract class can
 * have multiple methods.
 *
 * Abstract classes - if you want to ask something to do some task for you.
 *
 * * Interfaces *
 *
 * Do you need to send a message to another class? How can you guarantee that other class will
 * be able to receive that message?
 *
 * Response Listener is an interface. It defines a set of method(s) that another class can implement.
 * When a class implements an interface, it is required to provide the methods defined in the interface
 * So, another object can guarantee that it can send messages to an object of the class that
 * implements the interface.
 *
 * Interfaces - you need to send a message/some data somewhere.
 *
 * */

public class Main {

    public static void main(String[] args){

        WeatherSurvey weatherSurvey = new WeatherSurvey();
        weatherSurvey.start();

        TechnologyQuiz quiz = new TechnologyQuiz();
        quiz.startQuiz();
    }
}

