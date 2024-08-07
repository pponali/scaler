package com.ajet.module10.day113.designpatterns.behavioural.session.observer;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();
} 
