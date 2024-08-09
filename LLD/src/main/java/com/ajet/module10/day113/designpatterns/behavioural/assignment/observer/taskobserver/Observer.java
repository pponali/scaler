package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver;


public interface Observer {
    void notifyObserver(Long taskId, Long userId);
}