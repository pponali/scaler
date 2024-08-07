package com.ajet.module10.day112.designpatterns.decorator.session;

public class Client {
    public static void main(String[] args) {
        Beverages houseBlend = new HouseBlend();
        System.out.println(houseBlend.description() + " : " + houseBlend.cost());

        Beverages captuno = new Captuno();
        System.out.println(captuno.description() + " : " + captuno.cost());

        Addons milk = new Milk(houseBlend);
        System.out.println(milk.description() + " : " + milk.cost());

        Addons sugar = new Sugar(captuno);
        System.out.println(sugar.description() + " : " + sugar.cost());
    }
}
