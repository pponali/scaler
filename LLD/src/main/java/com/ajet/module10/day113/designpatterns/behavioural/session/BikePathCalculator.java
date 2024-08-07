package com.ajet.module10.day113.designpatterns.behavioural.session;

public class BikePathCalculator implements PathCalculatorStrategy {
    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Calculating path for bike from " + source + " to " + destination);
    }
}
