package com.ajet.module10.day106.session.solid.birdv5;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   19/07/24 7:09 am
 */
public class Client {
    public static void main(String[] args) {
        Bird sparrow = new Pigeon();
        sparrow.type = "Pigeon";
        Flyable crow = new Crow();
        crow.fly();

    }

    public void somefunction(Bird bird) {

        //new Pigeon(); work
        //new crow(); work
        //new Pegion(); will not work
        //bird.fly();
    }
}
