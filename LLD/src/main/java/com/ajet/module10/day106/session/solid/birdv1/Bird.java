package com.ajet.module10.day106.session.solid.birdv1;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   19/07/24 7:06 am
 */
public abstract class Bird {

    String name;
    String color;
    String type;
    String food;
    Integer wings;

    public void eat() {
        System.out.println("Bird is eating");
    }

    //violating single responsibility
    //SRP - Only one reason to change the code.
    //need to change the same function for both pigeon and sparrow


    public abstract void fly() throws Exception;

    public abstract void makeSound();
}
