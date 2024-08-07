package com.ajet.module10.day112.designpatterns.decorator.session;

public class Milk implements Addons {
    private Beverages beverages;

    public Milk(Beverages beverages) {
        this.beverages = beverages;
    }

    @Override
    public int cost() {
        return beverages.cost() + 10;
    }

    @Override
    public String description() {
        return beverages.description() + " with Milk";
    }
}
