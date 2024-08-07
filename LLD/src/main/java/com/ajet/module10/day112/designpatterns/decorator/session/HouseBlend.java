package com.ajet.module10.day112.designpatterns.decorator.session;

public class HouseBlend implements Beverages {
    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String description() {
        return "House Blend";
    }
}
