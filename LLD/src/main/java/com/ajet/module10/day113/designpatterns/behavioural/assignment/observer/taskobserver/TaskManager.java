package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver;

import com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver.services.AppService;
import com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver.services.EmailService;
import com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.taskobserver.services.SlackService;

public class TaskManager {

    private final EmailService emailService = new EmailService();
    private final SlackService slackService = new SlackService();
    private final AppService appService = new AppService();


    public void assignTask(Long taskId, Long userId) {
        emailService.sendEmail(userId, taskId);
        slackService.sendSlack(userId, taskId);
        appService.sendPush(userId, taskId);

    }
}