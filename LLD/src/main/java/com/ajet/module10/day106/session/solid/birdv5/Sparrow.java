package com.ajet.module10.day106.session.solid.birdv5;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   19/07/24 7:19 am
 */
public class Sparrow extends Bird implements Flyable{
    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    /**
     *
     */
    @Override
    public void makeSound() {
        System.out.println("Sparrow is making sound");
    }
}
