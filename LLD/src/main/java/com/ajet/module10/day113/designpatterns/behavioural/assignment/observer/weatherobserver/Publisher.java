package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.weatherobserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher implements ObserverRegistry {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(double value) {
        for (Observer observer : observers) {
            observer.trigger(value);
        }
    }
}