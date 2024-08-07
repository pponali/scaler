package com.ajet.module10.day113.designpatterns.behavioural.assignment.pricingstrategy;

public interface PricingStrategy {
    PricingType supportsType();
    public Double calculatePrice(RideDetails rideDetails);
}
