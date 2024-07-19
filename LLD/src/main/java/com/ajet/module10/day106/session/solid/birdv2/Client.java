package com.ajet.module10.day106.session.solid.birdv2;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   19/07/24 7:09 am
 */
public class Client {
    public static void main(String[] args) {
        FlyingBird pigeon = new Pigeon();
        FlyingBird crow = new Crow();
        pigeon.type = "Pigeon";
        pigeon.fly();
        //child of any class easily substitutable in parent class
        NonFlyingBird penguin = new Penguin();
        NonFlyingBird ostrich = new Ostrich();

    }

    public void somefunction(Bird bird) {

        //new Pigeon(); work
        //new crow(); work
        //new Pegion(); will not work
        //bird.fly();
    }
}
