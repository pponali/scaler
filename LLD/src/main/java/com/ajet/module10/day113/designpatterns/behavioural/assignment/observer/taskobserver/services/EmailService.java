package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver.services;

import com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver.utils.NotificationUtils;

public class EmailService {
    public void sendEmail(Long id, Long taskId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendEmail(subject, String.format(message, taskId, id));
    }
}
