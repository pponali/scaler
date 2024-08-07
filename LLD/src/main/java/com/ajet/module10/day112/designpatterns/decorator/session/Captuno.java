package com.ajet.module10.day112.designpatterns.decorator.session;

public class Captuno implements Beverages {
    @Override
    public int cost() {
        return 150;
    }

    @Override
    public String description() {
        return "Captuno";
    }
}
