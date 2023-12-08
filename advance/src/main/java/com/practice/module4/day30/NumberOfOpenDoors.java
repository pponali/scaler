package com.practice.module4.day30;

/**
 * @author prakashponali
 * @Date 29/10/23
 */
public class NumberOfOpenDoors {

    public static void main(String[] args) {
        System.out.println(noOfOpenDoors(100));
    }

    private static int noOfOpenDoors(int N) {
        return (int) Math.sqrt(N);
    }
}
