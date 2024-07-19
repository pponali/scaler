package com.ajet.module10.day106.session.solid.birdv2;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   19/07/24 7:21 am
 */
public class Crow extends FlyingBird {
    /**
     *
     */

    public void fly() {
        System.out.println("Crow is flying");
    }

    /**
     *
     */
    @Override
    public void makeSound() {
        System.out.println("Crow is making sound");
    }
}
