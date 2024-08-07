package com.ajet.module10.day113.designpatterns.behavioural.session.observer;

public interface Observer {

    void update(int temperature, int humidity, int pressure);

    void update(float temperature, int humidity, float pressure);

}
