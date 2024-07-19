package com.ajet.module10.day106.session.solid.birdv0;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   19/07/24 7:09 am
 */
public class Client {
    public static void main(String[] args) {
        Bird sparrow = new Bird();
        sparrow.name = "Sparrow";
        sparrow.color = "Brown";
        sparrow.type = "Flying";
        sparrow.food = "Insects";
        sparrow.wings = 2;
        sparrow.eat();
        sparrow.fly();
    }
}
