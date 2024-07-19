package com.ajet.module10.day106.session.solid.birdv3;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   19/07/24 7:09 am
 */
public class Client {
    public static void main(String[] args) {
        Flyable pigeon = new Pigeon();
        pigeon.fly();

        Swimmable penguin = new Penguin();
        penguin.swim();

    }

    public void somefunction(Bird bird) {

        //new Pigeon(); work
        //new crow(); work
        //new Pegion(); will not work
        //bird.fly();
    }
}
