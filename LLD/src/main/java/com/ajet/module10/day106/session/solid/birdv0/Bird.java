package com.ajet.module10.day106.session.solid.birdv0;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   19/07/24 7:06 am
 */
public class Bird {

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


    public void fly() {
        if(type.equals("pigeon")){
            System.out.println("pigeon is flying");
        }
        else if(type.equals("crow")){
            System.out.println("crow is flying");
        }
        else if(type.equals("sparrow")){
            System.out.println("sparrow is flying");
        }
    }

    public void makeSound() {
        System.out.println("Bird is making sound");
    }
}
