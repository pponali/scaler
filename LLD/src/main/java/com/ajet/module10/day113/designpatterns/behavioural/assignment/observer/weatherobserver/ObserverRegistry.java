package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.weatherobserver;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(double value);
}
