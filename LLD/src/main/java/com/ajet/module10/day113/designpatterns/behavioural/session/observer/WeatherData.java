package com.ajet.module10.day113.designpatterns.behavioural.session.observer;

import java.util.List;

public class WeatherData implements Subject {
    List<Observer> observers;
    private float temperature;
    private int humidity;
    private float pressure;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(int temperature, int humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

}
