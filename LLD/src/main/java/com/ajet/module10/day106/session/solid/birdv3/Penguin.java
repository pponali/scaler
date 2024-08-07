package com.ajet.module10.day106.session.solid.birdv3;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   19/07/24 7:25 am
 */
public class Penguin extends Bird implements Swimmable{

    /**
     *
     */
    @Override
    public void makeSound() {
        System.out.println("Penguin is making sound");
    }

    /**
     *
     */
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
