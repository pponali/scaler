package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.weatherobserver;

public interface ObserverRegistry {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers(double value);
}
