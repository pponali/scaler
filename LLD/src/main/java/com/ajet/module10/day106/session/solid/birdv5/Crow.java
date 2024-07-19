package com.ajet.module10.day106.session.solid.birdv5;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   19/07/24 7:21 am
 */
public class Crow extends Bird implements Flyable{

    FlyingMethod flyingMethod = new FlyHigh();
    /**
     *
     */
    @Override
    public void fly() {
        flyingMethod.makeFly();
    }

    /**
     *
     */
    @Override
    public void makeSound() {
        System.out.println("Crow is making sound");
    }
}
