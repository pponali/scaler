package com.ajet.module10.day113.designpatterns.behavioural.session;

public class PathCalculatorStrategyFactory {
    public static PathCalculatorStrategy getPathCalculatorStrategy(TravelMode travelMode) {
        switch (travelMode) {
            case CAR:
                return new CarPathCalculator();
            case BIKE:
                return new BikePathCalculator();
            case WALK:
                return new WalkPathCalculator();
            default:
                throw new IllegalArgumentException("Invalid travel mode");
        }
    }
}
