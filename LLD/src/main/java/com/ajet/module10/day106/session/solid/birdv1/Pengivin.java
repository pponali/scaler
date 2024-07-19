package com.ajet.module10.day106.session.solid.birdv1;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   19/07/24 7:25 am
 */
public class Pengivin extends Bird{
    /**
     *
     */
    @Override
    public void fly() throws Exception {
        //pegwing can not fly
        //leave this method empty
        // OR
        // throw the exception
        throw new Exception("Pengivin can not fly");
    }

    /**
     *
     */
    @Override
    public void makeSound() {

    }
}
