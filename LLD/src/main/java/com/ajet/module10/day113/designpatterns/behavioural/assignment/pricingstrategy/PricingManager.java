package com.ajet.module10.day113.designpatterns.behavioural.assignment.pricingstrategy;

public class PricingManager {

    private PricingStrategy pricingStrategy;

    private PricingType pricingType;

    public PricingManager(PricingType pricingType, PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
        this.pricingType = pricingType;
    }

    public PricingManager() {

    }

    public Double calculatePrice(RideDetails rideDetails) {
        return pricingStrategy.calculatePrice(rideDetails);
    }

}
