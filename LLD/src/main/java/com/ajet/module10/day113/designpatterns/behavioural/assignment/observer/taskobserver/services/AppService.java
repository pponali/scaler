package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver.services;

import com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver.Observer;
import com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver.utils.NotificationUtils;


public class AppService implements Observer {
    @Override
    public void notifyObserver(Long taskId, Long userId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendPush(subject, String.format(message, taskId, userId));
    }
}
