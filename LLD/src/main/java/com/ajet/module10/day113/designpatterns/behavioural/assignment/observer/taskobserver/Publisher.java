package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver;

import java.util.ArrayList;
import java.util.List;


public abstract class Publisher {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(Long taskId, Long userId) {
        observers.forEach(observer -> observer.notifyObserver(taskId, userId));
    }
}
