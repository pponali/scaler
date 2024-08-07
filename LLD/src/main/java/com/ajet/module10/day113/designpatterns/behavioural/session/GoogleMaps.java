package com.ajet.module10.day113.designpatterns.behavioural.session;

public class GoogleMaps {

    public void getDirections(String source, String destination, TravelMode travelMode) {
        PathCalculatorStrategy pathCalculator = PathCalculatorStrategyFactory.getPathCalculatorStrategy(travelMode);
        pathCalculator.calculatePath(source, destination);
    }
}
