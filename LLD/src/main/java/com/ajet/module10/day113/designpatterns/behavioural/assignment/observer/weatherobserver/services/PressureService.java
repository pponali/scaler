package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.weatherobserver.services;

import com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.weatherobserver.Observer;
import com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.weatherobserver.utils.NotificationUtils;

public class PressureService implements Observer {
    @Override
    public void trigger(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}