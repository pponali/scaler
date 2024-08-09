package com.ajet.module10.day113.designpatterns.behavioural.assignment.strategy.pricingstrategy;

public interface PricingStrategy {
    PricingType supportsType();
    public Double calculatePrice(RideDetails rideDetails);
}
