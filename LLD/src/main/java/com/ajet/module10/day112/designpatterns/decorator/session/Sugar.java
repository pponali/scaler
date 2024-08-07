package com.ajet.module10.day112.designpatterns.decorator.session;

public class Sugar implements Addons {
    Beverages beverages;

    public Sugar(Beverages beverages) {
        this.beverages = beverages;
    }

    @Override
    public int cost() {
        return beverages.cost() + 10;
    }

    @Override
    public String description() {
        return beverages.description() + " with Sugar";
    }
}
