package com.ajet.module10.day106.session.solid.birdv3;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   19/07/24 7:18 am
 */
public class Pigeon  extends Bird implements Flyable{
    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }

    /**
     *
     */
    @Override
    public void makeSound() {
        System.out.println("Pigeon is making sound");
    }
}
