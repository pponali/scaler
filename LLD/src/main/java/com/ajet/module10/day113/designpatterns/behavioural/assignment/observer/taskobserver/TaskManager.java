package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver;


public class TaskManager extends Publisher {

    public void assignTask(Long taskId, Long userId) {
        notifyObservers(taskId, userId);
    }
}