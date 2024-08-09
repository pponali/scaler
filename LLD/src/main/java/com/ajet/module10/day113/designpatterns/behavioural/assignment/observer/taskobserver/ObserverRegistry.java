package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Long taskId, Long userId);
}