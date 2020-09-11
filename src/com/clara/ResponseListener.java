package com.clara;

public interface ResponseListener {
    void responseCollected(String response);
    void noResponseCollected();
}
